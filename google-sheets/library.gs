///////////////////////////
//
//  Created on Sep 29, 2015
//
//  @author: sorin
//
///////////////////////////

// Cell object

function Cell(row, column, cell_type_name, data, data_type, fn){
  this.row = row;
  this.column = column;
  this.cell_type_name = cell_type_name;
  this.data = data;
  this.data_type = data_type;
  this.fn = fn;    
  this.cell_type = 9; //unknown type
  
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
              SheetMarkCellAsHeader(this.crtSheet,read_buffer[cell]);
            }
            return (r,c);
          } 
        }
      }
    }
    return (-1,-1);
  };
  
  this.are_same = function(array1, array2){
    if (array1.length !== array2.length) 
      return false;
    for (var i = 0; i < array1.length; i++){
        if (array1[i] !== array2[i]){
            return false;
        }
    }
    return true; 
}
  
  this.FindBlockAndDepth = function(headers){
    hr,hc = self.__FindHeaders(headers);
    //console.log( "row", hr, "col",hc);
    headers_len = len(headers);
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
    return hr,hc,max_depth
  };
  
  this.getColDepth = function(row, col){
    var i = 0;
    while ((i < self.noOfRows - row) && (this.objCells[row+i][col].isEmpty() === false))
    i++ ;
    return i;
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
            print += "? ";
        }
      }
      print += "\n"
    }
    Logger.log(print);
  }
  
}    

function SheetMarkCellAsHeader(sheet,cell_obj){
  var cell = sheet.getRange(cell_obj.row+1, cell_obj.column+1);
  cell.setBackground("cyan");
};
/*      
var test = new Cell(1,1,"boo",null,"int","test");
//console.log(test.isEmpty());
//console.log("ceating empty");
var empty = new Empty(10,20);



/*console.log(test.data);
console.log(test.isData());
console.log(empty.isEmpty());*/
//console.log(empty.row);
/*
Logger.log('test.data:' + test.data);
Logger.log('empty.isEmpty():' + empty.isEmpty());
*/