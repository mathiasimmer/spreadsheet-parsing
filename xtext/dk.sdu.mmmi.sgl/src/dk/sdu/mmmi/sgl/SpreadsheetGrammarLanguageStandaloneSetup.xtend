/*
 * generated by Xtext 2.10.0
 */
package dk.sdu.mmmi.sgl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class SpreadsheetGrammarLanguageStandaloneSetup extends SpreadsheetGrammarLanguageStandaloneSetupGenerated {

	def static void doSetup() {
		new SpreadsheetGrammarLanguageStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}