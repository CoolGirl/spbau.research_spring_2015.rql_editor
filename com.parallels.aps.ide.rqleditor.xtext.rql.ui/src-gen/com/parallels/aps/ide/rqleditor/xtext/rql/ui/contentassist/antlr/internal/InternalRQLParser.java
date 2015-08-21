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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ALPHA", "RULE_DIGIT", "RULE_WSP", "RULE_XDIGIT", "','", "'&'", "';'", "'|'", "'=ne='", "'=eq='", "'=lt='", "'=le='", "'=gt='", "'=ge='", "'=like='", "'ne'", "'eq'", "'lt'", "'le'", "'gt'", "'ge'", "'like'", "'!='", "'='", "'<'", "'<='", "'>'", "'>='", "'select'", "'sort'", "'limit'", "'implementing'", "'composing'", "'isnull'", "'in'", "'out'", "'true'", "'false'", "'empty'", "'null'", "'-'", "'.'", "'_'", "'~'", "'$'", "':'", "'*'", "'+'", "'?'", "'/'", "'@'", "'or'", "'and'", "'not'", "'('", "')'", "'%'"
    };
    public static final int T__50=50;
    public static final int RULE_WSP=6;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__10=10;
    public static final int T__54=54;
    public static final int T__9=9;
    public static final int T__60=60;
    public static final int T__8=8;
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
    public static final int RULE_XDIGIT=7;
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


    // $ANTLR start "entryRuleBinaryOpAliasesWithEqualsSign"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:201:1: entryRuleBinaryOpAliasesWithEqualsSign : ruleBinaryOpAliasesWithEqualsSign EOF ;
    public final void entryRuleBinaryOpAliasesWithEqualsSign() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:202:1: ( ruleBinaryOpAliasesWithEqualsSign EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:203:1: ruleBinaryOpAliasesWithEqualsSign EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOpAliasesWithEqualsSignRule()); 
            }
            pushFollow(FOLLOW_ruleBinaryOpAliasesWithEqualsSign_in_entryRuleBinaryOpAliasesWithEqualsSign367);
            ruleBinaryOpAliasesWithEqualsSign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryOpAliasesWithEqualsSignRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOpAliasesWithEqualsSign374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBinaryOpAliasesWithEqualsSign"


    // $ANTLR start "ruleBinaryOpAliasesWithEqualsSign"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:210:1: ruleBinaryOpAliasesWithEqualsSign : ( ( rule__BinaryOpAliasesWithEqualsSign__Alternatives ) ) ;
    public final void ruleBinaryOpAliasesWithEqualsSign() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:214:2: ( ( ( rule__BinaryOpAliasesWithEqualsSign__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:215:1: ( ( rule__BinaryOpAliasesWithEqualsSign__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:215:1: ( ( rule__BinaryOpAliasesWithEqualsSign__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:216:1: ( rule__BinaryOpAliasesWithEqualsSign__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:217:1: ( rule__BinaryOpAliasesWithEqualsSign__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:217:2: rule__BinaryOpAliasesWithEqualsSign__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryOpAliasesWithEqualsSign__Alternatives_in_ruleBinaryOpAliasesWithEqualsSign400);
            rule__BinaryOpAliasesWithEqualsSign__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBinaryOpAliasesWithEqualsSign"


    // $ANTLR start "entryRuleBinaryOpAliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:229:1: entryRuleBinaryOpAliases : ruleBinaryOpAliases EOF ;
    public final void entryRuleBinaryOpAliases() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:230:1: ( ruleBinaryOpAliases EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:231:1: ruleBinaryOpAliases EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOpAliasesRule()); 
            }
            pushFollow(FOLLOW_ruleBinaryOpAliases_in_entryRuleBinaryOpAliases427);
            ruleBinaryOpAliases();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinaryOpAliasesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOpAliases434); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:238:1: ruleBinaryOpAliases : ( ( rule__BinaryOpAliases__Alternatives ) ) ;
    public final void ruleBinaryOpAliases() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:242:2: ( ( ( rule__BinaryOpAliases__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:243:1: ( ( rule__BinaryOpAliases__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:243:1: ( ( rule__BinaryOpAliases__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:244:1: ( rule__BinaryOpAliases__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinaryOpAliasesAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:245:1: ( rule__BinaryOpAliases__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:245:2: rule__BinaryOpAliases__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryOpAliases__Alternatives_in_ruleBinaryOpAliases460);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:257:1: entryRuleCompOps : ruleCompOps EOF ;
    public final void entryRuleCompOps() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:258:1: ( ruleCompOps EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:259:1: ruleCompOps EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOpsRule()); 
            }
            pushFollow(FOLLOW_ruleCompOps_in_entryRuleCompOps487);
            ruleCompOps();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompOpsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompOps494); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:266:1: ruleCompOps : ( ( rule__CompOps__Alternatives ) ) ;
    public final void ruleCompOps() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:270:2: ( ( ( rule__CompOps__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:271:1: ( ( rule__CompOps__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:271:1: ( ( rule__CompOps__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:272:1: ( rule__CompOps__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompOpsAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:273:1: ( rule__CompOps__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:273:2: rule__CompOps__Alternatives
            {
            pushFollow(FOLLOW_rule__CompOps__Alternatives_in_ruleCompOps520);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:285:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:286:1: ( ruleComparison EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:287:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison547);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison554); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:294:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:298:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:299:1: ( ( rule__Comparison__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:299:1: ( ( rule__Comparison__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:300:1: ( rule__Comparison__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:301:1: ( rule__Comparison__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:301:2: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0_in_ruleComparison580);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:313:1: entryRuleCallOperator : ruleCallOperator EOF ;
    public final void entryRuleCallOperator() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:314:1: ( ruleCallOperator EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:315:1: ruleCallOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCallOperator_in_entryRuleCallOperator607);
            ruleCallOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCallOperatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallOperator614); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:322:1: ruleCallOperator : ( ( rule__CallOperator__Group__0 ) ) ;
    public final void ruleCallOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:326:2: ( ( ( rule__CallOperator__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:327:1: ( ( rule__CallOperator__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:327:1: ( ( rule__CallOperator__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:328:1: ( rule__CallOperator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:329:1: ( rule__CallOperator__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:329:2: rule__CallOperator__Group__0
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__0_in_ruleCallOperator640);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:341:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:342:1: ( rulePredicate EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:343:1: rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate667);
            rulePredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate674); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:350:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:354:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:355:1: ( ( rule__Predicate__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:355:1: ( ( rule__Predicate__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:356:1: ( rule__Predicate__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:357:1: ( rule__Predicate__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:357:2: rule__Predicate__Group__0
            {
            pushFollow(FOLLOW_rule__Predicate__Group__0_in_rulePredicate700);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:369:1: entryRulePredTbl : rulePredTbl EOF ;
    public final void entryRulePredTbl() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:370:1: ( rulePredTbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:371:1: rulePredTbl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredTblRule()); 
            }
            pushFollow(FOLLOW_rulePredTbl_in_entryRulePredTbl727);
            rulePredTbl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredTblRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredTbl734); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:378:1: rulePredTbl : ( ( rule__PredTbl__Alternatives ) ) ;
    public final void rulePredTbl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:382:2: ( ( ( rule__PredTbl__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:383:1: ( ( rule__PredTbl__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:383:1: ( ( rule__PredTbl__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:384:1: ( rule__PredTbl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredTblAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:385:1: ( rule__PredTbl__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:385:2: rule__PredTbl__Alternatives
            {
            pushFollow(FOLLOW_rule__PredTbl__Alternatives_in_rulePredTbl760);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:397:1: entryRulePrimaryExpr : rulePrimaryExpr EOF ;
    public final void entryRulePrimaryExpr() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:398:1: ( rulePrimaryExpr EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:399:1: rulePrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr787);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpr794); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:406:1: rulePrimaryExpr : ( ( rule__PrimaryExpr__Group__0 ) ) ;
    public final void rulePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:410:2: ( ( ( rule__PrimaryExpr__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:411:1: ( ( rule__PrimaryExpr__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:411:1: ( ( rule__PrimaryExpr__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:412:1: ( rule__PrimaryExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:413:1: ( rule__PrimaryExpr__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:413:2: rule__PrimaryExpr__Group__0
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__0_in_rulePrimaryExpr820);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:425:1: entryRuleFunctionsTbl : ruleFunctionsTbl EOF ;
    public final void entryRuleFunctionsTbl() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:426:1: ( ruleFunctionsTbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:427:1: ruleFunctionsTbl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionsTblRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionsTbl_in_entryRuleFunctionsTbl847);
            ruleFunctionsTbl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctionsTblRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionsTbl854); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:434:1: ruleFunctionsTbl : ( ( rule__FunctionsTbl__Alternatives ) ) ;
    public final void ruleFunctionsTbl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:438:2: ( ( ( rule__FunctionsTbl__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:439:1: ( ( rule__FunctionsTbl__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:439:1: ( ( rule__FunctionsTbl__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:440:1: ( rule__FunctionsTbl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctionsTblAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:441:1: ( rule__FunctionsTbl__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:441:2: rule__FunctionsTbl__Alternatives
            {
            pushFollow(FOLLOW_rule__FunctionsTbl__Alternatives_in_ruleFunctionsTbl880);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:453:1: entryRuleConstFuncTbl : ruleConstFuncTbl EOF ;
    public final void entryRuleConstFuncTbl() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:454:1: ( ruleConstFuncTbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:455:1: ruleConstFuncTbl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstFuncTblRule()); 
            }
            pushFollow(FOLLOW_ruleConstFuncTbl_in_entryRuleConstFuncTbl907);
            ruleConstFuncTbl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstFuncTblRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstFuncTbl914); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:462:1: ruleConstFuncTbl : ( ( rule__ConstFuncTbl__Alternatives ) ) ;
    public final void ruleConstFuncTbl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:466:2: ( ( ( rule__ConstFuncTbl__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:467:1: ( ( rule__ConstFuncTbl__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:467:1: ( ( rule__ConstFuncTbl__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:468:1: ( rule__ConstFuncTbl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstFuncTblAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:469:1: ( rule__ConstFuncTbl__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:469:2: rule__ConstFuncTbl__Alternatives
            {
            pushFollow(FOLLOW_rule__ConstFuncTbl__Alternatives_in_ruleConstFuncTbl940);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:481:1: entryRuleArray : ruleArray EOF ;
    public final void entryRuleArray() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:482:1: ( ruleArray EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:483:1: ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray967);
            ruleArray();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray974); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:490:1: ruleArray : ( ( rule__Array__Group__0 ) ) ;
    public final void ruleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:494:2: ( ( ( rule__Array__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:495:1: ( ( rule__Array__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:495:1: ( ( rule__Array__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:496:1: ( rule__Array__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:497:1: ( rule__Array__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:497:2: rule__Array__Group__0
            {
            pushFollow(FOLLOW_rule__Array__Group__0_in_ruleArray1000);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:509:1: entryRuleNchar : ruleNchar EOF ;
    public final void entryRuleNchar() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:510:1: ( ruleNchar EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:511:1: ruleNchar EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNcharRule()); 
            }
            pushFollow(FOLLOW_ruleNchar_in_entryRuleNchar1027);
            ruleNchar();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNcharRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNchar1034); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:518:1: ruleNchar : ( ( rule__Nchar__Alternatives ) ) ;
    public final void ruleNchar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:522:2: ( ( ( rule__Nchar__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:523:1: ( ( rule__Nchar__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:523:1: ( ( rule__Nchar__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:524:1: ( rule__Nchar__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNcharAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:525:1: ( rule__Nchar__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:525:2: rule__Nchar__Alternatives
            {
            pushFollow(FOLLOW_rule__Nchar__Alternatives_in_ruleNchar1060);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:537:1: entryRulePct_encoded : rulePct_encoded EOF ;
    public final void entryRulePct_encoded() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:538:1: ( rulePct_encoded EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:539:1: rulePct_encoded EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedRule()); 
            }
            pushFollow(FOLLOW_rulePct_encoded_in_entryRulePct_encoded1087);
            rulePct_encoded();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPct_encodedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePct_encoded1094); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:546:1: rulePct_encoded : ( ( rule__Pct_encoded__Group__0 ) ) ;
    public final void rulePct_encoded() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:550:2: ( ( ( rule__Pct_encoded__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:551:1: ( ( rule__Pct_encoded__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:551:1: ( ( rule__Pct_encoded__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:552:1: ( rule__Pct_encoded__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:553:1: ( rule__Pct_encoded__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:553:2: rule__Pct_encoded__Group__0
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__0_in_rulePct_encoded1120);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:565:1: entryRuleStrval : ruleStrval EOF ;
    public final void entryRuleStrval() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:566:1: ( ruleStrval EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:567:1: ruleStrval EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrvalRule()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_entryRuleStrval1147);
            ruleStrval();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrvalRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrval1154); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:574:1: ruleStrval : ( ( ( rule__Strval__Alternatives ) ) ( ( rule__Strval__Alternatives )* ) ) ;
    public final void ruleStrval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:578:2: ( ( ( ( rule__Strval__Alternatives ) ) ( ( rule__Strval__Alternatives )* ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:579:1: ( ( ( rule__Strval__Alternatives ) ) ( ( rule__Strval__Alternatives )* ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:579:1: ( ( ( rule__Strval__Alternatives ) ) ( ( rule__Strval__Alternatives )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:580:1: ( ( rule__Strval__Alternatives ) ) ( ( rule__Strval__Alternatives )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:580:1: ( ( rule__Strval__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:581:1: ( rule__Strval__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrvalAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:582:1: ( rule__Strval__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:582:2: rule__Strval__Alternatives
            {
            pushFollow(FOLLOW_rule__Strval__Alternatives_in_ruleStrval1182);
            rule__Strval__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrvalAccess().getAlternatives()); 
            }

            }

            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:585:1: ( ( rule__Strval__Alternatives )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:586:1: ( rule__Strval__Alternatives )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrvalAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:587:1: ( rule__Strval__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ALPHA && LA1_0<=RULE_DIGIT)||(LA1_0>=44 && LA1_0<=54)||LA1_0==60) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:587:2: rule__Strval__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Strval__Alternatives_in_ruleStrval1194);
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


    // $ANTLR start "entryRuleLogicalOpAliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:600:1: entryRuleLogicalOpAliases : ruleLogicalOpAliases EOF ;
    public final void entryRuleLogicalOpAliases() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:601:1: ( ruleLogicalOpAliases EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:602:1: ruleLogicalOpAliases EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOpAliasesRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOpAliases_in_entryRuleLogicalOpAliases1224);
            ruleLogicalOpAliases();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOpAliasesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOpAliases1231); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLogicalOpAliases"


    // $ANTLR start "ruleLogicalOpAliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:609:1: ruleLogicalOpAliases : ( ( rule__LogicalOpAliases__Alternatives ) ) ;
    public final void ruleLogicalOpAliases() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:613:2: ( ( ( rule__LogicalOpAliases__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:614:1: ( ( rule__LogicalOpAliases__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:614:1: ( ( rule__LogicalOpAliases__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:615:1: ( rule__LogicalOpAliases__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOpAliasesAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:616:1: ( rule__LogicalOpAliases__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:616:2: rule__LogicalOpAliases__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicalOpAliases__Alternatives_in_ruleLogicalOpAliases1257);
            rule__LogicalOpAliases__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOpAliasesAccess().getAlternatives()); 
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
    // $ANTLR end "ruleLogicalOpAliases"


    // $ANTLR start "rule__Model__Alternatives_1_0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:628:1: rule__Model__Alternatives_1_0 : ( ( ',' ) | ( '&' ) );
    public final void rule__Model__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:632:1: ( ( ',' ) | ( '&' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==8) ) {
                alt2=1;
            }
            else if ( (LA2_0==9) ) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:633:1: ( ',' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:633:1: ( ',' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:634:1: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getCommaKeyword_1_0_0()); 
                    }
                    match(input,8,FOLLOW_8_in_rule__Model__Alternatives_1_01294); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getCommaKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:641:6: ( '&' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:641:6: ( '&' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:642:1: '&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getAmpersandKeyword_1_0_1()); 
                    }
                    match(input,9,FOLLOW_9_in_rule__Model__Alternatives_1_01314); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:654:1: rule__Or__Alternatives_0 : ( ( ';' ) | ( '|' ) );
    public final void rule__Or__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:658:1: ( ( ';' ) | ( '|' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:659:1: ( ';' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:659:1: ( ';' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:660:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getSemicolonKeyword_0_0()); 
                    }
                    match(input,10,FOLLOW_10_in_rule__Or__Alternatives_01349); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAccess().getSemicolonKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:667:6: ( '|' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:667:6: ( '|' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:668:1: '|'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getVerticalLineKeyword_0_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Or__Alternatives_01369); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:680:1: rule__HoOperand__Alternatives_1 : ( ( ruleHigherOrderCall ) | ( ruleCallOperator ) | ( rulePredicate ) | ( ruleComparison ) | ( ( rule__HoOperand__Group_1_4__0 ) ) );
    public final void rule__HoOperand__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:684:1: ( ( ruleHigherOrderCall ) | ( ruleCallOperator ) | ( rulePredicate ) | ( ruleComparison ) | ( ( rule__HoOperand__Group_1_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 55:
            case 56:
            case 57:
                {
                alt4=1;
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 37:
            case 38:
            case 39:
                {
                alt4=2;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt4=3;
                }
                break;
            case RULE_ALPHA:
            case RULE_DIGIT:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 60:
                {
                alt4=4;
                }
                break;
            case 58:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:685:1: ( ruleHigherOrderCall )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:685:1: ( ruleHigherOrderCall )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:686:1: ruleHigherOrderCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getHigherOrderCallParserRuleCall_1_0()); 
                    }
                    pushFollow(FOLLOW_ruleHigherOrderCall_in_rule__HoOperand__Alternatives_11403);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:691:6: ( ruleCallOperator )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:691:6: ( ruleCallOperator )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:692:1: ruleCallOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getCallOperatorParserRuleCall_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleCallOperator_in_rule__HoOperand__Alternatives_11420);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:697:6: ( rulePredicate )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:697:6: ( rulePredicate )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:698:1: rulePredicate
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getPredicateParserRuleCall_1_2()); 
                    }
                    pushFollow(FOLLOW_rulePredicate_in_rule__HoOperand__Alternatives_11437);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:703:6: ( ruleComparison )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:703:6: ( ruleComparison )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:704:1: ruleComparison
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getComparisonParserRuleCall_1_3()); 
                    }
                    pushFollow(FOLLOW_ruleComparison_in_rule__HoOperand__Alternatives_11454);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:709:6: ( ( rule__HoOperand__Group_1_4__0 ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:709:6: ( ( rule__HoOperand__Group_1_4__0 ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:710:1: ( rule__HoOperand__Group_1_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getGroup_1_4()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:711:1: ( rule__HoOperand__Group_1_4__0 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:711:2: rule__HoOperand__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__HoOperand__Group_1_4__0_in_rule__HoOperand__Alternatives_11471);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:720:1: rule__HoOperand__Alternatives_1_4_2 : ( ( ruleAnd ) | ( ruleOr ) );
    public final void rule__HoOperand__Alternatives_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:724:1: ( ( ruleAnd ) | ( ruleOr ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==9) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=10 && LA5_0<=11)) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:725:1: ( ruleAnd )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:725:1: ( ruleAnd )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:726:1: ruleAnd
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getAndParserRuleCall_1_4_2_0()); 
                    }
                    pushFollow(FOLLOW_ruleAnd_in_rule__HoOperand__Alternatives_1_4_21504);
                    ruleAnd();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHoOperandAccess().getAndParserRuleCall_1_4_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:731:6: ( ruleOr )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:731:6: ( ruleOr )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:732:1: ruleOr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getOrParserRuleCall_1_4_2_1()); 
                    }
                    pushFollow(FOLLOW_ruleOr_in_rule__HoOperand__Alternatives_1_4_21521);
                    ruleOr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHoOperandAccess().getOrParserRuleCall_1_4_2_1()); 
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


    // $ANTLR start "rule__BinaryOpAliasesWithEqualsSign__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:742:1: rule__BinaryOpAliasesWithEqualsSign__Alternatives : ( ( '=ne=' ) | ( '=eq=' ) | ( '=lt=' ) | ( '=le=' ) | ( '=gt=' ) | ( '=ge=' ) | ( '=like=' ) );
    public final void rule__BinaryOpAliasesWithEqualsSign__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:746:1: ( ( '=ne=' ) | ( '=eq=' ) | ( '=lt=' ) | ( '=le=' ) | ( '=gt=' ) | ( '=ge=' ) | ( '=like=' ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt6=1;
                }
                break;
            case 13:
                {
                alt6=2;
                }
                break;
            case 14:
                {
                alt6=3;
                }
                break;
            case 15:
                {
                alt6=4;
                }
                break;
            case 16:
                {
                alt6=5;
                }
                break;
            case 17:
                {
                alt6=6;
                }
                break;
            case 18:
                {
                alt6=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:747:1: ( '=ne=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:747:1: ( '=ne=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:748:1: '=ne='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getNeKeyword_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1554); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getNeKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:755:6: ( '=eq=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:755:6: ( '=eq=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:756:1: '=eq='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getEqKeyword_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1574); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getEqKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:763:6: ( '=lt=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:763:6: ( '=lt=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:764:1: '=lt='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getLtKeyword_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1594); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getLtKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:771:6: ( '=le=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:771:6: ( '=le=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:772:1: '=le='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getLeKeyword_3()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1614); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getLeKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:779:6: ( '=gt=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:779:6: ( '=gt=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:780:1: '=gt='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getGtKeyword_4()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1634); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getGtKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:787:6: ( '=ge=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:787:6: ( '=ge=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:788:1: '=ge='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getGeKeyword_5()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1654); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getGeKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:795:6: ( '=like=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:795:6: ( '=like=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:796:1: '=like='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getLikeKeyword_6()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1674); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getLikeKeyword_6()); 
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
    // $ANTLR end "rule__BinaryOpAliasesWithEqualsSign__Alternatives"


    // $ANTLR start "rule__BinaryOpAliases__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:808:1: rule__BinaryOpAliases__Alternatives : ( ( 'ne' ) | ( 'eq' ) | ( 'lt' ) | ( 'le' ) | ( 'gt' ) | ( 'ge' ) | ( 'like' ) );
    public final void rule__BinaryOpAliases__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:812:1: ( ( 'ne' ) | ( 'eq' ) | ( 'lt' ) | ( 'le' ) | ( 'gt' ) | ( 'ge' ) | ( 'like' ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            case 24:
                {
                alt7=6;
                }
                break;
            case 25:
                {
                alt7=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:813:1: ( 'ne' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:813:1: ( 'ne' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:814:1: 'ne'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getNeKeyword_0()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__BinaryOpAliases__Alternatives1709); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getNeKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:821:6: ( 'eq' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:821:6: ( 'eq' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:822:1: 'eq'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getEqKeyword_1()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__BinaryOpAliases__Alternatives1729); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getEqKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:829:6: ( 'lt' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:829:6: ( 'lt' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:830:1: 'lt'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getLtKeyword_2()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__BinaryOpAliases__Alternatives1749); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getLtKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:837:6: ( 'le' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:837:6: ( 'le' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:838:1: 'le'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getLeKeyword_3()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__BinaryOpAliases__Alternatives1769); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getLeKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:845:6: ( 'gt' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:845:6: ( 'gt' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:846:1: 'gt'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getGtKeyword_4()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__BinaryOpAliases__Alternatives1789); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getGtKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:853:6: ( 'ge' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:853:6: ( 'ge' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:854:1: 'ge'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getGeKeyword_5()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__BinaryOpAliases__Alternatives1809); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getGeKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:861:6: ( 'like' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:861:6: ( 'like' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:862:1: 'like'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getLikeKeyword_6()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__BinaryOpAliases__Alternatives1829); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:874:1: rule__CompOps__Alternatives : ( ( '!=' ) | ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) );
    public final void rule__CompOps__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:878:1: ( ( '!=' ) | ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            case 29:
                {
                alt8=4;
                }
                break;
            case 30:
                {
                alt8=5;
                }
                break;
            case 31:
                {
                alt8=6;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:879:1: ( '!=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:879:1: ( '!=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:880:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getExclamationMarkEqualsSignKeyword_0()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__CompOps__Alternatives1864); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getExclamationMarkEqualsSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:887:6: ( '=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:887:6: ( '=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:888:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getEqualsSignKeyword_1()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__CompOps__Alternatives1884); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:895:6: ( '<' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:895:6: ( '<' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:896:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getLessThanSignKeyword_2()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__CompOps__Alternatives1904); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getLessThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:903:6: ( '<=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:903:6: ( '<=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:904:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__CompOps__Alternatives1924); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:911:6: ( '>' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:911:6: ( '>' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:912:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getGreaterThanSignKeyword_4()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__CompOps__Alternatives1944); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getGreaterThanSignKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:919:6: ( '>=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:919:6: ( '>=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:920:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__CompOps__Alternatives1964); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:932:1: rule__Comparison__Alternatives_2 : ( ( ruleBinaryOpAliasesWithEqualsSign ) | ( ruleCompOps ) );
    public final void rule__Comparison__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:936:1: ( ( ruleBinaryOpAliasesWithEqualsSign ) | ( ruleCompOps ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=12 && LA9_0<=18)) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=26 && LA9_0<=31)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:937:1: ( ruleBinaryOpAliasesWithEqualsSign )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:937:1: ( ruleBinaryOpAliasesWithEqualsSign )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:938:1: ruleBinaryOpAliasesWithEqualsSign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getBinaryOpAliasesWithEqualsSignParserRuleCall_2_0()); 
                    }
                    pushFollow(FOLLOW_ruleBinaryOpAliasesWithEqualsSign_in_rule__Comparison__Alternatives_21998);
                    ruleBinaryOpAliasesWithEqualsSign();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getBinaryOpAliasesWithEqualsSignParserRuleCall_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:943:6: ( ruleCompOps )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:943:6: ( ruleCompOps )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:944:1: ruleCompOps
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getCompOpsParserRuleCall_2_1()); 
                    }
                    pushFollow(FOLLOW_ruleCompOps_in_rule__Comparison__Alternatives_22015);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:954:1: rule__CallOperator__Alternatives_0 : ( ( ruleBinaryOpAliases ) | ( ruleFunctionsTbl ) );
    public final void rule__CallOperator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:958:1: ( ( ruleBinaryOpAliases ) | ( ruleFunctionsTbl ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=19 && LA10_0<=25)) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=37 && LA10_0<=39)) ) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:959:1: ( ruleBinaryOpAliases )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:959:1: ( ruleBinaryOpAliases )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:960:1: ruleBinaryOpAliases
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallOperatorAccess().getBinaryOpAliasesParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleBinaryOpAliases_in_rule__CallOperator__Alternatives_02047);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:965:6: ( ruleFunctionsTbl )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:965:6: ( ruleFunctionsTbl )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:966:1: ruleFunctionsTbl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallOperatorAccess().getFunctionsTblParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionsTbl_in_rule__CallOperator__Alternatives_02064);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:976:1: rule__PredTbl__Alternatives : ( ( 'select' ) | ( 'sort' ) | ( 'limit' ) | ( 'implementing' ) | ( 'composing' ) );
    public final void rule__PredTbl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:980:1: ( ( 'select' ) | ( 'sort' ) | ( 'limit' ) | ( 'implementing' ) | ( 'composing' ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt11=1;
                }
                break;
            case 33:
                {
                alt11=2;
                }
                break;
            case 34:
                {
                alt11=3;
                }
                break;
            case 35:
                {
                alt11=4;
                }
                break;
            case 36:
                {
                alt11=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:981:1: ( 'select' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:981:1: ( 'select' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:982:1: 'select'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getSelectKeyword_0()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__PredTbl__Alternatives2097); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredTblAccess().getSelectKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:989:6: ( 'sort' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:989:6: ( 'sort' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:990:1: 'sort'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getSortKeyword_1()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__PredTbl__Alternatives2117); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredTblAccess().getSortKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:997:6: ( 'limit' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:997:6: ( 'limit' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:998:1: 'limit'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getLimitKeyword_2()); 
                    }
                    match(input,34,FOLLOW_34_in_rule__PredTbl__Alternatives2137); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredTblAccess().getLimitKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1005:6: ( 'implementing' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1005:6: ( 'implementing' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1006:1: 'implementing'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getImplementingKeyword_3()); 
                    }
                    match(input,35,FOLLOW_35_in_rule__PredTbl__Alternatives2157); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredTblAccess().getImplementingKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1013:6: ( 'composing' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1013:6: ( 'composing' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1014:1: 'composing'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getComposingKeyword_4()); 
                    }
                    match(input,36,FOLLOW_36_in_rule__PredTbl__Alternatives2177); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1026:1: rule__PrimaryExpr__Alternatives_1 : ( ( ( rule__PrimaryExpr__Group_1_0__0 ) ) | ( ruleArray ) | ( ruleStrval ) );
    public final void rule__PrimaryExpr__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1030:1: ( ( ( rule__PrimaryExpr__Group_1_0__0 ) ) | ( ruleArray ) | ( ruleStrval ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt12=1;
                }
                break;
            case 58:
                {
                alt12=2;
                }
                break;
            case RULE_ALPHA:
            case RULE_DIGIT:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 60:
                {
                alt12=3;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1031:1: ( ( rule__PrimaryExpr__Group_1_0__0 ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1031:1: ( ( rule__PrimaryExpr__Group_1_0__0 ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1032:1: ( rule__PrimaryExpr__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getGroup_1_0()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1033:1: ( rule__PrimaryExpr__Group_1_0__0 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1033:2: rule__PrimaryExpr__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__0_in_rule__PrimaryExpr__Alternatives_12211);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1037:6: ( ruleArray )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1037:6: ( ruleArray )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1038:1: ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getArrayParserRuleCall_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleArray_in_rule__PrimaryExpr__Alternatives_12229);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1043:6: ( ruleStrval )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1043:6: ( ruleStrval )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1044:1: ruleStrval
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getStrvalParserRuleCall_1_2()); 
                    }
                    pushFollow(FOLLOW_ruleStrval_in_rule__PrimaryExpr__Alternatives_12246);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1054:1: rule__FunctionsTbl__Alternatives : ( ( 'isnull' ) | ( 'in' ) | ( 'out' ) );
    public final void rule__FunctionsTbl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1058:1: ( ( 'isnull' ) | ( 'in' ) | ( 'out' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt13=1;
                }
                break;
            case 38:
                {
                alt13=2;
                }
                break;
            case 39:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1059:1: ( 'isnull' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1059:1: ( 'isnull' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1060:1: 'isnull'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionsTblAccess().getIsnullKeyword_0()); 
                    }
                    match(input,37,FOLLOW_37_in_rule__FunctionsTbl__Alternatives2279); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionsTblAccess().getIsnullKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1067:6: ( 'in' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1067:6: ( 'in' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1068:1: 'in'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionsTblAccess().getInKeyword_1()); 
                    }
                    match(input,38,FOLLOW_38_in_rule__FunctionsTbl__Alternatives2299); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionsTblAccess().getInKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1075:6: ( 'out' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1075:6: ( 'out' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1076:1: 'out'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionsTblAccess().getOutKeyword_2()); 
                    }
                    match(input,39,FOLLOW_39_in_rule__FunctionsTbl__Alternatives2319); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1088:1: rule__ConstFuncTbl__Alternatives : ( ( 'true' ) | ( 'false' ) | ( 'empty' ) | ( 'null' ) );
    public final void rule__ConstFuncTbl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1092:1: ( ( 'true' ) | ( 'false' ) | ( 'empty' ) | ( 'null' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt14=1;
                }
                break;
            case 41:
                {
                alt14=2;
                }
                break;
            case 42:
                {
                alt14=3;
                }
                break;
            case 43:
                {
                alt14=4;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1093:1: ( 'true' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1093:1: ( 'true' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1094:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstFuncTblAccess().getTrueKeyword_0()); 
                    }
                    match(input,40,FOLLOW_40_in_rule__ConstFuncTbl__Alternatives2354); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstFuncTblAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1101:6: ( 'false' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1101:6: ( 'false' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1102:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstFuncTblAccess().getFalseKeyword_1()); 
                    }
                    match(input,41,FOLLOW_41_in_rule__ConstFuncTbl__Alternatives2374); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstFuncTblAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1109:6: ( 'empty' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1109:6: ( 'empty' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1110:1: 'empty'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstFuncTblAccess().getEmptyKeyword_2()); 
                    }
                    match(input,42,FOLLOW_42_in_rule__ConstFuncTbl__Alternatives2394); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstFuncTblAccess().getEmptyKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1117:6: ( 'null' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1117:6: ( 'null' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1118:1: 'null'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstFuncTblAccess().getNullKeyword_3()); 
                    }
                    match(input,43,FOLLOW_43_in_rule__ConstFuncTbl__Alternatives2414); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1130:1: rule__Nchar__Alternatives : ( ( RULE_ALPHA ) | ( RULE_DIGIT ) | ( '-' ) | ( '.' ) | ( '_' ) | ( '~' ) | ( '$' ) | ( ':' ) | ( '*' ) | ( '+' ) | ( '?' ) | ( '/' ) | ( '@' ) );
    public final void rule__Nchar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1134:1: ( ( RULE_ALPHA ) | ( RULE_DIGIT ) | ( '-' ) | ( '.' ) | ( '_' ) | ( '~' ) | ( '$' ) | ( ':' ) | ( '*' ) | ( '+' ) | ( '?' ) | ( '/' ) | ( '@' ) )
            int alt15=13;
            switch ( input.LA(1) ) {
            case RULE_ALPHA:
                {
                alt15=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt15=2;
                }
                break;
            case 44:
                {
                alt15=3;
                }
                break;
            case 45:
                {
                alt15=4;
                }
                break;
            case 46:
                {
                alt15=5;
                }
                break;
            case 47:
                {
                alt15=6;
                }
                break;
            case 48:
                {
                alt15=7;
                }
                break;
            case 49:
                {
                alt15=8;
                }
                break;
            case 50:
                {
                alt15=9;
                }
                break;
            case 51:
                {
                alt15=10;
                }
                break;
            case 52:
                {
                alt15=11;
                }
                break;
            case 53:
                {
                alt15=12;
                }
                break;
            case 54:
                {
                alt15=13;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1135:1: ( RULE_ALPHA )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1135:1: ( RULE_ALPHA )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1136:1: RULE_ALPHA
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getALPHATerminalRuleCall_0()); 
                    }
                    match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rule__Nchar__Alternatives2448); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getALPHATerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1141:6: ( RULE_DIGIT )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1141:6: ( RULE_DIGIT )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1142:1: RULE_DIGIT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getDIGITTerminalRuleCall_1()); 
                    }
                    match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rule__Nchar__Alternatives2465); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getDIGITTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1147:6: ( '-' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1147:6: ( '-' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1148:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getHyphenMinusKeyword_2()); 
                    }
                    match(input,44,FOLLOW_44_in_rule__Nchar__Alternatives2483); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getHyphenMinusKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1155:6: ( '.' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1155:6: ( '.' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1156:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getFullStopKeyword_3()); 
                    }
                    match(input,45,FOLLOW_45_in_rule__Nchar__Alternatives2503); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getFullStopKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1163:6: ( '_' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1163:6: ( '_' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1164:1: '_'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().get_Keyword_4()); 
                    }
                    match(input,46,FOLLOW_46_in_rule__Nchar__Alternatives2523); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().get_Keyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1171:6: ( '~' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1171:6: ( '~' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1172:1: '~'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getTildeKeyword_5()); 
                    }
                    match(input,47,FOLLOW_47_in_rule__Nchar__Alternatives2543); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getTildeKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1179:6: ( '$' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1179:6: ( '$' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1180:1: '$'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getDollarSignKeyword_6()); 
                    }
                    match(input,48,FOLLOW_48_in_rule__Nchar__Alternatives2563); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getDollarSignKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1187:6: ( ':' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1187:6: ( ':' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1188:1: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getColonKeyword_7()); 
                    }
                    match(input,49,FOLLOW_49_in_rule__Nchar__Alternatives2583); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getColonKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1195:6: ( '*' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1195:6: ( '*' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1196:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getAsteriskKeyword_8()); 
                    }
                    match(input,50,FOLLOW_50_in_rule__Nchar__Alternatives2603); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getAsteriskKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1203:6: ( '+' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1203:6: ( '+' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1204:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getPlusSignKeyword_9()); 
                    }
                    match(input,51,FOLLOW_51_in_rule__Nchar__Alternatives2623); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getPlusSignKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1211:6: ( '?' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1211:6: ( '?' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1212:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getQuestionMarkKeyword_10()); 
                    }
                    match(input,52,FOLLOW_52_in_rule__Nchar__Alternatives2643); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getQuestionMarkKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1219:6: ( '/' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1219:6: ( '/' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1220:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getSolidusKeyword_11()); 
                    }
                    match(input,53,FOLLOW_53_in_rule__Nchar__Alternatives2663); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getSolidusKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1227:6: ( '@' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1227:6: ( '@' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1228:1: '@'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getCommercialAtKeyword_12()); 
                    }
                    match(input,54,FOLLOW_54_in_rule__Nchar__Alternatives2683); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1240:1: rule__Strval__Alternatives : ( ( ruleNchar ) | ( rulePct_encoded ) );
    public final void rule__Strval__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1244:1: ( ( ruleNchar ) | ( rulePct_encoded ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ALPHA && LA16_0<=RULE_DIGIT)||(LA16_0>=44 && LA16_0<=54)) ) {
                alt16=1;
            }
            else if ( (LA16_0==60) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1245:1: ( ruleNchar )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1245:1: ( ruleNchar )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1246:1: ruleNchar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrvalAccess().getNcharParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleNchar_in_rule__Strval__Alternatives2717);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1251:6: ( rulePct_encoded )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1251:6: ( rulePct_encoded )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1252:1: rulePct_encoded
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrvalAccess().getPct_encodedParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulePct_encoded_in_rule__Strval__Alternatives2734);
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


    // $ANTLR start "rule__LogicalOpAliases__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1262:1: rule__LogicalOpAliases__Alternatives : ( ( 'or' ) | ( 'and' ) | ( 'not' ) );
    public final void rule__LogicalOpAliases__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1266:1: ( ( 'or' ) | ( 'and' ) | ( 'not' ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt17=1;
                }
                break;
            case 56:
                {
                alt17=2;
                }
                break;
            case 57:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1267:1: ( 'or' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1267:1: ( 'or' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1268:1: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalOpAliasesAccess().getOrKeyword_0()); 
                    }
                    match(input,55,FOLLOW_55_in_rule__LogicalOpAliases__Alternatives2767); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalOpAliasesAccess().getOrKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1275:6: ( 'and' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1275:6: ( 'and' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1276:1: 'and'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalOpAliasesAccess().getAndKeyword_1()); 
                    }
                    match(input,56,FOLLOW_56_in_rule__LogicalOpAliases__Alternatives2787); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalOpAliasesAccess().getAndKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1283:6: ( 'not' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1283:6: ( 'not' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1284:1: 'not'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalOpAliasesAccess().getNotKeyword_2()); 
                    }
                    match(input,57,FOLLOW_57_in_rule__LogicalOpAliases__Alternatives2807); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalOpAliasesAccess().getNotKeyword_2()); 
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
    // $ANTLR end "rule__LogicalOpAliases__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1298:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1302:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1303:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02839);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02842);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1310:1: rule__Model__Group__0__Impl : ( ( rule__Model__OperandsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1314:1: ( ( ( rule__Model__OperandsAssignment_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1315:1: ( ( rule__Model__OperandsAssignment_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1315:1: ( ( rule__Model__OperandsAssignment_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1316:1: ( rule__Model__OperandsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getOperandsAssignment_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1317:1: ( rule__Model__OperandsAssignment_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1317:2: rule__Model__OperandsAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__OperandsAssignment_0_in_rule__Model__Group__0__Impl2869);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1327:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1331:1: ( rule__Model__Group__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1332:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12899);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1338:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1342:1: ( ( ( rule__Model__Group_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1343:1: ( ( rule__Model__Group_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1343:1: ( ( rule__Model__Group_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1344:1: ( rule__Model__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1345:1: ( rule__Model__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=8 && LA18_0<=9)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1345:2: rule__Model__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl2926);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1359:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1363:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1364:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__02961);
            rule__Model__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__02964);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1371:1: rule__Model__Group_1__0__Impl : ( ( rule__Model__Alternatives_1_0 ) ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1375:1: ( ( ( rule__Model__Alternatives_1_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1376:1: ( ( rule__Model__Alternatives_1_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1376:1: ( ( rule__Model__Alternatives_1_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1377:1: ( rule__Model__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAlternatives_1_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1378:1: ( rule__Model__Alternatives_1_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1378:2: rule__Model__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Model__Alternatives_1_0_in_rule__Model__Group_1__0__Impl2991);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1388:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1392:1: ( rule__Model__Group_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1393:2: rule__Model__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__13021);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1399:1: rule__Model__Group_1__1__Impl : ( ruleHoOperand ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1403:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1404:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1404:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1405:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getHoOperandParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__Model__Group_1__1__Impl3048);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1420:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1424:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1425:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__03081);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__03084);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1432:1: rule__And__Group__0__Impl : ( '&' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1436:1: ( ( '&' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1437:1: ( '&' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1437:1: ( '&' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1438:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAmpersandKeyword_0()); 
            }
            match(input,9,FOLLOW_9_in_rule__And__Group__0__Impl3112); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1451:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1455:1: ( rule__And__Group__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1456:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__13143);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1462:1: rule__And__Group__1__Impl : ( ruleHoOperand ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1466:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1467:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1467:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1468:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getHoOperandParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__And__Group__1__Impl3170);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1483:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1487:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1488:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__03203);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__03206);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1495:1: rule__Or__Group__0__Impl : ( ( rule__Or__Alternatives_0 ) ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1499:1: ( ( ( rule__Or__Alternatives_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1500:1: ( ( rule__Or__Alternatives_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1500:1: ( ( rule__Or__Alternatives_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1501:1: ( rule__Or__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAlternatives_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1502:1: ( rule__Or__Alternatives_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1502:2: rule__Or__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Or__Alternatives_0_in_rule__Or__Group__0__Impl3233);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1512:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1516:1: ( rule__Or__Group__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1517:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__13263);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1523:1: rule__Or__Group__1__Impl : ( ruleHoOperand ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1527:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1528:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1528:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1529:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getHoOperandParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__Or__Group__1__Impl3290);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1544:1: rule__HoOperand__Group__0 : rule__HoOperand__Group__0__Impl rule__HoOperand__Group__1 ;
    public final void rule__HoOperand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1548:1: ( rule__HoOperand__Group__0__Impl rule__HoOperand__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1549:2: rule__HoOperand__Group__0__Impl rule__HoOperand__Group__1
            {
            pushFollow(FOLLOW_rule__HoOperand__Group__0__Impl_in_rule__HoOperand__Group__03323);
            rule__HoOperand__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group__1_in_rule__HoOperand__Group__03326);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1556:1: rule__HoOperand__Group__0__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__HoOperand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1560:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1561:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1561:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1562:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getWSPTerminalRuleCall_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1563:1: ( RULE_WSP )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WSP) ) {
                    int LA19_2 = input.LA(2);

                    if ( (synpred55_InternalRQL()) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1563:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__HoOperand__Group__0__Impl3354); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1573:1: rule__HoOperand__Group__1 : rule__HoOperand__Group__1__Impl rule__HoOperand__Group__2 ;
    public final void rule__HoOperand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1577:1: ( rule__HoOperand__Group__1__Impl rule__HoOperand__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1578:2: rule__HoOperand__Group__1__Impl rule__HoOperand__Group__2
            {
            pushFollow(FOLLOW_rule__HoOperand__Group__1__Impl_in_rule__HoOperand__Group__13385);
            rule__HoOperand__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group__2_in_rule__HoOperand__Group__13388);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1585:1: rule__HoOperand__Group__1__Impl : ( ( rule__HoOperand__Alternatives_1 )? ) ;
    public final void rule__HoOperand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1589:1: ( ( ( rule__HoOperand__Alternatives_1 )? ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1590:1: ( ( rule__HoOperand__Alternatives_1 )? )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1590:1: ( ( rule__HoOperand__Alternatives_1 )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1591:1: ( rule__HoOperand__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getAlternatives_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1592:1: ( rule__HoOperand__Alternatives_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_ALPHA && LA20_0<=RULE_DIGIT)||(LA20_0>=19 && LA20_0<=25)||(LA20_0>=32 && LA20_0<=39)||(LA20_0>=44 && LA20_0<=58)||LA20_0==60) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1592:2: rule__HoOperand__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__HoOperand__Alternatives_1_in_rule__HoOperand__Group__1__Impl3415);
                    rule__HoOperand__Alternatives_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1602:1: rule__HoOperand__Group__2 : rule__HoOperand__Group__2__Impl ;
    public final void rule__HoOperand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1606:1: ( rule__HoOperand__Group__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1607:2: rule__HoOperand__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__HoOperand__Group__2__Impl_in_rule__HoOperand__Group__23446);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1613:1: rule__HoOperand__Group__2__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__HoOperand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1617:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1618:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1618:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1619:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getWSPTerminalRuleCall_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1620:1: ( RULE_WSP )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WSP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1620:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__HoOperand__Group__2__Impl3474); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1636:1: rule__HoOperand__Group_1_4__0 : rule__HoOperand__Group_1_4__0__Impl rule__HoOperand__Group_1_4__1 ;
    public final void rule__HoOperand__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1640:1: ( rule__HoOperand__Group_1_4__0__Impl rule__HoOperand__Group_1_4__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1641:2: rule__HoOperand__Group_1_4__0__Impl rule__HoOperand__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__0__Impl_in_rule__HoOperand__Group_1_4__03511);
            rule__HoOperand__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__1_in_rule__HoOperand__Group_1_4__03514);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1648:1: rule__HoOperand__Group_1_4__0__Impl : ( '(' ) ;
    public final void rule__HoOperand__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1652:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1653:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1653:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1654:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getLeftParenthesisKeyword_1_4_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__HoOperand__Group_1_4__0__Impl3542); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1667:1: rule__HoOperand__Group_1_4__1 : rule__HoOperand__Group_1_4__1__Impl rule__HoOperand__Group_1_4__2 ;
    public final void rule__HoOperand__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1671:1: ( rule__HoOperand__Group_1_4__1__Impl rule__HoOperand__Group_1_4__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1672:2: rule__HoOperand__Group_1_4__1__Impl rule__HoOperand__Group_1_4__2
            {
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__1__Impl_in_rule__HoOperand__Group_1_4__13573);
            rule__HoOperand__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__2_in_rule__HoOperand__Group_1_4__13576);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1679:1: rule__HoOperand__Group_1_4__1__Impl : ( ruleHoOperand ) ;
    public final void rule__HoOperand__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1683:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1684:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1684:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1685:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getHoOperandParserRuleCall_1_4_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__HoOperand__Group_1_4__1__Impl3603);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1696:1: rule__HoOperand__Group_1_4__2 : rule__HoOperand__Group_1_4__2__Impl rule__HoOperand__Group_1_4__3 ;
    public final void rule__HoOperand__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1700:1: ( rule__HoOperand__Group_1_4__2__Impl rule__HoOperand__Group_1_4__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1701:2: rule__HoOperand__Group_1_4__2__Impl rule__HoOperand__Group_1_4__3
            {
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__2__Impl_in_rule__HoOperand__Group_1_4__23632);
            rule__HoOperand__Group_1_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__3_in_rule__HoOperand__Group_1_4__23635);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1708:1: rule__HoOperand__Group_1_4__2__Impl : ( ( rule__HoOperand__Alternatives_1_4_2 ) ) ;
    public final void rule__HoOperand__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1712:1: ( ( ( rule__HoOperand__Alternatives_1_4_2 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1713:1: ( ( rule__HoOperand__Alternatives_1_4_2 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1713:1: ( ( rule__HoOperand__Alternatives_1_4_2 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1714:1: ( rule__HoOperand__Alternatives_1_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getAlternatives_1_4_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1715:1: ( rule__HoOperand__Alternatives_1_4_2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1715:2: rule__HoOperand__Alternatives_1_4_2
            {
            pushFollow(FOLLOW_rule__HoOperand__Alternatives_1_4_2_in_rule__HoOperand__Group_1_4__2__Impl3662);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1725:1: rule__HoOperand__Group_1_4__3 : rule__HoOperand__Group_1_4__3__Impl ;
    public final void rule__HoOperand__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1729:1: ( rule__HoOperand__Group_1_4__3__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1730:2: rule__HoOperand__Group_1_4__3__Impl
            {
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__3__Impl_in_rule__HoOperand__Group_1_4__33692);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1736:1: rule__HoOperand__Group_1_4__3__Impl : ( ')' ) ;
    public final void rule__HoOperand__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1740:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1741:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1741:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1742:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getRightParenthesisKeyword_1_4_3()); 
            }
            match(input,59,FOLLOW_59_in_rule__HoOperand__Group_1_4__3__Impl3720); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1763:1: rule__HigherOrderCall__Group__0 : rule__HigherOrderCall__Group__0__Impl rule__HigherOrderCall__Group__1 ;
    public final void rule__HigherOrderCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1767:1: ( rule__HigherOrderCall__Group__0__Impl rule__HigherOrderCall__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1768:2: rule__HigherOrderCall__Group__0__Impl rule__HigherOrderCall__Group__1
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__0__Impl_in_rule__HigherOrderCall__Group__03759);
            rule__HigherOrderCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__1_in_rule__HigherOrderCall__Group__03762);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1775:1: rule__HigherOrderCall__Group__0__Impl : ( ruleLogicalOpAliases ) ;
    public final void rule__HigherOrderCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1779:1: ( ( ruleLogicalOpAliases ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1780:1: ( ruleLogicalOpAliases )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1780:1: ( ruleLogicalOpAliases )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1781:1: ruleLogicalOpAliases
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getLogicalOpAliasesParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLogicalOpAliases_in_rule__HigherOrderCall__Group__0__Impl3789);
            ruleLogicalOpAliases();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigherOrderCallAccess().getLogicalOpAliasesParserRuleCall_0()); 
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1792:1: rule__HigherOrderCall__Group__1 : rule__HigherOrderCall__Group__1__Impl rule__HigherOrderCall__Group__2 ;
    public final void rule__HigherOrderCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1796:1: ( rule__HigherOrderCall__Group__1__Impl rule__HigherOrderCall__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1797:2: rule__HigherOrderCall__Group__1__Impl rule__HigherOrderCall__Group__2
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__1__Impl_in_rule__HigherOrderCall__Group__13818);
            rule__HigherOrderCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__2_in_rule__HigherOrderCall__Group__13821);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1804:1: rule__HigherOrderCall__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__HigherOrderCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1808:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1809:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1809:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1810:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1811:1: ( RULE_WSP )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WSP) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1811:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__HigherOrderCall__Group__1__Impl3849); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1821:1: rule__HigherOrderCall__Group__2 : rule__HigherOrderCall__Group__2__Impl rule__HigherOrderCall__Group__3 ;
    public final void rule__HigherOrderCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1825:1: ( rule__HigherOrderCall__Group__2__Impl rule__HigherOrderCall__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1826:2: rule__HigherOrderCall__Group__2__Impl rule__HigherOrderCall__Group__3
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__2__Impl_in_rule__HigherOrderCall__Group__23880);
            rule__HigherOrderCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__3_in_rule__HigherOrderCall__Group__23883);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1833:1: rule__HigherOrderCall__Group__2__Impl : ( '(' ) ;
    public final void rule__HigherOrderCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1837:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1838:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1838:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1839:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,58,FOLLOW_58_in_rule__HigherOrderCall__Group__2__Impl3911); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1852:1: rule__HigherOrderCall__Group__3 : rule__HigherOrderCall__Group__3__Impl rule__HigherOrderCall__Group__4 ;
    public final void rule__HigherOrderCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1856:1: ( rule__HigherOrderCall__Group__3__Impl rule__HigherOrderCall__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1857:2: rule__HigherOrderCall__Group__3__Impl rule__HigherOrderCall__Group__4
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__3__Impl_in_rule__HigherOrderCall__Group__33942);
            rule__HigherOrderCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__4_in_rule__HigherOrderCall__Group__33945);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1864:1: rule__HigherOrderCall__Group__3__Impl : ( ( rule__HigherOrderCall__Group_3__0 ) ) ;
    public final void rule__HigherOrderCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1868:1: ( ( ( rule__HigherOrderCall__Group_3__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1869:1: ( ( rule__HigherOrderCall__Group_3__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1869:1: ( ( rule__HigherOrderCall__Group_3__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1870:1: ( rule__HigherOrderCall__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getGroup_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1871:1: ( rule__HigherOrderCall__Group_3__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1871:2: rule__HigherOrderCall__Group_3__0
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3__0_in_rule__HigherOrderCall__Group__3__Impl3972);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1881:1: rule__HigherOrderCall__Group__4 : rule__HigherOrderCall__Group__4__Impl ;
    public final void rule__HigherOrderCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1885:1: ( rule__HigherOrderCall__Group__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1886:2: rule__HigherOrderCall__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__4__Impl_in_rule__HigherOrderCall__Group__44002);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1892:1: rule__HigherOrderCall__Group__4__Impl : ( ')' ) ;
    public final void rule__HigherOrderCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1896:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1897:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1897:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1898:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,59,FOLLOW_59_in_rule__HigherOrderCall__Group__4__Impl4030); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1921:1: rule__HigherOrderCall__Group_3__0 : rule__HigherOrderCall__Group_3__0__Impl rule__HigherOrderCall__Group_3__1 ;
    public final void rule__HigherOrderCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1925:1: ( rule__HigherOrderCall__Group_3__0__Impl rule__HigherOrderCall__Group_3__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1926:2: rule__HigherOrderCall__Group_3__0__Impl rule__HigherOrderCall__Group_3__1
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3__0__Impl_in_rule__HigherOrderCall__Group_3__04071);
            rule__HigherOrderCall__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3__1_in_rule__HigherOrderCall__Group_3__04074);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1933:1: rule__HigherOrderCall__Group_3__0__Impl : ( ruleHoOperand ) ;
    public final void rule__HigherOrderCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1937:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1938:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1938:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1939:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getHoOperandParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__HigherOrderCall__Group_3__0__Impl4101);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1950:1: rule__HigherOrderCall__Group_3__1 : rule__HigherOrderCall__Group_3__1__Impl ;
    public final void rule__HigherOrderCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1954:1: ( rule__HigherOrderCall__Group_3__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1955:2: rule__HigherOrderCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3__1__Impl_in_rule__HigherOrderCall__Group_3__14130);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1961:1: rule__HigherOrderCall__Group_3__1__Impl : ( ( rule__HigherOrderCall__Group_3_1__0 )* ) ;
    public final void rule__HigherOrderCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1965:1: ( ( ( rule__HigherOrderCall__Group_3_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1966:1: ( ( rule__HigherOrderCall__Group_3_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1966:1: ( ( rule__HigherOrderCall__Group_3_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1967:1: ( rule__HigherOrderCall__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getGroup_3_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1968:1: ( rule__HigherOrderCall__Group_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==8) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1968:2: rule__HigherOrderCall__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__HigherOrderCall__Group_3_1__0_in_rule__HigherOrderCall__Group_3__1__Impl4157);
            	    rule__HigherOrderCall__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1982:1: rule__HigherOrderCall__Group_3_1__0 : rule__HigherOrderCall__Group_3_1__0__Impl rule__HigherOrderCall__Group_3_1__1 ;
    public final void rule__HigherOrderCall__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1986:1: ( rule__HigherOrderCall__Group_3_1__0__Impl rule__HigherOrderCall__Group_3_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1987:2: rule__HigherOrderCall__Group_3_1__0__Impl rule__HigherOrderCall__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3_1__0__Impl_in_rule__HigherOrderCall__Group_3_1__04192);
            rule__HigherOrderCall__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3_1__1_in_rule__HigherOrderCall__Group_3_1__04195);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1994:1: rule__HigherOrderCall__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__HigherOrderCall__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1998:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1999:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1999:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2000:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,8,FOLLOW_8_in_rule__HigherOrderCall__Group_3_1__0__Impl4223); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2013:1: rule__HigherOrderCall__Group_3_1__1 : rule__HigherOrderCall__Group_3_1__1__Impl ;
    public final void rule__HigherOrderCall__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2017:1: ( rule__HigherOrderCall__Group_3_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2018:2: rule__HigherOrderCall__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3_1__1__Impl_in_rule__HigherOrderCall__Group_3_1__14254);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2024:1: rule__HigherOrderCall__Group_3_1__1__Impl : ( ruleHoOperand ) ;
    public final void rule__HigherOrderCall__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2028:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2029:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2029:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2030:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getHoOperandParserRuleCall_3_1_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__HigherOrderCall__Group_3_1__1__Impl4281);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2045:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2049:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2050:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04314);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04317);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2057:1: rule__Comparison__Group__0__Impl : ( ruleStrval ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2061:1: ( ( ruleStrval ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2062:1: ( ruleStrval )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2062:1: ( ruleStrval )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2063:1: ruleStrval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getStrvalParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_rule__Comparison__Group__0__Impl4344);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2074:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2078:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2079:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14373);
            rule__Comparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__14376);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2086:1: rule__Comparison__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2090:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2091:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2091:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2092:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2093:1: ( RULE_WSP )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WSP) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2093:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Comparison__Group__1__Impl4404); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2103:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl rule__Comparison__Group__3 ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2107:1: ( rule__Comparison__Group__2__Impl rule__Comparison__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2108:2: rule__Comparison__Group__2__Impl rule__Comparison__Group__3
            {
            pushFollow(FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__24435);
            rule__Comparison__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__3_in_rule__Comparison__Group__24438);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2115:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__Alternatives_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2119:1: ( ( ( rule__Comparison__Alternatives_2 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2120:1: ( ( rule__Comparison__Alternatives_2 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2120:1: ( ( rule__Comparison__Alternatives_2 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2121:1: ( rule__Comparison__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2122:1: ( rule__Comparison__Alternatives_2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2122:2: rule__Comparison__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Comparison__Alternatives_2_in_rule__Comparison__Group__2__Impl4465);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2132:1: rule__Comparison__Group__3 : rule__Comparison__Group__3__Impl ;
    public final void rule__Comparison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2136:1: ( rule__Comparison__Group__3__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2137:2: rule__Comparison__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__3__Impl_in_rule__Comparison__Group__34495);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2143:1: rule__Comparison__Group__3__Impl : ( rulePrimaryExpr ) ;
    public final void rule__Comparison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2147:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2148:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2148:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2149:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getPrimaryExprParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__Comparison__Group__3__Impl4522);
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


    // $ANTLR start "rule__CallOperator__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2168:1: rule__CallOperator__Group__0 : rule__CallOperator__Group__0__Impl rule__CallOperator__Group__1 ;
    public final void rule__CallOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2172:1: ( rule__CallOperator__Group__0__Impl rule__CallOperator__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2173:2: rule__CallOperator__Group__0__Impl rule__CallOperator__Group__1
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__0__Impl_in_rule__CallOperator__Group__04559);
            rule__CallOperator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group__1_in_rule__CallOperator__Group__04562);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2180:1: rule__CallOperator__Group__0__Impl : ( ( rule__CallOperator__Alternatives_0 ) ) ;
    public final void rule__CallOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2184:1: ( ( ( rule__CallOperator__Alternatives_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2185:1: ( ( rule__CallOperator__Alternatives_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2185:1: ( ( rule__CallOperator__Alternatives_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2186:1: ( rule__CallOperator__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getAlternatives_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2187:1: ( rule__CallOperator__Alternatives_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2187:2: rule__CallOperator__Alternatives_0
            {
            pushFollow(FOLLOW_rule__CallOperator__Alternatives_0_in_rule__CallOperator__Group__0__Impl4589);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2197:1: rule__CallOperator__Group__1 : rule__CallOperator__Group__1__Impl rule__CallOperator__Group__2 ;
    public final void rule__CallOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2201:1: ( rule__CallOperator__Group__1__Impl rule__CallOperator__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2202:2: rule__CallOperator__Group__1__Impl rule__CallOperator__Group__2
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__1__Impl_in_rule__CallOperator__Group__14619);
            rule__CallOperator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group__2_in_rule__CallOperator__Group__14622);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2209:1: rule__CallOperator__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__CallOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2213:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2214:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2214:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2215:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2216:1: ( RULE_WSP )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WSP) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2216:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__CallOperator__Group__1__Impl4650); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2226:1: rule__CallOperator__Group__2 : rule__CallOperator__Group__2__Impl rule__CallOperator__Group__3 ;
    public final void rule__CallOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2230:1: ( rule__CallOperator__Group__2__Impl rule__CallOperator__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2231:2: rule__CallOperator__Group__2__Impl rule__CallOperator__Group__3
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__2__Impl_in_rule__CallOperator__Group__24681);
            rule__CallOperator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group__3_in_rule__CallOperator__Group__24684);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2238:1: rule__CallOperator__Group__2__Impl : ( '(' ) ;
    public final void rule__CallOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2242:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2243:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2243:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2244:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,58,FOLLOW_58_in_rule__CallOperator__Group__2__Impl4712); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2257:1: rule__CallOperator__Group__3 : rule__CallOperator__Group__3__Impl rule__CallOperator__Group__4 ;
    public final void rule__CallOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2261:1: ( rule__CallOperator__Group__3__Impl rule__CallOperator__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2262:2: rule__CallOperator__Group__3__Impl rule__CallOperator__Group__4
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__3__Impl_in_rule__CallOperator__Group__34743);
            rule__CallOperator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group__4_in_rule__CallOperator__Group__34746);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2269:1: rule__CallOperator__Group__3__Impl : ( ( rule__CallOperator__Group_3__0 )? ) ;
    public final void rule__CallOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2273:1: ( ( ( rule__CallOperator__Group_3__0 )? ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2274:1: ( ( rule__CallOperator__Group_3__0 )? )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2274:1: ( ( rule__CallOperator__Group_3__0 )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2275:1: ( rule__CallOperator__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getGroup_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2276:1: ( rule__CallOperator__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ALPHA && LA26_0<=RULE_WSP)||(LA26_0>=40 && LA26_0<=54)||LA26_0==58||LA26_0==60) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2276:2: rule__CallOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CallOperator__Group_3__0_in_rule__CallOperator__Group__3__Impl4773);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2286:1: rule__CallOperator__Group__4 : rule__CallOperator__Group__4__Impl ;
    public final void rule__CallOperator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2290:1: ( rule__CallOperator__Group__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2291:2: rule__CallOperator__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__4__Impl_in_rule__CallOperator__Group__44804);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2297:1: rule__CallOperator__Group__4__Impl : ( ')' ) ;
    public final void rule__CallOperator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2301:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2302:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2302:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2303:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,59,FOLLOW_59_in_rule__CallOperator__Group__4__Impl4832); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2326:1: rule__CallOperator__Group_3__0 : rule__CallOperator__Group_3__0__Impl rule__CallOperator__Group_3__1 ;
    public final void rule__CallOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2330:1: ( rule__CallOperator__Group_3__0__Impl rule__CallOperator__Group_3__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2331:2: rule__CallOperator__Group_3__0__Impl rule__CallOperator__Group_3__1
            {
            pushFollow(FOLLOW_rule__CallOperator__Group_3__0__Impl_in_rule__CallOperator__Group_3__04873);
            rule__CallOperator__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group_3__1_in_rule__CallOperator__Group_3__04876);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2338:1: rule__CallOperator__Group_3__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__CallOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2342:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2343:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2343:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2344:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getPrimaryExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__CallOperator__Group_3__0__Impl4903);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2355:1: rule__CallOperator__Group_3__1 : rule__CallOperator__Group_3__1__Impl ;
    public final void rule__CallOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2359:1: ( rule__CallOperator__Group_3__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2360:2: rule__CallOperator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CallOperator__Group_3__1__Impl_in_rule__CallOperator__Group_3__14932);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2366:1: rule__CallOperator__Group_3__1__Impl : ( ( rule__CallOperator__Group_3_1__0 )* ) ;
    public final void rule__CallOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2370:1: ( ( ( rule__CallOperator__Group_3_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2371:1: ( ( rule__CallOperator__Group_3_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2371:1: ( ( rule__CallOperator__Group_3_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2372:1: ( rule__CallOperator__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getGroup_3_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2373:1: ( rule__CallOperator__Group_3_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==8) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2373:2: rule__CallOperator__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CallOperator__Group_3_1__0_in_rule__CallOperator__Group_3__1__Impl4959);
            	    rule__CallOperator__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2387:1: rule__CallOperator__Group_3_1__0 : rule__CallOperator__Group_3_1__0__Impl rule__CallOperator__Group_3_1__1 ;
    public final void rule__CallOperator__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2391:1: ( rule__CallOperator__Group_3_1__0__Impl rule__CallOperator__Group_3_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2392:2: rule__CallOperator__Group_3_1__0__Impl rule__CallOperator__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__CallOperator__Group_3_1__0__Impl_in_rule__CallOperator__Group_3_1__04994);
            rule__CallOperator__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group_3_1__1_in_rule__CallOperator__Group_3_1__04997);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2399:1: rule__CallOperator__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__CallOperator__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2403:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2404:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2404:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2405:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,8,FOLLOW_8_in_rule__CallOperator__Group_3_1__0__Impl5025); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2418:1: rule__CallOperator__Group_3_1__1 : rule__CallOperator__Group_3_1__1__Impl ;
    public final void rule__CallOperator__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2422:1: ( rule__CallOperator__Group_3_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2423:2: rule__CallOperator__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CallOperator__Group_3_1__1__Impl_in_rule__CallOperator__Group_3_1__15056);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2429:1: rule__CallOperator__Group_3_1__1__Impl : ( rulePrimaryExpr ) ;
    public final void rule__CallOperator__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2433:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2434:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2434:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2435:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getPrimaryExprParserRuleCall_3_1_1()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__CallOperator__Group_3_1__1__Impl5083);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2450:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2454:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2455:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__05116);
            rule__Predicate__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__05119);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2462:1: rule__Predicate__Group__0__Impl : ( rulePredTbl ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2466:1: ( ( rulePredTbl ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2467:1: ( rulePredTbl )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2467:1: ( rulePredTbl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2468:1: rulePredTbl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPredTblParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePredTbl_in_rule__Predicate__Group__0__Impl5146);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2479:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl rule__Predicate__Group__2 ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2483:1: ( rule__Predicate__Group__1__Impl rule__Predicate__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2484:2: rule__Predicate__Group__1__Impl rule__Predicate__Group__2
            {
            pushFollow(FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__15175);
            rule__Predicate__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__2_in_rule__Predicate__Group__15178);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2491:1: rule__Predicate__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2495:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2496:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2496:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2497:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2498:1: ( RULE_WSP )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_WSP) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2498:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Predicate__Group__1__Impl5206); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2508:1: rule__Predicate__Group__2 : rule__Predicate__Group__2__Impl rule__Predicate__Group__3 ;
    public final void rule__Predicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2512:1: ( rule__Predicate__Group__2__Impl rule__Predicate__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2513:2: rule__Predicate__Group__2__Impl rule__Predicate__Group__3
            {
            pushFollow(FOLLOW_rule__Predicate__Group__2__Impl_in_rule__Predicate__Group__25237);
            rule__Predicate__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__3_in_rule__Predicate__Group__25240);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2520:1: rule__Predicate__Group__2__Impl : ( '(' ) ;
    public final void rule__Predicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2524:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2525:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2525:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2526:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,58,FOLLOW_58_in_rule__Predicate__Group__2__Impl5268); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2539:1: rule__Predicate__Group__3 : rule__Predicate__Group__3__Impl rule__Predicate__Group__4 ;
    public final void rule__Predicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2543:1: ( rule__Predicate__Group__3__Impl rule__Predicate__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2544:2: rule__Predicate__Group__3__Impl rule__Predicate__Group__4
            {
            pushFollow(FOLLOW_rule__Predicate__Group__3__Impl_in_rule__Predicate__Group__35299);
            rule__Predicate__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__4_in_rule__Predicate__Group__35302);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2551:1: rule__Predicate__Group__3__Impl : ( ( rule__Predicate__Group_3__0 )? ) ;
    public final void rule__Predicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2555:1: ( ( ( rule__Predicate__Group_3__0 )? ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2556:1: ( ( rule__Predicate__Group_3__0 )? )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2556:1: ( ( rule__Predicate__Group_3__0 )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2557:1: ( rule__Predicate__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getGroup_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2558:1: ( rule__Predicate__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ALPHA && LA29_0<=RULE_WSP)||(LA29_0>=40 && LA29_0<=54)||LA29_0==58||LA29_0==60) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2558:2: rule__Predicate__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Predicate__Group_3__0_in_rule__Predicate__Group__3__Impl5329);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2568:1: rule__Predicate__Group__4 : rule__Predicate__Group__4__Impl ;
    public final void rule__Predicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2572:1: ( rule__Predicate__Group__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2573:2: rule__Predicate__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group__4__Impl_in_rule__Predicate__Group__45360);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2579:1: rule__Predicate__Group__4__Impl : ( ')' ) ;
    public final void rule__Predicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2583:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2584:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2584:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2585:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,59,FOLLOW_59_in_rule__Predicate__Group__4__Impl5388); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2608:1: rule__Predicate__Group_3__0 : rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 ;
    public final void rule__Predicate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2612:1: ( rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2613:2: rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3__0__Impl_in_rule__Predicate__Group_3__05429);
            rule__Predicate__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group_3__1_in_rule__Predicate__Group_3__05432);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2620:1: rule__Predicate__Group_3__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__Predicate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2624:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2625:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2625:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2626:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPrimaryExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__Predicate__Group_3__0__Impl5459);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2637:1: rule__Predicate__Group_3__1 : rule__Predicate__Group_3__1__Impl ;
    public final void rule__Predicate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2641:1: ( rule__Predicate__Group_3__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2642:2: rule__Predicate__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3__1__Impl_in_rule__Predicate__Group_3__15488);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2648:1: rule__Predicate__Group_3__1__Impl : ( ( rule__Predicate__Group_3_1__0 )* ) ;
    public final void rule__Predicate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2652:1: ( ( ( rule__Predicate__Group_3_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2653:1: ( ( rule__Predicate__Group_3_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2653:1: ( ( rule__Predicate__Group_3_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2654:1: ( rule__Predicate__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getGroup_3_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2655:1: ( rule__Predicate__Group_3_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==8) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2655:2: rule__Predicate__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Predicate__Group_3_1__0_in_rule__Predicate__Group_3__1__Impl5515);
            	    rule__Predicate__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2669:1: rule__Predicate__Group_3_1__0 : rule__Predicate__Group_3_1__0__Impl rule__Predicate__Group_3_1__1 ;
    public final void rule__Predicate__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2673:1: ( rule__Predicate__Group_3_1__0__Impl rule__Predicate__Group_3_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2674:2: rule__Predicate__Group_3_1__0__Impl rule__Predicate__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3_1__0__Impl_in_rule__Predicate__Group_3_1__05550);
            rule__Predicate__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group_3_1__1_in_rule__Predicate__Group_3_1__05553);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2681:1: rule__Predicate__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Predicate__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2685:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2686:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2686:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2687:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,8,FOLLOW_8_in_rule__Predicate__Group_3_1__0__Impl5581); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2700:1: rule__Predicate__Group_3_1__1 : rule__Predicate__Group_3_1__1__Impl ;
    public final void rule__Predicate__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2704:1: ( rule__Predicate__Group_3_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2705:2: rule__Predicate__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3_1__1__Impl_in_rule__Predicate__Group_3_1__15612);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2711:1: rule__Predicate__Group_3_1__1__Impl : ( rulePrimaryExpr ) ;
    public final void rule__Predicate__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2715:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2716:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2716:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2717:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPrimaryExprParserRuleCall_3_1_1()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__Predicate__Group_3_1__1__Impl5639);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2732:1: rule__PrimaryExpr__Group__0 : rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 ;
    public final void rule__PrimaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2736:1: ( rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2737:2: rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__0__Impl_in_rule__PrimaryExpr__Group__05672);
            rule__PrimaryExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__1_in_rule__PrimaryExpr__Group__05675);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2744:1: rule__PrimaryExpr__Group__0__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__PrimaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2748:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2749:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2749:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2750:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2751:1: ( RULE_WSP )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_WSP) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2751:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group__0__Impl5703); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2761:1: rule__PrimaryExpr__Group__1 : rule__PrimaryExpr__Group__1__Impl rule__PrimaryExpr__Group__2 ;
    public final void rule__PrimaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2765:1: ( rule__PrimaryExpr__Group__1__Impl rule__PrimaryExpr__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2766:2: rule__PrimaryExpr__Group__1__Impl rule__PrimaryExpr__Group__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__1__Impl_in_rule__PrimaryExpr__Group__15734);
            rule__PrimaryExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__2_in_rule__PrimaryExpr__Group__15737);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2773:1: rule__PrimaryExpr__Group__1__Impl : ( ( rule__PrimaryExpr__Alternatives_1 ) ) ;
    public final void rule__PrimaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2777:1: ( ( ( rule__PrimaryExpr__Alternatives_1 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2778:1: ( ( rule__PrimaryExpr__Alternatives_1 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2778:1: ( ( rule__PrimaryExpr__Alternatives_1 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2779:1: ( rule__PrimaryExpr__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getAlternatives_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2780:1: ( rule__PrimaryExpr__Alternatives_1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2780:2: rule__PrimaryExpr__Alternatives_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Alternatives_1_in_rule__PrimaryExpr__Group__1__Impl5764);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2790:1: rule__PrimaryExpr__Group__2 : rule__PrimaryExpr__Group__2__Impl ;
    public final void rule__PrimaryExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2794:1: ( rule__PrimaryExpr__Group__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2795:2: rule__PrimaryExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__2__Impl_in_rule__PrimaryExpr__Group__25794);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2801:1: rule__PrimaryExpr__Group__2__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__PrimaryExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2805:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2806:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2806:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2807:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2808:1: ( RULE_WSP )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WSP) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred68_InternalRQL()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2808:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group__2__Impl5822); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2824:1: rule__PrimaryExpr__Group_1_0__0 : rule__PrimaryExpr__Group_1_0__0__Impl rule__PrimaryExpr__Group_1_0__1 ;
    public final void rule__PrimaryExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2828:1: ( rule__PrimaryExpr__Group_1_0__0__Impl rule__PrimaryExpr__Group_1_0__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2829:2: rule__PrimaryExpr__Group_1_0__0__Impl rule__PrimaryExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__0__Impl_in_rule__PrimaryExpr__Group_1_0__05859);
            rule__PrimaryExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__1_in_rule__PrimaryExpr__Group_1_0__05862);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2836:1: rule__PrimaryExpr__Group_1_0__0__Impl : ( ruleConstFuncTbl ) ;
    public final void rule__PrimaryExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2840:1: ( ( ruleConstFuncTbl ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2841:1: ( ruleConstFuncTbl )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2841:1: ( ruleConstFuncTbl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2842:1: ruleConstFuncTbl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getConstFuncTblParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleConstFuncTbl_in_rule__PrimaryExpr__Group_1_0__0__Impl5889);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2853:1: rule__PrimaryExpr__Group_1_0__1 : rule__PrimaryExpr__Group_1_0__1__Impl rule__PrimaryExpr__Group_1_0__2 ;
    public final void rule__PrimaryExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2857:1: ( rule__PrimaryExpr__Group_1_0__1__Impl rule__PrimaryExpr__Group_1_0__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2858:2: rule__PrimaryExpr__Group_1_0__1__Impl rule__PrimaryExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__1__Impl_in_rule__PrimaryExpr__Group_1_0__15918);
            rule__PrimaryExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__2_in_rule__PrimaryExpr__Group_1_0__15921);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2865:1: rule__PrimaryExpr__Group_1_0__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__PrimaryExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2869:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2870:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2870:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2871:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_1_0_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2872:1: ( RULE_WSP )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WSP) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2872:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group_1_0__1__Impl5949); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2882:1: rule__PrimaryExpr__Group_1_0__2 : rule__PrimaryExpr__Group_1_0__2__Impl rule__PrimaryExpr__Group_1_0__3 ;
    public final void rule__PrimaryExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2886:1: ( rule__PrimaryExpr__Group_1_0__2__Impl rule__PrimaryExpr__Group_1_0__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2887:2: rule__PrimaryExpr__Group_1_0__2__Impl rule__PrimaryExpr__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__2__Impl_in_rule__PrimaryExpr__Group_1_0__25980);
            rule__PrimaryExpr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__3_in_rule__PrimaryExpr__Group_1_0__25983);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2894:1: rule__PrimaryExpr__Group_1_0__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2898:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2899:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2899:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2900:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_1_0_2()); 
            }
            match(input,58,FOLLOW_58_in_rule__PrimaryExpr__Group_1_0__2__Impl6011); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2913:1: rule__PrimaryExpr__Group_1_0__3 : rule__PrimaryExpr__Group_1_0__3__Impl rule__PrimaryExpr__Group_1_0__4 ;
    public final void rule__PrimaryExpr__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2917:1: ( rule__PrimaryExpr__Group_1_0__3__Impl rule__PrimaryExpr__Group_1_0__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2918:2: rule__PrimaryExpr__Group_1_0__3__Impl rule__PrimaryExpr__Group_1_0__4
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__3__Impl_in_rule__PrimaryExpr__Group_1_0__36042);
            rule__PrimaryExpr__Group_1_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__4_in_rule__PrimaryExpr__Group_1_0__36045);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2925:1: rule__PrimaryExpr__Group_1_0__3__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__PrimaryExpr__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2929:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2930:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2930:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2931:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_1_0_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2932:1: ( RULE_WSP )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_WSP) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2932:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group_1_0__3__Impl6073); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2942:1: rule__PrimaryExpr__Group_1_0__4 : rule__PrimaryExpr__Group_1_0__4__Impl ;
    public final void rule__PrimaryExpr__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2946:1: ( rule__PrimaryExpr__Group_1_0__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2947:2: rule__PrimaryExpr__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__4__Impl_in_rule__PrimaryExpr__Group_1_0__46104);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2953:1: rule__PrimaryExpr__Group_1_0__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpr__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2957:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2958:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2958:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2959:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_1_0_4()); 
            }
            match(input,59,FOLLOW_59_in_rule__PrimaryExpr__Group_1_0__4__Impl6132); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2982:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2986:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2987:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__06173);
            rule__Array__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__06176);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2994:1: rule__Array__Group__0__Impl : ( '(' ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2998:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2999:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2999:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3000:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,58,FOLLOW_58_in_rule__Array__Group__0__Impl6204); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3013:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3017:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3018:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__16235);
            rule__Array__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__16238);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3025:1: rule__Array__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3029:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3030:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3030:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3031:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3032:1: ( RULE_WSP )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_WSP) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3032:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group__1__Impl6266); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3042:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3046:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3047:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__26297);
            rule__Array__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__26300);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3054:1: rule__Array__Group__2__Impl : ( ruleStrval ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3058:1: ( ( ruleStrval ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3059:1: ( ruleStrval )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3059:1: ( ruleStrval )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3060:1: ruleStrval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getStrvalParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_rule__Array__Group__2__Impl6327);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3071:1: rule__Array__Group__3 : rule__Array__Group__3__Impl rule__Array__Group__4 ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3075:1: ( rule__Array__Group__3__Impl rule__Array__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3076:2: rule__Array__Group__3__Impl rule__Array__Group__4
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__36356);
            rule__Array__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__4_in_rule__Array__Group__36359);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3083:1: rule__Array__Group__3__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3087:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3088:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3088:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3089:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3090:1: ( RULE_WSP )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_WSP) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3090:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group__3__Impl6387); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3100:1: rule__Array__Group__4 : rule__Array__Group__4__Impl rule__Array__Group__5 ;
    public final void rule__Array__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3104:1: ( rule__Array__Group__4__Impl rule__Array__Group__5 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3105:2: rule__Array__Group__4__Impl rule__Array__Group__5
            {
            pushFollow(FOLLOW_rule__Array__Group__4__Impl_in_rule__Array__Group__46418);
            rule__Array__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__5_in_rule__Array__Group__46421);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3112:1: rule__Array__Group__4__Impl : ( ( rule__Array__Group_4__0 )* ) ;
    public final void rule__Array__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3116:1: ( ( ( rule__Array__Group_4__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3117:1: ( ( rule__Array__Group_4__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3117:1: ( ( rule__Array__Group_4__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3118:1: ( rule__Array__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup_4()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3119:1: ( rule__Array__Group_4__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==8) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3119:2: rule__Array__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Array__Group_4__0_in_rule__Array__Group__4__Impl6448);
            	    rule__Array__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3129:1: rule__Array__Group__5 : rule__Array__Group__5__Impl ;
    public final void rule__Array__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3133:1: ( rule__Array__Group__5__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3134:2: rule__Array__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__5__Impl_in_rule__Array__Group__56479);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3140:1: rule__Array__Group__5__Impl : ( ')' ) ;
    public final void rule__Array__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3144:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3145:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3145:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3146:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,59,FOLLOW_59_in_rule__Array__Group__5__Impl6507); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3171:1: rule__Array__Group_4__0 : rule__Array__Group_4__0__Impl rule__Array__Group_4__1 ;
    public final void rule__Array__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3175:1: ( rule__Array__Group_4__0__Impl rule__Array__Group_4__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3176:2: rule__Array__Group_4__0__Impl rule__Array__Group_4__1
            {
            pushFollow(FOLLOW_rule__Array__Group_4__0__Impl_in_rule__Array__Group_4__06550);
            rule__Array__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group_4__1_in_rule__Array__Group_4__06553);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3183:1: rule__Array__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3187:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3188:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3188:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3189:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getCommaKeyword_4_0()); 
            }
            match(input,8,FOLLOW_8_in_rule__Array__Group_4__0__Impl6581); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3202:1: rule__Array__Group_4__1 : rule__Array__Group_4__1__Impl rule__Array__Group_4__2 ;
    public final void rule__Array__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3206:1: ( rule__Array__Group_4__1__Impl rule__Array__Group_4__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3207:2: rule__Array__Group_4__1__Impl rule__Array__Group_4__2
            {
            pushFollow(FOLLOW_rule__Array__Group_4__1__Impl_in_rule__Array__Group_4__16612);
            rule__Array__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group_4__2_in_rule__Array__Group_4__16615);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3214:1: rule__Array__Group_4__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3218:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3219:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3219:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3220:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3221:1: ( RULE_WSP )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_WSP) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3221:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group_4__1__Impl6643); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3231:1: rule__Array__Group_4__2 : rule__Array__Group_4__2__Impl rule__Array__Group_4__3 ;
    public final void rule__Array__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3235:1: ( rule__Array__Group_4__2__Impl rule__Array__Group_4__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3236:2: rule__Array__Group_4__2__Impl rule__Array__Group_4__3
            {
            pushFollow(FOLLOW_rule__Array__Group_4__2__Impl_in_rule__Array__Group_4__26674);
            rule__Array__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group_4__3_in_rule__Array__Group_4__26677);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3243:1: rule__Array__Group_4__2__Impl : ( ruleStrval ) ;
    public final void rule__Array__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3247:1: ( ( ruleStrval ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3248:1: ( ruleStrval )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3248:1: ( ruleStrval )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3249:1: ruleStrval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getStrvalParserRuleCall_4_2()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_rule__Array__Group_4__2__Impl6704);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3260:1: rule__Array__Group_4__3 : rule__Array__Group_4__3__Impl ;
    public final void rule__Array__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3264:1: ( rule__Array__Group_4__3__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3265:2: rule__Array__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_4__3__Impl_in_rule__Array__Group_4__36733);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3271:1: rule__Array__Group_4__3__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3275:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3276:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3276:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3277:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3278:1: ( RULE_WSP )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_WSP) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3278:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group_4__3__Impl6761); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3296:1: rule__Pct_encoded__Group__0 : rule__Pct_encoded__Group__0__Impl rule__Pct_encoded__Group__1 ;
    public final void rule__Pct_encoded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3300:1: ( rule__Pct_encoded__Group__0__Impl rule__Pct_encoded__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3301:2: rule__Pct_encoded__Group__0__Impl rule__Pct_encoded__Group__1
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__0__Impl_in_rule__Pct_encoded__Group__06800);
            rule__Pct_encoded__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pct_encoded__Group__1_in_rule__Pct_encoded__Group__06803);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3308:1: rule__Pct_encoded__Group__0__Impl : ( '%' ) ;
    public final void rule__Pct_encoded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3312:1: ( ( '%' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3313:1: ( '%' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3313:1: ( '%' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3314:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getPercentSignKeyword_0()); 
            }
            match(input,60,FOLLOW_60_in_rule__Pct_encoded__Group__0__Impl6831); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3327:1: rule__Pct_encoded__Group__1 : rule__Pct_encoded__Group__1__Impl rule__Pct_encoded__Group__2 ;
    public final void rule__Pct_encoded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3331:1: ( rule__Pct_encoded__Group__1__Impl rule__Pct_encoded__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3332:2: rule__Pct_encoded__Group__1__Impl rule__Pct_encoded__Group__2
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__1__Impl_in_rule__Pct_encoded__Group__16862);
            rule__Pct_encoded__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pct_encoded__Group__2_in_rule__Pct_encoded__Group__16865);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3339:1: rule__Pct_encoded__Group__1__Impl : ( RULE_XDIGIT ) ;
    public final void rule__Pct_encoded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3343:1: ( ( RULE_XDIGIT ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3344:1: ( RULE_XDIGIT )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3344:1: ( RULE_XDIGIT )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3345:1: RULE_XDIGIT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_1()); 
            }
            match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__1__Impl6892); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3356:1: rule__Pct_encoded__Group__2 : rule__Pct_encoded__Group__2__Impl ;
    public final void rule__Pct_encoded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3360:1: ( rule__Pct_encoded__Group__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3361:2: rule__Pct_encoded__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__2__Impl_in_rule__Pct_encoded__Group__26921);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3367:1: rule__Pct_encoded__Group__2__Impl : ( RULE_XDIGIT ) ;
    public final void rule__Pct_encoded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3371:1: ( ( RULE_XDIGIT ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3372:1: ( RULE_XDIGIT )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3372:1: ( RULE_XDIGIT )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3373:1: RULE_XDIGIT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_2()); 
            }
            match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__2__Impl6948); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3391:1: rule__Model__OperandsAssignment_0 : ( ruleHoOperand ) ;
    public final void rule__Model__OperandsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3395:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3396:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3396:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3397:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getOperandsHoOperandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__Model__OperandsAssignment_06988);
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

    // $ANTLR start synpred55_InternalRQL
    public final void synpred55_InternalRQL_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1563:3: ( RULE_WSP )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1563:3: RULE_WSP
        {
        match(input,RULE_WSP,FOLLOW_RULE_WSP_in_synpred55_InternalRQL3354); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalRQL

    // $ANTLR start synpred68_InternalRQL
    public final void synpred68_InternalRQL_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2808:3: ( RULE_WSP )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2808:3: RULE_WSP
        {
        match(input,RULE_WSP,FOLLOW_RULE_WSP_in_synpred68_InternalRQL5822); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalRQL

    // Delegated rules

    public final boolean synpred55_InternalRQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalRQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalRQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalRQL_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleBinaryOpAliasesWithEqualsSign_in_entryRuleBinaryOpAliasesWithEqualsSign367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOpAliasesWithEqualsSign374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryOpAliasesWithEqualsSign__Alternatives_in_ruleBinaryOpAliasesWithEqualsSign400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOpAliases_in_entryRuleBinaryOpAliases427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOpAliases434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryOpAliases__Alternatives_in_ruleBinaryOpAliases460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompOps_in_entryRuleCompOps487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompOps494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CompOps__Alternatives_in_ruleCompOps520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_entryRuleCallOperator607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallOperator614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__0_in_ruleCallOperator640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__0_in_rulePredicate700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredTbl_in_entryRulePredTbl727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredTbl734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PredTbl__Alternatives_in_rulePredTbl760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpr794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__0_in_rulePrimaryExpr820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionsTbl_in_entryRuleFunctionsTbl847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionsTbl854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionsTbl__Alternatives_in_ruleFunctionsTbl880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstFuncTbl_in_entryRuleConstFuncTbl907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstFuncTbl914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstFuncTbl__Alternatives_in_ruleConstFuncTbl940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0_in_ruleArray1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNchar_in_entryRuleNchar1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNchar1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Nchar__Alternatives_in_ruleNchar1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePct_encoded_in_entryRulePct_encoded1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePct_encoded1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__0_in_rulePct_encoded1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_entryRuleStrval1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrval1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Strval__Alternatives_in_ruleStrval1182 = new BitSet(new long[]{0x107FF00000000032L});
    public static final BitSet FOLLOW_rule__Strval__Alternatives_in_ruleStrval1194 = new BitSet(new long[]{0x107FF00000000032L});
    public static final BitSet FOLLOW_ruleLogicalOpAliases_in_entryRuleLogicalOpAliases1224 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOpAliases1231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOpAliases__Alternatives_in_ruleLogicalOpAliases1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Model__Alternatives_1_01294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Model__Alternatives_1_01314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Or__Alternatives_01349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Or__Alternatives_01369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHigherOrderCall_in_rule__HoOperand__Alternatives_11403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_rule__HoOperand__Alternatives_11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__HoOperand__Alternatives_11437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__HoOperand__Alternatives_11454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__0_in_rule__HoOperand__Alternatives_11471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__HoOperand__Alternatives_1_4_21504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__HoOperand__Alternatives_1_4_21521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BinaryOpAliasesWithEqualsSign__Alternatives1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__BinaryOpAliases__Alternatives1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__BinaryOpAliases__Alternatives1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__BinaryOpAliases__Alternatives1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__BinaryOpAliases__Alternatives1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__BinaryOpAliases__Alternatives1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BinaryOpAliases__Alternatives1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BinaryOpAliases__Alternatives1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompOps__Alternatives1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CompOps__Alternatives1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CompOps__Alternatives1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CompOps__Alternatives1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CompOps__Alternatives1944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CompOps__Alternatives1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOpAliasesWithEqualsSign_in_rule__Comparison__Alternatives_21998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompOps_in_rule__Comparison__Alternatives_22015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOpAliases_in_rule__CallOperator__Alternatives_02047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionsTbl_in_rule__CallOperator__Alternatives_02064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PredTbl__Alternatives2097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PredTbl__Alternatives2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PredTbl__Alternatives2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PredTbl__Alternatives2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__PredTbl__Alternatives2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__0_in_rule__PrimaryExpr__Alternatives_12211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__PrimaryExpr__Alternatives_12229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__PrimaryExpr__Alternatives_12246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FunctionsTbl__Alternatives2279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FunctionsTbl__Alternatives2299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FunctionsTbl__Alternatives2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ConstFuncTbl__Alternatives2354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ConstFuncTbl__Alternatives2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ConstFuncTbl__Alternatives2394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ConstFuncTbl__Alternatives2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rule__Nchar__Alternatives2448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rule__Nchar__Alternatives2465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Nchar__Alternatives2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Nchar__Alternatives2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Nchar__Alternatives2523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Nchar__Alternatives2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Nchar__Alternatives2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Nchar__Alternatives2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Nchar__Alternatives2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Nchar__Alternatives2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Nchar__Alternatives2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Nchar__Alternatives2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Nchar__Alternatives2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNchar_in_rule__Strval__Alternatives2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePct_encoded_in_rule__Strval__Alternatives2734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__LogicalOpAliases__Alternatives2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__LogicalOpAliases__Alternatives2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__LogicalOpAliases__Alternatives2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02839 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__OperandsAssignment_0_in_rule__Model__Group__0__Impl2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl2926 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__02961 = new BitSet(new long[]{0x17FFF0FF03F80070L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__02964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_1_0_in_rule__Model__Group_1__0__Impl2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__13021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__Model__Group_1__1__Impl3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__03081 = new BitSet(new long[]{0x17FFF0FF03F80070L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__03084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__And__Group__0__Impl3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__13143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__And__Group__1__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__03203 = new BitSet(new long[]{0x17FFF0FF03F80070L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__03206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Alternatives_0_in_rule__Or__Group__0__Impl3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__13263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__Or__Group__1__Impl3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__0__Impl_in_rule__HoOperand__Group__03323 = new BitSet(new long[]{0x17FFF0FF03F80070L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__1_in_rule__HoOperand__Group__03326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__HoOperand__Group__0__Impl3354 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__1__Impl_in_rule__HoOperand__Group__13385 = new BitSet(new long[]{0x17FFF0FF03F80070L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__2_in_rule__HoOperand__Group__13388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Alternatives_1_in_rule__HoOperand__Group__1__Impl3415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__2__Impl_in_rule__HoOperand__Group__23446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__HoOperand__Group__2__Impl3474 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__0__Impl_in_rule__HoOperand__Group_1_4__03511 = new BitSet(new long[]{0x17FFF0FF03F80070L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__1_in_rule__HoOperand__Group_1_4__03514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__HoOperand__Group_1_4__0__Impl3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__1__Impl_in_rule__HoOperand__Group_1_4__13573 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__2_in_rule__HoOperand__Group_1_4__13576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__HoOperand__Group_1_4__1__Impl3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__2__Impl_in_rule__HoOperand__Group_1_4__23632 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__3_in_rule__HoOperand__Group_1_4__23635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Alternatives_1_4_2_in_rule__HoOperand__Group_1_4__2__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__3__Impl_in_rule__HoOperand__Group_1_4__33692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__HoOperand__Group_1_4__3__Impl3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__0__Impl_in_rule__HigherOrderCall__Group__03759 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__1_in_rule__HigherOrderCall__Group__03762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOpAliases_in_rule__HigherOrderCall__Group__0__Impl3789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__1__Impl_in_rule__HigherOrderCall__Group__13818 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__2_in_rule__HigherOrderCall__Group__13821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__HigherOrderCall__Group__1__Impl3849 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__2__Impl_in_rule__HigherOrderCall__Group__23880 = new BitSet(new long[]{0x17FFF0FF03F80070L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__3_in_rule__HigherOrderCall__Group__23883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__HigherOrderCall__Group__2__Impl3911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__3__Impl_in_rule__HigherOrderCall__Group__33942 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__4_in_rule__HigherOrderCall__Group__33945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3__0_in_rule__HigherOrderCall__Group__3__Impl3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__4__Impl_in_rule__HigherOrderCall__Group__44002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__HigherOrderCall__Group__4__Impl4030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3__0__Impl_in_rule__HigherOrderCall__Group_3__04071 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3__1_in_rule__HigherOrderCall__Group_3__04074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__HigherOrderCall__Group_3__0__Impl4101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3__1__Impl_in_rule__HigherOrderCall__Group_3__14130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3_1__0_in_rule__HigherOrderCall__Group_3__1__Impl4157 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3_1__0__Impl_in_rule__HigherOrderCall__Group_3_1__04192 = new BitSet(new long[]{0x17FFF0FF03F80070L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3_1__1_in_rule__HigherOrderCall__Group_3_1__04195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__HigherOrderCall__Group_3_1__0__Impl4223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3_1__1__Impl_in_rule__HigherOrderCall__Group_3_1__14254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__HigherOrderCall__Group_3_1__1__Impl4281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04314 = new BitSet(new long[]{0x00000000FC07F040L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__Comparison__Group__0__Impl4344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14373 = new BitSet(new long[]{0x00000000FC07F040L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__14376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Comparison__Group__1__Impl4404 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__24435 = new BitSet(new long[]{0x147FFF0000000070L});
    public static final BitSet FOLLOW_rule__Comparison__Group__3_in_rule__Comparison__Group__24438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Alternatives_2_in_rule__Comparison__Group__2__Impl4465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__3__Impl_in_rule__Comparison__Group__34495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__Comparison__Group__3__Impl4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__0__Impl_in_rule__CallOperator__Group__04559 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__1_in_rule__CallOperator__Group__04562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Alternatives_0_in_rule__CallOperator__Group__0__Impl4589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__1__Impl_in_rule__CallOperator__Group__14619 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__2_in_rule__CallOperator__Group__14622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__CallOperator__Group__1__Impl4650 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__2__Impl_in_rule__CallOperator__Group__24681 = new BitSet(new long[]{0x1C7FFF0000000070L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__3_in_rule__CallOperator__Group__24684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__CallOperator__Group__2__Impl4712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__3__Impl_in_rule__CallOperator__Group__34743 = new BitSet(new long[]{0x1C7FFF0000000070L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__4_in_rule__CallOperator__Group__34746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3__0_in_rule__CallOperator__Group__3__Impl4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__4__Impl_in_rule__CallOperator__Group__44804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__CallOperator__Group__4__Impl4832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3__0__Impl_in_rule__CallOperator__Group_3__04873 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3__1_in_rule__CallOperator__Group_3__04876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__CallOperator__Group_3__0__Impl4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3__1__Impl_in_rule__CallOperator__Group_3__14932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3_1__0_in_rule__CallOperator__Group_3__1__Impl4959 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3_1__0__Impl_in_rule__CallOperator__Group_3_1__04994 = new BitSet(new long[]{0x147FFF0000000070L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3_1__1_in_rule__CallOperator__Group_3_1__04997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__CallOperator__Group_3_1__0__Impl5025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3_1__1__Impl_in_rule__CallOperator__Group_3_1__15056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__CallOperator__Group_3_1__1__Impl5083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__05116 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__05119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredTbl_in_rule__Predicate__Group__0__Impl5146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__15175 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_rule__Predicate__Group__2_in_rule__Predicate__Group__15178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Predicate__Group__1__Impl5206 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Predicate__Group__2__Impl_in_rule__Predicate__Group__25237 = new BitSet(new long[]{0x1C7FFF0000000070L});
    public static final BitSet FOLLOW_rule__Predicate__Group__3_in_rule__Predicate__Group__25240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Predicate__Group__2__Impl5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__3__Impl_in_rule__Predicate__Group__35299 = new BitSet(new long[]{0x1C7FFF0000000070L});
    public static final BitSet FOLLOW_rule__Predicate__Group__4_in_rule__Predicate__Group__35302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__0_in_rule__Predicate__Group__3__Impl5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__4__Impl_in_rule__Predicate__Group__45360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Predicate__Group__4__Impl5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__0__Impl_in_rule__Predicate__Group_3__05429 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__1_in_rule__Predicate__Group_3__05432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__Predicate__Group_3__0__Impl5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__1__Impl_in_rule__Predicate__Group_3__15488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__0_in_rule__Predicate__Group_3__1__Impl5515 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__0__Impl_in_rule__Predicate__Group_3_1__05550 = new BitSet(new long[]{0x147FFF0000000070L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__1_in_rule__Predicate__Group_3_1__05553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Predicate__Group_3_1__0__Impl5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__1__Impl_in_rule__Predicate__Group_3_1__15612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__Predicate__Group_3_1__1__Impl5639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__0__Impl_in_rule__PrimaryExpr__Group__05672 = new BitSet(new long[]{0x147FFF0000000070L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__1_in_rule__PrimaryExpr__Group__05675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group__0__Impl5703 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__1__Impl_in_rule__PrimaryExpr__Group__15734 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__2_in_rule__PrimaryExpr__Group__15737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Alternatives_1_in_rule__PrimaryExpr__Group__1__Impl5764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__2__Impl_in_rule__PrimaryExpr__Group__25794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group__2__Impl5822 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__0__Impl_in_rule__PrimaryExpr__Group_1_0__05859 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__1_in_rule__PrimaryExpr__Group_1_0__05862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstFuncTbl_in_rule__PrimaryExpr__Group_1_0__0__Impl5889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__1__Impl_in_rule__PrimaryExpr__Group_1_0__15918 = new BitSet(new long[]{0x0400000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__2_in_rule__PrimaryExpr__Group_1_0__15921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group_1_0__1__Impl5949 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__2__Impl_in_rule__PrimaryExpr__Group_1_0__25980 = new BitSet(new long[]{0x0800000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__3_in_rule__PrimaryExpr__Group_1_0__25983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__PrimaryExpr__Group_1_0__2__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__3__Impl_in_rule__PrimaryExpr__Group_1_0__36042 = new BitSet(new long[]{0x0800000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__4_in_rule__PrimaryExpr__Group_1_0__36045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group_1_0__3__Impl6073 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__4__Impl_in_rule__PrimaryExpr__Group_1_0__46104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__PrimaryExpr__Group_1_0__4__Impl6132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__06173 = new BitSet(new long[]{0x107FF00000000070L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__06176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__Array__Group__0__Impl6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__16235 = new BitSet(new long[]{0x107FF00000000070L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__16238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group__1__Impl6266 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__26297 = new BitSet(new long[]{0x0800000000000140L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__26300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__Array__Group__2__Impl6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__36356 = new BitSet(new long[]{0x0800000000000140L});
    public static final BitSet FOLLOW_rule__Array__Group__4_in_rule__Array__Group__36359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group__3__Impl6387 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Array__Group__4__Impl_in_rule__Array__Group__46418 = new BitSet(new long[]{0x0800000000000140L});
    public static final BitSet FOLLOW_rule__Array__Group__5_in_rule__Array__Group__46421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__0_in_rule__Array__Group__4__Impl6448 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Array__Group__5__Impl_in_rule__Array__Group__56479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__Array__Group__5__Impl6507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__0__Impl_in_rule__Array__Group_4__06550 = new BitSet(new long[]{0x107FF00000000070L});
    public static final BitSet FOLLOW_rule__Array__Group_4__1_in_rule__Array__Group_4__06553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Array__Group_4__0__Impl6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__1__Impl_in_rule__Array__Group_4__16612 = new BitSet(new long[]{0x107FF00000000070L});
    public static final BitSet FOLLOW_rule__Array__Group_4__2_in_rule__Array__Group_4__16615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group_4__1__Impl6643 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Array__Group_4__2__Impl_in_rule__Array__Group_4__26674 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Array__Group_4__3_in_rule__Array__Group_4__26677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__Array__Group_4__2__Impl6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__3__Impl_in_rule__Array__Group_4__36733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group_4__3__Impl6761 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__0__Impl_in_rule__Pct_encoded__Group__06800 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__1_in_rule__Pct_encoded__Group__06803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Pct_encoded__Group__0__Impl6831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__1__Impl_in_rule__Pct_encoded__Group__16862 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__2_in_rule__Pct_encoded__Group__16865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__1__Impl6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__2__Impl_in_rule__Pct_encoded__Group__26921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__2__Impl6948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__Model__OperandsAssignment_06988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_synpred55_InternalRQL3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_synpred68_InternalRQL5822 = new BitSet(new long[]{0x0000000000000002L});

}