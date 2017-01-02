var s = new Spreadsheet;  //global variable storing an abstract representation of the spreadsheet

//called every time the sheet is oppened or refreshed
function onOpen(e) {
  Logger.log('onOpen');
  var ui = SpreadsheetApp.getUi();
  ui.createMenu('Worksheet validation')
  .addItem('Validate current worksheet', 'menuValidateWorksheet')
  //.addItem('Clear worksheet', 'menuClearFormatSheet')
  .addItem('Restore worksheets', 'restoreWorksheets')
  .addItem('Code generation editor', 'menuCGEditor')
  .addToUi();
}

//called each time a cell is edited => automatic call of validation menu function
function onEdit(e){
  menuValidateWorksheet();  
}

function parse(){
  s.InitFromSheet();
  
  var ra= new ParseQuestionnaire(s);
  headers = ra.getColumnHeaders();
  var res = s.FindBlockAndDepth(headers);           //finds the biggest block of data identified by the headers; returns a size object
  var start_row = res.r;    //the top row of the block (in internal coordinates staring from 0)
  var start_col = res.c;    //the leftmost column of the block (in inetrnal coordinates starting from 0)
  var depth = res.depth;    //the number of rows contained in the block
  var width = res.width;    //the number of columns containd in the block (the same as the headers array length)
   
  x=ra.parseBlock(start_row,start_col, depth);
  s.Print();  //debug: print an overview of the internal representation of the spreadsheet
  Logger.log("x: " + JSON.stringify(x));
  return [x,s]
}

//called on selecting 'Validate worksheet' menu
function menuValidateWorksheet() {
  //Logger.log("menu: menuValidateWorkseet");  //debugging info available in View->Logs (shortcut Ctrl+Enter)
  
  s = parse()[1]
  
  SheetMarkHeader(s.crtSheet,s.getHeaderPos());  //Sets to cyan the header's cells
  SheetMarkMaxBlock(s.crtSheet,s.getMaxBlockPosAndSize());  //Sets to yellow the indetified block's cells 
  SheetMarkErrorCells(s.crtSheet,s.getMaxBlockPosAndSize()); //Sets to red the cells failing parsing
}

//called on selecting 'Clear worksheet' menu: cleans up the sheet form any formatting
function menuClearFormatSheet(){
  var ss = SpreadsheetApp.getActiveSpreadsheet();
  var sheet = ss.getSheets()[0];
  sheet.clearFormats();

};

//Sets to cyan the header's cells; performs convertion from internal to spreadsheet numbering scheme
function SheetMarkHeader(sheet,size){
  if(size.isValid()){
    var cell = sheet.getRange(toSheet(size.row), toSheet(size.col),1,size.width);
    cell.setBackground("cyan");
  }
};

//Sets to yellow the indetified block's cells; performs convertion from internal to spreadsheet numbering scheme
function SheetMarkMaxBlock(sheet,size){
  if(size.isValid()){
    var r = toSheet(size.row);
    var c = toSheet(size.col);
    var depth = size.depth;
    var width = size.width;
    if(r > 0 && r < sheet.getLastRow() && c > 0 && c < sheet.getLastColumn() && 
      depth > 0 && r + depth -1 <= sheet.getLastRow() && width > 0 && c + width -1<= sheet.getLastColumn())
      {
        var cell = sheet.getRange(r, c, depth, width);
        cell.clear({commentsOnly: true});
        cell.setBackground("yellow");
      }
  }
};

//Sets to red the cells failing parsing; performs convertion from internal to spreadsheet numbering scheme
function SheetMarkErrorCells(sheet,size){
  var r = toSheet(size.row);
  var c = toSheet(size.col);
  var depth = size.depth;
  var width = size.width;
  var cell = null;
  var err = null;
  if(r > 0 && r < sheet.getLastRow() && c > 0 && c < sheet.getLastColumn() && 
    depth > 0 && r + depth -1 <= sheet.getLastRow() && width > 0 && c + width -1<= sheet.getLastColumn())
    {
      var parsingErrors = 0;
      for(var row = r; row < r + depth; row ++)
      {
        for(var col = c; col < c + width; col ++)
        {
          err = s.getCellErr(toInternal(row),toInternal(col));
          //Logger.log("debug: r " + toInternal(row) + " , c " + toInternal(col) + " err: " + err.hasErr);
          if(err.hasErr === true)
          {
            cell = sheet.getRange(row, col);
            cell.setNote(err.text);
            cell.setBackground("red");
            parsingErrors ++;
          }
        }
      }
      if(parsingErrors > 0)
      {
        var text = parsingErrors + " parsing error";
        if(parsingErrors > 1)
          text += "s";
        text += "!";
        SpreadsheetApp.getActiveSpreadsheet().toast('Please see the notes of the red-marked cells', text, 5);      
      }
    }
}