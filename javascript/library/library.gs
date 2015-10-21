///////////////////////////
//
//  Created on Sep 29, 2015
//
//  @author: sorin
//
///////////////////////////

// Size object

function Size(){
  this.row = null;
  this.col = null;
  this.len = null;
  this.width = null;
  this.depth = null;
  
  this.isValid = function(){ 
    if(this.row != null || this.col != null || this.len != null || this.width != null || this.depth != null)
      return true;
    else
      return false;
  }
};

// Error object

function Error(){
  this.hasErr = false;
  this.text = null;
};

// Cell object

function Cell(row, column, cell_type_name, data, data_type, fn){
  this.row = row;
  this.column = column;
  this.cell_type_name = cell_type_name;
  this.data = data;
  this.data_type = data_type;
  this.fn = fn;    
  this.cell_type = 9; //unknown type
  this.err = new Error();
  //this.comment = null;
  //this.color = null;
  
  this.setType = function(type_name){ 
    if(type_name === "empty")
      this.cell_type = 0;
    if(type_name === "header")
      this.cell_type = 1;
    if(type_name === "data")
      this.cell_type = 2;
  };
  
  this.setType(cell_type_name);

  //console.log("Cell constructor",row, column, cell_type, data, data_type, fn);
  this.getType = function(){
      return cell_typ;
  };
  
  this.getTypeName = function(){
      return cell_type_name;
  };

  this.setError = function(text){
    this.err.text = text;
    this.err.hasErr = true;
  };

  
  this.isEmpty = function(){
    if (this.cell_type === "empty")
      return true;
    else
      return false;
  };
  
    this.isHeader = function(){
        if  (this.cell_type === "header")
            return true;
        else
            return false;
    };
    
    this.isData = function(){
        if  (this.cell_type === "data")
            return true;
        else
            return false;
    };
}

//Empty object - inherits from Cell

Empty.prototype = Object.create(Cell.prototype); // keeps the proto clean
Empty.prototype.constructor = Empty; // repair the inherited constructor
function Empty(row,column){
    Cell.call(this,row, column, "empty", null, null, null);
    //console.log("Empty constructor");
}

//Header object - inherits from Cell

// extend from parent class prototype
Header.prototype = Object.create(Cell.prototype); // keeps the proto clean
Header.prototype.constructor = Header; // repair the inherited constructor
function Header(row,column,data){
    Cell.call(this,row, column, "header", data, null, null);
    //console.log("Header constructor");
}
       
//Data object - inherits from Cell

// extend from parent class prototype
Data.prototype = Object.create(Cell.prototype); // keeps the proto clean
Data.prototype.constructor = Data; // repair the inherited constructor
function Data(row,column, data, data_type, fn){
    if(data_type === null)
        data_type = "string";
        
    Cell.call(this,row, column, "data", data, data_type, fn);
    //console.log("Data constructor");
}

// Spreadsheet object

function Spreadsheet(){
  this.csv_file_name = null;
  this.noOfRows = 0;
  this.noOfCols = 0;
  this.objCells = [];
  this.crtSheet = null;
  this.headSize = new Size();
  this.maxBlock = new Size();
  /*
  this.headRow = null;
  this.headCol = null;
  this.headLen = null;
  */
  //console.log("Spreadsheet constructor");
  this.InitFromSheet = function(){
    var ss = SpreadsheetApp.getActiveSpreadsheet();
    var sheet = ss.getSheets()[0];
    this.crtSheet = sheet;

    this.noOfRows = sheet.getLastRow();
    this.noOfCols = sheet.getLastColumn();
    var range = sheet.getRange(1,1,this.noOfRows, this.noOfCols);
    var values = range.getValues();

    var i=0;
    var j=0;
      
    for (var row in values) {
      var rowObj = [];
      //this.objCells.push([]); //create a two dimensional array for objCells
      j=0; 
      for (var col in values[row]) 
      {
        var obj;
        var val = values[i][j];
        
        if ( val === "")
        {
          obj = new Empty(i,j);
          //Logger.log('empty');
        }
        else
          obj = new Data(i,j,val);
        
        //Logger.log('data (' + i + ',' + j + '): ' + obj.cell_type_name + "("+obj.cell_type + ")");
        rowObj.push(obj); 
        

        j++;
        
      }
      this.objCells.push(rowObj); //create a two dimensional array for objCells
      i++;
    }
      
  };

  /*  
  this.InitFromFile = function(csv_file_name){
    this.csv_file_name = csv_file_name;
    var i=0;
    var j=0;
    //with open(csv_file_name) as f:
    for (var row in rows_in_worksheet)
    { 
      this.objCells.push([]); 
      j=0;         
      for (var col in number_of_cols_in_row)
      {
        if (col === "")
          this.objCells[i].push(Empty(i,j)); 
        else
          this.objCells[i].push(Data(i,j,col));
        j=j+1;
      }
      i=i+1;
    }
    this.noOfRows = i;
    this.noOfCols = j;
  };
  */
  
  this.__FindHeaders = function(headers){
    var headers_len = headers.length;

    //Logger.log( "headers: " + headers);

    for (var r = 0; r < this.noOfRows; r++)
    {
      for( var c = 0; c < this.noOfCols; c++)
      {     
        var obj =  this.objCells[r][c]
        if ((obj.cell_type_name === "data") && (c <= this.noOfCols - headers_len))
        {
          var read_buffer = this.objCells[r].slice(c,c+headers_len);
          var obj_val_buff = [];
          for (var i=0; i< headers_len; i++)
            obj_val_buff.push(read_buffer[i].data);

          //Logger.log("obj_val_buff:" + obj_val_buff + "headers: " + headers);
          
          if (this.are_same( obj_val_buff,headers))
          {
            for(var cell=0; cell< headers_len; cell++)
            {
              read_buffer[cell].setType("header");
              //SheetMarkCellAsHeader(this.crtSheet,read_buffer[cell]);
            }
            
            this.headSize.row = r;
            this.headSize.col = c;
            this.headSize.width = headers_len;
            //this.headSize.setValid();
                        
            return {r:r,c:c};
          } 
        }
      }
    }
    return {r:-1,c:-1};
  };
  
  this.are_same = function(array1, array2){
    if (array1.length !== array2.length) 
      return false;
    for (var i = 0; i < array1.length; i++){
      //Logger.log( "comp( len " + array1.length + "): '" + array1[i] + "' with '" + array2[i])+"'";
        if (array1[i] !== array2[i]){
            return false;
        }
    }
    return true; 
  };
  
  this.FindBlockAndDepth = function(headers){
    var res = this.__FindHeaders(headers);
    var hr = res.r;
    var hc = res.c;
    
    Logger.log("header: row "+ toSheet(hr)+ ", col " + toSheet(hc));
    headers_len = headers.length;
    max_depth = -1;
    if(hr != -1 && hc != -1)
    {
      hr++;//the block starts one row below header's row
      for (var i=0; i<headers_len; i++)
      {
        depth = this.getColDepth(hr,hc+i)
        if( max_depth < depth)
          max_depth = depth
      }
    }
    
    this.maxBlock.row = hr;
    this.maxBlock.col = hc;
    this.maxBlock.width = headers_len;
    this.maxBlock.depth = max_depth;
    return {r:hr,c:hc,depth:max_depth,width:headers_len};
  };
    
  this.getColDepth = function(row, col){
    var i = 0;
    while((i < this.noOfRows - row) && (this.objCells[row+i][col].isEmpty() === false))
    {
      i++ ;
      //Logger.log("getColDepth next: row:" + (row+i) + "(" + this.noOfRows + "), col: " + col + "("+this.noOfCols+")");
    }
    return i;
  };
  
  this.getHeaderPos = function(){
   /*
    return {r:this.headRow,
            c:this.headCol,
            len:this.headLen};
            */
    return this.headSize;
  };

  this.getMaxBlockPosAndSize = function(){
    return this.maxBlock;
  };
  
  this.getCellErr = function(r,c){
    return this.objCells[r][c].err;
  };
  
  this.Print = function(){
    //Logger.log("Print Sheet obj: rows:" + this.noOfRows + " cols: " + this.noOfCols);
    var print = "Print Sheet obj: rows:" + this.noOfRows + " cols: " + this.noOfCols + "\n";
    for (var row = 0; row < this.noOfRows; row++)
    {
      for (var col = 0; col < this.noOfCols; col++)
      {
        var obj = this.objCells[row][col];
        //Logger.log("obj" + obj.cell_type_name);//obj.getTypeName());
        switch(obj.cell_type) //getType())
        {
          case 0: //"empty":
            print += "O ";
            break;
          case 1: //"header":
            print += " * ";
            break;
          case 2: //"data":
            print += "X ";
            break;
          default:
            print += " ? ";
        }
      }
      print += "\n"
    }
    Logger.log(print);
  }

  this.validRow = function(row){
    var ret = true;
    
    if (!(row <= this.noOfRows))
    {
      ret = false;
    
      Logger.log("row: " + row + " outside max row (" + this.noOfRows + ")");
    }
    return ret;
  };
  
  this.validCol = function(col){
    var ret = true;
    
    if (!(col <= this.noOfCols))
    {
      ret = false;
    
      Logger.log("col: " + col + " outside max col (" + this.noOfCols + ")");
    }
    
    return ret;
  };
  
  this.validHeight = function(height){
    var ret = true;
    
    if (!(height <= this.noOfRows))
    {
      ret = false;
    
      Logger.log("height: " + height + " outside max height (" + this.noOfRows + ")");
    }
    
    return ret;
  };
  
}    


function toSheet(val){
  return val + 1;
};

function toInternal(val){
  return val - 1;
};
