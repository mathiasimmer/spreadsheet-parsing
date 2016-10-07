/*
 * generated by Xtext
 */
package dk.sdu.mmmi.sgl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import dk.sdu.mmmi.sgl.services.SpreadsheetGrammarLanguageGrammarAccess;

public class SpreadsheetGrammarLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private SpreadsheetGrammarLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected dk.sdu.mmmi.sgl.ui.contentassist.antlr.internal.InternalSpreadsheetGrammarLanguageParser createParser() {
		dk.sdu.mmmi.sgl.ui.contentassist.antlr.internal.InternalSpreadsheetGrammarLanguageParser result = new dk.sdu.mmmi.sgl.ui.contentassist.antlr.internal.InternalSpreadsheetGrammarLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getColumnDefinitionAccess().getAlternatives(), "rule__ColumnDefinition__Alternatives");
					put(grammarAccess.getColumnSpecAccess().getAlternatives(), "rule__ColumnSpec__Alternatives");
					put(grammarAccess.getSyntaxAccess().getAlternatives(), "rule__Syntax__Alternatives");
					put(grammarAccess.getGrammarAccess().getGroup(), "rule__Grammar__Group__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getColumnAccess().getGroup(), "rule__Column__Group__0");
					put(grammarAccess.getMandatoryColumnAccess().getGroup(), "rule__MandatoryColumn__Group__0");
					put(grammarAccess.getOptionalColumnAccess().getGroup(), "rule__OptionalColumn__Group__0");
					put(grammarAccess.getRowSpecAccess().getGroup(), "rule__RowSpec__Group__0");
					put(grammarAccess.getBlockSpecAccess().getGroup(), "rule__BlockSpec__Group__0");
					put(grammarAccess.getSyntaxAccess().getGroup_3(), "rule__Syntax__Group_3__0");
					put(grammarAccess.getSyntaxAccess().getGroup_4(), "rule__Syntax__Group_4__0");
					put(grammarAccess.getRuleAccess().getGroup(), "rule__Rule__Group__0");
					put(grammarAccess.getRuleAccess().getGroup_4(), "rule__Rule__Group_4__0");
					put(grammarAccess.getGrammarAccess().getNameAssignment_1(), "rule__Grammar__NameAssignment_1");
					put(grammarAccess.getGrammarAccess().getRootAssignment_3(), "rule__Grammar__RootAssignment_3");
					put(grammarAccess.getGrammarAccess().getElementsAssignment_5(), "rule__Grammar__ElementsAssignment_5");
					put(grammarAccess.getBlockAccess().getNameAssignment_1(), "rule__Block__NameAssignment_1");
					put(grammarAccess.getBlockAccess().getColumnsAssignment_3(), "rule__Block__ColumnsAssignment_3");
					put(grammarAccess.getColumnAccess().getNameAssignment_0(), "rule__Column__NameAssignment_0");
					put(grammarAccess.getColumnAccess().getMultipleAssignment_1(), "rule__Column__MultipleAssignment_1");
					put(grammarAccess.getColumnAccess().getDefAssignment_2(), "rule__Column__DefAssignment_2");
					put(grammarAccess.getMandatoryColumnAccess().getSpecAssignment_1(), "rule__MandatoryColumn__SpecAssignment_1");
					put(grammarAccess.getOptionalColumnAccess().getSpecAssignment_1(), "rule__OptionalColumn__SpecAssignment_1");
					put(grammarAccess.getRowSpecAccess().getHeaderAssignment_1(), "rule__RowSpec__HeaderAssignment_1");
					put(grammarAccess.getRowSpecAccess().getSyntaxAssignment_3(), "rule__RowSpec__SyntaxAssignment_3");
					put(grammarAccess.getBlockSpecAccess().getKindAssignment_1(), "rule__BlockSpec__KindAssignment_1");
					put(grammarAccess.getSyntaxAccess().getIs_idAssignment_0(), "rule__Syntax__Is_idAssignment_0");
					put(grammarAccess.getSyntaxAccess().getIs_stringAssignment_1(), "rule__Syntax__Is_stringAssignment_1");
					put(grammarAccess.getSyntaxAccess().getIs_intAssignment_2(), "rule__Syntax__Is_intAssignment_2");
					put(grammarAccess.getSyntaxAccess().getTokenAssignment_3_1(), "rule__Syntax__TokenAssignment_3_1");
					put(grammarAccess.getSyntaxAccess().getRuleAssignment_4_1(), "rule__Syntax__RuleAssignment_4_1");
					put(grammarAccess.getRuleAccess().getNameAssignment_1(), "rule__Rule__NameAssignment_1");
					put(grammarAccess.getRuleAccess().getAlternativesAssignment_3(), "rule__Rule__AlternativesAssignment_3");
					put(grammarAccess.getRuleAccess().getAlternativesAssignment_4_1(), "rule__Rule__AlternativesAssignment_4_1");
					put(grammarAccess.getSyntaxSeqAccess().getPartsAssignment(), "rule__SyntaxSeq__PartsAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			dk.sdu.mmmi.sgl.ui.contentassist.antlr.internal.InternalSpreadsheetGrammarLanguageParser typedParser = (dk.sdu.mmmi.sgl.ui.contentassist.antlr.internal.InternalSpreadsheetGrammarLanguageParser) parser;
			typedParser.entryRuleGrammar();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SpreadsheetGrammarLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SpreadsheetGrammarLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
