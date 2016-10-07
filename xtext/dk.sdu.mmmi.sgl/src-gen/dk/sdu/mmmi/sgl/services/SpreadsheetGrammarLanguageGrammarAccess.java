/*
 * generated by Xtext
 */
package dk.sdu.mmmi.sgl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SpreadsheetGrammarLanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class GrammarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Grammar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLanguageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cRootAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cRootBlockCrossReference_3_0 = (CrossReference)cRootAssignment_3.eContents().get(0);
		private final RuleCall cRootBlockIDTerminalRuleCall_3_0_1 = (RuleCall)cRootBlockCrossReference_3_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cElementsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cElementsElementParserRuleCall_5_0 = (RuleCall)cElementsAssignment_5.eContents().get(0);
		
		//Grammar:
		//	"language" name=ID ":" root=[Block] ";" elements+=Element*;
		@Override public ParserRule getRule() { return rule; }

		//"language" name=ID ":" root=[Block] ";" elements+=Element*
		public Group getGroup() { return cGroup; }

		//"language"
		public Keyword getLanguageKeyword_0() { return cLanguageKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//root=[Block]
		public Assignment getRootAssignment_3() { return cRootAssignment_3; }

		//[Block]
		public CrossReference getRootBlockCrossReference_3_0() { return cRootBlockCrossReference_3_0; }

		//ID
		public RuleCall getRootBlockIDTerminalRuleCall_3_0_1() { return cRootBlockIDTerminalRuleCall_3_0_1; }

		//";"
		public Keyword getSemicolonKeyword_4() { return cSemicolonKeyword_4; }

		//elements+=Element*
		public Assignment getElementsAssignment_5() { return cElementsAssignment_5; }

		//Element
		public RuleCall getElementsElementParserRuleCall_5_0() { return cElementsElementParserRuleCall_5_0; }
	}

	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Element");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBlockParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRuleParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Element:
		//	Block | Rule;
		@Override public ParserRule getRule() { return rule; }

		//Block | Rule
		public Alternatives getAlternatives() { return cAlternatives; }

		//Block
		public RuleCall getBlockParserRuleCall_0() { return cBlockParserRuleCall_0; }

		//Rule
		public RuleCall getRuleParserRuleCall_1() { return cRuleParserRuleCall_1; }
	}

	public class BlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Block");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBlockKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cColumnsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cColumnsColumnParserRuleCall_3_0 = (RuleCall)cColumnsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Block:
		//	"block" name=ID "{" columns+=Column* "}";
		@Override public ParserRule getRule() { return rule; }

		//"block" name=ID "{" columns+=Column* "}"
		public Group getGroup() { return cGroup; }

		//"block"
		public Keyword getBlockKeyword_0() { return cBlockKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//columns+=Column*
		public Assignment getColumnsAssignment_3() { return cColumnsAssignment_3; }

		//Column
		public RuleCall getColumnsColumnParserRuleCall_3_0() { return cColumnsColumnParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class ColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Column");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cMultipleAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cMultipleAsteriskKeyword_1_0 = (Keyword)cMultipleAssignment_1.eContents().get(0);
		private final Assignment cDefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDefColumnDefinitionParserRuleCall_2_0 = (RuleCall)cDefAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Column:
		//	name=ID multiple?="*"? def=ColumnDefinition ";";
		@Override public ParserRule getRule() { return rule; }

		//name=ID multiple?="*"? def=ColumnDefinition ";"
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//multiple?="*"?
		public Assignment getMultipleAssignment_1() { return cMultipleAssignment_1; }

		//"*"
		public Keyword getMultipleAsteriskKeyword_1_0() { return cMultipleAsteriskKeyword_1_0; }

		//def=ColumnDefinition
		public Assignment getDefAssignment_2() { return cDefAssignment_2; }

		//ColumnDefinition
		public RuleCall getDefColumnDefinitionParserRuleCall_2_0() { return cDefColumnDefinitionParserRuleCall_2_0; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class ColumnDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ColumnDefinition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMandatoryColumnParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cOptionalColumnParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ColumnDefinition:
		//	MandatoryColumn | OptionalColumn;
		@Override public ParserRule getRule() { return rule; }

		//MandatoryColumn | OptionalColumn
		public Alternatives getAlternatives() { return cAlternatives; }

		//MandatoryColumn
		public RuleCall getMandatoryColumnParserRuleCall_0() { return cMandatoryColumnParserRuleCall_0; }

		//OptionalColumn
		public RuleCall getOptionalColumnParserRuleCall_1() { return cOptionalColumnParserRuleCall_1; }
	}

	public class MandatoryColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "MandatoryColumn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEqualsSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSpecAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpecColumnSpecParserRuleCall_1_0 = (RuleCall)cSpecAssignment_1.eContents().get(0);
		
		//MandatoryColumn:
		//	"=" spec=ColumnSpec;
		@Override public ParserRule getRule() { return rule; }

		//"=" spec=ColumnSpec
		public Group getGroup() { return cGroup; }

		//"="
		public Keyword getEqualsSignKeyword_0() { return cEqualsSignKeyword_0; }

		//spec=ColumnSpec
		public Assignment getSpecAssignment_1() { return cSpecAssignment_1; }

		//ColumnSpec
		public RuleCall getSpecColumnSpecParserRuleCall_1_0() { return cSpecColumnSpecParserRuleCall_1_0; }
	}

	public class OptionalColumnElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "OptionalColumn");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cQuestionMarkEqualsSignKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSpecAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cSpecColumnSpecParserRuleCall_1_0 = (RuleCall)cSpecAssignment_1.eContents().get(0);
		
		//OptionalColumn:
		//	"?=" spec=ColumnSpec;
		@Override public ParserRule getRule() { return rule; }

		//"?=" spec=ColumnSpec
		public Group getGroup() { return cGroup; }

		//"?="
		public Keyword getQuestionMarkEqualsSignKeyword_0() { return cQuestionMarkEqualsSignKeyword_0; }

		//spec=ColumnSpec
		public Assignment getSpecAssignment_1() { return cSpecAssignment_1; }

		//ColumnSpec
		public RuleCall getSpecColumnSpecParserRuleCall_1_0() { return cSpecColumnSpecParserRuleCall_1_0; }
	}

	public class ColumnSpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ColumnSpec");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRowSpecParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBlockSpecParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ColumnSpec:
		//	RowSpec | BlockSpec;
		@Override public ParserRule getRule() { return rule; }

		//RowSpec | BlockSpec
		public Alternatives getAlternatives() { return cAlternatives; }

		//RowSpec
		public RuleCall getRowSpecParserRuleCall_0() { return cRowSpecParserRuleCall_0; }

		//BlockSpec
		public RuleCall getBlockSpecParserRuleCall_1() { return cBlockSpecParserRuleCall_1; }
	}

	public class RowSpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RowSpec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cColumnKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cHeaderAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cHeaderSTRINGTerminalRuleCall_1_0 = (RuleCall)cHeaderAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cSyntaxAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSyntaxSyntaxParserRuleCall_3_0 = (RuleCall)cSyntaxAssignment_3.eContents().get(0);
		
		//RowSpec:
		//	"column" header=STRING ":" syntax=Syntax;
		@Override public ParserRule getRule() { return rule; }

		//"column" header=STRING ":" syntax=Syntax
		public Group getGroup() { return cGroup; }

		//"column"
		public Keyword getColumnKeyword_0() { return cColumnKeyword_0; }

		//header=STRING
		public Assignment getHeaderAssignment_1() { return cHeaderAssignment_1; }

		//STRING
		public RuleCall getHeaderSTRINGTerminalRuleCall_1_0() { return cHeaderSTRINGTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//syntax=Syntax
		public Assignment getSyntaxAssignment_3() { return cSyntaxAssignment_3; }

		//Syntax
		public RuleCall getSyntaxSyntaxParserRuleCall_3_0() { return cSyntaxSyntaxParserRuleCall_3_0; }
	}

	public class BlockSpecElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BlockSpec");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBlockKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cKindAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cKindBlockCrossReference_1_0 = (CrossReference)cKindAssignment_1.eContents().get(0);
		private final RuleCall cKindBlockIDTerminalRuleCall_1_0_1 = (RuleCall)cKindBlockCrossReference_1_0.eContents().get(1);
		
		//BlockSpec:
		//	"block" kind=[Block];
		@Override public ParserRule getRule() { return rule; }

		//"block" kind=[Block]
		public Group getGroup() { return cGroup; }

		//"block"
		public Keyword getBlockKeyword_0() { return cBlockKeyword_0; }

		//kind=[Block]
		public Assignment getKindAssignment_1() { return cKindAssignment_1; }

		//[Block]
		public CrossReference getKindBlockCrossReference_1_0() { return cKindBlockCrossReference_1_0; }

		//ID
		public RuleCall getKindBlockIDTerminalRuleCall_1_0_1() { return cKindBlockIDTerminalRuleCall_1_0_1; }
	}

	public class SyntaxElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Syntax");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cIs_idAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cIs_idIDKeyword_0_0 = (Keyword)cIs_idAssignment_0.eContents().get(0);
		private final Assignment cIs_stringAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cIs_stringSTRKeyword_1_0 = (Keyword)cIs_stringAssignment_1.eContents().get(0);
		private final Assignment cIs_intAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cIs_intINTKeyword_2_0 = (Keyword)cIs_intAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cCommercialAtKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cTokenAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTokenSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cTokenAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cRuleKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cRuleAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cRuleRuleCrossReference_4_1_0 = (CrossReference)cRuleAssignment_4_1.eContents().get(0);
		private final RuleCall cRuleRuleIDTerminalRuleCall_4_1_0_1 = (RuleCall)cRuleRuleCrossReference_4_1_0.eContents().get(1);
		
		//Syntax:
		//	is_id?="ID" | is_string?="STR" | is_int?="INT" | "@" token=STRING | "rule" rule=[Rule];
		@Override public ParserRule getRule() { return rule; }

		//is_id?="ID" | is_string?="STR" | is_int?="INT" | "@" token=STRING | "rule" rule=[Rule]
		public Alternatives getAlternatives() { return cAlternatives; }

		//is_id?="ID"
		public Assignment getIs_idAssignment_0() { return cIs_idAssignment_0; }

		//"ID"
		public Keyword getIs_idIDKeyword_0_0() { return cIs_idIDKeyword_0_0; }

		//is_string?="STR"
		public Assignment getIs_stringAssignment_1() { return cIs_stringAssignment_1; }

		//"STR"
		public Keyword getIs_stringSTRKeyword_1_0() { return cIs_stringSTRKeyword_1_0; }

		//is_int?="INT"
		public Assignment getIs_intAssignment_2() { return cIs_intAssignment_2; }

		//"INT"
		public Keyword getIs_intINTKeyword_2_0() { return cIs_intINTKeyword_2_0; }

		//"@" token=STRING
		public Group getGroup_3() { return cGroup_3; }

		//"@"
		public Keyword getCommercialAtKeyword_3_0() { return cCommercialAtKeyword_3_0; }

		//token=STRING
		public Assignment getTokenAssignment_3_1() { return cTokenAssignment_3_1; }

		//STRING
		public RuleCall getTokenSTRINGTerminalRuleCall_3_1_0() { return cTokenSTRINGTerminalRuleCall_3_1_0; }

		//"rule" rule=[Rule]
		public Group getGroup_4() { return cGroup_4; }

		//"rule"
		public Keyword getRuleKeyword_4_0() { return cRuleKeyword_4_0; }

		//rule=[Rule]
		public Assignment getRuleAssignment_4_1() { return cRuleAssignment_4_1; }

		//[Rule]
		public CrossReference getRuleRuleCrossReference_4_1_0() { return cRuleRuleCrossReference_4_1_0; }

		//ID
		public RuleCall getRuleRuleIDTerminalRuleCall_4_1_0_1() { return cRuleRuleIDTerminalRuleCall_4_1_0_1; }
	}

	public class RuleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Rule");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRuleKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAlternativesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAlternativesSyntaxSeqParserRuleCall_3_0 = (RuleCall)cAlternativesAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cVerticalLineKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cAlternativesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cAlternativesSyntaxSeqParserRuleCall_4_1_0 = (RuleCall)cAlternativesAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Rule:
		//	"rule" name=ID ":" alternatives+=SyntaxSeq ("|" alternatives+=SyntaxSeq)* ";";
		@Override public ParserRule getRule() { return rule; }

		//"rule" name=ID ":" alternatives+=SyntaxSeq ("|" alternatives+=SyntaxSeq)* ";"
		public Group getGroup() { return cGroup; }

		//"rule"
		public Keyword getRuleKeyword_0() { return cRuleKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//":"
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }

		//alternatives+=SyntaxSeq
		public Assignment getAlternativesAssignment_3() { return cAlternativesAssignment_3; }

		//SyntaxSeq
		public RuleCall getAlternativesSyntaxSeqParserRuleCall_3_0() { return cAlternativesSyntaxSeqParserRuleCall_3_0; }

		//("|" alternatives+=SyntaxSeq)*
		public Group getGroup_4() { return cGroup_4; }

		//"|"
		public Keyword getVerticalLineKeyword_4_0() { return cVerticalLineKeyword_4_0; }

		//alternatives+=SyntaxSeq
		public Assignment getAlternativesAssignment_4_1() { return cAlternativesAssignment_4_1; }

		//SyntaxSeq
		public RuleCall getAlternativesSyntaxSeqParserRuleCall_4_1_0() { return cAlternativesSyntaxSeqParserRuleCall_4_1_0; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class SyntaxSeqElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SyntaxSeq");
		private final Assignment cPartsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cPartsSyntaxParserRuleCall_0 = (RuleCall)cPartsAssignment.eContents().get(0);
		
		//SyntaxSeq:
		//	parts+=Syntax+;
		@Override public ParserRule getRule() { return rule; }

		//parts+=Syntax+
		public Assignment getPartsAssignment() { return cPartsAssignment; }

		//Syntax
		public RuleCall getPartsSyntaxParserRuleCall_0() { return cPartsSyntaxParserRuleCall_0; }
	}
	
	
	private final GrammarElements pGrammar;
	private final ElementElements pElement;
	private final BlockElements pBlock;
	private final ColumnElements pColumn;
	private final ColumnDefinitionElements pColumnDefinition;
	private final MandatoryColumnElements pMandatoryColumn;
	private final OptionalColumnElements pOptionalColumn;
	private final ColumnSpecElements pColumnSpec;
	private final RowSpecElements pRowSpec;
	private final BlockSpecElements pBlockSpec;
	private final SyntaxElements pSyntax;
	private final RuleElements pRule;
	private final SyntaxSeqElements pSyntaxSeq;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SpreadsheetGrammarLanguageGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pGrammar = new GrammarElements();
		this.pElement = new ElementElements();
		this.pBlock = new BlockElements();
		this.pColumn = new ColumnElements();
		this.pColumnDefinition = new ColumnDefinitionElements();
		this.pMandatoryColumn = new MandatoryColumnElements();
		this.pOptionalColumn = new OptionalColumnElements();
		this.pColumnSpec = new ColumnSpecElements();
		this.pRowSpec = new RowSpecElements();
		this.pBlockSpec = new BlockSpecElements();
		this.pSyntax = new SyntaxElements();
		this.pRule = new RuleElements();
		this.pSyntaxSeq = new SyntaxSeqElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.sdu.mmmi.sgl.SpreadsheetGrammarLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Grammar:
	//	"language" name=ID ":" root=[Block] ";" elements+=Element*;
	public GrammarElements getGrammarAccess() {
		return pGrammar;
	}
	
	public ParserRule getGrammarRule() {
		return getGrammarAccess().getRule();
	}

	//Element:
	//	Block | Rule;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}

	//Block:
	//	"block" name=ID "{" columns+=Column* "}";
	public BlockElements getBlockAccess() {
		return pBlock;
	}
	
	public ParserRule getBlockRule() {
		return getBlockAccess().getRule();
	}

	//Column:
	//	name=ID multiple?="*"? def=ColumnDefinition ";";
	public ColumnElements getColumnAccess() {
		return pColumn;
	}
	
	public ParserRule getColumnRule() {
		return getColumnAccess().getRule();
	}

	//ColumnDefinition:
	//	MandatoryColumn | OptionalColumn;
	public ColumnDefinitionElements getColumnDefinitionAccess() {
		return pColumnDefinition;
	}
	
	public ParserRule getColumnDefinitionRule() {
		return getColumnDefinitionAccess().getRule();
	}

	//MandatoryColumn:
	//	"=" spec=ColumnSpec;
	public MandatoryColumnElements getMandatoryColumnAccess() {
		return pMandatoryColumn;
	}
	
	public ParserRule getMandatoryColumnRule() {
		return getMandatoryColumnAccess().getRule();
	}

	//OptionalColumn:
	//	"?=" spec=ColumnSpec;
	public OptionalColumnElements getOptionalColumnAccess() {
		return pOptionalColumn;
	}
	
	public ParserRule getOptionalColumnRule() {
		return getOptionalColumnAccess().getRule();
	}

	//ColumnSpec:
	//	RowSpec | BlockSpec;
	public ColumnSpecElements getColumnSpecAccess() {
		return pColumnSpec;
	}
	
	public ParserRule getColumnSpecRule() {
		return getColumnSpecAccess().getRule();
	}

	//RowSpec:
	//	"column" header=STRING ":" syntax=Syntax;
	public RowSpecElements getRowSpecAccess() {
		return pRowSpec;
	}
	
	public ParserRule getRowSpecRule() {
		return getRowSpecAccess().getRule();
	}

	//BlockSpec:
	//	"block" kind=[Block];
	public BlockSpecElements getBlockSpecAccess() {
		return pBlockSpec;
	}
	
	public ParserRule getBlockSpecRule() {
		return getBlockSpecAccess().getRule();
	}

	//Syntax:
	//	is_id?="ID" | is_string?="STR" | is_int?="INT" | "@" token=STRING | "rule" rule=[Rule];
	public SyntaxElements getSyntaxAccess() {
		return pSyntax;
	}
	
	public ParserRule getSyntaxRule() {
		return getSyntaxAccess().getRule();
	}

	//Rule:
	//	"rule" name=ID ":" alternatives+=SyntaxSeq ("|" alternatives+=SyntaxSeq)* ";";
	public RuleElements getRuleAccess() {
		return pRule;
	}
	
	public ParserRule getRuleRule() {
		return getRuleAccess().getRule();
	}

	//SyntaxSeq:
	//	parts+=Syntax+;
	public SyntaxSeqElements getSyntaxSeqAccess() {
		return pSyntaxSeq;
	}
	
	public ParserRule getSyntaxSeqRule() {
		return getSyntaxSeqAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
