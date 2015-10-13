package dk.sdu.mmmi.sgl.generator

import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Rule
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.SyntaxSeq
import java.util.HashMap
import java.util.List
import java.util.ArrayList
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Column
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.ColumnDefinition
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Block
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.BlockSpec

abstract class BaseCodeGen {
	protected var Grammar grammar;
	public var debug_level = 0;
	
	new(Grammar gra)
	{
		grammar = gra;
	}	
	
	
	// Helper stuff
	
	def String generateSyntaxName(Syntax syntax) {
		if(syntax.is_id) "IDENTIFIER"
		else if(syntax.is_string) "STRING"
		else if(syntax.is_int) "INTEGER"
		else if(syntax.token!=null) "token(\""+syntax.token+"\")"
		else syntax.rule.name
	}
	
	//
	// Parse functions for rules
	//
	

	def String uniqueCode(SyntaxSeq seq) {
		if(!uniqueCodes.containsKey(seq))
			uniqueCodes.put(seq,Integer.toString(uniqueCodesCounter++))
		uniqueCodes.get(seq)
	}

	val uniqueCodes = new HashMap<SyntaxSeq,String>
	var uniqueCodesCounter = 0
	
	//
	// Computation of headers
	//
	
	def List<String> computeHeaders(Grammar grammar) {
		val result = new ArrayList<String>()
		grammar.root.collectHeaders(result)
		result
	}
	
	def dispatch void collectHeaders(Block block, List<String> collector) {
		block.columns.forEach[collectHeaders(collector)]
	}
	
	def dispatch void collectHeaders(Rule rule, List<String> collector) { }
	
	def dispatch void collectHeaders(Column column, List<String> collector) {
		column.def.collectHeaders(collector)
	}
	
	def dispatch void collectHeaders(ColumnDefinition cdef, List<String> collector) {
		cdef.spec.collectHeaders(collector)
	}

	def dispatch void collectHeaders(RowSpec spec, List<String> collector) {
		collector.add(spec.header)
	}

	def dispatch void collectHeaders(BlockSpec spec, List<String> collector) {
		spec.kind.collectHeaders(collector)
	}
}