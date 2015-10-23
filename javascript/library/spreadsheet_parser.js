///////////////////////////
//
//  Created on Oct 13, 2015
//
//  @author: sorin
//  js version of Ulrik's python file
//
///////////////////////////

// GenericParserHelper object

function GenericParserHelper(spreadsheet){
  this.spreadsheet = spreadsheet;
    
  this.getCell = function(row,column){ 
    if(!this.spreadsheet.validRow(row) || !this.spreadsheet.validCol(column)){
      Logger.log("Error getCell: cell: r " + row + ", c " + column);
      return null;
    }
    
    var value = this.spreadsheet.objCells[row][column];//.data;
    if (value === null)
      Logger.log("Null value not expected when reading cell: r " + row + ", c " + column);
    return value;
  };

  this.getCellError = function(r,c){
    return this.spreadsheet.objCells[r][c].err;
  };

  this.emptyCell = function(row,column){
    if(this.spreadsheet.validRow(row) && this.spreadsheet.validCol(column))
    {
      //Logger.log("Debug: cell: r " + row + ", c " + column);
      return this.spreadsheet.objCells[row][column].isEmpty();
    }
    
    Logger.log("Error emptyCell: cell: r " + row + ", c " + column);
    return null;
  };

  this.parse_syntax_IDENTIFIER = function(cell){
    
    var result = this.internal_parse_syntax_IDENTIFIER(cell.data);
    if(result!==null && result[1].length===0)
        return result[0];
    
    var error = 'parse error: illegal identifier ' + cell.data;
    Logger.log(error);
    cell.setError(error);
  };
  
  this.parse_syntax_STRING = function(cell){
    
    return this.internal_parse_syntax_STRING(cell.data)[0];
  };

  this.parse_syntax_INTEGER = function(cell){
    var result = this.internal_parse_syntax_INTEGER(cell.data);
    if(result!==null)
        return result[0];
    var error = 'parse error: illegal integer ' + cell.data;
    Logger.log(error);
    cell.setError(error);
  };
/*
  this.parse_syntax_token = function(token){

    var f=function(text) { this.parse_syntax_token_helper(text); };
    return f;
  };
*/
  this.parse_syntax_token = function(token,string){
    
    var result = this.internal_parse_syntax_token(token);
    if (result===null){  
      var error = 'parse error: expected token ' + token + ' but got ' + string;
      Logger.log(error);
      cell.setError(error);
    }
    return result[0];
  };

  this.internal_parse_syntax_IDENTIFIER = function(text){
    var re =/[A-Za-z_][A-Za-z_0-9]*/g;
    var m=text.match(re);  
    //Logger.log("debug: IDENTIFIER " + text + " -> " + m);
    if (m !== null)
    {
        value=m;
        m = text.replace(/^\s*/g, ""); //lstrip();
        m = m.substring(value[0].length);
        //Logger.log("debug: IDENTIFIER rest '" + m + "' len " + m.length);
        return [{'IDENTIFIER':value},m];
    }

    return null;
  };

  this.internal_parse_syntax_STRING = function(text){
    
    return [{'STRING':text},'']; 
  };

  this.internal_parse_syntax_INTEGER = function(text){
    
    var int = parseInt(text);
    if(isNaN(int))
    {
      //Logger.log("!!!! "+text + " is not an integer");
      return null;
    } 
    var rest = text.toString();
    rest = rest.replace(/^\s*/g, ""); //lstrip();
    rest = rest.substring((int.toString()).length);
    
    return [{'INTEGER':int},rest];
  };
/*
  this.internal_parse_syntax_token = function(token){
    var f = function(cell.data){ this.internal_parse_syntax_token_helper(token,cell.data); };
    return f;
  };
*/
  this.internal_parse_syntax_token = function(token,string){    
    if(string !== null){
      //Logger.log('Debug: token "' + token + '" string: "' + string + '"');
      var text = string.replace(/^\s*/g, ""); //lstrip();
      if (text.startsWith(token))
        return [{'TOKEN':token},text.substring(token.length)];
    }
    return null;
  };

  this.validRow = function(val){
    return this.spreadsheet.validRow(val);
  };
  
  this.validCol = function(val){
    return this.spreadsheet.validCol(val);
  };
  
  this.validHeight = function(val){
    return this.spreadsheet.validHeight(val);
  };
  
}

if (!String.prototype.startsWith) {
  String.prototype.startsWith = function(searchString, position) {
    position = position || 0;
    return this.indexOf(searchString, position) === position;
  };
}