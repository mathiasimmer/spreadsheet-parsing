package dk.sdu.mmmi.sgl.generator

import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Rule
import org.eclipse.emf.common.util.EList
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Block
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.MandatoryColumn
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.OptionalColumn
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.BlockSpec

class JSCodeGen extends BaseCodeGen {
	
	new(Grammar gra)
	{
		super(gra);
	}
	
	def generate(/*Grammar grammar*/) 
	//'''test for JS file �grammar.name�'''

	'''	
	
	//Parse�grammar.name� object - inherits from GenericParserHelper

	Parse�grammar.name�.prototype = Object.create(GenericParserHelper.prototype); // keeps the proto clean
	Parse�grammar.name�.prototype.constructor = Parse�grammar.name�;              // repair the inherited constructor
	function Parse�grammar.name�(spreadsheet){
	    GenericParserHelper.call(this,spreadsheet);
		//Logger.log("Empty constructor");
	
		this.matchColumns = function(columnHeaders){
			return are_same(columnHeaders,[�FOR h:grammar.computeHeaders SEPARATOR ","�"�h�"�ENDFOR�]);
		};
	

		this.getColumnHeaders = function(){
			return [�FOR h:grammar.computeHeaders SEPARATOR ","�"�h�"�ENDFOR�];
		};
		
		this.parseBlock = function(row,column,height){
			var results = [];
			var relativeRow = 0;
			if(this.validRow(row) && this.validCol(column) && this.validRow(row + height-1))
			{
				while (relativeRow<height){
					var increment_and_object = this.parse_�grammar.root.name�(row+relativeRow, column, row+height);
					results.push(increment_and_object[1]);
					relativeRow += increment_and_object[0];
				}
				return results;
			}
			else
				return null;
		};
		�FOR e:grammar.elements�
		�e.genParser�
		�ENDFOR�
	
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

	''' 
	def dispatch genParser(Rule rule) '''
	
	this.parse_syntax_�rule.name� = function(cell){
		var object_and_rest = this.internal_parse_syntax_�rule.name�(cell.data);
		var error = null;
		if (object_and_rest===null){
			error = "Failed parsing as �rule.name�, text: " + cell.data;
			Logger.log(error);
			cell.setError(error);
			return null;
		}
		if(typeof object_and_rest[1] != 'undefined'){
			rest_maybe = String(object_and_rest[1]).replace(/^\s*/g, ""); //lstrip()
			if (rest_maybe.length>0)
			{
				error = "Surplus text when parsing �rule.name�, text: " + rest_maybe;
				Logger.log(error);
				cell.setError(error);
			}
		}
		return object_and_rest[0];
	};
	
	this.internal_parse_syntax_�rule.name� = function(text){
		var object_and_rest = null;
		�FOR a:rule.alternatives�
		object_and_rest = this.parse_syntax_�rule.name�_�a.uniqueCode�(text);
		if (object_and_rest!==null)
			return object_and_rest;
		�ENDFOR�
		return null;
	};
	�FOR a:rule.alternatives�
	�a.parts.genInternalParser(rule.name+"_"+a.uniqueCode,rule.name)�	
	�ENDFOR�
	'''
	
	def genInternalParser(EList<Syntax> list, String name, String dataname) 
	{
		var isSingle = list.length == 1;
		var result = ""
		if(isSingle){
			result += "var result = null;"
		} else {
			result += "var result = [];"
		}

		var code_gen=
		'''	
		
		this.parse_syntax_�name� = function(text){
			var current = text;
			�result�
			var object_and_rest = null;
		'''
		for (part:list)
		{
			var fn_text = part.generateSyntaxName
			if( fn_text.startsWith("token("))
			{
				//fn_text = fn_text.replaceFirst("\\)","")
				fn_text = fn_text.replaceAll("\\)$","")
				fn_text += ", current)"
			}
			else
				fn_text += "(current)"
		
		var returnResult = "";
		if(isSingle){
			returnResult += "result = object_and_rest[0]";
		} else {
			returnResult += "result.push(object_and_rest[0]);";
		}
				
		code_gen += 
		'''	
		
			object_and_rest = this.internal_parse_syntax_�fn_text�;
			if (object_and_rest===null)
				return null;
			�returnResult�
			current = object_and_rest[1];
		'''
		}
		code_gen +=
		'''
		
			return [{"�dataname�":result},current];
		};
		'''
		
		return code_gen;
	}
	
	//
	// Parse functions for grammar
	//
	
	def dispatch genParser(Block block) '''
	
	this.parse_�block.name� = function(row,column,max_row){
		var column_offset = 0;
		var result_row_increment = 1;
		var result_object = {};
		var current_column = 0;
		�FOR c:block.columns�
		// Column �c.name�
		current_column = column+column_offset;
		�IF c.multiple�
		�c.def.genParserMultiple(c.name)�
		�ELSE�
		�c.def.genParserSingle(c.name)�
		�ENDIF�
		result_object.�c.name� = value_�c.name�;
		column_offset ++;
		�ENDFOR�
		return [result_row_increment,result_object];
	};
	'''
	
	def dispatch genParserMultiple(MandatoryColumn col, String name) '''
	var value_�name� = [];
	�col.spec.genParserMultipleBody(name)�
	'''
	
	def dispatch genParserMultiple(OptionalColumn col, String name) '''
	var value_�name� = [];
	if (!this.emptyCell(row,current_column)){
		�col.spec.genParserMultipleBody(name)�
	}
	'''

	def dispatch genParserSingle(MandatoryColumn col, String name) '''
	var value_�name� = �col.spec.genParserSingleBody�
	'''
	
	def dispatch genParserSingle(OptionalColumn col, String name) '''
	if (this.emptyCell(row,current_column))
		value_�name� = null;
	else
		value_�name� = �col.spec.genParserSingleBody�
	'''

	def dispatch genParserSingleBody(RowSpec spec) '''
	this.parse_syntax_�spec.syntax.generateSyntaxName�(this.getCell(row,current_column));
	'''

	
	def dispatch genParserSingleBody(BlockSpec spec) {
		throw new Exception("Illegal grammar: block with single-relation column")
		//Logger.log("Illegal grammar: block with single-relation column");
	}

	def dispatch genParserMultipleBody(RowSpec spec, String name) '''
	var relativeRow = 0;
	while (true)
	{
		value_�name�.push(this.parse_syntax_�spec.syntax.generateSyntaxName�(this.getCell(row+relativeRow,current_column));
		relativeRow += 1;
		if (!this.emptyCell(row+relativeRow,current_column-1))
			break;
	}
	result_row_increment = Math.max(result_row_increment,relativeRow);
	'''

	def dispatch genParserMultipleBody(BlockSpec spec, String name) '''
	var relativeRow = 0;
	while (true)
	{
		if (row+relativeRow>=max_row)
			break;
		var increment_and_object = this.parse_�spec.kind.name�(row+relativeRow,current_column,max_row);
		relativeRow += increment_and_object[0];
		value_�name�.push(increment_and_object[1]);
		if (!this.validRow(row+relativeRow) || !this.emptyCell(row+relativeRow,current_column-1))
			break;
	}
	result_row_increment = Math.max(result_row_increment,relativeRow);
	'''
	
}