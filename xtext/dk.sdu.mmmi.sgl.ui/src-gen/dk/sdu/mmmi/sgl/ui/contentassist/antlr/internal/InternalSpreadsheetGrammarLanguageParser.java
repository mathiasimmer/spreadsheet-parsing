package dk.sdu.mmmi.sgl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.sgl.services.SpreadsheetGrammarLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpreadsheetGrammarLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'language'", "':'", "';'", "'block'", "'{'", "'}'", "'='", "'?='", "'column'", "'@'", "'rule'", "'|'", "'*'", "'ID'", "'STR'", "'INT'"
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
    public String getGrammarFileName() { return "../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g"; }


     
     	private SpreadsheetGrammarLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SpreadsheetGrammarLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleGrammar"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:60:1: entryRuleGrammar : ruleGrammar EOF ;
    public final void entryRuleGrammar() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:61:1: ( ruleGrammar EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:62:1: ruleGrammar EOF
            {
             before(grammarAccess.getGrammarRule()); 
            pushFollow(FOLLOW_ruleGrammar_in_entryRuleGrammar61);
            ruleGrammar();

            state._fsp--;

             after(grammarAccess.getGrammarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrammar68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:69:1: ruleGrammar : ( ( rule__Grammar__Group__0 ) ) ;
    public final void ruleGrammar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:73:2: ( ( ( rule__Grammar__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:74:1: ( ( rule__Grammar__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:74:1: ( ( rule__Grammar__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:75:1: ( rule__Grammar__Group__0 )
            {
             before(grammarAccess.getGrammarAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:76:1: ( rule__Grammar__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:76:2: rule__Grammar__Group__0
            {
            pushFollow(FOLLOW_rule__Grammar__Group__0_in_ruleGrammar94);
            rule__Grammar__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleElement"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:88:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:89:1: ( ruleElement EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:90:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement121);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:97:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:101:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:102:1: ( ( rule__Element__Alternatives ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:102:1: ( ( rule__Element__Alternatives ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:103:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:104:1: ( rule__Element__Alternatives )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:104:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement154);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleBlock"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:116:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:117:1: ( ruleBlock EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:118:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_ruleBlock_in_entryRuleBlock181);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlock188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:125:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:129:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:130:1: ( ( rule__Block__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:130:1: ( ( rule__Block__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:131:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:132:1: ( rule__Block__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:132:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleBlock214);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleColumn"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:144:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:145:1: ( ruleColumn EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:146:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_ruleColumn_in_entryRuleColumn241);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumn248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:153:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:157:2: ( ( ( rule__Column__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:158:1: ( ( rule__Column__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:158:1: ( ( rule__Column__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:159:1: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:160:1: ( rule__Column__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:160:2: rule__Column__Group__0
            {
            pushFollow(FOLLOW_rule__Column__Group__0_in_ruleColumn274);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleColumnDefinition"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:172:1: entryRuleColumnDefinition : ruleColumnDefinition EOF ;
    public final void entryRuleColumnDefinition() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:173:1: ( ruleColumnDefinition EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:174:1: ruleColumnDefinition EOF
            {
             before(grammarAccess.getColumnDefinitionRule()); 
            pushFollow(FOLLOW_ruleColumnDefinition_in_entryRuleColumnDefinition301);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getColumnDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnDefinition308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnDefinition"


    // $ANTLR start "ruleColumnDefinition"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:181:1: ruleColumnDefinition : ( ( rule__ColumnDefinition__Alternatives ) ) ;
    public final void ruleColumnDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:185:2: ( ( ( rule__ColumnDefinition__Alternatives ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:186:1: ( ( rule__ColumnDefinition__Alternatives ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:186:1: ( ( rule__ColumnDefinition__Alternatives ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:187:1: ( rule__ColumnDefinition__Alternatives )
            {
             before(grammarAccess.getColumnDefinitionAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:188:1: ( rule__ColumnDefinition__Alternatives )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:188:2: rule__ColumnDefinition__Alternatives
            {
            pushFollow(FOLLOW_rule__ColumnDefinition__Alternatives_in_ruleColumnDefinition334);
            rule__ColumnDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnDefinition"


    // $ANTLR start "entryRuleMandatoryColumn"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:200:1: entryRuleMandatoryColumn : ruleMandatoryColumn EOF ;
    public final void entryRuleMandatoryColumn() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:201:1: ( ruleMandatoryColumn EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:202:1: ruleMandatoryColumn EOF
            {
             before(grammarAccess.getMandatoryColumnRule()); 
            pushFollow(FOLLOW_ruleMandatoryColumn_in_entryRuleMandatoryColumn361);
            ruleMandatoryColumn();

            state._fsp--;

             after(grammarAccess.getMandatoryColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatoryColumn368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatoryColumn"


    // $ANTLR start "ruleMandatoryColumn"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:209:1: ruleMandatoryColumn : ( ( rule__MandatoryColumn__Group__0 ) ) ;
    public final void ruleMandatoryColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:213:2: ( ( ( rule__MandatoryColumn__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:214:1: ( ( rule__MandatoryColumn__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:214:1: ( ( rule__MandatoryColumn__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:215:1: ( rule__MandatoryColumn__Group__0 )
            {
             before(grammarAccess.getMandatoryColumnAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:216:1: ( rule__MandatoryColumn__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:216:2: rule__MandatoryColumn__Group__0
            {
            pushFollow(FOLLOW_rule__MandatoryColumn__Group__0_in_ruleMandatoryColumn394);
            rule__MandatoryColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatoryColumn"


    // $ANTLR start "entryRuleOptionalColumn"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:228:1: entryRuleOptionalColumn : ruleOptionalColumn EOF ;
    public final void entryRuleOptionalColumn() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:229:1: ( ruleOptionalColumn EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:230:1: ruleOptionalColumn EOF
            {
             before(grammarAccess.getOptionalColumnRule()); 
            pushFollow(FOLLOW_ruleOptionalColumn_in_entryRuleOptionalColumn421);
            ruleOptionalColumn();

            state._fsp--;

             after(grammarAccess.getOptionalColumnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptionalColumn428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionalColumn"


    // $ANTLR start "ruleOptionalColumn"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:237:1: ruleOptionalColumn : ( ( rule__OptionalColumn__Group__0 ) ) ;
    public final void ruleOptionalColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:241:2: ( ( ( rule__OptionalColumn__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:242:1: ( ( rule__OptionalColumn__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:242:1: ( ( rule__OptionalColumn__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:243:1: ( rule__OptionalColumn__Group__0 )
            {
             before(grammarAccess.getOptionalColumnAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:244:1: ( rule__OptionalColumn__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:244:2: rule__OptionalColumn__Group__0
            {
            pushFollow(FOLLOW_rule__OptionalColumn__Group__0_in_ruleOptionalColumn454);
            rule__OptionalColumn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalColumnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionalColumn"


    // $ANTLR start "entryRuleColumnSpec"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:256:1: entryRuleColumnSpec : ruleColumnSpec EOF ;
    public final void entryRuleColumnSpec() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:257:1: ( ruleColumnSpec EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:258:1: ruleColumnSpec EOF
            {
             before(grammarAccess.getColumnSpecRule()); 
            pushFollow(FOLLOW_ruleColumnSpec_in_entryRuleColumnSpec481);
            ruleColumnSpec();

            state._fsp--;

             after(grammarAccess.getColumnSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleColumnSpec488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumnSpec"


    // $ANTLR start "ruleColumnSpec"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:265:1: ruleColumnSpec : ( ( rule__ColumnSpec__Alternatives ) ) ;
    public final void ruleColumnSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:269:2: ( ( ( rule__ColumnSpec__Alternatives ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:270:1: ( ( rule__ColumnSpec__Alternatives ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:270:1: ( ( rule__ColumnSpec__Alternatives ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:271:1: ( rule__ColumnSpec__Alternatives )
            {
             before(grammarAccess.getColumnSpecAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:272:1: ( rule__ColumnSpec__Alternatives )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:272:2: rule__ColumnSpec__Alternatives
            {
            pushFollow(FOLLOW_rule__ColumnSpec__Alternatives_in_ruleColumnSpec514);
            rule__ColumnSpec__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnSpecAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumnSpec"


    // $ANTLR start "entryRuleRowSpec"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:284:1: entryRuleRowSpec : ruleRowSpec EOF ;
    public final void entryRuleRowSpec() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:285:1: ( ruleRowSpec EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:286:1: ruleRowSpec EOF
            {
             before(grammarAccess.getRowSpecRule()); 
            pushFollow(FOLLOW_ruleRowSpec_in_entryRuleRowSpec541);
            ruleRowSpec();

            state._fsp--;

             after(grammarAccess.getRowSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRowSpec548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRowSpec"


    // $ANTLR start "ruleRowSpec"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:293:1: ruleRowSpec : ( ( rule__RowSpec__Group__0 ) ) ;
    public final void ruleRowSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:297:2: ( ( ( rule__RowSpec__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:298:1: ( ( rule__RowSpec__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:298:1: ( ( rule__RowSpec__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:299:1: ( rule__RowSpec__Group__0 )
            {
             before(grammarAccess.getRowSpecAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:300:1: ( rule__RowSpec__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:300:2: rule__RowSpec__Group__0
            {
            pushFollow(FOLLOW_rule__RowSpec__Group__0_in_ruleRowSpec574);
            rule__RowSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRowSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRowSpec"


    // $ANTLR start "entryRuleBlockSpec"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:312:1: entryRuleBlockSpec : ruleBlockSpec EOF ;
    public final void entryRuleBlockSpec() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:313:1: ( ruleBlockSpec EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:314:1: ruleBlockSpec EOF
            {
             before(grammarAccess.getBlockSpecRule()); 
            pushFollow(FOLLOW_ruleBlockSpec_in_entryRuleBlockSpec601);
            ruleBlockSpec();

            state._fsp--;

             after(grammarAccess.getBlockSpecRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBlockSpec608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlockSpec"


    // $ANTLR start "ruleBlockSpec"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:321:1: ruleBlockSpec : ( ( rule__BlockSpec__Group__0 ) ) ;
    public final void ruleBlockSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:325:2: ( ( ( rule__BlockSpec__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:326:1: ( ( rule__BlockSpec__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:326:1: ( ( rule__BlockSpec__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:327:1: ( rule__BlockSpec__Group__0 )
            {
             before(grammarAccess.getBlockSpecAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:328:1: ( rule__BlockSpec__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:328:2: rule__BlockSpec__Group__0
            {
            pushFollow(FOLLOW_rule__BlockSpec__Group__0_in_ruleBlockSpec634);
            rule__BlockSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlockSpec"


    // $ANTLR start "entryRuleSyntax"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:340:1: entryRuleSyntax : ruleSyntax EOF ;
    public final void entryRuleSyntax() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:341:1: ( ruleSyntax EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:342:1: ruleSyntax EOF
            {
             before(grammarAccess.getSyntaxRule()); 
            pushFollow(FOLLOW_ruleSyntax_in_entryRuleSyntax661);
            ruleSyntax();

            state._fsp--;

             after(grammarAccess.getSyntaxRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntax668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSyntax"


    // $ANTLR start "ruleSyntax"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:349:1: ruleSyntax : ( ( rule__Syntax__Alternatives ) ) ;
    public final void ruleSyntax() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:353:2: ( ( ( rule__Syntax__Alternatives ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:354:1: ( ( rule__Syntax__Alternatives ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:354:1: ( ( rule__Syntax__Alternatives ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:355:1: ( rule__Syntax__Alternatives )
            {
             before(grammarAccess.getSyntaxAccess().getAlternatives()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:356:1: ( rule__Syntax__Alternatives )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:356:2: rule__Syntax__Alternatives
            {
            pushFollow(FOLLOW_rule__Syntax__Alternatives_in_ruleSyntax694);
            rule__Syntax__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSyntaxAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSyntax"


    // $ANTLR start "entryRuleRule"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:368:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:369:1: ( ruleRule EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:370:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule721);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:377:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:381:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:382:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:382:1: ( ( rule__Rule__Group__0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:383:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:384:1: ( rule__Rule__Group__0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:384:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule754);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSyntaxSeq"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:396:1: entryRuleSyntaxSeq : ruleSyntaxSeq EOF ;
    public final void entryRuleSyntaxSeq() throws RecognitionException {
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:397:1: ( ruleSyntaxSeq EOF )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:398:1: ruleSyntaxSeq EOF
            {
             before(grammarAccess.getSyntaxSeqRule()); 
            pushFollow(FOLLOW_ruleSyntaxSeq_in_entryRuleSyntaxSeq781);
            ruleSyntaxSeq();

            state._fsp--;

             after(grammarAccess.getSyntaxSeqRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntaxSeq788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSyntaxSeq"


    // $ANTLR start "ruleSyntaxSeq"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:405:1: ruleSyntaxSeq : ( ( ( rule__SyntaxSeq__PartsAssignment ) ) ( ( rule__SyntaxSeq__PartsAssignment )* ) ) ;
    public final void ruleSyntaxSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:409:2: ( ( ( ( rule__SyntaxSeq__PartsAssignment ) ) ( ( rule__SyntaxSeq__PartsAssignment )* ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:410:1: ( ( ( rule__SyntaxSeq__PartsAssignment ) ) ( ( rule__SyntaxSeq__PartsAssignment )* ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:410:1: ( ( ( rule__SyntaxSeq__PartsAssignment ) ) ( ( rule__SyntaxSeq__PartsAssignment )* ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:411:1: ( ( rule__SyntaxSeq__PartsAssignment ) ) ( ( rule__SyntaxSeq__PartsAssignment )* )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:411:1: ( ( rule__SyntaxSeq__PartsAssignment ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:412:1: ( rule__SyntaxSeq__PartsAssignment )
            {
             before(grammarAccess.getSyntaxSeqAccess().getPartsAssignment()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:413:1: ( rule__SyntaxSeq__PartsAssignment )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:413:2: rule__SyntaxSeq__PartsAssignment
            {
            pushFollow(FOLLOW_rule__SyntaxSeq__PartsAssignment_in_ruleSyntaxSeq816);
            rule__SyntaxSeq__PartsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSyntaxSeqAccess().getPartsAssignment()); 

            }

            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:416:1: ( ( rule__SyntaxSeq__PartsAssignment )* )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:417:1: ( rule__SyntaxSeq__PartsAssignment )*
            {
             before(grammarAccess.getSyntaxSeqAccess().getPartsAssignment()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:418:1: ( rule__SyntaxSeq__PartsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=20 && LA1_0<=21)||(LA1_0>=24 && LA1_0<=26)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:418:2: rule__SyntaxSeq__PartsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__SyntaxSeq__PartsAssignment_in_ruleSyntaxSeq828);
            	    rule__SyntaxSeq__PartsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSyntaxSeqAccess().getPartsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSyntaxSeq"


    // $ANTLR start "rule__Element__Alternatives"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:431:1: rule__Element__Alternatives : ( ( ruleBlock ) | ( ruleRule ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:435:1: ( ( ruleBlock ) | ( ruleRule ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==21) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:436:1: ( ruleBlock )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:436:1: ( ruleBlock )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:437:1: ruleBlock
                    {
                     before(grammarAccess.getElementAccess().getBlockParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleBlock_in_rule__Element__Alternatives867);
                    ruleBlock();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:442:6: ( ruleRule )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:442:6: ( ruleRule )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:443:1: ruleRule
                    {
                     before(grammarAccess.getElementAccess().getRuleParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRule_in_rule__Element__Alternatives884);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getRuleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__ColumnDefinition__Alternatives"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:453:1: rule__ColumnDefinition__Alternatives : ( ( ruleMandatoryColumn ) | ( ruleOptionalColumn ) );
    public final void rule__ColumnDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:457:1: ( ( ruleMandatoryColumn ) | ( ruleOptionalColumn ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:458:1: ( ruleMandatoryColumn )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:458:1: ( ruleMandatoryColumn )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:459:1: ruleMandatoryColumn
                    {
                     before(grammarAccess.getColumnDefinitionAccess().getMandatoryColumnParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleMandatoryColumn_in_rule__ColumnDefinition__Alternatives916);
                    ruleMandatoryColumn();

                    state._fsp--;

                     after(grammarAccess.getColumnDefinitionAccess().getMandatoryColumnParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:464:6: ( ruleOptionalColumn )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:464:6: ( ruleOptionalColumn )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:465:1: ruleOptionalColumn
                    {
                     before(grammarAccess.getColumnDefinitionAccess().getOptionalColumnParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOptionalColumn_in_rule__ColumnDefinition__Alternatives933);
                    ruleOptionalColumn();

                    state._fsp--;

                     after(grammarAccess.getColumnDefinitionAccess().getOptionalColumnParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnDefinition__Alternatives"


    // $ANTLR start "rule__ColumnSpec__Alternatives"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:475:1: rule__ColumnSpec__Alternatives : ( ( ruleRowSpec ) | ( ruleBlockSpec ) );
    public final void rule__ColumnSpec__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:479:1: ( ( ruleRowSpec ) | ( ruleBlockSpec ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:480:1: ( ruleRowSpec )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:480:1: ( ruleRowSpec )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:481:1: ruleRowSpec
                    {
                     before(grammarAccess.getColumnSpecAccess().getRowSpecParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleRowSpec_in_rule__ColumnSpec__Alternatives965);
                    ruleRowSpec();

                    state._fsp--;

                     after(grammarAccess.getColumnSpecAccess().getRowSpecParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:486:6: ( ruleBlockSpec )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:486:6: ( ruleBlockSpec )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:487:1: ruleBlockSpec
                    {
                     before(grammarAccess.getColumnSpecAccess().getBlockSpecParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBlockSpec_in_rule__ColumnSpec__Alternatives982);
                    ruleBlockSpec();

                    state._fsp--;

                     after(grammarAccess.getColumnSpecAccess().getBlockSpecParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ColumnSpec__Alternatives"


    // $ANTLR start "rule__Syntax__Alternatives"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:497:1: rule__Syntax__Alternatives : ( ( ( rule__Syntax__Is_idAssignment_0 ) ) | ( ( rule__Syntax__Is_stringAssignment_1 ) ) | ( ( rule__Syntax__Is_intAssignment_2 ) ) | ( ( rule__Syntax__Group_3__0 ) ) | ( ( rule__Syntax__Group_4__0 ) ) );
    public final void rule__Syntax__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:501:1: ( ( ( rule__Syntax__Is_idAssignment_0 ) ) | ( ( rule__Syntax__Is_stringAssignment_1 ) ) | ( ( rule__Syntax__Is_intAssignment_2 ) ) | ( ( rule__Syntax__Group_3__0 ) ) | ( ( rule__Syntax__Group_4__0 ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 20:
                {
                alt5=4;
                }
                break;
            case 21:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:502:1: ( ( rule__Syntax__Is_idAssignment_0 ) )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:502:1: ( ( rule__Syntax__Is_idAssignment_0 ) )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:503:1: ( rule__Syntax__Is_idAssignment_0 )
                    {
                     before(grammarAccess.getSyntaxAccess().getIs_idAssignment_0()); 
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:504:1: ( rule__Syntax__Is_idAssignment_0 )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:504:2: rule__Syntax__Is_idAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Syntax__Is_idAssignment_0_in_rule__Syntax__Alternatives1014);
                    rule__Syntax__Is_idAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntaxAccess().getIs_idAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:508:6: ( ( rule__Syntax__Is_stringAssignment_1 ) )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:508:6: ( ( rule__Syntax__Is_stringAssignment_1 ) )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:509:1: ( rule__Syntax__Is_stringAssignment_1 )
                    {
                     before(grammarAccess.getSyntaxAccess().getIs_stringAssignment_1()); 
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:510:1: ( rule__Syntax__Is_stringAssignment_1 )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:510:2: rule__Syntax__Is_stringAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Syntax__Is_stringAssignment_1_in_rule__Syntax__Alternatives1032);
                    rule__Syntax__Is_stringAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntaxAccess().getIs_stringAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:514:6: ( ( rule__Syntax__Is_intAssignment_2 ) )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:514:6: ( ( rule__Syntax__Is_intAssignment_2 ) )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:515:1: ( rule__Syntax__Is_intAssignment_2 )
                    {
                     before(grammarAccess.getSyntaxAccess().getIs_intAssignment_2()); 
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:516:1: ( rule__Syntax__Is_intAssignment_2 )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:516:2: rule__Syntax__Is_intAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Syntax__Is_intAssignment_2_in_rule__Syntax__Alternatives1050);
                    rule__Syntax__Is_intAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntaxAccess().getIs_intAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:520:6: ( ( rule__Syntax__Group_3__0 ) )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:520:6: ( ( rule__Syntax__Group_3__0 ) )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:521:1: ( rule__Syntax__Group_3__0 )
                    {
                     before(grammarAccess.getSyntaxAccess().getGroup_3()); 
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:522:1: ( rule__Syntax__Group_3__0 )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:522:2: rule__Syntax__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Syntax__Group_3__0_in_rule__Syntax__Alternatives1068);
                    rule__Syntax__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntaxAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:526:6: ( ( rule__Syntax__Group_4__0 ) )
                    {
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:526:6: ( ( rule__Syntax__Group_4__0 ) )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:527:1: ( rule__Syntax__Group_4__0 )
                    {
                     before(grammarAccess.getSyntaxAccess().getGroup_4()); 
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:528:1: ( rule__Syntax__Group_4__0 )
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:528:2: rule__Syntax__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Syntax__Group_4__0_in_rule__Syntax__Alternatives1086);
                    rule__Syntax__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSyntaxAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Alternatives"


    // $ANTLR start "rule__Grammar__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:539:1: rule__Grammar__Group__0 : rule__Grammar__Group__0__Impl rule__Grammar__Group__1 ;
    public final void rule__Grammar__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:543:1: ( rule__Grammar__Group__0__Impl rule__Grammar__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:544:2: rule__Grammar__Group__0__Impl rule__Grammar__Group__1
            {
            pushFollow(FOLLOW_rule__Grammar__Group__0__Impl_in_rule__Grammar__Group__01117);
            rule__Grammar__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grammar__Group__1_in_rule__Grammar__Group__01120);
            rule__Grammar__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__0"


    // $ANTLR start "rule__Grammar__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:551:1: rule__Grammar__Group__0__Impl : ( 'language' ) ;
    public final void rule__Grammar__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:555:1: ( ( 'language' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:556:1: ( 'language' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:556:1: ( 'language' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:557:1: 'language'
            {
             before(grammarAccess.getGrammarAccess().getLanguageKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Grammar__Group__0__Impl1148); 
             after(grammarAccess.getGrammarAccess().getLanguageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__0__Impl"


    // $ANTLR start "rule__Grammar__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:570:1: rule__Grammar__Group__1 : rule__Grammar__Group__1__Impl rule__Grammar__Group__2 ;
    public final void rule__Grammar__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:574:1: ( rule__Grammar__Group__1__Impl rule__Grammar__Group__2 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:575:2: rule__Grammar__Group__1__Impl rule__Grammar__Group__2
            {
            pushFollow(FOLLOW_rule__Grammar__Group__1__Impl_in_rule__Grammar__Group__11179);
            rule__Grammar__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grammar__Group__2_in_rule__Grammar__Group__11182);
            rule__Grammar__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__1"


    // $ANTLR start "rule__Grammar__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:582:1: rule__Grammar__Group__1__Impl : ( ( rule__Grammar__NameAssignment_1 ) ) ;
    public final void rule__Grammar__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:586:1: ( ( ( rule__Grammar__NameAssignment_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:587:1: ( ( rule__Grammar__NameAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:587:1: ( ( rule__Grammar__NameAssignment_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:588:1: ( rule__Grammar__NameAssignment_1 )
            {
             before(grammarAccess.getGrammarAccess().getNameAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:589:1: ( rule__Grammar__NameAssignment_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:589:2: rule__Grammar__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Grammar__NameAssignment_1_in_rule__Grammar__Group__1__Impl1209);
            rule__Grammar__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__1__Impl"


    // $ANTLR start "rule__Grammar__Group__2"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:599:1: rule__Grammar__Group__2 : rule__Grammar__Group__2__Impl rule__Grammar__Group__3 ;
    public final void rule__Grammar__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:603:1: ( rule__Grammar__Group__2__Impl rule__Grammar__Group__3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:604:2: rule__Grammar__Group__2__Impl rule__Grammar__Group__3
            {
            pushFollow(FOLLOW_rule__Grammar__Group__2__Impl_in_rule__Grammar__Group__21239);
            rule__Grammar__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grammar__Group__3_in_rule__Grammar__Group__21242);
            rule__Grammar__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__2"


    // $ANTLR start "rule__Grammar__Group__2__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:611:1: rule__Grammar__Group__2__Impl : ( ':' ) ;
    public final void rule__Grammar__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:615:1: ( ( ':' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:616:1: ( ':' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:616:1: ( ':' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:617:1: ':'
            {
             before(grammarAccess.getGrammarAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Grammar__Group__2__Impl1270); 
             after(grammarAccess.getGrammarAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__2__Impl"


    // $ANTLR start "rule__Grammar__Group__3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:630:1: rule__Grammar__Group__3 : rule__Grammar__Group__3__Impl rule__Grammar__Group__4 ;
    public final void rule__Grammar__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:634:1: ( rule__Grammar__Group__3__Impl rule__Grammar__Group__4 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:635:2: rule__Grammar__Group__3__Impl rule__Grammar__Group__4
            {
            pushFollow(FOLLOW_rule__Grammar__Group__3__Impl_in_rule__Grammar__Group__31301);
            rule__Grammar__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grammar__Group__4_in_rule__Grammar__Group__31304);
            rule__Grammar__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__3"


    // $ANTLR start "rule__Grammar__Group__3__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:642:1: rule__Grammar__Group__3__Impl : ( ( rule__Grammar__RootAssignment_3 ) ) ;
    public final void rule__Grammar__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:646:1: ( ( ( rule__Grammar__RootAssignment_3 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:647:1: ( ( rule__Grammar__RootAssignment_3 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:647:1: ( ( rule__Grammar__RootAssignment_3 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:648:1: ( rule__Grammar__RootAssignment_3 )
            {
             before(grammarAccess.getGrammarAccess().getRootAssignment_3()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:649:1: ( rule__Grammar__RootAssignment_3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:649:2: rule__Grammar__RootAssignment_3
            {
            pushFollow(FOLLOW_rule__Grammar__RootAssignment_3_in_rule__Grammar__Group__3__Impl1331);
            rule__Grammar__RootAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGrammarAccess().getRootAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__3__Impl"


    // $ANTLR start "rule__Grammar__Group__4"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:659:1: rule__Grammar__Group__4 : rule__Grammar__Group__4__Impl rule__Grammar__Group__5 ;
    public final void rule__Grammar__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:663:1: ( rule__Grammar__Group__4__Impl rule__Grammar__Group__5 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:664:2: rule__Grammar__Group__4__Impl rule__Grammar__Group__5
            {
            pushFollow(FOLLOW_rule__Grammar__Group__4__Impl_in_rule__Grammar__Group__41361);
            rule__Grammar__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grammar__Group__5_in_rule__Grammar__Group__41364);
            rule__Grammar__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__4"


    // $ANTLR start "rule__Grammar__Group__4__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:671:1: rule__Grammar__Group__4__Impl : ( ';' ) ;
    public final void rule__Grammar__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:675:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:676:1: ( ';' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:676:1: ( ';' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:677:1: ';'
            {
             before(grammarAccess.getGrammarAccess().getSemicolonKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Grammar__Group__4__Impl1392); 
             after(grammarAccess.getGrammarAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__4__Impl"


    // $ANTLR start "rule__Grammar__Group__5"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:690:1: rule__Grammar__Group__5 : rule__Grammar__Group__5__Impl ;
    public final void rule__Grammar__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:694:1: ( rule__Grammar__Group__5__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:695:2: rule__Grammar__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Grammar__Group__5__Impl_in_rule__Grammar__Group__51423);
            rule__Grammar__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__5"


    // $ANTLR start "rule__Grammar__Group__5__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:701:1: rule__Grammar__Group__5__Impl : ( ( rule__Grammar__ElementsAssignment_5 )* ) ;
    public final void rule__Grammar__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:705:1: ( ( ( rule__Grammar__ElementsAssignment_5 )* ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:706:1: ( ( rule__Grammar__ElementsAssignment_5 )* )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:706:1: ( ( rule__Grammar__ElementsAssignment_5 )* )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:707:1: ( rule__Grammar__ElementsAssignment_5 )*
            {
             before(grammarAccess.getGrammarAccess().getElementsAssignment_5()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:708:1: ( rule__Grammar__ElementsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14||LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:708:2: rule__Grammar__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_rule__Grammar__ElementsAssignment_5_in_rule__Grammar__Group__5__Impl1450);
            	    rule__Grammar__ElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getGrammarAccess().getElementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__Group__5__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:730:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:734:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:735:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__01493);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__01496);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:742:1: rule__Block__Group__0__Impl : ( 'block' ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:746:1: ( ( 'block' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:747:1: ( 'block' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:747:1: ( 'block' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:748:1: 'block'
            {
             before(grammarAccess.getBlockAccess().getBlockKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Block__Group__0__Impl1524); 
             after(grammarAccess.getBlockAccess().getBlockKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:761:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:765:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:766:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__11555);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__11558);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:773:1: rule__Block__Group__1__Impl : ( ( rule__Block__NameAssignment_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:777:1: ( ( ( rule__Block__NameAssignment_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:778:1: ( ( rule__Block__NameAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:778:1: ( ( rule__Block__NameAssignment_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:779:1: ( rule__Block__NameAssignment_1 )
            {
             before(grammarAccess.getBlockAccess().getNameAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:780:1: ( rule__Block__NameAssignment_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:780:2: rule__Block__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Block__NameAssignment_1_in_rule__Block__Group__1__Impl1585);
            rule__Block__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:790:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:794:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:795:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__21615);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__21618);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:802:1: rule__Block__Group__2__Impl : ( '{' ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:806:1: ( ( '{' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:807:1: ( '{' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:807:1: ( '{' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:808:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_15_in_rule__Block__Group__2__Impl1646); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:821:1: rule__Block__Group__3 : rule__Block__Group__3__Impl rule__Block__Group__4 ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:825:1: ( rule__Block__Group__3__Impl rule__Block__Group__4 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:826:2: rule__Block__Group__3__Impl rule__Block__Group__4
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__31677);
            rule__Block__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Block__Group__4_in_rule__Block__Group__31680);
            rule__Block__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:833:1: rule__Block__Group__3__Impl : ( ( rule__Block__ColumnsAssignment_3 )* ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:837:1: ( ( ( rule__Block__ColumnsAssignment_3 )* ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:838:1: ( ( rule__Block__ColumnsAssignment_3 )* )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:838:1: ( ( rule__Block__ColumnsAssignment_3 )* )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:839:1: ( rule__Block__ColumnsAssignment_3 )*
            {
             before(grammarAccess.getBlockAccess().getColumnsAssignment_3()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:840:1: ( rule__Block__ColumnsAssignment_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:840:2: rule__Block__ColumnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Block__ColumnsAssignment_3_in_rule__Block__Group__3__Impl1707);
            	    rule__Block__ColumnsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getColumnsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__Block__Group__4"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:850:1: rule__Block__Group__4 : rule__Block__Group__4__Impl ;
    public final void rule__Block__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:854:1: ( rule__Block__Group__4__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:855:2: rule__Block__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__4__Impl_in_rule__Block__Group__41738);
            rule__Block__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4"


    // $ANTLR start "rule__Block__Group__4__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:861:1: rule__Block__Group__4__Impl : ( '}' ) ;
    public final void rule__Block__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:865:1: ( ( '}' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:866:1: ( '}' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:866:1: ( '}' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:867:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_16_in_rule__Block__Group__4__Impl1766); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:890:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:894:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:895:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__01807);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__1_in_rule__Column__Group__01810);
            rule__Column__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:902:1: rule__Column__Group__0__Impl : ( ( rule__Column__NameAssignment_0 ) ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:906:1: ( ( ( rule__Column__NameAssignment_0 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:907:1: ( ( rule__Column__NameAssignment_0 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:907:1: ( ( rule__Column__NameAssignment_0 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:908:1: ( rule__Column__NameAssignment_0 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:909:1: ( rule__Column__NameAssignment_0 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:909:2: rule__Column__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Column__NameAssignment_0_in_rule__Column__Group__0__Impl1837);
            rule__Column__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:919:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:923:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:924:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__11867);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__2_in_rule__Column__Group__11870);
            rule__Column__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:931:1: rule__Column__Group__1__Impl : ( ( rule__Column__MultipleAssignment_1 )? ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:935:1: ( ( ( rule__Column__MultipleAssignment_1 )? ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:936:1: ( ( rule__Column__MultipleAssignment_1 )? )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:936:1: ( ( rule__Column__MultipleAssignment_1 )? )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:937:1: ( rule__Column__MultipleAssignment_1 )?
            {
             before(grammarAccess.getColumnAccess().getMultipleAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:938:1: ( rule__Column__MultipleAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:938:2: rule__Column__MultipleAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Column__MultipleAssignment_1_in_rule__Column__Group__1__Impl1897);
                    rule__Column__MultipleAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getMultipleAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:948:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:952:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:953:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__21928);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Column__Group__3_in_rule__Column__Group__21931);
            rule__Column__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:960:1: rule__Column__Group__2__Impl : ( ( rule__Column__DefAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:964:1: ( ( ( rule__Column__DefAssignment_2 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:965:1: ( ( rule__Column__DefAssignment_2 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:965:1: ( ( rule__Column__DefAssignment_2 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:966:1: ( rule__Column__DefAssignment_2 )
            {
             before(grammarAccess.getColumnAccess().getDefAssignment_2()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:967:1: ( rule__Column__DefAssignment_2 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:967:2: rule__Column__DefAssignment_2
            {
            pushFollow(FOLLOW_rule__Column__DefAssignment_2_in_rule__Column__Group__2__Impl1958);
            rule__Column__DefAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getDefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:977:1: rule__Column__Group__3 : rule__Column__Group__3__Impl ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:981:1: ( rule__Column__Group__3__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:982:2: rule__Column__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__31988);
            rule__Column__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:988:1: rule__Column__Group__3__Impl : ( ';' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:992:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:993:1: ( ';' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:993:1: ( ';' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:994:1: ';'
            {
             before(grammarAccess.getColumnAccess().getSemicolonKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__Column__Group__3__Impl2016); 
             after(grammarAccess.getColumnAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__MandatoryColumn__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1015:1: rule__MandatoryColumn__Group__0 : rule__MandatoryColumn__Group__0__Impl rule__MandatoryColumn__Group__1 ;
    public final void rule__MandatoryColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1019:1: ( rule__MandatoryColumn__Group__0__Impl rule__MandatoryColumn__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1020:2: rule__MandatoryColumn__Group__0__Impl rule__MandatoryColumn__Group__1
            {
            pushFollow(FOLLOW_rule__MandatoryColumn__Group__0__Impl_in_rule__MandatoryColumn__Group__02055);
            rule__MandatoryColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MandatoryColumn__Group__1_in_rule__MandatoryColumn__Group__02058);
            rule__MandatoryColumn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryColumn__Group__0"


    // $ANTLR start "rule__MandatoryColumn__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1027:1: rule__MandatoryColumn__Group__0__Impl : ( '=' ) ;
    public final void rule__MandatoryColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1031:1: ( ( '=' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1032:1: ( '=' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1032:1: ( '=' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1033:1: '='
            {
             before(grammarAccess.getMandatoryColumnAccess().getEqualsSignKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__MandatoryColumn__Group__0__Impl2086); 
             after(grammarAccess.getMandatoryColumnAccess().getEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryColumn__Group__0__Impl"


    // $ANTLR start "rule__MandatoryColumn__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1046:1: rule__MandatoryColumn__Group__1 : rule__MandatoryColumn__Group__1__Impl ;
    public final void rule__MandatoryColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1050:1: ( rule__MandatoryColumn__Group__1__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1051:2: rule__MandatoryColumn__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MandatoryColumn__Group__1__Impl_in_rule__MandatoryColumn__Group__12117);
            rule__MandatoryColumn__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryColumn__Group__1"


    // $ANTLR start "rule__MandatoryColumn__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1057:1: rule__MandatoryColumn__Group__1__Impl : ( ( rule__MandatoryColumn__SpecAssignment_1 ) ) ;
    public final void rule__MandatoryColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1061:1: ( ( ( rule__MandatoryColumn__SpecAssignment_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1062:1: ( ( rule__MandatoryColumn__SpecAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1062:1: ( ( rule__MandatoryColumn__SpecAssignment_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1063:1: ( rule__MandatoryColumn__SpecAssignment_1 )
            {
             before(grammarAccess.getMandatoryColumnAccess().getSpecAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1064:1: ( rule__MandatoryColumn__SpecAssignment_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1064:2: rule__MandatoryColumn__SpecAssignment_1
            {
            pushFollow(FOLLOW_rule__MandatoryColumn__SpecAssignment_1_in_rule__MandatoryColumn__Group__1__Impl2144);
            rule__MandatoryColumn__SpecAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryColumnAccess().getSpecAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryColumn__Group__1__Impl"


    // $ANTLR start "rule__OptionalColumn__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1078:1: rule__OptionalColumn__Group__0 : rule__OptionalColumn__Group__0__Impl rule__OptionalColumn__Group__1 ;
    public final void rule__OptionalColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1082:1: ( rule__OptionalColumn__Group__0__Impl rule__OptionalColumn__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1083:2: rule__OptionalColumn__Group__0__Impl rule__OptionalColumn__Group__1
            {
            pushFollow(FOLLOW_rule__OptionalColumn__Group__0__Impl_in_rule__OptionalColumn__Group__02178);
            rule__OptionalColumn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OptionalColumn__Group__1_in_rule__OptionalColumn__Group__02181);
            rule__OptionalColumn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalColumn__Group__0"


    // $ANTLR start "rule__OptionalColumn__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1090:1: rule__OptionalColumn__Group__0__Impl : ( '?=' ) ;
    public final void rule__OptionalColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1094:1: ( ( '?=' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1095:1: ( '?=' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1095:1: ( '?=' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1096:1: '?='
            {
             before(grammarAccess.getOptionalColumnAccess().getQuestionMarkEqualsSignKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__OptionalColumn__Group__0__Impl2209); 
             after(grammarAccess.getOptionalColumnAccess().getQuestionMarkEqualsSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalColumn__Group__0__Impl"


    // $ANTLR start "rule__OptionalColumn__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1109:1: rule__OptionalColumn__Group__1 : rule__OptionalColumn__Group__1__Impl ;
    public final void rule__OptionalColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1113:1: ( rule__OptionalColumn__Group__1__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1114:2: rule__OptionalColumn__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OptionalColumn__Group__1__Impl_in_rule__OptionalColumn__Group__12240);
            rule__OptionalColumn__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalColumn__Group__1"


    // $ANTLR start "rule__OptionalColumn__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1120:1: rule__OptionalColumn__Group__1__Impl : ( ( rule__OptionalColumn__SpecAssignment_1 ) ) ;
    public final void rule__OptionalColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1124:1: ( ( ( rule__OptionalColumn__SpecAssignment_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1125:1: ( ( rule__OptionalColumn__SpecAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1125:1: ( ( rule__OptionalColumn__SpecAssignment_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1126:1: ( rule__OptionalColumn__SpecAssignment_1 )
            {
             before(grammarAccess.getOptionalColumnAccess().getSpecAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1127:1: ( rule__OptionalColumn__SpecAssignment_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1127:2: rule__OptionalColumn__SpecAssignment_1
            {
            pushFollow(FOLLOW_rule__OptionalColumn__SpecAssignment_1_in_rule__OptionalColumn__Group__1__Impl2267);
            rule__OptionalColumn__SpecAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalColumnAccess().getSpecAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalColumn__Group__1__Impl"


    // $ANTLR start "rule__RowSpec__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1141:1: rule__RowSpec__Group__0 : rule__RowSpec__Group__0__Impl rule__RowSpec__Group__1 ;
    public final void rule__RowSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1145:1: ( rule__RowSpec__Group__0__Impl rule__RowSpec__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1146:2: rule__RowSpec__Group__0__Impl rule__RowSpec__Group__1
            {
            pushFollow(FOLLOW_rule__RowSpec__Group__0__Impl_in_rule__RowSpec__Group__02301);
            rule__RowSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RowSpec__Group__1_in_rule__RowSpec__Group__02304);
            rule__RowSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__0"


    // $ANTLR start "rule__RowSpec__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1153:1: rule__RowSpec__Group__0__Impl : ( 'column' ) ;
    public final void rule__RowSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1157:1: ( ( 'column' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1158:1: ( 'column' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1158:1: ( 'column' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1159:1: 'column'
            {
             before(grammarAccess.getRowSpecAccess().getColumnKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__RowSpec__Group__0__Impl2332); 
             after(grammarAccess.getRowSpecAccess().getColumnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__0__Impl"


    // $ANTLR start "rule__RowSpec__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1172:1: rule__RowSpec__Group__1 : rule__RowSpec__Group__1__Impl rule__RowSpec__Group__2 ;
    public final void rule__RowSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1176:1: ( rule__RowSpec__Group__1__Impl rule__RowSpec__Group__2 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1177:2: rule__RowSpec__Group__1__Impl rule__RowSpec__Group__2
            {
            pushFollow(FOLLOW_rule__RowSpec__Group__1__Impl_in_rule__RowSpec__Group__12363);
            rule__RowSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RowSpec__Group__2_in_rule__RowSpec__Group__12366);
            rule__RowSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__1"


    // $ANTLR start "rule__RowSpec__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1184:1: rule__RowSpec__Group__1__Impl : ( ( rule__RowSpec__HeaderAssignment_1 ) ) ;
    public final void rule__RowSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1188:1: ( ( ( rule__RowSpec__HeaderAssignment_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1189:1: ( ( rule__RowSpec__HeaderAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1189:1: ( ( rule__RowSpec__HeaderAssignment_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1190:1: ( rule__RowSpec__HeaderAssignment_1 )
            {
             before(grammarAccess.getRowSpecAccess().getHeaderAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1191:1: ( rule__RowSpec__HeaderAssignment_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1191:2: rule__RowSpec__HeaderAssignment_1
            {
            pushFollow(FOLLOW_rule__RowSpec__HeaderAssignment_1_in_rule__RowSpec__Group__1__Impl2393);
            rule__RowSpec__HeaderAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRowSpecAccess().getHeaderAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__1__Impl"


    // $ANTLR start "rule__RowSpec__Group__2"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1201:1: rule__RowSpec__Group__2 : rule__RowSpec__Group__2__Impl rule__RowSpec__Group__3 ;
    public final void rule__RowSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1205:1: ( rule__RowSpec__Group__2__Impl rule__RowSpec__Group__3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1206:2: rule__RowSpec__Group__2__Impl rule__RowSpec__Group__3
            {
            pushFollow(FOLLOW_rule__RowSpec__Group__2__Impl_in_rule__RowSpec__Group__22423);
            rule__RowSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RowSpec__Group__3_in_rule__RowSpec__Group__22426);
            rule__RowSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__2"


    // $ANTLR start "rule__RowSpec__Group__2__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1213:1: rule__RowSpec__Group__2__Impl : ( ':' ) ;
    public final void rule__RowSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1217:1: ( ( ':' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1218:1: ( ':' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1218:1: ( ':' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1219:1: ':'
            {
             before(grammarAccess.getRowSpecAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__RowSpec__Group__2__Impl2454); 
             after(grammarAccess.getRowSpecAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__2__Impl"


    // $ANTLR start "rule__RowSpec__Group__3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1232:1: rule__RowSpec__Group__3 : rule__RowSpec__Group__3__Impl ;
    public final void rule__RowSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1236:1: ( rule__RowSpec__Group__3__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1237:2: rule__RowSpec__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RowSpec__Group__3__Impl_in_rule__RowSpec__Group__32485);
            rule__RowSpec__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__3"


    // $ANTLR start "rule__RowSpec__Group__3__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1243:1: rule__RowSpec__Group__3__Impl : ( ( rule__RowSpec__SyntaxAssignment_3 ) ) ;
    public final void rule__RowSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1247:1: ( ( ( rule__RowSpec__SyntaxAssignment_3 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1248:1: ( ( rule__RowSpec__SyntaxAssignment_3 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1248:1: ( ( rule__RowSpec__SyntaxAssignment_3 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1249:1: ( rule__RowSpec__SyntaxAssignment_3 )
            {
             before(grammarAccess.getRowSpecAccess().getSyntaxAssignment_3()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1250:1: ( rule__RowSpec__SyntaxAssignment_3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1250:2: rule__RowSpec__SyntaxAssignment_3
            {
            pushFollow(FOLLOW_rule__RowSpec__SyntaxAssignment_3_in_rule__RowSpec__Group__3__Impl2512);
            rule__RowSpec__SyntaxAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRowSpecAccess().getSyntaxAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__Group__3__Impl"


    // $ANTLR start "rule__BlockSpec__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1268:1: rule__BlockSpec__Group__0 : rule__BlockSpec__Group__0__Impl rule__BlockSpec__Group__1 ;
    public final void rule__BlockSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1272:1: ( rule__BlockSpec__Group__0__Impl rule__BlockSpec__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1273:2: rule__BlockSpec__Group__0__Impl rule__BlockSpec__Group__1
            {
            pushFollow(FOLLOW_rule__BlockSpec__Group__0__Impl_in_rule__BlockSpec__Group__02550);
            rule__BlockSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__BlockSpec__Group__1_in_rule__BlockSpec__Group__02553);
            rule__BlockSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockSpec__Group__0"


    // $ANTLR start "rule__BlockSpec__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1280:1: rule__BlockSpec__Group__0__Impl : ( 'block' ) ;
    public final void rule__BlockSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1284:1: ( ( 'block' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1285:1: ( 'block' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1285:1: ( 'block' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1286:1: 'block'
            {
             before(grammarAccess.getBlockSpecAccess().getBlockKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__BlockSpec__Group__0__Impl2581); 
             after(grammarAccess.getBlockSpecAccess().getBlockKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockSpec__Group__0__Impl"


    // $ANTLR start "rule__BlockSpec__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1299:1: rule__BlockSpec__Group__1 : rule__BlockSpec__Group__1__Impl ;
    public final void rule__BlockSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1303:1: ( rule__BlockSpec__Group__1__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1304:2: rule__BlockSpec__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BlockSpec__Group__1__Impl_in_rule__BlockSpec__Group__12612);
            rule__BlockSpec__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockSpec__Group__1"


    // $ANTLR start "rule__BlockSpec__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1310:1: rule__BlockSpec__Group__1__Impl : ( ( rule__BlockSpec__KindAssignment_1 ) ) ;
    public final void rule__BlockSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1314:1: ( ( ( rule__BlockSpec__KindAssignment_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1315:1: ( ( rule__BlockSpec__KindAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1315:1: ( ( rule__BlockSpec__KindAssignment_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1316:1: ( rule__BlockSpec__KindAssignment_1 )
            {
             before(grammarAccess.getBlockSpecAccess().getKindAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1317:1: ( rule__BlockSpec__KindAssignment_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1317:2: rule__BlockSpec__KindAssignment_1
            {
            pushFollow(FOLLOW_rule__BlockSpec__KindAssignment_1_in_rule__BlockSpec__Group__1__Impl2639);
            rule__BlockSpec__KindAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlockSpecAccess().getKindAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockSpec__Group__1__Impl"


    // $ANTLR start "rule__Syntax__Group_3__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1331:1: rule__Syntax__Group_3__0 : rule__Syntax__Group_3__0__Impl rule__Syntax__Group_3__1 ;
    public final void rule__Syntax__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1335:1: ( rule__Syntax__Group_3__0__Impl rule__Syntax__Group_3__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1336:2: rule__Syntax__Group_3__0__Impl rule__Syntax__Group_3__1
            {
            pushFollow(FOLLOW_rule__Syntax__Group_3__0__Impl_in_rule__Syntax__Group_3__02673);
            rule__Syntax__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Syntax__Group_3__1_in_rule__Syntax__Group_3__02676);
            rule__Syntax__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_3__0"


    // $ANTLR start "rule__Syntax__Group_3__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1343:1: rule__Syntax__Group_3__0__Impl : ( '@' ) ;
    public final void rule__Syntax__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1347:1: ( ( '@' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1348:1: ( '@' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1348:1: ( '@' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1349:1: '@'
            {
             before(grammarAccess.getSyntaxAccess().getCommercialAtKeyword_3_0()); 
            match(input,20,FOLLOW_20_in_rule__Syntax__Group_3__0__Impl2704); 
             after(grammarAccess.getSyntaxAccess().getCommercialAtKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_3__0__Impl"


    // $ANTLR start "rule__Syntax__Group_3__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1362:1: rule__Syntax__Group_3__1 : rule__Syntax__Group_3__1__Impl ;
    public final void rule__Syntax__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1366:1: ( rule__Syntax__Group_3__1__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1367:2: rule__Syntax__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Syntax__Group_3__1__Impl_in_rule__Syntax__Group_3__12735);
            rule__Syntax__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_3__1"


    // $ANTLR start "rule__Syntax__Group_3__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1373:1: rule__Syntax__Group_3__1__Impl : ( ( rule__Syntax__TokenAssignment_3_1 ) ) ;
    public final void rule__Syntax__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1377:1: ( ( ( rule__Syntax__TokenAssignment_3_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1378:1: ( ( rule__Syntax__TokenAssignment_3_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1378:1: ( ( rule__Syntax__TokenAssignment_3_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1379:1: ( rule__Syntax__TokenAssignment_3_1 )
            {
             before(grammarAccess.getSyntaxAccess().getTokenAssignment_3_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1380:1: ( rule__Syntax__TokenAssignment_3_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1380:2: rule__Syntax__TokenAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Syntax__TokenAssignment_3_1_in_rule__Syntax__Group_3__1__Impl2762);
            rule__Syntax__TokenAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSyntaxAccess().getTokenAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_3__1__Impl"


    // $ANTLR start "rule__Syntax__Group_4__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1394:1: rule__Syntax__Group_4__0 : rule__Syntax__Group_4__0__Impl rule__Syntax__Group_4__1 ;
    public final void rule__Syntax__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1398:1: ( rule__Syntax__Group_4__0__Impl rule__Syntax__Group_4__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1399:2: rule__Syntax__Group_4__0__Impl rule__Syntax__Group_4__1
            {
            pushFollow(FOLLOW_rule__Syntax__Group_4__0__Impl_in_rule__Syntax__Group_4__02796);
            rule__Syntax__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Syntax__Group_4__1_in_rule__Syntax__Group_4__02799);
            rule__Syntax__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_4__0"


    // $ANTLR start "rule__Syntax__Group_4__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1406:1: rule__Syntax__Group_4__0__Impl : ( 'rule' ) ;
    public final void rule__Syntax__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1410:1: ( ( 'rule' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1411:1: ( 'rule' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1411:1: ( 'rule' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1412:1: 'rule'
            {
             before(grammarAccess.getSyntaxAccess().getRuleKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__Syntax__Group_4__0__Impl2827); 
             after(grammarAccess.getSyntaxAccess().getRuleKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_4__0__Impl"


    // $ANTLR start "rule__Syntax__Group_4__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1425:1: rule__Syntax__Group_4__1 : rule__Syntax__Group_4__1__Impl ;
    public final void rule__Syntax__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1429:1: ( rule__Syntax__Group_4__1__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1430:2: rule__Syntax__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Syntax__Group_4__1__Impl_in_rule__Syntax__Group_4__12858);
            rule__Syntax__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_4__1"


    // $ANTLR start "rule__Syntax__Group_4__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1436:1: rule__Syntax__Group_4__1__Impl : ( ( rule__Syntax__RuleAssignment_4_1 ) ) ;
    public final void rule__Syntax__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1440:1: ( ( ( rule__Syntax__RuleAssignment_4_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1441:1: ( ( rule__Syntax__RuleAssignment_4_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1441:1: ( ( rule__Syntax__RuleAssignment_4_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1442:1: ( rule__Syntax__RuleAssignment_4_1 )
            {
             before(grammarAccess.getSyntaxAccess().getRuleAssignment_4_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1443:1: ( rule__Syntax__RuleAssignment_4_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1443:2: rule__Syntax__RuleAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Syntax__RuleAssignment_4_1_in_rule__Syntax__Group_4__1__Impl2885);
            rule__Syntax__RuleAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSyntaxAccess().getRuleAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Group_4__1__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1457:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1461:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1462:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02919);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02922);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1469:1: rule__Rule__Group__0__Impl : ( 'rule' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1473:1: ( ( 'rule' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1474:1: ( 'rule' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1474:1: ( 'rule' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1475:1: 'rule'
            {
             before(grammarAccess.getRuleAccess().getRuleKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Rule__Group__0__Impl2950); 
             after(grammarAccess.getRuleAccess().getRuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1488:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1492:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1493:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12981);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12984);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1500:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__NameAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1504:1: ( ( ( rule__Rule__NameAssignment_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1505:1: ( ( rule__Rule__NameAssignment_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1505:1: ( ( rule__Rule__NameAssignment_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1506:1: ( rule__Rule__NameAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getNameAssignment_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1507:1: ( rule__Rule__NameAssignment_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1507:2: rule__Rule__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl3011);
            rule__Rule__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1517:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1521:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1522:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__23041);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__23044);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1529:1: rule__Rule__Group__2__Impl : ( ':' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1533:1: ( ( ':' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1534:1: ( ':' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1534:1: ( ':' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1535:1: ':'
            {
             before(grammarAccess.getRuleAccess().getColonKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Rule__Group__2__Impl3072); 
             after(grammarAccess.getRuleAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1548:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1552:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1553:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__33103);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__33106);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1560:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__AlternativesAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1564:1: ( ( ( rule__Rule__AlternativesAssignment_3 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1565:1: ( ( rule__Rule__AlternativesAssignment_3 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1565:1: ( ( rule__Rule__AlternativesAssignment_3 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1566:1: ( rule__Rule__AlternativesAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getAlternativesAssignment_3()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1567:1: ( rule__Rule__AlternativesAssignment_3 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1567:2: rule__Rule__AlternativesAssignment_3
            {
            pushFollow(FOLLOW_rule__Rule__AlternativesAssignment_3_in_rule__Rule__Group__3__Impl3133);
            rule__Rule__AlternativesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternativesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1577:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1581:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1582:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__43163);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__43166);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1589:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__Group_4__0 )* ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1593:1: ( ( ( rule__Rule__Group_4__0 )* ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1594:1: ( ( rule__Rule__Group_4__0 )* )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1594:1: ( ( rule__Rule__Group_4__0 )* )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1595:1: ( rule__Rule__Group_4__0 )*
            {
             before(grammarAccess.getRuleAccess().getGroup_4()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1596:1: ( rule__Rule__Group_4__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1596:2: rule__Rule__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Rule__Group_4__0_in_rule__Rule__Group__4__Impl3193);
            	    rule__Rule__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRuleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1606:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1610:1: ( rule__Rule__Group__5__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1611:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__53224);
            rule__Rule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1617:1: rule__Rule__Group__5__Impl : ( ';' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1621:1: ( ( ';' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1622:1: ( ';' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1622:1: ( ';' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1623:1: ';'
            {
             before(grammarAccess.getRuleAccess().getSemicolonKeyword_5()); 
            match(input,13,FOLLOW_13_in_rule__Rule__Group__5__Impl3252); 
             after(grammarAccess.getRuleAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group_4__0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1648:1: rule__Rule__Group_4__0 : rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 ;
    public final void rule__Rule__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1652:1: ( rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1653:2: rule__Rule__Group_4__0__Impl rule__Rule__Group_4__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_4__0__Impl_in_rule__Rule__Group_4__03295);
            rule__Rule__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_4__1_in_rule__Rule__Group_4__03298);
            rule__Rule__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__0"


    // $ANTLR start "rule__Rule__Group_4__0__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1660:1: rule__Rule__Group_4__0__Impl : ( '|' ) ;
    public final void rule__Rule__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1664:1: ( ( '|' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1665:1: ( '|' )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1665:1: ( '|' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1666:1: '|'
            {
             before(grammarAccess.getRuleAccess().getVerticalLineKeyword_4_0()); 
            match(input,22,FOLLOW_22_in_rule__Rule__Group_4__0__Impl3326); 
             after(grammarAccess.getRuleAccess().getVerticalLineKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__0__Impl"


    // $ANTLR start "rule__Rule__Group_4__1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1679:1: rule__Rule__Group_4__1 : rule__Rule__Group_4__1__Impl ;
    public final void rule__Rule__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1683:1: ( rule__Rule__Group_4__1__Impl )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1684:2: rule__Rule__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_4__1__Impl_in_rule__Rule__Group_4__13357);
            rule__Rule__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__1"


    // $ANTLR start "rule__Rule__Group_4__1__Impl"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1690:1: rule__Rule__Group_4__1__Impl : ( ( rule__Rule__AlternativesAssignment_4_1 ) ) ;
    public final void rule__Rule__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1694:1: ( ( ( rule__Rule__AlternativesAssignment_4_1 ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1695:1: ( ( rule__Rule__AlternativesAssignment_4_1 ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1695:1: ( ( rule__Rule__AlternativesAssignment_4_1 ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1696:1: ( rule__Rule__AlternativesAssignment_4_1 )
            {
             before(grammarAccess.getRuleAccess().getAlternativesAssignment_4_1()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1697:1: ( rule__Rule__AlternativesAssignment_4_1 )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1697:2: rule__Rule__AlternativesAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Rule__AlternativesAssignment_4_1_in_rule__Rule__Group_4__1__Impl3384);
            rule__Rule__AlternativesAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAlternativesAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_4__1__Impl"


    // $ANTLR start "rule__Grammar__NameAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1712:1: rule__Grammar__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Grammar__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1716:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1717:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1717:1: ( RULE_ID )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1718:1: RULE_ID
            {
             before(grammarAccess.getGrammarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Grammar__NameAssignment_13423); 
             after(grammarAccess.getGrammarAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__NameAssignment_1"


    // $ANTLR start "rule__Grammar__RootAssignment_3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1727:1: rule__Grammar__RootAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Grammar__RootAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1731:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1732:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1732:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1733:1: ( RULE_ID )
            {
             before(grammarAccess.getGrammarAccess().getRootBlockCrossReference_3_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1734:1: ( RULE_ID )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1735:1: RULE_ID
            {
             before(grammarAccess.getGrammarAccess().getRootBlockIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Grammar__RootAssignment_33458); 
             after(grammarAccess.getGrammarAccess().getRootBlockIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGrammarAccess().getRootBlockCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__RootAssignment_3"


    // $ANTLR start "rule__Grammar__ElementsAssignment_5"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1746:1: rule__Grammar__ElementsAssignment_5 : ( ruleElement ) ;
    public final void rule__Grammar__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1750:1: ( ( ruleElement ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1751:1: ( ruleElement )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1751:1: ( ruleElement )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1752:1: ruleElement
            {
             before(grammarAccess.getGrammarAccess().getElementsElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__Grammar__ElementsAssignment_53493);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getGrammarAccess().getElementsElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grammar__ElementsAssignment_5"


    // $ANTLR start "rule__Block__NameAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1761:1: rule__Block__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Block__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1765:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1766:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1766:1: ( RULE_ID )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1767:1: RULE_ID
            {
             before(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Block__NameAssignment_13524); 
             after(grammarAccess.getBlockAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__NameAssignment_1"


    // $ANTLR start "rule__Block__ColumnsAssignment_3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1776:1: rule__Block__ColumnsAssignment_3 : ( ruleColumn ) ;
    public final void rule__Block__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1780:1: ( ( ruleColumn ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1781:1: ( ruleColumn )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1781:1: ( ruleColumn )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1782:1: ruleColumn
            {
             before(grammarAccess.getBlockAccess().getColumnsColumnParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleColumn_in_rule__Block__ColumnsAssignment_33555);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getColumnsColumnParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__ColumnsAssignment_3"


    // $ANTLR start "rule__Column__NameAssignment_0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1791:1: rule__Column__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Column__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1795:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1796:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1796:1: ( RULE_ID )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1797:1: RULE_ID
            {
             before(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Column__NameAssignment_03586); 
             after(grammarAccess.getColumnAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__NameAssignment_0"


    // $ANTLR start "rule__Column__MultipleAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1806:1: rule__Column__MultipleAssignment_1 : ( ( '*' ) ) ;
    public final void rule__Column__MultipleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1810:1: ( ( ( '*' ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1811:1: ( ( '*' ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1811:1: ( ( '*' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1812:1: ( '*' )
            {
             before(grammarAccess.getColumnAccess().getMultipleAsteriskKeyword_1_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1813:1: ( '*' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1814:1: '*'
            {
             before(grammarAccess.getColumnAccess().getMultipleAsteriskKeyword_1_0()); 
            match(input,23,FOLLOW_23_in_rule__Column__MultipleAssignment_13622); 
             after(grammarAccess.getColumnAccess().getMultipleAsteriskKeyword_1_0()); 

            }

             after(grammarAccess.getColumnAccess().getMultipleAsteriskKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__MultipleAssignment_1"


    // $ANTLR start "rule__Column__DefAssignment_2"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1829:1: rule__Column__DefAssignment_2 : ( ruleColumnDefinition ) ;
    public final void rule__Column__DefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1833:1: ( ( ruleColumnDefinition ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1834:1: ( ruleColumnDefinition )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1834:1: ( ruleColumnDefinition )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1835:1: ruleColumnDefinition
            {
             before(grammarAccess.getColumnAccess().getDefColumnDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleColumnDefinition_in_rule__Column__DefAssignment_23661);
            ruleColumnDefinition();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getDefColumnDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__DefAssignment_2"


    // $ANTLR start "rule__MandatoryColumn__SpecAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1844:1: rule__MandatoryColumn__SpecAssignment_1 : ( ruleColumnSpec ) ;
    public final void rule__MandatoryColumn__SpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1848:1: ( ( ruleColumnSpec ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1849:1: ( ruleColumnSpec )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1849:1: ( ruleColumnSpec )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1850:1: ruleColumnSpec
            {
             before(grammarAccess.getMandatoryColumnAccess().getSpecColumnSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColumnSpec_in_rule__MandatoryColumn__SpecAssignment_13692);
            ruleColumnSpec();

            state._fsp--;

             after(grammarAccess.getMandatoryColumnAccess().getSpecColumnSpecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryColumn__SpecAssignment_1"


    // $ANTLR start "rule__OptionalColumn__SpecAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1859:1: rule__OptionalColumn__SpecAssignment_1 : ( ruleColumnSpec ) ;
    public final void rule__OptionalColumn__SpecAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1863:1: ( ( ruleColumnSpec ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1864:1: ( ruleColumnSpec )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1864:1: ( ruleColumnSpec )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1865:1: ruleColumnSpec
            {
             before(grammarAccess.getOptionalColumnAccess().getSpecColumnSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleColumnSpec_in_rule__OptionalColumn__SpecAssignment_13723);
            ruleColumnSpec();

            state._fsp--;

             after(grammarAccess.getOptionalColumnAccess().getSpecColumnSpecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalColumn__SpecAssignment_1"


    // $ANTLR start "rule__RowSpec__HeaderAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1874:1: rule__RowSpec__HeaderAssignment_1 : ( RULE_STRING ) ;
    public final void rule__RowSpec__HeaderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1878:1: ( ( RULE_STRING ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1879:1: ( RULE_STRING )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1879:1: ( RULE_STRING )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1880:1: RULE_STRING
            {
             before(grammarAccess.getRowSpecAccess().getHeaderSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RowSpec__HeaderAssignment_13754); 
             after(grammarAccess.getRowSpecAccess().getHeaderSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__HeaderAssignment_1"


    // $ANTLR start "rule__RowSpec__SyntaxAssignment_3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1889:1: rule__RowSpec__SyntaxAssignment_3 : ( ruleSyntax ) ;
    public final void rule__RowSpec__SyntaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1893:1: ( ( ruleSyntax ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1894:1: ( ruleSyntax )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1894:1: ( ruleSyntax )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1895:1: ruleSyntax
            {
             before(grammarAccess.getRowSpecAccess().getSyntaxSyntaxParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSyntax_in_rule__RowSpec__SyntaxAssignment_33785);
            ruleSyntax();

            state._fsp--;

             after(grammarAccess.getRowSpecAccess().getSyntaxSyntaxParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RowSpec__SyntaxAssignment_3"


    // $ANTLR start "rule__BlockSpec__KindAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1904:1: rule__BlockSpec__KindAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__BlockSpec__KindAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1908:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1909:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1909:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1910:1: ( RULE_ID )
            {
             before(grammarAccess.getBlockSpecAccess().getKindBlockCrossReference_1_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1911:1: ( RULE_ID )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1912:1: RULE_ID
            {
             before(grammarAccess.getBlockSpecAccess().getKindBlockIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BlockSpec__KindAssignment_13820); 
             after(grammarAccess.getBlockSpecAccess().getKindBlockIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getBlockSpecAccess().getKindBlockCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlockSpec__KindAssignment_1"


    // $ANTLR start "rule__Syntax__Is_idAssignment_0"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1923:1: rule__Syntax__Is_idAssignment_0 : ( ( 'ID' ) ) ;
    public final void rule__Syntax__Is_idAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1927:1: ( ( ( 'ID' ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1928:1: ( ( 'ID' ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1928:1: ( ( 'ID' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1929:1: ( 'ID' )
            {
             before(grammarAccess.getSyntaxAccess().getIs_idIDKeyword_0_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1930:1: ( 'ID' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1931:1: 'ID'
            {
             before(grammarAccess.getSyntaxAccess().getIs_idIDKeyword_0_0()); 
            match(input,24,FOLLOW_24_in_rule__Syntax__Is_idAssignment_03860); 
             after(grammarAccess.getSyntaxAccess().getIs_idIDKeyword_0_0()); 

            }

             after(grammarAccess.getSyntaxAccess().getIs_idIDKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Is_idAssignment_0"


    // $ANTLR start "rule__Syntax__Is_stringAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1946:1: rule__Syntax__Is_stringAssignment_1 : ( ( 'STR' ) ) ;
    public final void rule__Syntax__Is_stringAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1950:1: ( ( ( 'STR' ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1951:1: ( ( 'STR' ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1951:1: ( ( 'STR' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1952:1: ( 'STR' )
            {
             before(grammarAccess.getSyntaxAccess().getIs_stringSTRKeyword_1_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1953:1: ( 'STR' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1954:1: 'STR'
            {
             before(grammarAccess.getSyntaxAccess().getIs_stringSTRKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Syntax__Is_stringAssignment_13904); 
             after(grammarAccess.getSyntaxAccess().getIs_stringSTRKeyword_1_0()); 

            }

             after(grammarAccess.getSyntaxAccess().getIs_stringSTRKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Is_stringAssignment_1"


    // $ANTLR start "rule__Syntax__Is_intAssignment_2"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1969:1: rule__Syntax__Is_intAssignment_2 : ( ( 'INT' ) ) ;
    public final void rule__Syntax__Is_intAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1973:1: ( ( ( 'INT' ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1974:1: ( ( 'INT' ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1974:1: ( ( 'INT' ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1975:1: ( 'INT' )
            {
             before(grammarAccess.getSyntaxAccess().getIs_intINTKeyword_2_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1976:1: ( 'INT' )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1977:1: 'INT'
            {
             before(grammarAccess.getSyntaxAccess().getIs_intINTKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Syntax__Is_intAssignment_23948); 
             after(grammarAccess.getSyntaxAccess().getIs_intINTKeyword_2_0()); 

            }

             after(grammarAccess.getSyntaxAccess().getIs_intINTKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__Is_intAssignment_2"


    // $ANTLR start "rule__Syntax__TokenAssignment_3_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1992:1: rule__Syntax__TokenAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__Syntax__TokenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1996:1: ( ( RULE_STRING ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1997:1: ( RULE_STRING )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1997:1: ( RULE_STRING )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:1998:1: RULE_STRING
            {
             before(grammarAccess.getSyntaxAccess().getTokenSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Syntax__TokenAssignment_3_13987); 
             after(grammarAccess.getSyntaxAccess().getTokenSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__TokenAssignment_3_1"


    // $ANTLR start "rule__Syntax__RuleAssignment_4_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2007:1: rule__Syntax__RuleAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Syntax__RuleAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2011:1: ( ( ( RULE_ID ) ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2012:1: ( ( RULE_ID ) )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2012:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2013:1: ( RULE_ID )
            {
             before(grammarAccess.getSyntaxAccess().getRuleRuleCrossReference_4_1_0()); 
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2014:1: ( RULE_ID )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2015:1: RULE_ID
            {
             before(grammarAccess.getSyntaxAccess().getRuleRuleIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Syntax__RuleAssignment_4_14022); 
             after(grammarAccess.getSyntaxAccess().getRuleRuleIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSyntaxAccess().getRuleRuleCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Syntax__RuleAssignment_4_1"


    // $ANTLR start "rule__Rule__NameAssignment_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2026:1: rule__Rule__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rule__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2030:1: ( ( RULE_ID ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2031:1: ( RULE_ID )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2031:1: ( RULE_ID )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2032:1: RULE_ID
            {
             before(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_14057); 
             after(grammarAccess.getRuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__NameAssignment_1"


    // $ANTLR start "rule__Rule__AlternativesAssignment_3"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2041:1: rule__Rule__AlternativesAssignment_3 : ( ruleSyntaxSeq ) ;
    public final void rule__Rule__AlternativesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2045:1: ( ( ruleSyntaxSeq ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2046:1: ( ruleSyntaxSeq )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2046:1: ( ruleSyntaxSeq )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2047:1: ruleSyntaxSeq
            {
             before(grammarAccess.getRuleAccess().getAlternativesSyntaxSeqParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSyntaxSeq_in_rule__Rule__AlternativesAssignment_34088);
            ruleSyntaxSeq();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAlternativesSyntaxSeqParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AlternativesAssignment_3"


    // $ANTLR start "rule__Rule__AlternativesAssignment_4_1"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2056:1: rule__Rule__AlternativesAssignment_4_1 : ( ruleSyntaxSeq ) ;
    public final void rule__Rule__AlternativesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2060:1: ( ( ruleSyntaxSeq ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2061:1: ( ruleSyntaxSeq )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2061:1: ( ruleSyntaxSeq )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2062:1: ruleSyntaxSeq
            {
             before(grammarAccess.getRuleAccess().getAlternativesSyntaxSeqParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSyntaxSeq_in_rule__Rule__AlternativesAssignment_4_14119);
            ruleSyntaxSeq();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAlternativesSyntaxSeqParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AlternativesAssignment_4_1"


    // $ANTLR start "rule__SyntaxSeq__PartsAssignment"
    // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2071:1: rule__SyntaxSeq__PartsAssignment : ( ruleSyntax ) ;
    public final void rule__SyntaxSeq__PartsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2075:1: ( ( ruleSyntax ) )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2076:1: ( ruleSyntax )
            {
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2076:1: ( ruleSyntax )
            // ../dk.sdu.mmmi.sgl.ui/src-gen/dk/sdu/mmmi/sgl/ui/contentassist/antlr/internal/InternalSpreadsheetGrammarLanguage.g:2077:1: ruleSyntax
            {
             before(grammarAccess.getSyntaxSeqAccess().getPartsSyntaxParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSyntax_in_rule__SyntaxSeq__PartsAssignment4150);
            ruleSyntax();

            state._fsp--;

             after(grammarAccess.getSyntaxSeqAccess().getPartsSyntaxParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntaxSeq__PartsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleGrammar_in_entryRuleGrammar61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrammar68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grammar__Group__0_in_ruleGrammar94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_entryRuleBlock181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlock188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleBlock214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumn248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__0_in_ruleColumn274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDefinition_in_entryRuleColumnDefinition301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnDefinition308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnDefinition__Alternatives_in_ruleColumnDefinition334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryColumn_in_entryRuleMandatoryColumn361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatoryColumn368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryColumn__Group__0_in_ruleMandatoryColumn394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalColumn_in_entryRuleOptionalColumn421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptionalColumn428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalColumn__Group__0_in_ruleOptionalColumn454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnSpec_in_entryRuleColumnSpec481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleColumnSpec488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ColumnSpec__Alternatives_in_ruleColumnSpec514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRowSpec_in_entryRuleRowSpec541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRowSpec548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__0_in_ruleRowSpec574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockSpec_in_entryRuleBlockSpec601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBlockSpec608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockSpec__Group__0_in_ruleBlockSpec634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_entryRuleSyntax661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntax668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Alternatives_in_ruleSyntax694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntaxSeq_in_entryRuleSyntaxSeq781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntaxSeq788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntaxSeq__PartsAssignment_in_ruleSyntaxSeq816 = new BitSet(new long[]{0x0000000007300002L});
    public static final BitSet FOLLOW_rule__SyntaxSeq__PartsAssignment_in_ruleSyntaxSeq828 = new BitSet(new long[]{0x0000000007300002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__Element__Alternatives867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Element__Alternatives884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatoryColumn_in_rule__ColumnDefinition__Alternatives916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptionalColumn_in_rule__ColumnDefinition__Alternatives933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRowSpec_in_rule__ColumnSpec__Alternatives965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlockSpec_in_rule__ColumnSpec__Alternatives982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Is_idAssignment_0_in_rule__Syntax__Alternatives1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Is_stringAssignment_1_in_rule__Syntax__Alternatives1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Is_intAssignment_2_in_rule__Syntax__Alternatives1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group_3__0_in_rule__Syntax__Alternatives1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group_4__0_in_rule__Syntax__Alternatives1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grammar__Group__0__Impl_in_rule__Grammar__Group__01117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Grammar__Group__1_in_rule__Grammar__Group__01120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Grammar__Group__0__Impl1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grammar__Group__1__Impl_in_rule__Grammar__Group__11179 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Grammar__Group__2_in_rule__Grammar__Group__11182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grammar__NameAssignment_1_in_rule__Grammar__Group__1__Impl1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grammar__Group__2__Impl_in_rule__Grammar__Group__21239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Grammar__Group__3_in_rule__Grammar__Group__21242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Grammar__Group__2__Impl1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grammar__Group__3__Impl_in_rule__Grammar__Group__31301 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Grammar__Group__4_in_rule__Grammar__Group__31304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grammar__RootAssignment_3_in_rule__Grammar__Group__3__Impl1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grammar__Group__4__Impl_in_rule__Grammar__Group__41361 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_rule__Grammar__Group__5_in_rule__Grammar__Group__41364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Grammar__Group__4__Impl1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grammar__Group__5__Impl_in_rule__Grammar__Group__51423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grammar__ElementsAssignment_5_in_rule__Grammar__Group__5__Impl1450 = new BitSet(new long[]{0x0000000000204002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__01493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__01496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Block__Group__0__Impl1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__11555 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__11558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__NameAssignment_1_in_rule__Block__Group__1__Impl1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__21615 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__21618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Block__Group__2__Impl1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__31677 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rule__Block__Group__4_in_rule__Block__Group__31680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__ColumnsAssignment_3_in_rule__Block__Group__3__Impl1707 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Block__Group__4__Impl_in_rule__Block__Group__41738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Block__Group__4__Impl1766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__01807 = new BitSet(new long[]{0x0000000000860000L});
    public static final BitSet FOLLOW_rule__Column__Group__1_in_rule__Column__Group__01810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__NameAssignment_0_in_rule__Column__Group__0__Impl1837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__11867 = new BitSet(new long[]{0x0000000000860000L});
    public static final BitSet FOLLOW_rule__Column__Group__2_in_rule__Column__Group__11870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__MultipleAssignment_1_in_rule__Column__Group__1__Impl1897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__21928 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Column__Group__3_in_rule__Column__Group__21931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__DefAssignment_2_in_rule__Column__Group__2__Impl1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__31988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Column__Group__3__Impl2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryColumn__Group__0__Impl_in_rule__MandatoryColumn__Group__02055 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_rule__MandatoryColumn__Group__1_in_rule__MandatoryColumn__Group__02058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__MandatoryColumn__Group__0__Impl2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryColumn__Group__1__Impl_in_rule__MandatoryColumn__Group__12117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MandatoryColumn__SpecAssignment_1_in_rule__MandatoryColumn__Group__1__Impl2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalColumn__Group__0__Impl_in_rule__OptionalColumn__Group__02178 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_rule__OptionalColumn__Group__1_in_rule__OptionalColumn__Group__02181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__OptionalColumn__Group__0__Impl2209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalColumn__Group__1__Impl_in_rule__OptionalColumn__Group__12240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OptionalColumn__SpecAssignment_1_in_rule__OptionalColumn__Group__1__Impl2267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__0__Impl_in_rule__RowSpec__Group__02301 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__1_in_rule__RowSpec__Group__02304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RowSpec__Group__0__Impl2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__1__Impl_in_rule__RowSpec__Group__12363 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__2_in_rule__RowSpec__Group__12366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__HeaderAssignment_1_in_rule__RowSpec__Group__1__Impl2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__2__Impl_in_rule__RowSpec__Group__22423 = new BitSet(new long[]{0x0000000007300000L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__3_in_rule__RowSpec__Group__22426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RowSpec__Group__2__Impl2454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__Group__3__Impl_in_rule__RowSpec__Group__32485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RowSpec__SyntaxAssignment_3_in_rule__RowSpec__Group__3__Impl2512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockSpec__Group__0__Impl_in_rule__BlockSpec__Group__02550 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BlockSpec__Group__1_in_rule__BlockSpec__Group__02553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BlockSpec__Group__0__Impl2581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockSpec__Group__1__Impl_in_rule__BlockSpec__Group__12612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BlockSpec__KindAssignment_1_in_rule__BlockSpec__Group__1__Impl2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group_3__0__Impl_in_rule__Syntax__Group_3__02673 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Syntax__Group_3__1_in_rule__Syntax__Group_3__02676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Syntax__Group_3__0__Impl2704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group_3__1__Impl_in_rule__Syntax__Group_3__12735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__TokenAssignment_3_1_in_rule__Syntax__Group_3__1__Impl2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group_4__0__Impl_in_rule__Syntax__Group_4__02796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Syntax__Group_4__1_in_rule__Syntax__Group_4__02799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Syntax__Group_4__0__Impl2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__Group_4__1__Impl_in_rule__Syntax__Group_4__12858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Syntax__RuleAssignment_4_1_in_rule__Syntax__Group_4__1__Impl2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Rule__Group__0__Impl2950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12981 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__NameAssignment_1_in_rule__Rule__Group__1__Impl3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__23041 = new BitSet(new long[]{0x0000000007300000L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__23044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Rule__Group__2__Impl3072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__33103 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__33106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__AlternativesAssignment_3_in_rule__Rule__Group__3__Impl3133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__43163 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__43166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4__0_in_rule__Rule__Group__4__Impl3193 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__53224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Rule__Group__5__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4__0__Impl_in_rule__Rule__Group_4__03295 = new BitSet(new long[]{0x0000000007300000L});
    public static final BitSet FOLLOW_rule__Rule__Group_4__1_in_rule__Rule__Group_4__03298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Rule__Group_4__0__Impl3326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_4__1__Impl_in_rule__Rule__Group_4__13357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__AlternativesAssignment_4_1_in_rule__Rule__Group_4__1__Impl3384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Grammar__NameAssignment_13423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Grammar__RootAssignment_33458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__Grammar__ElementsAssignment_53493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Block__NameAssignment_13524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumn_in_rule__Block__ColumnsAssignment_33555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Column__NameAssignment_03586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Column__MultipleAssignment_13622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnDefinition_in_rule__Column__DefAssignment_23661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnSpec_in_rule__MandatoryColumn__SpecAssignment_13692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleColumnSpec_in_rule__OptionalColumn__SpecAssignment_13723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RowSpec__HeaderAssignment_13754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_rule__RowSpec__SyntaxAssignment_33785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BlockSpec__KindAssignment_13820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Syntax__Is_idAssignment_03860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Syntax__Is_stringAssignment_13904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Syntax__Is_intAssignment_23948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Syntax__TokenAssignment_3_13987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Syntax__RuleAssignment_4_14022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rule__NameAssignment_14057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntaxSeq_in_rule__Rule__AlternativesAssignment_34088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntaxSeq_in_rule__Rule__AlternativesAssignment_4_14119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntax_in_rule__SyntaxSeq__PartsAssignment4150 = new BitSet(new long[]{0x0000000000000002L});

}