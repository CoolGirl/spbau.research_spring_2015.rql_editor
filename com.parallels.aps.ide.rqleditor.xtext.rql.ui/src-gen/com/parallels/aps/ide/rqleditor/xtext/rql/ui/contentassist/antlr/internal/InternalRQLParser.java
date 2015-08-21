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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ALPHA", "RULE_DIGIT", "RULE_WSP", "RULE_XDIGIT", "','", "'&'", "';'", "'|'", "'ne'", "'eq'", "'lt'", "'le'", "'gt'", "'ge'", "'like'", "'!='", "'='", "'<'", "'<='", "'>'", "'>='", "'=ne='", "'=eq='", "'=lt='", "'=le='", "'=gt='", "'=ge='", "'=like='", "'select'", "'sort'", "'limit'", "'implementing'", "'composing'", "'isnull'", "'in'", "'out'", "'true'", "'false'", "'empty'", "'null'", "'-'", "'.'", "'_'", "'~'", "'$'", "':'", "'*'", "'+'", "'?'", "'/'", "'@'", "'or'", "'and'", "'not'", "'\\r'", "'\\n'", "'('", "')'", "'%'"
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
    public static final int T__61=61;
    public static final int RULE_DIGIT=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
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

                if ( ((LA1_0>=RULE_ALPHA && LA1_0<=RULE_DIGIT)||(LA1_0>=44 && LA1_0<=54)||LA1_0==62) ) {
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


    // $ANTLR start "entryRuleLogicalOpAliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:572:1: entryRuleLogicalOpAliases : ruleLogicalOpAliases EOF ;
    public final void entryRuleLogicalOpAliases() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:573:1: ( ruleLogicalOpAliases EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:574:1: ruleLogicalOpAliases EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOpAliasesRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOpAliases_in_entryRuleLogicalOpAliases1164);
            ruleLogicalOpAliases();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalOpAliasesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOpAliases1171); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:581:1: ruleLogicalOpAliases : ( ( rule__LogicalOpAliases__Alternatives ) ) ;
    public final void ruleLogicalOpAliases() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:585:2: ( ( ( rule__LogicalOpAliases__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:586:1: ( ( rule__LogicalOpAliases__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:586:1: ( ( rule__LogicalOpAliases__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:587:1: ( rule__LogicalOpAliases__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalOpAliasesAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:588:1: ( rule__LogicalOpAliases__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:588:2: rule__LogicalOpAliases__Alternatives
            {
            pushFollow(FOLLOW_rule__LogicalOpAliases__Alternatives_in_ruleLogicalOpAliases1197);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:600:1: rule__Model__Alternatives_1_0 : ( ( ',' ) | ( '&' ) );
    public final void rule__Model__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:604:1: ( ( ',' ) | ( '&' ) )
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:605:1: ( ',' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:605:1: ( ',' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:606:1: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getCommaKeyword_1_0_0()); 
                    }
                    match(input,8,FOLLOW_8_in_rule__Model__Alternatives_1_01234); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getCommaKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:613:6: ( '&' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:613:6: ( '&' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:614:1: '&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getAmpersandKeyword_1_0_1()); 
                    }
                    match(input,9,FOLLOW_9_in_rule__Model__Alternatives_1_01254); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:626:1: rule__Or__Alternatives_0 : ( ( ';' ) | ( '|' ) );
    public final void rule__Or__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:630:1: ( ( ';' ) | ( '|' ) )
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:631:1: ( ';' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:631:1: ( ';' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:632:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getSemicolonKeyword_0_0()); 
                    }
                    match(input,10,FOLLOW_10_in_rule__Or__Alternatives_01289); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAccess().getSemicolonKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:639:6: ( '|' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:639:6: ( '|' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:640:1: '|'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getVerticalLineKeyword_0_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Or__Alternatives_01309); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:652:1: rule__HoOperand__Alternatives_1 : ( ( ruleHigherOrderCall ) | ( ruleCallOperator ) | ( rulePredicate ) | ( ruleComparison ) | ( ( rule__HoOperand__Group_1_4__0 ) ) );
    public final void rule__HoOperand__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:656:1: ( ( ruleHigherOrderCall ) | ( ruleCallOperator ) | ( rulePredicate ) | ( ruleComparison ) | ( ( rule__HoOperand__Group_1_4__0 ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 55:
            case 56:
            case 57:
                {
                alt4=1;
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
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
            case 62:
                {
                alt4=4;
                }
                break;
            case 60:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:657:1: ( ruleHigherOrderCall )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:657:1: ( ruleHigherOrderCall )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:658:1: ruleHigherOrderCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getHigherOrderCallParserRuleCall_1_0()); 
                    }
                    pushFollow(FOLLOW_ruleHigherOrderCall_in_rule__HoOperand__Alternatives_11343);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:663:6: ( ruleCallOperator )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:663:6: ( ruleCallOperator )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:664:1: ruleCallOperator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getCallOperatorParserRuleCall_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleCallOperator_in_rule__HoOperand__Alternatives_11360);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:669:6: ( rulePredicate )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:669:6: ( rulePredicate )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:670:1: rulePredicate
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getPredicateParserRuleCall_1_2()); 
                    }
                    pushFollow(FOLLOW_rulePredicate_in_rule__HoOperand__Alternatives_11377);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:675:6: ( ruleComparison )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:675:6: ( ruleComparison )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:676:1: ruleComparison
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getComparisonParserRuleCall_1_3()); 
                    }
                    pushFollow(FOLLOW_ruleComparison_in_rule__HoOperand__Alternatives_11394);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:681:6: ( ( rule__HoOperand__Group_1_4__0 ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:681:6: ( ( rule__HoOperand__Group_1_4__0 ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:682:1: ( rule__HoOperand__Group_1_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getGroup_1_4()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:683:1: ( rule__HoOperand__Group_1_4__0 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:683:2: rule__HoOperand__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__HoOperand__Group_1_4__0_in_rule__HoOperand__Alternatives_11411);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:692:1: rule__HoOperand__Alternatives_1_4_2 : ( ( ruleAnd ) | ( ruleOr ) );
    public final void rule__HoOperand__Alternatives_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:696:1: ( ( ruleAnd ) | ( ruleOr ) )
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:697:1: ( ruleAnd )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:697:1: ( ruleAnd )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:698:1: ruleAnd
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getAndParserRuleCall_1_4_2_0()); 
                    }
                    pushFollow(FOLLOW_ruleAnd_in_rule__HoOperand__Alternatives_1_4_21444);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:703:6: ( ruleOr )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:703:6: ( ruleOr )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:704:1: ruleOr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHoOperandAccess().getOrParserRuleCall_1_4_2_1()); 
                    }
                    pushFollow(FOLLOW_ruleOr_in_rule__HoOperand__Alternatives_1_4_21461);
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


    // $ANTLR start "rule__BinaryOpAliases__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:714:1: rule__BinaryOpAliases__Alternatives : ( ( 'ne' ) | ( 'eq' ) | ( 'lt' ) | ( 'le' ) | ( 'gt' ) | ( 'ge' ) | ( 'like' ) );
    public final void rule__BinaryOpAliases__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:718:1: ( ( 'ne' ) | ( 'eq' ) | ( 'lt' ) | ( 'le' ) | ( 'gt' ) | ( 'ge' ) | ( 'like' ) )
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:719:1: ( 'ne' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:719:1: ( 'ne' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:720:1: 'ne'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getNeKeyword_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__BinaryOpAliases__Alternatives1494); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getNeKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:727:6: ( 'eq' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:727:6: ( 'eq' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:728:1: 'eq'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getEqKeyword_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__BinaryOpAliases__Alternatives1514); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getEqKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:735:6: ( 'lt' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:735:6: ( 'lt' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:736:1: 'lt'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getLtKeyword_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__BinaryOpAliases__Alternatives1534); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getLtKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:743:6: ( 'le' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:743:6: ( 'le' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:744:1: 'le'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getLeKeyword_3()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__BinaryOpAliases__Alternatives1554); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getLeKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:751:6: ( 'gt' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:751:6: ( 'gt' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:752:1: 'gt'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getGtKeyword_4()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__BinaryOpAliases__Alternatives1574); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getGtKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:759:6: ( 'ge' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:759:6: ( 'ge' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:760:1: 'ge'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getGeKeyword_5()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__BinaryOpAliases__Alternatives1594); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinaryOpAliasesAccess().getGeKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:767:6: ( 'like' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:767:6: ( 'like' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:768:1: 'like'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinaryOpAliasesAccess().getLikeKeyword_6()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__BinaryOpAliases__Alternatives1614); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:780:1: rule__CompOps__Alternatives : ( ( '!=' ) | ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '=ne=' ) | ( '=eq=' ) | ( '=lt=' ) | ( '=le=' ) | ( '=gt=' ) | ( '=ge=' ) | ( '=like=' ) );
    public final void rule__CompOps__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:784:1: ( ( '!=' ) | ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) | ( '=ne=' ) | ( '=eq=' ) | ( '=lt=' ) | ( '=le=' ) | ( '=gt=' ) | ( '=ge=' ) | ( '=like=' ) )
            int alt7=13;
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
            case 26:
                {
                alt7=8;
                }
                break;
            case 27:
                {
                alt7=9;
                }
                break;
            case 28:
                {
                alt7=10;
                }
                break;
            case 29:
                {
                alt7=11;
                }
                break;
            case 30:
                {
                alt7=12;
                }
                break;
            case 31:
                {
                alt7=13;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:785:1: ( '!=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:785:1: ( '!=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:786:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getExclamationMarkEqualsSignKeyword_0()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__CompOps__Alternatives1649); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getExclamationMarkEqualsSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:793:6: ( '=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:793:6: ( '=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:794:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getEqualsSignKeyword_1()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__CompOps__Alternatives1669); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:801:6: ( '<' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:801:6: ( '<' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:802:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getLessThanSignKeyword_2()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__CompOps__Alternatives1689); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getLessThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:809:6: ( '<=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:809:6: ( '<=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:810:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__CompOps__Alternatives1709); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:817:6: ( '>' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:817:6: ( '>' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:818:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getGreaterThanSignKeyword_4()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__CompOps__Alternatives1729); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getGreaterThanSignKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:825:6: ( '>=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:825:6: ( '>=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:826:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__CompOps__Alternatives1749); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:833:6: ( '=ne=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:833:6: ( '=ne=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:834:1: '=ne='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getNeKeyword_6()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__CompOps__Alternatives1769); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getNeKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:841:6: ( '=eq=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:841:6: ( '=eq=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:842:1: '=eq='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getEqKeyword_7()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__CompOps__Alternatives1789); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getEqKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:849:6: ( '=lt=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:849:6: ( '=lt=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:850:1: '=lt='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getLtKeyword_8()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__CompOps__Alternatives1809); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getLtKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:857:6: ( '=le=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:857:6: ( '=le=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:858:1: '=le='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getLeKeyword_9()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__CompOps__Alternatives1829); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getLeKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:865:6: ( '=gt=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:865:6: ( '=gt=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:866:1: '=gt='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getGtKeyword_10()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__CompOps__Alternatives1849); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getGtKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:873:6: ( '=ge=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:873:6: ( '=ge=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:874:1: '=ge='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getGeKeyword_11()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__CompOps__Alternatives1869); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getGeKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:881:6: ( '=like=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:881:6: ( '=like=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:882:1: '=like='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompOpsAccess().getLikeKeyword_12()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__CompOps__Alternatives1889); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompOpsAccess().getLikeKeyword_12()); 
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


    // $ANTLR start "rule__CallOperator__Alternatives_0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:894:1: rule__CallOperator__Alternatives_0 : ( ( ruleBinaryOpAliases ) | ( ruleFunctionsTbl ) );
    public final void rule__CallOperator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:898:1: ( ( ruleBinaryOpAliases ) | ( ruleFunctionsTbl ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=18)) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=37 && LA8_0<=39)) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:899:1: ( ruleBinaryOpAliases )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:899:1: ( ruleBinaryOpAliases )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:900:1: ruleBinaryOpAliases
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallOperatorAccess().getBinaryOpAliasesParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleBinaryOpAliases_in_rule__CallOperator__Alternatives_01923);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:905:6: ( ruleFunctionsTbl )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:905:6: ( ruleFunctionsTbl )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:906:1: ruleFunctionsTbl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCallOperatorAccess().getFunctionsTblParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleFunctionsTbl_in_rule__CallOperator__Alternatives_01940);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:916:1: rule__PredTbl__Alternatives : ( ( 'select' ) | ( 'sort' ) | ( 'limit' ) | ( 'implementing' ) | ( 'composing' ) );
    public final void rule__PredTbl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:920:1: ( ( 'select' ) | ( 'sort' ) | ( 'limit' ) | ( 'implementing' ) | ( 'composing' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt9=1;
                }
                break;
            case 33:
                {
                alt9=2;
                }
                break;
            case 34:
                {
                alt9=3;
                }
                break;
            case 35:
                {
                alt9=4;
                }
                break;
            case 36:
                {
                alt9=5;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:921:1: ( 'select' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:921:1: ( 'select' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:922:1: 'select'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getSelectKeyword_0()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__PredTbl__Alternatives1973); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredTblAccess().getSelectKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:929:6: ( 'sort' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:929:6: ( 'sort' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:930:1: 'sort'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getSortKeyword_1()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__PredTbl__Alternatives1993); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredTblAccess().getSortKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:937:6: ( 'limit' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:937:6: ( 'limit' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:938:1: 'limit'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getLimitKeyword_2()); 
                    }
                    match(input,34,FOLLOW_34_in_rule__PredTbl__Alternatives2013); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredTblAccess().getLimitKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:945:6: ( 'implementing' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:945:6: ( 'implementing' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:946:1: 'implementing'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getImplementingKeyword_3()); 
                    }
                    match(input,35,FOLLOW_35_in_rule__PredTbl__Alternatives2033); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPredTblAccess().getImplementingKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:953:6: ( 'composing' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:953:6: ( 'composing' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:954:1: 'composing'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPredTblAccess().getComposingKeyword_4()); 
                    }
                    match(input,36,FOLLOW_36_in_rule__PredTbl__Alternatives2053); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:966:1: rule__PrimaryExpr__Alternatives_1 : ( ( ( rule__PrimaryExpr__Group_1_0__0 ) ) | ( ruleArray ) | ( ruleStrval ) );
    public final void rule__PrimaryExpr__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:970:1: ( ( ( rule__PrimaryExpr__Group_1_0__0 ) ) | ( ruleArray ) | ( ruleStrval ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 40:
            case 41:
            case 42:
            case 43:
                {
                alt10=1;
                }
                break;
            case 60:
                {
                alt10=2;
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
            case 62:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:971:1: ( ( rule__PrimaryExpr__Group_1_0__0 ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:971:1: ( ( rule__PrimaryExpr__Group_1_0__0 ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:972:1: ( rule__PrimaryExpr__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getGroup_1_0()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:973:1: ( rule__PrimaryExpr__Group_1_0__0 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:973:2: rule__PrimaryExpr__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__0_in_rule__PrimaryExpr__Alternatives_12087);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:977:6: ( ruleArray )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:977:6: ( ruleArray )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:978:1: ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getArrayParserRuleCall_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleArray_in_rule__PrimaryExpr__Alternatives_12105);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:983:6: ( ruleStrval )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:983:6: ( ruleStrval )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:984:1: ruleStrval
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getStrvalParserRuleCall_1_2()); 
                    }
                    pushFollow(FOLLOW_ruleStrval_in_rule__PrimaryExpr__Alternatives_12122);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:994:1: rule__FunctionsTbl__Alternatives : ( ( 'isnull' ) | ( 'in' ) | ( 'out' ) );
    public final void rule__FunctionsTbl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:998:1: ( ( 'isnull' ) | ( 'in' ) | ( 'out' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt11=1;
                }
                break;
            case 38:
                {
                alt11=2;
                }
                break;
            case 39:
                {
                alt11=3;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:999:1: ( 'isnull' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:999:1: ( 'isnull' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1000:1: 'isnull'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionsTblAccess().getIsnullKeyword_0()); 
                    }
                    match(input,37,FOLLOW_37_in_rule__FunctionsTbl__Alternatives2155); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionsTblAccess().getIsnullKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1007:6: ( 'in' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1007:6: ( 'in' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1008:1: 'in'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionsTblAccess().getInKeyword_1()); 
                    }
                    match(input,38,FOLLOW_38_in_rule__FunctionsTbl__Alternatives2175); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctionsTblAccess().getInKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1015:6: ( 'out' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1015:6: ( 'out' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1016:1: 'out'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctionsTblAccess().getOutKeyword_2()); 
                    }
                    match(input,39,FOLLOW_39_in_rule__FunctionsTbl__Alternatives2195); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1028:1: rule__ConstFuncTbl__Alternatives : ( ( 'true' ) | ( 'false' ) | ( 'empty' ) | ( 'null' ) );
    public final void rule__ConstFuncTbl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1032:1: ( ( 'true' ) | ( 'false' ) | ( 'empty' ) | ( 'null' ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt12=1;
                }
                break;
            case 41:
                {
                alt12=2;
                }
                break;
            case 42:
                {
                alt12=3;
                }
                break;
            case 43:
                {
                alt12=4;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1033:1: ( 'true' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1033:1: ( 'true' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1034:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstFuncTblAccess().getTrueKeyword_0()); 
                    }
                    match(input,40,FOLLOW_40_in_rule__ConstFuncTbl__Alternatives2230); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstFuncTblAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1041:6: ( 'false' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1041:6: ( 'false' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1042:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstFuncTblAccess().getFalseKeyword_1()); 
                    }
                    match(input,41,FOLLOW_41_in_rule__ConstFuncTbl__Alternatives2250); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstFuncTblAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1049:6: ( 'empty' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1049:6: ( 'empty' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1050:1: 'empty'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstFuncTblAccess().getEmptyKeyword_2()); 
                    }
                    match(input,42,FOLLOW_42_in_rule__ConstFuncTbl__Alternatives2270); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstFuncTblAccess().getEmptyKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1057:6: ( 'null' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1057:6: ( 'null' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1058:1: 'null'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstFuncTblAccess().getNullKeyword_3()); 
                    }
                    match(input,43,FOLLOW_43_in_rule__ConstFuncTbl__Alternatives2290); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1070:1: rule__Nchar__Alternatives : ( ( RULE_ALPHA ) | ( RULE_DIGIT ) | ( '-' ) | ( '.' ) | ( '_' ) | ( '~' ) | ( '$' ) | ( ':' ) | ( '*' ) | ( '+' ) | ( '?' ) | ( '/' ) | ( '@' ) );
    public final void rule__Nchar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1074:1: ( ( RULE_ALPHA ) | ( RULE_DIGIT ) | ( '-' ) | ( '.' ) | ( '_' ) | ( '~' ) | ( '$' ) | ( ':' ) | ( '*' ) | ( '+' ) | ( '?' ) | ( '/' ) | ( '@' ) )
            int alt13=13;
            switch ( input.LA(1) ) {
            case RULE_ALPHA:
                {
                alt13=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt13=2;
                }
                break;
            case 44:
                {
                alt13=3;
                }
                break;
            case 45:
                {
                alt13=4;
                }
                break;
            case 46:
                {
                alt13=5;
                }
                break;
            case 47:
                {
                alt13=6;
                }
                break;
            case 48:
                {
                alt13=7;
                }
                break;
            case 49:
                {
                alt13=8;
                }
                break;
            case 50:
                {
                alt13=9;
                }
                break;
            case 51:
                {
                alt13=10;
                }
                break;
            case 52:
                {
                alt13=11;
                }
                break;
            case 53:
                {
                alt13=12;
                }
                break;
            case 54:
                {
                alt13=13;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1075:1: ( RULE_ALPHA )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1075:1: ( RULE_ALPHA )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1076:1: RULE_ALPHA
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getALPHATerminalRuleCall_0()); 
                    }
                    match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rule__Nchar__Alternatives2324); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getALPHATerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1081:6: ( RULE_DIGIT )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1081:6: ( RULE_DIGIT )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1082:1: RULE_DIGIT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getDIGITTerminalRuleCall_1()); 
                    }
                    match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rule__Nchar__Alternatives2341); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getDIGITTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1087:6: ( '-' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1087:6: ( '-' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1088:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getHyphenMinusKeyword_2()); 
                    }
                    match(input,44,FOLLOW_44_in_rule__Nchar__Alternatives2359); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getHyphenMinusKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1095:6: ( '.' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1095:6: ( '.' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1096:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getFullStopKeyword_3()); 
                    }
                    match(input,45,FOLLOW_45_in_rule__Nchar__Alternatives2379); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getFullStopKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1103:6: ( '_' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1103:6: ( '_' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1104:1: '_'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().get_Keyword_4()); 
                    }
                    match(input,46,FOLLOW_46_in_rule__Nchar__Alternatives2399); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().get_Keyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1111:6: ( '~' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1111:6: ( '~' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1112:1: '~'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getTildeKeyword_5()); 
                    }
                    match(input,47,FOLLOW_47_in_rule__Nchar__Alternatives2419); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getTildeKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1119:6: ( '$' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1119:6: ( '$' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1120:1: '$'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getDollarSignKeyword_6()); 
                    }
                    match(input,48,FOLLOW_48_in_rule__Nchar__Alternatives2439); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getDollarSignKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1127:6: ( ':' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1127:6: ( ':' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1128:1: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getColonKeyword_7()); 
                    }
                    match(input,49,FOLLOW_49_in_rule__Nchar__Alternatives2459); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getColonKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1135:6: ( '*' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1135:6: ( '*' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1136:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getAsteriskKeyword_8()); 
                    }
                    match(input,50,FOLLOW_50_in_rule__Nchar__Alternatives2479); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getAsteriskKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1143:6: ( '+' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1143:6: ( '+' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1144:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getPlusSignKeyword_9()); 
                    }
                    match(input,51,FOLLOW_51_in_rule__Nchar__Alternatives2499); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getPlusSignKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1151:6: ( '?' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1151:6: ( '?' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1152:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getQuestionMarkKeyword_10()); 
                    }
                    match(input,52,FOLLOW_52_in_rule__Nchar__Alternatives2519); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getQuestionMarkKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1159:6: ( '/' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1159:6: ( '/' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1160:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getSolidusKeyword_11()); 
                    }
                    match(input,53,FOLLOW_53_in_rule__Nchar__Alternatives2539); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getSolidusKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1167:6: ( '@' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1167:6: ( '@' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1168:1: '@'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getCommercialAtKeyword_12()); 
                    }
                    match(input,54,FOLLOW_54_in_rule__Nchar__Alternatives2559); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1180:1: rule__Strval__Alternatives : ( ( ruleNchar ) | ( rulePct_encoded ) );
    public final void rule__Strval__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1184:1: ( ( ruleNchar ) | ( rulePct_encoded ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_ALPHA && LA14_0<=RULE_DIGIT)||(LA14_0>=44 && LA14_0<=54)) ) {
                alt14=1;
            }
            else if ( (LA14_0==62) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1185:1: ( ruleNchar )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1185:1: ( ruleNchar )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1186:1: ruleNchar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrvalAccess().getNcharParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleNchar_in_rule__Strval__Alternatives2593);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1191:6: ( rulePct_encoded )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1191:6: ( rulePct_encoded )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1192:1: rulePct_encoded
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrvalAccess().getPct_encodedParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulePct_encoded_in_rule__Strval__Alternatives2610);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1202:1: rule__LogicalOpAliases__Alternatives : ( ( 'or' ) | ( 'and' ) | ( 'not' ) );
    public final void rule__LogicalOpAliases__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1206:1: ( ( 'or' ) | ( 'and' ) | ( 'not' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt15=1;
                }
                break;
            case 56:
                {
                alt15=2;
                }
                break;
            case 57:
                {
                alt15=3;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1207:1: ( 'or' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1207:1: ( 'or' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1208:1: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalOpAliasesAccess().getOrKeyword_0()); 
                    }
                    match(input,55,FOLLOW_55_in_rule__LogicalOpAliases__Alternatives2643); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalOpAliasesAccess().getOrKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1215:6: ( 'and' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1215:6: ( 'and' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1216:1: 'and'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalOpAliasesAccess().getAndKeyword_1()); 
                    }
                    match(input,56,FOLLOW_56_in_rule__LogicalOpAliases__Alternatives2663); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalOpAliasesAccess().getAndKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1223:6: ( 'not' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1223:6: ( 'not' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1224:1: 'not'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalOpAliasesAccess().getNotKeyword_2()); 
                    }
                    match(input,57,FOLLOW_57_in_rule__LogicalOpAliases__Alternatives2683); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1238:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1242:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1243:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02715);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02718);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1250:1: rule__Model__Group__0__Impl : ( ( rule__Model__OperandsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1254:1: ( ( ( rule__Model__OperandsAssignment_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1255:1: ( ( rule__Model__OperandsAssignment_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1255:1: ( ( rule__Model__OperandsAssignment_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1256:1: ( rule__Model__OperandsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getOperandsAssignment_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1257:1: ( rule__Model__OperandsAssignment_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1257:2: rule__Model__OperandsAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__OperandsAssignment_0_in_rule__Model__Group__0__Impl2745);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1267:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1271:1: ( rule__Model__Group__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1272:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12775);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1278:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1282:1: ( ( ( rule__Model__Group_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1283:1: ( ( rule__Model__Group_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1283:1: ( ( rule__Model__Group_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1284:1: ( rule__Model__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1285:1: ( rule__Model__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=8 && LA16_0<=9)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1285:2: rule__Model__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl2802);
            	    rule__Model__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1299:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1303:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1304:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__02837);
            rule__Model__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__02840);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1311:1: rule__Model__Group_1__0__Impl : ( ( rule__Model__Alternatives_1_0 ) ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1315:1: ( ( ( rule__Model__Alternatives_1_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1316:1: ( ( rule__Model__Alternatives_1_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1316:1: ( ( rule__Model__Alternatives_1_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1317:1: ( rule__Model__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAlternatives_1_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1318:1: ( rule__Model__Alternatives_1_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1318:2: rule__Model__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Model__Alternatives_1_0_in_rule__Model__Group_1__0__Impl2867);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1328:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1332:1: ( rule__Model__Group_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1333:2: rule__Model__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__12897);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1339:1: rule__Model__Group_1__1__Impl : ( ruleHoOperand ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1343:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1344:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1344:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1345:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getHoOperandParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__Model__Group_1__1__Impl2924);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1360:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1364:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1365:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__02957);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__02960);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1372:1: rule__And__Group__0__Impl : ( '&' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1376:1: ( ( '&' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1377:1: ( '&' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1377:1: ( '&' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1378:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAmpersandKeyword_0()); 
            }
            match(input,9,FOLLOW_9_in_rule__And__Group__0__Impl2988); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1391:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1395:1: ( rule__And__Group__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1396:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__13019);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1402:1: rule__And__Group__1__Impl : ( ruleHoOperand ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1406:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1407:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1407:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1408:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getHoOperandParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__And__Group__1__Impl3046);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1423:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1427:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1428:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__03079);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__03082);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1435:1: rule__Or__Group__0__Impl : ( ( rule__Or__Alternatives_0 ) ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1439:1: ( ( ( rule__Or__Alternatives_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1440:1: ( ( rule__Or__Alternatives_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1440:1: ( ( rule__Or__Alternatives_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1441:1: ( rule__Or__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAlternatives_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1442:1: ( rule__Or__Alternatives_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1442:2: rule__Or__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Or__Alternatives_0_in_rule__Or__Group__0__Impl3109);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1452:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1456:1: ( rule__Or__Group__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1457:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__13139);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1463:1: rule__Or__Group__1__Impl : ( ruleHoOperand ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1467:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1468:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1468:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1469:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getHoOperandParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__Or__Group__1__Impl3166);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1484:1: rule__HoOperand__Group__0 : rule__HoOperand__Group__0__Impl rule__HoOperand__Group__1 ;
    public final void rule__HoOperand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1488:1: ( rule__HoOperand__Group__0__Impl rule__HoOperand__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1489:2: rule__HoOperand__Group__0__Impl rule__HoOperand__Group__1
            {
            pushFollow(FOLLOW_rule__HoOperand__Group__0__Impl_in_rule__HoOperand__Group__03199);
            rule__HoOperand__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group__1_in_rule__HoOperand__Group__03202);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1496:1: rule__HoOperand__Group__0__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__HoOperand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1500:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1501:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1501:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1502:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getWSPTerminalRuleCall_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1503:1: ( RULE_WSP )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_WSP) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred55_InternalRQL()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1503:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__HoOperand__Group__0__Impl3230); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1513:1: rule__HoOperand__Group__1 : rule__HoOperand__Group__1__Impl rule__HoOperand__Group__2 ;
    public final void rule__HoOperand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1517:1: ( rule__HoOperand__Group__1__Impl rule__HoOperand__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1518:2: rule__HoOperand__Group__1__Impl rule__HoOperand__Group__2
            {
            pushFollow(FOLLOW_rule__HoOperand__Group__1__Impl_in_rule__HoOperand__Group__13261);
            rule__HoOperand__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group__2_in_rule__HoOperand__Group__13264);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1525:1: rule__HoOperand__Group__1__Impl : ( ( rule__HoOperand__Alternatives_1 )? ) ;
    public final void rule__HoOperand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1529:1: ( ( ( rule__HoOperand__Alternatives_1 )? ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1530:1: ( ( rule__HoOperand__Alternatives_1 )? )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1530:1: ( ( rule__HoOperand__Alternatives_1 )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1531:1: ( rule__HoOperand__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getAlternatives_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1532:1: ( rule__HoOperand__Alternatives_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=RULE_ALPHA && LA18_0<=RULE_DIGIT)||(LA18_0>=12 && LA18_0<=18)||(LA18_0>=32 && LA18_0<=39)||(LA18_0>=44 && LA18_0<=57)||LA18_0==60||LA18_0==62) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1532:2: rule__HoOperand__Alternatives_1
                    {
                    pushFollow(FOLLOW_rule__HoOperand__Alternatives_1_in_rule__HoOperand__Group__1__Impl3291);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1542:1: rule__HoOperand__Group__2 : rule__HoOperand__Group__2__Impl rule__HoOperand__Group__3 ;
    public final void rule__HoOperand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1546:1: ( rule__HoOperand__Group__2__Impl rule__HoOperand__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1547:2: rule__HoOperand__Group__2__Impl rule__HoOperand__Group__3
            {
            pushFollow(FOLLOW_rule__HoOperand__Group__2__Impl_in_rule__HoOperand__Group__23322);
            rule__HoOperand__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group__3_in_rule__HoOperand__Group__23325);
            rule__HoOperand__Group__3();

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1554:1: rule__HoOperand__Group__2__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__HoOperand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1558:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1559:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1559:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1560:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getWSPTerminalRuleCall_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1561:1: ( RULE_WSP )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WSP) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1561:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__HoOperand__Group__2__Impl3353); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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


    // $ANTLR start "rule__HoOperand__Group__3"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1571:1: rule__HoOperand__Group__3 : rule__HoOperand__Group__3__Impl rule__HoOperand__Group__4 ;
    public final void rule__HoOperand__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1575:1: ( rule__HoOperand__Group__3__Impl rule__HoOperand__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1576:2: rule__HoOperand__Group__3__Impl rule__HoOperand__Group__4
            {
            pushFollow(FOLLOW_rule__HoOperand__Group__3__Impl_in_rule__HoOperand__Group__33384);
            rule__HoOperand__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group__4_in_rule__HoOperand__Group__33387);
            rule__HoOperand__Group__4();

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
    // $ANTLR end "rule__HoOperand__Group__3"


    // $ANTLR start "rule__HoOperand__Group__3__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1583:1: rule__HoOperand__Group__3__Impl : ( ( '\\r' )? ) ;
    public final void rule__HoOperand__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1587:1: ( ( ( '\\r' )? ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1588:1: ( ( '\\r' )? )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1588:1: ( ( '\\r' )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1589:1: ( '\\r' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getControl000dKeyword_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1590:1: ( '\\r' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==58) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1591:2: '\\r'
                    {
                    match(input,58,FOLLOW_58_in_rule__HoOperand__Group__3__Impl3416); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHoOperandAccess().getControl000dKeyword_3()); 
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
    // $ANTLR end "rule__HoOperand__Group__3__Impl"


    // $ANTLR start "rule__HoOperand__Group__4"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1602:1: rule__HoOperand__Group__4 : rule__HoOperand__Group__4__Impl ;
    public final void rule__HoOperand__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1606:1: ( rule__HoOperand__Group__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1607:2: rule__HoOperand__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HoOperand__Group__4__Impl_in_rule__HoOperand__Group__43449);
            rule__HoOperand__Group__4__Impl();

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
    // $ANTLR end "rule__HoOperand__Group__4"


    // $ANTLR start "rule__HoOperand__Group__4__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1613:1: rule__HoOperand__Group__4__Impl : ( ( '\\n' )? ) ;
    public final void rule__HoOperand__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1617:1: ( ( ( '\\n' )? ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1618:1: ( ( '\\n' )? )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1618:1: ( ( '\\n' )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1619:1: ( '\\n' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getControl000aKeyword_4()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1620:1: ( '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==59) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1621:2: '\\n'
                    {
                    match(input,59,FOLLOW_59_in_rule__HoOperand__Group__4__Impl3478); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHoOperandAccess().getControl000aKeyword_4()); 
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
    // $ANTLR end "rule__HoOperand__Group__4__Impl"


    // $ANTLR start "rule__HoOperand__Group_1_4__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1642:1: rule__HoOperand__Group_1_4__0 : rule__HoOperand__Group_1_4__0__Impl rule__HoOperand__Group_1_4__1 ;
    public final void rule__HoOperand__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1646:1: ( rule__HoOperand__Group_1_4__0__Impl rule__HoOperand__Group_1_4__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1647:2: rule__HoOperand__Group_1_4__0__Impl rule__HoOperand__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__0__Impl_in_rule__HoOperand__Group_1_4__03521);
            rule__HoOperand__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__1_in_rule__HoOperand__Group_1_4__03524);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1654:1: rule__HoOperand__Group_1_4__0__Impl : ( '(' ) ;
    public final void rule__HoOperand__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1658:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1659:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1659:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1660:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getLeftParenthesisKeyword_1_4_0()); 
            }
            match(input,60,FOLLOW_60_in_rule__HoOperand__Group_1_4__0__Impl3552); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1673:1: rule__HoOperand__Group_1_4__1 : rule__HoOperand__Group_1_4__1__Impl rule__HoOperand__Group_1_4__2 ;
    public final void rule__HoOperand__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1677:1: ( rule__HoOperand__Group_1_4__1__Impl rule__HoOperand__Group_1_4__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1678:2: rule__HoOperand__Group_1_4__1__Impl rule__HoOperand__Group_1_4__2
            {
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__1__Impl_in_rule__HoOperand__Group_1_4__13583);
            rule__HoOperand__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__2_in_rule__HoOperand__Group_1_4__13586);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1685:1: rule__HoOperand__Group_1_4__1__Impl : ( ruleHoOperand ) ;
    public final void rule__HoOperand__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1689:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1690:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1690:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1691:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getHoOperandParserRuleCall_1_4_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__HoOperand__Group_1_4__1__Impl3613);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1702:1: rule__HoOperand__Group_1_4__2 : rule__HoOperand__Group_1_4__2__Impl rule__HoOperand__Group_1_4__3 ;
    public final void rule__HoOperand__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1706:1: ( rule__HoOperand__Group_1_4__2__Impl rule__HoOperand__Group_1_4__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1707:2: rule__HoOperand__Group_1_4__2__Impl rule__HoOperand__Group_1_4__3
            {
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__2__Impl_in_rule__HoOperand__Group_1_4__23642);
            rule__HoOperand__Group_1_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__3_in_rule__HoOperand__Group_1_4__23645);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1714:1: rule__HoOperand__Group_1_4__2__Impl : ( ( rule__HoOperand__Alternatives_1_4_2 ) ) ;
    public final void rule__HoOperand__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1718:1: ( ( ( rule__HoOperand__Alternatives_1_4_2 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1719:1: ( ( rule__HoOperand__Alternatives_1_4_2 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1719:1: ( ( rule__HoOperand__Alternatives_1_4_2 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1720:1: ( rule__HoOperand__Alternatives_1_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getAlternatives_1_4_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1721:1: ( rule__HoOperand__Alternatives_1_4_2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1721:2: rule__HoOperand__Alternatives_1_4_2
            {
            pushFollow(FOLLOW_rule__HoOperand__Alternatives_1_4_2_in_rule__HoOperand__Group_1_4__2__Impl3672);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1731:1: rule__HoOperand__Group_1_4__3 : rule__HoOperand__Group_1_4__3__Impl ;
    public final void rule__HoOperand__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1735:1: ( rule__HoOperand__Group_1_4__3__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1736:2: rule__HoOperand__Group_1_4__3__Impl
            {
            pushFollow(FOLLOW_rule__HoOperand__Group_1_4__3__Impl_in_rule__HoOperand__Group_1_4__33702);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1742:1: rule__HoOperand__Group_1_4__3__Impl : ( ')' ) ;
    public final void rule__HoOperand__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1746:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1747:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1747:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1748:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHoOperandAccess().getRightParenthesisKeyword_1_4_3()); 
            }
            match(input,61,FOLLOW_61_in_rule__HoOperand__Group_1_4__3__Impl3730); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1769:1: rule__HigherOrderCall__Group__0 : rule__HigherOrderCall__Group__0__Impl rule__HigherOrderCall__Group__1 ;
    public final void rule__HigherOrderCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1773:1: ( rule__HigherOrderCall__Group__0__Impl rule__HigherOrderCall__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1774:2: rule__HigherOrderCall__Group__0__Impl rule__HigherOrderCall__Group__1
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__0__Impl_in_rule__HigherOrderCall__Group__03769);
            rule__HigherOrderCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__1_in_rule__HigherOrderCall__Group__03772);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1781:1: rule__HigherOrderCall__Group__0__Impl : ( ruleLogicalOpAliases ) ;
    public final void rule__HigherOrderCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1785:1: ( ( ruleLogicalOpAliases ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1786:1: ( ruleLogicalOpAliases )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1786:1: ( ruleLogicalOpAliases )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1787:1: ruleLogicalOpAliases
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getLogicalOpAliasesParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLogicalOpAliases_in_rule__HigherOrderCall__Group__0__Impl3799);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1798:1: rule__HigherOrderCall__Group__1 : rule__HigherOrderCall__Group__1__Impl rule__HigherOrderCall__Group__2 ;
    public final void rule__HigherOrderCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1802:1: ( rule__HigherOrderCall__Group__1__Impl rule__HigherOrderCall__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1803:2: rule__HigherOrderCall__Group__1__Impl rule__HigherOrderCall__Group__2
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__1__Impl_in_rule__HigherOrderCall__Group__13828);
            rule__HigherOrderCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__2_in_rule__HigherOrderCall__Group__13831);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1810:1: rule__HigherOrderCall__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__HigherOrderCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1814:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1815:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1815:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1816:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1817:1: ( RULE_WSP )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WSP) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1817:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__HigherOrderCall__Group__1__Impl3859); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1827:1: rule__HigherOrderCall__Group__2 : rule__HigherOrderCall__Group__2__Impl rule__HigherOrderCall__Group__3 ;
    public final void rule__HigherOrderCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1831:1: ( rule__HigherOrderCall__Group__2__Impl rule__HigherOrderCall__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1832:2: rule__HigherOrderCall__Group__2__Impl rule__HigherOrderCall__Group__3
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__2__Impl_in_rule__HigherOrderCall__Group__23890);
            rule__HigherOrderCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__3_in_rule__HigherOrderCall__Group__23893);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1839:1: rule__HigherOrderCall__Group__2__Impl : ( '(' ) ;
    public final void rule__HigherOrderCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1843:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1844:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1844:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1845:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,60,FOLLOW_60_in_rule__HigherOrderCall__Group__2__Impl3921); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1858:1: rule__HigherOrderCall__Group__3 : rule__HigherOrderCall__Group__3__Impl rule__HigherOrderCall__Group__4 ;
    public final void rule__HigherOrderCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1862:1: ( rule__HigherOrderCall__Group__3__Impl rule__HigherOrderCall__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1863:2: rule__HigherOrderCall__Group__3__Impl rule__HigherOrderCall__Group__4
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__3__Impl_in_rule__HigherOrderCall__Group__33952);
            rule__HigherOrderCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__4_in_rule__HigherOrderCall__Group__33955);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1870:1: rule__HigherOrderCall__Group__3__Impl : ( ( rule__HigherOrderCall__Group_3__0 ) ) ;
    public final void rule__HigherOrderCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1874:1: ( ( ( rule__HigherOrderCall__Group_3__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1875:1: ( ( rule__HigherOrderCall__Group_3__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1875:1: ( ( rule__HigherOrderCall__Group_3__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1876:1: ( rule__HigherOrderCall__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getGroup_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1877:1: ( rule__HigherOrderCall__Group_3__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1877:2: rule__HigherOrderCall__Group_3__0
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3__0_in_rule__HigherOrderCall__Group__3__Impl3982);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1887:1: rule__HigherOrderCall__Group__4 : rule__HigherOrderCall__Group__4__Impl ;
    public final void rule__HigherOrderCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1891:1: ( rule__HigherOrderCall__Group__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1892:2: rule__HigherOrderCall__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group__4__Impl_in_rule__HigherOrderCall__Group__44012);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1898:1: rule__HigherOrderCall__Group__4__Impl : ( ')' ) ;
    public final void rule__HigherOrderCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1902:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1903:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1903:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1904:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,61,FOLLOW_61_in_rule__HigherOrderCall__Group__4__Impl4040); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1927:1: rule__HigherOrderCall__Group_3__0 : rule__HigherOrderCall__Group_3__0__Impl rule__HigherOrderCall__Group_3__1 ;
    public final void rule__HigherOrderCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1931:1: ( rule__HigherOrderCall__Group_3__0__Impl rule__HigherOrderCall__Group_3__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1932:2: rule__HigherOrderCall__Group_3__0__Impl rule__HigherOrderCall__Group_3__1
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3__0__Impl_in_rule__HigherOrderCall__Group_3__04081);
            rule__HigherOrderCall__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3__1_in_rule__HigherOrderCall__Group_3__04084);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1939:1: rule__HigherOrderCall__Group_3__0__Impl : ( ruleHoOperand ) ;
    public final void rule__HigherOrderCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1943:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1944:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1944:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1945:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getHoOperandParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__HigherOrderCall__Group_3__0__Impl4111);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1956:1: rule__HigherOrderCall__Group_3__1 : rule__HigherOrderCall__Group_3__1__Impl ;
    public final void rule__HigherOrderCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1960:1: ( rule__HigherOrderCall__Group_3__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1961:2: rule__HigherOrderCall__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3__1__Impl_in_rule__HigherOrderCall__Group_3__14140);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1967:1: rule__HigherOrderCall__Group_3__1__Impl : ( ( rule__HigherOrderCall__Group_3_1__0 )* ) ;
    public final void rule__HigherOrderCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1971:1: ( ( ( rule__HigherOrderCall__Group_3_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1972:1: ( ( rule__HigherOrderCall__Group_3_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1972:1: ( ( rule__HigherOrderCall__Group_3_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1973:1: ( rule__HigherOrderCall__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getGroup_3_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1974:1: ( rule__HigherOrderCall__Group_3_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==8) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1974:2: rule__HigherOrderCall__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__HigherOrderCall__Group_3_1__0_in_rule__HigherOrderCall__Group_3__1__Impl4167);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1988:1: rule__HigherOrderCall__Group_3_1__0 : rule__HigherOrderCall__Group_3_1__0__Impl rule__HigherOrderCall__Group_3_1__1 ;
    public final void rule__HigherOrderCall__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1992:1: ( rule__HigherOrderCall__Group_3_1__0__Impl rule__HigherOrderCall__Group_3_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1993:2: rule__HigherOrderCall__Group_3_1__0__Impl rule__HigherOrderCall__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3_1__0__Impl_in_rule__HigherOrderCall__Group_3_1__04202);
            rule__HigherOrderCall__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3_1__1_in_rule__HigherOrderCall__Group_3_1__04205);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2000:1: rule__HigherOrderCall__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__HigherOrderCall__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2004:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2005:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2005:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2006:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,8,FOLLOW_8_in_rule__HigherOrderCall__Group_3_1__0__Impl4233); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2019:1: rule__HigherOrderCall__Group_3_1__1 : rule__HigherOrderCall__Group_3_1__1__Impl ;
    public final void rule__HigherOrderCall__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2023:1: ( rule__HigherOrderCall__Group_3_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2024:2: rule__HigherOrderCall__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__HigherOrderCall__Group_3_1__1__Impl_in_rule__HigherOrderCall__Group_3_1__14264);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2030:1: rule__HigherOrderCall__Group_3_1__1__Impl : ( ruleHoOperand ) ;
    public final void rule__HigherOrderCall__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2034:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2035:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2035:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2036:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigherOrderCallAccess().getHoOperandParserRuleCall_3_1_1()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__HigherOrderCall__Group_3_1__1__Impl4291);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2051:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2055:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2056:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04324);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04327);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2063:1: rule__Comparison__Group__0__Impl : ( ruleStrval ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2067:1: ( ( ruleStrval ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2068:1: ( ruleStrval )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2068:1: ( ruleStrval )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2069:1: ruleStrval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getStrvalParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_rule__Comparison__Group__0__Impl4354);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2080:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2084:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2085:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14383);
            rule__Comparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__14386);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2092:1: rule__Comparison__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2096:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2097:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2097:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2098:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2099:1: ( RULE_WSP )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WSP) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2099:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Comparison__Group__1__Impl4414); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2109:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl rule__Comparison__Group__3 ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2113:1: ( rule__Comparison__Group__2__Impl rule__Comparison__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2114:2: rule__Comparison__Group__2__Impl rule__Comparison__Group__3
            {
            pushFollow(FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__24445);
            rule__Comparison__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__3_in_rule__Comparison__Group__24448);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2121:1: rule__Comparison__Group__2__Impl : ( ruleCompOps ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2125:1: ( ( ruleCompOps ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2126:1: ( ruleCompOps )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2126:1: ( ruleCompOps )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2127:1: ruleCompOps
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getCompOpsParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleCompOps_in_rule__Comparison__Group__2__Impl4475);
            ruleCompOps();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getCompOpsParserRuleCall_2()); 
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2138:1: rule__Comparison__Group__3 : rule__Comparison__Group__3__Impl ;
    public final void rule__Comparison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2142:1: ( rule__Comparison__Group__3__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2143:2: rule__Comparison__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__3__Impl_in_rule__Comparison__Group__34504);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2149:1: rule__Comparison__Group__3__Impl : ( rulePrimaryExpr ) ;
    public final void rule__Comparison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2153:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2154:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2154:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2155:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getPrimaryExprParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__Comparison__Group__3__Impl4531);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2174:1: rule__CallOperator__Group__0 : rule__CallOperator__Group__0__Impl rule__CallOperator__Group__1 ;
    public final void rule__CallOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2178:1: ( rule__CallOperator__Group__0__Impl rule__CallOperator__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2179:2: rule__CallOperator__Group__0__Impl rule__CallOperator__Group__1
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__0__Impl_in_rule__CallOperator__Group__04568);
            rule__CallOperator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group__1_in_rule__CallOperator__Group__04571);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2186:1: rule__CallOperator__Group__0__Impl : ( ( rule__CallOperator__Alternatives_0 ) ) ;
    public final void rule__CallOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2190:1: ( ( ( rule__CallOperator__Alternatives_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2191:1: ( ( rule__CallOperator__Alternatives_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2191:1: ( ( rule__CallOperator__Alternatives_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2192:1: ( rule__CallOperator__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getAlternatives_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2193:1: ( rule__CallOperator__Alternatives_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2193:2: rule__CallOperator__Alternatives_0
            {
            pushFollow(FOLLOW_rule__CallOperator__Alternatives_0_in_rule__CallOperator__Group__0__Impl4598);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2203:1: rule__CallOperator__Group__1 : rule__CallOperator__Group__1__Impl rule__CallOperator__Group__2 ;
    public final void rule__CallOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2207:1: ( rule__CallOperator__Group__1__Impl rule__CallOperator__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2208:2: rule__CallOperator__Group__1__Impl rule__CallOperator__Group__2
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__1__Impl_in_rule__CallOperator__Group__14628);
            rule__CallOperator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group__2_in_rule__CallOperator__Group__14631);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2215:1: rule__CallOperator__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__CallOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2219:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2220:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2220:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2221:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2222:1: ( RULE_WSP )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WSP) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2222:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__CallOperator__Group__1__Impl4659); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2232:1: rule__CallOperator__Group__2 : rule__CallOperator__Group__2__Impl rule__CallOperator__Group__3 ;
    public final void rule__CallOperator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2236:1: ( rule__CallOperator__Group__2__Impl rule__CallOperator__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2237:2: rule__CallOperator__Group__2__Impl rule__CallOperator__Group__3
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__2__Impl_in_rule__CallOperator__Group__24690);
            rule__CallOperator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group__3_in_rule__CallOperator__Group__24693);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2244:1: rule__CallOperator__Group__2__Impl : ( '(' ) ;
    public final void rule__CallOperator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2248:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2249:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2249:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2250:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,60,FOLLOW_60_in_rule__CallOperator__Group__2__Impl4721); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2263:1: rule__CallOperator__Group__3 : rule__CallOperator__Group__3__Impl rule__CallOperator__Group__4 ;
    public final void rule__CallOperator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2267:1: ( rule__CallOperator__Group__3__Impl rule__CallOperator__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2268:2: rule__CallOperator__Group__3__Impl rule__CallOperator__Group__4
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__3__Impl_in_rule__CallOperator__Group__34752);
            rule__CallOperator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group__4_in_rule__CallOperator__Group__34755);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2275:1: rule__CallOperator__Group__3__Impl : ( ( rule__CallOperator__Group_3__0 )? ) ;
    public final void rule__CallOperator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2279:1: ( ( ( rule__CallOperator__Group_3__0 )? ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2280:1: ( ( rule__CallOperator__Group_3__0 )? )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2280:1: ( ( rule__CallOperator__Group_3__0 )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2281:1: ( rule__CallOperator__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getGroup_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2282:1: ( rule__CallOperator__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_ALPHA && LA26_0<=RULE_WSP)||(LA26_0>=40 && LA26_0<=54)||LA26_0==60||LA26_0==62) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2282:2: rule__CallOperator__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__CallOperator__Group_3__0_in_rule__CallOperator__Group__3__Impl4782);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2292:1: rule__CallOperator__Group__4 : rule__CallOperator__Group__4__Impl ;
    public final void rule__CallOperator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2296:1: ( rule__CallOperator__Group__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2297:2: rule__CallOperator__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__CallOperator__Group__4__Impl_in_rule__CallOperator__Group__44813);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2303:1: rule__CallOperator__Group__4__Impl : ( ')' ) ;
    public final void rule__CallOperator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2307:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2308:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2308:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2309:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,61,FOLLOW_61_in_rule__CallOperator__Group__4__Impl4841); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2332:1: rule__CallOperator__Group_3__0 : rule__CallOperator__Group_3__0__Impl rule__CallOperator__Group_3__1 ;
    public final void rule__CallOperator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2336:1: ( rule__CallOperator__Group_3__0__Impl rule__CallOperator__Group_3__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2337:2: rule__CallOperator__Group_3__0__Impl rule__CallOperator__Group_3__1
            {
            pushFollow(FOLLOW_rule__CallOperator__Group_3__0__Impl_in_rule__CallOperator__Group_3__04882);
            rule__CallOperator__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group_3__1_in_rule__CallOperator__Group_3__04885);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2344:1: rule__CallOperator__Group_3__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__CallOperator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2348:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2349:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2349:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2350:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getPrimaryExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__CallOperator__Group_3__0__Impl4912);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2361:1: rule__CallOperator__Group_3__1 : rule__CallOperator__Group_3__1__Impl ;
    public final void rule__CallOperator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2365:1: ( rule__CallOperator__Group_3__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2366:2: rule__CallOperator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__CallOperator__Group_3__1__Impl_in_rule__CallOperator__Group_3__14941);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2372:1: rule__CallOperator__Group_3__1__Impl : ( ( rule__CallOperator__Group_3_1__0 )* ) ;
    public final void rule__CallOperator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2376:1: ( ( ( rule__CallOperator__Group_3_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2377:1: ( ( rule__CallOperator__Group_3_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2377:1: ( ( rule__CallOperator__Group_3_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2378:1: ( rule__CallOperator__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getGroup_3_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2379:1: ( rule__CallOperator__Group_3_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==8) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2379:2: rule__CallOperator__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__CallOperator__Group_3_1__0_in_rule__CallOperator__Group_3__1__Impl4968);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2393:1: rule__CallOperator__Group_3_1__0 : rule__CallOperator__Group_3_1__0__Impl rule__CallOperator__Group_3_1__1 ;
    public final void rule__CallOperator__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2397:1: ( rule__CallOperator__Group_3_1__0__Impl rule__CallOperator__Group_3_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2398:2: rule__CallOperator__Group_3_1__0__Impl rule__CallOperator__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__CallOperator__Group_3_1__0__Impl_in_rule__CallOperator__Group_3_1__05003);
            rule__CallOperator__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CallOperator__Group_3_1__1_in_rule__CallOperator__Group_3_1__05006);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2405:1: rule__CallOperator__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__CallOperator__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2409:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2410:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2410:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2411:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,8,FOLLOW_8_in_rule__CallOperator__Group_3_1__0__Impl5034); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2424:1: rule__CallOperator__Group_3_1__1 : rule__CallOperator__Group_3_1__1__Impl ;
    public final void rule__CallOperator__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2428:1: ( rule__CallOperator__Group_3_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2429:2: rule__CallOperator__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__CallOperator__Group_3_1__1__Impl_in_rule__CallOperator__Group_3_1__15065);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2435:1: rule__CallOperator__Group_3_1__1__Impl : ( rulePrimaryExpr ) ;
    public final void rule__CallOperator__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2439:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2440:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2440:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2441:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCallOperatorAccess().getPrimaryExprParserRuleCall_3_1_1()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__CallOperator__Group_3_1__1__Impl5092);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2456:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2460:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2461:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__05125);
            rule__Predicate__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__05128);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2468:1: rule__Predicate__Group__0__Impl : ( rulePredTbl ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2472:1: ( ( rulePredTbl ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2473:1: ( rulePredTbl )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2473:1: ( rulePredTbl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2474:1: rulePredTbl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPredTblParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePredTbl_in_rule__Predicate__Group__0__Impl5155);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2485:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl rule__Predicate__Group__2 ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2489:1: ( rule__Predicate__Group__1__Impl rule__Predicate__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2490:2: rule__Predicate__Group__1__Impl rule__Predicate__Group__2
            {
            pushFollow(FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__15184);
            rule__Predicate__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__2_in_rule__Predicate__Group__15187);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2497:1: rule__Predicate__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2501:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2502:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2502:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2503:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2504:1: ( RULE_WSP )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_WSP) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2504:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Predicate__Group__1__Impl5215); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2514:1: rule__Predicate__Group__2 : rule__Predicate__Group__2__Impl rule__Predicate__Group__3 ;
    public final void rule__Predicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2518:1: ( rule__Predicate__Group__2__Impl rule__Predicate__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2519:2: rule__Predicate__Group__2__Impl rule__Predicate__Group__3
            {
            pushFollow(FOLLOW_rule__Predicate__Group__2__Impl_in_rule__Predicate__Group__25246);
            rule__Predicate__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__3_in_rule__Predicate__Group__25249);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2526:1: rule__Predicate__Group__2__Impl : ( '(' ) ;
    public final void rule__Predicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2530:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2531:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2531:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2532:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,60,FOLLOW_60_in_rule__Predicate__Group__2__Impl5277); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2545:1: rule__Predicate__Group__3 : rule__Predicate__Group__3__Impl rule__Predicate__Group__4 ;
    public final void rule__Predicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2549:1: ( rule__Predicate__Group__3__Impl rule__Predicate__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2550:2: rule__Predicate__Group__3__Impl rule__Predicate__Group__4
            {
            pushFollow(FOLLOW_rule__Predicate__Group__3__Impl_in_rule__Predicate__Group__35308);
            rule__Predicate__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__4_in_rule__Predicate__Group__35311);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2557:1: rule__Predicate__Group__3__Impl : ( ( rule__Predicate__Group_3__0 )? ) ;
    public final void rule__Predicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2561:1: ( ( ( rule__Predicate__Group_3__0 )? ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2562:1: ( ( rule__Predicate__Group_3__0 )? )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2562:1: ( ( rule__Predicate__Group_3__0 )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2563:1: ( rule__Predicate__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getGroup_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2564:1: ( rule__Predicate__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ALPHA && LA29_0<=RULE_WSP)||(LA29_0>=40 && LA29_0<=54)||LA29_0==60||LA29_0==62) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2564:2: rule__Predicate__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Predicate__Group_3__0_in_rule__Predicate__Group__3__Impl5338);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2574:1: rule__Predicate__Group__4 : rule__Predicate__Group__4__Impl ;
    public final void rule__Predicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2578:1: ( rule__Predicate__Group__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2579:2: rule__Predicate__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group__4__Impl_in_rule__Predicate__Group__45369);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2585:1: rule__Predicate__Group__4__Impl : ( ')' ) ;
    public final void rule__Predicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2589:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2590:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2590:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2591:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,61,FOLLOW_61_in_rule__Predicate__Group__4__Impl5397); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2614:1: rule__Predicate__Group_3__0 : rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 ;
    public final void rule__Predicate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2618:1: ( rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2619:2: rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3__0__Impl_in_rule__Predicate__Group_3__05438);
            rule__Predicate__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group_3__1_in_rule__Predicate__Group_3__05441);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2626:1: rule__Predicate__Group_3__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__Predicate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2630:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2631:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2631:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2632:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPrimaryExprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__Predicate__Group_3__0__Impl5468);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2643:1: rule__Predicate__Group_3__1 : rule__Predicate__Group_3__1__Impl ;
    public final void rule__Predicate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2647:1: ( rule__Predicate__Group_3__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2648:2: rule__Predicate__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3__1__Impl_in_rule__Predicate__Group_3__15497);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2654:1: rule__Predicate__Group_3__1__Impl : ( ( rule__Predicate__Group_3_1__0 )* ) ;
    public final void rule__Predicate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2658:1: ( ( ( rule__Predicate__Group_3_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2659:1: ( ( rule__Predicate__Group_3_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2659:1: ( ( rule__Predicate__Group_3_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2660:1: ( rule__Predicate__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getGroup_3_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2661:1: ( rule__Predicate__Group_3_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==8) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2661:2: rule__Predicate__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Predicate__Group_3_1__0_in_rule__Predicate__Group_3__1__Impl5524);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2675:1: rule__Predicate__Group_3_1__0 : rule__Predicate__Group_3_1__0__Impl rule__Predicate__Group_3_1__1 ;
    public final void rule__Predicate__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2679:1: ( rule__Predicate__Group_3_1__0__Impl rule__Predicate__Group_3_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2680:2: rule__Predicate__Group_3_1__0__Impl rule__Predicate__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3_1__0__Impl_in_rule__Predicate__Group_3_1__05559);
            rule__Predicate__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group_3_1__1_in_rule__Predicate__Group_3_1__05562);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2687:1: rule__Predicate__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Predicate__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2691:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2692:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2692:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2693:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,8,FOLLOW_8_in_rule__Predicate__Group_3_1__0__Impl5590); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2706:1: rule__Predicate__Group_3_1__1 : rule__Predicate__Group_3_1__1__Impl ;
    public final void rule__Predicate__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2710:1: ( rule__Predicate__Group_3_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2711:2: rule__Predicate__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3_1__1__Impl_in_rule__Predicate__Group_3_1__15621);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2717:1: rule__Predicate__Group_3_1__1__Impl : ( rulePrimaryExpr ) ;
    public final void rule__Predicate__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2721:1: ( ( rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2722:1: ( rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2722:1: ( rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2723:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPrimaryExprParserRuleCall_3_1_1()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_rule__Predicate__Group_3_1__1__Impl5648);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2738:1: rule__PrimaryExpr__Group__0 : rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 ;
    public final void rule__PrimaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2742:1: ( rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2743:2: rule__PrimaryExpr__Group__0__Impl rule__PrimaryExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__0__Impl_in_rule__PrimaryExpr__Group__05681);
            rule__PrimaryExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__1_in_rule__PrimaryExpr__Group__05684);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2750:1: rule__PrimaryExpr__Group__0__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__PrimaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2754:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2755:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2755:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2756:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2757:1: ( RULE_WSP )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_WSP) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2757:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group__0__Impl5712); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2767:1: rule__PrimaryExpr__Group__1 : rule__PrimaryExpr__Group__1__Impl rule__PrimaryExpr__Group__2 ;
    public final void rule__PrimaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2771:1: ( rule__PrimaryExpr__Group__1__Impl rule__PrimaryExpr__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2772:2: rule__PrimaryExpr__Group__1__Impl rule__PrimaryExpr__Group__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__1__Impl_in_rule__PrimaryExpr__Group__15743);
            rule__PrimaryExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__2_in_rule__PrimaryExpr__Group__15746);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2779:1: rule__PrimaryExpr__Group__1__Impl : ( ( rule__PrimaryExpr__Alternatives_1 ) ) ;
    public final void rule__PrimaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2783:1: ( ( ( rule__PrimaryExpr__Alternatives_1 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2784:1: ( ( rule__PrimaryExpr__Alternatives_1 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2784:1: ( ( rule__PrimaryExpr__Alternatives_1 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2785:1: ( rule__PrimaryExpr__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getAlternatives_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2786:1: ( rule__PrimaryExpr__Alternatives_1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2786:2: rule__PrimaryExpr__Alternatives_1
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Alternatives_1_in_rule__PrimaryExpr__Group__1__Impl5773);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2796:1: rule__PrimaryExpr__Group__2 : rule__PrimaryExpr__Group__2__Impl ;
    public final void rule__PrimaryExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2800:1: ( rule__PrimaryExpr__Group__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2801:2: rule__PrimaryExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group__2__Impl_in_rule__PrimaryExpr__Group__25803);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2807:1: rule__PrimaryExpr__Group__2__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__PrimaryExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2811:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2812:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2812:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2813:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2814:1: ( RULE_WSP )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WSP) ) {
                    int LA32_2 = input.LA(2);

                    if ( (synpred70_InternalRQL()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2814:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group__2__Impl5831); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2830:1: rule__PrimaryExpr__Group_1_0__0 : rule__PrimaryExpr__Group_1_0__0__Impl rule__PrimaryExpr__Group_1_0__1 ;
    public final void rule__PrimaryExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2834:1: ( rule__PrimaryExpr__Group_1_0__0__Impl rule__PrimaryExpr__Group_1_0__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2835:2: rule__PrimaryExpr__Group_1_0__0__Impl rule__PrimaryExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__0__Impl_in_rule__PrimaryExpr__Group_1_0__05868);
            rule__PrimaryExpr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__1_in_rule__PrimaryExpr__Group_1_0__05871);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2842:1: rule__PrimaryExpr__Group_1_0__0__Impl : ( ruleConstFuncTbl ) ;
    public final void rule__PrimaryExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2846:1: ( ( ruleConstFuncTbl ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2847:1: ( ruleConstFuncTbl )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2847:1: ( ruleConstFuncTbl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2848:1: ruleConstFuncTbl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getConstFuncTblParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleConstFuncTbl_in_rule__PrimaryExpr__Group_1_0__0__Impl5898);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2859:1: rule__PrimaryExpr__Group_1_0__1 : rule__PrimaryExpr__Group_1_0__1__Impl rule__PrimaryExpr__Group_1_0__2 ;
    public final void rule__PrimaryExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2863:1: ( rule__PrimaryExpr__Group_1_0__1__Impl rule__PrimaryExpr__Group_1_0__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2864:2: rule__PrimaryExpr__Group_1_0__1__Impl rule__PrimaryExpr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__1__Impl_in_rule__PrimaryExpr__Group_1_0__15927);
            rule__PrimaryExpr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__2_in_rule__PrimaryExpr__Group_1_0__15930);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2871:1: rule__PrimaryExpr__Group_1_0__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__PrimaryExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2875:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2876:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2876:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2877:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_1_0_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2878:1: ( RULE_WSP )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WSP) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2878:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group_1_0__1__Impl5958); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2888:1: rule__PrimaryExpr__Group_1_0__2 : rule__PrimaryExpr__Group_1_0__2__Impl rule__PrimaryExpr__Group_1_0__3 ;
    public final void rule__PrimaryExpr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2892:1: ( rule__PrimaryExpr__Group_1_0__2__Impl rule__PrimaryExpr__Group_1_0__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2893:2: rule__PrimaryExpr__Group_1_0__2__Impl rule__PrimaryExpr__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__2__Impl_in_rule__PrimaryExpr__Group_1_0__25989);
            rule__PrimaryExpr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__3_in_rule__PrimaryExpr__Group_1_0__25992);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2900:1: rule__PrimaryExpr__Group_1_0__2__Impl : ( '(' ) ;
    public final void rule__PrimaryExpr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2904:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2905:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2905:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2906:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_1_0_2()); 
            }
            match(input,60,FOLLOW_60_in_rule__PrimaryExpr__Group_1_0__2__Impl6020); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2919:1: rule__PrimaryExpr__Group_1_0__3 : rule__PrimaryExpr__Group_1_0__3__Impl rule__PrimaryExpr__Group_1_0__4 ;
    public final void rule__PrimaryExpr__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2923:1: ( rule__PrimaryExpr__Group_1_0__3__Impl rule__PrimaryExpr__Group_1_0__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2924:2: rule__PrimaryExpr__Group_1_0__3__Impl rule__PrimaryExpr__Group_1_0__4
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__3__Impl_in_rule__PrimaryExpr__Group_1_0__36051);
            rule__PrimaryExpr__Group_1_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__4_in_rule__PrimaryExpr__Group_1_0__36054);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2931:1: rule__PrimaryExpr__Group_1_0__3__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__PrimaryExpr__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2935:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2936:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2936:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2937:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_1_0_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2938:1: ( RULE_WSP )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_WSP) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2938:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group_1_0__3__Impl6082); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2948:1: rule__PrimaryExpr__Group_1_0__4 : rule__PrimaryExpr__Group_1_0__4__Impl ;
    public final void rule__PrimaryExpr__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2952:1: ( rule__PrimaryExpr__Group_1_0__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2953:2: rule__PrimaryExpr__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpr__Group_1_0__4__Impl_in_rule__PrimaryExpr__Group_1_0__46113);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2959:1: rule__PrimaryExpr__Group_1_0__4__Impl : ( ')' ) ;
    public final void rule__PrimaryExpr__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2963:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2964:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2964:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2965:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_1_0_4()); 
            }
            match(input,61,FOLLOW_61_in_rule__PrimaryExpr__Group_1_0__4__Impl6141); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2988:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2992:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2993:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__06182);
            rule__Array__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__06185);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3000:1: rule__Array__Group__0__Impl : ( '(' ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3004:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3005:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3005:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3006:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,60,FOLLOW_60_in_rule__Array__Group__0__Impl6213); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3019:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3023:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3024:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__16244);
            rule__Array__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__16247);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3031:1: rule__Array__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3035:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3036:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3036:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3037:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3038:1: ( RULE_WSP )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_WSP) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3038:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group__1__Impl6275); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3048:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3052:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3053:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__26306);
            rule__Array__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__26309);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3060:1: rule__Array__Group__2__Impl : ( ruleStrval ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3064:1: ( ( ruleStrval ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3065:1: ( ruleStrval )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3065:1: ( ruleStrval )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3066:1: ruleStrval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getStrvalParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_rule__Array__Group__2__Impl6336);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3077:1: rule__Array__Group__3 : rule__Array__Group__3__Impl rule__Array__Group__4 ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3081:1: ( rule__Array__Group__3__Impl rule__Array__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3082:2: rule__Array__Group__3__Impl rule__Array__Group__4
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__36365);
            rule__Array__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__4_in_rule__Array__Group__36368);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3089:1: rule__Array__Group__3__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3093:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3094:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3094:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3095:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3096:1: ( RULE_WSP )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_WSP) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3096:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group__3__Impl6396); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3106:1: rule__Array__Group__4 : rule__Array__Group__4__Impl rule__Array__Group__5 ;
    public final void rule__Array__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3110:1: ( rule__Array__Group__4__Impl rule__Array__Group__5 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3111:2: rule__Array__Group__4__Impl rule__Array__Group__5
            {
            pushFollow(FOLLOW_rule__Array__Group__4__Impl_in_rule__Array__Group__46427);
            rule__Array__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__5_in_rule__Array__Group__46430);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3118:1: rule__Array__Group__4__Impl : ( ( rule__Array__Group_4__0 )* ) ;
    public final void rule__Array__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3122:1: ( ( ( rule__Array__Group_4__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3123:1: ( ( rule__Array__Group_4__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3123:1: ( ( rule__Array__Group_4__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3124:1: ( rule__Array__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup_4()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3125:1: ( rule__Array__Group_4__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==8) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3125:2: rule__Array__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Array__Group_4__0_in_rule__Array__Group__4__Impl6457);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3135:1: rule__Array__Group__5 : rule__Array__Group__5__Impl ;
    public final void rule__Array__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3139:1: ( rule__Array__Group__5__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3140:2: rule__Array__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__5__Impl_in_rule__Array__Group__56488);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3146:1: rule__Array__Group__5__Impl : ( ')' ) ;
    public final void rule__Array__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3150:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3151:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3151:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3152:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,61,FOLLOW_61_in_rule__Array__Group__5__Impl6516); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3177:1: rule__Array__Group_4__0 : rule__Array__Group_4__0__Impl rule__Array__Group_4__1 ;
    public final void rule__Array__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3181:1: ( rule__Array__Group_4__0__Impl rule__Array__Group_4__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3182:2: rule__Array__Group_4__0__Impl rule__Array__Group_4__1
            {
            pushFollow(FOLLOW_rule__Array__Group_4__0__Impl_in_rule__Array__Group_4__06559);
            rule__Array__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group_4__1_in_rule__Array__Group_4__06562);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3189:1: rule__Array__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3193:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3194:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3194:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3195:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getCommaKeyword_4_0()); 
            }
            match(input,8,FOLLOW_8_in_rule__Array__Group_4__0__Impl6590); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3208:1: rule__Array__Group_4__1 : rule__Array__Group_4__1__Impl rule__Array__Group_4__2 ;
    public final void rule__Array__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3212:1: ( rule__Array__Group_4__1__Impl rule__Array__Group_4__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3213:2: rule__Array__Group_4__1__Impl rule__Array__Group_4__2
            {
            pushFollow(FOLLOW_rule__Array__Group_4__1__Impl_in_rule__Array__Group_4__16621);
            rule__Array__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group_4__2_in_rule__Array__Group_4__16624);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3220:1: rule__Array__Group_4__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3224:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3225:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3225:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3226:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3227:1: ( RULE_WSP )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_WSP) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3227:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group_4__1__Impl6652); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3237:1: rule__Array__Group_4__2 : rule__Array__Group_4__2__Impl rule__Array__Group_4__3 ;
    public final void rule__Array__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3241:1: ( rule__Array__Group_4__2__Impl rule__Array__Group_4__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3242:2: rule__Array__Group_4__2__Impl rule__Array__Group_4__3
            {
            pushFollow(FOLLOW_rule__Array__Group_4__2__Impl_in_rule__Array__Group_4__26683);
            rule__Array__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group_4__3_in_rule__Array__Group_4__26686);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3249:1: rule__Array__Group_4__2__Impl : ( ruleStrval ) ;
    public final void rule__Array__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3253:1: ( ( ruleStrval ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3254:1: ( ruleStrval )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3254:1: ( ruleStrval )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3255:1: ruleStrval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getStrvalParserRuleCall_4_2()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_rule__Array__Group_4__2__Impl6713);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3266:1: rule__Array__Group_4__3 : rule__Array__Group_4__3__Impl ;
    public final void rule__Array__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3270:1: ( rule__Array__Group_4__3__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3271:2: rule__Array__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_4__3__Impl_in_rule__Array__Group_4__36742);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3277:1: rule__Array__Group_4__3__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3281:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3282:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3282:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3283:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3284:1: ( RULE_WSP )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_WSP) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3284:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group_4__3__Impl6770); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3302:1: rule__Pct_encoded__Group__0 : rule__Pct_encoded__Group__0__Impl rule__Pct_encoded__Group__1 ;
    public final void rule__Pct_encoded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3306:1: ( rule__Pct_encoded__Group__0__Impl rule__Pct_encoded__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3307:2: rule__Pct_encoded__Group__0__Impl rule__Pct_encoded__Group__1
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__0__Impl_in_rule__Pct_encoded__Group__06809);
            rule__Pct_encoded__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pct_encoded__Group__1_in_rule__Pct_encoded__Group__06812);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3314:1: rule__Pct_encoded__Group__0__Impl : ( '%' ) ;
    public final void rule__Pct_encoded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3318:1: ( ( '%' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3319:1: ( '%' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3319:1: ( '%' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3320:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getPercentSignKeyword_0()); 
            }
            match(input,62,FOLLOW_62_in_rule__Pct_encoded__Group__0__Impl6840); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3333:1: rule__Pct_encoded__Group__1 : rule__Pct_encoded__Group__1__Impl rule__Pct_encoded__Group__2 ;
    public final void rule__Pct_encoded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3337:1: ( rule__Pct_encoded__Group__1__Impl rule__Pct_encoded__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3338:2: rule__Pct_encoded__Group__1__Impl rule__Pct_encoded__Group__2
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__1__Impl_in_rule__Pct_encoded__Group__16871);
            rule__Pct_encoded__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pct_encoded__Group__2_in_rule__Pct_encoded__Group__16874);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3345:1: rule__Pct_encoded__Group__1__Impl : ( RULE_XDIGIT ) ;
    public final void rule__Pct_encoded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3349:1: ( ( RULE_XDIGIT ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3350:1: ( RULE_XDIGIT )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3350:1: ( RULE_XDIGIT )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3351:1: RULE_XDIGIT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_1()); 
            }
            match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__1__Impl6901); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3362:1: rule__Pct_encoded__Group__2 : rule__Pct_encoded__Group__2__Impl ;
    public final void rule__Pct_encoded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3366:1: ( rule__Pct_encoded__Group__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3367:2: rule__Pct_encoded__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__2__Impl_in_rule__Pct_encoded__Group__26930);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3373:1: rule__Pct_encoded__Group__2__Impl : ( RULE_XDIGIT ) ;
    public final void rule__Pct_encoded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3377:1: ( ( RULE_XDIGIT ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3378:1: ( RULE_XDIGIT )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3378:1: ( RULE_XDIGIT )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3379:1: RULE_XDIGIT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_2()); 
            }
            match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__2__Impl6957); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3397:1: rule__Model__OperandsAssignment_0 : ( ruleHoOperand ) ;
    public final void rule__Model__OperandsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3401:1: ( ( ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3402:1: ( ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3402:1: ( ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3403:1: ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getOperandsHoOperandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_rule__Model__OperandsAssignment_06997);
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
        // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1503:3: ( RULE_WSP )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1503:3: RULE_WSP
        {
        match(input,RULE_WSP,FOLLOW_RULE_WSP_in_synpred55_InternalRQL3230); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalRQL

    // $ANTLR start synpred70_InternalRQL
    public final void synpred70_InternalRQL_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2814:3: ( RULE_WSP )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2814:3: RULE_WSP
        {
        match(input,RULE_WSP,FOLLOW_RULE_WSP_in_synpred70_InternalRQL5831); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_InternalRQL

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
    public final boolean synpred70_InternalRQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalRQL_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_rule__Strval__Alternatives_in_ruleStrval1122 = new BitSet(new long[]{0x407FF00000000032L});
    public static final BitSet FOLLOW_rule__Strval__Alternatives_in_ruleStrval1134 = new BitSet(new long[]{0x407FF00000000032L});
    public static final BitSet FOLLOW_ruleLogicalOpAliases_in_entryRuleLogicalOpAliases1164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOpAliases1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LogicalOpAliases__Alternatives_in_ruleLogicalOpAliases1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Model__Alternatives_1_01234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Model__Alternatives_1_01254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Or__Alternatives_01289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Or__Alternatives_01309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHigherOrderCall_in_rule__HoOperand__Alternatives_11343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_rule__HoOperand__Alternatives_11360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__HoOperand__Alternatives_11377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__HoOperand__Alternatives_11394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__0_in_rule__HoOperand__Alternatives_11411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__HoOperand__Alternatives_1_4_21444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_rule__HoOperand__Alternatives_1_4_21461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BinaryOpAliases__Alternatives1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BinaryOpAliases__Alternatives1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BinaryOpAliases__Alternatives1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BinaryOpAliases__Alternatives1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BinaryOpAliases__Alternatives1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BinaryOpAliases__Alternatives1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__BinaryOpAliases__Alternatives1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CompOps__Alternatives1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__CompOps__Alternatives1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__CompOps__Alternatives1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__CompOps__Alternatives1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__CompOps__Alternatives1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__CompOps__Alternatives1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__CompOps__Alternatives1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__CompOps__Alternatives1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__CompOps__Alternatives1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__CompOps__Alternatives1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__CompOps__Alternatives1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__CompOps__Alternatives1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__CompOps__Alternatives1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOpAliases_in_rule__CallOperator__Alternatives_01923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionsTbl_in_rule__CallOperator__Alternatives_01940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PredTbl__Alternatives1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__PredTbl__Alternatives1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PredTbl__Alternatives2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PredTbl__Alternatives2033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__PredTbl__Alternatives2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__0_in_rule__PrimaryExpr__Alternatives_12087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__PrimaryExpr__Alternatives_12105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__PrimaryExpr__Alternatives_12122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__FunctionsTbl__Alternatives2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__FunctionsTbl__Alternatives2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__FunctionsTbl__Alternatives2195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ConstFuncTbl__Alternatives2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ConstFuncTbl__Alternatives2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ConstFuncTbl__Alternatives2270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__ConstFuncTbl__Alternatives2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rule__Nchar__Alternatives2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rule__Nchar__Alternatives2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Nchar__Alternatives2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Nchar__Alternatives2379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Nchar__Alternatives2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Nchar__Alternatives2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Nchar__Alternatives2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Nchar__Alternatives2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Nchar__Alternatives2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Nchar__Alternatives2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Nchar__Alternatives2519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Nchar__Alternatives2539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Nchar__Alternatives2559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNchar_in_rule__Strval__Alternatives2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePct_encoded_in_rule__Strval__Alternatives2610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__LogicalOpAliases__Alternatives2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__LogicalOpAliases__Alternatives2663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__LogicalOpAliases__Alternatives2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02715 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__OperandsAssignment_0_in_rule__Model__Group__0__Impl2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl2802 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__02837 = new BitSet(new long[]{0x5FFFF0FF0007F070L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__02840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_1_0_in_rule__Model__Group_1__0__Impl2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__12897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__Model__Group_1__1__Impl2924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__02957 = new BitSet(new long[]{0x5FFFF0FF0007F070L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__02960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__And__Group__0__Impl2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__13019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__And__Group__1__Impl3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__03079 = new BitSet(new long[]{0x5FFFF0FF0007F070L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__03082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Alternatives_0_in_rule__Or__Group__0__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__13139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__Or__Group__1__Impl3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__0__Impl_in_rule__HoOperand__Group__03199 = new BitSet(new long[]{0x5FFFF0FF0007F070L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__1_in_rule__HoOperand__Group__03202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__HoOperand__Group__0__Impl3230 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__1__Impl_in_rule__HoOperand__Group__13261 = new BitSet(new long[]{0x5FFFF0FF0007F070L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__2_in_rule__HoOperand__Group__13264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Alternatives_1_in_rule__HoOperand__Group__1__Impl3291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__2__Impl_in_rule__HoOperand__Group__23322 = new BitSet(new long[]{0x5FFFF0FF0007F070L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__3_in_rule__HoOperand__Group__23325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__HoOperand__Group__2__Impl3353 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__3__Impl_in_rule__HoOperand__Group__33384 = new BitSet(new long[]{0x5FFFF0FF0007F070L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__4_in_rule__HoOperand__Group__33387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__HoOperand__Group__3__Impl3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group__4__Impl_in_rule__HoOperand__Group__43449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rule__HoOperand__Group__4__Impl3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__0__Impl_in_rule__HoOperand__Group_1_4__03521 = new BitSet(new long[]{0x5FFFF0FF0007F070L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__1_in_rule__HoOperand__Group_1_4__03524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__HoOperand__Group_1_4__0__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__1__Impl_in_rule__HoOperand__Group_1_4__13583 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__2_in_rule__HoOperand__Group_1_4__13586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__HoOperand__Group_1_4__1__Impl3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__2__Impl_in_rule__HoOperand__Group_1_4__23642 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__3_in_rule__HoOperand__Group_1_4__23645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Alternatives_1_4_2_in_rule__HoOperand__Group_1_4__2__Impl3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoOperand__Group_1_4__3__Impl_in_rule__HoOperand__Group_1_4__33702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__HoOperand__Group_1_4__3__Impl3730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__0__Impl_in_rule__HigherOrderCall__Group__03769 = new BitSet(new long[]{0x1000000000000040L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__1_in_rule__HigherOrderCall__Group__03772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOpAliases_in_rule__HigherOrderCall__Group__0__Impl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__1__Impl_in_rule__HigherOrderCall__Group__13828 = new BitSet(new long[]{0x1000000000000040L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__2_in_rule__HigherOrderCall__Group__13831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__HigherOrderCall__Group__1__Impl3859 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__2__Impl_in_rule__HigherOrderCall__Group__23890 = new BitSet(new long[]{0x5FFFF0FF0007F070L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__3_in_rule__HigherOrderCall__Group__23893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__HigherOrderCall__Group__2__Impl3921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__3__Impl_in_rule__HigherOrderCall__Group__33952 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__4_in_rule__HigherOrderCall__Group__33955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3__0_in_rule__HigherOrderCall__Group__3__Impl3982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group__4__Impl_in_rule__HigherOrderCall__Group__44012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__HigherOrderCall__Group__4__Impl4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3__0__Impl_in_rule__HigherOrderCall__Group_3__04081 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3__1_in_rule__HigherOrderCall__Group_3__04084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__HigherOrderCall__Group_3__0__Impl4111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3__1__Impl_in_rule__HigherOrderCall__Group_3__14140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3_1__0_in_rule__HigherOrderCall__Group_3__1__Impl4167 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3_1__0__Impl_in_rule__HigherOrderCall__Group_3_1__04202 = new BitSet(new long[]{0x5FFFF0FF0007F070L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3_1__1_in_rule__HigherOrderCall__Group_3_1__04205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__HigherOrderCall__Group_3_1__0__Impl4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HigherOrderCall__Group_3_1__1__Impl_in_rule__HigherOrderCall__Group_3_1__14264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__HigherOrderCall__Group_3_1__1__Impl4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04324 = new BitSet(new long[]{0x00000000FFF80040L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__Comparison__Group__0__Impl4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14383 = new BitSet(new long[]{0x00000000FFF80040L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__14386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Comparison__Group__1__Impl4414 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__24445 = new BitSet(new long[]{0x507FFF0000000070L});
    public static final BitSet FOLLOW_rule__Comparison__Group__3_in_rule__Comparison__Group__24448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompOps_in_rule__Comparison__Group__2__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__3__Impl_in_rule__Comparison__Group__34504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__Comparison__Group__3__Impl4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__0__Impl_in_rule__CallOperator__Group__04568 = new BitSet(new long[]{0x1000000000000040L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__1_in_rule__CallOperator__Group__04571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Alternatives_0_in_rule__CallOperator__Group__0__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__1__Impl_in_rule__CallOperator__Group__14628 = new BitSet(new long[]{0x1000000000000040L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__2_in_rule__CallOperator__Group__14631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__CallOperator__Group__1__Impl4659 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__2__Impl_in_rule__CallOperator__Group__24690 = new BitSet(new long[]{0x707FFF0000000070L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__3_in_rule__CallOperator__Group__24693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__CallOperator__Group__2__Impl4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__3__Impl_in_rule__CallOperator__Group__34752 = new BitSet(new long[]{0x707FFF0000000070L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__4_in_rule__CallOperator__Group__34755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3__0_in_rule__CallOperator__Group__3__Impl4782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group__4__Impl_in_rule__CallOperator__Group__44813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__CallOperator__Group__4__Impl4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3__0__Impl_in_rule__CallOperator__Group_3__04882 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3__1_in_rule__CallOperator__Group_3__04885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__CallOperator__Group_3__0__Impl4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3__1__Impl_in_rule__CallOperator__Group_3__14941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3_1__0_in_rule__CallOperator__Group_3__1__Impl4968 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3_1__0__Impl_in_rule__CallOperator__Group_3_1__05003 = new BitSet(new long[]{0x507FFF0000000070L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3_1__1_in_rule__CallOperator__Group_3_1__05006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__CallOperator__Group_3_1__0__Impl5034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CallOperator__Group_3_1__1__Impl_in_rule__CallOperator__Group_3_1__15065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__CallOperator__Group_3_1__1__Impl5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__05125 = new BitSet(new long[]{0x1000000000000040L});
    public static final BitSet FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__05128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredTbl_in_rule__Predicate__Group__0__Impl5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__15184 = new BitSet(new long[]{0x1000000000000040L});
    public static final BitSet FOLLOW_rule__Predicate__Group__2_in_rule__Predicate__Group__15187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Predicate__Group__1__Impl5215 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Predicate__Group__2__Impl_in_rule__Predicate__Group__25246 = new BitSet(new long[]{0x707FFF0000000070L});
    public static final BitSet FOLLOW_rule__Predicate__Group__3_in_rule__Predicate__Group__25249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Predicate__Group__2__Impl5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__3__Impl_in_rule__Predicate__Group__35308 = new BitSet(new long[]{0x707FFF0000000070L});
    public static final BitSet FOLLOW_rule__Predicate__Group__4_in_rule__Predicate__Group__35311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__0_in_rule__Predicate__Group__3__Impl5338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__4__Impl_in_rule__Predicate__Group__45369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Predicate__Group__4__Impl5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__0__Impl_in_rule__Predicate__Group_3__05438 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__1_in_rule__Predicate__Group_3__05441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__Predicate__Group_3__0__Impl5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__1__Impl_in_rule__Predicate__Group_3__15497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__0_in_rule__Predicate__Group_3__1__Impl5524 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__0__Impl_in_rule__Predicate__Group_3_1__05559 = new BitSet(new long[]{0x507FFF0000000070L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__1_in_rule__Predicate__Group_3_1__05562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Predicate__Group_3_1__0__Impl5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__1__Impl_in_rule__Predicate__Group_3_1__15621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rule__Predicate__Group_3_1__1__Impl5648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__0__Impl_in_rule__PrimaryExpr__Group__05681 = new BitSet(new long[]{0x507FFF0000000070L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__1_in_rule__PrimaryExpr__Group__05684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group__0__Impl5712 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__1__Impl_in_rule__PrimaryExpr__Group__15743 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__2_in_rule__PrimaryExpr__Group__15746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Alternatives_1_in_rule__PrimaryExpr__Group__1__Impl5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group__2__Impl_in_rule__PrimaryExpr__Group__25803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group__2__Impl5831 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__0__Impl_in_rule__PrimaryExpr__Group_1_0__05868 = new BitSet(new long[]{0x1000000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__1_in_rule__PrimaryExpr__Group_1_0__05871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstFuncTbl_in_rule__PrimaryExpr__Group_1_0__0__Impl5898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__1__Impl_in_rule__PrimaryExpr__Group_1_0__15927 = new BitSet(new long[]{0x1000000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__2_in_rule__PrimaryExpr__Group_1_0__15930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group_1_0__1__Impl5958 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__2__Impl_in_rule__PrimaryExpr__Group_1_0__25989 = new BitSet(new long[]{0x2000000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__3_in_rule__PrimaryExpr__Group_1_0__25992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__PrimaryExpr__Group_1_0__2__Impl6020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__3__Impl_in_rule__PrimaryExpr__Group_1_0__36051 = new BitSet(new long[]{0x2000000000000040L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__4_in_rule__PrimaryExpr__Group_1_0__36054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__PrimaryExpr__Group_1_0__3__Impl6082 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__PrimaryExpr__Group_1_0__4__Impl_in_rule__PrimaryExpr__Group_1_0__46113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__PrimaryExpr__Group_1_0__4__Impl6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__06182 = new BitSet(new long[]{0x407FF00000000070L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__06185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_rule__Array__Group__0__Impl6213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__16244 = new BitSet(new long[]{0x407FF00000000070L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__16247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group__1__Impl6275 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__26306 = new BitSet(new long[]{0x2000000000000140L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__26309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__Array__Group__2__Impl6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__36365 = new BitSet(new long[]{0x2000000000000140L});
    public static final BitSet FOLLOW_rule__Array__Group__4_in_rule__Array__Group__36368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group__3__Impl6396 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Array__Group__4__Impl_in_rule__Array__Group__46427 = new BitSet(new long[]{0x2000000000000140L});
    public static final BitSet FOLLOW_rule__Array__Group__5_in_rule__Array__Group__46430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__0_in_rule__Array__Group__4__Impl6457 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Array__Group__5__Impl_in_rule__Array__Group__56488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_rule__Array__Group__5__Impl6516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__0__Impl_in_rule__Array__Group_4__06559 = new BitSet(new long[]{0x407FF00000000070L});
    public static final BitSet FOLLOW_rule__Array__Group_4__1_in_rule__Array__Group_4__06562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Array__Group_4__0__Impl6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__1__Impl_in_rule__Array__Group_4__16621 = new BitSet(new long[]{0x407FF00000000070L});
    public static final BitSet FOLLOW_rule__Array__Group_4__2_in_rule__Array__Group_4__16624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group_4__1__Impl6652 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Array__Group_4__2__Impl_in_rule__Array__Group_4__26683 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Array__Group_4__3_in_rule__Array__Group_4__26686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__Array__Group_4__2__Impl6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__3__Impl_in_rule__Array__Group_4__36742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group_4__3__Impl6770 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__0__Impl_in_rule__Pct_encoded__Group__06809 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__1_in_rule__Pct_encoded__Group__06812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_rule__Pct_encoded__Group__0__Impl6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__1__Impl_in_rule__Pct_encoded__Group__16871 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__2_in_rule__Pct_encoded__Group__16874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__1__Impl6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__2__Impl_in_rule__Pct_encoded__Group__26930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__2__Impl6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_rule__Model__OperandsAssignment_06997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_synpred55_InternalRQL3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_synpred70_InternalRQL5831 = new BitSet(new long[]{0x0000000000000002L});

}