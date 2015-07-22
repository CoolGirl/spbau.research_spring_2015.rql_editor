package com.parallels.aps.ide.rqleditor.xtext.rql.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.parallels.aps.ide.rqleditor.xtext.rql.services.RQLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRQLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_WSP", "RULE_ALPHA", "RULE_DIGIT", "RULE_XDIGIT", "','", "'&'", "';'", "'|'", "'('", "')'", "'or'", "'and'", "'not'", "'ne'", "'eq'", "'lt'", "'le'", "'gt'", "'ge'", "'like'", "'!='", "'='", "'<'", "'<='", "'>'", "'>='", "'select'", "'sort'", "'limit'", "'implementing'", "'composing'", "'isnull'", "'in'", "'out'", "'true'", "'false'", "'empty'", "'null'", "'-'", "'.'", "'_'", "'~'", "'$'", "':'", "'*'", "'+'", "'?'", "'/'", "'@'", "'%'", "'\"'"
    };
    public static final int T__50=50;
    public static final int RULE_WSP=4;
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
    public static final int RULE_DIGIT=6;
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
    public static final int RULE_ALPHA=5;
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
    public String getGrammarFileName() { return "../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g"; }



     	private RQLGrammarAccess grammarAccess;
     	
        public InternalRQLParser(TokenStream input, RQLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected RQLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_operands_0_0= ruleHo_operand ) ) ( (otherlv_1= ',' | otherlv_2= '&' ) ruleHo_operand )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_operands_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:79:28: ( ( ( (lv_operands_0_0= ruleHo_operand ) ) ( (otherlv_1= ',' | otherlv_2= '&' ) ruleHo_operand )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:80:1: ( ( (lv_operands_0_0= ruleHo_operand ) ) ( (otherlv_1= ',' | otherlv_2= '&' ) ruleHo_operand )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:80:1: ( ( (lv_operands_0_0= ruleHo_operand ) ) ( (otherlv_1= ',' | otherlv_2= '&' ) ruleHo_operand )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:80:2: ( (lv_operands_0_0= ruleHo_operand ) ) ( (otherlv_1= ',' | otherlv_2= '&' ) ruleHo_operand )*
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:80:2: ( (lv_operands_0_0= ruleHo_operand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:81:1: (lv_operands_0_0= ruleHo_operand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:81:1: (lv_operands_0_0= ruleHo_operand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:82:3: lv_operands_0_0= ruleHo_operand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getOperandsHo_operandParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHo_operand_in_ruleModel131);
            lv_operands_0_0=ruleHo_operand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getModelRule());
              	        }
                     		add(
                     			current, 
                     			"operands",
                      		lv_operands_0_0, 
                      		"Ho_operand");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:98:2: ( (otherlv_1= ',' | otherlv_2= '&' ) ruleHo_operand )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=8 && LA2_0<=9)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:98:3: (otherlv_1= ',' | otherlv_2= '&' ) ruleHo_operand
            	    {
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:98:3: (otherlv_1= ',' | otherlv_2= '&' )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==8) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==9) ) {
            	        alt1=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:98:5: otherlv_1= ','
            	            {
            	            otherlv_1=(Token)match(input,8,FOLLOW_8_in_ruleModel145); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getCommaKeyword_1_0_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:103:7: otherlv_2= '&'
            	            {
            	            otherlv_2=(Token)match(input,9,FOLLOW_9_in_ruleModel163); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getAmpersandKeyword_1_0_1());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getModelAccess().getHo_operandParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleHo_operand_in_ruleModel180);
            	    ruleHo_operand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleAnd"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:123:1: entryRuleAnd returns [String current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final String entryRuleAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnd = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:124:2: (iv_ruleAnd= ruleAnd EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:125:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd218);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd229); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:132:1: ruleAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&' this_Ho_operand_1= ruleHo_operand ) ;
    public final AntlrDatatypeRuleToken ruleAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Ho_operand_1 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:135:28: ( (kw= '&' this_Ho_operand_1= ruleHo_operand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:136:1: (kw= '&' this_Ho_operand_1= ruleHo_operand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:136:1: (kw= '&' this_Ho_operand_1= ruleHo_operand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:137:2: kw= '&' this_Ho_operand_1= ruleHo_operand
            {
            kw=(Token)match(input,9,FOLLOW_9_in_ruleAnd267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAndAccess().getAmpersandKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndAccess().getHo_operandParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleHo_operand_in_ruleAnd289);
            this_Ho_operand_1=ruleHo_operand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Ho_operand_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleOr"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:161:1: entryRuleOr returns [String current=null] : iv_ruleOr= ruleOr EOF ;
    public final String entryRuleOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOr = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:162:2: (iv_ruleOr= ruleOr EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:163:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr335);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr346); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:170:1: ruleOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= ';' | kw= '|' ) this_Ho_operand_2= ruleHo_operand ) ;
    public final AntlrDatatypeRuleToken ruleOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Ho_operand_2 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:173:28: ( ( (kw= ';' | kw= '|' ) this_Ho_operand_2= ruleHo_operand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:174:1: ( (kw= ';' | kw= '|' ) this_Ho_operand_2= ruleHo_operand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:174:1: ( (kw= ';' | kw= '|' ) this_Ho_operand_2= ruleHo_operand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:174:2: (kw= ';' | kw= '|' ) this_Ho_operand_2= ruleHo_operand
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:174:2: (kw= ';' | kw= '|' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            else if ( (LA3_0==11) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:175:2: kw= ';'
                    {
                    kw=(Token)match(input,10,FOLLOW_10_in_ruleOr385); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOrAccess().getSemicolonKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:182:2: kw= '|'
                    {
                    kw=(Token)match(input,11,FOLLOW_11_in_ruleOr404); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOrAccess().getVerticalLineKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAccess().getHo_operandParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleHo_operand_in_ruleOr427);
            this_Ho_operand_2=ruleHo_operand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Ho_operand_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleHo_operand"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:206:1: entryRuleHo_operand returns [String current=null] : iv_ruleHo_operand= ruleHo_operand EOF ;
    public final String entryRuleHo_operand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHo_operand = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:207:2: (iv_ruleHo_operand= ruleHo_operand EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:208:2: iv_ruleHo_operand= ruleHo_operand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHo_operandRule()); 
            }
            pushFollow(FOLLOW_ruleHo_operand_in_entryRuleHo_operand473);
            iv_ruleHo_operand=ruleHo_operand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHo_operand.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHo_operand484); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHo_operand"


    // $ANTLR start "ruleHo_operand"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:215:1: ruleHo_operand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WSP_0= RULE_WSP )* (this_Higher_order_call_1= ruleHigher_order_call | this_Call_operator_2= ruleCall_operator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= '(' this_Ho_operand_6= ruleHo_operand ( (this_And_7= ruleAnd )+ | (this_Or_8= ruleOr )+ ) kw= ')' ) ) (this_WSP_10= RULE_WSP )* ) ;
    public final AntlrDatatypeRuleToken ruleHo_operand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_0=null;
        Token kw=null;
        Token this_WSP_10=null;
        AntlrDatatypeRuleToken this_Higher_order_call_1 = null;

        AntlrDatatypeRuleToken this_Call_operator_2 = null;

        AntlrDatatypeRuleToken this_Predicate_3 = null;

        AntlrDatatypeRuleToken this_Comparison_4 = null;

        AntlrDatatypeRuleToken this_Ho_operand_6 = null;

        AntlrDatatypeRuleToken this_And_7 = null;

        AntlrDatatypeRuleToken this_Or_8 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:218:28: ( ( (this_WSP_0= RULE_WSP )* (this_Higher_order_call_1= ruleHigher_order_call | this_Call_operator_2= ruleCall_operator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= '(' this_Ho_operand_6= ruleHo_operand ( (this_And_7= ruleAnd )+ | (this_Or_8= ruleOr )+ ) kw= ')' ) ) (this_WSP_10= RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:219:1: ( (this_WSP_0= RULE_WSP )* (this_Higher_order_call_1= ruleHigher_order_call | this_Call_operator_2= ruleCall_operator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= '(' this_Ho_operand_6= ruleHo_operand ( (this_And_7= ruleAnd )+ | (this_Or_8= ruleOr )+ ) kw= ')' ) ) (this_WSP_10= RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:219:1: ( (this_WSP_0= RULE_WSP )* (this_Higher_order_call_1= ruleHigher_order_call | this_Call_operator_2= ruleCall_operator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= '(' this_Ho_operand_6= ruleHo_operand ( (this_And_7= ruleAnd )+ | (this_Or_8= ruleOr )+ ) kw= ')' ) ) (this_WSP_10= RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:219:2: (this_WSP_0= RULE_WSP )* (this_Higher_order_call_1= ruleHigher_order_call | this_Call_operator_2= ruleCall_operator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= '(' this_Ho_operand_6= ruleHo_operand ( (this_And_7= ruleAnd )+ | (this_Or_8= ruleOr )+ ) kw= ')' ) ) (this_WSP_10= RULE_WSP )*
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:219:2: (this_WSP_0= RULE_WSP )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_WSP) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:219:7: this_WSP_0= RULE_WSP
            	    {
            	    this_WSP_0=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleHo_operand525); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_0, grammarAccess.getHo_operandAccess().getWSPTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:226:3: (this_Higher_order_call_1= ruleHigher_order_call | this_Call_operator_2= ruleCall_operator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= '(' this_Ho_operand_6= ruleHo_operand ( (this_And_7= ruleAnd )+ | (this_Or_8= ruleOr )+ ) kw= ')' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 14:
            case 15:
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 35:
            case 36:
            case 37:
                {
                alt8=2;
                }
                break;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt8=3;
                }
                break;
            case 54:
                {
                alt8=4;
                }
                break;
            case 12:
                {
                alt8=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:227:5: this_Higher_order_call_1= ruleHigher_order_call
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHo_operandAccess().getHigher_order_callParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHigher_order_call_in_ruleHo_operand555);
                    this_Higher_order_call_1=ruleHigher_order_call();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Higher_order_call_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:239:5: this_Call_operator_2= ruleCall_operator
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHo_operandAccess().getCall_operatorParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCall_operator_in_ruleHo_operand588);
                    this_Call_operator_2=ruleCall_operator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Call_operator_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:251:5: this_Predicate_3= rulePredicate
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHo_operandAccess().getPredicateParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePredicate_in_ruleHo_operand621);
                    this_Predicate_3=rulePredicate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Predicate_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:263:5: this_Comparison_4= ruleComparison
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHo_operandAccess().getComparisonParserRuleCall_1_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComparison_in_ruleHo_operand654);
                    this_Comparison_4=ruleComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Comparison_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:274:6: (kw= '(' this_Ho_operand_6= ruleHo_operand ( (this_And_7= ruleAnd )+ | (this_Or_8= ruleOr )+ ) kw= ')' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:274:6: (kw= '(' this_Ho_operand_6= ruleHo_operand ( (this_And_7= ruleAnd )+ | (this_Or_8= ruleOr )+ ) kw= ')' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:275:2: kw= '(' this_Ho_operand_6= ruleHo_operand ( (this_And_7= ruleAnd )+ | (this_Or_8= ruleOr )+ ) kw= ')'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleHo_operand679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getHo_operandAccess().getLeftParenthesisKeyword_1_4_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHo_operandAccess().getHo_operandParserRuleCall_1_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHo_operand_in_ruleHo_operand701);
                    this_Ho_operand_6=ruleHo_operand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Ho_operand_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:291:1: ( (this_And_7= ruleAnd )+ | (this_Or_8= ruleOr )+ )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==9) ) {
                        alt7=1;
                    }
                    else if ( ((LA7_0>=10 && LA7_0<=11)) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:291:2: (this_And_7= ruleAnd )+
                            {
                            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:291:2: (this_And_7= ruleAnd )+
                            int cnt5=0;
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==9) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:292:5: this_And_7= ruleAnd
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              newCompositeNode(grammarAccess.getHo_operandAccess().getAndParserRuleCall_1_4_2_0()); 
                            	          
                            	    }
                            	    pushFollow(FOLLOW_ruleAnd_in_ruleHo_operand730);
                            	    this_And_7=ruleAnd();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      		current.merge(this_And_7);
                            	          
                            	    }
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              afterParserOrEnumRuleCall();
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt5 >= 1 ) break loop5;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(5, input);
                                        throw eee;
                                }
                                cnt5++;
                            } while (true);


                            }
                            break;
                        case 2 :
                            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:303:6: (this_Or_8= ruleOr )+
                            {
                            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:303:6: (this_Or_8= ruleOr )+
                            int cnt6=0;
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( ((LA6_0>=10 && LA6_0<=11)) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:304:5: this_Or_8= ruleOr
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              newCompositeNode(grammarAccess.getHo_operandAccess().getOrParserRuleCall_1_4_2_1()); 
                            	          
                            	    }
                            	    pushFollow(FOLLOW_ruleOr_in_ruleHo_operand766);
                            	    this_Or_8=ruleOr();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      		current.merge(this_Or_8);
                            	          
                            	    }
                            	    if ( state.backtracking==0 ) {
                            	       
                            	              afterParserOrEnumRuleCall();
                            	          
                            	    }

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt6 >= 1 ) break loop6;
                            	    if (state.backtracking>0) {state.failed=true; return current;}
                                        EarlyExitException eee =
                                            new EarlyExitException(6, input);
                                        throw eee;
                                }
                                cnt6++;
                            } while (true);


                            }
                            break;

                    }

                    kw=(Token)match(input,13,FOLLOW_13_in_ruleHo_operand787); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getHo_operandAccess().getRightParenthesisKeyword_1_4_3()); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:320:3: (this_WSP_10= RULE_WSP )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_WSP) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:320:8: this_WSP_10= RULE_WSP
            	    {
            	    this_WSP_10=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleHo_operand805); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_10);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_10, grammarAccess.getHo_operandAccess().getWSPTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHo_operand"


    // $ANTLR start "entryRuleLogical_op_aliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:335:1: entryRuleLogical_op_aliases returns [String current=null] : iv_ruleLogical_op_aliases= ruleLogical_op_aliases EOF ;
    public final String entryRuleLogical_op_aliases() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogical_op_aliases = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:336:2: (iv_ruleLogical_op_aliases= ruleLogical_op_aliases EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:337:2: iv_ruleLogical_op_aliases= ruleLogical_op_aliases EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogical_op_aliasesRule()); 
            }
            pushFollow(FOLLOW_ruleLogical_op_aliases_in_entryRuleLogical_op_aliases853);
            iv_ruleLogical_op_aliases=ruleLogical_op_aliases();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogical_op_aliases.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogical_op_aliases864); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogical_op_aliases"


    // $ANTLR start "ruleLogical_op_aliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:344:1: ruleLogical_op_aliases returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'or' | kw= 'and' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleLogical_op_aliases() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:347:28: ( (kw= 'or' | kw= 'and' | kw= 'not' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:348:1: (kw= 'or' | kw= 'and' | kw= 'not' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:348:1: (kw= 'or' | kw= 'and' | kw= 'not' )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt10=1;
                }
                break;
            case 15:
                {
                alt10=2;
                }
                break;
            case 16:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:349:2: kw= 'or'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleLogical_op_aliases902); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogical_op_aliasesAccess().getOrKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:356:2: kw= 'and'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleLogical_op_aliases921); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogical_op_aliasesAccess().getAndKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:363:2: kw= 'not'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleLogical_op_aliases940); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogical_op_aliasesAccess().getNotKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLogical_op_aliases"


    // $ANTLR start "entryRuleHigher_order_call"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:376:1: entryRuleHigher_order_call returns [String current=null] : iv_ruleHigher_order_call= ruleHigher_order_call EOF ;
    public final String entryRuleHigher_order_call() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHigher_order_call = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:377:2: (iv_ruleHigher_order_call= ruleHigher_order_call EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:378:2: iv_ruleHigher_order_call= ruleHigher_order_call EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHigher_order_callRule()); 
            }
            pushFollow(FOLLOW_ruleHigher_order_call_in_entryRuleHigher_order_call981);
            iv_ruleHigher_order_call=ruleHigher_order_call();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHigher_order_call.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHigher_order_call992); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHigher_order_call"


    // $ANTLR start "ruleHigher_order_call"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:385:1: ruleHigher_order_call returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Logical_op_aliases_0= ruleLogical_op_aliases (this_WSP_1= RULE_WSP )* kw= '(' (this_Ho_operand_3= ruleHo_operand (kw= ',' this_Ho_operand_5= ruleHo_operand )* ) kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleHigher_order_call() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Logical_op_aliases_0 = null;

        AntlrDatatypeRuleToken this_Ho_operand_3 = null;

        AntlrDatatypeRuleToken this_Ho_operand_5 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:388:28: ( (this_Logical_op_aliases_0= ruleLogical_op_aliases (this_WSP_1= RULE_WSP )* kw= '(' (this_Ho_operand_3= ruleHo_operand (kw= ',' this_Ho_operand_5= ruleHo_operand )* ) kw= ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:389:1: (this_Logical_op_aliases_0= ruleLogical_op_aliases (this_WSP_1= RULE_WSP )* kw= '(' (this_Ho_operand_3= ruleHo_operand (kw= ',' this_Ho_operand_5= ruleHo_operand )* ) kw= ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:389:1: (this_Logical_op_aliases_0= ruleLogical_op_aliases (this_WSP_1= RULE_WSP )* kw= '(' (this_Ho_operand_3= ruleHo_operand (kw= ',' this_Ho_operand_5= ruleHo_operand )* ) kw= ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:390:5: this_Logical_op_aliases_0= ruleLogical_op_aliases (this_WSP_1= RULE_WSP )* kw= '(' (this_Ho_operand_3= ruleHo_operand (kw= ',' this_Ho_operand_5= ruleHo_operand )* ) kw= ')'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getHigher_order_callAccess().getLogical_op_aliasesParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogical_op_aliases_in_ruleHigher_order_call1039);
            this_Logical_op_aliases_0=ruleLogical_op_aliases();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Logical_op_aliases_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:400:1: (this_WSP_1= RULE_WSP )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_WSP) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:400:6: this_WSP_1= RULE_WSP
            	    {
            	    this_WSP_1=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleHigher_order_call1060); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_1, grammarAccess.getHigher_order_callAccess().getWSPTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            kw=(Token)match(input,12,FOLLOW_12_in_ruleHigher_order_call1080); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getHigher_order_callAccess().getLeftParenthesisKeyword_2()); 
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:413:1: (this_Ho_operand_3= ruleHo_operand (kw= ',' this_Ho_operand_5= ruleHo_operand )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:414:5: this_Ho_operand_3= ruleHo_operand (kw= ',' this_Ho_operand_5= ruleHo_operand )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getHigher_order_callAccess().getHo_operandParserRuleCall_3_0()); 
                  
            }
            pushFollow(FOLLOW_ruleHo_operand_in_ruleHigher_order_call1103);
            this_Ho_operand_3=ruleHo_operand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Ho_operand_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:424:1: (kw= ',' this_Ho_operand_5= ruleHo_operand )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==8) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:425:2: kw= ',' this_Ho_operand_5= ruleHo_operand
            	    {
            	    kw=(Token)match(input,8,FOLLOW_8_in_ruleHigher_order_call1122); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getHigher_order_callAccess().getCommaKeyword_3_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getHigher_order_callAccess().getHo_operandParserRuleCall_3_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleHo_operand_in_ruleHigher_order_call1144);
            	    this_Ho_operand_5=ruleHo_operand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Ho_operand_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            kw=(Token)match(input,13,FOLLOW_13_in_ruleHigher_order_call1165); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getHigher_order_callAccess().getRightParenthesisKeyword_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleHigher_order_call"


    // $ANTLR start "entryRuleBinary_op_aliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:455:1: entryRuleBinary_op_aliases returns [String current=null] : iv_ruleBinary_op_aliases= ruleBinary_op_aliases EOF ;
    public final String entryRuleBinary_op_aliases() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinary_op_aliases = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:456:2: (iv_ruleBinary_op_aliases= ruleBinary_op_aliases EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:457:2: iv_ruleBinary_op_aliases= ruleBinary_op_aliases EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinary_op_aliasesRule()); 
            }
            pushFollow(FOLLOW_ruleBinary_op_aliases_in_entryRuleBinary_op_aliases1206);
            iv_ruleBinary_op_aliases=ruleBinary_op_aliases();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinary_op_aliases.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinary_op_aliases1217); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinary_op_aliases"


    // $ANTLR start "ruleBinary_op_aliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:464:1: ruleBinary_op_aliases returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ne' | kw= 'eq' | kw= 'lt' | kw= 'le' | kw= 'gt' | kw= 'ge' | kw= 'like' ) ;
    public final AntlrDatatypeRuleToken ruleBinary_op_aliases() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:467:28: ( (kw= 'ne' | kw= 'eq' | kw= 'lt' | kw= 'le' | kw= 'gt' | kw= 'ge' | kw= 'like' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:468:1: (kw= 'ne' | kw= 'eq' | kw= 'lt' | kw= 'le' | kw= 'gt' | kw= 'ge' | kw= 'like' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:468:1: (kw= 'ne' | kw= 'eq' | kw= 'lt' | kw= 'le' | kw= 'gt' | kw= 'ge' | kw= 'like' )
            int alt13=7;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt13=1;
                }
                break;
            case 18:
                {
                alt13=2;
                }
                break;
            case 19:
                {
                alt13=3;
                }
                break;
            case 20:
                {
                alt13=4;
                }
                break;
            case 21:
                {
                alt13=5;
                }
                break;
            case 22:
                {
                alt13=6;
                }
                break;
            case 23:
                {
                alt13=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:469:2: kw= 'ne'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleBinary_op_aliases1255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinary_op_aliasesAccess().getNeKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:476:2: kw= 'eq'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleBinary_op_aliases1274); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinary_op_aliasesAccess().getEqKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:483:2: kw= 'lt'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleBinary_op_aliases1293); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinary_op_aliasesAccess().getLtKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:490:2: kw= 'le'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleBinary_op_aliases1312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinary_op_aliasesAccess().getLeKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:497:2: kw= 'gt'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleBinary_op_aliases1331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinary_op_aliasesAccess().getGtKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:504:2: kw= 'ge'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleBinary_op_aliases1350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinary_op_aliasesAccess().getGeKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:511:2: kw= 'like'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleBinary_op_aliases1369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinary_op_aliasesAccess().getLikeKeyword_6()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBinary_op_aliases"


    // $ANTLR start "entryRuleComp_ops"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:524:1: entryRuleComp_ops returns [String current=null] : iv_ruleComp_ops= ruleComp_ops EOF ;
    public final String entryRuleComp_ops() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComp_ops = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:525:2: (iv_ruleComp_ops= ruleComp_ops EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:526:2: iv_ruleComp_ops= ruleComp_ops EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComp_opsRule()); 
            }
            pushFollow(FOLLOW_ruleComp_ops_in_entryRuleComp_ops1410);
            iv_ruleComp_ops=ruleComp_ops();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComp_ops.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComp_ops1421); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComp_ops"


    // $ANTLR start "ruleComp_ops"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:533:1: ruleComp_ops returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!=' | kw= '=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) ;
    public final AntlrDatatypeRuleToken ruleComp_ops() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:536:28: ( (kw= '!=' | kw= '=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:537:1: (kw= '!=' | kw= '=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:537:1: (kw= '!=' | kw= '=' | kw= '<' | kw= '<=' | kw= '>' | kw= '>=' )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt14=1;
                }
                break;
            case 25:
                {
                alt14=2;
                }
                break;
            case 26:
                {
                alt14=3;
                }
                break;
            case 27:
                {
                alt14=4;
                }
                break;
            case 28:
                {
                alt14=5;
                }
                break;
            case 29:
                {
                alt14=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:538:2: kw= '!='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleComp_ops1459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComp_opsAccess().getExclamationMarkEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:545:2: kw= '='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleComp_ops1478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComp_opsAccess().getEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:552:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleComp_ops1497); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComp_opsAccess().getLessThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:559:2: kw= '<='
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleComp_ops1516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComp_opsAccess().getLessThanSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:566:2: kw= '>'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleComp_ops1535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComp_opsAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:573:2: kw= '>='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleComp_ops1554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComp_opsAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComp_ops"


    // $ANTLR start "entryRuleComparison"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:586:1: entryRuleComparison returns [String current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final String entryRuleComparison() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparison = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:587:2: (iv_ruleComparison= ruleComparison EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:588:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1595);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1606); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:595:1: ruleComparison returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* ( (kw= '=' this_Binary_op_aliases_3= ruleBinary_op_aliases kw= '=' ) | this_Comp_ops_5= ruleComp_ops ) this_Primary_expr_6= rulePrimary_expr ) ;
    public final AntlrDatatypeRuleToken ruleComparison() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Strval_0 = null;

        AntlrDatatypeRuleToken this_Binary_op_aliases_3 = null;

        AntlrDatatypeRuleToken this_Comp_ops_5 = null;

        AntlrDatatypeRuleToken this_Primary_expr_6 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:598:28: ( (this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* ( (kw= '=' this_Binary_op_aliases_3= ruleBinary_op_aliases kw= '=' ) | this_Comp_ops_5= ruleComp_ops ) this_Primary_expr_6= rulePrimary_expr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:599:1: (this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* ( (kw= '=' this_Binary_op_aliases_3= ruleBinary_op_aliases kw= '=' ) | this_Comp_ops_5= ruleComp_ops ) this_Primary_expr_6= rulePrimary_expr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:599:1: (this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* ( (kw= '=' this_Binary_op_aliases_3= ruleBinary_op_aliases kw= '=' ) | this_Comp_ops_5= ruleComp_ops ) this_Primary_expr_6= rulePrimary_expr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:600:5: this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* ( (kw= '=' this_Binary_op_aliases_3= ruleBinary_op_aliases kw= '=' ) | this_Comp_ops_5= ruleComp_ops ) this_Primary_expr_6= rulePrimary_expr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getStrvalParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleStrval_in_ruleComparison1653);
            this_Strval_0=ruleStrval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Strval_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:610:1: (this_WSP_1= RULE_WSP )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_WSP) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:610:6: this_WSP_1= RULE_WSP
            	    {
            	    this_WSP_1=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleComparison1674); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_1, grammarAccess.getComparisonAccess().getWSPTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:617:3: ( (kw= '=' this_Binary_op_aliases_3= ruleBinary_op_aliases kw= '=' ) | this_Comp_ops_5= ruleComp_ops )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                int LA16_1 = input.LA(2);

                if ( ((LA16_1>=17 && LA16_1<=23)) ) {
                    alt16=1;
                }
                else if ( (LA16_1==RULE_WSP||LA16_1==12||(LA16_1>=38 && LA16_1<=41)||LA16_1==54) ) {
                    alt16=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0==24||(LA16_0>=26 && LA16_0<=29)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:617:4: (kw= '=' this_Binary_op_aliases_3= ruleBinary_op_aliases kw= '=' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:617:4: (kw= '=' this_Binary_op_aliases_3= ruleBinary_op_aliases kw= '=' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:618:2: kw= '=' this_Binary_op_aliases_3= ruleBinary_op_aliases kw= '='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleComparison1696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonAccess().getEqualsSignKeyword_2_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparisonAccess().getBinary_op_aliasesParserRuleCall_2_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinary_op_aliases_in_ruleComparison1718);
                    this_Binary_op_aliases_3=ruleBinary_op_aliases();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Binary_op_aliases_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleComparison1736); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getComparisonAccess().getEqualsSignKeyword_2_0_2()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:642:5: this_Comp_ops_5= ruleComp_ops
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparisonAccess().getComp_opsParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComp_ops_in_ruleComparison1765);
                    this_Comp_ops_5=ruleComp_ops();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Comp_ops_5);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getPrimary_exprParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_rulePrimary_expr_in_ruleComparison1793);
            this_Primary_expr_6=rulePrimary_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Primary_expr_6);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleCall_operator"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:671:1: entryRuleCall_operator returns [String current=null] : iv_ruleCall_operator= ruleCall_operator EOF ;
    public final String entryRuleCall_operator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCall_operator = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:672:2: (iv_ruleCall_operator= ruleCall_operator EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:673:2: iv_ruleCall_operator= ruleCall_operator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCall_operatorRule()); 
            }
            pushFollow(FOLLOW_ruleCall_operator_in_entryRuleCall_operator1839);
            iv_ruleCall_operator=ruleCall_operator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCall_operator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall_operator1850); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCall_operator"


    // $ANTLR start "ruleCall_operator"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:680:1: ruleCall_operator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_Binary_op_aliases_0= ruleBinary_op_aliases | this_Functions_tbl_1= ruleFunctions_tbl ) (this_WSP_2= RULE_WSP )* kw= '(' (this_Primary_expr_4= rulePrimary_expr (kw= ',' this_Primary_expr_6= rulePrimary_expr )* )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleCall_operator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_2=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Binary_op_aliases_0 = null;

        AntlrDatatypeRuleToken this_Functions_tbl_1 = null;

        AntlrDatatypeRuleToken this_Primary_expr_4 = null;

        AntlrDatatypeRuleToken this_Primary_expr_6 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:683:28: ( ( (this_Binary_op_aliases_0= ruleBinary_op_aliases | this_Functions_tbl_1= ruleFunctions_tbl ) (this_WSP_2= RULE_WSP )* kw= '(' (this_Primary_expr_4= rulePrimary_expr (kw= ',' this_Primary_expr_6= rulePrimary_expr )* )? kw= ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:684:1: ( (this_Binary_op_aliases_0= ruleBinary_op_aliases | this_Functions_tbl_1= ruleFunctions_tbl ) (this_WSP_2= RULE_WSP )* kw= '(' (this_Primary_expr_4= rulePrimary_expr (kw= ',' this_Primary_expr_6= rulePrimary_expr )* )? kw= ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:684:1: ( (this_Binary_op_aliases_0= ruleBinary_op_aliases | this_Functions_tbl_1= ruleFunctions_tbl ) (this_WSP_2= RULE_WSP )* kw= '(' (this_Primary_expr_4= rulePrimary_expr (kw= ',' this_Primary_expr_6= rulePrimary_expr )* )? kw= ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:684:2: (this_Binary_op_aliases_0= ruleBinary_op_aliases | this_Functions_tbl_1= ruleFunctions_tbl ) (this_WSP_2= RULE_WSP )* kw= '(' (this_Primary_expr_4= rulePrimary_expr (kw= ',' this_Primary_expr_6= rulePrimary_expr )* )? kw= ')'
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:684:2: (this_Binary_op_aliases_0= ruleBinary_op_aliases | this_Functions_tbl_1= ruleFunctions_tbl )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=17 && LA17_0<=23)) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=35 && LA17_0<=37)) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:685:5: this_Binary_op_aliases_0= ruleBinary_op_aliases
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCall_operatorAccess().getBinary_op_aliasesParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinary_op_aliases_in_ruleCall_operator1898);
                    this_Binary_op_aliases_0=ruleBinary_op_aliases();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Binary_op_aliases_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:697:5: this_Functions_tbl_1= ruleFunctions_tbl
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCall_operatorAccess().getFunctions_tblParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctions_tbl_in_ruleCall_operator1931);
                    this_Functions_tbl_1=ruleFunctions_tbl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Functions_tbl_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:707:2: (this_WSP_2= RULE_WSP )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WSP) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:707:7: this_WSP_2= RULE_WSP
            	    {
            	    this_WSP_2=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleCall_operator1953); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_2, grammarAccess.getCall_operatorAccess().getWSPTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            kw=(Token)match(input,12,FOLLOW_12_in_ruleCall_operator1973); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCall_operatorAccess().getLeftParenthesisKeyword_2()); 
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:720:1: (this_Primary_expr_4= rulePrimary_expr (kw= ',' this_Primary_expr_6= rulePrimary_expr )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_WSP||LA20_0==12||(LA20_0>=38 && LA20_0<=41)||LA20_0==54) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:721:5: this_Primary_expr_4= rulePrimary_expr (kw= ',' this_Primary_expr_6= rulePrimary_expr )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCall_operatorAccess().getPrimary_exprParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimary_expr_in_ruleCall_operator1996);
                    this_Primary_expr_4=rulePrimary_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Primary_expr_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:731:1: (kw= ',' this_Primary_expr_6= rulePrimary_expr )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==8) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:732:2: kw= ',' this_Primary_expr_6= rulePrimary_expr
                    	    {
                    	    kw=(Token)match(input,8,FOLLOW_8_in_ruleCall_operator2015); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getCall_operatorAccess().getCommaKeyword_3_1_0()); 
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getCall_operatorAccess().getPrimary_exprParserRuleCall_3_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_rulePrimary_expr_in_ruleCall_operator2037);
                    	    this_Primary_expr_6=rulePrimary_expr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_Primary_expr_6);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,13,FOLLOW_13_in_ruleCall_operator2059); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCall_operatorAccess().getRightParenthesisKeyword_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCall_operator"


    // $ANTLR start "entryRulePred_tbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:762:1: entryRulePred_tbl returns [String current=null] : iv_rulePred_tbl= rulePred_tbl EOF ;
    public final String entryRulePred_tbl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePred_tbl = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:763:2: (iv_rulePred_tbl= rulePred_tbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:764:2: iv_rulePred_tbl= rulePred_tbl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPred_tblRule()); 
            }
            pushFollow(FOLLOW_rulePred_tbl_in_entryRulePred_tbl2100);
            iv_rulePred_tbl=rulePred_tbl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePred_tbl.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePred_tbl2111); if (state.failed) return current;

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
    // $ANTLR end "entryRulePred_tbl"


    // $ANTLR start "rulePred_tbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:771:1: rulePred_tbl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'select' | kw= 'sort' | kw= 'limit' | kw= 'implementing' | kw= 'composing' ) ;
    public final AntlrDatatypeRuleToken rulePred_tbl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:774:28: ( (kw= 'select' | kw= 'sort' | kw= 'limit' | kw= 'implementing' | kw= 'composing' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:775:1: (kw= 'select' | kw= 'sort' | kw= 'limit' | kw= 'implementing' | kw= 'composing' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:775:1: (kw= 'select' | kw= 'sort' | kw= 'limit' | kw= 'implementing' | kw= 'composing' )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt21=1;
                }
                break;
            case 31:
                {
                alt21=2;
                }
                break;
            case 32:
                {
                alt21=3;
                }
                break;
            case 33:
                {
                alt21=4;
                }
                break;
            case 34:
                {
                alt21=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:776:2: kw= 'select'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_rulePred_tbl2149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPred_tblAccess().getSelectKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:783:2: kw= 'sort'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_rulePred_tbl2168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPred_tblAccess().getSortKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:790:2: kw= 'limit'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_rulePred_tbl2187); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPred_tblAccess().getLimitKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:797:2: kw= 'implementing'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_rulePred_tbl2206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPred_tblAccess().getImplementingKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:804:2: kw= 'composing'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_rulePred_tbl2225); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPred_tblAccess().getComposingKeyword_4()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePred_tbl"


    // $ANTLR start "entryRulePredicate"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:817:1: entryRulePredicate returns [String current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final String entryRulePredicate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePredicate = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:818:2: (iv_rulePredicate= rulePredicate EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:819:2: iv_rulePredicate= rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate2266);
            iv_rulePredicate=rulePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicate.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate2277); if (state.failed) return current;

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
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:826:1: rulePredicate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Pred_tbl_0= rulePred_tbl (this_WSP_1= RULE_WSP )* kw= '(' (this_Primary_expr_3= rulePrimary_expr (kw= ',' this_Primary_expr_5= rulePrimary_expr )* )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulePredicate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_Pred_tbl_0 = null;

        AntlrDatatypeRuleToken this_Primary_expr_3 = null;

        AntlrDatatypeRuleToken this_Primary_expr_5 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:829:28: ( (this_Pred_tbl_0= rulePred_tbl (this_WSP_1= RULE_WSP )* kw= '(' (this_Primary_expr_3= rulePrimary_expr (kw= ',' this_Primary_expr_5= rulePrimary_expr )* )? kw= ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:830:1: (this_Pred_tbl_0= rulePred_tbl (this_WSP_1= RULE_WSP )* kw= '(' (this_Primary_expr_3= rulePrimary_expr (kw= ',' this_Primary_expr_5= rulePrimary_expr )* )? kw= ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:830:1: (this_Pred_tbl_0= rulePred_tbl (this_WSP_1= RULE_WSP )* kw= '(' (this_Primary_expr_3= rulePrimary_expr (kw= ',' this_Primary_expr_5= rulePrimary_expr )* )? kw= ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:831:5: this_Pred_tbl_0= rulePred_tbl (this_WSP_1= RULE_WSP )* kw= '(' (this_Primary_expr_3= rulePrimary_expr (kw= ',' this_Primary_expr_5= rulePrimary_expr )* )? kw= ')'
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPredicateAccess().getPred_tblParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePred_tbl_in_rulePredicate2324);
            this_Pred_tbl_0=rulePred_tbl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Pred_tbl_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:841:1: (this_WSP_1= RULE_WSP )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_WSP) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:841:6: this_WSP_1= RULE_WSP
            	    {
            	    this_WSP_1=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePredicate2345); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_1, grammarAccess.getPredicateAccess().getWSPTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            kw=(Token)match(input,12,FOLLOW_12_in_rulePredicate2365); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_2()); 
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:854:1: (this_Primary_expr_3= rulePrimary_expr (kw= ',' this_Primary_expr_5= rulePrimary_expr )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_WSP||LA24_0==12||(LA24_0>=38 && LA24_0<=41)||LA24_0==54) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:855:5: this_Primary_expr_3= rulePrimary_expr (kw= ',' this_Primary_expr_5= rulePrimary_expr )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredicateAccess().getPrimary_exprParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimary_expr_in_rulePredicate2388);
                    this_Primary_expr_3=rulePrimary_expr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Primary_expr_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:865:1: (kw= ',' this_Primary_expr_5= rulePrimary_expr )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==8) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:866:2: kw= ',' this_Primary_expr_5= rulePrimary_expr
                    	    {
                    	    kw=(Token)match(input,8,FOLLOW_8_in_rulePredicate2407); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getPredicateAccess().getCommaKeyword_3_1_0()); 
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getPredicateAccess().getPrimary_exprParserRuleCall_3_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_rulePrimary_expr_in_rulePredicate2429);
                    	    this_Primary_expr_5=rulePrimary_expr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_Primary_expr_5);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,13,FOLLOW_13_in_rulePredicate2451); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPredicateAccess().getRightParenthesisKeyword_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRulePrimary_expr"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:896:1: entryRulePrimary_expr returns [String current=null] : iv_rulePrimary_expr= rulePrimary_expr EOF ;
    public final String entryRulePrimary_expr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimary_expr = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:897:2: (iv_rulePrimary_expr= rulePrimary_expr EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:898:2: iv_rulePrimary_expr= rulePrimary_expr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimary_exprRule()); 
            }
            pushFollow(FOLLOW_rulePrimary_expr_in_entryRulePrimary_expr2492);
            iv_rulePrimary_expr=rulePrimary_expr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary_expr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary_expr2503); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimary_expr"


    // $ANTLR start "rulePrimary_expr"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:905:1: rulePrimary_expr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WSP_0= RULE_WSP )* ( (this_Const_func_tbl_1= ruleConst_func_tbl (this_WSP_2= RULE_WSP )* kw= '(' (this_WSP_4= RULE_WSP )* kw= ')' ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )* ) ;
    public final AntlrDatatypeRuleToken rulePrimary_expr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_0=null;
        Token this_WSP_2=null;
        Token kw=null;
        Token this_WSP_4=null;
        Token this_WSP_8=null;
        AntlrDatatypeRuleToken this_Const_func_tbl_1 = null;

        AntlrDatatypeRuleToken this_Array_6 = null;

        AntlrDatatypeRuleToken this_Strval_7 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:908:28: ( ( (this_WSP_0= RULE_WSP )* ( (this_Const_func_tbl_1= ruleConst_func_tbl (this_WSP_2= RULE_WSP )* kw= '(' (this_WSP_4= RULE_WSP )* kw= ')' ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:909:1: ( (this_WSP_0= RULE_WSP )* ( (this_Const_func_tbl_1= ruleConst_func_tbl (this_WSP_2= RULE_WSP )* kw= '(' (this_WSP_4= RULE_WSP )* kw= ')' ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:909:1: ( (this_WSP_0= RULE_WSP )* ( (this_Const_func_tbl_1= ruleConst_func_tbl (this_WSP_2= RULE_WSP )* kw= '(' (this_WSP_4= RULE_WSP )* kw= ')' ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:909:2: (this_WSP_0= RULE_WSP )* ( (this_Const_func_tbl_1= ruleConst_func_tbl (this_WSP_2= RULE_WSP )* kw= '(' (this_WSP_4= RULE_WSP )* kw= ')' ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )*
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:909:2: (this_WSP_0= RULE_WSP )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WSP) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:909:7: this_WSP_0= RULE_WSP
            	    {
            	    this_WSP_0=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePrimary_expr2544); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_0, grammarAccess.getPrimary_exprAccess().getWSPTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:916:3: ( (this_Const_func_tbl_1= ruleConst_func_tbl (this_WSP_2= RULE_WSP )* kw= '(' (this_WSP_4= RULE_WSP )* kw= ')' ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval )
            int alt28=3;
            switch ( input.LA(1) ) {
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt28=1;
                }
                break;
            case 12:
                {
                alt28=2;
                }
                break;
            case 54:
                {
                alt28=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:916:4: (this_Const_func_tbl_1= ruleConst_func_tbl (this_WSP_2= RULE_WSP )* kw= '(' (this_WSP_4= RULE_WSP )* kw= ')' )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:916:4: (this_Const_func_tbl_1= ruleConst_func_tbl (this_WSP_2= RULE_WSP )* kw= '(' (this_WSP_4= RULE_WSP )* kw= ')' )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:917:5: this_Const_func_tbl_1= ruleConst_func_tbl (this_WSP_2= RULE_WSP )* kw= '(' (this_WSP_4= RULE_WSP )* kw= ')'
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimary_exprAccess().getConst_func_tblParserRuleCall_1_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConst_func_tbl_in_rulePrimary_expr2575);
                    this_Const_func_tbl_1=ruleConst_func_tbl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Const_func_tbl_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:927:1: (this_WSP_2= RULE_WSP )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_WSP) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:927:6: this_WSP_2= RULE_WSP
                    	    {
                    	    this_WSP_2=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePrimary_expr2596); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_WSP_2);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WSP_2, grammarAccess.getPrimary_exprAccess().getWSPTerminalRuleCall_1_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    kw=(Token)match(input,12,FOLLOW_12_in_rulePrimary_expr2616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_1_0_2()); 
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:940:1: (this_WSP_4= RULE_WSP )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_WSP) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:940:6: this_WSP_4= RULE_WSP
                    	    {
                    	    this_WSP_4=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePrimary_expr2632); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_WSP_4);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WSP_4, grammarAccess.getPrimary_exprAccess().getWSPTerminalRuleCall_1_0_3()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    kw=(Token)match(input,13,FOLLOW_13_in_rulePrimary_expr2652); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimary_exprAccess().getRightParenthesisKeyword_1_0_4()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:955:5: this_Array_6= ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimary_exprAccess().getArrayParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArray_in_rulePrimary_expr2681);
                    this_Array_6=ruleArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Array_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:967:5: this_Strval_7= ruleStrval
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimary_exprAccess().getStrvalParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStrval_in_rulePrimary_expr2714);
                    this_Strval_7=ruleStrval();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_Strval_7);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:977:2: ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_WSP) ) {
                    int LA29_1 = input.LA(2);

                    if ( (synpred1_InternalRQL()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:977:3: ( RULE_WSP )=>this_WSP_8= RULE_WSP
            	    {
            	    this_WSP_8=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePrimary_expr2741); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_8, grammarAccess.getPrimary_exprAccess().getWSPTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimary_expr"


    // $ANTLR start "entryRuleFunctions_tbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:992:1: entryRuleFunctions_tbl returns [String current=null] : iv_ruleFunctions_tbl= ruleFunctions_tbl EOF ;
    public final String entryRuleFunctions_tbl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctions_tbl = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:993:2: (iv_ruleFunctions_tbl= ruleFunctions_tbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:994:2: iv_ruleFunctions_tbl= ruleFunctions_tbl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctions_tblRule()); 
            }
            pushFollow(FOLLOW_ruleFunctions_tbl_in_entryRuleFunctions_tbl2789);
            iv_ruleFunctions_tbl=ruleFunctions_tbl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctions_tbl.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctions_tbl2800); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctions_tbl"


    // $ANTLR start "ruleFunctions_tbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1001:1: ruleFunctions_tbl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'isnull' | kw= 'in' | kw= 'out' ) ;
    public final AntlrDatatypeRuleToken ruleFunctions_tbl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1004:28: ( (kw= 'isnull' | kw= 'in' | kw= 'out' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1005:1: (kw= 'isnull' | kw= 'in' | kw= 'out' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1005:1: (kw= 'isnull' | kw= 'in' | kw= 'out' )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt30=1;
                }
                break;
            case 36:
                {
                alt30=2;
                }
                break;
            case 37:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1006:2: kw= 'isnull'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleFunctions_tbl2838); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctions_tblAccess().getIsnullKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1013:2: kw= 'in'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleFunctions_tbl2857); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctions_tblAccess().getInKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1020:2: kw= 'out'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleFunctions_tbl2876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctions_tblAccess().getOutKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleFunctions_tbl"


    // $ANTLR start "entryRuleConst_func_tbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1033:1: entryRuleConst_func_tbl returns [String current=null] : iv_ruleConst_func_tbl= ruleConst_func_tbl EOF ;
    public final String entryRuleConst_func_tbl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConst_func_tbl = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1034:2: (iv_ruleConst_func_tbl= ruleConst_func_tbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1035:2: iv_ruleConst_func_tbl= ruleConst_func_tbl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConst_func_tblRule()); 
            }
            pushFollow(FOLLOW_ruleConst_func_tbl_in_entryRuleConst_func_tbl2917);
            iv_ruleConst_func_tbl=ruleConst_func_tbl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConst_func_tbl.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConst_func_tbl2928); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConst_func_tbl"


    // $ANTLR start "ruleConst_func_tbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1042:1: ruleConst_func_tbl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' | kw= 'empty' | kw= 'null' ) ;
    public final AntlrDatatypeRuleToken ruleConst_func_tbl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1045:28: ( (kw= 'true' | kw= 'false' | kw= 'empty' | kw= 'null' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1046:1: (kw= 'true' | kw= 'false' | kw= 'empty' | kw= 'null' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1046:1: (kw= 'true' | kw= 'false' | kw= 'empty' | kw= 'null' )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt31=1;
                }
                break;
            case 39:
                {
                alt31=2;
                }
                break;
            case 40:
                {
                alt31=3;
                }
                break;
            case 41:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1047:2: kw= 'true'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleConst_func_tbl2966); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConst_func_tblAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1054:2: kw= 'false'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleConst_func_tbl2985); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConst_func_tblAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1061:2: kw= 'empty'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleConst_func_tbl3004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConst_func_tblAccess().getEmptyKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1068:2: kw= 'null'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleConst_func_tbl3023); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConst_func_tblAccess().getNullKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConst_func_tbl"


    // $ANTLR start "entryRuleArray"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1081:1: entryRuleArray returns [String current=null] : iv_ruleArray= ruleArray EOF ;
    public final String entryRuleArray() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArray = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1082:2: (iv_ruleArray= ruleArray EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1083:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray3064);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray3075); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1090:1: ruleArray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= ',' (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleArray() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_WSP_1=null;
        Token this_WSP_3=null;
        Token this_WSP_5=null;
        Token this_WSP_7=null;
        AntlrDatatypeRuleToken this_Strval_2 = null;

        AntlrDatatypeRuleToken this_Strval_6 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1093:28: ( (kw= '(' (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= ',' (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= ')' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1094:1: (kw= '(' (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= ',' (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= ')' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1094:1: (kw= '(' (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= ',' (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1095:2: kw= '(' (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= ',' (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= ')'
            {
            kw=(Token)match(input,12,FOLLOW_12_in_ruleArray3113); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayAccess().getLeftParenthesisKeyword_0()); 
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1100:1: (this_WSP_1= RULE_WSP )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WSP) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1100:6: this_WSP_1= RULE_WSP
            	    {
            	    this_WSP_1=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleArray3129); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_1, grammarAccess.getArrayAccess().getWSPTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrayAccess().getStrvalParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleStrval_in_ruleArray3158);
            this_Strval_2=ruleStrval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Strval_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1118:1: (this_WSP_3= RULE_WSP )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WSP) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1118:6: this_WSP_3= RULE_WSP
            	    {
            	    this_WSP_3=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleArray3179); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_3, grammarAccess.getArrayAccess().getWSPTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1125:3: (kw= ',' (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==8) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1126:2: kw= ',' (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )*
            	    {
            	    kw=(Token)match(input,8,FOLLOW_8_in_ruleArray3200); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getArrayAccess().getCommaKeyword_4_0()); 
            	          
            	    }
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1131:1: (this_WSP_5= RULE_WSP )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==RULE_WSP) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1131:6: this_WSP_5= RULE_WSP
            	    	    {
            	    	    this_WSP_5=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleArray3216); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		current.merge(this_WSP_5);
            	    	          
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WSP_5, grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getArrayAccess().getStrvalParserRuleCall_4_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleStrval_in_ruleArray3245);
            	    this_Strval_6=ruleStrval();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Strval_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1149:1: (this_WSP_7= RULE_WSP )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==RULE_WSP) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1149:6: this_WSP_7= RULE_WSP
            	    	    {
            	    	    this_WSP_7=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleArray3266); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		current.merge(this_WSP_7);
            	    	          
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WSP_7, grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_3()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop35;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            kw=(Token)match(input,13,FOLLOW_13_in_ruleArray3288); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayAccess().getRightParenthesisKeyword_5()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleNchar"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1170:1: entryRuleNchar returns [String current=null] : iv_ruleNchar= ruleNchar EOF ;
    public final String entryRuleNchar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNchar = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1171:2: (iv_ruleNchar= ruleNchar EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1172:2: iv_ruleNchar= ruleNchar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNcharRule()); 
            }
            pushFollow(FOLLOW_ruleNchar_in_entryRuleNchar3329);
            iv_ruleNchar=ruleNchar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNchar.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNchar3340); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNchar"


    // $ANTLR start "ruleNchar"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1179:1: ruleNchar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ALPHA_0= RULE_ALPHA | this_DIGIT_1= RULE_DIGIT | kw= '-' | kw= '.' | kw= '_' | kw= '~' | kw= '$' | kw= ':' | kw= '*' | kw= '+' | kw= '?' | kw= '/' | kw= '@' ) ;
    public final AntlrDatatypeRuleToken ruleNchar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ALPHA_0=null;
        Token this_DIGIT_1=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1182:28: ( (this_ALPHA_0= RULE_ALPHA | this_DIGIT_1= RULE_DIGIT | kw= '-' | kw= '.' | kw= '_' | kw= '~' | kw= '$' | kw= ':' | kw= '*' | kw= '+' | kw= '?' | kw= '/' | kw= '@' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1183:1: (this_ALPHA_0= RULE_ALPHA | this_DIGIT_1= RULE_DIGIT | kw= '-' | kw= '.' | kw= '_' | kw= '~' | kw= '$' | kw= ':' | kw= '*' | kw= '+' | kw= '?' | kw= '/' | kw= '@' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1183:1: (this_ALPHA_0= RULE_ALPHA | this_DIGIT_1= RULE_DIGIT | kw= '-' | kw= '.' | kw= '_' | kw= '~' | kw= '$' | kw= ':' | kw= '*' | kw= '+' | kw= '?' | kw= '/' | kw= '@' )
            int alt37=13;
            switch ( input.LA(1) ) {
            case RULE_ALPHA:
                {
                alt37=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt37=2;
                }
                break;
            case 42:
                {
                alt37=3;
                }
                break;
            case 43:
                {
                alt37=4;
                }
                break;
            case 44:
                {
                alt37=5;
                }
                break;
            case 45:
                {
                alt37=6;
                }
                break;
            case 46:
                {
                alt37=7;
                }
                break;
            case 47:
                {
                alt37=8;
                }
                break;
            case 48:
                {
                alt37=9;
                }
                break;
            case 49:
                {
                alt37=10;
                }
                break;
            case 50:
                {
                alt37=11;
                }
                break;
            case 51:
                {
                alt37=12;
                }
                break;
            case 52:
                {
                alt37=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1183:6: this_ALPHA_0= RULE_ALPHA
                    {
                    this_ALPHA_0=(Token)match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_ruleNchar3380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ALPHA_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ALPHA_0, grammarAccess.getNcharAccess().getALPHATerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1191:10: this_DIGIT_1= RULE_DIGIT
                    {
                    this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleNchar3406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DIGIT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DIGIT_1, grammarAccess.getNcharAccess().getDIGITTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1200:2: kw= '-'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleNchar3430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getHyphenMinusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1207:2: kw= '.'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleNchar3449); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getFullStopKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1214:2: kw= '_'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleNchar3468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().get_Keyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1221:2: kw= '~'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleNchar3487); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getTildeKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1228:2: kw= '$'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleNchar3506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getDollarSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1235:2: kw= ':'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleNchar3525); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getColonKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1242:2: kw= '*'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleNchar3544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getAsteriskKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1249:2: kw= '+'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleNchar3563); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getPlusSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1256:2: kw= '?'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleNchar3582); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getQuestionMarkKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1263:2: kw= '/'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleNchar3601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getSolidusKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1270:2: kw= '@'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleNchar3620); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getCommercialAtKeyword_12()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNchar"


    // $ANTLR start "entryRulePct_encoded"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1283:1: entryRulePct_encoded returns [String current=null] : iv_rulePct_encoded= rulePct_encoded EOF ;
    public final String entryRulePct_encoded() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePct_encoded = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1284:2: (iv_rulePct_encoded= rulePct_encoded EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1285:2: iv_rulePct_encoded= rulePct_encoded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPct_encodedRule()); 
            }
            pushFollow(FOLLOW_rulePct_encoded_in_entryRulePct_encoded3661);
            iv_rulePct_encoded=rulePct_encoded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePct_encoded.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePct_encoded3672); if (state.failed) return current;

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
    // $ANTLR end "entryRulePct_encoded"


    // $ANTLR start "rulePct_encoded"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1292:1: rulePct_encoded returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '%' this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT ) ;
    public final AntlrDatatypeRuleToken rulePct_encoded() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_XDIGIT_1=null;
        Token this_XDIGIT_2=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1295:28: ( (kw= '%' this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1296:1: (kw= '%' this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1296:1: (kw= '%' this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1297:2: kw= '%' this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT
            {
            kw=(Token)match(input,53,FOLLOW_53_in_rulePct_encoded3710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPct_encodedAccess().getPercentSignKeyword_0()); 
                  
            }
            this_XDIGIT_1=(Token)match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rulePct_encoded3725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XDIGIT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_XDIGIT_1, grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_1()); 
                  
            }
            this_XDIGIT_2=(Token)match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rulePct_encoded3745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XDIGIT_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_XDIGIT_2, grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePct_encoded"


    // $ANTLR start "entryRuleStrval"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1324:1: entryRuleStrval returns [String current=null] : iv_ruleStrval= ruleStrval EOF ;
    public final String entryRuleStrval() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStrval = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1325:2: (iv_ruleStrval= ruleStrval EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1326:2: iv_ruleStrval= ruleStrval EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStrvalRule()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_entryRuleStrval3791);
            iv_ruleStrval=ruleStrval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStrval.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrval3802); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStrval"


    // $ANTLR start "ruleStrval"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1333:1: ruleStrval returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '\"' (this_Nchar_1= ruleNchar | this_Pct_encoded_2= rulePct_encoded )+ kw= '\"' ) ;
    public final AntlrDatatypeRuleToken ruleStrval() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Nchar_1 = null;

        AntlrDatatypeRuleToken this_Pct_encoded_2 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1336:28: ( (kw= '\"' (this_Nchar_1= ruleNchar | this_Pct_encoded_2= rulePct_encoded )+ kw= '\"' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1337:1: (kw= '\"' (this_Nchar_1= ruleNchar | this_Pct_encoded_2= rulePct_encoded )+ kw= '\"' )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1337:1: (kw= '\"' (this_Nchar_1= ruleNchar | this_Pct_encoded_2= rulePct_encoded )+ kw= '\"' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1338:2: kw= '\"' (this_Nchar_1= ruleNchar | this_Pct_encoded_2= rulePct_encoded )+ kw= '\"'
            {
            kw=(Token)match(input,54,FOLLOW_54_in_ruleStrval3840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getStrvalAccess().getQuotationMarkKeyword_0()); 
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1343:1: (this_Nchar_1= ruleNchar | this_Pct_encoded_2= rulePct_encoded )+
            int cnt38=0;
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_ALPHA && LA38_0<=RULE_DIGIT)||(LA38_0>=42 && LA38_0<=52)) ) {
                    alt38=1;
                }
                else if ( (LA38_0==53) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1344:5: this_Nchar_1= ruleNchar
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStrvalAccess().getNcharParserRuleCall_1_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleNchar_in_ruleStrval3863);
            	    this_Nchar_1=ruleNchar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Nchar_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:1356:5: this_Pct_encoded_2= rulePct_encoded
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStrvalAccess().getPct_encodedParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulePct_encoded_in_ruleStrval3896);
            	    this_Pct_encoded_2=rulePct_encoded();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Pct_encoded_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            kw=(Token)match(input,54,FOLLOW_54_in_ruleStrval3916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getStrvalAccess().getQuotationMarkKeyword_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStrval"

    // $ANTLR start synpred1_InternalRQL
    public final void synpred1_InternalRQL_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:977:3: ( RULE_WSP )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQL.g:977:5: RULE_WSP
        {
        match(input,RULE_WSP,FOLLOW_RULE_WSP_in_synpred1_InternalRQL2732); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalRQL

    // Delegated rules

    public final boolean synpred1_InternalRQL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalRQL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHo_operand_in_ruleModel131 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_8_in_ruleModel145 = new BitSet(new long[]{0x0040003FC0FFD010L});
    public static final BitSet FOLLOW_9_in_ruleModel163 = new BitSet(new long[]{0x0040003FC0FFD010L});
    public static final BitSet FOLLOW_ruleHo_operand_in_ruleModel180 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleAnd267 = new BitSet(new long[]{0x0040003FC0FFD010L});
    public static final BitSet FOLLOW_ruleHo_operand_in_ruleAnd289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleOr385 = new BitSet(new long[]{0x0040003FC0FFD010L});
    public static final BitSet FOLLOW_11_in_ruleOr404 = new BitSet(new long[]{0x0040003FC0FFD010L});
    public static final BitSet FOLLOW_ruleHo_operand_in_ruleOr427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHo_operand_in_entryRuleHo_operand473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHo_operand484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleHo_operand525 = new BitSet(new long[]{0x0040003FC0FFD010L});
    public static final BitSet FOLLOW_ruleHigher_order_call_in_ruleHo_operand555 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleCall_operator_in_ruleHo_operand588 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleHo_operand621 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleHo_operand654 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_12_in_ruleHo_operand679 = new BitSet(new long[]{0x0040003FC0FFD010L});
    public static final BitSet FOLLOW_ruleHo_operand_in_ruleHo_operand701 = new BitSet(new long[]{0x0000000000000E00L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleHo_operand730 = new BitSet(new long[]{0x0000000000002200L});
    public static final BitSet FOLLOW_ruleOr_in_ruleHo_operand766 = new BitSet(new long[]{0x0000000000002E00L});
    public static final BitSet FOLLOW_13_in_ruleHo_operand787 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleHo_operand805 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleLogical_op_aliases_in_entryRuleLogical_op_aliases853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogical_op_aliases864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleLogical_op_aliases902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleLogical_op_aliases921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleLogical_op_aliases940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHigher_order_call_in_entryRuleHigher_order_call981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHigher_order_call992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_op_aliases_in_ruleHigher_order_call1039 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleHigher_order_call1060 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleHigher_order_call1080 = new BitSet(new long[]{0x0040003FC0FFD010L});
    public static final BitSet FOLLOW_ruleHo_operand_in_ruleHigher_order_call1103 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_8_in_ruleHigher_order_call1122 = new BitSet(new long[]{0x0040003FC0FFD010L});
    public static final BitSet FOLLOW_ruleHo_operand_in_ruleHigher_order_call1144 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_13_in_ruleHigher_order_call1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_op_aliases_in_entryRuleBinary_op_aliases1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinary_op_aliases1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBinary_op_aliases1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBinary_op_aliases1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBinary_op_aliases1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBinary_op_aliases1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBinary_op_aliases1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBinary_op_aliases1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBinary_op_aliases1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComp_ops_in_entryRuleComp_ops1410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComp_ops1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleComp_ops1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleComp_ops1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleComp_ops1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleComp_ops1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleComp_ops1535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleComp_ops1554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_ruleComparison1653 = new BitSet(new long[]{0x000000003F000010L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleComparison1674 = new BitSet(new long[]{0x000000003F000010L});
    public static final BitSet FOLLOW_25_in_ruleComparison1696 = new BitSet(new long[]{0x0000000000FE0000L});
    public static final BitSet FOLLOW_ruleBinary_op_aliases_in_ruleComparison1718 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleComparison1736 = new BitSet(new long[]{0x004003C000001010L});
    public static final BitSet FOLLOW_ruleComp_ops_in_ruleComparison1765 = new BitSet(new long[]{0x004003C000001010L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_ruleComparison1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_operator_in_entryRuleCall_operator1839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall_operator1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinary_op_aliases_in_ruleCall_operator1898 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_ruleFunctions_tbl_in_ruleCall_operator1931 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleCall_operator1953 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_ruleCall_operator1973 = new BitSet(new long[]{0x004003C000003010L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_ruleCall_operator1996 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_8_in_ruleCall_operator2015 = new BitSet(new long[]{0x004003C000001010L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_ruleCall_operator2037 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_13_in_ruleCall_operator2059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePred_tbl_in_entryRulePred_tbl2100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePred_tbl2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulePred_tbl2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rulePred_tbl2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rulePred_tbl2187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePred_tbl2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePred_tbl2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate2266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePred_tbl_in_rulePredicate2324 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePredicate2345 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_rulePredicate2365 = new BitSet(new long[]{0x004003C000003010L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_rulePredicate2388 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_8_in_rulePredicate2407 = new BitSet(new long[]{0x004003C000001010L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_rulePredicate2429 = new BitSet(new long[]{0x0000000000002100L});
    public static final BitSet FOLLOW_13_in_rulePredicate2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_entryRulePrimary_expr2492 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary_expr2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePrimary_expr2544 = new BitSet(new long[]{0x004003C000001010L});
    public static final BitSet FOLLOW_ruleConst_func_tbl_in_rulePrimary_expr2575 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePrimary_expr2596 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_12_in_rulePrimary_expr2616 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePrimary_expr2632 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_13_in_rulePrimary_expr2652 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleArray_in_rulePrimary_expr2681 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleStrval_in_rulePrimary_expr2714 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePrimary_expr2741 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleFunctions_tbl_in_entryRuleFunctions_tbl2789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctions_tbl2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFunctions_tbl2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFunctions_tbl2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFunctions_tbl2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConst_func_tbl_in_entryRuleConst_func_tbl2917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConst_func_tbl2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleConst_func_tbl2966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleConst_func_tbl2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleConst_func_tbl3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleConst_func_tbl3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray3064 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleArray3113 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleArray3129 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_ruleStrval_in_ruleArray3158 = new BitSet(new long[]{0x0000000000002110L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleArray3179 = new BitSet(new long[]{0x0000000000002110L});
    public static final BitSet FOLLOW_8_in_ruleArray3200 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleArray3216 = new BitSet(new long[]{0x0040000000000010L});
    public static final BitSet FOLLOW_ruleStrval_in_ruleArray3245 = new BitSet(new long[]{0x0000000000002110L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleArray3266 = new BitSet(new long[]{0x0000000000002110L});
    public static final BitSet FOLLOW_13_in_ruleArray3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNchar_in_entryRuleNchar3329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNchar3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_ruleNchar3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleNchar3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNchar3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNchar3449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleNchar3468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleNchar3487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleNchar3506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleNchar3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleNchar3544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleNchar3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleNchar3582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleNchar3601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNchar3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePct_encoded_in_entryRulePct_encoded3661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePct_encoded3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePct_encoded3710 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rulePct_encoded3725 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rulePct_encoded3745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_entryRuleStrval3791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrval3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleStrval3840 = new BitSet(new long[]{0x003FFC0000000060L});
    public static final BitSet FOLLOW_ruleNchar_in_ruleStrval3863 = new BitSet(new long[]{0x007FFC0000000060L});
    public static final BitSet FOLLOW_rulePct_encoded_in_ruleStrval3896 = new BitSet(new long[]{0x007FFC0000000060L});
    public static final BitSet FOLLOW_54_in_ruleStrval3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_synpred1_InternalRQL2732 = new BitSet(new long[]{0x0000000000000002L});

}