/**
 * A special function that runs when the spreadsheet is open, used to add a
 * custom menu to the spreadsheet.
 */
function onOpen() {
  var ui = SpreadsheetApp.getUi();
  // Or DocumentApp or FormApp.
  ui.createMenu('Validate Menu')
      .addItem('Validate worksheet', 'menuValidateWorkseet')
      .addSeparator()
      .addSubMenu(ui.createMenu('Sub-menu')
          .addItem('Second item', 'menuItem2'))
      .addToUi();

}

function menuValidateWorkseet() {
  Logger.log("menu: menuValidateWorkseet");
  
  var s = new Spreadsheet;
  s.InitFromSheet();
  var headers = ["headA","headB","headC","headD"];
  var res = s.__FindHeaders(headers);
  Logger.log("are seme: " + s.are_same(headers,["headA","headB","headC","headD"]));
  
  Logger.log("__FindHeaders: " + res);
  
  s.Print();
  
  /*SpreadsheetApp.getUi() // Or DocumentApp or FormApp.
     .alert('You clicked the first menu item!');
     */
}

function menuItem2() {
  SpreadsheetApp.getUi() // Or DocumentApp or FormApp.
     .alert('You clicked the second menu item!');
}
/*
function onEdit(e){
  // Set a comment on the edited cell to indicate when it was changed.
  var range = e.range;
  range.setNote('Last modified: ' + new Date());
}

*/
/**
 * A custom function that converts meters to miles.
 *
 * @param {Number} meters The distance in meters.
 * @return {Number} The distance in miles.
 */ /*
function metersToMiles(meters) {
  if (typeof meters != 'number') {
    return null;
  }
  return meters / 1000 * 0.621371;
}

function validateMySpreadsheet() {
  // Set a rule for the cell B4 to be a number between 1 and 100.
  var cell = SpreadsheetApp.getActive().getRange('B4');
  var rule = SpreadsheetApp.newDataValidation()
     .requireNumberBetween(1, 100)
     .setAllowInvalid(false)
     .setHelpText('Number must be between 1 and 100.')
     .build();
  cell.setDataValidation(rule);
}
*/
// Set the data validation for cell A1 to require a value from B1:B10.
/* var cell = SpreadsheetApp.getActive().getRange('A1');
 var range = SpreadsheetApp.getActive().getRange('B1:B10');
 var rule = SpreadsheetApp.newDataValidation().requireValueInRange(range).build();
 cell.setDataValidation(rule);

validateMySpreadsheet();
 */