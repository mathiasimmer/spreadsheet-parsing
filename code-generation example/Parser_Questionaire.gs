
//ParseQuestionnaire object - inherits from GenericParserHelper

ParseQuestionnaire.prototype = Object.create(GenericParserHelper.prototype); // keeps the proto clean
ParseQuestionnaire.prototype.constructor = ParseQuestionnaire;              // repair the inherited constructor
function ParseQuestionnaire(spreadsheet){
    GenericParserHelper.call(this,spreadsheet);
	//Logger.log("Empty constructor");

	this.matchColumns = function(columnHeaders){
		return are_same(columnHeaders,["Form","Name","Question","Type","Value","Condition"]);
	};


	this.getColumnHeaders = function(){
		return ["Form","Name","Question","Type","Value","Condition"];
	};
	
	this.parseBlock = function(row,column,height){
		var results = [];
		var relativeRow = 0;
		if(this.validRow(row) && this.validCol(column) && this.validRow(row + height-1))
		{
			while (relativeRow<height){
				var increment_and_object = this.parse_Forms(row+relativeRow, column, row+height);
				results.push(increment_and_object[1]);
				relativeRow += increment_and_object[0];
			}
			return results;
		}
		else
			return null;
	};
	
	this.parse_Forms = function(row,column,max_row){
		var column_offset = 0;
		var result_row_increment = 1;
		var result_object = {};
		var current_column = 0;
		// Column name
		current_column = column+column_offset;
		var value_name = this.parse_syntax_IDENTIFIER(this.getCell(row,current_column));
		result_object.name = value_name;
		column_offset ++;
		// Column questions
		current_column = column+column_offset;
		var value_questions = [];
		var relativeRow = 0;
		while (true)
		{
			if (row+relativeRow>=max_row)
				break;
			var increment_and_object = this.parse_Question(row+relativeRow,current_column,max_row);
			relativeRow += increment_and_object[0];
			value_questions.push(increment_and_object[1]);
			if (!this.validRow(row+relativeRow) || !this.emptyCell(row+relativeRow,current_column-1))
				break;
		}
		result_row_increment = Math.max(result_row_increment,relativeRow);
		result_object.questions = value_questions;
		column_offset ++;
		return [result_row_increment,result_object];
	};
	
	this.parse_Question = function(row,column,max_row){
		var column_offset = 0;
		var result_row_increment = 1;
		var result_object = {};
		var current_column = 0;
		// Column name
		current_column = column+column_offset;
		var value_name = this.parse_syntax_IDENTIFIER(this.getCell(row,current_column));
		result_object.name = value_name;
		column_offset ++;
		// Column question
		current_column = column+column_offset;
		var value_question = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.question = value_question;
		column_offset ++;
		// Column type
		current_column = column+column_offset;
		var value_type = this.parse_syntax_Datatype(this.getCell(row,current_column));
		result_object.type = value_type;
		column_offset ++;
		// Column value
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_value = null;
		else
			value_value = this.parse_syntax_AExp(this.getCell(row,current_column));
		result_object.value = value_value;
		column_offset ++;
		// Column condition
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_condition = null;
		else
			value_condition = this.parse_syntax_BExp(this.getCell(row,current_column));
		result_object.condition = value_condition;
		column_offset ++;
		return [result_row_increment,result_object];
	};
	
	this.parse_syntax_Datatype = function(cell){
		var object_and_rest = this.internal_parse_syntax_Datatype(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as Datatype, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing Datatype, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_Datatype = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_Datatype_0(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_Datatype_1(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_Datatype_2(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_Datatype_0 = function(text){
		var current = text;
		var result = null;
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_token("boolean", current);
		if (object_and_rest===null)
			return null;
		result = object_and_rest[0]
		current = object_and_rest[1];
	
		return [{"Datatype":result},current];
	};
	
	this.parse_syntax_Datatype_1 = function(text){
		var current = text;
		var result = null;
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_token("money", current);
		if (object_and_rest===null)
			return null;
		result = object_and_rest[0]
		current = object_and_rest[1];
	
		return [{"Datatype":result},current];
	};
	
	this.parse_syntax_Datatype_2 = function(text){
		var current = text;
		var result = null;
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_token("int", current);
		if (object_and_rest===null)
			return null;
		result = object_and_rest[0]
		current = object_and_rest[1];
	
		return [{"Datatype":result},current];
	};
	
	this.parse_syntax_AExp = function(cell){
		var object_and_rest = this.internal_parse_syntax_AExp(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as AExp, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing AExp, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_AExp = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_AExp_3(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_AExp_4(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_AExp_5(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_AExp_6(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_AExp_3 = function(text){
		var current = text;
		var result = null;
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_Add(current);
		if (object_and_rest===null)
			return null;
		result = object_and_rest[0]
		current = object_and_rest[1];
	
		return [{"AExp":result},current];
	};
	
	this.parse_syntax_AExp_4 = function(text){
		var current = text;
		var result = null;
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_Sub(current);
		if (object_and_rest===null)
			return null;
		result = object_and_rest[0]
		current = object_and_rest[1];
	
		return [{"AExp":result},current];
	};
	
	this.parse_syntax_AExp_5 = function(text){
		var current = text;
		var result = null;
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_INTEGER(current);
		if (object_and_rest===null)
			return null;
		result = object_and_rest[0]
		current = object_and_rest[1];
	
		return [{"AExp":result},current];
	};
	
	this.parse_syntax_AExp_6 = function(text){
		var current = text;
		var result = null;
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_IDENTIFIER(current);
		if (object_and_rest===null)
			return null;
		result = object_and_rest[0]
		current = object_and_rest[1];
	
		return [{"AExp":result},current];
	};
	
	this.parse_syntax_Add = function(cell){
		var object_and_rest = this.internal_parse_syntax_Add(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as Add, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing Add, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_Add = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_Add_7(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_Add_7 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_token("(", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_AExp(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token("+", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_AExp(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token(")", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"Add":result},current];
	};
	
	this.parse_syntax_Sub = function(cell){
		var object_and_rest = this.internal_parse_syntax_Sub(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as Sub, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing Sub, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_Sub = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_Sub_8(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_Sub_8 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_token("(", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_AExp(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token("-", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_AExp(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token(")", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"Sub":result},current];
	};
	
	this.parse_syntax_BExp = function(cell){
		var object_and_rest = this.internal_parse_syntax_BExp(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as BExp, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing BExp, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_BExp = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_BExp_9(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_BExp_10(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_BExp_11(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_BExp_9 = function(text){
		var current = text;
		var result = null;
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_And(current);
		if (object_and_rest===null)
			return null;
		result = object_and_rest[0]
		current = object_and_rest[1];
	
		return [{"BExp":result},current];
	};
	
	this.parse_syntax_BExp_10 = function(text){
		var current = text;
		var result = null;
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_Or(current);
		if (object_and_rest===null)
			return null;
		result = object_and_rest[0]
		current = object_and_rest[1];
	
		return [{"BExp":result},current];
	};
	
	this.parse_syntax_BExp_11 = function(text){
		var current = text;
		var result = null;
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_IDENTIFIER(current);
		if (object_and_rest===null)
			return null;
		result = object_and_rest[0]
		current = object_and_rest[1];
	
		return [{"BExp":result},current];
	};
	
	this.parse_syntax_And = function(cell){
		var object_and_rest = this.internal_parse_syntax_And(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as And, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing And, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_And = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_And_12(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_And_12 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_token("(", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_BExp(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token("and", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_BExp(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token(")", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"And":result},current];
	};
	
	this.parse_syntax_Or = function(cell){
		var object_and_rest = this.internal_parse_syntax_Or(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as Or, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing Or, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_Or = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_Or_13(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_Or_13 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_token("(", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_BExp(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token("or", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_BExp(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token(")", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"Or":result},current];
	};

	//helper function
	
	this.are_same = function(array1, array2){
		if (array1.length !== array2.length) 
			return false;
		for (var i = 0; i < array1.length; i++){
			if (array1[i] !== array2[i])
	    		return false;
	    		
			}
		return true; 
	};
		
}

