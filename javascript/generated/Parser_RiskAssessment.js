
//ParseRiskAssessment object - inherits from GenericParserHelper

ParseRiskAssessment.prototype = Object.create(GenericParserHelper.prototype); // keeps the proto clean
ParseRiskAssessment.prototype.constructor = ParseRiskAssessment;              // repair the inherited constructor
function ParseRiskAssessment(spreadsheet){
    GenericParserHelper.call(this,spreadsheet);
	//Logger.log("Empty constructor");

	this.matchColumns = function(columnHeaders){
		return are_same(columnHeaders,["Risk","Hazards","Likeli-hood","Seve-rity","Result","Reduction required","Action","Mitigation measures","Input","Condition","Actions","Comment"]);
	};


	this.getColumnHeaders = function(){
		return ["Risk","Hazards","Likeli-hood","Seve-rity","Result","Reduction required","Action","Mitigation measures","Input","Condition","Actions","Comment"];
	};
	
	this.parseBlock = function(row,column,height){
		var results = [];
		var relativeRow = 0;
		if(this.validRow(row) && this.validCol(column) && this.validRow(row + height-1))
		{
			while (relativeRow<height){
				var increment_and_object = this.parse_RiskAssessment(row+relativeRow, column, row+height);
				results.push(increment_and_object[1]);
				relativeRow += increment_and_object[0];
			}
			return results;
		}
		else
			return null;
	};
	
	this.parse_RiskAssessment = function(row,column,max_row){
		var column_offset = 0;
		var result_row_increment = 1;
		var result_object = {};
		var current_column = 0;
		// Column risk
		current_column = column+column_offset;
		var value_risk = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.risk = value_risk;
		column_offset ++;
		// Column hazards
		current_column = column+column_offset;
		var value_hazards = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.hazards = value_hazards;
		column_offset ++;
		// Column likelihood
		current_column = column+column_offset;
		var value_likelihood = this.parse_syntax_INTEGER(this.getCell(row,current_column));
		result_object.likelihood = value_likelihood;
		column_offset ++;
		// Column severity
		current_column = column+column_offset;
		var value_severity = this.parse_syntax_INTEGER(this.getCell(row,current_column));
		result_object.severity = value_severity;
		column_offset ++;
		// Column result
		current_column = column+column_offset;
		var value_result = this.parse_syntax_INTEGER(this.getCell(row,current_column));
		result_object.result = value_result;
		column_offset ++;
		// Column reduction
		current_column = column+column_offset;
		var value_reduction = this.parse_syntax_yes_no(this.getCell(row,current_column));
		result_object.reduction = value_reduction;
		column_offset ++;
		// Column action_desc
		current_column = column+column_offset;
		var value_action_desc = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.action_desc = value_action_desc;
		column_offset ++;
		// Column mitigation
		current_column = column+column_offset;
		var value_mitigation = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.mitigation = value_mitigation;
		column_offset ++;
		// Column input
		current_column = column+column_offset;
		var value_input = this.parse_syntax_Input(this.getCell(row,current_column));
		result_object.input = value_input;
		column_offset ++;
		// Column condition
		current_column = column+column_offset;
		var value_condition = this.parse_syntax_Condition(this.getCell(row,current_column));
		result_object.condition = value_condition;
		column_offset ++;
		// Column actions
		current_column = column+column_offset;
		var value_actions = this.parse_syntax_IDENTIFIER(this.getCell(row,current_column));
		result_object.actions = value_actions;
		column_offset ++;
		// Column comment
		current_column = column+column_offset;
		var value_comment = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.comment = value_comment;
		column_offset ++;
		return [result_row_increment,result_object];
	};
	
	this.parse_syntax_yes_no = function(cell){
		var object_and_rest = this.internal_parse_syntax_yes_no(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as yes_no, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing yes_no, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_yes_no = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_yes_no_0(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_yes_no_1(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_yes_no_0 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_token("yes", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"yes_no":result},current];
	};
	
	this.parse_syntax_yes_no_1 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_token("no", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"yes_no":result},current];
	};
	
	this.parse_syntax_Input = function(cell){
		var object_and_rest = this.internal_parse_syntax_Input(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as Input, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing Input, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_Input = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_Input_2(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_Input_3(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_Input_2 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_InputCategory(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token(";", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_Input(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"Input":result},current];
	};
	
	this.parse_syntax_Input_3 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_InputCategory(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token(";", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"Input":result},current];
	};
	
	this.parse_syntax_InputCategory = function(cell){
		var object_and_rest = this.internal_parse_syntax_InputCategory(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as InputCategory, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing InputCategory, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_InputCategory = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_InputCategory_4(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_InputCategory_5(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_InputCategory_4 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_IDENTIFIER(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token("@", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_INTEGER(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token("Hz", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token(":", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_InputComponents(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"InputCategory":result},current];
	};
	
	this.parse_syntax_InputCategory_5 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_IDENTIFIER(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token(":", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_InputComponents(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"InputCategory":result},current];
	};
	
	this.parse_syntax_InputComponents = function(cell){
		var object_and_rest = this.internal_parse_syntax_InputComponents(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as InputComponents, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing InputComponents, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_InputComponents = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_InputComponents_6(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_InputComponents_7(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_InputComponents_6 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_IDENTIFIER(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token(",", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_InputComponents(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"InputComponents":result},current];
	};
	
	this.parse_syntax_InputComponents_7 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_IDENTIFIER(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"InputComponents":result},current];
	};
	
	this.parse_syntax_Condition = function(cell){
		var object_and_rest = this.internal_parse_syntax_Condition(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as Condition, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing Condition, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_Condition = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_Condition_8(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_Condition_9(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_Condition_10(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_Condition_8 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_Cond(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token("and", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_Condition(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"Condition":result},current];
	};
	
	this.parse_syntax_Condition_9 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_Cond(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token("or", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_Condition(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"Condition":result},current];
	};
	
	this.parse_syntax_Condition_10 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_Cond(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"Condition":result},current];
	};
	
	this.parse_syntax_Cond = function(cell){
		var object_and_rest = this.internal_parse_syntax_Cond(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as Cond, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing Cond, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_Cond = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_Cond_11(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_Cond_12(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_Cond_11 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_BasicCond(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_ByClause(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"Cond":result},current];
	};
	
	this.parse_syntax_Cond_12 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_BasicCond(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"Cond":result},current];
	};
	
	this.parse_syntax_BasicCond = function(cell){
		var object_and_rest = this.internal_parse_syntax_BasicCond(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as BasicCond, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing BasicCond, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_BasicCond = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_BasicCond_13(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_BasicCond_14(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_BasicCond_13 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_IDENTIFIER(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token(">", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_IDENTIFIER(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"BasicCond":result},current];
	};
	
	this.parse_syntax_BasicCond_14 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_IDENTIFIER(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token("=", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_IDENTIFIER(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"BasicCond":result},current];
	};
	
	this.parse_syntax_ByClause = function(cell){
		var object_and_rest = this.internal_parse_syntax_ByClause(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as ByClause, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing ByClause, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_ByClause = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_ByClause_15(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
	this.parse_syntax_ByClause_15 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;
	
		object_and_rest = this.internal_parse_syntax_token("by", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_INTEGER(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token("%", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token("for", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_INTEGER(current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		object_and_rest = this.internal_parse_syntax_token("sec", current);
		if (object_and_rest===null)
			return null;
		result.push(object_and_rest[0]);
		current = object_and_rest[1];
	
		return [{"ByClause":result},current];
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

