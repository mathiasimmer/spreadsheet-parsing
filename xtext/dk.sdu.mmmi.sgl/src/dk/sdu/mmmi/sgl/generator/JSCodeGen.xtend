package dk.sdu.mmmi.sgl.generator

import dk.sdu.mmmi.sgl.spreadsheetGrammarLanguage.Grammar

class JSCodeGen extends BaseCodeGen {
	protected var Grammar grammar;
	
	new(Grammar gra)
	{
		super(gra);
	}
	
	def generate(/*Grammar grammar*/) 
	'''test for JS file'''
	/*
	'''
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
	*/
}