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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ALPHA", "RULE_DIGIT", "RULE_WSP", "RULE_XDIGIT", "','", "'&'", "';'", "'|'", "'or'", "'and'", "'not'", "'ne'", "'eq'", "'lt'", "'le'", "'gt'", "'ge'", "'like'", "'!='", "'='", "'<'", "'<='", "'>'", "'>='", "'select'", "'sort'", "'limit'", "'implementing'", "'composing'", "'isnull'", "'in'", "'out'", "'true'", "'false'", "'empty'", "'null'", "'-'", "'.'", "'_'", "'~'", "'$'", "':'", "'*'", "'+'", "'?'", "'/'", "'@'", "'('", "')'", "'%'", "'\"'"
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
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__10=10;
    public static final int T__54=54;
    public static final int T__9=9;
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


    // $ANTLR start "entryRuleHo_operand"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:145:1: entryRuleHo_operand : ruleHo_operand EOF ;
    public final void entryRuleHo_operand() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:146:1: ( ruleHo_operand EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:147:1: ruleHo_operand EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHo_operandRule()); 
            }
            pushFollow(FOLLOW_ruleHo_operand_in_entryRuleHo_operand247);
            ruleHo_operand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHo_operandRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHo_operand254); if (state.failed) return ;

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
    // $ANTLR end "entryRuleHo_operand"


    // $ANTLR start "ruleHo_operand"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:154:1: ruleHo_operand : ( ( rule__Ho_operand__Group__0 ) ) ;
    public final void ruleHo_operand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:158:2: ( ( ( rule__Ho_operand__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:159:1: ( ( rule__Ho_operand__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:159:1: ( ( rule__Ho_operand__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:160:1: ( rule__Ho_operand__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHo_operandAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:161:1: ( rule__Ho_operand__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:161:2: rule__Ho_operand__Group__0
            {
            pushFollow(FOLLOW_rule__Ho_operand__Group__0_in_ruleHo_operand280);
            rule__Ho_operand__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHo_operandAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHo_operand"


    // $ANTLR start "entryRuleLogical_op_aliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:173:1: entryRuleLogical_op_aliases : ruleLogical_op_aliases EOF ;
    public final void entryRuleLogical_op_aliases() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:174:1: ( ruleLogical_op_aliases EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:175:1: ruleLogical_op_aliases EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogical_op_aliasesRule()); 
            }
            pushFollow(FOLLOW_ruleLogical_op_aliases_in_entryRuleLogical_op_aliases307);
            ruleLogical_op_aliases();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogical_op_aliasesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogical_op_aliases314); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLogical_op_aliases"


    // $ANTLR start "ruleLogical_op_aliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:182:1: ruleLogical_op_aliases : ( ( rule__Logical_op_aliases__Alternatives ) ) ;
    public final void ruleLogical_op_aliases() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:186:2: ( ( ( rule__Logical_op_aliases__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:187:1: ( ( rule__Logical_op_aliases__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:187:1: ( ( rule__Logical_op_aliases__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:188:1: ( rule__Logical_op_aliases__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogical_op_aliasesAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:189:1: ( rule__Logical_op_aliases__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:189:2: rule__Logical_op_aliases__Alternatives
            {
            pushFollow(FOLLOW_rule__Logical_op_aliases__Alternatives_in_ruleLogical_op_aliases340);
            rule__Logical_op_aliases__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogical_op_aliasesAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogical_op_aliases"


    // $ANTLR start "entryRuleHigher_order_call"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:201:1: entryRuleHigher_order_call : ruleHigher_order_call EOF ;
    public final void entryRuleHigher_order_call() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:202:1: ( ruleHigher_order_call EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:203:1: ruleHigher_order_call EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigher_order_callRule()); 
            }
            pushFollow(FOLLOW_ruleHigher_order_call_in_entryRuleHigher_order_call367);
            ruleHigher_order_call();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigher_order_callRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHigher_order_call374); if (state.failed) return ;

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
    // $ANTLR end "entryRuleHigher_order_call"


    // $ANTLR start "ruleHigher_order_call"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:210:1: ruleHigher_order_call : ( ( rule__Higher_order_call__Group__0 ) ) ;
    public final void ruleHigher_order_call() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:214:2: ( ( ( rule__Higher_order_call__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:215:1: ( ( rule__Higher_order_call__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:215:1: ( ( rule__Higher_order_call__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:216:1: ( rule__Higher_order_call__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigher_order_callAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:217:1: ( rule__Higher_order_call__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:217:2: rule__Higher_order_call__Group__0
            {
            pushFollow(FOLLOW_rule__Higher_order_call__Group__0_in_ruleHigher_order_call400);
            rule__Higher_order_call__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigher_order_callAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHigher_order_call"


    // $ANTLR start "entryRuleBinary_op_aliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:229:1: entryRuleBinary_op_aliases : ruleBinary_op_aliases EOF ;
    public final void entryRuleBinary_op_aliases() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:230:1: ( ruleBinary_op_aliases EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:231:1: ruleBinary_op_aliases EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinary_op_aliasesRule()); 
            }
            pushFollow(FOLLOW_ruleBinary_op_aliases_in_entryRuleBinary_op_aliases427);
            ruleBinary_op_aliases();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinary_op_aliasesRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinary_op_aliases434); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBinary_op_aliases"


    // $ANTLR start "ruleBinary_op_aliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:238:1: ruleBinary_op_aliases : ( ( rule__Binary_op_aliases__Alternatives ) ) ;
    public final void ruleBinary_op_aliases() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:242:2: ( ( ( rule__Binary_op_aliases__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:243:1: ( ( rule__Binary_op_aliases__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:243:1: ( ( rule__Binary_op_aliases__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:244:1: ( rule__Binary_op_aliases__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBinary_op_aliasesAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:245:1: ( rule__Binary_op_aliases__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:245:2: rule__Binary_op_aliases__Alternatives
            {
            pushFollow(FOLLOW_rule__Binary_op_aliases__Alternatives_in_ruleBinary_op_aliases460);
            rule__Binary_op_aliases__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBinary_op_aliasesAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinary_op_aliases"


    // $ANTLR start "entryRuleComp_ops"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:257:1: entryRuleComp_ops : ruleComp_ops EOF ;
    public final void entryRuleComp_ops() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:258:1: ( ruleComp_ops EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:259:1: ruleComp_ops EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComp_opsRule()); 
            }
            pushFollow(FOLLOW_ruleComp_ops_in_entryRuleComp_ops487);
            ruleComp_ops();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComp_opsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComp_ops494); if (state.failed) return ;

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
    // $ANTLR end "entryRuleComp_ops"


    // $ANTLR start "ruleComp_ops"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:266:1: ruleComp_ops : ( ( rule__Comp_ops__Alternatives ) ) ;
    public final void ruleComp_ops() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:270:2: ( ( ( rule__Comp_ops__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:271:1: ( ( rule__Comp_ops__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:271:1: ( ( rule__Comp_ops__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:272:1: ( rule__Comp_ops__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComp_opsAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:273:1: ( rule__Comp_ops__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:273:2: rule__Comp_ops__Alternatives
            {
            pushFollow(FOLLOW_rule__Comp_ops__Alternatives_in_ruleComp_ops520);
            rule__Comp_ops__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComp_opsAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComp_ops"


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


    // $ANTLR start "entryRuleCall_operator"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:313:1: entryRuleCall_operator : ruleCall_operator EOF ;
    public final void entryRuleCall_operator() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:314:1: ( ruleCall_operator EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:315:1: ruleCall_operator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCall_operatorRule()); 
            }
            pushFollow(FOLLOW_ruleCall_operator_in_entryRuleCall_operator607);
            ruleCall_operator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCall_operatorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall_operator614); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCall_operator"


    // $ANTLR start "ruleCall_operator"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:322:1: ruleCall_operator : ( ( rule__Call_operator__Group__0 ) ) ;
    public final void ruleCall_operator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:326:2: ( ( ( rule__Call_operator__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:327:1: ( ( rule__Call_operator__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:327:1: ( ( rule__Call_operator__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:328:1: ( rule__Call_operator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCall_operatorAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:329:1: ( rule__Call_operator__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:329:2: rule__Call_operator__Group__0
            {
            pushFollow(FOLLOW_rule__Call_operator__Group__0_in_ruleCall_operator640);
            rule__Call_operator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCall_operatorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCall_operator"


    // $ANTLR start "entryRulePred_tbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:341:1: entryRulePred_tbl : rulePred_tbl EOF ;
    public final void entryRulePred_tbl() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:342:1: ( rulePred_tbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:343:1: rulePred_tbl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPred_tblRule()); 
            }
            pushFollow(FOLLOW_rulePred_tbl_in_entryRulePred_tbl667);
            rulePred_tbl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPred_tblRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePred_tbl674); if (state.failed) return ;

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
    // $ANTLR end "entryRulePred_tbl"


    // $ANTLR start "rulePred_tbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:350:1: rulePred_tbl : ( ( rule__Pred_tbl__Alternatives ) ) ;
    public final void rulePred_tbl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:354:2: ( ( ( rule__Pred_tbl__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:355:1: ( ( rule__Pred_tbl__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:355:1: ( ( rule__Pred_tbl__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:356:1: ( rule__Pred_tbl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPred_tblAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:357:1: ( rule__Pred_tbl__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:357:2: rule__Pred_tbl__Alternatives
            {
            pushFollow(FOLLOW_rule__Pred_tbl__Alternatives_in_rulePred_tbl700);
            rule__Pred_tbl__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPred_tblAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePred_tbl"


    // $ANTLR start "entryRulePredicate"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:369:1: entryRulePredicate : rulePredicate EOF ;
    public final void entryRulePredicate() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:370:1: ( rulePredicate EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:371:1: rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate727);
            rulePredicate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate734); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:378:1: rulePredicate : ( ( rule__Predicate__Group__0 ) ) ;
    public final void rulePredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:382:2: ( ( ( rule__Predicate__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:383:1: ( ( rule__Predicate__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:383:1: ( ( rule__Predicate__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:384:1: ( rule__Predicate__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:385:1: ( rule__Predicate__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:385:2: rule__Predicate__Group__0
            {
            pushFollow(FOLLOW_rule__Predicate__Group__0_in_rulePredicate760);
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


    // $ANTLR start "entryRulePrimary_expr"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:397:1: entryRulePrimary_expr : rulePrimary_expr EOF ;
    public final void entryRulePrimary_expr() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:398:1: ( rulePrimary_expr EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:399:1: rulePrimary_expr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimary_exprRule()); 
            }
            pushFollow(FOLLOW_rulePrimary_expr_in_entryRulePrimary_expr787);
            rulePrimary_expr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimary_exprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary_expr794); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimary_expr"


    // $ANTLR start "rulePrimary_expr"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:406:1: rulePrimary_expr : ( ( rule__Primary_expr__Group__0 ) ) ;
    public final void rulePrimary_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:410:2: ( ( ( rule__Primary_expr__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:411:1: ( ( rule__Primary_expr__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:411:1: ( ( rule__Primary_expr__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:412:1: ( rule__Primary_expr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimary_exprAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:413:1: ( rule__Primary_expr__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:413:2: rule__Primary_expr__Group__0
            {
            pushFollow(FOLLOW_rule__Primary_expr__Group__0_in_rulePrimary_expr820);
            rule__Primary_expr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimary_exprAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary_expr"


    // $ANTLR start "entryRuleFunctions_tbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:425:1: entryRuleFunctions_tbl : ruleFunctions_tbl EOF ;
    public final void entryRuleFunctions_tbl() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:426:1: ( ruleFunctions_tbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:427:1: ruleFunctions_tbl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctions_tblRule()); 
            }
            pushFollow(FOLLOW_ruleFunctions_tbl_in_entryRuleFunctions_tbl847);
            ruleFunctions_tbl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctions_tblRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctions_tbl854); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFunctions_tbl"


    // $ANTLR start "ruleFunctions_tbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:434:1: ruleFunctions_tbl : ( ( rule__Functions_tbl__Alternatives ) ) ;
    public final void ruleFunctions_tbl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:438:2: ( ( ( rule__Functions_tbl__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:439:1: ( ( rule__Functions_tbl__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:439:1: ( ( rule__Functions_tbl__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:440:1: ( rule__Functions_tbl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFunctions_tblAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:441:1: ( rule__Functions_tbl__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:441:2: rule__Functions_tbl__Alternatives
            {
            pushFollow(FOLLOW_rule__Functions_tbl__Alternatives_in_ruleFunctions_tbl880);
            rule__Functions_tbl__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFunctions_tblAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFunctions_tbl"


    // $ANTLR start "entryRuleConst_func_tbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:453:1: entryRuleConst_func_tbl : ruleConst_func_tbl EOF ;
    public final void entryRuleConst_func_tbl() throws RecognitionException {
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:454:1: ( ruleConst_func_tbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:455:1: ruleConst_func_tbl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_func_tblRule()); 
            }
            pushFollow(FOLLOW_ruleConst_func_tbl_in_entryRuleConst_func_tbl907);
            ruleConst_func_tbl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_func_tblRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConst_func_tbl914); if (state.failed) return ;

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
    // $ANTLR end "entryRuleConst_func_tbl"


    // $ANTLR start "ruleConst_func_tbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:462:1: ruleConst_func_tbl : ( ( rule__Const_func_tbl__Alternatives ) ) ;
    public final void ruleConst_func_tbl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:466:2: ( ( ( rule__Const_func_tbl__Alternatives ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:467:1: ( ( rule__Const_func_tbl__Alternatives ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:467:1: ( ( rule__Const_func_tbl__Alternatives ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:468:1: ( rule__Const_func_tbl__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConst_func_tblAccess().getAlternatives()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:469:1: ( rule__Const_func_tbl__Alternatives )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:469:2: rule__Const_func_tbl__Alternatives
            {
            pushFollow(FOLLOW_rule__Const_func_tbl__Alternatives_in_ruleConst_func_tbl940);
            rule__Const_func_tbl__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConst_func_tblAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConst_func_tbl"


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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:574:1: ruleStrval : ( ( rule__Strval__Group__0 ) ) ;
    public final void ruleStrval() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:578:2: ( ( ( rule__Strval__Group__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:579:1: ( ( rule__Strval__Group__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:579:1: ( ( rule__Strval__Group__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:580:1: ( rule__Strval__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrvalAccess().getGroup()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:581:1: ( rule__Strval__Group__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:581:2: rule__Strval__Group__0
            {
            pushFollow(FOLLOW_rule__Strval__Group__0_in_ruleStrval1180);
            rule__Strval__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrvalAccess().getGroup()); 
            }

            }


            }

        }
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:593:1: rule__Model__Alternatives_1_0 : ( ( ',' ) | ( '&' ) );
    public final void rule__Model__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:597:1: ( ( ',' ) | ( '&' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==8) ) {
                alt1=1;
            }
            else if ( (LA1_0==9) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:598:1: ( ',' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:598:1: ( ',' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:599:1: ','
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getCommaKeyword_1_0_0()); 
                    }
                    match(input,8,FOLLOW_8_in_rule__Model__Alternatives_1_01217); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getModelAccess().getCommaKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:606:6: ( '&' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:606:6: ( '&' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:607:1: '&'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getModelAccess().getAmpersandKeyword_1_0_1()); 
                    }
                    match(input,9,FOLLOW_9_in_rule__Model__Alternatives_1_01237); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:619:1: rule__Or__Alternatives_0 : ( ( ';' ) | ( '|' ) );
    public final void rule__Or__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:623:1: ( ( ';' ) | ( '|' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:624:1: ( ';' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:624:1: ( ';' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:625:1: ';'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getSemicolonKeyword_0_0()); 
                    }
                    match(input,10,FOLLOW_10_in_rule__Or__Alternatives_01272); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOrAccess().getSemicolonKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:632:6: ( '|' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:632:6: ( '|' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:633:1: '|'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOrAccess().getVerticalLineKeyword_0_1()); 
                    }
                    match(input,11,FOLLOW_11_in_rule__Or__Alternatives_01292); if (state.failed) return ;
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


    // $ANTLR start "rule__Ho_operand__Alternatives_1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:645:1: rule__Ho_operand__Alternatives_1 : ( ( ruleHigher_order_call ) | ( ruleCall_operator ) | ( rulePredicate ) | ( ruleComparison ) | ( ( rule__Ho_operand__Group_1_4__0 ) ) );
    public final void rule__Ho_operand__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:649:1: ( ( ruleHigher_order_call ) | ( ruleCall_operator ) | ( rulePredicate ) | ( ruleComparison ) | ( ( rule__Ho_operand__Group_1_4__0 ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 33:
            case 34:
            case 35:
                {
                alt3=2;
                }
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                {
                alt3=3;
                }
                break;
            case 54:
                {
                alt3=4;
                }
                break;
            case 51:
                {
                alt3=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:650:1: ( ruleHigher_order_call )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:650:1: ( ruleHigher_order_call )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:651:1: ruleHigher_order_call
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHo_operandAccess().getHigher_order_callParserRuleCall_1_0()); 
                    }
                    pushFollow(FOLLOW_ruleHigher_order_call_in_rule__Ho_operand__Alternatives_11326);
                    ruleHigher_order_call();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHo_operandAccess().getHigher_order_callParserRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:656:6: ( ruleCall_operator )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:656:6: ( ruleCall_operator )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:657:1: ruleCall_operator
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHo_operandAccess().getCall_operatorParserRuleCall_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleCall_operator_in_rule__Ho_operand__Alternatives_11343);
                    ruleCall_operator();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHo_operandAccess().getCall_operatorParserRuleCall_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:662:6: ( rulePredicate )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:662:6: ( rulePredicate )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:663:1: rulePredicate
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHo_operandAccess().getPredicateParserRuleCall_1_2()); 
                    }
                    pushFollow(FOLLOW_rulePredicate_in_rule__Ho_operand__Alternatives_11360);
                    rulePredicate();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHo_operandAccess().getPredicateParserRuleCall_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:668:6: ( ruleComparison )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:668:6: ( ruleComparison )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:669:1: ruleComparison
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHo_operandAccess().getComparisonParserRuleCall_1_3()); 
                    }
                    pushFollow(FOLLOW_ruleComparison_in_rule__Ho_operand__Alternatives_11377);
                    ruleComparison();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHo_operandAccess().getComparisonParserRuleCall_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:674:6: ( ( rule__Ho_operand__Group_1_4__0 ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:674:6: ( ( rule__Ho_operand__Group_1_4__0 ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:675:1: ( rule__Ho_operand__Group_1_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHo_operandAccess().getGroup_1_4()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:676:1: ( rule__Ho_operand__Group_1_4__0 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:676:2: rule__Ho_operand__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__Ho_operand__Group_1_4__0_in_rule__Ho_operand__Alternatives_11394);
                    rule__Ho_operand__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHo_operandAccess().getGroup_1_4()); 
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
    // $ANTLR end "rule__Ho_operand__Alternatives_1"


    // $ANTLR start "rule__Ho_operand__Alternatives_1_4_2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:685:1: rule__Ho_operand__Alternatives_1_4_2 : ( ( ( ( ruleAnd ) ) ( ( ruleAnd )* ) ) | ( ( ( ruleOr ) ) ( ( ruleOr )* ) ) );
    public final void rule__Ho_operand__Alternatives_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:689:1: ( ( ( ( ruleAnd ) ) ( ( ruleAnd )* ) ) | ( ( ( ruleOr ) ) ( ( ruleOr )* ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==9) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=10 && LA6_0<=11)) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:690:1: ( ( ( ruleAnd ) ) ( ( ruleAnd )* ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:690:1: ( ( ( ruleAnd ) ) ( ( ruleAnd )* ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:691:1: ( ( ruleAnd ) ) ( ( ruleAnd )* )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:691:1: ( ( ruleAnd ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:692:1: ( ruleAnd )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHo_operandAccess().getAndParserRuleCall_1_4_2_0()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:693:1: ( ruleAnd )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:693:3: ruleAnd
                    {
                    pushFollow(FOLLOW_ruleAnd_in_rule__Ho_operand__Alternatives_1_4_21430);
                    ruleAnd();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHo_operandAccess().getAndParserRuleCall_1_4_2_0()); 
                    }

                    }

                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:696:1: ( ( ruleAnd )* )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:697:1: ( ruleAnd )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHo_operandAccess().getAndParserRuleCall_1_4_2_0()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:698:1: ( ruleAnd )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==9) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:698:3: ruleAnd
                    	    {
                    	    pushFollow(FOLLOW_ruleAnd_in_rule__Ho_operand__Alternatives_1_4_21443);
                    	    ruleAnd();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHo_operandAccess().getAndParserRuleCall_1_4_2_0()); 
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:703:6: ( ( ( ruleOr ) ) ( ( ruleOr )* ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:703:6: ( ( ( ruleOr ) ) ( ( ruleOr )* ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:704:1: ( ( ruleOr ) ) ( ( ruleOr )* )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:704:1: ( ( ruleOr ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:705:1: ( ruleOr )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHo_operandAccess().getOrParserRuleCall_1_4_2_1()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:706:1: ( ruleOr )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:706:3: ruleOr
                    {
                    pushFollow(FOLLOW_ruleOr_in_rule__Ho_operand__Alternatives_1_4_21467);
                    ruleOr();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHo_operandAccess().getOrParserRuleCall_1_4_2_1()); 
                    }

                    }

                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:709:1: ( ( ruleOr )* )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:710:1: ( ruleOr )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getHo_operandAccess().getOrParserRuleCall_1_4_2_1()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:711:1: ( ruleOr )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=10 && LA5_0<=11)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:711:3: ruleOr
                    	    {
                    	    pushFollow(FOLLOW_ruleOr_in_rule__Ho_operand__Alternatives_1_4_21480);
                    	    ruleOr();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getHo_operandAccess().getOrParserRuleCall_1_4_2_1()); 
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
    // $ANTLR end "rule__Ho_operand__Alternatives_1_4_2"


    // $ANTLR start "rule__Logical_op_aliases__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:721:1: rule__Logical_op_aliases__Alternatives : ( ( 'or' ) | ( 'and' ) | ( 'not' ) );
    public final void rule__Logical_op_aliases__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:725:1: ( ( 'or' ) | ( 'and' ) | ( 'not' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:726:1: ( 'or' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:726:1: ( 'or' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:727:1: 'or'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogical_op_aliasesAccess().getOrKeyword_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Logical_op_aliases__Alternatives1517); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogical_op_aliasesAccess().getOrKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:734:6: ( 'and' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:734:6: ( 'and' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:735:1: 'and'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogical_op_aliasesAccess().getAndKeyword_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Logical_op_aliases__Alternatives1537); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogical_op_aliasesAccess().getAndKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:742:6: ( 'not' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:742:6: ( 'not' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:743:1: 'not'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogical_op_aliasesAccess().getNotKeyword_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Logical_op_aliases__Alternatives1557); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogical_op_aliasesAccess().getNotKeyword_2()); 
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
    // $ANTLR end "rule__Logical_op_aliases__Alternatives"


    // $ANTLR start "rule__Binary_op_aliases__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:755:1: rule__Binary_op_aliases__Alternatives : ( ( 'ne' ) | ( 'eq' ) | ( 'lt' ) | ( 'le' ) | ( 'gt' ) | ( 'ge' ) | ( 'like' ) );
    public final void rule__Binary_op_aliases__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:759:1: ( ( 'ne' ) | ( 'eq' ) | ( 'lt' ) | ( 'le' ) | ( 'gt' ) | ( 'ge' ) | ( 'like' ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
                {
                alt8=3;
                }
                break;
            case 18:
                {
                alt8=4;
                }
                break;
            case 19:
                {
                alt8=5;
                }
                break;
            case 20:
                {
                alt8=6;
                }
                break;
            case 21:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:760:1: ( 'ne' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:760:1: ( 'ne' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:761:1: 'ne'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinary_op_aliasesAccess().getNeKeyword_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Binary_op_aliases__Alternatives1592); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinary_op_aliasesAccess().getNeKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:768:6: ( 'eq' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:768:6: ( 'eq' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:769:1: 'eq'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinary_op_aliasesAccess().getEqKeyword_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Binary_op_aliases__Alternatives1612); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinary_op_aliasesAccess().getEqKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:776:6: ( 'lt' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:776:6: ( 'lt' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:777:1: 'lt'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinary_op_aliasesAccess().getLtKeyword_2()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Binary_op_aliases__Alternatives1632); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinary_op_aliasesAccess().getLtKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:784:6: ( 'le' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:784:6: ( 'le' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:785:1: 'le'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinary_op_aliasesAccess().getLeKeyword_3()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Binary_op_aliases__Alternatives1652); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinary_op_aliasesAccess().getLeKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:792:6: ( 'gt' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:792:6: ( 'gt' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:793:1: 'gt'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinary_op_aliasesAccess().getGtKeyword_4()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__Binary_op_aliases__Alternatives1672); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinary_op_aliasesAccess().getGtKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:800:6: ( 'ge' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:800:6: ( 'ge' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:801:1: 'ge'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinary_op_aliasesAccess().getGeKeyword_5()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__Binary_op_aliases__Alternatives1692); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinary_op_aliasesAccess().getGeKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:808:6: ( 'like' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:808:6: ( 'like' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:809:1: 'like'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBinary_op_aliasesAccess().getLikeKeyword_6()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__Binary_op_aliases__Alternatives1712); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBinary_op_aliasesAccess().getLikeKeyword_6()); 
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
    // $ANTLR end "rule__Binary_op_aliases__Alternatives"


    // $ANTLR start "rule__Comp_ops__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:821:1: rule__Comp_ops__Alternatives : ( ( '!=' ) | ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) );
    public final void rule__Comp_ops__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:825:1: ( ( '!=' ) | ( '=' ) | ( '<' ) | ( '<=' ) | ( '>' ) | ( '>=' ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            case 26:
                {
                alt9=5;
                }
                break;
            case 27:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:826:1: ( '!=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:826:1: ( '!=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:827:1: '!='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComp_opsAccess().getExclamationMarkEqualsSignKeyword_0()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__Comp_ops__Alternatives1747); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComp_opsAccess().getExclamationMarkEqualsSignKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:834:6: ( '=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:834:6: ( '=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:835:1: '='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComp_opsAccess().getEqualsSignKeyword_1()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__Comp_ops__Alternatives1767); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComp_opsAccess().getEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:842:6: ( '<' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:842:6: ( '<' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:843:1: '<'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComp_opsAccess().getLessThanSignKeyword_2()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__Comp_ops__Alternatives1787); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComp_opsAccess().getLessThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:850:6: ( '<=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:850:6: ( '<=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:851:1: '<='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComp_opsAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__Comp_ops__Alternatives1807); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComp_opsAccess().getLessThanSignEqualsSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:858:6: ( '>' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:858:6: ( '>' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:859:1: '>'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComp_opsAccess().getGreaterThanSignKeyword_4()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__Comp_ops__Alternatives1827); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComp_opsAccess().getGreaterThanSignKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:866:6: ( '>=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:866:6: ( '>=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:867:1: '>='
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComp_opsAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__Comp_ops__Alternatives1847); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComp_opsAccess().getGreaterThanSignEqualsSignKeyword_5()); 
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
    // $ANTLR end "rule__Comp_ops__Alternatives"


    // $ANTLR start "rule__Comparison__Alternatives_2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:879:1: rule__Comparison__Alternatives_2 : ( ( ( rule__Comparison__Group_2_0__0 ) ) | ( ruleComp_ops ) );
    public final void rule__Comparison__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:883:1: ( ( ( rule__Comparison__Group_2_0__0 ) ) | ( ruleComp_ops ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_WSP||(LA10_1>=36 && LA10_1<=39)||LA10_1==51||LA10_1==54) ) {
                    alt10=2;
                }
                else if ( ((LA10_1>=15 && LA10_1<=21)) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA10_0==22||(LA10_0>=24 && LA10_0<=27)) ) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:884:1: ( ( rule__Comparison__Group_2_0__0 ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:884:1: ( ( rule__Comparison__Group_2_0__0 ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:885:1: ( rule__Comparison__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getGroup_2_0()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:886:1: ( rule__Comparison__Group_2_0__0 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:886:2: rule__Comparison__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Comparison__Group_2_0__0_in_rule__Comparison__Alternatives_21881);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:890:6: ( ruleComp_ops )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:890:6: ( ruleComp_ops )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:891:1: ruleComp_ops
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getComp_opsParserRuleCall_2_1()); 
                    }
                    pushFollow(FOLLOW_ruleComp_ops_in_rule__Comparison__Alternatives_21899);
                    ruleComp_ops();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getComp_opsParserRuleCall_2_1()); 
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


    // $ANTLR start "rule__Call_operator__Alternatives_0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:901:1: rule__Call_operator__Alternatives_0 : ( ( ruleBinary_op_aliases ) | ( ruleFunctions_tbl ) );
    public final void rule__Call_operator__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:905:1: ( ( ruleBinary_op_aliases ) | ( ruleFunctions_tbl ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=15 && LA11_0<=21)) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=33 && LA11_0<=35)) ) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:906:1: ( ruleBinary_op_aliases )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:906:1: ( ruleBinary_op_aliases )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:907:1: ruleBinary_op_aliases
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCall_operatorAccess().getBinary_op_aliasesParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleBinary_op_aliases_in_rule__Call_operator__Alternatives_01931);
                    ruleBinary_op_aliases();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCall_operatorAccess().getBinary_op_aliasesParserRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:912:6: ( ruleFunctions_tbl )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:912:6: ( ruleFunctions_tbl )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:913:1: ruleFunctions_tbl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCall_operatorAccess().getFunctions_tblParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleFunctions_tbl_in_rule__Call_operator__Alternatives_01948);
                    ruleFunctions_tbl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCall_operatorAccess().getFunctions_tblParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__Call_operator__Alternatives_0"


    // $ANTLR start "rule__Pred_tbl__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:923:1: rule__Pred_tbl__Alternatives : ( ( 'select' ) | ( 'sort' ) | ( 'limit' ) | ( 'implementing' ) | ( 'composing' ) );
    public final void rule__Pred_tbl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:927:1: ( ( 'select' ) | ( 'sort' ) | ( 'limit' ) | ( 'implementing' ) | ( 'composing' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt12=1;
                }
                break;
            case 29:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            case 31:
                {
                alt12=4;
                }
                break;
            case 32:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:928:1: ( 'select' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:928:1: ( 'select' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:929:1: 'select'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPred_tblAccess().getSelectKeyword_0()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__Pred_tbl__Alternatives1981); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPred_tblAccess().getSelectKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:936:6: ( 'sort' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:936:6: ( 'sort' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:937:1: 'sort'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPred_tblAccess().getSortKeyword_1()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__Pred_tbl__Alternatives2001); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPred_tblAccess().getSortKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:944:6: ( 'limit' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:944:6: ( 'limit' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:945:1: 'limit'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPred_tblAccess().getLimitKeyword_2()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__Pred_tbl__Alternatives2021); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPred_tblAccess().getLimitKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:952:6: ( 'implementing' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:952:6: ( 'implementing' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:953:1: 'implementing'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPred_tblAccess().getImplementingKeyword_3()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__Pred_tbl__Alternatives2041); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPred_tblAccess().getImplementingKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:960:6: ( 'composing' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:960:6: ( 'composing' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:961:1: 'composing'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPred_tblAccess().getComposingKeyword_4()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__Pred_tbl__Alternatives2061); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPred_tblAccess().getComposingKeyword_4()); 
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
    // $ANTLR end "rule__Pred_tbl__Alternatives"


    // $ANTLR start "rule__Primary_expr__Alternatives_1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:973:1: rule__Primary_expr__Alternatives_1 : ( ( ( rule__Primary_expr__Group_1_0__0 ) ) | ( ruleArray ) | ( ruleStrval ) );
    public final void rule__Primary_expr__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:977:1: ( ( ( rule__Primary_expr__Group_1_0__0 ) ) | ( ruleArray ) | ( ruleStrval ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt13=1;
                }
                break;
            case 51:
                {
                alt13=2;
                }
                break;
            case 54:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:978:1: ( ( rule__Primary_expr__Group_1_0__0 ) )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:978:1: ( ( rule__Primary_expr__Group_1_0__0 ) )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:979:1: ( rule__Primary_expr__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimary_exprAccess().getGroup_1_0()); 
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:980:1: ( rule__Primary_expr__Group_1_0__0 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:980:2: rule__Primary_expr__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Primary_expr__Group_1_0__0_in_rule__Primary_expr__Alternatives_12095);
                    rule__Primary_expr__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimary_exprAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:984:6: ( ruleArray )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:984:6: ( ruleArray )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:985:1: ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimary_exprAccess().getArrayParserRuleCall_1_1()); 
                    }
                    pushFollow(FOLLOW_ruleArray_in_rule__Primary_expr__Alternatives_12113);
                    ruleArray();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimary_exprAccess().getArrayParserRuleCall_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:990:6: ( ruleStrval )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:990:6: ( ruleStrval )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:991:1: ruleStrval
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimary_exprAccess().getStrvalParserRuleCall_1_2()); 
                    }
                    pushFollow(FOLLOW_ruleStrval_in_rule__Primary_expr__Alternatives_12130);
                    ruleStrval();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimary_exprAccess().getStrvalParserRuleCall_1_2()); 
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
    // $ANTLR end "rule__Primary_expr__Alternatives_1"


    // $ANTLR start "rule__Functions_tbl__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1001:1: rule__Functions_tbl__Alternatives : ( ( 'isnull' ) | ( 'in' ) | ( 'out' ) );
    public final void rule__Functions_tbl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1005:1: ( ( 'isnull' ) | ( 'in' ) | ( 'out' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 35:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1006:1: ( 'isnull' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1006:1: ( 'isnull' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1007:1: 'isnull'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctions_tblAccess().getIsnullKeyword_0()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__Functions_tbl__Alternatives2163); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctions_tblAccess().getIsnullKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1014:6: ( 'in' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1014:6: ( 'in' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1015:1: 'in'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctions_tblAccess().getInKeyword_1()); 
                    }
                    match(input,34,FOLLOW_34_in_rule__Functions_tbl__Alternatives2183); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctions_tblAccess().getInKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1022:6: ( 'out' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1022:6: ( 'out' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1023:1: 'out'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFunctions_tblAccess().getOutKeyword_2()); 
                    }
                    match(input,35,FOLLOW_35_in_rule__Functions_tbl__Alternatives2203); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFunctions_tblAccess().getOutKeyword_2()); 
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
    // $ANTLR end "rule__Functions_tbl__Alternatives"


    // $ANTLR start "rule__Const_func_tbl__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1035:1: rule__Const_func_tbl__Alternatives : ( ( 'true' ) | ( 'false' ) | ( 'empty' ) | ( 'null' ) );
    public final void rule__Const_func_tbl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1039:1: ( ( 'true' ) | ( 'false' ) | ( 'empty' ) | ( 'null' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt15=1;
                }
                break;
            case 37:
                {
                alt15=2;
                }
                break;
            case 38:
                {
                alt15=3;
                }
                break;
            case 39:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1040:1: ( 'true' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1040:1: ( 'true' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1041:1: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConst_func_tblAccess().getTrueKeyword_0()); 
                    }
                    match(input,36,FOLLOW_36_in_rule__Const_func_tbl__Alternatives2238); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConst_func_tblAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1048:6: ( 'false' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1048:6: ( 'false' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1049:1: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConst_func_tblAccess().getFalseKeyword_1()); 
                    }
                    match(input,37,FOLLOW_37_in_rule__Const_func_tbl__Alternatives2258); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConst_func_tblAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1056:6: ( 'empty' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1056:6: ( 'empty' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1057:1: 'empty'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConst_func_tblAccess().getEmptyKeyword_2()); 
                    }
                    match(input,38,FOLLOW_38_in_rule__Const_func_tbl__Alternatives2278); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConst_func_tblAccess().getEmptyKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1064:6: ( 'null' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1064:6: ( 'null' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1065:1: 'null'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConst_func_tblAccess().getNullKeyword_3()); 
                    }
                    match(input,39,FOLLOW_39_in_rule__Const_func_tbl__Alternatives2298); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConst_func_tblAccess().getNullKeyword_3()); 
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
    // $ANTLR end "rule__Const_func_tbl__Alternatives"


    // $ANTLR start "rule__Nchar__Alternatives"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1077:1: rule__Nchar__Alternatives : ( ( RULE_ALPHA ) | ( RULE_DIGIT ) | ( '-' ) | ( '.' ) | ( '_' ) | ( '~' ) | ( '$' ) | ( ':' ) | ( '*' ) | ( '+' ) | ( '?' ) | ( '/' ) | ( '@' ) );
    public final void rule__Nchar__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1081:1: ( ( RULE_ALPHA ) | ( RULE_DIGIT ) | ( '-' ) | ( '.' ) | ( '_' ) | ( '~' ) | ( '$' ) | ( ':' ) | ( '*' ) | ( '+' ) | ( '?' ) | ( '/' ) | ( '@' ) )
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
            case 40:
                {
                alt16=3;
                }
                break;
            case 41:
                {
                alt16=4;
                }
                break;
            case 42:
                {
                alt16=5;
                }
                break;
            case 43:
                {
                alt16=6;
                }
                break;
            case 44:
                {
                alt16=7;
                }
                break;
            case 45:
                {
                alt16=8;
                }
                break;
            case 46:
                {
                alt16=9;
                }
                break;
            case 47:
                {
                alt16=10;
                }
                break;
            case 48:
                {
                alt16=11;
                }
                break;
            case 49:
                {
                alt16=12;
                }
                break;
            case 50:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1082:1: ( RULE_ALPHA )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1082:1: ( RULE_ALPHA )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1083:1: RULE_ALPHA
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getALPHATerminalRuleCall_0()); 
                    }
                    match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_rule__Nchar__Alternatives2332); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getALPHATerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1088:6: ( RULE_DIGIT )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1088:6: ( RULE_DIGIT )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1089:1: RULE_DIGIT
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getDIGITTerminalRuleCall_1()); 
                    }
                    match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_rule__Nchar__Alternatives2349); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getDIGITTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1094:6: ( '-' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1094:6: ( '-' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1095:1: '-'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getHyphenMinusKeyword_2()); 
                    }
                    match(input,40,FOLLOW_40_in_rule__Nchar__Alternatives2367); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getHyphenMinusKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1102:6: ( '.' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1102:6: ( '.' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1103:1: '.'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getFullStopKeyword_3()); 
                    }
                    match(input,41,FOLLOW_41_in_rule__Nchar__Alternatives2387); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getFullStopKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1110:6: ( '_' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1110:6: ( '_' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1111:1: '_'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().get_Keyword_4()); 
                    }
                    match(input,42,FOLLOW_42_in_rule__Nchar__Alternatives2407); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().get_Keyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1118:6: ( '~' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1118:6: ( '~' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1119:1: '~'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getTildeKeyword_5()); 
                    }
                    match(input,43,FOLLOW_43_in_rule__Nchar__Alternatives2427); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getTildeKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1126:6: ( '$' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1126:6: ( '$' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1127:1: '$'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getDollarSignKeyword_6()); 
                    }
                    match(input,44,FOLLOW_44_in_rule__Nchar__Alternatives2447); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getDollarSignKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1134:6: ( ':' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1134:6: ( ':' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1135:1: ':'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getColonKeyword_7()); 
                    }
                    match(input,45,FOLLOW_45_in_rule__Nchar__Alternatives2467); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getColonKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1142:6: ( '*' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1142:6: ( '*' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1143:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getAsteriskKeyword_8()); 
                    }
                    match(input,46,FOLLOW_46_in_rule__Nchar__Alternatives2487); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getAsteriskKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1150:6: ( '+' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1150:6: ( '+' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1151:1: '+'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getPlusSignKeyword_9()); 
                    }
                    match(input,47,FOLLOW_47_in_rule__Nchar__Alternatives2507); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getPlusSignKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1158:6: ( '?' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1158:6: ( '?' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1159:1: '?'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getQuestionMarkKeyword_10()); 
                    }
                    match(input,48,FOLLOW_48_in_rule__Nchar__Alternatives2527); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getQuestionMarkKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1166:6: ( '/' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1166:6: ( '/' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1167:1: '/'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getSolidusKeyword_11()); 
                    }
                    match(input,49,FOLLOW_49_in_rule__Nchar__Alternatives2547); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNcharAccess().getSolidusKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1174:6: ( '@' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1174:6: ( '@' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1175:1: '@'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNcharAccess().getCommercialAtKeyword_12()); 
                    }
                    match(input,50,FOLLOW_50_in_rule__Nchar__Alternatives2567); if (state.failed) return ;
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


    // $ANTLR start "rule__Strval__Alternatives_1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1187:1: rule__Strval__Alternatives_1 : ( ( ruleNchar ) | ( rulePct_encoded ) );
    public final void rule__Strval__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1191:1: ( ( ruleNchar ) | ( rulePct_encoded ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ALPHA && LA17_0<=RULE_DIGIT)||(LA17_0>=40 && LA17_0<=50)) ) {
                alt17=1;
            }
            else if ( (LA17_0==53) ) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1192:1: ( ruleNchar )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1192:1: ( ruleNchar )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1193:1: ruleNchar
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrvalAccess().getNcharParserRuleCall_1_0()); 
                    }
                    pushFollow(FOLLOW_ruleNchar_in_rule__Strval__Alternatives_12601);
                    ruleNchar();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStrvalAccess().getNcharParserRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1198:6: ( rulePct_encoded )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1198:6: ( rulePct_encoded )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1199:1: rulePct_encoded
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getStrvalAccess().getPct_encodedParserRuleCall_1_1()); 
                    }
                    pushFollow(FOLLOW_rulePct_encoded_in_rule__Strval__Alternatives_12618);
                    rulePct_encoded();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getStrvalAccess().getPct_encodedParserRuleCall_1_1()); 
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
    // $ANTLR end "rule__Strval__Alternatives_1"


    // $ANTLR start "rule__Model__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1211:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1215:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1216:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02648);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02651);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1223:1: rule__Model__Group__0__Impl : ( ( rule__Model__OperandsAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1227:1: ( ( ( rule__Model__OperandsAssignment_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1228:1: ( ( rule__Model__OperandsAssignment_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1228:1: ( ( rule__Model__OperandsAssignment_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1229:1: ( rule__Model__OperandsAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getOperandsAssignment_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1230:1: ( rule__Model__OperandsAssignment_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1230:2: rule__Model__OperandsAssignment_0
            {
            pushFollow(FOLLOW_rule__Model__OperandsAssignment_0_in_rule__Model__Group__0__Impl2678);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1240:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1244:1: ( rule__Model__Group__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1245:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12708);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1251:1: rule__Model__Group__1__Impl : ( ( rule__Model__Group_1__0 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1255:1: ( ( ( rule__Model__Group_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1256:1: ( ( rule__Model__Group_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1256:1: ( ( rule__Model__Group_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1257:1: ( rule__Model__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1258:1: ( rule__Model__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=8 && LA18_0<=9)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1258:2: rule__Model__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl2735);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1272:1: rule__Model__Group_1__0 : rule__Model__Group_1__0__Impl rule__Model__Group_1__1 ;
    public final void rule__Model__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1276:1: ( rule__Model__Group_1__0__Impl rule__Model__Group_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1277:2: rule__Model__Group_1__0__Impl rule__Model__Group_1__1
            {
            pushFollow(FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__02770);
            rule__Model__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__02773);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1284:1: rule__Model__Group_1__0__Impl : ( ( rule__Model__Alternatives_1_0 ) ) ;
    public final void rule__Model__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1288:1: ( ( ( rule__Model__Alternatives_1_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1289:1: ( ( rule__Model__Alternatives_1_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1289:1: ( ( rule__Model__Alternatives_1_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1290:1: ( rule__Model__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAlternatives_1_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1291:1: ( rule__Model__Alternatives_1_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1291:2: rule__Model__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Model__Alternatives_1_0_in_rule__Model__Group_1__0__Impl2800);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1301:1: rule__Model__Group_1__1 : rule__Model__Group_1__1__Impl ;
    public final void rule__Model__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1305:1: ( rule__Model__Group_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1306:2: rule__Model__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__12830);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1312:1: rule__Model__Group_1__1__Impl : ( ruleHo_operand ) ;
    public final void rule__Model__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1316:1: ( ( ruleHo_operand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1317:1: ( ruleHo_operand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1317:1: ( ruleHo_operand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1318:1: ruleHo_operand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getHo_operandParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleHo_operand_in_rule__Model__Group_1__1__Impl2857);
            ruleHo_operand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getHo_operandParserRuleCall_1_1()); 
            }

            }


            }

        }
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1333:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1337:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1338:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__02890);
            rule__And__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__And__Group__1_in_rule__And__Group__02893);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1345:1: rule__And__Group__0__Impl : ( '&' ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1349:1: ( ( '&' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1350:1: ( '&' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1350:1: ( '&' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1351:1: '&'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getAmpersandKeyword_0()); 
            }
            match(input,9,FOLLOW_9_in_rule__And__Group__0__Impl2921); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1364:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1368:1: ( rule__And__Group__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1369:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__12952);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1375:1: rule__And__Group__1__Impl : ( ruleHo_operand ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1379:1: ( ( ruleHo_operand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1380:1: ( ruleHo_operand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1380:1: ( ruleHo_operand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1381:1: ruleHo_operand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAccess().getHo_operandParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleHo_operand_in_rule__And__Group__1__Impl2979);
            ruleHo_operand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAccess().getHo_operandParserRuleCall_1()); 
            }

            }


            }

        }
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1396:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1400:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1401:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__03012);
            rule__Or__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Or__Group__1_in_rule__Or__Group__03015);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1408:1: rule__Or__Group__0__Impl : ( ( rule__Or__Alternatives_0 ) ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1412:1: ( ( ( rule__Or__Alternatives_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1413:1: ( ( rule__Or__Alternatives_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1413:1: ( ( rule__Or__Alternatives_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1414:1: ( rule__Or__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getAlternatives_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1415:1: ( rule__Or__Alternatives_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1415:2: rule__Or__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Or__Alternatives_0_in_rule__Or__Group__0__Impl3042);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1425:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1429:1: ( rule__Or__Group__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1430:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__13072);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1436:1: rule__Or__Group__1__Impl : ( ruleHo_operand ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1440:1: ( ( ruleHo_operand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1441:1: ( ruleHo_operand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1441:1: ( ruleHo_operand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1442:1: ruleHo_operand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAccess().getHo_operandParserRuleCall_1()); 
            }
            pushFollow(FOLLOW_ruleHo_operand_in_rule__Or__Group__1__Impl3099);
            ruleHo_operand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAccess().getHo_operandParserRuleCall_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Ho_operand__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1457:1: rule__Ho_operand__Group__0 : rule__Ho_operand__Group__0__Impl rule__Ho_operand__Group__1 ;
    public final void rule__Ho_operand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1461:1: ( rule__Ho_operand__Group__0__Impl rule__Ho_operand__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1462:2: rule__Ho_operand__Group__0__Impl rule__Ho_operand__Group__1
            {
            pushFollow(FOLLOW_rule__Ho_operand__Group__0__Impl_in_rule__Ho_operand__Group__03132);
            rule__Ho_operand__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ho_operand__Group__1_in_rule__Ho_operand__Group__03135);
            rule__Ho_operand__Group__1();

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
    // $ANTLR end "rule__Ho_operand__Group__0"


    // $ANTLR start "rule__Ho_operand__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1469:1: rule__Ho_operand__Group__0__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Ho_operand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1473:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1474:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1474:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1475:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHo_operandAccess().getWSPTerminalRuleCall_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1476:1: ( RULE_WSP )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WSP) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1476:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Ho_operand__Group__0__Impl3163); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHo_operandAccess().getWSPTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ho_operand__Group__0__Impl"


    // $ANTLR start "rule__Ho_operand__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1486:1: rule__Ho_operand__Group__1 : rule__Ho_operand__Group__1__Impl rule__Ho_operand__Group__2 ;
    public final void rule__Ho_operand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1490:1: ( rule__Ho_operand__Group__1__Impl rule__Ho_operand__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1491:2: rule__Ho_operand__Group__1__Impl rule__Ho_operand__Group__2
            {
            pushFollow(FOLLOW_rule__Ho_operand__Group__1__Impl_in_rule__Ho_operand__Group__13194);
            rule__Ho_operand__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ho_operand__Group__2_in_rule__Ho_operand__Group__13197);
            rule__Ho_operand__Group__2();

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
    // $ANTLR end "rule__Ho_operand__Group__1"


    // $ANTLR start "rule__Ho_operand__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1498:1: rule__Ho_operand__Group__1__Impl : ( ( rule__Ho_operand__Alternatives_1 ) ) ;
    public final void rule__Ho_operand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1502:1: ( ( ( rule__Ho_operand__Alternatives_1 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1503:1: ( ( rule__Ho_operand__Alternatives_1 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1503:1: ( ( rule__Ho_operand__Alternatives_1 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1504:1: ( rule__Ho_operand__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHo_operandAccess().getAlternatives_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1505:1: ( rule__Ho_operand__Alternatives_1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1505:2: rule__Ho_operand__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Ho_operand__Alternatives_1_in_rule__Ho_operand__Group__1__Impl3224);
            rule__Ho_operand__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHo_operandAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ho_operand__Group__1__Impl"


    // $ANTLR start "rule__Ho_operand__Group__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1515:1: rule__Ho_operand__Group__2 : rule__Ho_operand__Group__2__Impl ;
    public final void rule__Ho_operand__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1519:1: ( rule__Ho_operand__Group__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1520:2: rule__Ho_operand__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Ho_operand__Group__2__Impl_in_rule__Ho_operand__Group__23254);
            rule__Ho_operand__Group__2__Impl();

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
    // $ANTLR end "rule__Ho_operand__Group__2"


    // $ANTLR start "rule__Ho_operand__Group__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1526:1: rule__Ho_operand__Group__2__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Ho_operand__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1530:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1531:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1531:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1532:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHo_operandAccess().getWSPTerminalRuleCall_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1533:1: ( RULE_WSP )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_WSP) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1533:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Ho_operand__Group__2__Impl3282); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHo_operandAccess().getWSPTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ho_operand__Group__2__Impl"


    // $ANTLR start "rule__Ho_operand__Group_1_4__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1549:1: rule__Ho_operand__Group_1_4__0 : rule__Ho_operand__Group_1_4__0__Impl rule__Ho_operand__Group_1_4__1 ;
    public final void rule__Ho_operand__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1553:1: ( rule__Ho_operand__Group_1_4__0__Impl rule__Ho_operand__Group_1_4__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1554:2: rule__Ho_operand__Group_1_4__0__Impl rule__Ho_operand__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__Ho_operand__Group_1_4__0__Impl_in_rule__Ho_operand__Group_1_4__03319);
            rule__Ho_operand__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ho_operand__Group_1_4__1_in_rule__Ho_operand__Group_1_4__03322);
            rule__Ho_operand__Group_1_4__1();

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
    // $ANTLR end "rule__Ho_operand__Group_1_4__0"


    // $ANTLR start "rule__Ho_operand__Group_1_4__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1561:1: rule__Ho_operand__Group_1_4__0__Impl : ( '(' ) ;
    public final void rule__Ho_operand__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1565:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1566:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1566:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1567:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHo_operandAccess().getLeftParenthesisKeyword_1_4_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__Ho_operand__Group_1_4__0__Impl3350); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHo_operandAccess().getLeftParenthesisKeyword_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ho_operand__Group_1_4__0__Impl"


    // $ANTLR start "rule__Ho_operand__Group_1_4__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1580:1: rule__Ho_operand__Group_1_4__1 : rule__Ho_operand__Group_1_4__1__Impl rule__Ho_operand__Group_1_4__2 ;
    public final void rule__Ho_operand__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1584:1: ( rule__Ho_operand__Group_1_4__1__Impl rule__Ho_operand__Group_1_4__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1585:2: rule__Ho_operand__Group_1_4__1__Impl rule__Ho_operand__Group_1_4__2
            {
            pushFollow(FOLLOW_rule__Ho_operand__Group_1_4__1__Impl_in_rule__Ho_operand__Group_1_4__13381);
            rule__Ho_operand__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ho_operand__Group_1_4__2_in_rule__Ho_operand__Group_1_4__13384);
            rule__Ho_operand__Group_1_4__2();

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
    // $ANTLR end "rule__Ho_operand__Group_1_4__1"


    // $ANTLR start "rule__Ho_operand__Group_1_4__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1592:1: rule__Ho_operand__Group_1_4__1__Impl : ( ruleHo_operand ) ;
    public final void rule__Ho_operand__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1596:1: ( ( ruleHo_operand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1597:1: ( ruleHo_operand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1597:1: ( ruleHo_operand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1598:1: ruleHo_operand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHo_operandAccess().getHo_operandParserRuleCall_1_4_1()); 
            }
            pushFollow(FOLLOW_ruleHo_operand_in_rule__Ho_operand__Group_1_4__1__Impl3411);
            ruleHo_operand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHo_operandAccess().getHo_operandParserRuleCall_1_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ho_operand__Group_1_4__1__Impl"


    // $ANTLR start "rule__Ho_operand__Group_1_4__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1609:1: rule__Ho_operand__Group_1_4__2 : rule__Ho_operand__Group_1_4__2__Impl rule__Ho_operand__Group_1_4__3 ;
    public final void rule__Ho_operand__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1613:1: ( rule__Ho_operand__Group_1_4__2__Impl rule__Ho_operand__Group_1_4__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1614:2: rule__Ho_operand__Group_1_4__2__Impl rule__Ho_operand__Group_1_4__3
            {
            pushFollow(FOLLOW_rule__Ho_operand__Group_1_4__2__Impl_in_rule__Ho_operand__Group_1_4__23440);
            rule__Ho_operand__Group_1_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Ho_operand__Group_1_4__3_in_rule__Ho_operand__Group_1_4__23443);
            rule__Ho_operand__Group_1_4__3();

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
    // $ANTLR end "rule__Ho_operand__Group_1_4__2"


    // $ANTLR start "rule__Ho_operand__Group_1_4__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1621:1: rule__Ho_operand__Group_1_4__2__Impl : ( ( rule__Ho_operand__Alternatives_1_4_2 ) ) ;
    public final void rule__Ho_operand__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1625:1: ( ( ( rule__Ho_operand__Alternatives_1_4_2 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1626:1: ( ( rule__Ho_operand__Alternatives_1_4_2 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1626:1: ( ( rule__Ho_operand__Alternatives_1_4_2 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1627:1: ( rule__Ho_operand__Alternatives_1_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHo_operandAccess().getAlternatives_1_4_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1628:1: ( rule__Ho_operand__Alternatives_1_4_2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1628:2: rule__Ho_operand__Alternatives_1_4_2
            {
            pushFollow(FOLLOW_rule__Ho_operand__Alternatives_1_4_2_in_rule__Ho_operand__Group_1_4__2__Impl3470);
            rule__Ho_operand__Alternatives_1_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHo_operandAccess().getAlternatives_1_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ho_operand__Group_1_4__2__Impl"


    // $ANTLR start "rule__Ho_operand__Group_1_4__3"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1638:1: rule__Ho_operand__Group_1_4__3 : rule__Ho_operand__Group_1_4__3__Impl ;
    public final void rule__Ho_operand__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1642:1: ( rule__Ho_operand__Group_1_4__3__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1643:2: rule__Ho_operand__Group_1_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Ho_operand__Group_1_4__3__Impl_in_rule__Ho_operand__Group_1_4__33500);
            rule__Ho_operand__Group_1_4__3__Impl();

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
    // $ANTLR end "rule__Ho_operand__Group_1_4__3"


    // $ANTLR start "rule__Ho_operand__Group_1_4__3__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1649:1: rule__Ho_operand__Group_1_4__3__Impl : ( ')' ) ;
    public final void rule__Ho_operand__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1653:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1654:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1654:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1655:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHo_operandAccess().getRightParenthesisKeyword_1_4_3()); 
            }
            match(input,52,FOLLOW_52_in_rule__Ho_operand__Group_1_4__3__Impl3528); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHo_operandAccess().getRightParenthesisKeyword_1_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ho_operand__Group_1_4__3__Impl"


    // $ANTLR start "rule__Higher_order_call__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1676:1: rule__Higher_order_call__Group__0 : rule__Higher_order_call__Group__0__Impl rule__Higher_order_call__Group__1 ;
    public final void rule__Higher_order_call__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1680:1: ( rule__Higher_order_call__Group__0__Impl rule__Higher_order_call__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1681:2: rule__Higher_order_call__Group__0__Impl rule__Higher_order_call__Group__1
            {
            pushFollow(FOLLOW_rule__Higher_order_call__Group__0__Impl_in_rule__Higher_order_call__Group__03567);
            rule__Higher_order_call__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Higher_order_call__Group__1_in_rule__Higher_order_call__Group__03570);
            rule__Higher_order_call__Group__1();

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
    // $ANTLR end "rule__Higher_order_call__Group__0"


    // $ANTLR start "rule__Higher_order_call__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1688:1: rule__Higher_order_call__Group__0__Impl : ( ruleLogical_op_aliases ) ;
    public final void rule__Higher_order_call__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1692:1: ( ( ruleLogical_op_aliases ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1693:1: ( ruleLogical_op_aliases )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1693:1: ( ruleLogical_op_aliases )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1694:1: ruleLogical_op_aliases
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigher_order_callAccess().getLogical_op_aliasesParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleLogical_op_aliases_in_rule__Higher_order_call__Group__0__Impl3597);
            ruleLogical_op_aliases();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigher_order_callAccess().getLogical_op_aliasesParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Higher_order_call__Group__0__Impl"


    // $ANTLR start "rule__Higher_order_call__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1705:1: rule__Higher_order_call__Group__1 : rule__Higher_order_call__Group__1__Impl rule__Higher_order_call__Group__2 ;
    public final void rule__Higher_order_call__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1709:1: ( rule__Higher_order_call__Group__1__Impl rule__Higher_order_call__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1710:2: rule__Higher_order_call__Group__1__Impl rule__Higher_order_call__Group__2
            {
            pushFollow(FOLLOW_rule__Higher_order_call__Group__1__Impl_in_rule__Higher_order_call__Group__13626);
            rule__Higher_order_call__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Higher_order_call__Group__2_in_rule__Higher_order_call__Group__13629);
            rule__Higher_order_call__Group__2();

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
    // $ANTLR end "rule__Higher_order_call__Group__1"


    // $ANTLR start "rule__Higher_order_call__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1717:1: rule__Higher_order_call__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Higher_order_call__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1721:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1722:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1722:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1723:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigher_order_callAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1724:1: ( RULE_WSP )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WSP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1724:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Higher_order_call__Group__1__Impl3657); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigher_order_callAccess().getWSPTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Higher_order_call__Group__1__Impl"


    // $ANTLR start "rule__Higher_order_call__Group__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1734:1: rule__Higher_order_call__Group__2 : rule__Higher_order_call__Group__2__Impl rule__Higher_order_call__Group__3 ;
    public final void rule__Higher_order_call__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1738:1: ( rule__Higher_order_call__Group__2__Impl rule__Higher_order_call__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1739:2: rule__Higher_order_call__Group__2__Impl rule__Higher_order_call__Group__3
            {
            pushFollow(FOLLOW_rule__Higher_order_call__Group__2__Impl_in_rule__Higher_order_call__Group__23688);
            rule__Higher_order_call__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Higher_order_call__Group__3_in_rule__Higher_order_call__Group__23691);
            rule__Higher_order_call__Group__3();

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
    // $ANTLR end "rule__Higher_order_call__Group__2"


    // $ANTLR start "rule__Higher_order_call__Group__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1746:1: rule__Higher_order_call__Group__2__Impl : ( '(' ) ;
    public final void rule__Higher_order_call__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1750:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1751:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1751:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1752:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigher_order_callAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__Higher_order_call__Group__2__Impl3719); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigher_order_callAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Higher_order_call__Group__2__Impl"


    // $ANTLR start "rule__Higher_order_call__Group__3"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1765:1: rule__Higher_order_call__Group__3 : rule__Higher_order_call__Group__3__Impl rule__Higher_order_call__Group__4 ;
    public final void rule__Higher_order_call__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1769:1: ( rule__Higher_order_call__Group__3__Impl rule__Higher_order_call__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1770:2: rule__Higher_order_call__Group__3__Impl rule__Higher_order_call__Group__4
            {
            pushFollow(FOLLOW_rule__Higher_order_call__Group__3__Impl_in_rule__Higher_order_call__Group__33750);
            rule__Higher_order_call__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Higher_order_call__Group__4_in_rule__Higher_order_call__Group__33753);
            rule__Higher_order_call__Group__4();

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
    // $ANTLR end "rule__Higher_order_call__Group__3"


    // $ANTLR start "rule__Higher_order_call__Group__3__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1777:1: rule__Higher_order_call__Group__3__Impl : ( ( rule__Higher_order_call__Group_3__0 ) ) ;
    public final void rule__Higher_order_call__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1781:1: ( ( ( rule__Higher_order_call__Group_3__0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1782:1: ( ( rule__Higher_order_call__Group_3__0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1782:1: ( ( rule__Higher_order_call__Group_3__0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1783:1: ( rule__Higher_order_call__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigher_order_callAccess().getGroup_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1784:1: ( rule__Higher_order_call__Group_3__0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1784:2: rule__Higher_order_call__Group_3__0
            {
            pushFollow(FOLLOW_rule__Higher_order_call__Group_3__0_in_rule__Higher_order_call__Group__3__Impl3780);
            rule__Higher_order_call__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigher_order_callAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Higher_order_call__Group__3__Impl"


    // $ANTLR start "rule__Higher_order_call__Group__4"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1794:1: rule__Higher_order_call__Group__4 : rule__Higher_order_call__Group__4__Impl ;
    public final void rule__Higher_order_call__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1798:1: ( rule__Higher_order_call__Group__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1799:2: rule__Higher_order_call__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Higher_order_call__Group__4__Impl_in_rule__Higher_order_call__Group__43810);
            rule__Higher_order_call__Group__4__Impl();

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
    // $ANTLR end "rule__Higher_order_call__Group__4"


    // $ANTLR start "rule__Higher_order_call__Group__4__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1805:1: rule__Higher_order_call__Group__4__Impl : ( ')' ) ;
    public final void rule__Higher_order_call__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1809:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1810:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1810:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1811:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigher_order_callAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__Higher_order_call__Group__4__Impl3838); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigher_order_callAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Higher_order_call__Group__4__Impl"


    // $ANTLR start "rule__Higher_order_call__Group_3__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1834:1: rule__Higher_order_call__Group_3__0 : rule__Higher_order_call__Group_3__0__Impl rule__Higher_order_call__Group_3__1 ;
    public final void rule__Higher_order_call__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1838:1: ( rule__Higher_order_call__Group_3__0__Impl rule__Higher_order_call__Group_3__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1839:2: rule__Higher_order_call__Group_3__0__Impl rule__Higher_order_call__Group_3__1
            {
            pushFollow(FOLLOW_rule__Higher_order_call__Group_3__0__Impl_in_rule__Higher_order_call__Group_3__03879);
            rule__Higher_order_call__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Higher_order_call__Group_3__1_in_rule__Higher_order_call__Group_3__03882);
            rule__Higher_order_call__Group_3__1();

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
    // $ANTLR end "rule__Higher_order_call__Group_3__0"


    // $ANTLR start "rule__Higher_order_call__Group_3__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1846:1: rule__Higher_order_call__Group_3__0__Impl : ( ruleHo_operand ) ;
    public final void rule__Higher_order_call__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1850:1: ( ( ruleHo_operand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1851:1: ( ruleHo_operand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1851:1: ( ruleHo_operand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1852:1: ruleHo_operand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigher_order_callAccess().getHo_operandParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleHo_operand_in_rule__Higher_order_call__Group_3__0__Impl3909);
            ruleHo_operand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigher_order_callAccess().getHo_operandParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Higher_order_call__Group_3__0__Impl"


    // $ANTLR start "rule__Higher_order_call__Group_3__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1863:1: rule__Higher_order_call__Group_3__1 : rule__Higher_order_call__Group_3__1__Impl ;
    public final void rule__Higher_order_call__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1867:1: ( rule__Higher_order_call__Group_3__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1868:2: rule__Higher_order_call__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Higher_order_call__Group_3__1__Impl_in_rule__Higher_order_call__Group_3__13938);
            rule__Higher_order_call__Group_3__1__Impl();

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
    // $ANTLR end "rule__Higher_order_call__Group_3__1"


    // $ANTLR start "rule__Higher_order_call__Group_3__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1874:1: rule__Higher_order_call__Group_3__1__Impl : ( ( rule__Higher_order_call__Group_3_1__0 )* ) ;
    public final void rule__Higher_order_call__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1878:1: ( ( ( rule__Higher_order_call__Group_3_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1879:1: ( ( rule__Higher_order_call__Group_3_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1879:1: ( ( rule__Higher_order_call__Group_3_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1880:1: ( rule__Higher_order_call__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigher_order_callAccess().getGroup_3_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1881:1: ( rule__Higher_order_call__Group_3_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==8) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1881:2: rule__Higher_order_call__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Higher_order_call__Group_3_1__0_in_rule__Higher_order_call__Group_3__1__Impl3965);
            	    rule__Higher_order_call__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigher_order_callAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Higher_order_call__Group_3__1__Impl"


    // $ANTLR start "rule__Higher_order_call__Group_3_1__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1895:1: rule__Higher_order_call__Group_3_1__0 : rule__Higher_order_call__Group_3_1__0__Impl rule__Higher_order_call__Group_3_1__1 ;
    public final void rule__Higher_order_call__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1899:1: ( rule__Higher_order_call__Group_3_1__0__Impl rule__Higher_order_call__Group_3_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1900:2: rule__Higher_order_call__Group_3_1__0__Impl rule__Higher_order_call__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Higher_order_call__Group_3_1__0__Impl_in_rule__Higher_order_call__Group_3_1__04000);
            rule__Higher_order_call__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Higher_order_call__Group_3_1__1_in_rule__Higher_order_call__Group_3_1__04003);
            rule__Higher_order_call__Group_3_1__1();

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
    // $ANTLR end "rule__Higher_order_call__Group_3_1__0"


    // $ANTLR start "rule__Higher_order_call__Group_3_1__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1907:1: rule__Higher_order_call__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Higher_order_call__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1911:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1912:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1912:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1913:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigher_order_callAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,8,FOLLOW_8_in_rule__Higher_order_call__Group_3_1__0__Impl4031); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigher_order_callAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Higher_order_call__Group_3_1__0__Impl"


    // $ANTLR start "rule__Higher_order_call__Group_3_1__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1926:1: rule__Higher_order_call__Group_3_1__1 : rule__Higher_order_call__Group_3_1__1__Impl ;
    public final void rule__Higher_order_call__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1930:1: ( rule__Higher_order_call__Group_3_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1931:2: rule__Higher_order_call__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Higher_order_call__Group_3_1__1__Impl_in_rule__Higher_order_call__Group_3_1__14062);
            rule__Higher_order_call__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Higher_order_call__Group_3_1__1"


    // $ANTLR start "rule__Higher_order_call__Group_3_1__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1937:1: rule__Higher_order_call__Group_3_1__1__Impl : ( ruleHo_operand ) ;
    public final void rule__Higher_order_call__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1941:1: ( ( ruleHo_operand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1942:1: ( ruleHo_operand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1942:1: ( ruleHo_operand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1943:1: ruleHo_operand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getHigher_order_callAccess().getHo_operandParserRuleCall_3_1_1()); 
            }
            pushFollow(FOLLOW_ruleHo_operand_in_rule__Higher_order_call__Group_3_1__1__Impl4089);
            ruleHo_operand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getHigher_order_callAccess().getHo_operandParserRuleCall_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Higher_order_call__Group_3_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1958:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1962:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1963:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04122);
            rule__Comparison__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04125);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1970:1: rule__Comparison__Group__0__Impl : ( ruleStrval ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1974:1: ( ( ruleStrval ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1975:1: ( ruleStrval )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1975:1: ( ruleStrval )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1976:1: ruleStrval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getStrvalParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_rule__Comparison__Group__0__Impl4152);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1987:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl rule__Comparison__Group__2 ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1991:1: ( rule__Comparison__Group__1__Impl rule__Comparison__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1992:2: rule__Comparison__Group__1__Impl rule__Comparison__Group__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14181);
            rule__Comparison__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__14184);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1999:1: rule__Comparison__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2003:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2004:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2004:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2005:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2006:1: ( RULE_WSP )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_WSP) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2006:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Comparison__Group__1__Impl4212); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2016:1: rule__Comparison__Group__2 : rule__Comparison__Group__2__Impl rule__Comparison__Group__3 ;
    public final void rule__Comparison__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2020:1: ( rule__Comparison__Group__2__Impl rule__Comparison__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2021:2: rule__Comparison__Group__2__Impl rule__Comparison__Group__3
            {
            pushFollow(FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__24243);
            rule__Comparison__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group__3_in_rule__Comparison__Group__24246);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2028:1: rule__Comparison__Group__2__Impl : ( ( rule__Comparison__Alternatives_2 ) ) ;
    public final void rule__Comparison__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2032:1: ( ( ( rule__Comparison__Alternatives_2 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2033:1: ( ( rule__Comparison__Alternatives_2 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2033:1: ( ( rule__Comparison__Alternatives_2 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2034:1: ( rule__Comparison__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2035:1: ( rule__Comparison__Alternatives_2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2035:2: rule__Comparison__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Comparison__Alternatives_2_in_rule__Comparison__Group__2__Impl4273);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2045:1: rule__Comparison__Group__3 : rule__Comparison__Group__3__Impl ;
    public final void rule__Comparison__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2049:1: ( rule__Comparison__Group__3__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2050:2: rule__Comparison__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group__3__Impl_in_rule__Comparison__Group__34303);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2056:1: rule__Comparison__Group__3__Impl : ( rulePrimary_expr ) ;
    public final void rule__Comparison__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2060:1: ( ( rulePrimary_expr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2061:1: ( rulePrimary_expr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2061:1: ( rulePrimary_expr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2062:1: rulePrimary_expr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getPrimary_exprParserRuleCall_3()); 
            }
            pushFollow(FOLLOW_rulePrimary_expr_in_rule__Comparison__Group__3__Impl4330);
            rulePrimary_expr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getPrimary_exprParserRuleCall_3()); 
            }

            }


            }

        }
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2081:1: rule__Comparison__Group_2_0__0 : rule__Comparison__Group_2_0__0__Impl rule__Comparison__Group_2_0__1 ;
    public final void rule__Comparison__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2085:1: ( rule__Comparison__Group_2_0__0__Impl rule__Comparison__Group_2_0__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2086:2: rule__Comparison__Group_2_0__0__Impl rule__Comparison__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Comparison__Group_2_0__0__Impl_in_rule__Comparison__Group_2_0__04367);
            rule__Comparison__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_2_0__1_in_rule__Comparison__Group_2_0__04370);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2093:1: rule__Comparison__Group_2_0__0__Impl : ( '=' ) ;
    public final void rule__Comparison__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2097:1: ( ( '=' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2098:1: ( '=' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2098:1: ( '=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2099:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsSignKeyword_2_0_0()); 
            }
            match(input,23,FOLLOW_23_in_rule__Comparison__Group_2_0__0__Impl4398); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2112:1: rule__Comparison__Group_2_0__1 : rule__Comparison__Group_2_0__1__Impl rule__Comparison__Group_2_0__2 ;
    public final void rule__Comparison__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2116:1: ( rule__Comparison__Group_2_0__1__Impl rule__Comparison__Group_2_0__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2117:2: rule__Comparison__Group_2_0__1__Impl rule__Comparison__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__Comparison__Group_2_0__1__Impl_in_rule__Comparison__Group_2_0__14429);
            rule__Comparison__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Comparison__Group_2_0__2_in_rule__Comparison__Group_2_0__14432);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2124:1: rule__Comparison__Group_2_0__1__Impl : ( ruleBinary_op_aliases ) ;
    public final void rule__Comparison__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2128:1: ( ( ruleBinary_op_aliases ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2129:1: ( ruleBinary_op_aliases )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2129:1: ( ruleBinary_op_aliases )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2130:1: ruleBinary_op_aliases
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getBinary_op_aliasesParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_ruleBinary_op_aliases_in_rule__Comparison__Group_2_0__1__Impl4459);
            ruleBinary_op_aliases();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getBinary_op_aliasesParserRuleCall_2_0_1()); 
            }

            }


            }

        }
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2141:1: rule__Comparison__Group_2_0__2 : rule__Comparison__Group_2_0__2__Impl ;
    public final void rule__Comparison__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2145:1: ( rule__Comparison__Group_2_0__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2146:2: rule__Comparison__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Comparison__Group_2_0__2__Impl_in_rule__Comparison__Group_2_0__24488);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2152:1: rule__Comparison__Group_2_0__2__Impl : ( '=' ) ;
    public final void rule__Comparison__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2156:1: ( ( '=' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2157:1: ( '=' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2157:1: ( '=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2158:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getEqualsSignKeyword_2_0_2()); 
            }
            match(input,23,FOLLOW_23_in_rule__Comparison__Group_2_0__2__Impl4516); if (state.failed) return ;
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


    // $ANTLR start "rule__Call_operator__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2177:1: rule__Call_operator__Group__0 : rule__Call_operator__Group__0__Impl rule__Call_operator__Group__1 ;
    public final void rule__Call_operator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2181:1: ( rule__Call_operator__Group__0__Impl rule__Call_operator__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2182:2: rule__Call_operator__Group__0__Impl rule__Call_operator__Group__1
            {
            pushFollow(FOLLOW_rule__Call_operator__Group__0__Impl_in_rule__Call_operator__Group__04553);
            rule__Call_operator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call_operator__Group__1_in_rule__Call_operator__Group__04556);
            rule__Call_operator__Group__1();

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
    // $ANTLR end "rule__Call_operator__Group__0"


    // $ANTLR start "rule__Call_operator__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2189:1: rule__Call_operator__Group__0__Impl : ( ( rule__Call_operator__Alternatives_0 ) ) ;
    public final void rule__Call_operator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2193:1: ( ( ( rule__Call_operator__Alternatives_0 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2194:1: ( ( rule__Call_operator__Alternatives_0 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2194:1: ( ( rule__Call_operator__Alternatives_0 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2195:1: ( rule__Call_operator__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCall_operatorAccess().getAlternatives_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2196:1: ( rule__Call_operator__Alternatives_0 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2196:2: rule__Call_operator__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Call_operator__Alternatives_0_in_rule__Call_operator__Group__0__Impl4583);
            rule__Call_operator__Alternatives_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCall_operatorAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call_operator__Group__0__Impl"


    // $ANTLR start "rule__Call_operator__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2206:1: rule__Call_operator__Group__1 : rule__Call_operator__Group__1__Impl rule__Call_operator__Group__2 ;
    public final void rule__Call_operator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2210:1: ( rule__Call_operator__Group__1__Impl rule__Call_operator__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2211:2: rule__Call_operator__Group__1__Impl rule__Call_operator__Group__2
            {
            pushFollow(FOLLOW_rule__Call_operator__Group__1__Impl_in_rule__Call_operator__Group__14613);
            rule__Call_operator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call_operator__Group__2_in_rule__Call_operator__Group__14616);
            rule__Call_operator__Group__2();

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
    // $ANTLR end "rule__Call_operator__Group__1"


    // $ANTLR start "rule__Call_operator__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2218:1: rule__Call_operator__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Call_operator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2222:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2223:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2223:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2224:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCall_operatorAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2225:1: ( RULE_WSP )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_WSP) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2225:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Call_operator__Group__1__Impl4644); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCall_operatorAccess().getWSPTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call_operator__Group__1__Impl"


    // $ANTLR start "rule__Call_operator__Group__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2235:1: rule__Call_operator__Group__2 : rule__Call_operator__Group__2__Impl rule__Call_operator__Group__3 ;
    public final void rule__Call_operator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2239:1: ( rule__Call_operator__Group__2__Impl rule__Call_operator__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2240:2: rule__Call_operator__Group__2__Impl rule__Call_operator__Group__3
            {
            pushFollow(FOLLOW_rule__Call_operator__Group__2__Impl_in_rule__Call_operator__Group__24675);
            rule__Call_operator__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call_operator__Group__3_in_rule__Call_operator__Group__24678);
            rule__Call_operator__Group__3();

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
    // $ANTLR end "rule__Call_operator__Group__2"


    // $ANTLR start "rule__Call_operator__Group__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2247:1: rule__Call_operator__Group__2__Impl : ( '(' ) ;
    public final void rule__Call_operator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2251:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2252:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2252:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2253:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCall_operatorAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__Call_operator__Group__2__Impl4706); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCall_operatorAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call_operator__Group__2__Impl"


    // $ANTLR start "rule__Call_operator__Group__3"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2266:1: rule__Call_operator__Group__3 : rule__Call_operator__Group__3__Impl rule__Call_operator__Group__4 ;
    public final void rule__Call_operator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2270:1: ( rule__Call_operator__Group__3__Impl rule__Call_operator__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2271:2: rule__Call_operator__Group__3__Impl rule__Call_operator__Group__4
            {
            pushFollow(FOLLOW_rule__Call_operator__Group__3__Impl_in_rule__Call_operator__Group__34737);
            rule__Call_operator__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call_operator__Group__4_in_rule__Call_operator__Group__34740);
            rule__Call_operator__Group__4();

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
    // $ANTLR end "rule__Call_operator__Group__3"


    // $ANTLR start "rule__Call_operator__Group__3__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2278:1: rule__Call_operator__Group__3__Impl : ( ( rule__Call_operator__Group_3__0 )? ) ;
    public final void rule__Call_operator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2282:1: ( ( ( rule__Call_operator__Group_3__0 )? ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2283:1: ( ( rule__Call_operator__Group_3__0 )? )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2283:1: ( ( rule__Call_operator__Group_3__0 )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2284:1: ( rule__Call_operator__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCall_operatorAccess().getGroup_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2285:1: ( rule__Call_operator__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_WSP||(LA25_0>=36 && LA25_0<=39)||LA25_0==51||LA25_0==54) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2285:2: rule__Call_operator__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Call_operator__Group_3__0_in_rule__Call_operator__Group__3__Impl4767);
                    rule__Call_operator__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCall_operatorAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call_operator__Group__3__Impl"


    // $ANTLR start "rule__Call_operator__Group__4"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2295:1: rule__Call_operator__Group__4 : rule__Call_operator__Group__4__Impl ;
    public final void rule__Call_operator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2299:1: ( rule__Call_operator__Group__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2300:2: rule__Call_operator__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Call_operator__Group__4__Impl_in_rule__Call_operator__Group__44798);
            rule__Call_operator__Group__4__Impl();

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
    // $ANTLR end "rule__Call_operator__Group__4"


    // $ANTLR start "rule__Call_operator__Group__4__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2306:1: rule__Call_operator__Group__4__Impl : ( ')' ) ;
    public final void rule__Call_operator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2310:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2311:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2311:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2312:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCall_operatorAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__Call_operator__Group__4__Impl4826); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCall_operatorAccess().getRightParenthesisKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call_operator__Group__4__Impl"


    // $ANTLR start "rule__Call_operator__Group_3__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2335:1: rule__Call_operator__Group_3__0 : rule__Call_operator__Group_3__0__Impl rule__Call_operator__Group_3__1 ;
    public final void rule__Call_operator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2339:1: ( rule__Call_operator__Group_3__0__Impl rule__Call_operator__Group_3__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2340:2: rule__Call_operator__Group_3__0__Impl rule__Call_operator__Group_3__1
            {
            pushFollow(FOLLOW_rule__Call_operator__Group_3__0__Impl_in_rule__Call_operator__Group_3__04867);
            rule__Call_operator__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call_operator__Group_3__1_in_rule__Call_operator__Group_3__04870);
            rule__Call_operator__Group_3__1();

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
    // $ANTLR end "rule__Call_operator__Group_3__0"


    // $ANTLR start "rule__Call_operator__Group_3__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2347:1: rule__Call_operator__Group_3__0__Impl : ( rulePrimary_expr ) ;
    public final void rule__Call_operator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2351:1: ( ( rulePrimary_expr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2352:1: ( rulePrimary_expr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2352:1: ( rulePrimary_expr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2353:1: rulePrimary_expr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCall_operatorAccess().getPrimary_exprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePrimary_expr_in_rule__Call_operator__Group_3__0__Impl4897);
            rulePrimary_expr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCall_operatorAccess().getPrimary_exprParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call_operator__Group_3__0__Impl"


    // $ANTLR start "rule__Call_operator__Group_3__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2364:1: rule__Call_operator__Group_3__1 : rule__Call_operator__Group_3__1__Impl ;
    public final void rule__Call_operator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2368:1: ( rule__Call_operator__Group_3__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2369:2: rule__Call_operator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Call_operator__Group_3__1__Impl_in_rule__Call_operator__Group_3__14926);
            rule__Call_operator__Group_3__1__Impl();

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
    // $ANTLR end "rule__Call_operator__Group_3__1"


    // $ANTLR start "rule__Call_operator__Group_3__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2375:1: rule__Call_operator__Group_3__1__Impl : ( ( rule__Call_operator__Group_3_1__0 )* ) ;
    public final void rule__Call_operator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2379:1: ( ( ( rule__Call_operator__Group_3_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2380:1: ( ( rule__Call_operator__Group_3_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2380:1: ( ( rule__Call_operator__Group_3_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2381:1: ( rule__Call_operator__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCall_operatorAccess().getGroup_3_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2382:1: ( rule__Call_operator__Group_3_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==8) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2382:2: rule__Call_operator__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Call_operator__Group_3_1__0_in_rule__Call_operator__Group_3__1__Impl4953);
            	    rule__Call_operator__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCall_operatorAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call_operator__Group_3__1__Impl"


    // $ANTLR start "rule__Call_operator__Group_3_1__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2396:1: rule__Call_operator__Group_3_1__0 : rule__Call_operator__Group_3_1__0__Impl rule__Call_operator__Group_3_1__1 ;
    public final void rule__Call_operator__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2400:1: ( rule__Call_operator__Group_3_1__0__Impl rule__Call_operator__Group_3_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2401:2: rule__Call_operator__Group_3_1__0__Impl rule__Call_operator__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Call_operator__Group_3_1__0__Impl_in_rule__Call_operator__Group_3_1__04988);
            rule__Call_operator__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Call_operator__Group_3_1__1_in_rule__Call_operator__Group_3_1__04991);
            rule__Call_operator__Group_3_1__1();

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
    // $ANTLR end "rule__Call_operator__Group_3_1__0"


    // $ANTLR start "rule__Call_operator__Group_3_1__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2408:1: rule__Call_operator__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Call_operator__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2412:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2413:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2413:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2414:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCall_operatorAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,8,FOLLOW_8_in_rule__Call_operator__Group_3_1__0__Impl5019); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCall_operatorAccess().getCommaKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call_operator__Group_3_1__0__Impl"


    // $ANTLR start "rule__Call_operator__Group_3_1__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2427:1: rule__Call_operator__Group_3_1__1 : rule__Call_operator__Group_3_1__1__Impl ;
    public final void rule__Call_operator__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2431:1: ( rule__Call_operator__Group_3_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2432:2: rule__Call_operator__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Call_operator__Group_3_1__1__Impl_in_rule__Call_operator__Group_3_1__15050);
            rule__Call_operator__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__Call_operator__Group_3_1__1"


    // $ANTLR start "rule__Call_operator__Group_3_1__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2438:1: rule__Call_operator__Group_3_1__1__Impl : ( rulePrimary_expr ) ;
    public final void rule__Call_operator__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2442:1: ( ( rulePrimary_expr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2443:1: ( rulePrimary_expr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2443:1: ( rulePrimary_expr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2444:1: rulePrimary_expr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCall_operatorAccess().getPrimary_exprParserRuleCall_3_1_1()); 
            }
            pushFollow(FOLLOW_rulePrimary_expr_in_rule__Call_operator__Group_3_1__1__Impl5077);
            rulePrimary_expr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCall_operatorAccess().getPrimary_exprParserRuleCall_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Call_operator__Group_3_1__1__Impl"


    // $ANTLR start "rule__Predicate__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2459:1: rule__Predicate__Group__0 : rule__Predicate__Group__0__Impl rule__Predicate__Group__1 ;
    public final void rule__Predicate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2463:1: ( rule__Predicate__Group__0__Impl rule__Predicate__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2464:2: rule__Predicate__Group__0__Impl rule__Predicate__Group__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__05110);
            rule__Predicate__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__05113);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2471:1: rule__Predicate__Group__0__Impl : ( rulePred_tbl ) ;
    public final void rule__Predicate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2475:1: ( ( rulePred_tbl ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2476:1: ( rulePred_tbl )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2476:1: ( rulePred_tbl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2477:1: rulePred_tbl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPred_tblParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePred_tbl_in_rule__Predicate__Group__0__Impl5140);
            rulePred_tbl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getPred_tblParserRuleCall_0()); 
            }

            }


            }

        }
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2488:1: rule__Predicate__Group__1 : rule__Predicate__Group__1__Impl rule__Predicate__Group__2 ;
    public final void rule__Predicate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2492:1: ( rule__Predicate__Group__1__Impl rule__Predicate__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2493:2: rule__Predicate__Group__1__Impl rule__Predicate__Group__2
            {
            pushFollow(FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__15169);
            rule__Predicate__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__2_in_rule__Predicate__Group__15172);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2500:1: rule__Predicate__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Predicate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2504:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2505:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2505:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2506:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2507:1: ( RULE_WSP )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_WSP) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2507:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Predicate__Group__1__Impl5200); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2517:1: rule__Predicate__Group__2 : rule__Predicate__Group__2__Impl rule__Predicate__Group__3 ;
    public final void rule__Predicate__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2521:1: ( rule__Predicate__Group__2__Impl rule__Predicate__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2522:2: rule__Predicate__Group__2__Impl rule__Predicate__Group__3
            {
            pushFollow(FOLLOW_rule__Predicate__Group__2__Impl_in_rule__Predicate__Group__25231);
            rule__Predicate__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__3_in_rule__Predicate__Group__25234);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2529:1: rule__Predicate__Group__2__Impl : ( '(' ) ;
    public final void rule__Predicate__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2533:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2534:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2534:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2535:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__Predicate__Group__2__Impl5262); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2548:1: rule__Predicate__Group__3 : rule__Predicate__Group__3__Impl rule__Predicate__Group__4 ;
    public final void rule__Predicate__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2552:1: ( rule__Predicate__Group__3__Impl rule__Predicate__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2553:2: rule__Predicate__Group__3__Impl rule__Predicate__Group__4
            {
            pushFollow(FOLLOW_rule__Predicate__Group__3__Impl_in_rule__Predicate__Group__35293);
            rule__Predicate__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group__4_in_rule__Predicate__Group__35296);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2560:1: rule__Predicate__Group__3__Impl : ( ( rule__Predicate__Group_3__0 )? ) ;
    public final void rule__Predicate__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2564:1: ( ( ( rule__Predicate__Group_3__0 )? ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2565:1: ( ( rule__Predicate__Group_3__0 )? )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2565:1: ( ( rule__Predicate__Group_3__0 )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2566:1: ( rule__Predicate__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getGroup_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2567:1: ( rule__Predicate__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_WSP||(LA28_0>=36 && LA28_0<=39)||LA28_0==51||LA28_0==54) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2567:2: rule__Predicate__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Predicate__Group_3__0_in_rule__Predicate__Group__3__Impl5323);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2577:1: rule__Predicate__Group__4 : rule__Predicate__Group__4__Impl ;
    public final void rule__Predicate__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2581:1: ( rule__Predicate__Group__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2582:2: rule__Predicate__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group__4__Impl_in_rule__Predicate__Group__45354);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2588:1: rule__Predicate__Group__4__Impl : ( ')' ) ;
    public final void rule__Predicate__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2592:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2593:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2593:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2594:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__Predicate__Group__4__Impl5382); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2617:1: rule__Predicate__Group_3__0 : rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 ;
    public final void rule__Predicate__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2621:1: ( rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2622:2: rule__Predicate__Group_3__0__Impl rule__Predicate__Group_3__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3__0__Impl_in_rule__Predicate__Group_3__05423);
            rule__Predicate__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group_3__1_in_rule__Predicate__Group_3__05426);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2629:1: rule__Predicate__Group_3__0__Impl : ( rulePrimary_expr ) ;
    public final void rule__Predicate__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2633:1: ( ( rulePrimary_expr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2634:1: ( rulePrimary_expr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2634:1: ( rulePrimary_expr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2635:1: rulePrimary_expr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPrimary_exprParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_rulePrimary_expr_in_rule__Predicate__Group_3__0__Impl5453);
            rulePrimary_expr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getPrimary_exprParserRuleCall_3_0()); 
            }

            }


            }

        }
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2646:1: rule__Predicate__Group_3__1 : rule__Predicate__Group_3__1__Impl ;
    public final void rule__Predicate__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2650:1: ( rule__Predicate__Group_3__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2651:2: rule__Predicate__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3__1__Impl_in_rule__Predicate__Group_3__15482);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2657:1: rule__Predicate__Group_3__1__Impl : ( ( rule__Predicate__Group_3_1__0 )* ) ;
    public final void rule__Predicate__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2661:1: ( ( ( rule__Predicate__Group_3_1__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2662:1: ( ( rule__Predicate__Group_3_1__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2662:1: ( ( rule__Predicate__Group_3_1__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2663:1: ( rule__Predicate__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getGroup_3_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2664:1: ( rule__Predicate__Group_3_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==8) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2664:2: rule__Predicate__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Predicate__Group_3_1__0_in_rule__Predicate__Group_3__1__Impl5509);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2678:1: rule__Predicate__Group_3_1__0 : rule__Predicate__Group_3_1__0__Impl rule__Predicate__Group_3_1__1 ;
    public final void rule__Predicate__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2682:1: ( rule__Predicate__Group_3_1__0__Impl rule__Predicate__Group_3_1__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2683:2: rule__Predicate__Group_3_1__0__Impl rule__Predicate__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3_1__0__Impl_in_rule__Predicate__Group_3_1__05544);
            rule__Predicate__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Predicate__Group_3_1__1_in_rule__Predicate__Group_3_1__05547);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2690:1: rule__Predicate__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Predicate__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2694:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2695:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2695:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2696:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,8,FOLLOW_8_in_rule__Predicate__Group_3_1__0__Impl5575); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2709:1: rule__Predicate__Group_3_1__1 : rule__Predicate__Group_3_1__1__Impl ;
    public final void rule__Predicate__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2713:1: ( rule__Predicate__Group_3_1__1__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2714:2: rule__Predicate__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Predicate__Group_3_1__1__Impl_in_rule__Predicate__Group_3_1__15606);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2720:1: rule__Predicate__Group_3_1__1__Impl : ( rulePrimary_expr ) ;
    public final void rule__Predicate__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2724:1: ( ( rulePrimary_expr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2725:1: ( rulePrimary_expr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2725:1: ( rulePrimary_expr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2726:1: rulePrimary_expr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPredicateAccess().getPrimary_exprParserRuleCall_3_1_1()); 
            }
            pushFollow(FOLLOW_rulePrimary_expr_in_rule__Predicate__Group_3_1__1__Impl5633);
            rulePrimary_expr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPredicateAccess().getPrimary_exprParserRuleCall_3_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Primary_expr__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2741:1: rule__Primary_expr__Group__0 : rule__Primary_expr__Group__0__Impl rule__Primary_expr__Group__1 ;
    public final void rule__Primary_expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2745:1: ( rule__Primary_expr__Group__0__Impl rule__Primary_expr__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2746:2: rule__Primary_expr__Group__0__Impl rule__Primary_expr__Group__1
            {
            pushFollow(FOLLOW_rule__Primary_expr__Group__0__Impl_in_rule__Primary_expr__Group__05666);
            rule__Primary_expr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Primary_expr__Group__1_in_rule__Primary_expr__Group__05669);
            rule__Primary_expr__Group__1();

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
    // $ANTLR end "rule__Primary_expr__Group__0"


    // $ANTLR start "rule__Primary_expr__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2753:1: rule__Primary_expr__Group__0__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Primary_expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2757:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2758:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2758:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2759:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimary_exprAccess().getWSPTerminalRuleCall_0()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2760:1: ( RULE_WSP )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_WSP) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2760:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Primary_expr__Group__0__Impl5697); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimary_exprAccess().getWSPTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group__0__Impl"


    // $ANTLR start "rule__Primary_expr__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2770:1: rule__Primary_expr__Group__1 : rule__Primary_expr__Group__1__Impl rule__Primary_expr__Group__2 ;
    public final void rule__Primary_expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2774:1: ( rule__Primary_expr__Group__1__Impl rule__Primary_expr__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2775:2: rule__Primary_expr__Group__1__Impl rule__Primary_expr__Group__2
            {
            pushFollow(FOLLOW_rule__Primary_expr__Group__1__Impl_in_rule__Primary_expr__Group__15728);
            rule__Primary_expr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Primary_expr__Group__2_in_rule__Primary_expr__Group__15731);
            rule__Primary_expr__Group__2();

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
    // $ANTLR end "rule__Primary_expr__Group__1"


    // $ANTLR start "rule__Primary_expr__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2782:1: rule__Primary_expr__Group__1__Impl : ( ( rule__Primary_expr__Alternatives_1 ) ) ;
    public final void rule__Primary_expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2786:1: ( ( ( rule__Primary_expr__Alternatives_1 ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2787:1: ( ( rule__Primary_expr__Alternatives_1 ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2787:1: ( ( rule__Primary_expr__Alternatives_1 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2788:1: ( rule__Primary_expr__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimary_exprAccess().getAlternatives_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2789:1: ( rule__Primary_expr__Alternatives_1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2789:2: rule__Primary_expr__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Primary_expr__Alternatives_1_in_rule__Primary_expr__Group__1__Impl5758);
            rule__Primary_expr__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimary_exprAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group__1__Impl"


    // $ANTLR start "rule__Primary_expr__Group__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2799:1: rule__Primary_expr__Group__2 : rule__Primary_expr__Group__2__Impl ;
    public final void rule__Primary_expr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2803:1: ( rule__Primary_expr__Group__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2804:2: rule__Primary_expr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary_expr__Group__2__Impl_in_rule__Primary_expr__Group__25788);
            rule__Primary_expr__Group__2__Impl();

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
    // $ANTLR end "rule__Primary_expr__Group__2"


    // $ANTLR start "rule__Primary_expr__Group__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2810:1: rule__Primary_expr__Group__2__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Primary_expr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2814:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2815:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2815:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2816:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimary_exprAccess().getWSPTerminalRuleCall_2()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2817:1: ( RULE_WSP )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_WSP) ) {
                    int LA31_2 = input.LA(2);

                    if ( (synpred62_InternalRQL()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2817:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Primary_expr__Group__2__Impl5816); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimary_exprAccess().getWSPTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group__2__Impl"


    // $ANTLR start "rule__Primary_expr__Group_1_0__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2833:1: rule__Primary_expr__Group_1_0__0 : rule__Primary_expr__Group_1_0__0__Impl rule__Primary_expr__Group_1_0__1 ;
    public final void rule__Primary_expr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2837:1: ( rule__Primary_expr__Group_1_0__0__Impl rule__Primary_expr__Group_1_0__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2838:2: rule__Primary_expr__Group_1_0__0__Impl rule__Primary_expr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Primary_expr__Group_1_0__0__Impl_in_rule__Primary_expr__Group_1_0__05853);
            rule__Primary_expr__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Primary_expr__Group_1_0__1_in_rule__Primary_expr__Group_1_0__05856);
            rule__Primary_expr__Group_1_0__1();

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
    // $ANTLR end "rule__Primary_expr__Group_1_0__0"


    // $ANTLR start "rule__Primary_expr__Group_1_0__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2845:1: rule__Primary_expr__Group_1_0__0__Impl : ( ruleConst_func_tbl ) ;
    public final void rule__Primary_expr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2849:1: ( ( ruleConst_func_tbl ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2850:1: ( ruleConst_func_tbl )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2850:1: ( ruleConst_func_tbl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2851:1: ruleConst_func_tbl
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimary_exprAccess().getConst_func_tblParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleConst_func_tbl_in_rule__Primary_expr__Group_1_0__0__Impl5883);
            ruleConst_func_tbl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimary_exprAccess().getConst_func_tblParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group_1_0__0__Impl"


    // $ANTLR start "rule__Primary_expr__Group_1_0__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2862:1: rule__Primary_expr__Group_1_0__1 : rule__Primary_expr__Group_1_0__1__Impl rule__Primary_expr__Group_1_0__2 ;
    public final void rule__Primary_expr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2866:1: ( rule__Primary_expr__Group_1_0__1__Impl rule__Primary_expr__Group_1_0__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2867:2: rule__Primary_expr__Group_1_0__1__Impl rule__Primary_expr__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__Primary_expr__Group_1_0__1__Impl_in_rule__Primary_expr__Group_1_0__15912);
            rule__Primary_expr__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Primary_expr__Group_1_0__2_in_rule__Primary_expr__Group_1_0__15915);
            rule__Primary_expr__Group_1_0__2();

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
    // $ANTLR end "rule__Primary_expr__Group_1_0__1"


    // $ANTLR start "rule__Primary_expr__Group_1_0__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2874:1: rule__Primary_expr__Group_1_0__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Primary_expr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2878:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2879:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2879:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2880:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimary_exprAccess().getWSPTerminalRuleCall_1_0_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2881:1: ( RULE_WSP )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WSP) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2881:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Primary_expr__Group_1_0__1__Impl5943); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimary_exprAccess().getWSPTerminalRuleCall_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group_1_0__1__Impl"


    // $ANTLR start "rule__Primary_expr__Group_1_0__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2891:1: rule__Primary_expr__Group_1_0__2 : rule__Primary_expr__Group_1_0__2__Impl rule__Primary_expr__Group_1_0__3 ;
    public final void rule__Primary_expr__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2895:1: ( rule__Primary_expr__Group_1_0__2__Impl rule__Primary_expr__Group_1_0__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2896:2: rule__Primary_expr__Group_1_0__2__Impl rule__Primary_expr__Group_1_0__3
            {
            pushFollow(FOLLOW_rule__Primary_expr__Group_1_0__2__Impl_in_rule__Primary_expr__Group_1_0__25974);
            rule__Primary_expr__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Primary_expr__Group_1_0__3_in_rule__Primary_expr__Group_1_0__25977);
            rule__Primary_expr__Group_1_0__3();

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
    // $ANTLR end "rule__Primary_expr__Group_1_0__2"


    // $ANTLR start "rule__Primary_expr__Group_1_0__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2903:1: rule__Primary_expr__Group_1_0__2__Impl : ( '(' ) ;
    public final void rule__Primary_expr__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2907:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2908:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2908:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2909:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_1_0_2()); 
            }
            match(input,51,FOLLOW_51_in_rule__Primary_expr__Group_1_0__2__Impl6005); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group_1_0__2__Impl"


    // $ANTLR start "rule__Primary_expr__Group_1_0__3"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2922:1: rule__Primary_expr__Group_1_0__3 : rule__Primary_expr__Group_1_0__3__Impl rule__Primary_expr__Group_1_0__4 ;
    public final void rule__Primary_expr__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2926:1: ( rule__Primary_expr__Group_1_0__3__Impl rule__Primary_expr__Group_1_0__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2927:2: rule__Primary_expr__Group_1_0__3__Impl rule__Primary_expr__Group_1_0__4
            {
            pushFollow(FOLLOW_rule__Primary_expr__Group_1_0__3__Impl_in_rule__Primary_expr__Group_1_0__36036);
            rule__Primary_expr__Group_1_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Primary_expr__Group_1_0__4_in_rule__Primary_expr__Group_1_0__36039);
            rule__Primary_expr__Group_1_0__4();

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
    // $ANTLR end "rule__Primary_expr__Group_1_0__3"


    // $ANTLR start "rule__Primary_expr__Group_1_0__3__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2934:1: rule__Primary_expr__Group_1_0__3__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Primary_expr__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2938:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2939:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2939:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2940:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimary_exprAccess().getWSPTerminalRuleCall_1_0_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2941:1: ( RULE_WSP )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WSP) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2941:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Primary_expr__Group_1_0__3__Impl6067); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimary_exprAccess().getWSPTerminalRuleCall_1_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group_1_0__3__Impl"


    // $ANTLR start "rule__Primary_expr__Group_1_0__4"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2951:1: rule__Primary_expr__Group_1_0__4 : rule__Primary_expr__Group_1_0__4__Impl ;
    public final void rule__Primary_expr__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2955:1: ( rule__Primary_expr__Group_1_0__4__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2956:2: rule__Primary_expr__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_rule__Primary_expr__Group_1_0__4__Impl_in_rule__Primary_expr__Group_1_0__46098);
            rule__Primary_expr__Group_1_0__4__Impl();

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
    // $ANTLR end "rule__Primary_expr__Group_1_0__4"


    // $ANTLR start "rule__Primary_expr__Group_1_0__4__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2962:1: rule__Primary_expr__Group_1_0__4__Impl : ( ')' ) ;
    public final void rule__Primary_expr__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2966:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2967:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2967:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2968:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimary_exprAccess().getRightParenthesisKeyword_1_0_4()); 
            }
            match(input,52,FOLLOW_52_in_rule__Primary_expr__Group_1_0__4__Impl6126); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimary_exprAccess().getRightParenthesisKeyword_1_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group_1_0__4__Impl"


    // $ANTLR start "rule__Array__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2991:1: rule__Array__Group__0 : rule__Array__Group__0__Impl rule__Array__Group__1 ;
    public final void rule__Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2995:1: ( rule__Array__Group__0__Impl rule__Array__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2996:2: rule__Array__Group__0__Impl rule__Array__Group__1
            {
            pushFollow(FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__06167);
            rule__Array__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__1_in_rule__Array__Group__06170);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3003:1: rule__Array__Group__0__Impl : ( '(' ) ;
    public final void rule__Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3007:1: ( ( '(' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3008:1: ( '(' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3008:1: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3009:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getLeftParenthesisKeyword_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__Array__Group__0__Impl6198); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3022:1: rule__Array__Group__1 : rule__Array__Group__1__Impl rule__Array__Group__2 ;
    public final void rule__Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3026:1: ( rule__Array__Group__1__Impl rule__Array__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3027:2: rule__Array__Group__1__Impl rule__Array__Group__2
            {
            pushFollow(FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__16229);
            rule__Array__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__2_in_rule__Array__Group__16232);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3034:1: rule__Array__Group__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3038:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3039:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3039:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3040:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3041:1: ( RULE_WSP )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_WSP) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3041:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group__1__Impl6260); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3051:1: rule__Array__Group__2 : rule__Array__Group__2__Impl rule__Array__Group__3 ;
    public final void rule__Array__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3055:1: ( rule__Array__Group__2__Impl rule__Array__Group__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3056:2: rule__Array__Group__2__Impl rule__Array__Group__3
            {
            pushFollow(FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__26291);
            rule__Array__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__3_in_rule__Array__Group__26294);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3063:1: rule__Array__Group__2__Impl : ( ruleStrval ) ;
    public final void rule__Array__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3067:1: ( ( ruleStrval ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3068:1: ( ruleStrval )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3068:1: ( ruleStrval )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3069:1: ruleStrval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getStrvalParserRuleCall_2()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_rule__Array__Group__2__Impl6321);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3080:1: rule__Array__Group__3 : rule__Array__Group__3__Impl rule__Array__Group__4 ;
    public final void rule__Array__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3084:1: ( rule__Array__Group__3__Impl rule__Array__Group__4 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3085:2: rule__Array__Group__3__Impl rule__Array__Group__4
            {
            pushFollow(FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__36350);
            rule__Array__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__4_in_rule__Array__Group__36353);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3092:1: rule__Array__Group__3__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3096:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3097:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3097:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3098:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3099:1: ( RULE_WSP )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_WSP) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3099:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group__3__Impl6381); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3109:1: rule__Array__Group__4 : rule__Array__Group__4__Impl rule__Array__Group__5 ;
    public final void rule__Array__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3113:1: ( rule__Array__Group__4__Impl rule__Array__Group__5 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3114:2: rule__Array__Group__4__Impl rule__Array__Group__5
            {
            pushFollow(FOLLOW_rule__Array__Group__4__Impl_in_rule__Array__Group__46412);
            rule__Array__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group__5_in_rule__Array__Group__46415);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3121:1: rule__Array__Group__4__Impl : ( ( rule__Array__Group_4__0 )* ) ;
    public final void rule__Array__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3125:1: ( ( ( rule__Array__Group_4__0 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3126:1: ( ( rule__Array__Group_4__0 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3126:1: ( ( rule__Array__Group_4__0 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3127:1: ( rule__Array__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getGroup_4()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3128:1: ( rule__Array__Group_4__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==8) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3128:2: rule__Array__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Array__Group_4__0_in_rule__Array__Group__4__Impl6442);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3138:1: rule__Array__Group__5 : rule__Array__Group__5__Impl ;
    public final void rule__Array__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3142:1: ( rule__Array__Group__5__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3143:2: rule__Array__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group__5__Impl_in_rule__Array__Group__56473);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3149:1: rule__Array__Group__5__Impl : ( ')' ) ;
    public final void rule__Array__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3153:1: ( ( ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3154:1: ( ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3154:1: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3155:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,52,FOLLOW_52_in_rule__Array__Group__5__Impl6501); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3180:1: rule__Array__Group_4__0 : rule__Array__Group_4__0__Impl rule__Array__Group_4__1 ;
    public final void rule__Array__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3184:1: ( rule__Array__Group_4__0__Impl rule__Array__Group_4__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3185:2: rule__Array__Group_4__0__Impl rule__Array__Group_4__1
            {
            pushFollow(FOLLOW_rule__Array__Group_4__0__Impl_in_rule__Array__Group_4__06544);
            rule__Array__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group_4__1_in_rule__Array__Group_4__06547);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3192:1: rule__Array__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Array__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3196:1: ( ( ',' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3197:1: ( ',' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3197:1: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3198:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getCommaKeyword_4_0()); 
            }
            match(input,8,FOLLOW_8_in_rule__Array__Group_4__0__Impl6575); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3211:1: rule__Array__Group_4__1 : rule__Array__Group_4__1__Impl rule__Array__Group_4__2 ;
    public final void rule__Array__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3215:1: ( rule__Array__Group_4__1__Impl rule__Array__Group_4__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3216:2: rule__Array__Group_4__1__Impl rule__Array__Group_4__2
            {
            pushFollow(FOLLOW_rule__Array__Group_4__1__Impl_in_rule__Array__Group_4__16606);
            rule__Array__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group_4__2_in_rule__Array__Group_4__16609);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3223:1: rule__Array__Group_4__1__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3227:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3228:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3228:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3229:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3230:1: ( RULE_WSP )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_WSP) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3230:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group_4__1__Impl6637); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3240:1: rule__Array__Group_4__2 : rule__Array__Group_4__2__Impl rule__Array__Group_4__3 ;
    public final void rule__Array__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3244:1: ( rule__Array__Group_4__2__Impl rule__Array__Group_4__3 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3245:2: rule__Array__Group_4__2__Impl rule__Array__Group_4__3
            {
            pushFollow(FOLLOW_rule__Array__Group_4__2__Impl_in_rule__Array__Group_4__26668);
            rule__Array__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Array__Group_4__3_in_rule__Array__Group_4__26671);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3252:1: rule__Array__Group_4__2__Impl : ( ruleStrval ) ;
    public final void rule__Array__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3256:1: ( ( ruleStrval ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3257:1: ( ruleStrval )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3257:1: ( ruleStrval )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3258:1: ruleStrval
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getStrvalParserRuleCall_4_2()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_rule__Array__Group_4__2__Impl6698);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3269:1: rule__Array__Group_4__3 : rule__Array__Group_4__3__Impl ;
    public final void rule__Array__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3273:1: ( rule__Array__Group_4__3__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3274:2: rule__Array__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Array__Group_4__3__Impl_in_rule__Array__Group_4__36727);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3280:1: rule__Array__Group_4__3__Impl : ( ( RULE_WSP )* ) ;
    public final void rule__Array__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3284:1: ( ( ( RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3285:1: ( ( RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3285:1: ( ( RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3286:1: ( RULE_WSP )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_3()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3287:1: ( RULE_WSP )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_WSP) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3287:3: RULE_WSP
            	    {
            	    match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rule__Array__Group_4__3__Impl6755); if (state.failed) return ;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3305:1: rule__Pct_encoded__Group__0 : rule__Pct_encoded__Group__0__Impl rule__Pct_encoded__Group__1 ;
    public final void rule__Pct_encoded__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3309:1: ( rule__Pct_encoded__Group__0__Impl rule__Pct_encoded__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3310:2: rule__Pct_encoded__Group__0__Impl rule__Pct_encoded__Group__1
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__0__Impl_in_rule__Pct_encoded__Group__06794);
            rule__Pct_encoded__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pct_encoded__Group__1_in_rule__Pct_encoded__Group__06797);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3317:1: rule__Pct_encoded__Group__0__Impl : ( '%' ) ;
    public final void rule__Pct_encoded__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3321:1: ( ( '%' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3322:1: ( '%' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3322:1: ( '%' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3323:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getPercentSignKeyword_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__Pct_encoded__Group__0__Impl6825); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3336:1: rule__Pct_encoded__Group__1 : rule__Pct_encoded__Group__1__Impl rule__Pct_encoded__Group__2 ;
    public final void rule__Pct_encoded__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3340:1: ( rule__Pct_encoded__Group__1__Impl rule__Pct_encoded__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3341:2: rule__Pct_encoded__Group__1__Impl rule__Pct_encoded__Group__2
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__1__Impl_in_rule__Pct_encoded__Group__16856);
            rule__Pct_encoded__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Pct_encoded__Group__2_in_rule__Pct_encoded__Group__16859);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3348:1: rule__Pct_encoded__Group__1__Impl : ( RULE_XDIGIT ) ;
    public final void rule__Pct_encoded__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3352:1: ( ( RULE_XDIGIT ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3353:1: ( RULE_XDIGIT )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3353:1: ( RULE_XDIGIT )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3354:1: RULE_XDIGIT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_1()); 
            }
            match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__1__Impl6886); if (state.failed) return ;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3365:1: rule__Pct_encoded__Group__2 : rule__Pct_encoded__Group__2__Impl ;
    public final void rule__Pct_encoded__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3369:1: ( rule__Pct_encoded__Group__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3370:2: rule__Pct_encoded__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Pct_encoded__Group__2__Impl_in_rule__Pct_encoded__Group__26915);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3376:1: rule__Pct_encoded__Group__2__Impl : ( RULE_XDIGIT ) ;
    public final void rule__Pct_encoded__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3380:1: ( ( RULE_XDIGIT ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3381:1: ( RULE_XDIGIT )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3381:1: ( RULE_XDIGIT )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3382:1: RULE_XDIGIT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_2()); 
            }
            match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__2__Impl6942); if (state.failed) return ;
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


    // $ANTLR start "rule__Strval__Group__0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3399:1: rule__Strval__Group__0 : rule__Strval__Group__0__Impl rule__Strval__Group__1 ;
    public final void rule__Strval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3403:1: ( rule__Strval__Group__0__Impl rule__Strval__Group__1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3404:2: rule__Strval__Group__0__Impl rule__Strval__Group__1
            {
            pushFollow(FOLLOW_rule__Strval__Group__0__Impl_in_rule__Strval__Group__06977);
            rule__Strval__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Strval__Group__1_in_rule__Strval__Group__06980);
            rule__Strval__Group__1();

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
    // $ANTLR end "rule__Strval__Group__0"


    // $ANTLR start "rule__Strval__Group__0__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3411:1: rule__Strval__Group__0__Impl : ( '\"' ) ;
    public final void rule__Strval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3415:1: ( ( '\"' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3416:1: ( '\"' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3416:1: ( '\"' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3417:1: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrvalAccess().getQuotationMarkKeyword_0()); 
            }
            match(input,54,FOLLOW_54_in_rule__Strval__Group__0__Impl7008); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrvalAccess().getQuotationMarkKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strval__Group__0__Impl"


    // $ANTLR start "rule__Strval__Group__1"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3430:1: rule__Strval__Group__1 : rule__Strval__Group__1__Impl rule__Strval__Group__2 ;
    public final void rule__Strval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3434:1: ( rule__Strval__Group__1__Impl rule__Strval__Group__2 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3435:2: rule__Strval__Group__1__Impl rule__Strval__Group__2
            {
            pushFollow(FOLLOW_rule__Strval__Group__1__Impl_in_rule__Strval__Group__17039);
            rule__Strval__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Strval__Group__2_in_rule__Strval__Group__17042);
            rule__Strval__Group__2();

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
    // $ANTLR end "rule__Strval__Group__1"


    // $ANTLR start "rule__Strval__Group__1__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3442:1: rule__Strval__Group__1__Impl : ( ( ( rule__Strval__Alternatives_1 ) ) ( ( rule__Strval__Alternatives_1 )* ) ) ;
    public final void rule__Strval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3446:1: ( ( ( ( rule__Strval__Alternatives_1 ) ) ( ( rule__Strval__Alternatives_1 )* ) ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3447:1: ( ( ( rule__Strval__Alternatives_1 ) ) ( ( rule__Strval__Alternatives_1 )* ) )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3447:1: ( ( ( rule__Strval__Alternatives_1 ) ) ( ( rule__Strval__Alternatives_1 )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3448:1: ( ( rule__Strval__Alternatives_1 ) ) ( ( rule__Strval__Alternatives_1 )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3448:1: ( ( rule__Strval__Alternatives_1 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3449:1: ( rule__Strval__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrvalAccess().getAlternatives_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3450:1: ( rule__Strval__Alternatives_1 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3450:2: rule__Strval__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Strval__Alternatives_1_in_rule__Strval__Group__1__Impl7071);
            rule__Strval__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrvalAccess().getAlternatives_1()); 
            }

            }

            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3453:1: ( ( rule__Strval__Alternatives_1 )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3454:1: ( rule__Strval__Alternatives_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrvalAccess().getAlternatives_1()); 
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3455:1: ( rule__Strval__Alternatives_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_ALPHA && LA39_0<=RULE_DIGIT)||(LA39_0>=40 && LA39_0<=50)||LA39_0==53) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3455:2: rule__Strval__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Strval__Alternatives_1_in_rule__Strval__Group__1__Impl7083);
            	    rule__Strval__Alternatives_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrvalAccess().getAlternatives_1()); 
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
    // $ANTLR end "rule__Strval__Group__1__Impl"


    // $ANTLR start "rule__Strval__Group__2"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3466:1: rule__Strval__Group__2 : rule__Strval__Group__2__Impl ;
    public final void rule__Strval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3470:1: ( rule__Strval__Group__2__Impl )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3471:2: rule__Strval__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Strval__Group__2__Impl_in_rule__Strval__Group__27116);
            rule__Strval__Group__2__Impl();

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
    // $ANTLR end "rule__Strval__Group__2"


    // $ANTLR start "rule__Strval__Group__2__Impl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3477:1: rule__Strval__Group__2__Impl : ( '\"' ) ;
    public final void rule__Strval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3481:1: ( ( '\"' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3482:1: ( '\"' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3482:1: ( '\"' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3483:1: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStrvalAccess().getQuotationMarkKeyword_2()); 
            }
            match(input,54,FOLLOW_54_in_rule__Strval__Group__2__Impl7144); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStrvalAccess().getQuotationMarkKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Strval__Group__2__Impl"


    // $ANTLR start "rule__Model__OperandsAssignment_0"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3503:1: rule__Model__OperandsAssignment_0 : ( ruleHo_operand ) ;
    public final void rule__Model__OperandsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3507:1: ( ( ruleHo_operand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3508:1: ( ruleHo_operand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3508:1: ( ruleHo_operand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3509:1: ruleHo_operand
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getOperandsHo_operandParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleHo_operand_in_rule__Model__OperandsAssignment_07186);
            ruleHo_operand();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getOperandsHo_operandParserRuleCall_0_0()); 
            }

            }


            }

        }
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

    // $ANTLR start synpred62_InternalRQL
    public final void synpred62_InternalRQL_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2817:3: ( RULE_WSP )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:2817:3: RULE_WSP
        {
        match(input,RULE_WSP,FOLLOW_RULE_WSP_in_synpred62_InternalRQL5816); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalRQL

    // Delegated rules

    public final boolean synpred62_InternalRQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalRQL_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruleHo_operand_in_entryRuleHo_operand247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHo_operand254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group__0_in_ruleHo_operand280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_op_aliases_in_entryRuleLogical_op_aliases307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogical_op_aliases314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Logical_op_aliases__Alternatives_in_ruleLogical_op_aliases340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHigher_order_call_in_entryRuleHigher_order_call367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHigher_order_call374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group__0_in_ruleHigher_order_call400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_op_aliases_in_entryRuleBinary_op_aliases427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinary_op_aliases434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Binary_op_aliases__Alternatives_in_ruleBinary_op_aliases460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComp_ops_in_entryRuleComp_ops487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComp_ops494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comp_ops__Alternatives_in_ruleComp_ops520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0_in_ruleComparison580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_operator_in_entryRuleCall_operator607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall_operator614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call_operator__Group__0_in_ruleCall_operator640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePred_tbl_in_entryRulePred_tbl667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePred_tbl674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pred_tbl__Alternatives_in_rulePred_tbl700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__0_in_rulePredicate760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_entryRulePrimary_expr787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary_expr794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group__0_in_rulePrimary_expr820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctions_tbl_in_entryRuleFunctions_tbl847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctions_tbl854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Functions_tbl__Alternatives_in_ruleFunctions_tbl880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConst_func_tbl_in_entryRuleConst_func_tbl907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConst_func_tbl914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Const_func_tbl__Alternatives_in_ruleConst_func_tbl940 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__Strval__Group__0_in_ruleStrval1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Model__Alternatives_1_01217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Model__Alternatives_1_01237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Or__Alternatives_01272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Or__Alternatives_01292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHigher_order_call_in_rule__Ho_operand__Alternatives_11326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_operator_in_rule__Ho_operand__Alternatives_11343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_rule__Ho_operand__Alternatives_11360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_rule__Ho_operand__Alternatives_11377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group_1_4__0_in_rule__Ho_operand__Alternatives_11394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Ho_operand__Alternatives_1_4_21430 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleAnd_in_rule__Ho_operand__Alternatives_1_4_21443 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_ruleOr_in_rule__Ho_operand__Alternatives_1_4_21467 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_ruleOr_in_rule__Ho_operand__Alternatives_1_4_21480 = new BitSet(new long[]{0x0000000000000C02L});
    public static final BitSet FOLLOW_12_in_rule__Logical_op_aliases__Alternatives1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Logical_op_aliases__Alternatives1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Logical_op_aliases__Alternatives1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Binary_op_aliases__Alternatives1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Binary_op_aliases__Alternatives1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Binary_op_aliases__Alternatives1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Binary_op_aliases__Alternatives1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Binary_op_aliases__Alternatives1672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Binary_op_aliases__Alternatives1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Binary_op_aliases__Alternatives1712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Comp_ops__Alternatives1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Comp_ops__Alternatives1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Comp_ops__Alternatives1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Comp_ops__Alternatives1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Comp_ops__Alternatives1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Comp_ops__Alternatives1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_2_0__0_in_rule__Comparison__Alternatives_21881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComp_ops_in_rule__Comparison__Alternatives_21899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_op_aliases_in_rule__Call_operator__Alternatives_01931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctions_tbl_in_rule__Call_operator__Alternatives_01948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Pred_tbl__Alternatives1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Pred_tbl__Alternatives2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Pred_tbl__Alternatives2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Pred_tbl__Alternatives2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Pred_tbl__Alternatives2061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1_0__0_in_rule__Primary_expr__Alternatives_12095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rule__Primary_expr__Alternatives_12113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__Primary_expr__Alternatives_12130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Functions_tbl__Alternatives2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Functions_tbl__Alternatives2183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Functions_tbl__Alternatives2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Const_func_tbl__Alternatives2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Const_func_tbl__Alternatives2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Const_func_tbl__Alternatives2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Const_func_tbl__Alternatives2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_rule__Nchar__Alternatives2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_rule__Nchar__Alternatives2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Nchar__Alternatives2367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Nchar__Alternatives2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Nchar__Alternatives2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Nchar__Alternatives2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Nchar__Alternatives2447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Nchar__Alternatives2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Nchar__Alternatives2487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Nchar__Alternatives2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Nchar__Alternatives2527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Nchar__Alternatives2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Nchar__Alternatives2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNchar_in_rule__Strval__Alternatives_12601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePct_encoded_in_rule__Strval__Alternatives_12618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02648 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__OperandsAssignment_0_in_rule__Model__Group__0__Impl2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0_in_rule__Model__Group__1__Impl2735 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_rule__Model__Group_1__0__Impl_in_rule__Model__Group_1__02770 = new BitSet(new long[]{0x0048000FF03FF040L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1_in_rule__Model__Group_1__02773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_1_0_in_rule__Model__Group_1__0__Impl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_1__1__Impl_in_rule__Model__Group_1__12830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHo_operand_in_rule__Model__Group_1__1__Impl2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__0__Impl_in_rule__And__Group__02890 = new BitSet(new long[]{0x0048000FF03FF040L});
    public static final BitSet FOLLOW_rule__And__Group__1_in_rule__And__Group__02893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__And__Group__0__Impl2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And__Group__1__Impl_in_rule__And__Group__12952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHo_operand_in_rule__And__Group__1__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__0__Impl_in_rule__Or__Group__03012 = new BitSet(new long[]{0x0048000FF03FF040L});
    public static final BitSet FOLLOW_rule__Or__Group__1_in_rule__Or__Group__03015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Alternatives_0_in_rule__Or__Group__0__Impl3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or__Group__1__Impl_in_rule__Or__Group__13072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHo_operand_in_rule__Or__Group__1__Impl3099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group__0__Impl_in_rule__Ho_operand__Group__03132 = new BitSet(new long[]{0x0048000FF03FF040L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group__1_in_rule__Ho_operand__Group__03135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Ho_operand__Group__0__Impl3163 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group__1__Impl_in_rule__Ho_operand__Group__13194 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group__2_in_rule__Ho_operand__Group__13197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ho_operand__Alternatives_1_in_rule__Ho_operand__Group__1__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group__2__Impl_in_rule__Ho_operand__Group__23254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Ho_operand__Group__2__Impl3282 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group_1_4__0__Impl_in_rule__Ho_operand__Group_1_4__03319 = new BitSet(new long[]{0x0048000FF03FF040L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group_1_4__1_in_rule__Ho_operand__Group_1_4__03322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Ho_operand__Group_1_4__0__Impl3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group_1_4__1__Impl_in_rule__Ho_operand__Group_1_4__13381 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group_1_4__2_in_rule__Ho_operand__Group_1_4__13384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHo_operand_in_rule__Ho_operand__Group_1_4__1__Impl3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group_1_4__2__Impl_in_rule__Ho_operand__Group_1_4__23440 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group_1_4__3_in_rule__Ho_operand__Group_1_4__23443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ho_operand__Alternatives_1_4_2_in_rule__Ho_operand__Group_1_4__2__Impl3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Ho_operand__Group_1_4__3__Impl_in_rule__Ho_operand__Group_1_4__33500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Ho_operand__Group_1_4__3__Impl3528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group__0__Impl_in_rule__Higher_order_call__Group__03567 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group__1_in_rule__Higher_order_call__Group__03570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_op_aliases_in_rule__Higher_order_call__Group__0__Impl3597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group__1__Impl_in_rule__Higher_order_call__Group__13626 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group__2_in_rule__Higher_order_call__Group__13629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Higher_order_call__Group__1__Impl3657 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group__2__Impl_in_rule__Higher_order_call__Group__23688 = new BitSet(new long[]{0x0048000FF03FF040L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group__3_in_rule__Higher_order_call__Group__23691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Higher_order_call__Group__2__Impl3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group__3__Impl_in_rule__Higher_order_call__Group__33750 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group__4_in_rule__Higher_order_call__Group__33753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group_3__0_in_rule__Higher_order_call__Group__3__Impl3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group__4__Impl_in_rule__Higher_order_call__Group__43810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Higher_order_call__Group__4__Impl3838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group_3__0__Impl_in_rule__Higher_order_call__Group_3__03879 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group_3__1_in_rule__Higher_order_call__Group_3__03882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHo_operand_in_rule__Higher_order_call__Group_3__0__Impl3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group_3__1__Impl_in_rule__Higher_order_call__Group_3__13938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group_3_1__0_in_rule__Higher_order_call__Group_3__1__Impl3965 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group_3_1__0__Impl_in_rule__Higher_order_call__Group_3_1__04000 = new BitSet(new long[]{0x0048000FF03FF040L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group_3_1__1_in_rule__Higher_order_call__Group_3_1__04003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Higher_order_call__Group_3_1__0__Impl4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Higher_order_call__Group_3_1__1__Impl_in_rule__Higher_order_call__Group_3_1__14062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHo_operand_in_rule__Higher_order_call__Group_3_1__1__Impl4089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__0__Impl_in_rule__Comparison__Group__04122 = new BitSet(new long[]{0x000000000FC00040L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1_in_rule__Comparison__Group__04125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__Comparison__Group__0__Impl4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__1__Impl_in_rule__Comparison__Group__14181 = new BitSet(new long[]{0x000000000FC00040L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2_in_rule__Comparison__Group__14184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Comparison__Group__1__Impl4212 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Comparison__Group__2__Impl_in_rule__Comparison__Group__24243 = new BitSet(new long[]{0x004800F000000040L});
    public static final BitSet FOLLOW_rule__Comparison__Group__3_in_rule__Comparison__Group__24246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Alternatives_2_in_rule__Comparison__Group__2__Impl4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group__3__Impl_in_rule__Comparison__Group__34303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_rule__Comparison__Group__3__Impl4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_2_0__0__Impl_in_rule__Comparison__Group_2_0__04367 = new BitSet(new long[]{0x00000000003F8000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_2_0__1_in_rule__Comparison__Group_2_0__04370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Comparison__Group_2_0__0__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_2_0__1__Impl_in_rule__Comparison__Group_2_0__14429 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Comparison__Group_2_0__2_in_rule__Comparison__Group_2_0__14432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_op_aliases_in_rule__Comparison__Group_2_0__1__Impl4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Comparison__Group_2_0__2__Impl_in_rule__Comparison__Group_2_0__24488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Comparison__Group_2_0__2__Impl4516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call_operator__Group__0__Impl_in_rule__Call_operator__Group__04553 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__Call_operator__Group__1_in_rule__Call_operator__Group__04556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call_operator__Alternatives_0_in_rule__Call_operator__Group__0__Impl4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call_operator__Group__1__Impl_in_rule__Call_operator__Group__14613 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__Call_operator__Group__2_in_rule__Call_operator__Group__14616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Call_operator__Group__1__Impl4644 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Call_operator__Group__2__Impl_in_rule__Call_operator__Group__24675 = new BitSet(new long[]{0x005800F000000040L});
    public static final BitSet FOLLOW_rule__Call_operator__Group__3_in_rule__Call_operator__Group__24678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Call_operator__Group__2__Impl4706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call_operator__Group__3__Impl_in_rule__Call_operator__Group__34737 = new BitSet(new long[]{0x005800F000000040L});
    public static final BitSet FOLLOW_rule__Call_operator__Group__4_in_rule__Call_operator__Group__34740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call_operator__Group_3__0_in_rule__Call_operator__Group__3__Impl4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call_operator__Group__4__Impl_in_rule__Call_operator__Group__44798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Call_operator__Group__4__Impl4826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call_operator__Group_3__0__Impl_in_rule__Call_operator__Group_3__04867 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Call_operator__Group_3__1_in_rule__Call_operator__Group_3__04870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_rule__Call_operator__Group_3__0__Impl4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call_operator__Group_3__1__Impl_in_rule__Call_operator__Group_3__14926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call_operator__Group_3_1__0_in_rule__Call_operator__Group_3__1__Impl4953 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Call_operator__Group_3_1__0__Impl_in_rule__Call_operator__Group_3_1__04988 = new BitSet(new long[]{0x004800F000000040L});
    public static final BitSet FOLLOW_rule__Call_operator__Group_3_1__1_in_rule__Call_operator__Group_3_1__04991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Call_operator__Group_3_1__0__Impl5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Call_operator__Group_3_1__1__Impl_in_rule__Call_operator__Group_3_1__15050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_rule__Call_operator__Group_3_1__1__Impl5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__0__Impl_in_rule__Predicate__Group__05110 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__Predicate__Group__1_in_rule__Predicate__Group__05113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePred_tbl_in_rule__Predicate__Group__0__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__1__Impl_in_rule__Predicate__Group__15169 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__Predicate__Group__2_in_rule__Predicate__Group__15172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Predicate__Group__1__Impl5200 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Predicate__Group__2__Impl_in_rule__Predicate__Group__25231 = new BitSet(new long[]{0x005800F000000040L});
    public static final BitSet FOLLOW_rule__Predicate__Group__3_in_rule__Predicate__Group__25234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Predicate__Group__2__Impl5262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__3__Impl_in_rule__Predicate__Group__35293 = new BitSet(new long[]{0x005800F000000040L});
    public static final BitSet FOLLOW_rule__Predicate__Group__4_in_rule__Predicate__Group__35296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__0_in_rule__Predicate__Group__3__Impl5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group__4__Impl_in_rule__Predicate__Group__45354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Predicate__Group__4__Impl5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__0__Impl_in_rule__Predicate__Group_3__05423 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__1_in_rule__Predicate__Group_3__05426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_rule__Predicate__Group_3__0__Impl5453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3__1__Impl_in_rule__Predicate__Group_3__15482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__0_in_rule__Predicate__Group_3__1__Impl5509 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__0__Impl_in_rule__Predicate__Group_3_1__05544 = new BitSet(new long[]{0x004800F000000040L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__1_in_rule__Predicate__Group_3_1__05547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Predicate__Group_3_1__0__Impl5575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Predicate__Group_3_1__1__Impl_in_rule__Predicate__Group_3_1__15606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_rule__Predicate__Group_3_1__1__Impl5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group__0__Impl_in_rule__Primary_expr__Group__05666 = new BitSet(new long[]{0x004800F000000040L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group__1_in_rule__Primary_expr__Group__05669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Primary_expr__Group__0__Impl5697 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group__1__Impl_in_rule__Primary_expr__Group__15728 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group__2_in_rule__Primary_expr__Group__15731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__Alternatives_1_in_rule__Primary_expr__Group__1__Impl5758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group__2__Impl_in_rule__Primary_expr__Group__25788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Primary_expr__Group__2__Impl5816 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1_0__0__Impl_in_rule__Primary_expr__Group_1_0__05853 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1_0__1_in_rule__Primary_expr__Group_1_0__05856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConst_func_tbl_in_rule__Primary_expr__Group_1_0__0__Impl5883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1_0__1__Impl_in_rule__Primary_expr__Group_1_0__15912 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1_0__2_in_rule__Primary_expr__Group_1_0__15915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Primary_expr__Group_1_0__1__Impl5943 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1_0__2__Impl_in_rule__Primary_expr__Group_1_0__25974 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1_0__3_in_rule__Primary_expr__Group_1_0__25977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Primary_expr__Group_1_0__2__Impl6005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1_0__3__Impl_in_rule__Primary_expr__Group_1_0__36036 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1_0__4_in_rule__Primary_expr__Group_1_0__36039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Primary_expr__Group_1_0__3__Impl6067 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1_0__4__Impl_in_rule__Primary_expr__Group_1_0__46098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Primary_expr__Group_1_0__4__Impl6126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__0__Impl_in_rule__Array__Group__06167 = new BitSet(new long[]{0x0040000000000040L});
    public static final BitSet FOLLOW_rule__Array__Group__1_in_rule__Array__Group__06170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Array__Group__0__Impl6198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__1__Impl_in_rule__Array__Group__16229 = new BitSet(new long[]{0x0040000000000040L});
    public static final BitSet FOLLOW_rule__Array__Group__2_in_rule__Array__Group__16232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group__1__Impl6260 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Array__Group__2__Impl_in_rule__Array__Group__26291 = new BitSet(new long[]{0x0010000000000140L});
    public static final BitSet FOLLOW_rule__Array__Group__3_in_rule__Array__Group__26294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__Array__Group__2__Impl6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group__3__Impl_in_rule__Array__Group__36350 = new BitSet(new long[]{0x0010000000000140L});
    public static final BitSet FOLLOW_rule__Array__Group__4_in_rule__Array__Group__36353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group__3__Impl6381 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Array__Group__4__Impl_in_rule__Array__Group__46412 = new BitSet(new long[]{0x0010000000000140L});
    public static final BitSet FOLLOW_rule__Array__Group__5_in_rule__Array__Group__46415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__0_in_rule__Array__Group__4__Impl6442 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_rule__Array__Group__5__Impl_in_rule__Array__Group__56473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Array__Group__5__Impl6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__0__Impl_in_rule__Array__Group_4__06544 = new BitSet(new long[]{0x0040000000000040L});
    public static final BitSet FOLLOW_rule__Array__Group_4__1_in_rule__Array__Group_4__06547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Array__Group_4__0__Impl6575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__1__Impl_in_rule__Array__Group_4__16606 = new BitSet(new long[]{0x0040000000000040L});
    public static final BitSet FOLLOW_rule__Array__Group_4__2_in_rule__Array__Group_4__16609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group_4__1__Impl6637 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Array__Group_4__2__Impl_in_rule__Array__Group_4__26668 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Array__Group_4__3_in_rule__Array__Group_4__26671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rule__Array__Group_4__2__Impl6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Array__Group_4__3__Impl_in_rule__Array__Group_4__36727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rule__Array__Group_4__3__Impl6755 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__0__Impl_in_rule__Pct_encoded__Group__06794 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__1_in_rule__Pct_encoded__Group__06797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__Pct_encoded__Group__0__Impl6825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__1__Impl_in_rule__Pct_encoded__Group__16856 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__2_in_rule__Pct_encoded__Group__16859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__1__Impl6886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Pct_encoded__Group__2__Impl_in_rule__Pct_encoded__Group__26915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rule__Pct_encoded__Group__2__Impl6942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Strval__Group__0__Impl_in_rule__Strval__Group__06977 = new BitSet(new long[]{0x0027FF0000000030L});
    public static final BitSet FOLLOW_rule__Strval__Group__1_in_rule__Strval__Group__06980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Strval__Group__0__Impl7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Strval__Group__1__Impl_in_rule__Strval__Group__17039 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__Strval__Group__2_in_rule__Strval__Group__17042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Strval__Alternatives_1_in_rule__Strval__Group__1__Impl7071 = new BitSet(new long[]{0x0027FF0000000032L});
    public static final BitSet FOLLOW_rule__Strval__Alternatives_1_in_rule__Strval__Group__1__Impl7083 = new BitSet(new long[]{0x0027FF0000000032L});
    public static final BitSet FOLLOW_rule__Strval__Group__2__Impl_in_rule__Strval__Group__27116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Strval__Group__2__Impl7144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHo_operand_in_rule__Model__OperandsAssignment_07186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_synpred62_InternalRQL5816 = new BitSet(new long[]{0x0000000000000002L});

}