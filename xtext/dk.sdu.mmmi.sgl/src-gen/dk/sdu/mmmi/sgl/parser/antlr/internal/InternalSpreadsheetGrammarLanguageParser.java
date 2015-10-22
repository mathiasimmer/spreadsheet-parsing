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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpreadsheetGrammarLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'language'", "':'", "';'", "'block'", "'{'", "'}'", "'*'", "'='", "'?='", "'column'", "'ID'", "'STR'", "'INT'", "'@'", "'rule'", "'|'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSpreadsheetGrammarLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpreadsheetGrammarLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpreadsheetGrammarLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g"; }



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



    // $ANTLR start "entryRuleGrammar"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:67:1: entryRuleGrammar returns [EObject current=null] : iv_ruleGrammar= ruleGrammar EOF ;
    public final EObject entryRuleGrammar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammar = null;


        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:68:2: (iv_ruleGrammar= ruleGrammar EOF )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:69:2: iv_ruleGrammar= ruleGrammar EOF
            {
             newCompositeNode(grammarAccess.getGrammarRule()); 
            pushFollow(FOLLOW_ruleGrammar_in_entryRuleGrammar75);
            iv_ruleGrammar=ruleGrammar();

            state._fsp--;

             current =iv_ruleGrammar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrammar85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:76:1: ruleGrammar returns [EObject current=null] : (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) )* ) ;
    public final EObject ruleGrammar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_elements_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:79:28: ( (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) )* ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:80:1: (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) )* )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:80:1: (otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) )* )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:80:3: otherlv_0= 'language' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ( (lv_elements_5_0= ruleElement ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleGrammar122); 

                	newLeafNode(otherlv_0, grammarAccess.getGrammarAccess().getLanguageKeyword_0());
                
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:85:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrammar139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGrammarAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGrammarRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleGrammar156); 

                	newLeafNode(otherlv_2, grammarAccess.getGrammarAccess().getColonKeyword_2());
                
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:106:1: ( (otherlv_3= RULE_ID ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:107:1: (otherlv_3= RULE_ID )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:107:1: (otherlv_3= RULE_ID )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:108:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGrammarRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGrammar176); 

            		newLeafNode(otherlv_3, grammarAccess.getGrammarAccess().getRootBlockCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleGrammar188); 

                	newLeafNode(otherlv_4, grammarAccess.getGrammarAccess().getSemicolonKeyword_4());
                
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:123:1: ( (lv_elements_5_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:124:1: (lv_elements_5_0= ruleElement )
            	    {
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:124:1: (lv_elements_5_0= ruleElement )
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:125:3: lv_elements_5_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGrammarAccess().getElementsElementParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleGrammar209);
            	    lv_elements_5_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGrammarRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_5_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleElement"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:149:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:150:2: (iv_ruleElement= ruleElement EOF )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:151:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement246);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement256); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:158:1: ruleElement returns [EObject current=null] : (this_Block_0= ruleBlock | this_Rule_1= ruleRule ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Block_0 = null;

        EObject this_Rule_1 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:161:28: ( (this_Block_0= ruleBlock | this_Rule_1= ruleRule ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:162:1: (this_Block_0= ruleBlock | this_Rule_1= ruleRule )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:162:1: (this_Block_0= ruleBlock | this_Rule_1= ruleRule )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:163:5: this_Block_0= ruleBlock
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getBlockParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBlock_in_ruleElement303);
                    this_Block_0=ruleBlock();

                    state._fsp--;

                     
                            current = this_Block_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:173:5: this_Rule_1= ruleRule
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getRuleParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRule_in_ruleElement330);
                    this_Rule_1=ruleRule();

                    state._fsp--;

                     
                            current = this_Rule_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleBlock"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:189:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:190:2: (iv_ruleBlock= ruleBlock EOF )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:191:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock365);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock375); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:198:1: ruleBlock returns [EObject current=null] : (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_columns_3_0= ruleColumn ) )* otherlv_4= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_columns_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:201:28: ( (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_columns_3_0= ruleColumn ) )* otherlv_4= '}' ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:202:1: (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_columns_3_0= ruleColumn ) )* otherlv_4= '}' )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:202:1: (otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_columns_3_0= ruleColumn ) )* otherlv_4= '}' )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:202:3: otherlv_0= 'block' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_columns_3_0= ruleColumn ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleBlock412); 

                	newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getBlockKeyword_0());
                
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:206:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:207:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:207:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:208:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBlock429); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleBlock446); 

                	newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2());
                
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:228:1: ( (lv_columns_3_0= ruleColumn ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:229:1: (lv_columns_3_0= ruleColumn )
            	    {
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:229:1: (lv_columns_3_0= ruleColumn )
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:230:3: lv_columns_3_0= ruleColumn
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBlockAccess().getColumnsColumnParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColumn_in_ruleBlock467);
            	    lv_columns_3_0=ruleColumn();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"columns",
            	            		lv_columns_3_0, 
            	            		"Column");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleBlock480); 

                	newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleColumn"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:258:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:259:2: (iv_ruleColumn= ruleColumn EOF )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:260:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn516);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn526); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:267:1: ruleColumn returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_multiple_1_0= '*' ) )? ( (lv_def_2_0= ruleColumnDefinition ) ) otherlv_3= ';' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_multiple_1_0=null;
        Token otherlv_3=null;
        EObject lv_def_2_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:270:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_multiple_1_0= '*' ) )? ( (lv_def_2_0= ruleColumnDefinition ) ) otherlv_3= ';' ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:271:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_multiple_1_0= '*' ) )? ( (lv_def_2_0= ruleColumnDefinition ) ) otherlv_3= ';' )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:271:1: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_multiple_1_0= '*' ) )? ( (lv_def_2_0= ruleColumnDefinition ) ) otherlv_3= ';' )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:271:2: ( (lv_name_0_0= RULE_ID ) ) ( (lv_multiple_1_0= '*' ) )? ( (lv_def_2_0= ruleColumnDefinition ) ) otherlv_3= ';'
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:271:2: ( (lv_name_0_0= RULE_ID ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:272:1: (lv_name_0_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:272:1: (lv_name_0_0= RULE_ID )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:273:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleColumn568); 

            			newLeafNode(lv_name_0_0, grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getColumnRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:289:2: ( (lv_multiple_1_0= '*' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:290:1: (lv_multiple_1_0= '*' )
                    {
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:290:1: (lv_multiple_1_0= '*' )
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:291:3: lv_multiple_1_0= '*'
                    {
                    lv_multiple_1_0=(Token)match(input,17,FOLLOW_17_in_ruleColumn591); 

                            newLeafNode(lv_multiple_1_0, grammarAccess.getColumnAccess().getMultipleAsteriskKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getColumnRule());
                    	        }
                           		setWithLastConsumed(current, "multiple", true, "*");
                    	    

                    }


                    }
                    break;

            }

            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:304:3: ( (lv_def_2_0= ruleColumnDefinition ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:305:1: (lv_def_2_0= ruleColumnDefinition )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:305:1: (lv_def_2_0= ruleColumnDefinition )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:306:3: lv_def_2_0= ruleColumnDefinition
            {
             
            	        newCompositeNode(grammarAccess.getColumnAccess().getDefColumnDefinitionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleColumnDefinition_in_ruleColumn626);
            lv_def_2_0=ruleColumnDefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColumnRule());
            	        }
                   		set(
                   			current, 
                   			"def",
                    		lv_def_2_0, 
                    		"ColumnDefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleColumn638); 

                	newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleColumnDefinition"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:334:1: entryRuleColumnDefinition returns [EObject current=null] : iv_ruleColumnDefinition= ruleColumnDefinition EOF ;
    public final EObject entryRuleColumnDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnDefinition = null;


        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:335:2: (iv_ruleColumnDefinition= ruleColumnDefinition EOF )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:336:2: iv_ruleColumnDefinition= ruleColumnDefinition EOF
            {
             newCompositeNode(grammarAccess.getColumnDefinitionRule()); 
            pushFollow(FOLLOW_ruleColumnDefinition_in_entryRuleColumnDefinition674);
            iv_ruleColumnDefinition=ruleColumnDefinition();

            state._fsp--;

             current =iv_ruleColumnDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDefinition684); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnDefinition"


    // $ANTLR start "ruleColumnDefinition"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:343:1: ruleColumnDefinition returns [EObject current=null] : (this_MandatoryColumn_0= ruleMandatoryColumn | this_OptionalColumn_1= ruleOptionalColumn ) ;
    public final EObject ruleColumnDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_MandatoryColumn_0 = null;

        EObject this_OptionalColumn_1 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:346:28: ( (this_MandatoryColumn_0= ruleMandatoryColumn | this_OptionalColumn_1= ruleOptionalColumn ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:347:1: (this_MandatoryColumn_0= ruleMandatoryColumn | this_OptionalColumn_1= ruleOptionalColumn )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:347:1: (this_MandatoryColumn_0= ruleMandatoryColumn | this_OptionalColumn_1= ruleOptionalColumn )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:348:5: this_MandatoryColumn_0= ruleMandatoryColumn
                    {
                     
                            newCompositeNode(grammarAccess.getColumnDefinitionAccess().getMandatoryColumnParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleMandatoryColumn_in_ruleColumnDefinition731);
                    this_MandatoryColumn_0=ruleMandatoryColumn();

                    state._fsp--;

                     
                            current = this_MandatoryColumn_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:358:5: this_OptionalColumn_1= ruleOptionalColumn
                    {
                     
                            newCompositeNode(grammarAccess.getColumnDefinitionAccess().getOptionalColumnParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOptionalColumn_in_ruleColumnDefinition758);
                    this_OptionalColumn_1=ruleOptionalColumn();

                    state._fsp--;

                     
                            current = this_OptionalColumn_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnDefinition"


    // $ANTLR start "entryRuleMandatoryColumn"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:374:1: entryRuleMandatoryColumn returns [EObject current=null] : iv_ruleMandatoryColumn= ruleMandatoryColumn EOF ;
    public final EObject entryRuleMandatoryColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryColumn = null;


        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:375:2: (iv_ruleMandatoryColumn= ruleMandatoryColumn EOF )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:376:2: iv_ruleMandatoryColumn= ruleMandatoryColumn EOF
            {
             newCompositeNode(grammarAccess.getMandatoryColumnRule()); 
            pushFollow(FOLLOW_ruleMandatoryColumn_in_entryRuleMandatoryColumn793);
            iv_ruleMandatoryColumn=ruleMandatoryColumn();

            state._fsp--;

             current =iv_ruleMandatoryColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatoryColumn803); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMandatoryColumn"


    // $ANTLR start "ruleMandatoryColumn"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:383:1: ruleMandatoryColumn returns [EObject current=null] : (otherlv_0= '=' ( (lv_spec_1_0= ruleColumnSpec ) ) ) ;
    public final EObject ruleMandatoryColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_spec_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:386:28: ( (otherlv_0= '=' ( (lv_spec_1_0= ruleColumnSpec ) ) ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:387:1: (otherlv_0= '=' ( (lv_spec_1_0= ruleColumnSpec ) ) )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:387:1: (otherlv_0= '=' ( (lv_spec_1_0= ruleColumnSpec ) ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:387:3: otherlv_0= '=' ( (lv_spec_1_0= ruleColumnSpec ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleMandatoryColumn840); 

                	newLeafNode(otherlv_0, grammarAccess.getMandatoryColumnAccess().getEqualsSignKeyword_0());
                
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:391:1: ( (lv_spec_1_0= ruleColumnSpec ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:392:1: (lv_spec_1_0= ruleColumnSpec )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:392:1: (lv_spec_1_0= ruleColumnSpec )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:393:3: lv_spec_1_0= ruleColumnSpec
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryColumnAccess().getSpecColumnSpecParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColumnSpec_in_ruleMandatoryColumn861);
            lv_spec_1_0=ruleColumnSpec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMandatoryColumnRule());
            	        }
                   		set(
                   			current, 
                   			"spec",
                    		lv_spec_1_0, 
                    		"ColumnSpec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMandatoryColumn"


    // $ANTLR start "entryRuleOptionalColumn"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:417:1: entryRuleOptionalColumn returns [EObject current=null] : iv_ruleOptionalColumn= ruleOptionalColumn EOF ;
    public final EObject entryRuleOptionalColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalColumn = null;


        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:418:2: (iv_ruleOptionalColumn= ruleOptionalColumn EOF )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:419:2: iv_ruleOptionalColumn= ruleOptionalColumn EOF
            {
             newCompositeNode(grammarAccess.getOptionalColumnRule()); 
            pushFollow(FOLLOW_ruleOptionalColumn_in_entryRuleOptionalColumn897);
            iv_ruleOptionalColumn=ruleOptionalColumn();

            state._fsp--;

             current =iv_ruleOptionalColumn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalColumn907); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionalColumn"


    // $ANTLR start "ruleOptionalColumn"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:426:1: ruleOptionalColumn returns [EObject current=null] : (otherlv_0= '?=' ( (lv_spec_1_0= ruleColumnSpec ) ) ) ;
    public final EObject ruleOptionalColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_spec_1_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:429:28: ( (otherlv_0= '?=' ( (lv_spec_1_0= ruleColumnSpec ) ) ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:430:1: (otherlv_0= '?=' ( (lv_spec_1_0= ruleColumnSpec ) ) )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:430:1: (otherlv_0= '?=' ( (lv_spec_1_0= ruleColumnSpec ) ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:430:3: otherlv_0= '?=' ( (lv_spec_1_0= ruleColumnSpec ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleOptionalColumn944); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalColumnAccess().getQuestionMarkEqualsSignKeyword_0());
                
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:434:1: ( (lv_spec_1_0= ruleColumnSpec ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:435:1: (lv_spec_1_0= ruleColumnSpec )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:435:1: (lv_spec_1_0= ruleColumnSpec )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:436:3: lv_spec_1_0= ruleColumnSpec
            {
             
            	        newCompositeNode(grammarAccess.getOptionalColumnAccess().getSpecColumnSpecParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleColumnSpec_in_ruleOptionalColumn965);
            lv_spec_1_0=ruleColumnSpec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalColumnRule());
            	        }
                   		set(
                   			current, 
                   			"spec",
                    		lv_spec_1_0, 
                    		"ColumnSpec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionalColumn"


    // $ANTLR start "entryRuleColumnSpec"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:460:1: entryRuleColumnSpec returns [EObject current=null] : iv_ruleColumnSpec= ruleColumnSpec EOF ;
    public final EObject entryRuleColumnSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumnSpec = null;


        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:461:2: (iv_ruleColumnSpec= ruleColumnSpec EOF )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:462:2: iv_ruleColumnSpec= ruleColumnSpec EOF
            {
             newCompositeNode(grammarAccess.getColumnSpecRule()); 
            pushFollow(FOLLOW_ruleColumnSpec_in_entryRuleColumnSpec1001);
            iv_ruleColumnSpec=ruleColumnSpec();

            state._fsp--;

             current =iv_ruleColumnSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnSpec1011); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColumnSpec"


    // $ANTLR start "ruleColumnSpec"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:469:1: ruleColumnSpec returns [EObject current=null] : (this_RowSpec_0= ruleRowSpec | this_BlockSpec_1= ruleBlockSpec ) ;
    public final EObject ruleColumnSpec() throws RecognitionException {
        EObject current = null;

        EObject this_RowSpec_0 = null;

        EObject this_BlockSpec_1 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:472:28: ( (this_RowSpec_0= ruleRowSpec | this_BlockSpec_1= ruleBlockSpec ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:473:1: (this_RowSpec_0= ruleRowSpec | this_BlockSpec_1= ruleBlockSpec )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:473:1: (this_RowSpec_0= ruleRowSpec | this_BlockSpec_1= ruleBlockSpec )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:474:5: this_RowSpec_0= ruleRowSpec
                    {
                     
                            newCompositeNode(grammarAccess.getColumnSpecAccess().getRowSpecParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRowSpec_in_ruleColumnSpec1058);
                    this_RowSpec_0=ruleRowSpec();

                    state._fsp--;

                     
                            current = this_RowSpec_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:484:5: this_BlockSpec_1= ruleBlockSpec
                    {
                     
                            newCompositeNode(grammarAccess.getColumnSpecAccess().getBlockSpecParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBlockSpec_in_ruleColumnSpec1085);
                    this_BlockSpec_1=ruleBlockSpec();

                    state._fsp--;

                     
                            current = this_BlockSpec_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColumnSpec"


    // $ANTLR start "entryRuleRowSpec"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:500:1: entryRuleRowSpec returns [EObject current=null] : iv_ruleRowSpec= ruleRowSpec EOF ;
    public final EObject entryRuleRowSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRowSpec = null;


        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:501:2: (iv_ruleRowSpec= ruleRowSpec EOF )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:502:2: iv_ruleRowSpec= ruleRowSpec EOF
            {
             newCompositeNode(grammarAccess.getRowSpecRule()); 
            pushFollow(FOLLOW_ruleRowSpec_in_entryRuleRowSpec1120);
            iv_ruleRowSpec=ruleRowSpec();

            state._fsp--;

             current =iv_ruleRowSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRowSpec1130); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRowSpec"


    // $ANTLR start "ruleRowSpec"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:509:1: ruleRowSpec returns [EObject current=null] : (otherlv_0= 'column' ( (lv_header_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_syntax_3_0= ruleSyntax ) ) ) ;
    public final EObject ruleRowSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_header_1_0=null;
        Token otherlv_2=null;
        EObject lv_syntax_3_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:512:28: ( (otherlv_0= 'column' ( (lv_header_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_syntax_3_0= ruleSyntax ) ) ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:513:1: (otherlv_0= 'column' ( (lv_header_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_syntax_3_0= ruleSyntax ) ) )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:513:1: (otherlv_0= 'column' ( (lv_header_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_syntax_3_0= ruleSyntax ) ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:513:3: otherlv_0= 'column' ( (lv_header_1_0= RULE_STRING ) ) otherlv_2= ':' ( (lv_syntax_3_0= ruleSyntax ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleRowSpec1167); 

                	newLeafNode(otherlv_0, grammarAccess.getRowSpecAccess().getColumnKeyword_0());
                
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:517:1: ( (lv_header_1_0= RULE_STRING ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:518:1: (lv_header_1_0= RULE_STRING )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:518:1: (lv_header_1_0= RULE_STRING )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:519:3: lv_header_1_0= RULE_STRING
            {
            lv_header_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRowSpec1184); 

            			newLeafNode(lv_header_1_0, grammarAccess.getRowSpecAccess().getHeaderSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRowSpecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"header",
                    		lv_header_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRowSpec1201); 

                	newLeafNode(otherlv_2, grammarAccess.getRowSpecAccess().getColonKeyword_2());
                
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:539:1: ( (lv_syntax_3_0= ruleSyntax ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:540:1: (lv_syntax_3_0= ruleSyntax )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:540:1: (lv_syntax_3_0= ruleSyntax )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:541:3: lv_syntax_3_0= ruleSyntax
            {
             
            	        newCompositeNode(grammarAccess.getRowSpecAccess().getSyntaxSyntaxParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSyntax_in_ruleRowSpec1222);
            lv_syntax_3_0=ruleSyntax();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRowSpecRule());
            	        }
                   		set(
                   			current, 
                   			"syntax",
                    		lv_syntax_3_0, 
                    		"Syntax");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRowSpec"


    // $ANTLR start "entryRuleBlockSpec"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:565:1: entryRuleBlockSpec returns [EObject current=null] : iv_ruleBlockSpec= ruleBlockSpec EOF ;
    public final EObject entryRuleBlockSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlockSpec = null;


        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:566:2: (iv_ruleBlockSpec= ruleBlockSpec EOF )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:567:2: iv_ruleBlockSpec= ruleBlockSpec EOF
            {
             newCompositeNode(grammarAccess.getBlockSpecRule()); 
            pushFollow(FOLLOW_ruleBlockSpec_in_entryRuleBlockSpec1258);
            iv_ruleBlockSpec=ruleBlockSpec();

            state._fsp--;

             current =iv_ruleBlockSpec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockSpec1268); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlockSpec"


    // $ANTLR start "ruleBlockSpec"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:574:1: ruleBlockSpec returns [EObject current=null] : (otherlv_0= 'block' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleBlockSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:577:28: ( (otherlv_0= 'block' ( (otherlv_1= RULE_ID ) ) ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:578:1: (otherlv_0= 'block' ( (otherlv_1= RULE_ID ) ) )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:578:1: (otherlv_0= 'block' ( (otherlv_1= RULE_ID ) ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:578:3: otherlv_0= 'block' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleBlockSpec1305); 

                	newLeafNode(otherlv_0, grammarAccess.getBlockSpecAccess().getBlockKeyword_0());
                
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:582:1: ( (otherlv_1= RULE_ID ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:583:1: (otherlv_1= RULE_ID )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:583:1: (otherlv_1= RULE_ID )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:584:3: otherlv_1= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getBlockSpecRule());
            	        }
                    
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBlockSpec1325); 

            		newLeafNode(otherlv_1, grammarAccess.getBlockSpecAccess().getKindBlockCrossReference_1_0()); 
            	

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlockSpec"


    // $ANTLR start "entryRuleSyntax"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:603:1: entryRuleSyntax returns [EObject current=null] : iv_ruleSyntax= ruleSyntax EOF ;
    public final EObject entryRuleSyntax() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyntax = null;


        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:604:2: (iv_ruleSyntax= ruleSyntax EOF )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:605:2: iv_ruleSyntax= ruleSyntax EOF
            {
             newCompositeNode(grammarAccess.getSyntaxRule()); 
            pushFollow(FOLLOW_ruleSyntax_in_entryRuleSyntax1361);
            iv_ruleSyntax=ruleSyntax();

            state._fsp--;

             current =iv_ruleSyntax; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntax1371); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSyntax"


    // $ANTLR start "ruleSyntax"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:612:1: ruleSyntax returns [EObject current=null] : ( ( (lv_is_id_0_0= 'ID' ) ) | ( (lv_is_string_1_0= 'STR' ) ) | ( (lv_is_int_2_0= 'INT' ) ) | (otherlv_3= '@' ( (lv_token_4_0= RULE_STRING ) ) ) | (otherlv_5= 'rule' ( (otherlv_6= RULE_ID ) ) ) ) ;
    public final EObject ruleSyntax() throws RecognitionException {
        EObject current = null;

        Token lv_is_id_0_0=null;
        Token lv_is_string_1_0=null;
        Token lv_is_int_2_0=null;
        Token otherlv_3=null;
        Token lv_token_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:615:28: ( ( ( (lv_is_id_0_0= 'ID' ) ) | ( (lv_is_string_1_0= 'STR' ) ) | ( (lv_is_int_2_0= 'INT' ) ) | (otherlv_3= '@' ( (lv_token_4_0= RULE_STRING ) ) ) | (otherlv_5= 'rule' ( (otherlv_6= RULE_ID ) ) ) ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:616:1: ( ( (lv_is_id_0_0= 'ID' ) ) | ( (lv_is_string_1_0= 'STR' ) ) | ( (lv_is_int_2_0= 'INT' ) ) | (otherlv_3= '@' ( (lv_token_4_0= RULE_STRING ) ) ) | (otherlv_5= 'rule' ( (otherlv_6= RULE_ID ) ) ) )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:616:1: ( ( (lv_is_id_0_0= 'ID' ) ) | ( (lv_is_string_1_0= 'STR' ) ) | ( (lv_is_int_2_0= 'INT' ) ) | (otherlv_3= '@' ( (lv_token_4_0= RULE_STRING ) ) ) | (otherlv_5= 'rule' ( (otherlv_6= RULE_ID ) ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt7=1;
                }
                break;
            case 22:
                {
                alt7=2;
                }
                break;
            case 23:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            case 25:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:616:2: ( (lv_is_id_0_0= 'ID' ) )
                    {
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:616:2: ( (lv_is_id_0_0= 'ID' ) )
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:617:1: (lv_is_id_0_0= 'ID' )
                    {
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:617:1: (lv_is_id_0_0= 'ID' )
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:618:3: lv_is_id_0_0= 'ID'
                    {
                    lv_is_id_0_0=(Token)match(input,21,FOLLOW_21_in_ruleSyntax1414); 

                            newLeafNode(lv_is_id_0_0, grammarAccess.getSyntaxAccess().getIs_idIDKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSyntaxRule());
                    	        }
                           		setWithLastConsumed(current, "is_id", true, "ID");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:632:6: ( (lv_is_string_1_0= 'STR' ) )
                    {
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:632:6: ( (lv_is_string_1_0= 'STR' ) )
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:633:1: (lv_is_string_1_0= 'STR' )
                    {
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:633:1: (lv_is_string_1_0= 'STR' )
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:634:3: lv_is_string_1_0= 'STR'
                    {
                    lv_is_string_1_0=(Token)match(input,22,FOLLOW_22_in_ruleSyntax1451); 

                            newLeafNode(lv_is_string_1_0, grammarAccess.getSyntaxAccess().getIs_stringSTRKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSyntaxRule());
                    	        }
                           		setWithLastConsumed(current, "is_string", true, "STR");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:648:6: ( (lv_is_int_2_0= 'INT' ) )
                    {
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:648:6: ( (lv_is_int_2_0= 'INT' ) )
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:649:1: (lv_is_int_2_0= 'INT' )
                    {
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:649:1: (lv_is_int_2_0= 'INT' )
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:650:3: lv_is_int_2_0= 'INT'
                    {
                    lv_is_int_2_0=(Token)match(input,23,FOLLOW_23_in_ruleSyntax1488); 

                            newLeafNode(lv_is_int_2_0, grammarAccess.getSyntaxAccess().getIs_intINTKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSyntaxRule());
                    	        }
                           		setWithLastConsumed(current, "is_int", true, "INT");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:664:6: (otherlv_3= '@' ( (lv_token_4_0= RULE_STRING ) ) )
                    {
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:664:6: (otherlv_3= '@' ( (lv_token_4_0= RULE_STRING ) ) )
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:664:8: otherlv_3= '@' ( (lv_token_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleSyntax1520); 

                        	newLeafNode(otherlv_3, grammarAccess.getSyntaxAccess().getCommercialAtKeyword_3_0());
                        
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:668:1: ( (lv_token_4_0= RULE_STRING ) )
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:669:1: (lv_token_4_0= RULE_STRING )
                    {
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:669:1: (lv_token_4_0= RULE_STRING )
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:670:3: lv_token_4_0= RULE_STRING
                    {
                    lv_token_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSyntax1537); 

                    			newLeafNode(lv_token_4_0, grammarAccess.getSyntaxAccess().getTokenSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSyntaxRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"token",
                            		lv_token_4_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:687:6: (otherlv_5= 'rule' ( (otherlv_6= RULE_ID ) ) )
                    {
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:687:6: (otherlv_5= 'rule' ( (otherlv_6= RULE_ID ) ) )
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:687:8: otherlv_5= 'rule' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleSyntax1562); 

                        	newLeafNode(otherlv_5, grammarAccess.getSyntaxAccess().getRuleKeyword_4_0());
                        
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:691:1: ( (otherlv_6= RULE_ID ) )
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:692:1: (otherlv_6= RULE_ID )
                    {
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:692:1: (otherlv_6= RULE_ID )
                    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:693:3: otherlv_6= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSyntaxRule());
                    	        }
                            
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSyntax1582); 

                    		newLeafNode(otherlv_6, grammarAccess.getSyntaxAccess().getRuleRuleCrossReference_4_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSyntax"


    // $ANTLR start "entryRuleRule"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:712:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:713:2: (iv_ruleRule= ruleRule EOF )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:714:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule1619);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule1629); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:721:1: ruleRule returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_alternatives_3_0= ruleSyntaxSeq ) ) (otherlv_4= '|' ( (lv_alternatives_5_0= ruleSyntaxSeq ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_alternatives_3_0 = null;

        EObject lv_alternatives_5_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:724:28: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_alternatives_3_0= ruleSyntaxSeq ) ) (otherlv_4= '|' ( (lv_alternatives_5_0= ruleSyntaxSeq ) ) )* otherlv_6= ';' ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:725:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_alternatives_3_0= ruleSyntaxSeq ) ) (otherlv_4= '|' ( (lv_alternatives_5_0= ruleSyntaxSeq ) ) )* otherlv_6= ';' )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:725:1: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_alternatives_3_0= ruleSyntaxSeq ) ) (otherlv_4= '|' ( (lv_alternatives_5_0= ruleSyntaxSeq ) ) )* otherlv_6= ';' )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:725:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_alternatives_3_0= ruleSyntaxSeq ) ) (otherlv_4= '|' ( (lv_alternatives_5_0= ruleSyntaxSeq ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleRule1666); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getRuleKeyword_0());
                
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:729:1: ( (lv_name_1_0= RULE_ID ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:730:1: (lv_name_1_0= RULE_ID )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:730:1: (lv_name_1_0= RULE_ID )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:731:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRule1683); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRuleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRule1700); 

                	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getColonKeyword_2());
                
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:751:1: ( (lv_alternatives_3_0= ruleSyntaxSeq ) )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:752:1: (lv_alternatives_3_0= ruleSyntaxSeq )
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:752:1: (lv_alternatives_3_0= ruleSyntaxSeq )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:753:3: lv_alternatives_3_0= ruleSyntaxSeq
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getAlternativesSyntaxSeqParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSyntaxSeq_in_ruleRule1721);
            lv_alternatives_3_0=ruleSyntaxSeq();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		add(
                   			current, 
                   			"alternatives",
                    		lv_alternatives_3_0, 
                    		"SyntaxSeq");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:769:2: (otherlv_4= '|' ( (lv_alternatives_5_0= ruleSyntaxSeq ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:769:4: otherlv_4= '|' ( (lv_alternatives_5_0= ruleSyntaxSeq ) )
            	    {
            	    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleRule1734); 

            	        	newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getVerticalLineKeyword_4_0());
            	        
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:773:1: ( (lv_alternatives_5_0= ruleSyntaxSeq ) )
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:774:1: (lv_alternatives_5_0= ruleSyntaxSeq )
            	    {
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:774:1: (lv_alternatives_5_0= ruleSyntaxSeq )
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:775:3: lv_alternatives_5_0= ruleSyntaxSeq
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getAlternativesSyntaxSeqParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSyntaxSeq_in_ruleRule1755);
            	    lv_alternatives_5_0=ruleSyntaxSeq();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"alternatives",
            	            		lv_alternatives_5_0, 
            	            		"SyntaxSeq");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleRule1769); 

                	newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSyntaxSeq"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:803:1: entryRuleSyntaxSeq returns [EObject current=null] : iv_ruleSyntaxSeq= ruleSyntaxSeq EOF ;
    public final EObject entryRuleSyntaxSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyntaxSeq = null;


        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:804:2: (iv_ruleSyntaxSeq= ruleSyntaxSeq EOF )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:805:2: iv_ruleSyntaxSeq= ruleSyntaxSeq EOF
            {
             newCompositeNode(grammarAccess.getSyntaxSeqRule()); 
            pushFollow(FOLLOW_ruleSyntaxSeq_in_entryRuleSyntaxSeq1805);
            iv_ruleSyntaxSeq=ruleSyntaxSeq();

            state._fsp--;

             current =iv_ruleSyntaxSeq; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntaxSeq1815); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSyntaxSeq"


    // $ANTLR start "ruleSyntaxSeq"
    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:812:1: ruleSyntaxSeq returns [EObject current=null] : ( (lv_parts_0_0= ruleSyntax ) )+ ;
    public final EObject ruleSyntaxSeq() throws RecognitionException {
        EObject current = null;

        EObject lv_parts_0_0 = null;


         enterRule(); 
            
        try {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:815:28: ( ( (lv_parts_0_0= ruleSyntax ) )+ )
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:816:1: ( (lv_parts_0_0= ruleSyntax ) )+
            {
            // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:816:1: ( (lv_parts_0_0= ruleSyntax ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=21 && LA9_0<=25)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:817:1: (lv_parts_0_0= ruleSyntax )
            	    {
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:817:1: (lv_parts_0_0= ruleSyntax )
            	    // ../dk.sdu.mmmi.sgl/src-gen/dk/sdu/mmmi/sgl/parser/antlr/internal/InternalSpreadsheetGrammarLanguage.g:818:3: lv_parts_0_0= ruleSyntax
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSyntaxSeqAccess().getPartsSyntaxParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSyntax_in_ruleSyntaxSeq1860);
            	    lv_parts_0_0=ruleSyntax();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSyntaxSeqRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parts",
            	            		lv_parts_0_0, 
            	            		"Syntax");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSyntaxSeq"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleGrammar_in_entryRuleGrammar75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrammar85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleGrammar122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrammar139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleGrammar156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGrammar176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGrammar188 = new BitSet(new long[]{0x0000000002004002L});
    public static final BitSet FOLLOW_ruleElement_in_ruleGrammar209 = new BitSet(new long[]{0x0000000002004002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_ruleElement303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleElement330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBlock412 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBlock429 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBlock446 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleColumn_in_ruleBlock467 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleBlock480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleColumn568 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_17_in_ruleColumn591 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_ruleColumnDefinition_in_ruleColumn626 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleColumn638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDefinition_in_entryRuleColumnDefinition674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDefinition684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryColumn_in_ruleColumnDefinition731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalColumn_in_ruleColumnDefinition758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryColumn_in_entryRuleMandatoryColumn793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatoryColumn803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMandatoryColumn840 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_ruleColumnSpec_in_ruleMandatoryColumn861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalColumn_in_entryRuleOptionalColumn897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalColumn907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOptionalColumn944 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_ruleColumnSpec_in_ruleOptionalColumn965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnSpec_in_entryRuleColumnSpec1001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnSpec1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRowSpec_in_ruleColumnSpec1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockSpec_in_ruleColumnSpec1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRowSpec_in_entryRuleRowSpec1120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRowSpec1130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRowSpec1167 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRowSpec1184 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRowSpec1201 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_ruleSyntax_in_ruleRowSpec1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockSpec_in_entryRuleBlockSpec1258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockSpec1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBlockSpec1305 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBlockSpec1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_entryRuleSyntax1361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntax1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSyntax1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSyntax1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleSyntax1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSyntax1520 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSyntax1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleSyntax1562 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSyntax1582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule1619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRule1666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRule1683 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRule1700 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_ruleSyntaxSeq_in_ruleRule1721 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_26_in_ruleRule1734 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_ruleSyntaxSeq_in_ruleRule1755 = new BitSet(new long[]{0x0000000004002000L});
    public static final BitSet FOLLOW_13_in_ruleRule1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntaxSeq_in_entryRuleSyntaxSeq1805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntaxSeq1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_ruleSyntaxSeq1860 = new BitSet(new long[]{0x0000000003E00002L});

}