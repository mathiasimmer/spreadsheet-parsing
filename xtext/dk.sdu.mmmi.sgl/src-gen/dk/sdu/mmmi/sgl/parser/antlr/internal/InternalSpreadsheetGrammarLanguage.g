/*
* generated by Xtext
*/
grammar InternalSpreadsheetGrammarLanguage;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package dk.sdu.mmmi.sgl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package dk.sdu.mmmi.sgl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.sgl.services.SpreadsheetGrammarLanguageGrammarAccess;

}

@parser::members {

 	private SpreadsheetGrammarLanguageGrammarAccess grammarAccess;
 	
    public InternalSpreadsheetGrammarLanguageParser(TokenStream input, SpreadsheetGrammarLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Grammar";	
   	}
   	
   	@Override
   	protected SpreadsheetGrammarLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleGrammar
entryRuleGrammar returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGrammarRule()); }
	 iv_ruleGrammar=ruleGrammar 
	 { $current=$iv_ruleGrammar.current; } 
	 EOF 
;

// Rule Grammar
ruleGrammar returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='language' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getGrammarAccess().getLanguageKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getGrammarAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getGrammarRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getGrammarAccess().getColonKeyword_2());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getGrammarRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getGrammarAccess().getRootBlockCrossReference_3_0()); 
	}

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getGrammarAccess().getSemicolonKeyword_4());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getGrammarAccess().getElementsElementParserRuleCall_5_0()); 
	    }
		lv_elements_5_0=ruleElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGrammarRule());
	        }
       		add(
       			$current, 
       			"elements",
        		lv_elements_5_0, 
        		"Element");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	 iv_ruleElement=ruleElement 
	 { $current=$iv_ruleElement.current; } 
	 EOF 
;

// Rule Element
ruleElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getElementAccess().getBlockParserRuleCall_0()); 
    }
    this_Block_0=ruleBlock
    { 
        $current = $this_Block_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getElementAccess().getRuleParserRuleCall_1()); 
    }
    this_Rule_1=ruleRule
    { 
        $current = $this_Rule_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleBlock
entryRuleBlock returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBlockRule()); }
	 iv_ruleBlock=ruleBlock 
	 { $current=$iv_ruleBlock.current; } 
	 EOF 
;

// Rule Block
ruleBlock returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='block' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getBlockKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getBlockRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getBlockAccess().getColumnsColumnParserRuleCall_3_0()); 
	    }
		lv_columns_3_0=ruleColumn		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getBlockRule());
	        }
       		add(
       			$current, 
       			"columns",
        		lv_columns_3_0, 
        		"Column");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleColumn
entryRuleColumn returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getColumnRule()); }
	 iv_ruleColumn=ruleColumn 
	 { $current=$iv_ruleColumn.current; } 
	 EOF 
;

// Rule Column
ruleColumn returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getColumnRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)(
(
		lv_multiple_1_0=	'*' 
    {
        newLeafNode(lv_multiple_1_0, grammarAccess.getColumnAccess().getMultipleAsteriskKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getColumnRule());
	        }
       		setWithLastConsumed($current, "multiple", true, "*");
	    }

)
)?(
(
		{ 
	        newCompositeNode(grammarAccess.getColumnAccess().getDefColumnDefinitionParserRuleCall_2_0()); 
	    }
		lv_def_2_0=ruleColumnDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getColumnRule());
	        }
       		set(
       			$current, 
       			"def",
        		lv_def_2_0, 
        		"ColumnDefinition");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=';' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getSemicolonKeyword_3());
    }
)
;





// Entry rule entryRuleColumnDefinition
entryRuleColumnDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getColumnDefinitionRule()); }
	 iv_ruleColumnDefinition=ruleColumnDefinition 
	 { $current=$iv_ruleColumnDefinition.current; } 
	 EOF 
;

// Rule ColumnDefinition
ruleColumnDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getColumnDefinitionAccess().getMandatoryColumnParserRuleCall_0()); 
    }
    this_MandatoryColumn_0=ruleMandatoryColumn
    { 
        $current = $this_MandatoryColumn_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getColumnDefinitionAccess().getOptionalColumnParserRuleCall_1()); 
    }
    this_OptionalColumn_1=ruleOptionalColumn
    { 
        $current = $this_OptionalColumn_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleMandatoryColumn
entryRuleMandatoryColumn returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMandatoryColumnRule()); }
	 iv_ruleMandatoryColumn=ruleMandatoryColumn 
	 { $current=$iv_ruleMandatoryColumn.current; } 
	 EOF 
;

// Rule MandatoryColumn
ruleMandatoryColumn returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='=' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMandatoryColumnAccess().getEqualsSignKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMandatoryColumnAccess().getSpecColumnSpecParserRuleCall_1_0()); 
	    }
		lv_spec_1_0=ruleColumnSpec		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMandatoryColumnRule());
	        }
       		set(
       			$current, 
       			"spec",
        		lv_spec_1_0, 
        		"ColumnSpec");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleOptionalColumn
entryRuleOptionalColumn returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOptionalColumnRule()); }
	 iv_ruleOptionalColumn=ruleOptionalColumn 
	 { $current=$iv_ruleOptionalColumn.current; } 
	 EOF 
;

// Rule OptionalColumn
ruleOptionalColumn returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='?=' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getOptionalColumnAccess().getQuestionMarkEqualsSignKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOptionalColumnAccess().getSpecColumnSpecParserRuleCall_1_0()); 
	    }
		lv_spec_1_0=ruleColumnSpec		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOptionalColumnRule());
	        }
       		set(
       			$current, 
       			"spec",
        		lv_spec_1_0, 
        		"ColumnSpec");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleColumnSpec
entryRuleColumnSpec returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getColumnSpecRule()); }
	 iv_ruleColumnSpec=ruleColumnSpec 
	 { $current=$iv_ruleColumnSpec.current; } 
	 EOF 
;

// Rule ColumnSpec
ruleColumnSpec returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getColumnSpecAccess().getRowSpecParserRuleCall_0()); 
    }
    this_RowSpec_0=ruleRowSpec
    { 
        $current = $this_RowSpec_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getColumnSpecAccess().getBlockSpecParserRuleCall_1()); 
    }
    this_BlockSpec_1=ruleBlockSpec
    { 
        $current = $this_BlockSpec_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleRowSpec
entryRuleRowSpec returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRowSpecRule()); }
	 iv_ruleRowSpec=ruleRowSpec 
	 { $current=$iv_ruleRowSpec.current; } 
	 EOF 
;

// Rule RowSpec
ruleRowSpec returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='column' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRowSpecAccess().getColumnKeyword_0());
    }
(
(
		lv_header_1_0=RULE_STRING
		{
			newLeafNode(lv_header_1_0, grammarAccess.getRowSpecAccess().getHeaderSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRowSpecRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"header",
        		lv_header_1_0, 
        		"STRING");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRowSpecAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRowSpecAccess().getSyntaxSyntaxParserRuleCall_3_0()); 
	    }
		lv_syntax_3_0=ruleSyntax		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRowSpecRule());
	        }
       		set(
       			$current, 
       			"syntax",
        		lv_syntax_3_0, 
        		"Syntax");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleBlockSpec
entryRuleBlockSpec returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getBlockSpecRule()); }
	 iv_ruleBlockSpec=ruleBlockSpec 
	 { $current=$iv_ruleBlockSpec.current; } 
	 EOF 
;

// Rule BlockSpec
ruleBlockSpec returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='block' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getBlockSpecAccess().getBlockKeyword_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getBlockSpecRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getBlockSpecAccess().getKindBlockCrossReference_1_0()); 
	}

)
))
;





// Entry rule entryRuleSyntax
entryRuleSyntax returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSyntaxRule()); }
	 iv_ruleSyntax=ruleSyntax 
	 { $current=$iv_ruleSyntax.current; } 
	 EOF 
;

// Rule Syntax
ruleSyntax returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_is_id_0_0=	'ID' 
    {
        newLeafNode(lv_is_id_0_0, grammarAccess.getSyntaxAccess().getIs_idIDKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSyntaxRule());
	        }
       		setWithLastConsumed($current, "is_id", true, "ID");
	    }

)
)
    |(
(
		lv_is_string_1_0=	'STR' 
    {
        newLeafNode(lv_is_string_1_0, grammarAccess.getSyntaxAccess().getIs_stringSTRKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSyntaxRule());
	        }
       		setWithLastConsumed($current, "is_string", true, "STR");
	    }

)
)
    |(
(
		lv_is_int_2_0=	'INT' 
    {
        newLeafNode(lv_is_int_2_0, grammarAccess.getSyntaxAccess().getIs_intINTKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSyntaxRule());
	        }
       		setWithLastConsumed($current, "is_int", true, "INT");
	    }

)
)
    |(	otherlv_3='@' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSyntaxAccess().getCommercialAtKeyword_3_0());
    }
(
(
		lv_token_4_0=RULE_STRING
		{
			newLeafNode(lv_token_4_0, grammarAccess.getSyntaxAccess().getTokenSTRINGTerminalRuleCall_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSyntaxRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"token",
        		lv_token_4_0, 
        		"STRING");
	    }

)
))
    |(	otherlv_5='rule' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSyntaxAccess().getRuleKeyword_4_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getSyntaxRule());
	        }
        }
	otherlv_6=RULE_ID
	{
		newLeafNode(otherlv_6, grammarAccess.getSyntaxAccess().getRuleRuleCrossReference_4_1_0()); 
	}

)
)))
;





// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	 iv_ruleRule=ruleRule 
	 { $current=$iv_ruleRule.current; } 
	 EOF 
;

// Rule Rule
ruleRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='rule' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRuleRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2=':' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getColonKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getAlternativesSyntaxSeqParserRuleCall_3_0()); 
	    }
		lv_alternatives_3_0=ruleSyntaxSeq		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		add(
       			$current, 
       			"alternatives",
        		lv_alternatives_3_0, 
        		"SyntaxSeq");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='|' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getVerticalLineKeyword_4_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getAlternativesSyntaxSeqParserRuleCall_4_1_0()); 
	    }
		lv_alternatives_5_0=ruleSyntaxSeq		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		add(
       			$current, 
       			"alternatives",
        		lv_alternatives_5_0, 
        		"SyntaxSeq");
	        afterParserOrEnumRuleCall();
	    }

)
))*	otherlv_6=';' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleSyntaxSeq
entryRuleSyntaxSeq returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSyntaxSeqRule()); }
	 iv_ruleSyntaxSeq=ruleSyntaxSeq 
	 { $current=$iv_ruleSyntaxSeq.current; } 
	 EOF 
;

// Rule SyntaxSeq
ruleSyntaxSeq returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getSyntaxSeqAccess().getPartsSyntaxParserRuleCall_0()); 
	    }
		lv_parts_0_0=ruleSyntax		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSyntaxSeqRule());
	        }
       		add(
       			$current, 
       			"parts",
        		lv_parts_0_0, 
        		"Syntax");
	        afterParserOrEnumRuleCall();
	    }

)
)+
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


