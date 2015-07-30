package com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr.internal; 

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
import com.parallels.aps.ide.rqleditor.xtext.rql.services.RQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRQLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ALPHA", "RULE_DIGIT", "RULE_WSP", "RULE_LOGICAL_OP_ALIASES", "RULE_XDIGIT", "','", "'&'", "';'", "'|'", "'ne'", "'eq'", "'lt'", "'le'", "'gt'", "'ge'", "'like'", "'!='", "'='", "'<'", "'<='", "'>'", "'>='", "'select'", "'sort'", "'limit'", "'implementing'", "'composing'", "'isnull'", "'in'", "'out'", "'true'", "'false'", "'empty'", "'null'", "'-'", "'.'", "'_'", "'~'", "'$'", "':'", "'*'", "'+'", "'?'", "'/'", "'@'", "'('", "')'", "'%'"
    };
    public static final int T__50=50;
    public static final int RULE_WSP=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int RULE_LOGICAL_OP_ALIASES=7;
    public static final int RULE_DIGIT=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_ALPHA=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_XDIGIT=8;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRQLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g"; }


     
     	private RQLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RQLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:62:1: ( ruleModel EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:77:1: ( rule__Model__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel100);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAnd"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:89:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:90:1: ( ruleAnd EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:91:1: ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd127);
            ruleAnd();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:98:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:102:2: ( ( ( rule__And__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:103:1: ( ( rule__And__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:103:1: ( ( rule__And__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:104:1: ( rule__And__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:105:1: ( rule__And__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:105:2: rule__And__Group__0
            {
            pushFollow(FOLLOW_rule__And__Group__0_in_ruleAnd160);
            rule__And__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getGroup()); 
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:117:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:118:1: ( ruleOr EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:119:1: ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr187);
            ruleOr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr194); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:126:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:130:2: ( ( ( rule__Or__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:131:1: ( ( rule__Or__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:131:1: ( ( rule__Or__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:132:1: ( rule__Or__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:133:1: ( rule__Or__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:133:2: rule__Or__Group__0
            {
            pushFollow(FOLLOW_rule__Or__Group__0_in_ruleOr220);
            rule__Or__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getGroup()); 
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleHoOperand"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:145:1: entryRuleHoOperand : ruleHoOperand EOF ;
    public final void entryRuleHoOperand() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:146:1: ( ruleHoOperand EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:147:1: ruleHoOperand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandRule()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_entryRuleHoOperand247);
            ruleHoOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHoOperandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHoOperand254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleHoOperand"


    // $ANTLR start "ruleHoOperand"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:154:1: ruleHoOperand : ( ( rule__HoOperand__Group__0 ) ) ;
    public final void ruleHoOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:158:2: ( ( ( rule__HoOperand__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:159:1: ( ( rule__HoOperand__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:159:1: ( ( rule__HoOperand__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:160:1: ( rule__HoOperand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:161:1: ( rule__HoOperand__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:161:2: rule__HoOperand__Group__0
            {
            pushFollow(FOLLOW_rule__HoOperand__Group__0_in_ruleHoOperand280);
            rule__HoOperand__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHoOperandAccess().getGroup()); 
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
    // $ANTLR end "ruleHoOperand"


    // $ANTLR start "entryRuleHigherOrderCall"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:173:1: entryRuleHigherOrderCall : ruleHigherOrderCall EOF ;
    public final void entryRuleHigherOrderCall() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:174:1: ( ruleHigherOrderCall EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:175:1: ruleHigherOrderCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallRule()); 
            }
            pushFollow(FOLLOW_ruleHigherOrderCall_in_entryRuleHigherOrderCall307);
            ruleHigherOrderCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigherOrderCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHigherOrderCall314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleHigherOrderCall"


    // $ANTLR start "ruleHigherOrderCall"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:182:1: ruleHigherOrderCall : ( ( rule__HigherOrderCall__Group__0 ) ) ;
    public final void ruleHigherOrderCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:186:2: ( ( ( rule__HigherOrderCall__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:187:1: ( ( rule__HigherOrderCall__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:187:1: ( ( rule__HigherOrderCall__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:188:1: ( rule__HigherOrderCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:189:1: ( rule__HigherOrderCall__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:189:2: rule__HigherOrderCall__Group__0
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__0_in_ruleHigherOrderCall340);
            rule__HigherOrderCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigherOrderCallAccess().getGroup()); 
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
    // $ANTLR end "ruleHigherOrderCall"


    // $ANTLR start "entryRuleBinaryOpAliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:201:1: entryRuleBinaryOpAliases : ruleBinaryOpAliases EOF ;
    public final void entryRuleBinaryOpAliases() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:202:1: ( ruleBinaryOpAliases EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:203:1: ruleBinaryOpAliases EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOpAliasesRule()); 
            }
            pushFollow(FOLLOW_ruleBinaryOpAliases_in_entryRuleBinaryOpAliases367);
            ruleBinaryOpAliases();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryOpAliasesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOpAliases374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBinaryOpAliases"


    // $ANTLR start "ruleBinaryOpAliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:210:1: ruleBinaryOpAliases : ( ( rule__BinaryOpAliases__Alternatives ) ) ;
    public final void ruleBinaryOpAliases() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:214:2: ( ( ( rule__BinaryOpAliases__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:215:1: ( ( rule__BinaryOpAliases__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:215:1: ( ( rule__BinaryOpAliases__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:216:1: ( rule__BinaryOpAliases__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOpAliasesAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:217:1: ( rule__BinaryOpAliases__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:217:2: rule__BinaryOpAliases__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryOpAliases__Alternatives_in_ruleBinaryOpAliases400);
            rule__BinaryOpAliases__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryOpAliasesAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBinaryOpAliases"


    // $ANTLR start "entryRuleCompOps"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:229:1: entryRuleCompOps : ruleCompOps EOF ;
    public final void entryRuleCompOps() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:230:1: ( ruleCompOps EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:231:1: ruleCompOps EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOpsRule()); 
            }
            pushFollow(FOLLOW_ruleCompOps_in_entryRuleCompOps427);
            ruleCompOps();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOpsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompOps434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCompOps"


    // $ANTLR start "ruleCompOps"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:238:1: ruleCompOps : ( ( rule__CompOps__Alternatives ) ) ;
    public final void ruleCompOps() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:242:2: ( ( ( rule__CompOps__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:243:1: ( ( rule__CompOps__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:243:1: ( ( rule__CompOps__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:244:1: ( rule__CompOps__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOpsAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:245:1: ( rule__CompOps__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:245:2: rule__CompOps__Alternatives
            {
            pushFollow(FOLLOW_rule__CompOps__Alternatives_in_ruleCompOps460);
            rule__CompOps__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOpsAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCompOps"


    // $ANTLR start "entryRuleComparison"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:257:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:258:1: ( ruleComparison EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:259:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison487);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:266:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:270:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:271:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:271:1: ( ( rule__Comparison__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:272:1: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:273:1: ( rule__Comparison__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:273:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison520);
            rule__Comparison__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getGroup()); 
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleCallOperator"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:285:1: entryRuleCallOperator : ruleCallOperator EOF ;
    public final void entryRuleCallOperator() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:286:1: ( ruleCallOperator EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:287:1: ruleCallOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCallOperator_in_entryRuleCallOperator547);
            ruleCallOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallOperator554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCallOperator"


    // $ANTLR start "ruleCallOperator"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:294:1: ruleCallOperator : ( ( rule__CallOperator__Group__0 ) ) ;
    public final void ruleCallOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:298:2: ( ( ( rule__CallOperator__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:299:1: ( ( rule__CallOperator__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:299:1: ( ( rule__CallOperator__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:300:1: ( rule__CallOperator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:301:1: ( rule__CallOperator__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:301:2: rule__CallOperator__Group__0
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__0_in_ruleCallOperator580);
            rule__CallOperator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallOperatorAccess().getGroup()); 
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
    // $ANTLR end "ruleCallOperator"


    // $ANTLR start "entryRulePredicate"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:313:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:314:1: ( rulePredicate EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:315:1: rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate607);
            rulePredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate614); if (state.failed) return ;

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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:322:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:326:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:327:1: ( ( rule__Predicate__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:327:1: ( ( rule__Predicate__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:328:1: ( rule__Predicate__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:329:1: ( rule__Predicate__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:329:2: rule__Predicate__Group__0
            {
            pushFollow(FOLLOW_rule__Predicate__Group__0_in_rulePredicate640);
            rule__Predicate__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getGroup()); 
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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRulePredTbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:341:1: entryRulePredTbl : rulePredTbl EOF ;
    public final void entryRulePredTbl() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:342:1: ( rulePredTbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:343:1: rulePredTbl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredTblRule()); 
            }
            pushFollow(FOLLOW_rulePredTbl_in_entryRulePredTbl667);
            rulePredTbl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredTblRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredTbl674); if (state.failed) return ;

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
    // $ANTLR end "entryRulePredTbl"


    // $ANTLR start "rulePredTbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:350:1: rulePredTbl : ( ( rule__PredTbl__Alternatives ) ) ;
    public final void rulePredTbl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:354:2: ( ( ( rule__PredTbl__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:355:1: ( ( rule__PredTbl__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:355:1: ( ( rule__PredTbl__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:356:1: ( rule__PredTbl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredTblAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:357:1: ( rule__PredTbl__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:357:2: rule__PredTbl__Alternatives
            {
            pushFollow(FOLLOW_rule__PredTbl__Alternatives_in_rulePredTbl700);
            rule__PredTbl__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredTblAccess().getAlternatives()); 
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
    // $ANTLR end "rulePredTbl"


    // $ANTLR start "entryRulePrimaryExpr"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:369:1: entryRulePrimaryExpr : rulePrimaryExpr EOF ;
    public final void entryRulePrimaryExpr() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:370:1: ( rulePrimaryExpr EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:371:1: rulePrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr727);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpr734); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:378:1: rulePrimaryExpr : ( ( rule__PrimaryExpr__Group__0 ) ) ;
    public final void rulePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:382:2: ( ( ( rule__PrimaryExpr__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:383:1: ( ( rule__PrimaryExpr__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:383:1: ( ( rule__PrimaryExpr__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:384:1: ( rule__PrimaryExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:385:1: ( rule__PrimaryExpr__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:385:2: rule__PrimaryExpr__Group__0
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__0_in_rulePrimaryExpr760);
            rule__PrimaryExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getGroup()); 
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
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleFunctionsTbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:397:1: entryRuleFunctionsTbl : ruleFunctionsTbl EOF ;
    public final void entryRuleFunctionsTbl() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:398:1: ( ruleFunctionsTbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:399:1: ruleFunctionsTbl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionsTblRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionsTbl_in_entryRuleFunctionsTbl787);
            ruleFunctionsTbl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionsTblRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionsTbl794); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFunctionsTbl"


    // $ANTLR start "ruleFunctionsTbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:406:1: ruleFunctionsTbl : ( ( rule__FunctionsTbl__Alternatives ) ) ;
    public final void ruleFunctionsTbl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:410:2: ( ( ( rule__FunctionsTbl__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:411:1: ( ( rule__FunctionsTbl__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:411:1: ( ( rule__FunctionsTbl__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:412:1: ( rule__FunctionsTbl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionsTblAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:413:1: ( rule__FunctionsTbl__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:413:2: rule__FunctionsTbl__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionsTbl__Alternatives_in_ruleFunctionsTbl820);
            rule__FunctionsTbl__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionsTblAccess().getAlternatives()); 
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
    // $ANTLR end "ruleFunctionsTbl"


    // $ANTLR start "entryRuleConstFuncTbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:425:1: entryRuleConstFuncTbl : ruleConstFuncTbl EOF ;
    public final void entryRuleConstFuncTbl() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:426:1: ( ruleConstFuncTbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:427:1: ruleConstFuncTbl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstFuncTblRule()); 
            }
            pushFollow(FOLLOW_ruleConstFuncTbl_in_entryRuleConstFuncTbl847);
            ruleConstFuncTbl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstFuncTblRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstFuncTbl854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConstFuncTbl"


    // $ANTLR start "ruleConstFuncTbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:434:1: ruleConstFuncTbl : ( ( rule__ConstFuncTbl__Alternatives ) ) ;
    public final void ruleConstFuncTbl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:438:2: ( ( ( rule__ConstFuncTbl__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:439:1: ( ( rule__ConstFuncTbl__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:439:1: ( ( rule__ConstFuncTbl__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:440:1: ( rule__ConstFuncTbl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstFuncTblAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:441:1: ( rule__ConstFuncTbl__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:441:2: rule__ConstFuncTbl__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstFuncTbl__Alternatives_in_ruleConstFuncTbl880);
            rule__ConstFuncTbl__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstFuncTblAccess().getAlternatives()); 
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
    // $ANTLR end "ruleConstFuncTbl"


    // $ANTLR start "entryRuleArray"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:453:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:454:1: ( ruleArray EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:455:1: ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray907);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray914); if (state.failed) return ;

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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:462:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:466:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:467:1: ( ( rule__Array__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:467:1: ( ( rule__Array__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:468:1: ( rule__Array__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:469:1: ( rule__Array__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:469:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray940);
            rule__Array__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getGroup()); 
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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleNchar"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:481:1: entryRuleNchar : ruleNchar EOF ;
    public final void entryRuleNchar() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:482:1: ( ruleNchar EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:483:1: ruleNchar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNcharRule()); 
            }
            pushFollow(FOLLOW_ruleNchar_in_entryRuleNchar967);
            ruleNchar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNcharRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNchar974); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNchar"


    // $ANTLR start "ruleNchar"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:490:1: ruleNchar : ( ( rule__Nchar__Alternatives ) ) ;
    public final void ruleNchar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:494:2: ( ( ( rule__Nchar__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:495:1: ( ( rule__Nchar__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:495:1: ( ( rule__Nchar__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:496:1: ( rule__Nchar__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNcharAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:497:1: ( rule__Nchar__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:497:2: rule__Nchar__Alternatives
            {
            pushFollow(FOLLOW_rule__Nchar__Alternatives_in_ruleNchar1000);
            rule__Nchar__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNcharAccess().getAlternatives()); 
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
    // $ANTLR end "ruleNchar"


    // $ANTLR start "entryRulePct_encoded"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:509:1: entryRulePct_encoded : rulePct_encoded EOF ;
    public final void entryRulePct_encoded() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:510:1: ( rulePct_encoded EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:511:1: rulePct_encoded EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedRule()); 
            }
            pushFollow(FOLLOW_rulePct_encoded_in_entryRulePct_encoded1027);
            rulePct_encoded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPct_encodedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePct_encoded1034); if (state.failed) return ;

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
    // $ANTLR end "entryRulePct_encoded"


    // $ANTLR start "rulePct_encoded"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:518:1: rulePct_encoded : ( ( rule__Pct_encoded__Group__0 ) ) ;
    public final void rulePct_encoded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:522:2: ( ( ( rule__Pct_encoded__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:523:1: ( ( rule__Pct_encoded__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:523:1: ( ( rule__Pct_encoded__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:524:1: ( rule__Pct_encoded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:525:1: ( rule__Pct_encoded__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:525:2: rule__Pct_encoded__Group__0
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__0_in_rulePct_encoded1060);
            rule__Pct_encoded__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPct_encodedAccess().getGroup()); 
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
    // $ANTLR end "rulePct_encoded"


    // $ANTLR start "entryRuleStrval"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:537:1: entryRuleStrval : ruleStrval EOF ;
    public final void entryRuleStrval() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:538:1: ( ruleStrval EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:539:1: ruleStrval EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrvalRule()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_entryRuleStrval1087);
            ruleStrval();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrvalRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrval1094); if (state.failed) return ;

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
    // $ANTLR end "entryRuleStrval"


    // $ANTLR start "ruleStrval"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:546:1: ruleStrval : ( ( ( rule__Strval__Alternatives ) ) ( ( rule__Strval__Alternatives )* ) ) ;
    public final void ruleStrval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:550:2: ( ( ( ( rule__Strval__Alternatives ) ) ( ( rule__Strval__Alternatives )* ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:551:1: ( ( ( rule__Strval__Alternatives ) ) ( ( rule__Strval__Alternatives )* ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:551:1: ( ( ( rule__Strval__Alternatives ) ) ( ( rule__Strval__Alternatives )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:552:1: ( ( rule__Strval__Alternatives ) ) ( ( rule__Strval__Alternatives )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:552:1: ( ( rule__Strval__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:553:1: ( rule__Strval__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrvalAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:554:1: ( rule__Strval__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:554:2: rule__Strval__Alternatives
            {
            pushFollow(FOLLOW_rule__Strval__Alternatives_in_ruleStrval1122);
            rule__Strval__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrvalAccess().getAlternatives()); 
            }

            }

            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:557:1: ( ( rule__Strval__Alternatives )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:558:1: ( rule__Strval__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrvalAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:559:1: ( rule__Strval__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ALPHA && LA1_0<=RULE_DIGIT)||(LA1_0>=38 && LA1_0<=48)||LA1_0==51) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:559:2: rule__Strval__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Strval__Alternatives_in_ruleStrval1134);
            	    rule__Strval__Alternatives();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrvalAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleStrval"


    // $ANTLR start "rule__Model__Alternatives_1_0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:572:1: rule__Model__Alternatives_1_0 : ( ( ',' ) | ( '&' ) );
    public final void rule__Model__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:576:1: ( ( ',' ) | ( '&' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==9) ) {
                alt2=1;
            }
            else if ( (LA2_0==10) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:577:1: ( ',' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:577:1: ( ',' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:578:1: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getCommaKeyword_1_0_0()); 
                    }
                    match(input,9,FOLLOW_9_in_rule__Model__Alternatives_1_01174); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getCommaKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:585:6: ( '&' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:585:6: ( '&' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:586:1: '&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getAmpersandKeyword_1_0_1()); 
                    }
                    match(input,10,FOLLOW_10_in_rule__Model__Alternatives_1_01194); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getAmpersandKeyword_1_0_1()); 
                    }

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
    // $ANTLR end "rule__Model__Alternatives_1_0"


    // $ANTLR start "rule__Or__Alternatives_0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:598:1: rule__Or__Alternatives_0 : ( ( ';' ) | ( '|' ) );
    public final void rule__Or__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:602:1: ( ( ';' ) | ( '|' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:603:1: ( ';' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:603:1: ( ';' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:604:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getSemicolonKeyword_0_0()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Or__Alternatives_01229); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAccess().getSemicolonKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:611:6: ( '|' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:611:6: ( '|' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:612:1: '|'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getVerticalLineKeyword_0_1()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Or__Alternatives_01249); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAccess().getVerticalLineKeyword_0_1()); 
                    }

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
    // $ANTLR end "rule__Or__Alternatives_0"


    // $ANTLR start "rule__HoOperand__Alternatives_1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:624:1: rule__HoOperand__Alternatives_1 : ( ( ruleHigherOrderCall ) | ( ruleCallOperator ) | ( rulePredicate ) | ( ruleComparison ) | ( ( rule__HoOperand__Group_1_4__0 ) ) );
    public final void rule__HoOperand__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:628:1: ( ( ruleHigherOrderCall ) | ( ruleCallOperator ) | ( rulePredicate ) | ( ruleComparison ) | ( ( rule__HoOperand__Group_1_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case RULE_LOGICAL_OP_ALIASES:
                {
                alt4=1;
                }
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 31:
            case 32:
            case 33:
                {
                alt4=2;
                }
                break;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt4=3;
                }
                break;
            case RULE_ALPHA:
            case RULE_DIGIT:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 51:
                {
                alt4=4;
                }
                break;
            case 49:
                {
                alt4=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:629:1: ( ruleHigherOrderCall )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:629:1: ( ruleHigherOrderCall )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:630:1: ruleHigherOrderCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getHigherOrderCallParserRuleCall_1_0()); 
                    }
                    pushFollow(FOLLOW_ruleHigherOrderCall_in_rule__HoOperand__Alternatives_11283);
                    ruleHigherOrderCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHoOperandAccess().getHigherOrderCallParserRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:635:6: ( ruleCallOperator )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:635:6: ( ruleCallOperator )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:636:1: ruleCallOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getCallOperatorParserRuleCall_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleCallOperator_in_rule__HoOperand__Alternatives_11300);
                    ruleCallOperator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHoOperandAccess().getCallOperatorParserRuleCall_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:641:6: ( rulePredicate )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:641:6: ( rulePredicate )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:642:1: rulePredicate
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getPredicateParserRuleCall_1_2()); 
                    }
                    pushFollow(FOLLOW_rulePredicate_in_rule__HoOperand__Alternatives_11317);
                    rulePredicate();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHoOperandAccess().getPredicateParserRuleCall_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:647:6: ( ruleComparison )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:647:6: ( ruleComparison )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:648:1: ruleComparison
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getComparisonParserRuleCall_1_3()); 
                    }
                    pushFollow(FOLLOW_ruleComparison_in_rule__HoOperand__Alternatives_11334);
                    ruleComparison();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHoOperandAccess().getComparisonParserRuleCall_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:653:6: ( ( rule__HoOperand__Group_1_4__0 ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:653:6: ( ( rule__HoOperand__Group_1_4__0 ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:654:1: ( rule__HoOperand__Group_1_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getGroup_1_4()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:655:1: ( rule__HoOperand__Group_1_4__0 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:655:2: rule__HoOperand__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__HoOperand__Group_1_4__0_in_rule__HoOperand__Alternatives_11351);
                    rule__HoOperand__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHoOperandAccess().getGroup_1_4()); 
                    }

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
    // $ANTLR end "rule__HoOperand__Alternatives_1"


    // $ANTLR start "rule__HoOperand__Alternatives_1_4_2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:664:1: rule__HoOperand__Alternatives_1_4_2 : ( ( ( ( ruleAnd ) ) ( ( ruleAnd )* ) ) | ( ( ( ruleOr ) ) ( ( ruleOr )* ) ) );
    public final void rule__HoOperand__Alternatives_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:668:1: ( ( ( ( ruleAnd ) ) ( ( ruleAnd )* ) ) | ( ( ( ruleOr ) ) ( ( ruleOr )* ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==10) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=11 && LA7_0<=12)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:669:1: ( ( ( ruleAnd ) ) ( ( ruleAnd )* ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:669:1: ( ( ( ruleAnd ) ) ( ( ruleAnd )* ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:670:1: ( ( ruleAnd ) ) ( ( ruleAnd )* )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:670:1: ( ( ruleAnd ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:671:1: ( ruleAnd )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getAndParserRuleCall_1_4_2_0()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:672:1: ( ruleAnd )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:672:3: ruleAnd
                    {
                    pushFollow(FOLLOW_ruleAnd_in_rule__HoOperand__Alternatives_1_4_21387);
                    ruleAnd();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHoOperandAccess().getAndParserRuleCall_1_4_2_0()); 
                    }

                    }

                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:675:1: ( ( ruleAnd )* )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:676:1: ( ruleAnd )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getAndParserRuleCall_1_4_2_0()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:677:1: ( ruleAnd )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==10) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:677:3: ruleAnd
                    	    {
                    	    pushFollow(FOLLOW_ruleAnd_in_rule__HoOperand__Alternatives_1_4_21400);
                    	    ruleAnd();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHoOperandAccess().getAndParserRuleCall_1_4_2_0()); 
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:682:6: ( ( ( ruleOr ) ) ( ( ruleOr )* ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:682:6: ( ( ( ruleOr ) ) ( ( ruleOr )* ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:683:1: ( ( ruleOr ) ) ( ( ruleOr )* )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:683:1: ( ( ruleOr ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:684:1: ( ruleOr )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getOrParserRuleCall_1_4_2_1()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:685:1: ( ruleOr )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:685:3: ruleOr
                    {
                    pushFollow(FOLLOW_ruleOr_in_rule__HoOperand__Alternatives_1_4_21424);
                    ruleOr();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHoOperandAccess().getOrParserRuleCall_1_4_2_1()); 
                    }

                    }

                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:688:1: ( ( ruleOr )* )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:689:1: ( ruleOr )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getOrParserRuleCall_1_4_2_1()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:690:1: ( ruleOr )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:690:3: ruleOr
                    	    {
                    	    pushFollow(FOLLOW_ruleOr_in_rule__HoOperand__Alternatives_1_4_21437);
                    	    ruleOr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHoOperandAccess().getOrParserRuleCall_1_4_2_1()); 
                    }

                    }


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
    // $ANTLR end "rule__HoOperand__Alternatives_1_4_2"


    // $ANTLR start "rule__BinaryOpAliases__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:700:1: rule__BinaryOpAliases__Alternatives : ( ( 'ne' ) | ( 'eq' ) | ( 'lt' ) | ( 'le' ) | ( 'gt' ) | ( 'ge' ) | ( 'like' ) );
    public final void rule__BinaryOpAliases__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:704:1: ( ( 'ne' ) | ( 'eq' ) | ( 'lt' ) | ( 'le' ) | ( 'gt' ) | ( 'ge' ) | ( 'like' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            case 17:
                {
                alt8=5;
                }
                break;
            case 18:
                {
                alt8=6;
                }
                break;
            case 19:
                {
                alt8=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:705:1: ( 'ne' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:705:1: ( 'ne' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:706:1: 'ne'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getNeKeyword_0()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__BinaryOpAliases__Alternatives1474); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getNeKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:713:6: ( 'eq' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:713:6: ( 'eq' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:714:1: 'eq'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getEqKeyword_1()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__BinaryOpAliases__Alternatives1494); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getEqKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:721:6: ( 'lt' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:721:6: ( 'lt' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:722:1: 'lt'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getLtKeyword_2()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__BinaryOpAliases__Alternatives1514); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getLtKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:729:6: ( 'le' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:729:6: ( 'le' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:730:1: 'le'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getLeKeyword_3()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__BinaryOpAliases__Alternatives1534); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getLeKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:737:6: ( 'gt' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:737:6: ( 'gt' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:738:1: 'gt'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getGtKeyword_4()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__BinaryOpAliases__Alternatives1554); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getGtKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:745:6: ( 'ge' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:745:6: ( 'ge' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:746:1: 'ge'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getGeKeyword_5()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__BinaryOpAliases__Alternatives1574); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getGeKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:753:6: ( 'like' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:753:6: ( 'like' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:754:1: 'like'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getLikeKeyword_6()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__BinaryOpAliases__Alternatives1594); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getLikeKeyword_6()); 
                    }

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
    // $ANTLR end "rule__BinaryOpAliases__Alternatives"


    // $ANTLR start "rule__CompOps__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:766:1: rule__CompOps__Alternatives : ( ( '!=' ) | ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) );
    public final void rule__CompOps__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:770:1: ( ( '!=' ) | ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            case 24:
                {
                alt9=5;
                }
                break;
            case 25:
                {
                alt9=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:771:1: ( '!=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:771:1: ( '!=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:772:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getExclamationMarkEqualsSignKeyword_0()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__CompOps__Alternatives1629); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getExclamationMarkEqualsSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:779:6: ( '=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:779:6: ( '=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:780:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getEqualsSignKeyword_1()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__CompOps__Alternatives1649); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:787:6: ( '<' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:787:6: ( '<' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:788:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getLessThanSignKeyword_2()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__CompOps__Alternatives1669); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getLessThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:795:6: ( '<=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:795:6: ( '<=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:796:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__CompOps__Alternatives1689); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:803:6: ( '>' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:803:6: ( '>' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:804:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getGreaterThanSignKeyword_4()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__CompOps__Alternatives1709); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getGreaterThanSignKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:811:6: ( '>=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:811:6: ( '>=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:812:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__CompOps__Alternatives1729); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    }

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
    // $ANTLR end "rule__CompOps__Alternatives"


    // $ANTLR start "rule__Comparison__Alternatives_2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:824:1: rule__Comparison__Alternatives_2 : ( ( ( rule__Comparison__Group_2_0__0 ) ) | ( ruleCompOps ) );
    public final void rule__Comparison__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:828:1: ( ( ( rule__Comparison__Group_2_0__0 ) ) | ( ruleCompOps ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                int LA10_1 = input.LA(2);

                if ( ((LA10_1>=RULE_ALPHA && LA10_1<=RULE_WSP)||(LA10_1>=34 && LA10_1<=49)||LA10_1==51) ) {
                    alt10=2;
                }
                else if ( ((LA10_1>=13 && LA10_1<=19)) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==20||(LA10_0>=22 && LA10_0<=25)) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:829:1: ( ( rule__Comparison__Group_2_0__0 ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:829:1: ( ( rule__Comparison__Group_2_0__0 ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:830:1: ( rule__Comparison__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_2_0()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:831:1: ( rule__Comparison__Group_2_0__0 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:831:2: rule__Comparison__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_2_0__0_in_rule__Comparison__Alternatives_21763);
                    rule__Comparison__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:835:6: ( ruleCompOps )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:835:6: ( ruleCompOps )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:836:1: ruleCompOps
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getCompOpsParserRuleCall_2_1()); 
                    }
                    pushFollow(FOLLOW_ruleCompOps_in_rule__Comparison__Alternatives_21781);
                    ruleCompOps();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getCompOpsParserRuleCall_2_1()); 
                    }

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
    // $ANTLR end "rule__Comparison__Alternatives_2"


    // $ANTLR start "rule__CallOperator__Alternatives_0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:846:1: rule__CallOperator__Alternatives_0 : ( ( ruleBinaryOpAliases ) | ( ruleFunctionsTbl ) );
    public final void rule__CallOperator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:850:1: ( ( ruleBinaryOpAliases ) | ( ruleFunctionsTbl ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=13 && LA11_0<=19)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=31 && LA11_0<=33)) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:851:1: ( ruleBinaryOpAliases )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:851:1: ( ruleBinaryOpAliases )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:852:1: ruleBinaryOpAliases
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallOperatorAccess().getBinaryOpAliasesParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleBinaryOpAliases_in_rule__CallOperator__Alternatives_01813);
                    ruleBinaryOpAliases();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCallOperatorAccess().getBinaryOpAliasesParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:857:6: ( ruleFunctionsTbl )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:857:6: ( ruleFunctionsTbl )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:858:1: ruleFunctionsTbl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallOperatorAccess().getFunctionsTblParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionsTbl_in_rule__CallOperator__Alternatives_01830);
                    ruleFunctionsTbl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCallOperatorAccess().getFunctionsTblParserRuleCall_0_1()); 
                    }

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
    // $ANTLR end "rule__CallOperator__Alternatives_0"


    // $ANTLR start "rule__PredTbl__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:868:1: rule__PredTbl__Alternatives : ( ( 'select' ) | ( 'sort' ) | ( 'limit' ) | ( 'implementing' ) | ( 'composing' ) );
    public final void rule__PredTbl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:872:1: ( ( 'select' ) | ( 'sort' ) | ( 'limit' ) | ( 'implementing' ) | ( 'composing' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt12=1;
                }
                break;
            case 27:
                {
                alt12=2;
                }
                break;
            case 28:
                {
                alt12=3;
                }
                break;
            case 29:
                {
                alt12=4;
                }
                break;
            case 30:
                {
                alt12=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:873:1: ( 'select' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:873:1: ( 'select' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:874:1: 'select'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getSelectKeyword_0()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__PredTbl__Alternatives1863); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredTblAccess().getSelectKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:881:6: ( 'sort' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:881:6: ( 'sort' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:882:1: 'sort'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getSortKeyword_1()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__PredTbl__Alternatives1883); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredTblAccess().getSortKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:889:6: ( 'limit' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:889:6: ( 'limit' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:890:1: 'limit'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getLimitKeyword_2()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__PredTbl__Alternatives1903); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredTblAccess().getLimitKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:897:6: ( 'implementing' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:897:6: ( 'implementing' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:898:1: 'implementing'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getImplementingKeyword_3()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__PredTbl__Alternatives1923); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredTblAccess().getImplementingKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:905:6: ( 'composing' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:905:6: ( 'composing' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:906:1: 'composing'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getComposingKeyword_4()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__PredTbl__Alternatives1943); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredTblAccess().getComposingKeyword_4()); 
                    }

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
    // $ANTLR end "rule__PredTbl__Alternatives"


    // $ANTLR start "rule__PrimaryExpr__Alternatives_1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:918:1: rule__PrimaryExpr__Alternatives_1 : ( ( ( rule__PrimaryExpr__Group_1_0__0 ) ) | ( ruleArray ) | ( ruleStrval ) );
    public final void rule__PrimaryExpr__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:922:1: ( ( ( rule__PrimaryExpr__Group_1_0__0 ) ) | ( ruleArray ) | ( ruleStrval ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 34:
            case 35:
            case 36:
            case 37:
                {
                alt13=1;
                }
                break;
            case 49:
                {
                alt13=2;
                }
                break;
            case RULE_ALPHA:
            case RULE_DIGIT:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 51:
                {
                alt13=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:923:1: ( ( rule__PrimaryExpr__Group_1_0__0 ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:923:1: ( ( rule__PrimaryExpr__Group_1_0__0 ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:924:1: ( rule__PrimaryExpr__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getGroup_1_0()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:925:1: ( rule__PrimaryExpr__Group_1_0__0 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:925:2: rule__PrimaryExpr__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__0_in_rule__PrimaryExpr__Alternatives_11977);
                    rule__PrimaryExpr__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:929:6: ( ruleArray )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:929:6: ( ruleArray )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:930:1: ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getArrayParserRuleCall_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleArray_in_rule__PrimaryExpr__Alternatives_11995);
                    ruleArray();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getArrayParserRuleCall_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:935:6: ( ruleStrval )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:935:6: ( ruleStrval )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:936:1: ruleStrval
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getStrvalParserRuleCall_1_2()); 
                    }
                    pushFollow(FOLLOW_ruleStrval_in_rule__PrimaryExpr__Alternatives_12012);
                    ruleStrval();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getStrvalParserRuleCall_1_2()); 
                    }

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
    // $ANTLR end "rule__PrimaryExpr__Alternatives_1"


    // $ANTLR start "rule__FunctionsTbl__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:946:1: rule__FunctionsTbl__Alternatives : ( ( 'isnull' ) | ( 'in' ) | ( 'out' ) );
    public final void rule__FunctionsTbl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:950:1: ( ( 'isnull' ) | ( 'in' ) | ( 'out' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt14=1;
                }
                break;
            case 32:
                {
                alt14=2;
                }
                break;
            case 33:
                {
                alt14=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:951:1: ( 'isnull' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:951:1: ( 'isnull' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:952:1: 'isnull'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionsTblAccess().getIsnullKeyword_0()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__FunctionsTbl__Alternatives2045); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionsTblAccess().getIsnullKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:959:6: ( 'in' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:959:6: ( 'in' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:960:1: 'in'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionsTblAccess().getInKeyword_1()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__FunctionsTbl__Alternatives2065); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionsTblAccess().getInKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:967:6: ( 'out' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:967:6: ( 'out' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:968:1: 'out'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionsTblAccess().getOutKeyword_2()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__FunctionsTbl__Alternatives2085); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionsTblAccess().getOutKeyword_2()); 
                    }

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
    // $ANTLR end "rule__FunctionsTbl__Alternatives"


    // $ANTLR start "rule__ConstFuncTbl__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:980:1: rule__ConstFuncTbl__Alternatives : ( ( 'true' ) | ( 'false' ) | ( 'empty' ) | ( 'null' ) );
    public final void rule__ConstFuncTbl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:984:1: ( ( 'true' ) | ( 'false' ) | ( 'empty' ) | ( 'null' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt15=1;
                }
                break;
            case 35:
                {
                alt15=2;
                }
                break;
            case 36:
                {
                alt15=3;
                }
                break;
            case 37:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:985:1: ( 'true' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:985:1: ( 'true' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:986:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstFuncTblAccess().getTrueKeyword_0()); 
                    }
                    match(input,34,FOLLOW_34_in_rule__ConstFuncTbl__Alternatives2120); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstFuncTblAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:993:6: ( 'false' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:993:6: ( 'false' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:994:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstFuncTblAccess().getFalseKeyword_1()); 
                    }
                    match(input,35,FOLLOW_35_in_rule__ConstFuncTbl__Alternatives2140); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstFuncTblAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1001:6: ( 'empty' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1001:6: ( 'empty' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1002:1: 'empty'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstFuncTblAccess().getEmptyKeyword_2()); 
                    }
                    match(input,36,FOLLOW_36_in_rule__ConstFuncTbl__Alternatives2160); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstFuncTblAccess().getEmptyKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1009:6: ( 'null' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1009:6: ( 'null' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1010:1: 'null'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstFuncTblAccess().getNullKeyword_3()); 
                    }
                    match(input,37,FOLLOW_37_in_rule__ConstFuncTbl__Alternatives2180); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstFuncTblAccess().getNullKeyword_3()); 
                    }

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
    // $ANTLR end "rule__ConstFuncTbl__Alternatives"


    // $ANTLR start "rule__Nchar__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1022:1: rule__Nchar__Alternatives : ( ( RULE_ALPHA ) | ( RULE_DIGIT ) | ( '-' ) | ( '.' ) | ( '_' ) | ( '~' ) | ( '$' ) | ( ':' ) | ( '*' ) | ( '+' ) | ( '?' ) | ( '/' ) | ( '@' ) );
    public final void rule__Nchar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1026:1: ( ( RULE_ALPHA ) | ( RULE_DIGIT ) | ( '-' ) | ( '.' ) | ( '_' ) | ( '~' ) | ( '$' ) | ( ':' ) | ( '*' ) | ( '+' ) | ( '?' ) | ( '/' ) | ( '@' ) )
            int alt16=13;
            switch ( input.LA(1) ) {
            case RULE_ALPHA:
                {
                alt16=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            case 39:
                {
                alt16=4;
                }
                break;
            case 40:
                {
                alt16=5;
                }
                break;
            case 41:
                {
                alt16=6;
                }
                break;
            case 42:
                {
                alt16=7;
                }
                break;
            case 43:
                {
                alt16=8;
                }
                break;
            case 44:
                {
                alt16=9;
                }
                break;
            case 45:
                {
                alt16=10;
                }
                break;
            case 46:
                {
                alt16=11;
                }
                break;
            case 47:
                {
                alt16=12;
                }
                break;
            case 48:
                {
                alt16=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1027:1: ( RULE_ALPHA )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1027:1: ( RULE_ALPHA )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1028:1: RULE_ALPHA
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getALPHATerminalRuleCall_0()); 
                    }
                    match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rule__Nchar__Alternatives2214); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getALPHATerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1033:6: ( RULE_DIGIT )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1033:6: ( RULE_DIGIT )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1034:1: RULE_DIGIT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getDIGITTerminalRuleCall_1()); 
                    }
                    match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rule__Nchar__Alternatives2231); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getDIGITTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1039:6: ( '-' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1039:6: ( '-' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1040:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getHyphenMinusKeyword_2()); 
                    }
                    match(input,38,FOLLOW_38_in_rule__Nchar__Alternatives2249); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getHyphenMinusKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1047:6: ( '.' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1047:6: ( '.' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1048:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getFullStopKeyword_3()); 
                    }
                    match(input,39,FOLLOW_39_in_rule__Nchar__Alternatives2269); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getFullStopKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1055:6: ( '_' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1055:6: ( '_' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1056:1: '_'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().get_Keyword_4()); 
                    }
                    match(input,40,FOLLOW_40_in_rule__Nchar__Alternatives2289); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().get_Keyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1063:6: ( '~' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1063:6: ( '~' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1064:1: '~'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getTildeKeyword_5()); 
                    }
                    match(input,41,FOLLOW_41_in_rule__Nchar__Alternatives2309); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getTildeKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1071:6: ( '$' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1071:6: ( '$' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1072:1: '$'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getDollarSignKeyword_6()); 
                    }
                    match(input,42,FOLLOW_42_in_rule__Nchar__Alternatives2329); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getDollarSignKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1079:6: ( ':' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1079:6: ( ':' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1080:1: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getColonKeyword_7()); 
                    }
                    match(input,43,FOLLOW_43_in_rule__Nchar__Alternatives2349); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getColonKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1087:6: ( '*' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1087:6: ( '*' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1088:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getAsteriskKeyword_8()); 
                    }
                    match(input,44,FOLLOW_44_in_rule__Nchar__Alternatives2369); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getAsteriskKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1095:6: ( '+' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1095:6: ( '+' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1096:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getPlusSignKeyword_9()); 
                    }
                    match(input,45,FOLLOW_45_in_rule__Nchar__Alternatives2389); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getPlusSignKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1103:6: ( '?' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1103:6: ( '?' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1104:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getQuestionMarkKeyword_10()); 
                    }
                    match(input,46,FOLLOW_46_in_rule__Nchar__Alternatives2409); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getQuestionMarkKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1111:6: ( '/' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1111:6: ( '/' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1112:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getSolidusKeyword_11()); 
                    }
                    match(input,47,FOLLOW_47_in_rule__Nchar__Alternatives2429); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getSolidusKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1119:6: ( '@' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1119:6: ( '@' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1120:1: '@'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getCommercialAtKeyword_12()); 
                    }
                    match(input,48,FOLLOW_48_in_rule__Nchar__Alternatives2449); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getCommercialAtKeyword_12()); 
                    }

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
    // $ANTLR end "rule__Nchar__Alternatives"


    // $ANTLR start "rule__Strval__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1132:1: rule__Strval__Alternatives : ( ( ruleNchar ) | ( rulePct_encoded ) );
    public final void rule__Strval__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1136:1: ( ( ruleNchar ) | ( rulePct_encoded ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ALPHA && LA17_0<=RULE_DIGIT)||(LA17_0>=38 && LA17_0<=48)) ) {
                alt17=1;
            }
            else if ( (LA17_0==51) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1137:1: ( ruleNchar )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1137:1: ( ruleNchar )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1138:1: ruleNchar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrvalAccess().getNcharParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleNchar_in_rule__Strval__Alternatives2483);
                    ruleNchar();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStrvalAccess().getNcharParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1143:6: ( rulePct_encoded )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1143:6: ( rulePct_encoded )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1144:1: rulePct_encoded
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrvalAccess().getPct_encodedParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulePct_encoded_in_rule__Strval__Alternatives2500);
                    rulePct_encoded();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStrvalAccess().getPct_encodedParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__Strval__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1156:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1160:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1161:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02530);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02533);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1168:1: rule__Model__Group__0__Impl : ( ( rule__Model__OperandsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1172:1: ( ( ( rule__Model__OperandsAssignment_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1173:1: ( ( rule__Model__OperandsAssignment_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1173:1: ( ( rule__Model__OperandsAssignment_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1174:1: ( rule__Model__OperandsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getOperandsAssignment_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1175:1: ( rule__Model__OperandsAssignment_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1175:2: rule__Model__OperandsAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__OperandsAssignment_0_in_rule__Model__Group__0__Impl2560);
            rule__Model__OperandsAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getOperandsAssignment_0()); 
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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1185:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1189:1: ( rule__Model__Group__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1190:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12590);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1196:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1200:1: ( ( ( rule__Model__Group_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1201:1: ( ( rule__Model__Group_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1201:1: ( ( rule__Model__Group_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1202:1: ( rule__Model__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1203:1: ( rule__Model__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=9 && LA18_0<=10)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1203:2: rule__Model__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl2617);
            	    rule__Model__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup_1()); 
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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group_1__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1217:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1221:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1222:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__02652);
            rule__Model__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__02655);
            rule__Model__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group_1__0"


    // $ANTLR start "rule__Model__Group_1__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1229:1: rule__Model__Group_1__0__Impl : ( ( rule__Model__Alternatives_1_0 ) ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1233:1: ( ( ( rule__Model__Alternatives_1_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1234:1: ( ( rule__Model__Alternatives_1_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1234:1: ( ( rule__Model__Alternatives_1_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1235:1: ( rule__Model__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAlternatives_1_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1236:1: ( rule__Model__Alternatives_1_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1236:2: rule__Model__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Model__Alternatives_1_0_in_rule__Model__Group_1__0__Impl2682);
            rule__Model__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getAlternatives_1_0()); 
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
    // $ANTLR end "rule__Model__Group_1__0__Impl"


    // $ANTLR start "rule__Model__Group_1__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1246:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1250:1: ( rule__Model__Group_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1251:2: rule__Model__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__12712);
            rule__Model__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group_1__1"


    // $ANTLR start "rule__Model__Group_1__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1257:1: rule__Model__Group_1__1__Impl : ( ruleHoOperand ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1261:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1262:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1262:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1263:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getHoOperandParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__Model__Group_1__1__Impl2739);
            ruleHoOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getHoOperandParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__Model__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1278:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1282:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1283:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__02772);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__02775);
            rule__And__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1290:1: rule__And__Group__0__Impl : ( '&' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1294:1: ( ( '&' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1295:1: ( '&' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1295:1: ( '&' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1296:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAmpersandKeyword_0()); 
            }
            match(input,10,FOLLOW_10_in_rule__And__Group__0__Impl2803); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getAmpersandKeyword_0()); 
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
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1309:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1313:1: ( rule__And__Group__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1314:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__12834);
            rule__And__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1320:1: rule__And__Group__1__Impl : ( ruleHoOperand ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1324:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1325:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1325:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1326:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getHoOperandParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__And__Group__1__Impl2861);
            ruleHoOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getHoOperandParserRuleCall_1()); 
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
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__Or__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1341:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1345:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1346:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__02894);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__02897);
            rule__Or__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1353:1: rule__Or__Group__0__Impl : ( ( rule__Or__Alternatives_0 ) ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1357:1: ( ( ( rule__Or__Alternatives_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1358:1: ( ( rule__Or__Alternatives_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1358:1: ( ( rule__Or__Alternatives_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1359:1: ( rule__Or__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAlternatives_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1360:1: ( rule__Or__Alternatives_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1360:2: rule__Or__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Or__Alternatives_0_in_rule__Or__Group__0__Impl2924);
            rule__Or__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1370:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1374:1: ( rule__Or__Group__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1375:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__12954);
            rule__Or__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1381:1: rule__Or__Group__1__Impl : ( ruleHoOperand ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1385:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1386:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1386:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1387:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getHoOperandParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__Or__Group__1__Impl2981);
            ruleHoOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getHoOperandParserRuleCall_1()); 
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
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__HoOperand__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1402:1: rule__HoOperand__Group__0 : rule__HoOperand__Group__0__Impl rule__HoOperand__Group__1 ;
    public final void rule__HoOperand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1406:1: ( rule__HoOperand__Group__0__Impl rule__HoOperand__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1407:2: rule__HoOperand__Group__0__Impl rule__HoOperand__Group__1
            {
            pushFollow(FOLLOW_rule__HoOperand__Group__0__Impl_in_rule__HoOperand__Group__03014);
            rule__HoOperand__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group__1_in_rule__HoOperand__Group__03017);
            rule__HoOperand__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HoOperand__Group__0"


    // $ANTLR start "rule__HoOperand__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1414:1: rule__HoOperand__Group__0__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__HoOperand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1418:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1419:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1419:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1420:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getWSPTerminalRuleCall_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1421:1: ( RULE_WSP )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WSP) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1421:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__HoOperand__Group__0__Impl3045); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHoOperandAccess().getWSPTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__HoOperand__Group__0__Impl"


    // $ANTLR start "rule__HoOperand__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1431:1: rule__HoOperand__Group__1 : rule__HoOperand__Group__1__Impl rule__HoOperand__Group__2 ;
    public final void rule__HoOperand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1435:1: ( rule__HoOperand__Group__1__Impl rule__HoOperand__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1436:2: rule__HoOperand__Group__1__Impl rule__HoOperand__Group__2
            {
            pushFollow(FOLLOW_rule__HoOperand__Group__1__Impl_in_rule__HoOperand__Group__13076);
            rule__HoOperand__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group__2_in_rule__HoOperand__Group__13079);
            rule__HoOperand__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HoOperand__Group__1"


    // $ANTLR start "rule__HoOperand__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1443:1: rule__HoOperand__Group__1__Impl : ( ( rule__HoOperand__Alternatives_1 ) ) ;
    public final void rule__HoOperand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1447:1: ( ( ( rule__HoOperand__Alternatives_1 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1448:1: ( ( rule__HoOperand__Alternatives_1 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1448:1: ( ( rule__HoOperand__Alternatives_1 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1449:1: ( rule__HoOperand__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getAlternatives_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1450:1: ( rule__HoOperand__Alternatives_1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1450:2: rule__HoOperand__Alternatives_1
            {
            pushFollow(FOLLOW_rule__HoOperand__Alternatives_1_in_rule__HoOperand__Group__1__Impl3106);
            rule__HoOperand__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHoOperandAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__HoOperand__Group__1__Impl"


    // $ANTLR start "rule__HoOperand__Group__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1460:1: rule__HoOperand__Group__2 : rule__HoOperand__Group__2__Impl ;
    public final void rule__HoOperand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1464:1: ( rule__HoOperand__Group__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1465:2: rule__HoOperand__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__HoOperand__Group__2__Impl_in_rule__HoOperand__Group__23136);
            rule__HoOperand__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HoOperand__Group__2"


    // $ANTLR start "rule__HoOperand__Group__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1471:1: rule__HoOperand__Group__2__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__HoOperand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1475:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1476:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1476:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1477:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getWSPTerminalRuleCall_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1478:1: ( RULE_WSP )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WSP) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1478:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__HoOperand__Group__2__Impl3164); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHoOperandAccess().getWSPTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__HoOperand__Group__2__Impl"


    // $ANTLR start "rule__HoOperand__Group_1_4__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1494:1: rule__HoOperand__Group_1_4__0 : rule__HoOperand__Group_1_4__0__Impl rule__HoOperand__Group_1_4__1 ;
    public final void rule__HoOperand__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1498:1: ( rule__HoOperand__Group_1_4__0__Impl rule__HoOperand__Group_1_4__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1499:2: rule__HoOperand__Group_1_4__0__Impl rule__HoOperand__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__0__Impl_in_rule__HoOperand__Group_1_4__03201);
            rule__HoOperand__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__1_in_rule__HoOperand__Group_1_4__03204);
            rule__HoOperand__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HoOperand__Group_1_4__0"


    // $ANTLR start "rule__HoOperand__Group_1_4__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1506:1: rule__HoOperand__Group_1_4__0__Impl : ( '(' ) ;
    public final void rule__HoOperand__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1510:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1511:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1511:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1512:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getLeftParenthesisKeyword_1_4_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__HoOperand__Group_1_4__0__Impl3232); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHoOperandAccess().getLeftParenthesisKeyword_1_4_0()); 
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
    // $ANTLR end "rule__HoOperand__Group_1_4__0__Impl"


    // $ANTLR start "rule__HoOperand__Group_1_4__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1525:1: rule__HoOperand__Group_1_4__1 : rule__HoOperand__Group_1_4__1__Impl rule__HoOperand__Group_1_4__2 ;
    public final void rule__HoOperand__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1529:1: ( rule__HoOperand__Group_1_4__1__Impl rule__HoOperand__Group_1_4__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1530:2: rule__HoOperand__Group_1_4__1__Impl rule__HoOperand__Group_1_4__2
            {
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__1__Impl_in_rule__HoOperand__Group_1_4__13263);
            rule__HoOperand__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__2_in_rule__HoOperand__Group_1_4__13266);
            rule__HoOperand__Group_1_4__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HoOperand__Group_1_4__1"


    // $ANTLR start "rule__HoOperand__Group_1_4__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1537:1: rule__HoOperand__Group_1_4__1__Impl : ( ruleHoOperand ) ;
    public final void rule__HoOperand__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1541:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1542:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1542:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1543:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getHoOperandParserRuleCall_1_4_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__HoOperand__Group_1_4__1__Impl3293);
            ruleHoOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHoOperandAccess().getHoOperandParserRuleCall_1_4_1()); 
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
    // $ANTLR end "rule__HoOperand__Group_1_4__1__Impl"


    // $ANTLR start "rule__HoOperand__Group_1_4__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1554:1: rule__HoOperand__Group_1_4__2 : rule__HoOperand__Group_1_4__2__Impl rule__HoOperand__Group_1_4__3 ;
    public final void rule__HoOperand__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1558:1: ( rule__HoOperand__Group_1_4__2__Impl rule__HoOperand__Group_1_4__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1559:2: rule__HoOperand__Group_1_4__2__Impl rule__HoOperand__Group_1_4__3
            {
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__2__Impl_in_rule__HoOperand__Group_1_4__23322);
            rule__HoOperand__Group_1_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__3_in_rule__HoOperand__Group_1_4__23325);
            rule__HoOperand__Group_1_4__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HoOperand__Group_1_4__2"


    // $ANTLR start "rule__HoOperand__Group_1_4__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1566:1: rule__HoOperand__Group_1_4__2__Impl : ( ( rule__HoOperand__Alternatives_1_4_2 ) ) ;
    public final void rule__HoOperand__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1570:1: ( ( ( rule__HoOperand__Alternatives_1_4_2 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1571:1: ( ( rule__HoOperand__Alternatives_1_4_2 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1571:1: ( ( rule__HoOperand__Alternatives_1_4_2 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1572:1: ( rule__HoOperand__Alternatives_1_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getAlternatives_1_4_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1573:1: ( rule__HoOperand__Alternatives_1_4_2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1573:2: rule__HoOperand__Alternatives_1_4_2
            {
            pushFollow(FOLLOW_rule__HoOperand__Alternatives_1_4_2_in_rule__HoOperand__Group_1_4__2__Impl3352);
            rule__HoOperand__Alternatives_1_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHoOperandAccess().getAlternatives_1_4_2()); 
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
    // $ANTLR end "rule__HoOperand__Group_1_4__2__Impl"


    // $ANTLR start "rule__HoOperand__Group_1_4__3"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1583:1: rule__HoOperand__Group_1_4__3 : rule__HoOperand__Group_1_4__3__Impl ;
    public final void rule__HoOperand__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1587:1: ( rule__HoOperand__Group_1_4__3__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1588:2: rule__HoOperand__Group_1_4__3__Impl
            {
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__3__Impl_in_rule__HoOperand__Group_1_4__33382);
            rule__HoOperand__Group_1_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HoOperand__Group_1_4__3"


    // $ANTLR start "rule__HoOperand__Group_1_4__3__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1594:1: rule__HoOperand__Group_1_4__3__Impl : ( ')' ) ;
    public final void rule__HoOperand__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1598:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1599:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1599:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1600:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getRightParenthesisKeyword_1_4_3()); 
            }
            match(input,50,FOLLOW_50_in_rule__HoOperand__Group_1_4__3__Impl3410); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHoOperandAccess().getRightParenthesisKeyword_1_4_3()); 
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
    // $ANTLR end "rule__HoOperand__Group_1_4__3__Impl"


    // $ANTLR start "rule__HigherOrderCall__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1621:1: rule__HigherOrderCall__Group__0 : rule__HigherOrderCall__Group__0__Impl rule__HigherOrderCall__Group__1 ;
    public final void rule__HigherOrderCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1625:1: ( rule__HigherOrderCall__Group__0__Impl rule__HigherOrderCall__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1626:2: rule__HigherOrderCall__Group__0__Impl rule__HigherOrderCall__Group__1
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__0__Impl_in_rule__HigherOrderCall__Group__03449);
            rule__HigherOrderCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__1_in_rule__HigherOrderCall__Group__03452);
            rule__HigherOrderCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HigherOrderCall__Group__0"


    // $ANTLR start "rule__HigherOrderCall__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1633:1: rule__HigherOrderCall__Group__0__Impl : ( RULE_LOGICAL_OP_ALIASES ) ;
    public final void rule__HigherOrderCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1637:1: ( ( RULE_LOGICAL_OP_ALIASES ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1638:1: ( RULE_LOGICAL_OP_ALIASES )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1638:1: ( RULE_LOGICAL_OP_ALIASES )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1639:1: RULE_LOGICAL_OP_ALIASES
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getLOGICAL_OP_ALIASESTerminalRuleCall_0()); 
            }
            match(input,RULE_LOGICAL_OP_ALIASES,FOLLOW_RULE_LOGICAL_OP_ALIASES_in_rule__HigherOrderCall__Group__0__Impl3479); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigherOrderCallAccess().getLOGICAL_OP_ALIASESTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__HigherOrderCall__Group__0__Impl"


    // $ANTLR start "rule__HigherOrderCall__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1650:1: rule__HigherOrderCall__Group__1 : rule__HigherOrderCall__Group__1__Impl rule__HigherOrderCall__Group__2 ;
    public final void rule__HigherOrderCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1654:1: ( rule__HigherOrderCall__Group__1__Impl rule__HigherOrderCall__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1655:2: rule__HigherOrderCall__Group__1__Impl rule__HigherOrderCall__Group__2
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__1__Impl_in_rule__HigherOrderCall__Group__13508);
            rule__HigherOrderCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__2_in_rule__HigherOrderCall__Group__13511);
            rule__HigherOrderCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HigherOrderCall__Group__1"


    // $ANTLR start "rule__HigherOrderCall__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1662:1: rule__HigherOrderCall__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__HigherOrderCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1666:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1667:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1667:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1668:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1669:1: ( RULE_WSP )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WSP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1669:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__HigherOrderCall__Group__1__Impl3539); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigherOrderCallAccess().getWSPTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__HigherOrderCall__Group__1__Impl"


    // $ANTLR start "rule__HigherOrderCall__Group__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1679:1: rule__HigherOrderCall__Group__2 : rule__HigherOrderCall__Group__2__Impl rule__HigherOrderCall__Group__3 ;
    public final void rule__HigherOrderCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1683:1: ( rule__HigherOrderCall__Group__2__Impl rule__HigherOrderCall__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1684:2: rule__HigherOrderCall__Group__2__Impl rule__HigherOrderCall__Group__3
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__2__Impl_in_rule__HigherOrderCall__Group__23570);
            rule__HigherOrderCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__3_in_rule__HigherOrderCall__Group__23573);
            rule__HigherOrderCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HigherOrderCall__Group__2"


    // $ANTLR start "rule__HigherOrderCall__Group__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1691:1: rule__HigherOrderCall__Group__2__Impl : ( '(' ) ;
    public final void rule__HigherOrderCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1695:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1696:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1696:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1697:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,49,FOLLOW_49_in_rule__HigherOrderCall__Group__2__Impl3601); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigherOrderCallAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__HigherOrderCall__Group__2__Impl"


    // $ANTLR start "rule__HigherOrderCall__Group__3"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1710:1: rule__HigherOrderCall__Group__3 : rule__HigherOrderCall__Group__3__Impl rule__HigherOrderCall__Group__4 ;
    public final void rule__HigherOrderCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1714:1: ( rule__HigherOrderCall__Group__3__Impl rule__HigherOrderCall__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1715:2: rule__HigherOrderCall__Group__3__Impl rule__HigherOrderCall__Group__4
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__3__Impl_in_rule__HigherOrderCall__Group__33632);
            rule__HigherOrderCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__4_in_rule__HigherOrderCall__Group__33635);
            rule__HigherOrderCall__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HigherOrderCall__Group__3"


    // $ANTLR start "rule__HigherOrderCall__Group__3__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1722:1: rule__HigherOrderCall__Group__3__Impl : ( ( rule__HigherOrderCall__Group_3__0 ) ) ;
    public final void rule__HigherOrderCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1726:1: ( ( ( rule__HigherOrderCall__Group_3__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1727:1: ( ( rule__HigherOrderCall__Group_3__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1727:1: ( ( rule__HigherOrderCall__Group_3__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1728:1: ( rule__HigherOrderCall__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getGroup_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1729:1: ( rule__HigherOrderCall__Group_3__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1729:2: rule__HigherOrderCall__Group_3__0
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3__0_in_rule__HigherOrderCall__Group__3__Impl3662);
            rule__HigherOrderCall__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigherOrderCallAccess().getGroup_3()); 
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
    // $ANTLR end "rule__HigherOrderCall__Group__3__Impl"


    // $ANTLR start "rule__HigherOrderCall__Group__4"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1739:1: rule__HigherOrderCall__Group__4 : rule__HigherOrderCall__Group__4__Impl ;
    public final void rule__HigherOrderCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1743:1: ( rule__HigherOrderCall__Group__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1744:2: rule__HigherOrderCall__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__4__Impl_in_rule__HigherOrderCall__Group__43692);
            rule__HigherOrderCall__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HigherOrderCall__Group__4"


    // $ANTLR start "rule__HigherOrderCall__Group__4__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1750:1: rule__HigherOrderCall__Group__4__Impl : ( ')' ) ;
    public final void rule__HigherOrderCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1754:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1755:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1755:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1756:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,50,FOLLOW_50_in_rule__HigherOrderCall__Group__4__Impl3720); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigherOrderCallAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__HigherOrderCall__Group__4__Impl"


    // $ANTLR start "rule__HigherOrderCall__Group_3__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1779:1: rule__HigherOrderCall__Group_3__0 : rule__HigherOrderCall__Group_3__0__Impl rule__HigherOrderCall__Group_3__1 ;
    public final void rule__HigherOrderCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1783:1: ( rule__HigherOrderCall__Group_3__0__Impl rule__HigherOrderCall__Group_3__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1784:2: rule__HigherOrderCall__Group_3__0__Impl rule__HigherOrderCall__Group_3__1
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3__0__Impl_in_rule__HigherOrderCall__Group_3__03761);
            rule__HigherOrderCall__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3__1_in_rule__HigherOrderCall__Group_3__03764);
            rule__HigherOrderCall__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HigherOrderCall__Group_3__0"


    // $ANTLR start "rule__HigherOrderCall__Group_3__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1791:1: rule__HigherOrderCall__Group_3__0__Impl : ( ruleHoOperand ) ;
    public final void rule__HigherOrderCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1795:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1796:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1796:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1797:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getHoOperandParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__HigherOrderCall__Group_3__0__Impl3791);
            ruleHoOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigherOrderCallAccess().getHoOperandParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__HigherOrderCall__Group_3__0__Impl"


    // $ANTLR start "rule__HigherOrderCall__Group_3__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1808:1: rule__HigherOrderCall__Group_3__1 : rule__HigherOrderCall__Group_3__1__Impl ;
    public final void rule__HigherOrderCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1812:1: ( rule__HigherOrderCall__Group_3__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1813:2: rule__HigherOrderCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3__1__Impl_in_rule__HigherOrderCall__Group_3__13820);
            rule__HigherOrderCall__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HigherOrderCall__Group_3__1"


    // $ANTLR start "rule__HigherOrderCall__Group_3__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1819:1: rule__HigherOrderCall__Group_3__1__Impl : ( ( rule__HigherOrderCall__Group_3_1__0 )* ) ;
    public final void rule__HigherOrderCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1823:1: ( ( ( rule__HigherOrderCall__Group_3_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1824:1: ( ( rule__HigherOrderCall__Group_3_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1824:1: ( ( rule__HigherOrderCall__Group_3_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1825:1: ( rule__HigherOrderCall__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getGroup_3_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1826:1: ( rule__HigherOrderCall__Group_3_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==9) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1826:2: rule__HigherOrderCall__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__HigherOrderCall__Group_3_1__0_in_rule__HigherOrderCall__Group_3__1__Impl3847);
            	    rule__HigherOrderCall__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigherOrderCallAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__HigherOrderCall__Group_3__1__Impl"


    // $ANTLR start "rule__HigherOrderCall__Group_3_1__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1840:1: rule__HigherOrderCall__Group_3_1__0 : rule__HigherOrderCall__Group_3_1__0__Impl rule__HigherOrderCall__Group_3_1__1 ;
    public final void rule__HigherOrderCall__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1844:1: ( rule__HigherOrderCall__Group_3_1__0__Impl rule__HigherOrderCall__Group_3_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1845:2: rule__HigherOrderCall__Group_3_1__0__Impl rule__HigherOrderCall__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3_1__0__Impl_in_rule__HigherOrderCall__Group_3_1__03882);
            rule__HigherOrderCall__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3_1__1_in_rule__HigherOrderCall__Group_3_1__03885);
            rule__HigherOrderCall__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HigherOrderCall__Group_3_1__0"


    // $ANTLR start "rule__HigherOrderCall__Group_3_1__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1852:1: rule__HigherOrderCall__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__HigherOrderCall__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1856:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1857:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1857:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1858:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,9,FOLLOW_9_in_rule__HigherOrderCall__Group_3_1__0__Impl3913); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigherOrderCallAccess().getCommaKeyword_3_1_0()); 
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
    // $ANTLR end "rule__HigherOrderCall__Group_3_1__0__Impl"


    // $ANTLR start "rule__HigherOrderCall__Group_3_1__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1871:1: rule__HigherOrderCall__Group_3_1__1 : rule__HigherOrderCall__Group_3_1__1__Impl ;
    public final void rule__HigherOrderCall__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1875:1: ( rule__HigherOrderCall__Group_3_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1876:2: rule__HigherOrderCall__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3_1__1__Impl_in_rule__HigherOrderCall__Group_3_1__13944);
            rule__HigherOrderCall__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__HigherOrderCall__Group_3_1__1"


    // $ANTLR start "rule__HigherOrderCall__Group_3_1__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1882:1: rule__HigherOrderCall__Group_3_1__1__Impl : ( ruleHoOperand ) ;
    public final void rule__HigherOrderCall__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1886:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1887:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1887:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1888:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getHoOperandParserRuleCall_3_1_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__HigherOrderCall__Group_3_1__1__Impl3971);
            ruleHoOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigherOrderCallAccess().getHoOperandParserRuleCall_3_1_1()); 
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
    // $ANTLR end "rule__HigherOrderCall__Group_3_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1903:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1907:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1908:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04004);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04007);
            rule__Comparison__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1915:1: rule__Comparison__Group__0__Impl : ( ruleStrval ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1919:1: ( ( ruleStrval ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1920:1: ( ruleStrval )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1920:1: ( ruleStrval )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1921:1: ruleStrval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getStrvalParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_rule__Comparison__Group__0__Impl4034);
            ruleStrval();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getStrvalParserRuleCall_0()); 
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
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1932:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1936:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1937:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14063);
            rule__Comparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__14066);
            rule__Comparison__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1944:1: rule__Comparison__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1948:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1949:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1949:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1950:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1951:1: ( RULE_WSP )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_WSP) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1951:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Comparison__Group__1__Impl4094); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getWSPTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1961:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl rule__Comparison__Group__3 ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1965:1: ( rule__Comparison__Group__2__Impl rule__Comparison__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1966:2: rule__Comparison__Group__2__Impl rule__Comparison__Group__3
            {
            pushFollow(FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__24125);
            rule__Comparison__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__3_in_rule__Comparison__Group__24128);
            rule__Comparison__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group__2"


    // $ANTLR start "rule__Comparison__Group__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1973:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__Alternatives_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1977:1: ( ( ( rule__Comparison__Alternatives_2 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1978:1: ( ( rule__Comparison__Alternatives_2 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1978:1: ( ( rule__Comparison__Alternatives_2 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1979:1: ( rule__Comparison__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1980:1: ( rule__Comparison__Alternatives_2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1980:2: rule__Comparison__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Comparison__Alternatives_2_in_rule__Comparison__Group__2__Impl4155);
            rule__Comparison__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getAlternatives_2()); 
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
    // $ANTLR end "rule__Comparison__Group__2__Impl"


    // $ANTLR start "rule__Comparison__Group__3"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1990:1: rule__Comparison__Group__3 : rule__Comparison__Group__3__Impl ;
    public final void rule__Comparison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1994:1: ( rule__Comparison__Group__3__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1995:2: rule__Comparison__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__3__Impl_in_rule__Comparison__Group__34185);
            rule__Comparison__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group__3"


    // $ANTLR start "rule__Comparison__Group__3__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2001:1: rule__Comparison__Group__3__Impl : ( rulePrimaryExpr ) ;
    public final void rule__Comparison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2005:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2006:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2006:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2007:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getPrimaryExprParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__Comparison__Group__3__Impl4212);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getPrimaryExprParserRuleCall_3()); 
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
    // $ANTLR end "rule__Comparison__Group__3__Impl"


    // $ANTLR start "rule__Comparison__Group_2_0__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2026:1: rule__Comparison__Group_2_0__0 : rule__Comparison__Group_2_0__0__Impl rule__Comparison__Group_2_0__1 ;
    public final void rule__Comparison__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2030:1: ( rule__Comparison__Group_2_0__0__Impl rule__Comparison__Group_2_0__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2031:2: rule__Comparison__Group_2_0__0__Impl rule__Comparison__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_2_0__0__Impl_in_rule__Comparison__Group_2_0__04249);
            rule__Comparison__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_2_0__1_in_rule__Comparison__Group_2_0__04252);
            rule__Comparison__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group_2_0__0"


    // $ANTLR start "rule__Comparison__Group_2_0__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2038:1: rule__Comparison__Group_2_0__0__Impl : ( '=' ) ;
    public final void rule__Comparison__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2042:1: ( ( '=' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2043:1: ( '=' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2043:1: ( '=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2044:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsSignKeyword_2_0_0()); 
            }
            match(input,21,FOLLOW_21_in_rule__Comparison__Group_2_0__0__Impl4280); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getEqualsSignKeyword_2_0_0()); 
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
    // $ANTLR end "rule__Comparison__Group_2_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_2_0__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2057:1: rule__Comparison__Group_2_0__1 : rule__Comparison__Group_2_0__1__Impl rule__Comparison__Group_2_0__2 ;
    public final void rule__Comparison__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2061:1: ( rule__Comparison__Group_2_0__1__Impl rule__Comparison__Group_2_0__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2062:2: rule__Comparison__Group_2_0__1__Impl rule__Comparison__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_2_0__1__Impl_in_rule__Comparison__Group_2_0__14311);
            rule__Comparison__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_2_0__2_in_rule__Comparison__Group_2_0__14314);
            rule__Comparison__Group_2_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group_2_0__1"


    // $ANTLR start "rule__Comparison__Group_2_0__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2069:1: rule__Comparison__Group_2_0__1__Impl : ( ruleBinaryOpAliases ) ;
    public final void rule__Comparison__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2073:1: ( ( ruleBinaryOpAliases ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2074:1: ( ruleBinaryOpAliases )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2074:1: ( ruleBinaryOpAliases )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2075:1: ruleBinaryOpAliases
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getBinaryOpAliasesParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleBinaryOpAliases_in_rule__Comparison__Group_2_0__1__Impl4341);
            ruleBinaryOpAliases();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getBinaryOpAliasesParserRuleCall_2_0_1()); 
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
    // $ANTLR end "rule__Comparison__Group_2_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group_2_0__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2086:1: rule__Comparison__Group_2_0__2 : rule__Comparison__Group_2_0__2__Impl ;
    public final void rule__Comparison__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2090:1: ( rule__Comparison__Group_2_0__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2091:2: rule__Comparison__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_2_0__2__Impl_in_rule__Comparison__Group_2_0__24370);
            rule__Comparison__Group_2_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Comparison__Group_2_0__2"


    // $ANTLR start "rule__Comparison__Group_2_0__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2097:1: rule__Comparison__Group_2_0__2__Impl : ( '=' ) ;
    public final void rule__Comparison__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2101:1: ( ( '=' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2102:1: ( '=' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2102:1: ( '=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2103:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsSignKeyword_2_0_2()); 
            }
            match(input,21,FOLLOW_21_in_rule__Comparison__Group_2_0__2__Impl4398); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getEqualsSignKeyword_2_0_2()); 
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
    // $ANTLR end "rule__Comparison__Group_2_0__2__Impl"


    // $ANTLR start "rule__CallOperator__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2122:1: rule__CallOperator__Group__0 : rule__CallOperator__Group__0__Impl rule__CallOperator__Group__1 ;
    public final void rule__CallOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2126:1: ( rule__CallOperator__Group__0__Impl rule__CallOperator__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2127:2: rule__CallOperator__Group__0__Impl rule__CallOperator__Group__1
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__0__Impl_in_rule__CallOperator__Group__04435);
            rule__CallOperator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group__1_in_rule__CallOperator__Group__04438);
            rule__CallOperator__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CallOperator__Group__0"


    // $ANTLR start "rule__CallOperator__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2134:1: rule__CallOperator__Group__0__Impl : ( ( rule__CallOperator__Alternatives_0 ) ) ;
    public final void rule__CallOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2138:1: ( ( ( rule__CallOperator__Alternatives_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2139:1: ( ( rule__CallOperator__Alternatives_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2139:1: ( ( rule__CallOperator__Alternatives_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2140:1: ( rule__CallOperator__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getAlternatives_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2141:1: ( rule__CallOperator__Alternatives_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2141:2: rule__CallOperator__Alternatives_0
            {
            pushFollow(FOLLOW_rule__CallOperator__Alternatives_0_in_rule__CallOperator__Group__0__Impl4465);
            rule__CallOperator__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallOperatorAccess().getAlternatives_0()); 
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
    // $ANTLR end "rule__CallOperator__Group__0__Impl"


    // $ANTLR start "rule__CallOperator__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2151:1: rule__CallOperator__Group__1 : rule__CallOperator__Group__1__Impl rule__CallOperator__Group__2 ;
    public final void rule__CallOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2155:1: ( rule__CallOperator__Group__1__Impl rule__CallOperator__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2156:2: rule__CallOperator__Group__1__Impl rule__CallOperator__Group__2
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__1__Impl_in_rule__CallOperator__Group__14495);
            rule__CallOperator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group__2_in_rule__CallOperator__Group__14498);
            rule__CallOperator__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CallOperator__Group__1"


    // $ANTLR start "rule__CallOperator__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2163:1: rule__CallOperator__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__CallOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2167:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2168:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2168:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2169:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2170:1: ( RULE_WSP )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WSP) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2170:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__CallOperator__Group__1__Impl4526); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallOperatorAccess().getWSPTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__CallOperator__Group__1__Impl"


    // $ANTLR start "rule__CallOperator__Group__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2180:1: rule__CallOperator__Group__2 : rule__CallOperator__Group__2__Impl rule__CallOperator__Group__3 ;
    public final void rule__CallOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2184:1: ( rule__CallOperator__Group__2__Impl rule__CallOperator__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2185:2: rule__CallOperator__Group__2__Impl rule__CallOperator__Group__3
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__2__Impl_in_rule__CallOperator__Group__24557);
            rule__CallOperator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group__3_in_rule__CallOperator__Group__24560);
            rule__CallOperator__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CallOperator__Group__2"


    // $ANTLR start "rule__CallOperator__Group__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2192:1: rule__CallOperator__Group__2__Impl : ( '(' ) ;
    public final void rule__CallOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2196:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2197:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2197:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2198:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,49,FOLLOW_49_in_rule__CallOperator__Group__2__Impl4588); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallOperatorAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__CallOperator__Group__2__Impl"


    // $ANTLR start "rule__CallOperator__Group__3"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2211:1: rule__CallOperator__Group__3 : rule__CallOperator__Group__3__Impl rule__CallOperator__Group__4 ;
    public final void rule__CallOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2215:1: ( rule__CallOperator__Group__3__Impl rule__CallOperator__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2216:2: rule__CallOperator__Group__3__Impl rule__CallOperator__Group__4
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__3__Impl_in_rule__CallOperator__Group__34619);
            rule__CallOperator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group__4_in_rule__CallOperator__Group__34622);
            rule__CallOperator__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CallOperator__Group__3"


    // $ANTLR start "rule__CallOperator__Group__3__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2223:1: rule__CallOperator__Group__3__Impl : ( ( rule__CallOperator__Group_3__0 )? ) ;
    public final void rule__CallOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2227:1: ( ( ( rule__CallOperator__Group_3__0 )? ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2228:1: ( ( rule__CallOperator__Group_3__0 )? )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2228:1: ( ( rule__CallOperator__Group_3__0 )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2229:1: ( rule__CallOperator__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getGroup_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2230:1: ( rule__CallOperator__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_ALPHA && LA25_0<=RULE_WSP)||(LA25_0>=34 && LA25_0<=49)||LA25_0==51) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2230:2: rule__CallOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CallOperator__Group_3__0_in_rule__CallOperator__Group__3__Impl4649);
                    rule__CallOperator__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallOperatorAccess().getGroup_3()); 
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
    // $ANTLR end "rule__CallOperator__Group__3__Impl"


    // $ANTLR start "rule__CallOperator__Group__4"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2240:1: rule__CallOperator__Group__4 : rule__CallOperator__Group__4__Impl ;
    public final void rule__CallOperator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2244:1: ( rule__CallOperator__Group__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2245:2: rule__CallOperator__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__4__Impl_in_rule__CallOperator__Group__44680);
            rule__CallOperator__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CallOperator__Group__4"


    // $ANTLR start "rule__CallOperator__Group__4__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2251:1: rule__CallOperator__Group__4__Impl : ( ')' ) ;
    public final void rule__CallOperator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2255:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2256:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2256:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2257:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,50,FOLLOW_50_in_rule__CallOperator__Group__4__Impl4708); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallOperatorAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__CallOperator__Group__4__Impl"


    // $ANTLR start "rule__CallOperator__Group_3__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2280:1: rule__CallOperator__Group_3__0 : rule__CallOperator__Group_3__0__Impl rule__CallOperator__Group_3__1 ;
    public final void rule__CallOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2284:1: ( rule__CallOperator__Group_3__0__Impl rule__CallOperator__Group_3__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2285:2: rule__CallOperator__Group_3__0__Impl rule__CallOperator__Group_3__1
            {
            pushFollow(FOLLOW_rule__CallOperator__Group_3__0__Impl_in_rule__CallOperator__Group_3__04749);
            rule__CallOperator__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group_3__1_in_rule__CallOperator__Group_3__04752);
            rule__CallOperator__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CallOperator__Group_3__0"


    // $ANTLR start "rule__CallOperator__Group_3__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2292:1: rule__CallOperator__Group_3__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__CallOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2296:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2297:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2297:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2298:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getPrimaryExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__CallOperator__Group_3__0__Impl4779);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallOperatorAccess().getPrimaryExprParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__CallOperator__Group_3__0__Impl"


    // $ANTLR start "rule__CallOperator__Group_3__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2309:1: rule__CallOperator__Group_3__1 : rule__CallOperator__Group_3__1__Impl ;
    public final void rule__CallOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2313:1: ( rule__CallOperator__Group_3__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2314:2: rule__CallOperator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CallOperator__Group_3__1__Impl_in_rule__CallOperator__Group_3__14808);
            rule__CallOperator__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CallOperator__Group_3__1"


    // $ANTLR start "rule__CallOperator__Group_3__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2320:1: rule__CallOperator__Group_3__1__Impl : ( ( rule__CallOperator__Group_3_1__0 )* ) ;
    public final void rule__CallOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2324:1: ( ( ( rule__CallOperator__Group_3_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2325:1: ( ( rule__CallOperator__Group_3_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2325:1: ( ( rule__CallOperator__Group_3_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2326:1: ( rule__CallOperator__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getGroup_3_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2327:1: ( rule__CallOperator__Group_3_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==9) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2327:2: rule__CallOperator__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CallOperator__Group_3_1__0_in_rule__CallOperator__Group_3__1__Impl4835);
            	    rule__CallOperator__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallOperatorAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__CallOperator__Group_3__1__Impl"


    // $ANTLR start "rule__CallOperator__Group_3_1__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2341:1: rule__CallOperator__Group_3_1__0 : rule__CallOperator__Group_3_1__0__Impl rule__CallOperator__Group_3_1__1 ;
    public final void rule__CallOperator__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2345:1: ( rule__CallOperator__Group_3_1__0__Impl rule__CallOperator__Group_3_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2346:2: rule__CallOperator__Group_3_1__0__Impl rule__CallOperator__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__CallOperator__Group_3_1__0__Impl_in_rule__CallOperator__Group_3_1__04870);
            rule__CallOperator__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group_3_1__1_in_rule__CallOperator__Group_3_1__04873);
            rule__CallOperator__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CallOperator__Group_3_1__0"


    // $ANTLR start "rule__CallOperator__Group_3_1__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2353:1: rule__CallOperator__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__CallOperator__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2357:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2358:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2358:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2359:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,9,FOLLOW_9_in_rule__CallOperator__Group_3_1__0__Impl4901); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallOperatorAccess().getCommaKeyword_3_1_0()); 
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
    // $ANTLR end "rule__CallOperator__Group_3_1__0__Impl"


    // $ANTLR start "rule__CallOperator__Group_3_1__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2372:1: rule__CallOperator__Group_3_1__1 : rule__CallOperator__Group_3_1__1__Impl ;
    public final void rule__CallOperator__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2376:1: ( rule__CallOperator__Group_3_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2377:2: rule__CallOperator__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CallOperator__Group_3_1__1__Impl_in_rule__CallOperator__Group_3_1__14932);
            rule__CallOperator__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__CallOperator__Group_3_1__1"


    // $ANTLR start "rule__CallOperator__Group_3_1__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2383:1: rule__CallOperator__Group_3_1__1__Impl : ( rulePrimaryExpr ) ;
    public final void rule__CallOperator__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2387:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2388:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2388:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2389:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getPrimaryExprParserRuleCall_3_1_1()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__CallOperator__Group_3_1__1__Impl4959);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallOperatorAccess().getPrimaryExprParserRuleCall_3_1_1()); 
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
    // $ANTLR end "rule__CallOperator__Group_3_1__1__Impl"


    // $ANTLR start "rule__Predicate__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2404:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2408:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2409:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__04992);
            rule__Predicate__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__04995);
            rule__Predicate__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Predicate__Group__0"


    // $ANTLR start "rule__Predicate__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2416:1: rule__Predicate__Group__0__Impl : ( rulePredTbl ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2420:1: ( ( rulePredTbl ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2421:1: ( rulePredTbl )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2421:1: ( rulePredTbl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2422:1: rulePredTbl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPredTblParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePredTbl_in_rule__Predicate__Group__0__Impl5022);
            rulePredTbl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getPredTblParserRuleCall_0()); 
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
    // $ANTLR end "rule__Predicate__Group__0__Impl"


    // $ANTLR start "rule__Predicate__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2433:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl rule__Predicate__Group__2 ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2437:1: ( rule__Predicate__Group__1__Impl rule__Predicate__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2438:2: rule__Predicate__Group__1__Impl rule__Predicate__Group__2
            {
            pushFollow(FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__15051);
            rule__Predicate__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__2_in_rule__Predicate__Group__15054);
            rule__Predicate__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Predicate__Group__1"


    // $ANTLR start "rule__Predicate__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2445:1: rule__Predicate__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2449:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2450:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2450:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2451:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2452:1: ( RULE_WSP )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_WSP) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2452:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Predicate__Group__1__Impl5082); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getWSPTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Predicate__Group__1__Impl"


    // $ANTLR start "rule__Predicate__Group__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2462:1: rule__Predicate__Group__2 : rule__Predicate__Group__2__Impl rule__Predicate__Group__3 ;
    public final void rule__Predicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2466:1: ( rule__Predicate__Group__2__Impl rule__Predicate__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2467:2: rule__Predicate__Group__2__Impl rule__Predicate__Group__3
            {
            pushFollow(FOLLOW_rule__Predicate__Group__2__Impl_in_rule__Predicate__Group__25113);
            rule__Predicate__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__3_in_rule__Predicate__Group__25116);
            rule__Predicate__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Predicate__Group__2"


    // $ANTLR start "rule__Predicate__Group__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2474:1: rule__Predicate__Group__2__Impl : ( '(' ) ;
    public final void rule__Predicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2478:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2479:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2479:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2480:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,49,FOLLOW_49_in_rule__Predicate__Group__2__Impl5144); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_2()); 
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
    // $ANTLR end "rule__Predicate__Group__2__Impl"


    // $ANTLR start "rule__Predicate__Group__3"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2493:1: rule__Predicate__Group__3 : rule__Predicate__Group__3__Impl rule__Predicate__Group__4 ;
    public final void rule__Predicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2497:1: ( rule__Predicate__Group__3__Impl rule__Predicate__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2498:2: rule__Predicate__Group__3__Impl rule__Predicate__Group__4
            {
            pushFollow(FOLLOW_rule__Predicate__Group__3__Impl_in_rule__Predicate__Group__35175);
            rule__Predicate__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__4_in_rule__Predicate__Group__35178);
            rule__Predicate__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Predicate__Group__3"


    // $ANTLR start "rule__Predicate__Group__3__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2505:1: rule__Predicate__Group__3__Impl : ( ( rule__Predicate__Group_3__0 )? ) ;
    public final void rule__Predicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2509:1: ( ( ( rule__Predicate__Group_3__0 )? ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2510:1: ( ( rule__Predicate__Group_3__0 )? )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2510:1: ( ( rule__Predicate__Group_3__0 )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2511:1: ( rule__Predicate__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getGroup_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2512:1: ( rule__Predicate__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ALPHA && LA28_0<=RULE_WSP)||(LA28_0>=34 && LA28_0<=49)||LA28_0==51) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2512:2: rule__Predicate__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Predicate__Group_3__0_in_rule__Predicate__Group__3__Impl5205);
                    rule__Predicate__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getGroup_3()); 
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
    // $ANTLR end "rule__Predicate__Group__3__Impl"


    // $ANTLR start "rule__Predicate__Group__4"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2522:1: rule__Predicate__Group__4 : rule__Predicate__Group__4__Impl ;
    public final void rule__Predicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2526:1: ( rule__Predicate__Group__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2527:2: rule__Predicate__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group__4__Impl_in_rule__Predicate__Group__45236);
            rule__Predicate__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Predicate__Group__4"


    // $ANTLR start "rule__Predicate__Group__4__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2533:1: rule__Predicate__Group__4__Impl : ( ')' ) ;
    public final void rule__Predicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2537:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2538:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2538:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2539:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,50,FOLLOW_50_in_rule__Predicate__Group__4__Impl5264); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 
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
    // $ANTLR end "rule__Predicate__Group__4__Impl"


    // $ANTLR start "rule__Predicate__Group_3__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2562:1: rule__Predicate__Group_3__0 : rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 ;
    public final void rule__Predicate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2566:1: ( rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2567:2: rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3__0__Impl_in_rule__Predicate__Group_3__05305);
            rule__Predicate__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group_3__1_in_rule__Predicate__Group_3__05308);
            rule__Predicate__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Predicate__Group_3__0"


    // $ANTLR start "rule__Predicate__Group_3__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2574:1: rule__Predicate__Group_3__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__Predicate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2578:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2579:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2579:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2580:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPrimaryExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__Predicate__Group_3__0__Impl5335);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getPrimaryExprParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Predicate__Group_3__0__Impl"


    // $ANTLR start "rule__Predicate__Group_3__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2591:1: rule__Predicate__Group_3__1 : rule__Predicate__Group_3__1__Impl ;
    public final void rule__Predicate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2595:1: ( rule__Predicate__Group_3__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2596:2: rule__Predicate__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3__1__Impl_in_rule__Predicate__Group_3__15364);
            rule__Predicate__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Predicate__Group_3__1"


    // $ANTLR start "rule__Predicate__Group_3__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2602:1: rule__Predicate__Group_3__1__Impl : ( ( rule__Predicate__Group_3_1__0 )* ) ;
    public final void rule__Predicate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2606:1: ( ( ( rule__Predicate__Group_3_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2607:1: ( ( rule__Predicate__Group_3_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2607:1: ( ( rule__Predicate__Group_3_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2608:1: ( rule__Predicate__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getGroup_3_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2609:1: ( rule__Predicate__Group_3_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==9) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2609:2: rule__Predicate__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Predicate__Group_3_1__0_in_rule__Predicate__Group_3__1__Impl5391);
            	    rule__Predicate__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__Predicate__Group_3__1__Impl"


    // $ANTLR start "rule__Predicate__Group_3_1__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2623:1: rule__Predicate__Group_3_1__0 : rule__Predicate__Group_3_1__0__Impl rule__Predicate__Group_3_1__1 ;
    public final void rule__Predicate__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2627:1: ( rule__Predicate__Group_3_1__0__Impl rule__Predicate__Group_3_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2628:2: rule__Predicate__Group_3_1__0__Impl rule__Predicate__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3_1__0__Impl_in_rule__Predicate__Group_3_1__05426);
            rule__Predicate__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group_3_1__1_in_rule__Predicate__Group_3_1__05429);
            rule__Predicate__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Predicate__Group_3_1__0"


    // $ANTLR start "rule__Predicate__Group_3_1__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2635:1: rule__Predicate__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Predicate__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2639:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2640:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2640:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2641:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,9,FOLLOW_9_in_rule__Predicate__Group_3_1__0__Impl5457); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getCommaKeyword_3_1_0()); 
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
    // $ANTLR end "rule__Predicate__Group_3_1__0__Impl"


    // $ANTLR start "rule__Predicate__Group_3_1__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2654:1: rule__Predicate__Group_3_1__1 : rule__Predicate__Group_3_1__1__Impl ;
    public final void rule__Predicate__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2658:1: ( rule__Predicate__Group_3_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2659:2: rule__Predicate__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3_1__1__Impl_in_rule__Predicate__Group_3_1__15488);
            rule__Predicate__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Predicate__Group_3_1__1"


    // $ANTLR start "rule__Predicate__Group_3_1__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2665:1: rule__Predicate__Group_3_1__1__Impl : ( rulePrimaryExpr ) ;
    public final void rule__Predicate__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2669:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2670:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2670:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2671:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPrimaryExprParserRuleCall_3_1_1()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__Predicate__Group_3_1__1__Impl5515);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getPrimaryExprParserRuleCall_3_1_1()); 
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
    // $ANTLR end "rule__Predicate__Group_3_1__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2686:1: rule__PrimaryExpr__Group__0 : rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 ;
    public final void rule__PrimaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2690:1: ( rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2691:2: rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__0__Impl_in_rule__PrimaryExpr__Group__05548);
            rule__PrimaryExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__1_in_rule__PrimaryExpr__Group__05551);
            rule__PrimaryExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpr__Group__0"


    // $ANTLR start "rule__PrimaryExpr__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2698:1: rule__PrimaryExpr__Group__0__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__PrimaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2702:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2703:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2703:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2704:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2705:1: ( RULE_WSP )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_WSP) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2705:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group__0__Impl5579); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__PrimaryExpr__Group__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2715:1: rule__PrimaryExpr__Group__1 : rule__PrimaryExpr__Group__1__Impl rule__PrimaryExpr__Group__2 ;
    public final void rule__PrimaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2719:1: ( rule__PrimaryExpr__Group__1__Impl rule__PrimaryExpr__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2720:2: rule__PrimaryExpr__Group__1__Impl rule__PrimaryExpr__Group__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__1__Impl_in_rule__PrimaryExpr__Group__15610);
            rule__PrimaryExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__2_in_rule__PrimaryExpr__Group__15613);
            rule__PrimaryExpr__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpr__Group__1"


    // $ANTLR start "rule__PrimaryExpr__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2727:1: rule__PrimaryExpr__Group__1__Impl : ( ( rule__PrimaryExpr__Alternatives_1 ) ) ;
    public final void rule__PrimaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2731:1: ( ( ( rule__PrimaryExpr__Alternatives_1 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2732:1: ( ( rule__PrimaryExpr__Alternatives_1 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2732:1: ( ( rule__PrimaryExpr__Alternatives_1 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2733:1: ( rule__PrimaryExpr__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getAlternatives_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2734:1: ( rule__PrimaryExpr__Alternatives_1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2734:2: rule__PrimaryExpr__Alternatives_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Alternatives_1_in_rule__PrimaryExpr__Group__1__Impl5640);
            rule__PrimaryExpr__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__PrimaryExpr__Group__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2744:1: rule__PrimaryExpr__Group__2 : rule__PrimaryExpr__Group__2__Impl ;
    public final void rule__PrimaryExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2748:1: ( rule__PrimaryExpr__Group__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2749:2: rule__PrimaryExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__2__Impl_in_rule__PrimaryExpr__Group__25670);
            rule__PrimaryExpr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpr__Group__2"


    // $ANTLR start "rule__PrimaryExpr__Group__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2755:1: rule__PrimaryExpr__Group__2__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__PrimaryExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2759:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2760:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2760:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2761:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2762:1: ( RULE_WSP )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_WSP) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred61_InternalRQL()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2762:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group__2__Impl5698); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__PrimaryExpr__Group__2__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_1_0__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2778:1: rule__PrimaryExpr__Group_1_0__0 : rule__PrimaryExpr__Group_1_0__0__Impl rule__PrimaryExpr__Group_1_0__1 ;
    public final void rule__PrimaryExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2782:1: ( rule__PrimaryExpr__Group_1_0__0__Impl rule__PrimaryExpr__Group_1_0__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2783:2: rule__PrimaryExpr__Group_1_0__0__Impl rule__PrimaryExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__0__Impl_in_rule__PrimaryExpr__Group_1_0__05735);
            rule__PrimaryExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__1_in_rule__PrimaryExpr__Group_1_0__05738);
            rule__PrimaryExpr__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpr__Group_1_0__0"


    // $ANTLR start "rule__PrimaryExpr__Group_1_0__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2790:1: rule__PrimaryExpr__Group_1_0__0__Impl : ( ruleConstFuncTbl ) ;
    public final void rule__PrimaryExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2794:1: ( ( ruleConstFuncTbl ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2795:1: ( ruleConstFuncTbl )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2795:1: ( ruleConstFuncTbl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2796:1: ruleConstFuncTbl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getConstFuncTblParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleConstFuncTbl_in_rule__PrimaryExpr__Group_1_0__0__Impl5765);
            ruleConstFuncTbl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getConstFuncTblParserRuleCall_1_0_0()); 
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
    // $ANTLR end "rule__PrimaryExpr__Group_1_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_1_0__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2807:1: rule__PrimaryExpr__Group_1_0__1 : rule__PrimaryExpr__Group_1_0__1__Impl rule__PrimaryExpr__Group_1_0__2 ;
    public final void rule__PrimaryExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2811:1: ( rule__PrimaryExpr__Group_1_0__1__Impl rule__PrimaryExpr__Group_1_0__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2812:2: rule__PrimaryExpr__Group_1_0__1__Impl rule__PrimaryExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__1__Impl_in_rule__PrimaryExpr__Group_1_0__15794);
            rule__PrimaryExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__2_in_rule__PrimaryExpr__Group_1_0__15797);
            rule__PrimaryExpr__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpr__Group_1_0__1"


    // $ANTLR start "rule__PrimaryExpr__Group_1_0__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2819:1: rule__PrimaryExpr__Group_1_0__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__PrimaryExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2823:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2824:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2824:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2825:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_1_0_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2826:1: ( RULE_WSP )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WSP) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2826:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group_1_0__1__Impl5825); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_1_0_1()); 
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
    // $ANTLR end "rule__PrimaryExpr__Group_1_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_1_0__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2836:1: rule__PrimaryExpr__Group_1_0__2 : rule__PrimaryExpr__Group_1_0__2__Impl rule__PrimaryExpr__Group_1_0__3 ;
    public final void rule__PrimaryExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2840:1: ( rule__PrimaryExpr__Group_1_0__2__Impl rule__PrimaryExpr__Group_1_0__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2841:2: rule__PrimaryExpr__Group_1_0__2__Impl rule__PrimaryExpr__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__2__Impl_in_rule__PrimaryExpr__Group_1_0__25856);
            rule__PrimaryExpr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__3_in_rule__PrimaryExpr__Group_1_0__25859);
            rule__PrimaryExpr__Group_1_0__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpr__Group_1_0__2"


    // $ANTLR start "rule__PrimaryExpr__Group_1_0__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2848:1: rule__PrimaryExpr__Group_1_0__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2852:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2853:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2853:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2854:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_1_0_2()); 
            }
            match(input,49,FOLLOW_49_in_rule__PrimaryExpr__Group_1_0__2__Impl5887); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_1_0_2()); 
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
    // $ANTLR end "rule__PrimaryExpr__Group_1_0__2__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_1_0__3"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2867:1: rule__PrimaryExpr__Group_1_0__3 : rule__PrimaryExpr__Group_1_0__3__Impl rule__PrimaryExpr__Group_1_0__4 ;
    public final void rule__PrimaryExpr__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2871:1: ( rule__PrimaryExpr__Group_1_0__3__Impl rule__PrimaryExpr__Group_1_0__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2872:2: rule__PrimaryExpr__Group_1_0__3__Impl rule__PrimaryExpr__Group_1_0__4
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__3__Impl_in_rule__PrimaryExpr__Group_1_0__35918);
            rule__PrimaryExpr__Group_1_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__4_in_rule__PrimaryExpr__Group_1_0__35921);
            rule__PrimaryExpr__Group_1_0__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpr__Group_1_0__3"


    // $ANTLR start "rule__PrimaryExpr__Group_1_0__3__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2879:1: rule__PrimaryExpr__Group_1_0__3__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__PrimaryExpr__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2883:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2884:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2884:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2885:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_1_0_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2886:1: ( RULE_WSP )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WSP) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2886:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group_1_0__3__Impl5949); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_1_0_3()); 
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
    // $ANTLR end "rule__PrimaryExpr__Group_1_0__3__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_1_0__4"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2896:1: rule__PrimaryExpr__Group_1_0__4 : rule__PrimaryExpr__Group_1_0__4__Impl ;
    public final void rule__PrimaryExpr__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2900:1: ( rule__PrimaryExpr__Group_1_0__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2901:2: rule__PrimaryExpr__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__4__Impl_in_rule__PrimaryExpr__Group_1_0__45980);
            rule__PrimaryExpr__Group_1_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__PrimaryExpr__Group_1_0__4"


    // $ANTLR start "rule__PrimaryExpr__Group_1_0__4__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2907:1: rule__PrimaryExpr__Group_1_0__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpr__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2911:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2912:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2912:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2913:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_1_0_4()); 
            }
            match(input,50,FOLLOW_50_in_rule__PrimaryExpr__Group_1_0__4__Impl6008); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_1_0_4()); 
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
    // $ANTLR end "rule__PrimaryExpr__Group_1_0__4__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2936:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2940:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2941:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__06049);
            rule__Array__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__06052);
            rule__Array__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array__Group__0"


    // $ANTLR start "rule__Array__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2948:1: rule__Array__Group__0__Impl : ( '(' ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2952:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2953:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2953:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2954:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__Array__Group__0__Impl6080); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getLeftParenthesisKeyword_0()); 
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
    // $ANTLR end "rule__Array__Group__0__Impl"


    // $ANTLR start "rule__Array__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2967:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2971:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2972:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__16111);
            rule__Array__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__16114);
            rule__Array__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array__Group__1"


    // $ANTLR start "rule__Array__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2979:1: rule__Array__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2983:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2984:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2984:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2985:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2986:1: ( RULE_WSP )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_WSP) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2986:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group__1__Impl6142); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Array__Group__1__Impl"


    // $ANTLR start "rule__Array__Group__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2996:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3000:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3001:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__26173);
            rule__Array__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__26176);
            rule__Array__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array__Group__2"


    // $ANTLR start "rule__Array__Group__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3008:1: rule__Array__Group__2__Impl : ( ruleStrval ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3012:1: ( ( ruleStrval ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3013:1: ( ruleStrval )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3013:1: ( ruleStrval )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3014:1: ruleStrval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getStrvalParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_rule__Array__Group__2__Impl6203);
            ruleStrval();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getStrvalParserRuleCall_2()); 
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
    // $ANTLR end "rule__Array__Group__2__Impl"


    // $ANTLR start "rule__Array__Group__3"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3025:1: rule__Array__Group__3 : rule__Array__Group__3__Impl rule__Array__Group__4 ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3029:1: ( rule__Array__Group__3__Impl rule__Array__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3030:2: rule__Array__Group__3__Impl rule__Array__Group__4
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__36232);
            rule__Array__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__4_in_rule__Array__Group__36235);
            rule__Array__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array__Group__3"


    // $ANTLR start "rule__Array__Group__3__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3037:1: rule__Array__Group__3__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3041:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3042:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3042:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3043:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3044:1: ( RULE_WSP )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_WSP) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3044:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group__3__Impl6263); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_3()); 
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
    // $ANTLR end "rule__Array__Group__3__Impl"


    // $ANTLR start "rule__Array__Group__4"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3054:1: rule__Array__Group__4 : rule__Array__Group__4__Impl rule__Array__Group__5 ;
    public final void rule__Array__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3058:1: ( rule__Array__Group__4__Impl rule__Array__Group__5 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3059:2: rule__Array__Group__4__Impl rule__Array__Group__5
            {
            pushFollow(FOLLOW_rule__Array__Group__4__Impl_in_rule__Array__Group__46294);
            rule__Array__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__5_in_rule__Array__Group__46297);
            rule__Array__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array__Group__4"


    // $ANTLR start "rule__Array__Group__4__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3066:1: rule__Array__Group__4__Impl : ( ( rule__Array__Group_4__0 )* ) ;
    public final void rule__Array__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3070:1: ( ( ( rule__Array__Group_4__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3071:1: ( ( rule__Array__Group_4__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3071:1: ( ( rule__Array__Group_4__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3072:1: ( rule__Array__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup_4()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3073:1: ( rule__Array__Group_4__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==9) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3073:2: rule__Array__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Array__Group_4__0_in_rule__Array__Group__4__Impl6324);
            	    rule__Array__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Array__Group__4__Impl"


    // $ANTLR start "rule__Array__Group__5"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3083:1: rule__Array__Group__5 : rule__Array__Group__5__Impl ;
    public final void rule__Array__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3087:1: ( rule__Array__Group__5__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3088:2: rule__Array__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__5__Impl_in_rule__Array__Group__56355);
            rule__Array__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array__Group__5"


    // $ANTLR start "rule__Array__Group__5__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3094:1: rule__Array__Group__5__Impl : ( ')' ) ;
    public final void rule__Array__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3098:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3099:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3099:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3100:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,50,FOLLOW_50_in_rule__Array__Group__5__Impl6383); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getRightParenthesisKeyword_5()); 
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
    // $ANTLR end "rule__Array__Group__5__Impl"


    // $ANTLR start "rule__Array__Group_4__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3125:1: rule__Array__Group_4__0 : rule__Array__Group_4__0__Impl rule__Array__Group_4__1 ;
    public final void rule__Array__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3129:1: ( rule__Array__Group_4__0__Impl rule__Array__Group_4__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3130:2: rule__Array__Group_4__0__Impl rule__Array__Group_4__1
            {
            pushFollow(FOLLOW_rule__Array__Group_4__0__Impl_in_rule__Array__Group_4__06426);
            rule__Array__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group_4__1_in_rule__Array__Group_4__06429);
            rule__Array__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array__Group_4__0"


    // $ANTLR start "rule__Array__Group_4__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3137:1: rule__Array__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3141:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3142:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3142:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3143:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getCommaKeyword_4_0()); 
            }
            match(input,9,FOLLOW_9_in_rule__Array__Group_4__0__Impl6457); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getCommaKeyword_4_0()); 
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
    // $ANTLR end "rule__Array__Group_4__0__Impl"


    // $ANTLR start "rule__Array__Group_4__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3156:1: rule__Array__Group_4__1 : rule__Array__Group_4__1__Impl rule__Array__Group_4__2 ;
    public final void rule__Array__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3160:1: ( rule__Array__Group_4__1__Impl rule__Array__Group_4__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3161:2: rule__Array__Group_4__1__Impl rule__Array__Group_4__2
            {
            pushFollow(FOLLOW_rule__Array__Group_4__1__Impl_in_rule__Array__Group_4__16488);
            rule__Array__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group_4__2_in_rule__Array__Group_4__16491);
            rule__Array__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array__Group_4__1"


    // $ANTLR start "rule__Array__Group_4__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3168:1: rule__Array__Group_4__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3172:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3173:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3173:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3174:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3175:1: ( RULE_WSP )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_WSP) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3175:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group_4__1__Impl6519); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_1()); 
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
    // $ANTLR end "rule__Array__Group_4__1__Impl"


    // $ANTLR start "rule__Array__Group_4__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3185:1: rule__Array__Group_4__2 : rule__Array__Group_4__2__Impl rule__Array__Group_4__3 ;
    public final void rule__Array__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3189:1: ( rule__Array__Group_4__2__Impl rule__Array__Group_4__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3190:2: rule__Array__Group_4__2__Impl rule__Array__Group_4__3
            {
            pushFollow(FOLLOW_rule__Array__Group_4__2__Impl_in_rule__Array__Group_4__26550);
            rule__Array__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group_4__3_in_rule__Array__Group_4__26553);
            rule__Array__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array__Group_4__2"


    // $ANTLR start "rule__Array__Group_4__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3197:1: rule__Array__Group_4__2__Impl : ( ruleStrval ) ;
    public final void rule__Array__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3201:1: ( ( ruleStrval ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3202:1: ( ruleStrval )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3202:1: ( ruleStrval )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3203:1: ruleStrval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getStrvalParserRuleCall_4_2()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_rule__Array__Group_4__2__Impl6580);
            ruleStrval();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getStrvalParserRuleCall_4_2()); 
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
    // $ANTLR end "rule__Array__Group_4__2__Impl"


    // $ANTLR start "rule__Array__Group_4__3"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3214:1: rule__Array__Group_4__3 : rule__Array__Group_4__3__Impl ;
    public final void rule__Array__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3218:1: ( rule__Array__Group_4__3__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3219:2: rule__Array__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_4__3__Impl_in_rule__Array__Group_4__36609);
            rule__Array__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Array__Group_4__3"


    // $ANTLR start "rule__Array__Group_4__3__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3225:1: rule__Array__Group_4__3__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3229:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3230:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3230:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3231:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3232:1: ( RULE_WSP )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_WSP) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3232:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group_4__3__Impl6637); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_3()); 
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
    // $ANTLR end "rule__Array__Group_4__3__Impl"


    // $ANTLR start "rule__Pct_encoded__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3250:1: rule__Pct_encoded__Group__0 : rule__Pct_encoded__Group__0__Impl rule__Pct_encoded__Group__1 ;
    public final void rule__Pct_encoded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3254:1: ( rule__Pct_encoded__Group__0__Impl rule__Pct_encoded__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3255:2: rule__Pct_encoded__Group__0__Impl rule__Pct_encoded__Group__1
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__0__Impl_in_rule__Pct_encoded__Group__06676);
            rule__Pct_encoded__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pct_encoded__Group__1_in_rule__Pct_encoded__Group__06679);
            rule__Pct_encoded__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pct_encoded__Group__0"


    // $ANTLR start "rule__Pct_encoded__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3262:1: rule__Pct_encoded__Group__0__Impl : ( '%' ) ;
    public final void rule__Pct_encoded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3266:1: ( ( '%' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3267:1: ( '%' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3267:1: ( '%' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3268:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getPercentSignKeyword_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__Pct_encoded__Group__0__Impl6707); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPct_encodedAccess().getPercentSignKeyword_0()); 
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
    // $ANTLR end "rule__Pct_encoded__Group__0__Impl"


    // $ANTLR start "rule__Pct_encoded__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3281:1: rule__Pct_encoded__Group__1 : rule__Pct_encoded__Group__1__Impl rule__Pct_encoded__Group__2 ;
    public final void rule__Pct_encoded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3285:1: ( rule__Pct_encoded__Group__1__Impl rule__Pct_encoded__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3286:2: rule__Pct_encoded__Group__1__Impl rule__Pct_encoded__Group__2
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__1__Impl_in_rule__Pct_encoded__Group__16738);
            rule__Pct_encoded__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pct_encoded__Group__2_in_rule__Pct_encoded__Group__16741);
            rule__Pct_encoded__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pct_encoded__Group__1"


    // $ANTLR start "rule__Pct_encoded__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3293:1: rule__Pct_encoded__Group__1__Impl : ( RULE_XDIGIT ) ;
    public final void rule__Pct_encoded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3297:1: ( ( RULE_XDIGIT ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3298:1: ( RULE_XDIGIT )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3298:1: ( RULE_XDIGIT )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3299:1: RULE_XDIGIT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_1()); 
            }
            match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__1__Impl6768); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__Pct_encoded__Group__1__Impl"


    // $ANTLR start "rule__Pct_encoded__Group__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3310:1: rule__Pct_encoded__Group__2 : rule__Pct_encoded__Group__2__Impl ;
    public final void rule__Pct_encoded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3314:1: ( rule__Pct_encoded__Group__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3315:2: rule__Pct_encoded__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__2__Impl_in_rule__Pct_encoded__Group__26797);
            rule__Pct_encoded__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Pct_encoded__Group__2"


    // $ANTLR start "rule__Pct_encoded__Group__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3321:1: rule__Pct_encoded__Group__2__Impl : ( RULE_XDIGIT ) ;
    public final void rule__Pct_encoded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3325:1: ( ( RULE_XDIGIT ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3326:1: ( RULE_XDIGIT )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3326:1: ( RULE_XDIGIT )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3327:1: RULE_XDIGIT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_2()); 
            }
            match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__2__Impl6824); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_2()); 
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
    // $ANTLR end "rule__Pct_encoded__Group__2__Impl"


    // $ANTLR start "rule__Model__OperandsAssignment_0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3345:1: rule__Model__OperandsAssignment_0 : ( ruleHoOperand ) ;
    public final void rule__Model__OperandsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3349:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3350:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3350:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3351:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getOperandsHoOperandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__Model__OperandsAssignment_06864);
            ruleHoOperand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getOperandsHoOperandParserRuleCall_0_0()); 
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
    // $ANTLR end "rule__Model__OperandsAssignment_0"

    // $ANTLR start synpred61_InternalRQL
    public final void synpred61_InternalRQL_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2762:3: ( RULE_WSP )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2762:3: RULE_WSP
        {
        match(input,RULE_WSP,FOLLOW_RULE_WSP_in_synpred61_InternalRQL5698); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalRQL

    // Delegated rules

    public final boolean synpred61_InternalRQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalRQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0_in_ruleAnd160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0_in_ruleOr220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_entryRuleHoOperand247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHoOperand254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__0_in_ruleHoOperand280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHigherOrderCall_in_entryRuleHigherOrderCall307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHigherOrderCall314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__0_in_ruleHigherOrderCall340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOpAliases_in_entryRuleBinaryOpAliases367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOpAliases374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryOpAliases__Alternatives_in_ruleBinaryOpAliases400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompOps_in_entryRuleCompOps427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompOps434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompOps__Alternatives_in_ruleCompOps460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_entryRuleCallOperator547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallOperator554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__0_in_ruleCallOperator580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__0_in_rulePredicate640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredTbl_in_entryRulePredTbl667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredTbl674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredTbl__Alternatives_in_rulePredTbl700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpr734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__0_in_rulePrimaryExpr760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionsTbl_in_entryRuleFunctionsTbl787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionsTbl794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionsTbl__Alternatives_in_ruleFunctionsTbl820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstFuncTbl_in_entryRuleConstFuncTbl847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstFuncTbl854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstFuncTbl__Alternatives_in_ruleConstFuncTbl880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNchar_in_entryRuleNchar967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNchar974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nchar__Alternatives_in_ruleNchar1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePct_encoded_in_entryRulePct_encoded1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePct_encoded1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__0_in_rulePct_encoded1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_entryRuleStrval1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrval1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Strval__Alternatives_in_ruleStrval1122 = new BitSet(new long[]{0x0009FFC000000032L});
    public static final BitSet FOLLOW_rule__Strval__Alternatives_in_ruleStrval1134 = new BitSet(new long[]{0x0009FFC000000032L});
    public static final BitSet FOLLOW_9_in_rule__Model__Alternatives_1_01174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Model__Alternatives_1_01194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Or__Alternatives_01229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Or__Alternatives_01249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHigherOrderCall_in_rule__HoOperand__Alternatives_11283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_rule__HoOperand__Alternatives_11300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__HoOperand__Alternatives_11317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__HoOperand__Alternatives_11334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__0_in_rule__HoOperand__Alternatives_11351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__HoOperand__Alternatives_1_4_21387 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__HoOperand__Alternatives_1_4_21400 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ruleOr_in_rule__HoOperand__Alternatives_1_4_21424 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleOr_in_rule__HoOperand__Alternatives_1_4_21437 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_13_in_rule__BinaryOpAliases__Alternatives1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BinaryOpAliases__Alternatives1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BinaryOpAliases__Alternatives1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BinaryOpAliases__Alternatives1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BinaryOpAliases__Alternatives1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BinaryOpAliases__Alternatives1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BinaryOpAliases__Alternatives1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CompOps__Alternatives1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CompOps__Alternatives1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CompOps__Alternatives1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompOps__Alternatives1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CompOps__Alternatives1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompOps__Alternatives1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_2_0__0_in_rule__Comparison__Alternatives_21763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompOps_in_rule__Comparison__Alternatives_21781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOpAliases_in_rule__CallOperator__Alternatives_01813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionsTbl_in_rule__CallOperator__Alternatives_01830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PredTbl__Alternatives1863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PredTbl__Alternatives1883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PredTbl__Alternatives1903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PredTbl__Alternatives1923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PredTbl__Alternatives1943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__0_in_rule__PrimaryExpr__Alternatives_11977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__PrimaryExpr__Alternatives_11995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__PrimaryExpr__Alternatives_12012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FunctionsTbl__Alternatives2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FunctionsTbl__Alternatives2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__FunctionsTbl__Alternatives2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ConstFuncTbl__Alternatives2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ConstFuncTbl__Alternatives2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__ConstFuncTbl__Alternatives2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__ConstFuncTbl__Alternatives2180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rule__Nchar__Alternatives2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rule__Nchar__Alternatives2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Nchar__Alternatives2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Nchar__Alternatives2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Nchar__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Nchar__Alternatives2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Nchar__Alternatives2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Nchar__Alternatives2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Nchar__Alternatives2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Nchar__Alternatives2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Nchar__Alternatives2409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Nchar__Alternatives2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Nchar__Alternatives2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNchar_in_rule__Strval__Alternatives2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePct_encoded_in_rule__Strval__Alternatives2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02530 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__OperandsAssignment_0_in_rule__Model__Group__0__Impl2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl2617 = new BitSet(new long[]{0x0000000000000602L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__02652 = new BitSet(new long[]{0x000BFFC3FC0FE0F0L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__02655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_1_0_in_rule__Model__Group_1__0__Impl2682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__12712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__Model__Group_1__1__Impl2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__02772 = new BitSet(new long[]{0x000BFFC3FC0FE0F0L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__02775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__And__Group__0__Impl2803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__12834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__And__Group__1__Impl2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__02894 = new BitSet(new long[]{0x000BFFC3FC0FE0F0L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__02897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Alternatives_0_in_rule__Or__Group__0__Impl2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__12954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__Or__Group__1__Impl2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__0__Impl_in_rule__HoOperand__Group__03014 = new BitSet(new long[]{0x000BFFC3FC0FE0F0L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__1_in_rule__HoOperand__Group__03017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__HoOperand__Group__0__Impl3045 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__1__Impl_in_rule__HoOperand__Group__13076 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__2_in_rule__HoOperand__Group__13079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Alternatives_1_in_rule__HoOperand__Group__1__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__2__Impl_in_rule__HoOperand__Group__23136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__HoOperand__Group__2__Impl3164 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__0__Impl_in_rule__HoOperand__Group_1_4__03201 = new BitSet(new long[]{0x000BFFC3FC0FE0F0L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__1_in_rule__HoOperand__Group_1_4__03204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__HoOperand__Group_1_4__0__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__1__Impl_in_rule__HoOperand__Group_1_4__13263 = new BitSet(new long[]{0x0000000000001C00L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__2_in_rule__HoOperand__Group_1_4__13266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__HoOperand__Group_1_4__1__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__2__Impl_in_rule__HoOperand__Group_1_4__23322 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__3_in_rule__HoOperand__Group_1_4__23325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Alternatives_1_4_2_in_rule__HoOperand__Group_1_4__2__Impl3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__3__Impl_in_rule__HoOperand__Group_1_4__33382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__HoOperand__Group_1_4__3__Impl3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__0__Impl_in_rule__HigherOrderCall__Group__03449 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__1_in_rule__HigherOrderCall__Group__03452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LOGICAL_OP_ALIASES_in_rule__HigherOrderCall__Group__0__Impl3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__1__Impl_in_rule__HigherOrderCall__Group__13508 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__2_in_rule__HigherOrderCall__Group__13511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__HigherOrderCall__Group__1__Impl3539 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__2__Impl_in_rule__HigherOrderCall__Group__23570 = new BitSet(new long[]{0x000BFFC3FC0FE0F0L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__3_in_rule__HigherOrderCall__Group__23573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__HigherOrderCall__Group__2__Impl3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__3__Impl_in_rule__HigherOrderCall__Group__33632 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__4_in_rule__HigherOrderCall__Group__33635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3__0_in_rule__HigherOrderCall__Group__3__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__4__Impl_in_rule__HigherOrderCall__Group__43692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__HigherOrderCall__Group__4__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3__0__Impl_in_rule__HigherOrderCall__Group_3__03761 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3__1_in_rule__HigherOrderCall__Group_3__03764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__HigherOrderCall__Group_3__0__Impl3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3__1__Impl_in_rule__HigherOrderCall__Group_3__13820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3_1__0_in_rule__HigherOrderCall__Group_3__1__Impl3847 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3_1__0__Impl_in_rule__HigherOrderCall__Group_3_1__03882 = new BitSet(new long[]{0x000BFFC3FC0FE0F0L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3_1__1_in_rule__HigherOrderCall__Group_3_1__03885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__HigherOrderCall__Group_3_1__0__Impl3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3_1__1__Impl_in_rule__HigherOrderCall__Group_3_1__13944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__HigherOrderCall__Group_3_1__1__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04004 = new BitSet(new long[]{0x0000000003F00040L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__Comparison__Group__0__Impl4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14063 = new BitSet(new long[]{0x0000000003F00040L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__14066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Comparison__Group__1__Impl4094 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__24125 = new BitSet(new long[]{0x000BFFFC00000070L});
    public static final BitSet FOLLOW_rule__Comparison__Group__3_in_rule__Comparison__Group__24128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Alternatives_2_in_rule__Comparison__Group__2__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__3__Impl_in_rule__Comparison__Group__34185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__Comparison__Group__3__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_2_0__0__Impl_in_rule__Comparison__Group_2_0__04249 = new BitSet(new long[]{0x00000000000FE000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_2_0__1_in_rule__Comparison__Group_2_0__04252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Comparison__Group_2_0__0__Impl4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_2_0__1__Impl_in_rule__Comparison__Group_2_0__14311 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_2_0__2_in_rule__Comparison__Group_2_0__14314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOpAliases_in_rule__Comparison__Group_2_0__1__Impl4341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_2_0__2__Impl_in_rule__Comparison__Group_2_0__24370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Comparison__Group_2_0__2__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__0__Impl_in_rule__CallOperator__Group__04435 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__1_in_rule__CallOperator__Group__04438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Alternatives_0_in_rule__CallOperator__Group__0__Impl4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__1__Impl_in_rule__CallOperator__Group__14495 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__2_in_rule__CallOperator__Group__14498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__CallOperator__Group__1__Impl4526 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__2__Impl_in_rule__CallOperator__Group__24557 = new BitSet(new long[]{0x000FFFFC00000070L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__3_in_rule__CallOperator__Group__24560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__CallOperator__Group__2__Impl4588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__3__Impl_in_rule__CallOperator__Group__34619 = new BitSet(new long[]{0x000FFFFC00000070L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__4_in_rule__CallOperator__Group__34622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3__0_in_rule__CallOperator__Group__3__Impl4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__4__Impl_in_rule__CallOperator__Group__44680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__CallOperator__Group__4__Impl4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3__0__Impl_in_rule__CallOperator__Group_3__04749 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3__1_in_rule__CallOperator__Group_3__04752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__CallOperator__Group_3__0__Impl4779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3__1__Impl_in_rule__CallOperator__Group_3__14808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3_1__0_in_rule__CallOperator__Group_3__1__Impl4835 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3_1__0__Impl_in_rule__CallOperator__Group_3_1__04870 = new BitSet(new long[]{0x000BFFFC00000070L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3_1__1_in_rule__CallOperator__Group_3_1__04873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__CallOperator__Group_3_1__0__Impl4901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3_1__1__Impl_in_rule__CallOperator__Group_3_1__14932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__CallOperator__Group_3_1__1__Impl4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__04992 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__04995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredTbl_in_rule__Predicate__Group__0__Impl5022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__15051 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_rule__Predicate__Group__2_in_rule__Predicate__Group__15054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Predicate__Group__1__Impl5082 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Predicate__Group__2__Impl_in_rule__Predicate__Group__25113 = new BitSet(new long[]{0x000FFFFC00000070L});
    public static final BitSet FOLLOW_rule__Predicate__Group__3_in_rule__Predicate__Group__25116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Predicate__Group__2__Impl5144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__3__Impl_in_rule__Predicate__Group__35175 = new BitSet(new long[]{0x000FFFFC00000070L});
    public static final BitSet FOLLOW_rule__Predicate__Group__4_in_rule__Predicate__Group__35178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__0_in_rule__Predicate__Group__3__Impl5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__4__Impl_in_rule__Predicate__Group__45236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Predicate__Group__4__Impl5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__0__Impl_in_rule__Predicate__Group_3__05305 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__1_in_rule__Predicate__Group_3__05308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__Predicate__Group_3__0__Impl5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__1__Impl_in_rule__Predicate__Group_3__15364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__0_in_rule__Predicate__Group_3__1__Impl5391 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__0__Impl_in_rule__Predicate__Group_3_1__05426 = new BitSet(new long[]{0x000BFFFC00000070L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__1_in_rule__Predicate__Group_3_1__05429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Predicate__Group_3_1__0__Impl5457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__1__Impl_in_rule__Predicate__Group_3_1__15488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__Predicate__Group_3_1__1__Impl5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__0__Impl_in_rule__PrimaryExpr__Group__05548 = new BitSet(new long[]{0x000BFFFC00000070L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__1_in_rule__PrimaryExpr__Group__05551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group__0__Impl5579 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__1__Impl_in_rule__PrimaryExpr__Group__15610 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__2_in_rule__PrimaryExpr__Group__15613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Alternatives_1_in_rule__PrimaryExpr__Group__1__Impl5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__2__Impl_in_rule__PrimaryExpr__Group__25670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group__2__Impl5698 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__0__Impl_in_rule__PrimaryExpr__Group_1_0__05735 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__1_in_rule__PrimaryExpr__Group_1_0__05738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstFuncTbl_in_rule__PrimaryExpr__Group_1_0__0__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__1__Impl_in_rule__PrimaryExpr__Group_1_0__15794 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__2_in_rule__PrimaryExpr__Group_1_0__15797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group_1_0__1__Impl5825 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__2__Impl_in_rule__PrimaryExpr__Group_1_0__25856 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__3_in_rule__PrimaryExpr__Group_1_0__25859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__PrimaryExpr__Group_1_0__2__Impl5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__3__Impl_in_rule__PrimaryExpr__Group_1_0__35918 = new BitSet(new long[]{0x0004000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__4_in_rule__PrimaryExpr__Group_1_0__35921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group_1_0__3__Impl5949 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__4__Impl_in_rule__PrimaryExpr__Group_1_0__45980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__PrimaryExpr__Group_1_0__4__Impl6008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__06049 = new BitSet(new long[]{0x0009FFC000000070L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__06052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Array__Group__0__Impl6080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__16111 = new BitSet(new long[]{0x0009FFC000000070L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__16114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group__1__Impl6142 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__26173 = new BitSet(new long[]{0x0004000000000240L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__26176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__Array__Group__2__Impl6203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__36232 = new BitSet(new long[]{0x0004000000000240L});
    public static final BitSet FOLLOW_rule__Array__Group__4_in_rule__Array__Group__36235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group__3__Impl6263 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Array__Group__4__Impl_in_rule__Array__Group__46294 = new BitSet(new long[]{0x0004000000000240L});
    public static final BitSet FOLLOW_rule__Array__Group__5_in_rule__Array__Group__46297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__0_in_rule__Array__Group__4__Impl6324 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_rule__Array__Group__5__Impl_in_rule__Array__Group__56355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Array__Group__5__Impl6383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__0__Impl_in_rule__Array__Group_4__06426 = new BitSet(new long[]{0x0009FFC000000070L});
    public static final BitSet FOLLOW_rule__Array__Group_4__1_in_rule__Array__Group_4__06429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Array__Group_4__0__Impl6457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__1__Impl_in_rule__Array__Group_4__16488 = new BitSet(new long[]{0x0009FFC000000070L});
    public static final BitSet FOLLOW_rule__Array__Group_4__2_in_rule__Array__Group_4__16491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group_4__1__Impl6519 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Array__Group_4__2__Impl_in_rule__Array__Group_4__26550 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Array__Group_4__3_in_rule__Array__Group_4__26553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__Array__Group_4__2__Impl6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__3__Impl_in_rule__Array__Group_4__36609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group_4__3__Impl6637 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__0__Impl_in_rule__Pct_encoded__Group__06676 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__1_in_rule__Pct_encoded__Group__06679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Pct_encoded__Group__0__Impl6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__1__Impl_in_rule__Pct_encoded__Group__16738 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__2_in_rule__Pct_encoded__Group__16741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__1__Impl6768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__2__Impl_in_rule__Pct_encoded__Group__26797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__2__Impl6824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__Model__OperandsAssignment_06864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_synpred61_InternalRQL5698 = new BitSet(new long[]{0x0000000000000002L});

}