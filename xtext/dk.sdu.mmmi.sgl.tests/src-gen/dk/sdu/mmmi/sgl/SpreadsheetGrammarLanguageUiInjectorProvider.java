/*
* generated by Xtext
*/
package dk.sdu.mmmi.sgl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SpreadsheetGrammarLanguageUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return dk.sdu.mmmi.sgl.ui.internal.SpreadsheetGrammarLanguageActivator.getInstance().getInjector("dk.sdu.mmmi.sgl.SpreadsheetGrammarLanguage");
	}
	
}
