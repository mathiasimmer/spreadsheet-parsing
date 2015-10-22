
//ParseRiskAssessment object - inherits from GenericParserHelper

ParseRiskAssessment.prototype = Object.create(GenericParserHelper.prototype); // keeps the proto clean
ParseRiskAssessment.prototype.constructor = ParseRiskAssessment;              // repair the inherited constructor
function ParseRiskAssessment(spreadsheet){
    GenericParserHelper.call(this,spreadsheet);
	//Logger.log("Empty constructor");

	this.matchColumns = function(columnHeaders){
		return are_same(columnHeaders,["Operation, Activity,  Equipment or Component under consideration","Responsible person (Risk identified by)","Aspect Under Consideration","Significant Hazards","Who is at risk ?","Likelihood 1-5","Severity 1-5","Result","Action Required","Mitigation measure taken by Designer.       (1) Remove,     2)Reduce,       (3)Protection, (4)Information","Software","Mechanical/hardware","User manual","Other","Reason why not actioned at higher mitigation / elimination level ?","Residual Likelihood","Residual Severity","Result","Notes to assist recipient in further reducing the residual hazard risk","Standards / legislation","Description by department/contacts"]);
	};


	this.getColumnHeaders = function(){
		return ["Operation, Activity,  Equipment or Component under consideration","Responsible person (Risk identified by)","Aspect Under Consideration","Significant Hazards","Who is at risk ?","Likelihood 1-5","Severity 1-5","Result","Action Required","Mitigation measure taken by Designer.       (1) Remove,     2)Reduce,       (3)Protection, (4)Information","Software","Mechanical/hardware","User manual","Other","Reason why not actioned at higher mitigation / elimination level ?","Residual Likelihood","Residual Severity","Result","Notes to assist recipient in further reducing the residual hazard risk","Standards / legislation","Description by department/contacts"];
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
		// Column opperation
		current_column = column+column_offset;
		var value_opperation = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.opperation = value_opperation;
		column_offset ++;
		// Column risks
		current_column = column+column_offset;
		var value_risks = [];
		var relativeRow = 0;
		while (true)
		{
			if (row+relativeRow>=max_row)
				break;
			var increment_and_object = this.parse_Risks(row+relativeRow,current_column,max_row);
			relativeRow += increment_and_object[0];
			value_risks.push(increment_and_object[1]);
			if (!this.validRow(row+relativeRow) || !this.emptyCell(row+relativeRow,current_column-1))
				break;
		}
		result_row_increment = Math.max(result_row_increment,relativeRow);
		result_object.risks = value_risks;
		column_offset ++;
		return [result_row_increment,result_object];
	};
	
	this.parse_Risks = function(row,column,max_row){
		var column_offset = 0;
		var result_row_increment = 1;
		var result_object = {};
		var current_column = 0;
		// Column responsible
		current_column = column+column_offset;
		var value_responsible = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.responsible = value_responsible;
		column_offset ++;
		// Column aspect
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_aspect = null;
		else
			value_aspect = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.aspect = value_aspect;
		column_offset ++;
		// Column hazards
		current_column = column+column_offset;
		var value_hazards = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.hazards = value_hazards;
		column_offset ++;
		// Column risk
		current_column = column+column_offset;
		var value_risk = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.risk = value_risk;
		column_offset ++;
		// Column likelihood
		current_column = column+column_offset;
		var value_likelihood = this.parse_syntax_number(this.getCell(row,current_column));
		result_object.likelihood = value_likelihood;
		column_offset ++;
		// Column severity
		current_column = column+column_offset;
		var value_severity = this.parse_syntax_number(this.getCell(row,current_column));
		result_object.severity = value_severity;
		column_offset ++;
		// Column result
		current_column = column+column_offset;
		var value_result = this.parse_syntax_number(this.getCell(row,current_column));
		result_object.result = value_result;
		column_offset ++;
		// Column action
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_action = null;
		else
			value_action = this.parse_syntax_yes_no(this.getCell(row,current_column));
		result_object.action = value_action;
		column_offset ++;
		// Column mitigation
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_mitigation = null;
		else
			value_mitigation = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.mitigation = value_mitigation;
		column_offset ++;
		// Column software
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_software = null;
		else
			value_software = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.software = value_software;
		column_offset ++;
		// Column mech_hw
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_mech_hw = null;
		else
			value_mech_hw = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.mech_hw = value_mech_hw;
		column_offset ++;
		// Column manual
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_manual = null;
		else
			value_manual = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.manual = value_manual;
		column_offset ++;
		// Column other
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_other = null;
		else
			value_other = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.other = value_other;
		column_offset ++;
		// Column reason
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_reason = null;
		else
			value_reason = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.reason = value_reason;
		column_offset ++;
		// Column res_likelihood
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_res_likelihood = null;
		else
			value_res_likelihood = this.parse_syntax_number(this.getCell(row,current_column));
		result_object.res_likelihood = value_res_likelihood;
		column_offset ++;
		// Column res_severity
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_res_severity = null;
		else
			value_res_severity = this.parse_syntax_number(this.getCell(row,current_column));
		result_object.res_severity = value_res_severity;
		column_offset ++;
		// Column res_result
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_res_result = null;
		else
			value_res_result = this.parse_syntax_number(this.getCell(row,current_column));
		result_object.res_result = value_res_result;
		column_offset ++;
		// Column notes
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_notes = null;
		else
			value_notes = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.notes = value_notes;
		column_offset ++;
		// Column standards
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_standards = null;
		else
			value_standards = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.standards = value_standards;
		column_offset ++;
		// Column description
		current_column = column+column_offset;
		if (this.emptyCell(row,current_column))
			value_description = null;
		else
			value_description = this.parse_syntax_STRING(this.getCell(row,current_column));
		result_object.description = value_description;
		column_offset ++;
		return [result_row_increment,result_object];
	};
	
	this.parse_syntax_number = function(cell){
		var object_and_rest = this.internal_parse_syntax_number(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as number, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing number, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_number = function(text){
		var object_and_rest = null;
		object_and_rest = this.parse_syntax_number_0(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
		
	this.parse_syntax_number_0 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;object_and_rest = this.internal_parse_syntax_INTEGER(current);
	if (object_and_rest===null)
		return null;
	result.push(object_and_rest[0]);
	current = object_and_rest[1];	return [{"number":result},current];
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
		object_and_rest = this.parse_syntax_yes_no_1(text);
		if (object_and_rest!==null)
			return object_and_rest;
		object_and_rest = this.parse_syntax_yes_no_2(text);
		if (object_and_rest!==null)
			return object_and_rest;
		return null;
	};
	
		
	this.parse_syntax_yes_no_1 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;object_and_rest = this.internal_parse_syntax_token("yes", current);
	if (object_and_rest===null)
		return null;
	result.push(object_and_rest[0]);
	current = object_and_rest[1];	return [{"yes_no":result},current];
			};	
	
		
	this.parse_syntax_yes_no_2 = function(text){
		var current = text;
		var result = [];
		var object_and_rest = null;object_and_rest = this.internal_parse_syntax_token("no", current);
	if (object_and_rest===null)
		return null;
	result.push(object_and_rest[0]);
	current = object_and_rest[1];	return [{"yes_no":result},current];
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

