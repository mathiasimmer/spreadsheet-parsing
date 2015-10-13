package dk.sdu.mmmi.sgl.generator

import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Block
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.MandatoryColumn
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.OptionalColumn
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.RowSpec
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.BlockSpec
import org.eclipse.emf.common.util.EList
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Rule
import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Syntax

class PyCodeGen extends BaseCodeGen {
	
	new(Grammar gra)
	{
		super(gra);
	}
	
	def generate(/*Grammar grammar*/) '''
	from spreadsheet_parser import *
	class Parse«grammar.name»(GenericParserHelper):
	
		def __init__(self, spreadsheet):
			GenericParserHelper.__init__(self,spreadsheet)
	
		def matchColumns(self,columnHeaders):
			return columnHeaders==[«FOR h:grammar.computeHeaders SEPARATOR ","»"«h»"«ENDFOR»]
	
		def getColumnHeaders(self):
			return [«FOR h:grammar.computeHeaders SEPARATOR ","»"«h»"«ENDFOR»]
	
		def parseBlock(self,columnHeaders,row,column,height):
			results = []
			relativeRow = 0
			while relativeRow<height:
				increment_and_object = self.parse_«grammar.root.name»(row+relativeRow,column,row+height)
				results.append(increment_and_object[1])
				relativeRow += increment_and_object[0]
			return results
		«FOR e:grammar.elements»
		«e.genParser»
		«ENDFOR»
	'''
		def dispatch genParser(Rule rule) '''
	
	def parse_syntax_«rule.name»(self,text):
		object_and_rest = self.internal_parse_syntax_«rule.name»(text)
		if object_and_rest==None:
			raise Exception("Failed parsing as «rule.name», text: "+text)
		rest_maybe = object_and_rest[1].lstrip()
		if len(rest_maybe)>0:
			raise Exception("Surplus text when parsing «rule.name», text: "+rest_maybe)
		return object_and_rest[0]
	
	def internal_parse_syntax_«rule.name»(self,text):
		«FOR a:rule.alternatives»
		object_and_rest = self.parse_syntax_«rule.name»_«a.uniqueCode»(text)
		if object_and_rest!=None:
			return object_and_rest
		«ENDFOR»
		return None
	«FOR a:rule.alternatives»
	«a.parts.genInternalParser(rule.name+"_"+a.uniqueCode,rule.name)»	
	«ENDFOR»
	'''
	
	def genInternalParser(EList<Syntax> list, String name, String dataname) '''
	
	def parse_syntax_«name»(self,text):
		current = text
		result = []
		«FOR part:list»
		object_and_rest = self.internal_parse_syntax_«part.generateSyntaxName»(current)
		if object_and_rest==None:
			return None
		result.append(object_and_rest[0])
		current = object_and_rest[1]
		«ENDFOR»
		return ({"«dataname»":result},current)
	'''
	
	//
	// Parse functions for grammar
	//
	
	def dispatch genParser(Block block) '''
	
	def parse_«block.name»(self,row,column,max_row):
		column_offset = 0
		result_row_increment = 1
		result_object = {}
		«FOR c:block.columns»
		# Column «c.name»
		current_column = column+column_offset
		«IF c.multiple»
		«c.def.genParserMultiple(c.name)»
		«ELSE»
		«c.def.genParserSingle(c.name)»
		«ENDIF»
		result_object["«c.name»"] = value_«c.name»
		column_offset += 1
		«ENDFOR»
		return (result_row_increment,result_object)
	'''
	
	def dispatch genParserMultiple(MandatoryColumn col, String name) '''
	value_«name» = []
	«col.spec.genParserMultipleBody(name)»
	'''
	
	def dispatch genParserMultiple(OptionalColumn col, String name) '''
	value_«name» = []
	if not self.emptyCell(row,current_column):
		«col.spec.genParserMultipleBody(name)»
	'''

	def dispatch genParserSingle(MandatoryColumn col, String name) '''
	value_«name» = «col.spec.genParserSingleBody»
	'''
	
	def dispatch genParserSingle(OptionalColumn col, String name) '''
	if self.emptyCell(row,current_column):
		value_«name» = None
	else:
		value_«name» = «col.spec.genParserSingleBody»
	'''

	def dispatch genParserSingleBody(RowSpec spec) '''
	self.parse_syntax_«spec.syntax.generateSyntaxName»(self.getCell(row,current_column))
	'''

	
	def dispatch genParserSingleBody(BlockSpec spec) {
		throw new Exception("Illegal grammar: block with single-relation column")
	}

	def dispatch genParserMultipleBody(RowSpec spec, String name) '''
	relativeRow = 0
	while True:
		value_«name».append(self.parse_syntax_«spec.syntax.generateSyntaxName»(self.getCell(row+relativeRow,current_column))
		relativeRow += 1
		if not self.emptyCell(row+relativeRow,current_column-1):
			break
	result_row_increment = max(result_row_increment,relativeRow)
	'''

	def dispatch genParserMultipleBody(BlockSpec spec, String name) '''
	relativeRow = 0
	while True:
		if row+relativeRow>=max_row:
			break
		increment_and_object = self.parse_«spec.kind.name»(row+relativeRow,current_column,max_row)
		relativeRow += increment_and_object[0]
		value_«name».append(increment_and_object[1])
		if not self.emptyCell(row+relativeRow,current_column-1):
			break
	result_row_increment = max(result_row_increment,relativeRow)
	'''


}