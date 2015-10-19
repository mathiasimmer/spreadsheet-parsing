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
    if(!this.spreadsheet.validRow(row) && !this.spreadsheet.validCol(column))
       return null;
    
    var value = this.spreadsheet.objCells[row][column].data;
    if (value === null)
      Logger.log("Null value not expected when reading cell: r " + row + ", c " + column);
    return value;
  };

  this.emptyCell = function(row,column){
    if(!this.spreadsheet.validRow(row) && !this.spreadsheet.validCol(column))
      return null;
    //Logger.log("Debug: cell: r " + row + ", c " + column);
    return this.spreadsheet.objCells[row][column].isEmpty();
  };

  this.parse_syntax_IDENTIFIER = function(text){

    var result = this.internal_parse_syntax_IDENTIFIER(text);
    if (result!==null && result[1].lenght===0)
            return result[0];
    Logger.log('parse error: illegal identifier ' + text);
  };
  
  this.parse_syntax_STRING = function(text){
    
    return this.internal_parse_syntax_STRING(text)[0];
  };

  this.parse_syntax_INTEGER = function(text){
    var result = this.internal_parse_syntax_INTEGER(text)[0];
    if(result!==null)
        return result[0];
    Logger.log('parse error: illegal integer ' + text);
  };
/*
  this.parse_syntax_token = function(token){

    var f=function(text) { this.parse_syntax_token_helper(token,text); };
    return f;
  };
*/
  this.parse_syntax_token = function(token,string){
    
    var result = this.internal_parse_syntax_token(token);
    if (result!==null)
      return result[0];
    Logger.log('parse error: expected token ' + token + ' but got ' + string);
  };

  this.internal_parse_syntax_IDENTIFIER = function(text){

    var m=this.regexp_parse_identifier.match(text);  
    if (m)
    {
        value=m.group(0);
        return [{'IDENTIFIER':value},text[value.lenght]];
    }

    return null;
  };

  this.internal_parse_syntax_STRING = function(text){
    
    return [{'STRING':text},'']; 
  };

  this.internal_parse_syntax_INTEGER = function(text){
    var res = parseInt(text);
    if(res.isNaN)
        return null;
        
    return [{'INTEGER':res},''];
  };
/*
  this.internal_parse_syntax_token = function(token){
    var f = function(text){ this.internal_parse_syntax_token_helper(token,text); };
    return f;
  };
*/
  this.internal_parse_syntax_token = function(token,string){    
    if(string !== null){
      //Logger.log('Debug: token "' + token + '" string: "' + string + '"');
      var text = String(string).replace(/^\s*/g, ""); //lstrip();
      if (text.startsWith(token))
        return [{'TOKEN':token},text[token.length]];
    }
    return null;
  };

}

if (!String.prototype.startsWith) {
  String.prototype.startsWith = function(searchString, position) {
    position = position || 0;
    return this.indexOf(searchString, position) === position;
  };
}