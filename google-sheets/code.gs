//called every time the sheet is oppened or refreshed
function onOpen() {
  var ui = SpreadsheetApp.getUi();
  ui.createMenu('Validate Menu')
  .addItem('Validate worksheet', 'menuValidateWorkseet')
  .addItem('Clear worksheet', 'menuClearFormatSheet')
  .addToUi();
}

//called each time a cell is edited => automatic call of validation menu function
function onEdit(e){
  menuValidateWorksheet();  
  validate(e);
}

//called on selecting 'Validate worksheet' menu
function menuValidateWorksheet() {
  Logger.log("menu: menuValidateWorkseet");  //debugging info available in View->Logs (shortcut Ctrl+Enter)

///////////////////////////////////
var s = new Spreadsheet;
s.InitFromSheet();

//s.Print
var pq= new ParseRiskAssessment(s);
headers = pq.getColumnHeaders();
Logger.log("getColumnHeaders: " + headers[0] + headers[20]);
//print headers
//print ['Main Components', ' Operation Activity  Equipment or Component under consideration','Responsible person (Risk identified by)','Aspect Under Consideration','Significant Hazards','Who is at risk ?','Likelihood 1-5','Severity 1-5','Result','Action Required','Mitigation measure taken by Designer.       (1) Remove     2)Reduce       (3)Protection (4)Information','Software','Mechanical/hardware','User manual','Other','Reason why not actioned at higher mitigation / elimination level ?','Residual Likelihood','Residual Severity','Result','Notes to assist recipient in further reducing the residual hazard risk','Standards / legislation','Description by department/contacts']
//print pq.matchColumns(headers)

//var start_row,start_col, depth =s.FindBlockAndDepth(headers);
  
var res = s.FindBlockAndDepth(headers);           //finds the biggest block of data identified by the headers; returns a size object
  var start_row = res.r;            //the top row of the block (in internal coordinates staring from 0)
  var start_col = res.c;            //the leftmost column of the block (in inetrnal coordinates starting from 0)
  var depth = res.depth;    //the number of rows contained in the block
  var width = res.width;    //the number of columns containd in the block (the same as the headers array length)
//print start_row,start_col, depth

//x=pq.parseBlock(headers,14,2,7)
x=pq.parseBlock(headers,start_row,start_col, depth);
s.Print();
  

///////////////////////////////////  
/*  var s = new Spreadsheet; //creates a Spreadsheet object used by DSL
  s.InitFromSheet();       //initializes the object from the actual current worksheet
  
  s.crtSheet.clearFormats(); //cleans up the sheet form any formatting
  
  //var headers = ["headA","headB","headC","headD"];  //stets the strings array containing the DSL headers
  var headers = ["headA","headB","headC","headD"];  //stets the strings array containing the DSL headers
  var res = s.FindBlockAndDepth(headers);           //finds the biggest block of data identified by the headers; returns a size object
  var r = res.r;            //the top row of the block (in internal coordinates staring from 0)
  var c = res.c;            //the leftmost column of the block (in inetrnal coordinates starting from 0)
  var depth = res.depth;    //the number of rows contained in the block
  var width = res.width;    //the number of columns containd in the block (the same as the headers array length)
    
  Logger.log("max block:  row " + toSheet(r) + ", column " + toSheet(c) + ", depth " + depth + ", width " + width);  //debugging
  
  s.Print(); //debugging info seen in View->Logs (shortcut Ctrl+Enter): O = empty cell, * = header cell, X = data cell, ? = unknown cell (it means an error)
  
  SheetMarkHeader(s.crtSheet,s.getHeaderPos());  //Sets to cyan the header's cells

  SheetMarkMaxBlock(s.crtSheet,s.getMaxBlockPosAndSize());  //Sets to yellow the indetified block's cells 
  */
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
        cell.setBackground("yellow");
      }
  }
};

function validate(e) {
  var ss = e.source;
  var cell = ss.getActiveCell();

  var max_length = 3;

  if(cell.getColumn() === 1) {

    var value = String(cell.getValue());

    if(value.length > max_length) {

      cell.clearContent();
      cell.setNote("Oops, less than 3 characters please");
      //or perhaps this instead of a note
      ss.toast('Less than 3 characters please', 'Oops', 3);

    } else {
      cell.setNote(null);
    }
  }
} 

/**
 * Chacks if value is 1
 *
 * @param {number} input The value to check.
 * @return False if value is 1, otherwise true.
 * @customfunction
 */
function CustomValidationTest(input) {
  Logger.log("CustomValidationTest");
  if(input == 1)
    return false;
  else
    return true;
}


/**
 * Multiplies the input value by 2.
 *
 * @param {number} input The value or range of cells to multiply.
 * @return The input multiplied by 2.
 * @customfunction
 */
function CustomValidation2(input) {
  if (input.map) {            // Test whether input is an array.
    return input.map(DOUBLE); // Recurse over array if so.
  } else {
    return input * 2;
  }
}

