///////////////////////////
//
//  Created on Sep 29, 2015
//
//  @author: sorin
//
///////////////////////////

// Cell object

function Cell(row, column, cell_type, data, data_type, fn){
    this.row = row;
    this.column = column;
    this.cell_type = cell_type;
    this.data = data;
    this.data_type = data_type;
    this.fn = fn;    

    //console.log("Cell constructor",row, column, cell_type, data, data_type, fn);

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

//Empty.prototype = new Cell();
//Empty.prototype.constructor = Empty;

// extend from parent class prototype
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

  //console.log("Spreadsheet constructor");
  this.InitFromSheets = function(){
    var ss = SpreadsheetApp.getActiveSpreadsheet();
    var sheet = ss.getSheets()[0];

    this.noOfRows = sheet.getLastRow();
    this.noOfCols = sheet.getLastColumn();
    var range = sheet.getRange(1,1,this.noOfRows, this.noOfCols);
    var values = range.getValues();

    var i=0;
    var j=0;
      
    for (var row in values) {
      this.objCells.push([]); //create a two dimensional array for objCells
      j=0; 
      for (var col in values[row]) {
        if (col === "")
          this.objCells[i].push(Empty(i,j)); 
        else
          this.objCells[i].push(Data(i,j,col));
        j=j+1;
        
        //Logger.log(values[row][col]);
      }
      i=i+1;
    }
      
  };

/*  this.InitFromFile = function(csv_file_name){
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
  };*/
  
  this.__FindHeaders = function(headers){
    var headers_len = len(headers);
    var r=0;
    var c=0;
    for (var row in this.objCells)
    {
      c = 0;
      for( var obj in row)
      {
        if ((obj.cell_type === "data") && (c < this.noOfCols - headers_len))
        {
          var read_buffer = this.objCells[r].slice(c,c+headers_len);//[r][c:c+headers_len];
          for (var i=0; i< headers_len; i++)//cell in read_buffer)
          {
            if (is_same(read_buffer, headers))
            {
              for(cell=0; cell< read_buffer; cell++)
                cell.cell_type = "header";
              return (r,c);
            }
          }
        }
        c += 1;
      }
      r += 1;
    }
    return (-1,-1);
  };
  
  this.is_same = (array1.length == array2.length) && array1.every(function(element, index) {
    return element === array2[index]; 
  });
  
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
  
}    


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