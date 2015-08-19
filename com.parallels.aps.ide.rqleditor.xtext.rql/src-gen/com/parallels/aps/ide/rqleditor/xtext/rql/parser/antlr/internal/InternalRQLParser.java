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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_55", "KEYWORD_54", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_47", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "RULE_DIGIT", "RULE_XDIGIT", "RULE_ALPHA", "RULE_WSP"
    };
    public static final int KEYWORD_3=38;
    public static final int KEYWORD_2=37;
    public static final int KEYWORD_5=40;
    public static final int KEYWORD_4=39;
    public static final int KEYWORD_1=36;
    public static final int RULE_WSP=62;
    public static final int KEYWORD_29=30;
    public static final int KEYWORD_28=29;
    public static final int KEYWORD_27=28;
    public static final int KEYWORD_26=27;
    public static final int KEYWORD_25=26;
    public static final int KEYWORD_24=25;
    public static final int KEYWORD_23=58;
    public static final int KEYWORD_22=57;
    public static final int KEYWORD_21=56;
    public static final int KEYWORD_20=55;
    public static final int RULE_DIGIT=59;
    public static final int KEYWORD_19=54;
    public static final int KEYWORD_18=53;
    public static final int KEYWORD_17=52;
    public static final int KEYWORD_16=51;
    public static final int KEYWORD_15=50;
    public static final int KEYWORD_14=49;
    public static final int KEYWORD_13=48;
    public static final int KEYWORD_12=47;
    public static final int KEYWORD_55=4;
    public static final int KEYWORD_11=46;
    public static final int KEYWORD_54=5;
    public static final int KEYWORD_10=45;
    public static final int KEYWORD_53=8;
    public static final int KEYWORD_52=7;
    public static final int KEYWORD_51=6;
    public static final int KEYWORD_50=11;
    public static final int RULE_ALPHA=61;
    public static final int KEYWORD_49=10;
    public static final int KEYWORD_48=9;
    public static final int KEYWORD_47=21;
    public static final int KEYWORD_46=20;
    public static final int KEYWORD_45=19;
    public static final int KEYWORD_44=18;
    public static final int KEYWORD_43=17;
    public static final int KEYWORD_42=16;
    public static final int KEYWORD_41=15;
    public static final int EOF=-1;
    public static final int KEYWORD_40=14;
    public static final int KEYWORD_39=13;
    public static final int KEYWORD_38=12;
    public static final int KEYWORD_37=24;
    public static final int KEYWORD_36=23;
    public static final int KEYWORD_35=22;
    public static final int KEYWORD_34=35;
    public static final int RULE_XDIGIT=60;
    public static final int KEYWORD_33=34;
    public static final int KEYWORD_32=33;
    public static final int KEYWORD_31=32;
    public static final int KEYWORD_30=31;
    public static final int KEYWORD_7=42;
    public static final int KEYWORD_6=41;
    public static final int KEYWORD_9=44;
    public static final int KEYWORD_8=43;

    // delegates
    // delegators


        public InternalRQLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRQLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRQLParser.tokenNames; }
    public String getGrammarFileName() { return "../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g"; }




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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:61:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:62:2: (iv_ruleModel= ruleModel EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:63:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel77); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:70:1: ruleModel returns [EObject current=null] : ( ( (lv_operands_0_0= ruleHoOperand ) ) ( (otherlv_1= KEYWORD_10 | otherlv_2= KEYWORD_5 ) ruleHoOperand )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_operands_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:73:28: ( ( ( (lv_operands_0_0= ruleHoOperand ) ) ( (otherlv_1= KEYWORD_10 | otherlv_2= KEYWORD_5 ) ruleHoOperand )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:74:1: ( ( (lv_operands_0_0= ruleHoOperand ) ) ( (otherlv_1= KEYWORD_10 | otherlv_2= KEYWORD_5 ) ruleHoOperand )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:74:1: ( ( (lv_operands_0_0= ruleHoOperand ) ) ( (otherlv_1= KEYWORD_10 | otherlv_2= KEYWORD_5 ) ruleHoOperand )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:74:2: ( (lv_operands_0_0= ruleHoOperand ) ) ( (otherlv_1= KEYWORD_10 | otherlv_2= KEYWORD_5 ) ruleHoOperand )*
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:74:2: ( (lv_operands_0_0= ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:75:1: (lv_operands_0_0= ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:75:1: (lv_operands_0_0= ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:76:3: lv_operands_0_0= ruleHoOperand
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getModelAccess().getOperandsHoOperandParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleHoOperand_in_ruleModel123);
            lv_operands_0_0=ruleHoOperand();

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
                      		"HoOperand");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:92:2: ( (otherlv_1= KEYWORD_10 | otherlv_2= KEYWORD_5 ) ruleHoOperand )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==KEYWORD_5||LA2_0==KEYWORD_10) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:92:3: (otherlv_1= KEYWORD_10 | otherlv_2= KEYWORD_5 ) ruleHoOperand
            	    {
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:92:3: (otherlv_1= KEYWORD_10 | otherlv_2= KEYWORD_5 )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==KEYWORD_10) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==KEYWORD_5) ) {
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
            	            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:93:2: otherlv_1= KEYWORD_10
            	            {
            	            otherlv_1=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleModel138); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getCommaKeyword_1_0_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:99:2: otherlv_2= KEYWORD_5
            	            {
            	            otherlv_2=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleModel156); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getModelAccess().getAmpersandKeyword_1_0_1());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getModelAccess().getHoOperandParserRuleCall_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleHoOperand_in_ruleModel172);
            	    ruleHoOperand();

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:119:1: entryRuleAnd returns [String current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final String entryRuleAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnd = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:120:1: (iv_ruleAnd= ruleAnd EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:121:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd209);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd220); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:128:1: ruleAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_5 this_HoOperand_1= ruleHoOperand ) ;
    public final AntlrDatatypeRuleToken ruleAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_HoOperand_1 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:132:6: ( (kw= KEYWORD_5 this_HoOperand_1= ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:133:1: (kw= KEYWORD_5 this_HoOperand_1= ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:133:1: (kw= KEYWORD_5 this_HoOperand_1= ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:134:2: kw= KEYWORD_5 this_HoOperand_1= ruleHoOperand
            {
            kw=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleAnd258); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getAndAccess().getAmpersandKeyword_0()); 
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndAccess().getHoOperandParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleHoOperand_in_ruleAnd280);
            this_HoOperand_1=ruleHoOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_HoOperand_1);
                  
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:158:1: entryRuleOr returns [String current=null] : iv_ruleOr= ruleOr EOF ;
    public final String entryRuleOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOr = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:159:1: (iv_ruleOr= ruleOr EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:160:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr325);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr336); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:167:1: ruleOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_15 | kw= KEYWORD_22 ) this_HoOperand_2= ruleHoOperand ) ;
    public final AntlrDatatypeRuleToken ruleOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_HoOperand_2 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:171:6: ( ( (kw= KEYWORD_15 | kw= KEYWORD_22 ) this_HoOperand_2= ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:172:1: ( (kw= KEYWORD_15 | kw= KEYWORD_22 ) this_HoOperand_2= ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:172:1: ( (kw= KEYWORD_15 | kw= KEYWORD_22 ) this_HoOperand_2= ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:172:2: (kw= KEYWORD_15 | kw= KEYWORD_22 ) this_HoOperand_2= ruleHoOperand
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:172:2: (kw= KEYWORD_15 | kw= KEYWORD_22 )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_15) ) {
                alt3=1;
            }
            else if ( (LA3_0==KEYWORD_22) ) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:173:2: kw= KEYWORD_15
                    {
                    kw=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleOr375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOrAccess().getSemicolonKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:180:2: kw= KEYWORD_22
                    {
                    kw=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleOr394); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOrAccess().getVerticalLineKeyword_0_1()); 
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAccess().getHoOperandParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleHoOperand_in_ruleOr417);
            this_HoOperand_2=ruleHoOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_HoOperand_2);
                  
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


    // $ANTLR start "entryRuleHoOperand"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:204:1: entryRuleHoOperand returns [String current=null] : iv_ruleHoOperand= ruleHoOperand EOF ;
    public final String entryRuleHoOperand() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHoOperand = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:205:1: (iv_ruleHoOperand= ruleHoOperand EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:206:2: iv_ruleHoOperand= ruleHoOperand EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHoOperandRule()); 
            }
            pushFollow(FOLLOW_ruleHoOperand_in_entryRuleHoOperand462);
            iv_ruleHoOperand=ruleHoOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHoOperand.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHoOperand473); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHoOperand"


    // $ANTLR start "ruleHoOperand"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:213:1: ruleHoOperand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WSP_0= RULE_WSP )* (this_HigherOrderCall_1= ruleHigherOrderCall | this_CallOperator_2= ruleCallOperator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= KEYWORD_6 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_7 ) )? (this_WSP_10= RULE_WSP )* (kw= KEYWORD_2 )? (kw= KEYWORD_1 )? ) ;
    public final AntlrDatatypeRuleToken ruleHoOperand() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_0=null;
        Token kw=null;
        Token this_WSP_10=null;
        AntlrDatatypeRuleToken this_HigherOrderCall_1 = null;

        AntlrDatatypeRuleToken this_CallOperator_2 = null;

        AntlrDatatypeRuleToken this_Predicate_3 = null;

        AntlrDatatypeRuleToken this_Comparison_4 = null;

        AntlrDatatypeRuleToken this_HoOperand_6 = null;

        AntlrDatatypeRuleToken this_And_7 = null;

        AntlrDatatypeRuleToken this_Or_8 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:217:6: ( ( (this_WSP_0= RULE_WSP )* (this_HigherOrderCall_1= ruleHigherOrderCall | this_CallOperator_2= ruleCallOperator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= KEYWORD_6 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_7 ) )? (this_WSP_10= RULE_WSP )* (kw= KEYWORD_2 )? (kw= KEYWORD_1 )? ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:218:1: ( (this_WSP_0= RULE_WSP )* (this_HigherOrderCall_1= ruleHigherOrderCall | this_CallOperator_2= ruleCallOperator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= KEYWORD_6 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_7 ) )? (this_WSP_10= RULE_WSP )* (kw= KEYWORD_2 )? (kw= KEYWORD_1 )? )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:218:1: ( (this_WSP_0= RULE_WSP )* (this_HigherOrderCall_1= ruleHigherOrderCall | this_CallOperator_2= ruleCallOperator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= KEYWORD_6 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_7 ) )? (this_WSP_10= RULE_WSP )* (kw= KEYWORD_2 )? (kw= KEYWORD_1 )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:218:2: (this_WSP_0= RULE_WSP )* (this_HigherOrderCall_1= ruleHigherOrderCall | this_CallOperator_2= ruleCallOperator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= KEYWORD_6 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_7 ) )? (this_WSP_10= RULE_WSP )* (kw= KEYWORD_2 )? (kw= KEYWORD_1 )?
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:218:2: (this_WSP_0= RULE_WSP )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_WSP) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:218:7: this_WSP_0= RULE_WSP
            	    {
            	    this_WSP_0=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleHoOperand514); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_0, grammarAccess.getHoOperandAccess().getWSPTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:225:3: (this_HigherOrderCall_1= ruleHigherOrderCall | this_CallOperator_2= ruleCallOperator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= KEYWORD_6 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_7 ) )?
            int alt6=6;
            switch ( input.LA(1) ) {
                case KEYWORD_35:
                case KEYWORD_36:
                case KEYWORD_34:
                    {
                    alt6=1;
                    }
                    break;
                case KEYWORD_52:
                case KEYWORD_44:
                case KEYWORD_37:
                case KEYWORD_27:
                case KEYWORD_28:
                case KEYWORD_29:
                case KEYWORD_30:
                case KEYWORD_31:
                case KEYWORD_32:
                case KEYWORD_33:
                    {
                    alt6=2;
                    }
                    break;
                case KEYWORD_55:
                case KEYWORD_54:
                case KEYWORD_53:
                case KEYWORD_50:
                case KEYWORD_46:
                    {
                    alt6=3;
                    }
                    break;
                case KEYWORD_3:
                case KEYWORD_4:
                case KEYWORD_8:
                case KEYWORD_9:
                case KEYWORD_11:
                case KEYWORD_12:
                case KEYWORD_13:
                case KEYWORD_14:
                case KEYWORD_19:
                case KEYWORD_20:
                case KEYWORD_21:
                case KEYWORD_23:
                case RULE_DIGIT:
                case RULE_ALPHA:
                    {
                    alt6=4;
                    }
                    break;
                case KEYWORD_6:
                    {
                    alt6=5;
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:226:5: this_HigherOrderCall_1= ruleHigherOrderCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHoOperandAccess().getHigherOrderCallParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHigherOrderCall_in_ruleHoOperand544);
                    this_HigherOrderCall_1=ruleHigherOrderCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HigherOrderCall_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:238:5: this_CallOperator_2= ruleCallOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHoOperandAccess().getCallOperatorParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCallOperator_in_ruleHoOperand577);
                    this_CallOperator_2=ruleCallOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CallOperator_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:250:5: this_Predicate_3= rulePredicate
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHoOperandAccess().getPredicateParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_rulePredicate_in_ruleHoOperand610);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:262:5: this_Comparison_4= ruleComparison
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHoOperandAccess().getComparisonParserRuleCall_1_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleComparison_in_ruleHoOperand643);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:273:6: (kw= KEYWORD_6 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_7 )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:273:6: (kw= KEYWORD_6 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_7 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:274:2: kw= KEYWORD_6 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_7
                    {
                    kw=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleHoOperand668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getHoOperandAccess().getLeftParenthesisKeyword_1_4_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getHoOperandAccess().getHoOperandParserRuleCall_1_4_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHoOperand_in_ruleHoOperand690);
                    this_HoOperand_6=ruleHoOperand();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_HoOperand_6);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:290:1: (this_And_7= ruleAnd | this_Or_8= ruleOr )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==KEYWORD_5) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==KEYWORD_15||LA5_0==KEYWORD_22) ) {
                        alt5=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:291:5: this_And_7= ruleAnd
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getHoOperandAccess().getAndParserRuleCall_1_4_2_0()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleAnd_in_ruleHoOperand718);
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
                        case 2 :
                            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:303:5: this_Or_8= ruleOr
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getHoOperandAccess().getOrParserRuleCall_1_4_2_1()); 
                                  
                            }
                            pushFollow(FOLLOW_ruleOr_in_ruleHoOperand751);
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

                    }

                    kw=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleHoOperand770); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getHoOperandAccess().getRightParenthesisKeyword_1_4_3()); 
                          
                    }

                    }


                    }
                    break;

            }

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:319:4: (this_WSP_10= RULE_WSP )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_WSP) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:319:9: this_WSP_10= RULE_WSP
            	    {
            	    this_WSP_10=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleHoOperand789); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_10);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_10, grammarAccess.getHoOperandAccess().getWSPTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:326:3: (kw= KEYWORD_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_2) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:327:2: kw= KEYWORD_2
                    {
                    kw=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_ruleHoOperand810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getHoOperandAccess().getControl000dKeyword_3()); 
                          
                    }

                    }
                    break;

            }

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:332:3: (kw= KEYWORD_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_1) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:333:2: kw= KEYWORD_1
                    {
                    kw=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleHoOperand826); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getHoOperandAccess().getControl000aKeyword_4()); 
                          
                    }

                    }
                    break;

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
    // $ANTLR end "ruleHoOperand"


    // $ANTLR start "entryRuleHigherOrderCall"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:346:1: entryRuleHigherOrderCall returns [String current=null] : iv_ruleHigherOrderCall= ruleHigherOrderCall EOF ;
    public final String entryRuleHigherOrderCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHigherOrderCall = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:347:1: (iv_ruleHigherOrderCall= ruleHigherOrderCall EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:348:2: iv_ruleHigherOrderCall= ruleHigherOrderCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHigherOrderCallRule()); 
            }
            pushFollow(FOLLOW_ruleHigherOrderCall_in_entryRuleHigherOrderCall868);
            iv_ruleHigherOrderCall=ruleHigherOrderCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHigherOrderCall.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHigherOrderCall879); if (state.failed) return current;

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
    // $ANTLR end "entryRuleHigherOrderCall"


    // $ANTLR start "ruleHigherOrderCall"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:355:1: ruleHigherOrderCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LogicalOpAliases_0= ruleLogicalOpAliases (this_WSP_1= RULE_WSP )* kw= KEYWORD_6 (this_HoOperand_3= ruleHoOperand (kw= KEYWORD_10 this_HoOperand_5= ruleHoOperand )* ) kw= KEYWORD_7 ) ;
    public final AntlrDatatypeRuleToken ruleHigherOrderCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_LogicalOpAliases_0 = null;

        AntlrDatatypeRuleToken this_HoOperand_3 = null;

        AntlrDatatypeRuleToken this_HoOperand_5 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:359:6: ( (this_LogicalOpAliases_0= ruleLogicalOpAliases (this_WSP_1= RULE_WSP )* kw= KEYWORD_6 (this_HoOperand_3= ruleHoOperand (kw= KEYWORD_10 this_HoOperand_5= ruleHoOperand )* ) kw= KEYWORD_7 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:360:1: (this_LogicalOpAliases_0= ruleLogicalOpAliases (this_WSP_1= RULE_WSP )* kw= KEYWORD_6 (this_HoOperand_3= ruleHoOperand (kw= KEYWORD_10 this_HoOperand_5= ruleHoOperand )* ) kw= KEYWORD_7 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:360:1: (this_LogicalOpAliases_0= ruleLogicalOpAliases (this_WSP_1= RULE_WSP )* kw= KEYWORD_6 (this_HoOperand_3= ruleHoOperand (kw= KEYWORD_10 this_HoOperand_5= ruleHoOperand )* ) kw= KEYWORD_7 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:361:5: this_LogicalOpAliases_0= ruleLogicalOpAliases (this_WSP_1= RULE_WSP )* kw= KEYWORD_6 (this_HoOperand_3= ruleHoOperand (kw= KEYWORD_10 this_HoOperand_5= ruleHoOperand )* ) kw= KEYWORD_7
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getHigherOrderCallAccess().getLogicalOpAliasesParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOpAliases_in_ruleHigherOrderCall926);
            this_LogicalOpAliases_0=ruleLogicalOpAliases();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LogicalOpAliases_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:371:1: (this_WSP_1= RULE_WSP )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_WSP) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:371:6: this_WSP_1= RULE_WSP
            	    {
            	    this_WSP_1=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleHigherOrderCall947); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_1, grammarAccess.getHigherOrderCallAccess().getWSPTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            kw=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleHigherOrderCall967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getHigherOrderCallAccess().getLeftParenthesisKeyword_2()); 
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:384:1: (this_HoOperand_3= ruleHoOperand (kw= KEYWORD_10 this_HoOperand_5= ruleHoOperand )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:385:5: this_HoOperand_3= ruleHoOperand (kw= KEYWORD_10 this_HoOperand_5= ruleHoOperand )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getHigherOrderCallAccess().getHoOperandParserRuleCall_3_0()); 
                  
            }
            pushFollow(FOLLOW_ruleHoOperand_in_ruleHigherOrderCall990);
            this_HoOperand_3=ruleHoOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_HoOperand_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:395:1: (kw= KEYWORD_10 this_HoOperand_5= ruleHoOperand )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==KEYWORD_10) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:396:2: kw= KEYWORD_10 this_HoOperand_5= ruleHoOperand
            	    {
            	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleHigherOrderCall1009); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getHigherOrderCallAccess().getCommaKeyword_3_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getHigherOrderCallAccess().getHoOperandParserRuleCall_3_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleHoOperand_in_ruleHigherOrderCall1031);
            	    this_HoOperand_5=ruleHoOperand();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_HoOperand_5);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            kw=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleHigherOrderCall1052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getHigherOrderCallAccess().getRightParenthesisKeyword_4()); 
                  
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
    // $ANTLR end "ruleHigherOrderCall"


    // $ANTLR start "entryRuleBinaryOpAliasesWithEqualsSign"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:426:1: entryRuleBinaryOpAliasesWithEqualsSign returns [String current=null] : iv_ruleBinaryOpAliasesWithEqualsSign= ruleBinaryOpAliasesWithEqualsSign EOF ;
    public final String entryRuleBinaryOpAliasesWithEqualsSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOpAliasesWithEqualsSign = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:427:1: (iv_ruleBinaryOpAliasesWithEqualsSign= ruleBinaryOpAliasesWithEqualsSign EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:428:2: iv_ruleBinaryOpAliasesWithEqualsSign= ruleBinaryOpAliasesWithEqualsSign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOpAliasesWithEqualsSignRule()); 
            }
            pushFollow(FOLLOW_ruleBinaryOpAliasesWithEqualsSign_in_entryRuleBinaryOpAliasesWithEqualsSign1092);
            iv_ruleBinaryOpAliasesWithEqualsSign=ruleBinaryOpAliasesWithEqualsSign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOpAliasesWithEqualsSign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOpAliasesWithEqualsSign1103); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinaryOpAliasesWithEqualsSign"


    // $ANTLR start "ruleBinaryOpAliasesWithEqualsSign"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:435:1: ruleBinaryOpAliasesWithEqualsSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_43 | kw= KEYWORD_38 | kw= KEYWORD_42 | kw= KEYWORD_41 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_51 ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOpAliasesWithEqualsSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:439:6: ( (kw= KEYWORD_43 | kw= KEYWORD_38 | kw= KEYWORD_42 | kw= KEYWORD_41 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_51 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:440:1: (kw= KEYWORD_43 | kw= KEYWORD_38 | kw= KEYWORD_42 | kw= KEYWORD_41 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_51 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:440:1: (kw= KEYWORD_43 | kw= KEYWORD_38 | kw= KEYWORD_42 | kw= KEYWORD_41 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_51 )
            int alt12=7;
            switch ( input.LA(1) ) {
            case KEYWORD_43:
                {
                alt12=1;
                }
                break;
            case KEYWORD_38:
                {
                alt12=2;
                }
                break;
            case KEYWORD_42:
                {
                alt12=3;
                }
                break;
            case KEYWORD_41:
                {
                alt12=4;
                }
                break;
            case KEYWORD_40:
                {
                alt12=5;
                }
                break;
            case KEYWORD_39:
                {
                alt12=6;
                }
                break;
            case KEYWORD_51:
                {
                alt12=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:441:2: kw= KEYWORD_43
                    {
                    kw=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleBinaryOpAliasesWithEqualsSign1141); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getNeKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:448:2: kw= KEYWORD_38
                    {
                    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleBinaryOpAliasesWithEqualsSign1160); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getEqKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:455:2: kw= KEYWORD_42
                    {
                    kw=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleBinaryOpAliasesWithEqualsSign1179); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getLtKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:462:2: kw= KEYWORD_41
                    {
                    kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleBinaryOpAliasesWithEqualsSign1198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getLeKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:469:2: kw= KEYWORD_40
                    {
                    kw=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleBinaryOpAliasesWithEqualsSign1217); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getGtKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:476:2: kw= KEYWORD_39
                    {
                    kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleBinaryOpAliasesWithEqualsSign1236); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getGeKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:483:2: kw= KEYWORD_51
                    {
                    kw=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_ruleBinaryOpAliasesWithEqualsSign1255); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getLikeKeyword_6()); 
                          
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
    // $ANTLR end "ruleBinaryOpAliasesWithEqualsSign"


    // $ANTLR start "entryRuleBinaryOpAliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:496:1: entryRuleBinaryOpAliases returns [String current=null] : iv_ruleBinaryOpAliases= ruleBinaryOpAliases EOF ;
    public final String entryRuleBinaryOpAliases() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOpAliases = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:497:1: (iv_ruleBinaryOpAliases= ruleBinaryOpAliases EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:498:2: iv_ruleBinaryOpAliases= ruleBinaryOpAliases EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOpAliasesRule()); 
            }
            pushFollow(FOLLOW_ruleBinaryOpAliases_in_entryRuleBinaryOpAliases1295);
            iv_ruleBinaryOpAliases=ruleBinaryOpAliases();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOpAliases.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOpAliases1306); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBinaryOpAliases"


    // $ANTLR start "ruleBinaryOpAliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:505:1: ruleBinaryOpAliases returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_33 | kw= KEYWORD_27 | kw= KEYWORD_32 | kw= KEYWORD_31 | kw= KEYWORD_29 | kw= KEYWORD_28 | kw= KEYWORD_44 ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOpAliases() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:509:6: ( (kw= KEYWORD_33 | kw= KEYWORD_27 | kw= KEYWORD_32 | kw= KEYWORD_31 | kw= KEYWORD_29 | kw= KEYWORD_28 | kw= KEYWORD_44 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:510:1: (kw= KEYWORD_33 | kw= KEYWORD_27 | kw= KEYWORD_32 | kw= KEYWORD_31 | kw= KEYWORD_29 | kw= KEYWORD_28 | kw= KEYWORD_44 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:510:1: (kw= KEYWORD_33 | kw= KEYWORD_27 | kw= KEYWORD_32 | kw= KEYWORD_31 | kw= KEYWORD_29 | kw= KEYWORD_28 | kw= KEYWORD_44 )
            int alt13=7;
            switch ( input.LA(1) ) {
            case KEYWORD_33:
                {
                alt13=1;
                }
                break;
            case KEYWORD_27:
                {
                alt13=2;
                }
                break;
            case KEYWORD_32:
                {
                alt13=3;
                }
                break;
            case KEYWORD_31:
                {
                alt13=4;
                }
                break;
            case KEYWORD_29:
                {
                alt13=5;
                }
                break;
            case KEYWORD_28:
                {
                alt13=6;
                }
                break;
            case KEYWORD_44:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:511:2: kw= KEYWORD_33
                    {
                    kw=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleBinaryOpAliases1344); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesAccess().getNeKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:518:2: kw= KEYWORD_27
                    {
                    kw=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleBinaryOpAliases1363); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesAccess().getEqKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:525:2: kw= KEYWORD_32
                    {
                    kw=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleBinaryOpAliases1382); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesAccess().getLtKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:532:2: kw= KEYWORD_31
                    {
                    kw=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleBinaryOpAliases1401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesAccess().getLeKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:539:2: kw= KEYWORD_29
                    {
                    kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleBinaryOpAliases1420); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesAccess().getGtKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:546:2: kw= KEYWORD_28
                    {
                    kw=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleBinaryOpAliases1439); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesAccess().getGeKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:553:2: kw= KEYWORD_44
                    {
                    kw=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_ruleBinaryOpAliases1458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesAccess().getLikeKeyword_6()); 
                          
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
    // $ANTLR end "ruleBinaryOpAliases"


    // $ANTLR start "entryRuleCompOps"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:566:1: entryRuleCompOps returns [String current=null] : iv_ruleCompOps= ruleCompOps EOF ;
    public final String entryRuleCompOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompOps = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:567:1: (iv_ruleCompOps= ruleCompOps EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:568:2: iv_ruleCompOps= ruleCompOps EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompOpsRule()); 
            }
            pushFollow(FOLLOW_ruleCompOps_in_entryRuleCompOps1498);
            iv_ruleCompOps=ruleCompOps();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompOps.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompOps1509); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompOps"


    // $ANTLR start "ruleCompOps"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:575:1: ruleCompOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_24 | kw= KEYWORD_17 | kw= KEYWORD_16 | kw= KEYWORD_25 | kw= KEYWORD_18 | kw= KEYWORD_26 ) ;
    public final AntlrDatatypeRuleToken ruleCompOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:579:6: ( (kw= KEYWORD_24 | kw= KEYWORD_17 | kw= KEYWORD_16 | kw= KEYWORD_25 | kw= KEYWORD_18 | kw= KEYWORD_26 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:580:1: (kw= KEYWORD_24 | kw= KEYWORD_17 | kw= KEYWORD_16 | kw= KEYWORD_25 | kw= KEYWORD_18 | kw= KEYWORD_26 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:580:1: (kw= KEYWORD_24 | kw= KEYWORD_17 | kw= KEYWORD_16 | kw= KEYWORD_25 | kw= KEYWORD_18 | kw= KEYWORD_26 )
            int alt14=6;
            switch ( input.LA(1) ) {
            case KEYWORD_24:
                {
                alt14=1;
                }
                break;
            case KEYWORD_17:
                {
                alt14=2;
                }
                break;
            case KEYWORD_16:
                {
                alt14=3;
                }
                break;
            case KEYWORD_25:
                {
                alt14=4;
                }
                break;
            case KEYWORD_18:
                {
                alt14=5;
                }
                break;
            case KEYWORD_26:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:581:2: kw= KEYWORD_24
                    {
                    kw=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleCompOps1547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompOpsAccess().getExclamationMarkEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:588:2: kw= KEYWORD_17
                    {
                    kw=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleCompOps1566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompOpsAccess().getEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:595:2: kw= KEYWORD_16
                    {
                    kw=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleCompOps1585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompOpsAccess().getLessThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:602:2: kw= KEYWORD_25
                    {
                    kw=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleCompOps1604); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompOpsAccess().getLessThanSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:609:2: kw= KEYWORD_18
                    {
                    kw=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleCompOps1623); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompOpsAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:616:2: kw= KEYWORD_26
                    {
                    kw=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleCompOps1642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompOpsAccess().getGreaterThanSignEqualsSignKeyword_5()); 
                          
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
    // $ANTLR end "ruleCompOps"


    // $ANTLR start "entryRuleComparison"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:629:1: entryRuleComparison returns [String current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final String entryRuleComparison() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparison = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:630:1: (iv_ruleComparison= ruleComparison EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:631:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1682);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1693); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:638:1: ruleComparison returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* (this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign | this_CompOps_3= ruleCompOps ) this_PrimaryExpr_4= rulePrimaryExpr ) ;
    public final AntlrDatatypeRuleToken ruleComparison() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_1=null;
        AntlrDatatypeRuleToken this_Strval_0 = null;

        AntlrDatatypeRuleToken this_BinaryOpAliasesWithEqualsSign_2 = null;

        AntlrDatatypeRuleToken this_CompOps_3 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr_4 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:642:6: ( (this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* (this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign | this_CompOps_3= ruleCompOps ) this_PrimaryExpr_4= rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:643:1: (this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* (this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign | this_CompOps_3= ruleCompOps ) this_PrimaryExpr_4= rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:643:1: (this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* (this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign | this_CompOps_3= ruleCompOps ) this_PrimaryExpr_4= rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:644:5: this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* (this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign | this_CompOps_3= ruleCompOps ) this_PrimaryExpr_4= rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getStrvalParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleStrval_in_ruleComparison1740);
            this_Strval_0=ruleStrval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Strval_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:654:1: (this_WSP_1= RULE_WSP )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_WSP) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:654:6: this_WSP_1= RULE_WSP
            	    {
            	    this_WSP_1=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleComparison1761); if (state.failed) return current;
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

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:661:3: (this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign | this_CompOps_3= ruleCompOps )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEYWORD_51||(LA16_0>=KEYWORD_38 && LA16_0<=KEYWORD_43)) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=KEYWORD_24 && LA16_0<=KEYWORD_26)||(LA16_0>=KEYWORD_16 && LA16_0<=KEYWORD_18)) ) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:662:5: this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparisonAccess().getBinaryOpAliasesWithEqualsSignParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinaryOpAliasesWithEqualsSign_in_ruleComparison1791);
                    this_BinaryOpAliasesWithEqualsSign_2=ruleBinaryOpAliasesWithEqualsSign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BinaryOpAliasesWithEqualsSign_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:674:5: this_CompOps_3= ruleCompOps
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparisonAccess().getCompOpsParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompOps_in_ruleComparison1824);
                    this_CompOps_3=ruleCompOps();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_CompOps_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getPrimaryExprParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_ruleComparison1852);
            this_PrimaryExpr_4=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_PrimaryExpr_4);
                  
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


    // $ANTLR start "entryRuleCallOperator"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:703:1: entryRuleCallOperator returns [String current=null] : iv_ruleCallOperator= ruleCallOperator EOF ;
    public final String entryRuleCallOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCallOperator = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:704:1: (iv_ruleCallOperator= ruleCallOperator EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:705:2: iv_ruleCallOperator= ruleCallOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCallOperator_in_entryRuleCallOperator1897);
            iv_ruleCallOperator=ruleCallOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallOperator1908); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCallOperator"


    // $ANTLR start "ruleCallOperator"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:712:1: ruleCallOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_BinaryOpAliases_0= ruleBinaryOpAliases | this_FunctionsTbl_1= ruleFunctionsTbl ) (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_6= rulePrimaryExpr )* )? kw= KEYWORD_7 ) ;
    public final AntlrDatatypeRuleToken ruleCallOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_2=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_BinaryOpAliases_0 = null;

        AntlrDatatypeRuleToken this_FunctionsTbl_1 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr_4 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr_6 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:716:6: ( ( (this_BinaryOpAliases_0= ruleBinaryOpAliases | this_FunctionsTbl_1= ruleFunctionsTbl ) (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_6= rulePrimaryExpr )* )? kw= KEYWORD_7 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:717:1: ( (this_BinaryOpAliases_0= ruleBinaryOpAliases | this_FunctionsTbl_1= ruleFunctionsTbl ) (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_6= rulePrimaryExpr )* )? kw= KEYWORD_7 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:717:1: ( (this_BinaryOpAliases_0= ruleBinaryOpAliases | this_FunctionsTbl_1= ruleFunctionsTbl ) (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_6= rulePrimaryExpr )* )? kw= KEYWORD_7 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:717:2: (this_BinaryOpAliases_0= ruleBinaryOpAliases | this_FunctionsTbl_1= ruleFunctionsTbl ) (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_6= rulePrimaryExpr )* )? kw= KEYWORD_7
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:717:2: (this_BinaryOpAliases_0= ruleBinaryOpAliases | this_FunctionsTbl_1= ruleFunctionsTbl )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KEYWORD_44||(LA17_0>=KEYWORD_27 && LA17_0<=KEYWORD_29)||(LA17_0>=KEYWORD_31 && LA17_0<=KEYWORD_33)) ) {
                alt17=1;
            }
            else if ( (LA17_0==KEYWORD_52||LA17_0==KEYWORD_37||LA17_0==KEYWORD_30) ) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:718:5: this_BinaryOpAliases_0= ruleBinaryOpAliases
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCallOperatorAccess().getBinaryOpAliasesParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinaryOpAliases_in_ruleCallOperator1956);
                    this_BinaryOpAliases_0=ruleBinaryOpAliases();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_BinaryOpAliases_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:730:5: this_FunctionsTbl_1= ruleFunctionsTbl
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCallOperatorAccess().getFunctionsTblParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionsTbl_in_ruleCallOperator1989);
                    this_FunctionsTbl_1=ruleFunctionsTbl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_FunctionsTbl_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:740:2: (this_WSP_2= RULE_WSP )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_WSP) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:740:7: this_WSP_2= RULE_WSP
            	    {
            	    this_WSP_2=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleCallOperator2011); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_2, grammarAccess.getCallOperatorAccess().getWSPTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            kw=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleCallOperator2031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCallOperatorAccess().getLeftParenthesisKeyword_2()); 
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:753:1: (this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_6= rulePrimaryExpr )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=KEYWORD_48 && LA20_0<=KEYWORD_49)||LA20_0==KEYWORD_45||LA20_0==KEYWORD_47||(LA20_0>=KEYWORD_3 && LA20_0<=KEYWORD_4)||LA20_0==KEYWORD_6||(LA20_0>=KEYWORD_8 && LA20_0<=KEYWORD_9)||(LA20_0>=KEYWORD_11 && LA20_0<=KEYWORD_14)||(LA20_0>=KEYWORD_19 && LA20_0<=KEYWORD_21)||(LA20_0>=KEYWORD_23 && LA20_0<=RULE_DIGIT)||(LA20_0>=RULE_ALPHA && LA20_0<=RULE_WSP)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:754:5: this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_6= rulePrimaryExpr )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCallOperatorAccess().getPrimaryExprParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpr_in_ruleCallOperator2054);
                    this_PrimaryExpr_4=rulePrimaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PrimaryExpr_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:764:1: (kw= KEYWORD_10 this_PrimaryExpr_6= rulePrimaryExpr )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==KEYWORD_10) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:765:2: kw= KEYWORD_10 this_PrimaryExpr_6= rulePrimaryExpr
                    	    {
                    	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleCallOperator2073); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getCallOperatorAccess().getCommaKeyword_3_1_0()); 
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getCallOperatorAccess().getPrimaryExprParserRuleCall_3_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_rulePrimaryExpr_in_ruleCallOperator2095);
                    	    this_PrimaryExpr_6=rulePrimaryExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_PrimaryExpr_6);
                    	          
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

            kw=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleCallOperator2117); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCallOperatorAccess().getRightParenthesisKeyword_4()); 
                  
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
    // $ANTLR end "ruleCallOperator"


    // $ANTLR start "entryRulePredicate"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:795:1: entryRulePredicate returns [String current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final String entryRulePredicate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePredicate = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:796:1: (iv_rulePredicate= rulePredicate EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:797:2: iv_rulePredicate= rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate2157);
            iv_rulePredicate=rulePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicate.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate2168); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:804:1: rulePredicate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PredTbl_0= rulePredTbl (this_WSP_1= RULE_WSP )* kw= KEYWORD_6 (this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_5= rulePrimaryExpr )* )? kw= KEYWORD_7 ) ;
    public final AntlrDatatypeRuleToken rulePredicate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_PredTbl_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr_3 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr_5 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:808:6: ( (this_PredTbl_0= rulePredTbl (this_WSP_1= RULE_WSP )* kw= KEYWORD_6 (this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_5= rulePrimaryExpr )* )? kw= KEYWORD_7 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:809:1: (this_PredTbl_0= rulePredTbl (this_WSP_1= RULE_WSP )* kw= KEYWORD_6 (this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_5= rulePrimaryExpr )* )? kw= KEYWORD_7 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:809:1: (this_PredTbl_0= rulePredTbl (this_WSP_1= RULE_WSP )* kw= KEYWORD_6 (this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_5= rulePrimaryExpr )* )? kw= KEYWORD_7 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:810:5: this_PredTbl_0= rulePredTbl (this_WSP_1= RULE_WSP )* kw= KEYWORD_6 (this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_5= rulePrimaryExpr )* )? kw= KEYWORD_7
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPredicateAccess().getPredTblParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePredTbl_in_rulePredicate2215);
            this_PredTbl_0=rulePredTbl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_PredTbl_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:820:1: (this_WSP_1= RULE_WSP )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_WSP) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:820:6: this_WSP_1= RULE_WSP
            	    {
            	    this_WSP_1=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePredicate2236); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_1, grammarAccess.getPredicateAccess().getWSPTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            kw=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rulePredicate2256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_2()); 
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:833:1: (this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_5= rulePrimaryExpr )* )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=KEYWORD_48 && LA23_0<=KEYWORD_49)||LA23_0==KEYWORD_45||LA23_0==KEYWORD_47||(LA23_0>=KEYWORD_3 && LA23_0<=KEYWORD_4)||LA23_0==KEYWORD_6||(LA23_0>=KEYWORD_8 && LA23_0<=KEYWORD_9)||(LA23_0>=KEYWORD_11 && LA23_0<=KEYWORD_14)||(LA23_0>=KEYWORD_19 && LA23_0<=KEYWORD_21)||(LA23_0>=KEYWORD_23 && LA23_0<=RULE_DIGIT)||(LA23_0>=RULE_ALPHA && LA23_0<=RULE_WSP)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:834:5: this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_10 this_PrimaryExpr_5= rulePrimaryExpr )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredicateAccess().getPrimaryExprParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpr_in_rulePredicate2279);
                    this_PrimaryExpr_3=rulePrimaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PrimaryExpr_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:844:1: (kw= KEYWORD_10 this_PrimaryExpr_5= rulePrimaryExpr )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==KEYWORD_10) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:845:2: kw= KEYWORD_10 this_PrimaryExpr_5= rulePrimaryExpr
                    	    {
                    	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rulePredicate2298); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getPredicateAccess().getCommaKeyword_3_1_0()); 
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getPredicateAccess().getPrimaryExprParserRuleCall_3_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_rulePrimaryExpr_in_rulePredicate2320);
                    	    this_PrimaryExpr_5=rulePrimaryExpr();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_PrimaryExpr_5);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              afterParserOrEnumRuleCall();
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rulePredicate2342); if (state.failed) return current;
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


    // $ANTLR start "entryRulePredTbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:875:1: entryRulePredTbl returns [String current=null] : iv_rulePredTbl= rulePredTbl EOF ;
    public final String entryRulePredTbl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePredTbl = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:876:1: (iv_rulePredTbl= rulePredTbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:877:2: iv_rulePredTbl= rulePredTbl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredTblRule()); 
            }
            pushFollow(FOLLOW_rulePredTbl_in_entryRulePredTbl2382);
            iv_rulePredTbl=rulePredTbl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredTbl.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredTbl2393); if (state.failed) return current;

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
    // $ANTLR end "entryRulePredTbl"


    // $ANTLR start "rulePredTbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:884:1: rulePredTbl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_53 | kw= KEYWORD_46 | kw= KEYWORD_50 | kw= KEYWORD_55 | kw= KEYWORD_54 ) ;
    public final AntlrDatatypeRuleToken rulePredTbl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:888:6: ( (kw= KEYWORD_53 | kw= KEYWORD_46 | kw= KEYWORD_50 | kw= KEYWORD_55 | kw= KEYWORD_54 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:889:1: (kw= KEYWORD_53 | kw= KEYWORD_46 | kw= KEYWORD_50 | kw= KEYWORD_55 | kw= KEYWORD_54 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:889:1: (kw= KEYWORD_53 | kw= KEYWORD_46 | kw= KEYWORD_50 | kw= KEYWORD_55 | kw= KEYWORD_54 )
            int alt24=5;
            switch ( input.LA(1) ) {
            case KEYWORD_53:
                {
                alt24=1;
                }
                break;
            case KEYWORD_46:
                {
                alt24=2;
                }
                break;
            case KEYWORD_50:
                {
                alt24=3;
                }
                break;
            case KEYWORD_55:
                {
                alt24=4;
                }
                break;
            case KEYWORD_54:
                {
                alt24=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:890:2: kw= KEYWORD_53
                    {
                    kw=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_rulePredTbl2431); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPredTblAccess().getSelectKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:897:2: kw= KEYWORD_46
                    {
                    kw=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_rulePredTbl2450); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPredTblAccess().getSortKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:904:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_rulePredTbl2469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPredTblAccess().getLimitKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:911:2: kw= KEYWORD_55
                    {
                    kw=(Token)match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_rulePredTbl2488); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPredTblAccess().getImplementingKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:918:2: kw= KEYWORD_54
                    {
                    kw=(Token)match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_rulePredTbl2507); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPredTblAccess().getComposingKeyword_4()); 
                          
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
    // $ANTLR end "rulePredTbl"


    // $ANTLR start "entryRulePrimaryExpr"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:931:1: entryRulePrimaryExpr returns [String current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final String entryRulePrimaryExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpr = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:932:1: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:933:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr2547);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpr2558); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:940:1: rulePrimaryExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WSP_0= RULE_WSP )* ( (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_WSP_4= RULE_WSP )* kw= KEYWORD_7 ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )* ) ;
    public final AntlrDatatypeRuleToken rulePrimaryExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_0=null;
        Token this_WSP_2=null;
        Token kw=null;
        Token this_WSP_4=null;
        Token this_WSP_8=null;
        AntlrDatatypeRuleToken this_ConstFuncTbl_1 = null;

        AntlrDatatypeRuleToken this_Array_6 = null;

        AntlrDatatypeRuleToken this_Strval_7 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:944:6: ( ( (this_WSP_0= RULE_WSP )* ( (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_WSP_4= RULE_WSP )* kw= KEYWORD_7 ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:945:1: ( (this_WSP_0= RULE_WSP )* ( (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_WSP_4= RULE_WSP )* kw= KEYWORD_7 ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:945:1: ( (this_WSP_0= RULE_WSP )* ( (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_WSP_4= RULE_WSP )* kw= KEYWORD_7 ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:945:2: (this_WSP_0= RULE_WSP )* ( (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_WSP_4= RULE_WSP )* kw= KEYWORD_7 ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )*
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:945:2: (this_WSP_0= RULE_WSP )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_WSP) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:945:7: this_WSP_0= RULE_WSP
            	    {
            	    this_WSP_0=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePrimaryExpr2599); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_0, grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:952:3: ( (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_WSP_4= RULE_WSP )* kw= KEYWORD_7 ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval )
            int alt28=3;
            switch ( input.LA(1) ) {
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_45:
            case KEYWORD_47:
                {
                alt28=1;
                }
                break;
            case KEYWORD_6:
                {
                alt28=2;
                }
                break;
            case KEYWORD_3:
            case KEYWORD_4:
            case KEYWORD_8:
            case KEYWORD_9:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_14:
            case KEYWORD_19:
            case KEYWORD_20:
            case KEYWORD_21:
            case KEYWORD_23:
            case RULE_DIGIT:
            case RULE_ALPHA:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:952:4: (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_WSP_4= RULE_WSP )* kw= KEYWORD_7 )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:952:4: (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_WSP_4= RULE_WSP )* kw= KEYWORD_7 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:953:5: this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_6 (this_WSP_4= RULE_WSP )* kw= KEYWORD_7
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExprAccess().getConstFuncTblParserRuleCall_1_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstFuncTbl_in_rulePrimaryExpr2630);
                    this_ConstFuncTbl_1=ruleConstFuncTbl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ConstFuncTbl_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:963:1: (this_WSP_2= RULE_WSP )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==RULE_WSP) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:963:6: this_WSP_2= RULE_WSP
                    	    {
                    	    this_WSP_2=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePrimaryExpr2651); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_WSP_2);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WSP_2, grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_1_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    kw=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rulePrimaryExpr2671); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_1_0_2()); 
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:976:1: (this_WSP_4= RULE_WSP )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==RULE_WSP) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:976:6: this_WSP_4= RULE_WSP
                    	    {
                    	    this_WSP_4=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePrimaryExpr2687); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_WSP_4);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WSP_4, grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_1_0_3()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    kw=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rulePrimaryExpr2707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_1_0_4()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:991:5: this_Array_6= ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExprAccess().getArrayParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArray_in_rulePrimaryExpr2736);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1003:5: this_Strval_7= ruleStrval
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExprAccess().getStrvalParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStrval_in_rulePrimaryExpr2769);
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

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1013:2: ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_WSP) ) {
                    int LA29_1 = input.LA(2);

                    if ( (synpred1_InternalRQLParser()) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1013:3: ( RULE_WSP )=>this_WSP_8= RULE_WSP
            	    {
            	    this_WSP_8=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePrimaryExpr2795); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_8, grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_2()); 
            	          
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
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleFunctionsTbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1028:1: entryRuleFunctionsTbl returns [String current=null] : iv_ruleFunctionsTbl= ruleFunctionsTbl EOF ;
    public final String entryRuleFunctionsTbl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionsTbl = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1029:1: (iv_ruleFunctionsTbl= ruleFunctionsTbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1030:2: iv_ruleFunctionsTbl= ruleFunctionsTbl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionsTblRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionsTbl_in_entryRuleFunctionsTbl2842);
            iv_ruleFunctionsTbl=ruleFunctionsTbl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionsTbl.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionsTbl2853); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFunctionsTbl"


    // $ANTLR start "ruleFunctionsTbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1037:1: ruleFunctionsTbl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_52 | kw= KEYWORD_30 | kw= KEYWORD_37 ) ;
    public final AntlrDatatypeRuleToken ruleFunctionsTbl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1041:6: ( (kw= KEYWORD_52 | kw= KEYWORD_30 | kw= KEYWORD_37 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1042:1: (kw= KEYWORD_52 | kw= KEYWORD_30 | kw= KEYWORD_37 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1042:1: (kw= KEYWORD_52 | kw= KEYWORD_30 | kw= KEYWORD_37 )
            int alt30=3;
            switch ( input.LA(1) ) {
            case KEYWORD_52:
                {
                alt30=1;
                }
                break;
            case KEYWORD_30:
                {
                alt30=2;
                }
                break;
            case KEYWORD_37:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1043:2: kw= KEYWORD_52
                    {
                    kw=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_ruleFunctionsTbl2891); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionsTblAccess().getIsnullKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1050:2: kw= KEYWORD_30
                    {
                    kw=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleFunctionsTbl2910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionsTblAccess().getInKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1057:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleFunctionsTbl2929); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionsTblAccess().getOutKeyword_2()); 
                          
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
    // $ANTLR end "ruleFunctionsTbl"


    // $ANTLR start "entryRuleConstFuncTbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1070:1: entryRuleConstFuncTbl returns [String current=null] : iv_ruleConstFuncTbl= ruleConstFuncTbl EOF ;
    public final String entryRuleConstFuncTbl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstFuncTbl = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1071:1: (iv_ruleConstFuncTbl= ruleConstFuncTbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1072:2: iv_ruleConstFuncTbl= ruleConstFuncTbl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstFuncTblRule()); 
            }
            pushFollow(FOLLOW_ruleConstFuncTbl_in_entryRuleConstFuncTbl2969);
            iv_ruleConstFuncTbl=ruleConstFuncTbl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstFuncTbl.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstFuncTbl2980); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConstFuncTbl"


    // $ANTLR start "ruleConstFuncTbl"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1079:1: ruleConstFuncTbl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_47 | kw= KEYWORD_49 | kw= KEYWORD_48 | kw= KEYWORD_45 ) ;
    public final AntlrDatatypeRuleToken ruleConstFuncTbl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1083:6: ( (kw= KEYWORD_47 | kw= KEYWORD_49 | kw= KEYWORD_48 | kw= KEYWORD_45 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1084:1: (kw= KEYWORD_47 | kw= KEYWORD_49 | kw= KEYWORD_48 | kw= KEYWORD_45 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1084:1: (kw= KEYWORD_47 | kw= KEYWORD_49 | kw= KEYWORD_48 | kw= KEYWORD_45 )
            int alt31=4;
            switch ( input.LA(1) ) {
            case KEYWORD_47:
                {
                alt31=1;
                }
                break;
            case KEYWORD_49:
                {
                alt31=2;
                }
                break;
            case KEYWORD_48:
                {
                alt31=3;
                }
                break;
            case KEYWORD_45:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1085:2: kw= KEYWORD_47
                    {
                    kw=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleConstFuncTbl3018); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConstFuncTblAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1092:2: kw= KEYWORD_49
                    {
                    kw=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleConstFuncTbl3037); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConstFuncTblAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1099:2: kw= KEYWORD_48
                    {
                    kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_ruleConstFuncTbl3056); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConstFuncTblAccess().getEmptyKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1106:2: kw= KEYWORD_45
                    {
                    kw=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleConstFuncTbl3075); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConstFuncTblAccess().getNullKeyword_3()); 
                          
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
    // $ANTLR end "ruleConstFuncTbl"


    // $ANTLR start "entryRuleArray"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1119:1: entryRuleArray returns [String current=null] : iv_ruleArray= ruleArray EOF ;
    public final String entryRuleArray() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArray = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1120:1: (iv_ruleArray= ruleArray EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1121:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray3115);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray3126); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1128:1: ruleArray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_6 (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= KEYWORD_10 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= KEYWORD_7 ) ;
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1132:6: ( (kw= KEYWORD_6 (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= KEYWORD_10 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= KEYWORD_7 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1133:1: (kw= KEYWORD_6 (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= KEYWORD_10 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= KEYWORD_7 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1133:1: (kw= KEYWORD_6 (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= KEYWORD_10 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= KEYWORD_7 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1134:2: kw= KEYWORD_6 (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= KEYWORD_10 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= KEYWORD_7
            {
            kw=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleArray3164); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayAccess().getLeftParenthesisKeyword_0()); 
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1139:1: (this_WSP_1= RULE_WSP )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_WSP) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1139:6: this_WSP_1= RULE_WSP
            	    {
            	    this_WSP_1=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleArray3180); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleStrval_in_ruleArray3209);
            this_Strval_2=ruleStrval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Strval_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1157:1: (this_WSP_3= RULE_WSP )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_WSP) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1157:6: this_WSP_3= RULE_WSP
            	    {
            	    this_WSP_3=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleArray3230); if (state.failed) return current;
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

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1164:3: (kw= KEYWORD_10 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==KEYWORD_10) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1165:2: kw= KEYWORD_10 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )*
            	    {
            	    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleArray3251); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getArrayAccess().getCommaKeyword_4_0()); 
            	          
            	    }
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1170:1: (this_WSP_5= RULE_WSP )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==RULE_WSP) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1170:6: this_WSP_5= RULE_WSP
            	    	    {
            	    	    this_WSP_5=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleArray3267); if (state.failed) return current;
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
            	    pushFollow(FOLLOW_ruleStrval_in_ruleArray3296);
            	    this_Strval_6=ruleStrval();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Strval_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1188:1: (this_WSP_7= RULE_WSP )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==RULE_WSP) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1188:6: this_WSP_7= RULE_WSP
            	    	    {
            	    	    this_WSP_7=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleArray3317); if (state.failed) return current;
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

            kw=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleArray3339); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1209:1: entryRuleNchar returns [String current=null] : iv_ruleNchar= ruleNchar EOF ;
    public final String entryRuleNchar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNchar = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1210:1: (iv_ruleNchar= ruleNchar EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1211:2: iv_ruleNchar= ruleNchar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNcharRule()); 
            }
            pushFollow(FOLLOW_ruleNchar_in_entryRuleNchar3379);
            iv_ruleNchar=ruleNchar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNchar.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNchar3390); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1218:1: ruleNchar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ALPHA_0= RULE_ALPHA | this_DIGIT_1= RULE_DIGIT | kw= KEYWORD_11 | kw= KEYWORD_12 | kw= KEYWORD_21 | kw= KEYWORD_23 | kw= KEYWORD_3 | kw= KEYWORD_14 | kw= KEYWORD_8 | kw= KEYWORD_9 | kw= KEYWORD_19 | kw= KEYWORD_13 | kw= KEYWORD_20 ) ;
    public final AntlrDatatypeRuleToken ruleNchar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ALPHA_0=null;
        Token this_DIGIT_1=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1222:6: ( (this_ALPHA_0= RULE_ALPHA | this_DIGIT_1= RULE_DIGIT | kw= KEYWORD_11 | kw= KEYWORD_12 | kw= KEYWORD_21 | kw= KEYWORD_23 | kw= KEYWORD_3 | kw= KEYWORD_14 | kw= KEYWORD_8 | kw= KEYWORD_9 | kw= KEYWORD_19 | kw= KEYWORD_13 | kw= KEYWORD_20 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1223:1: (this_ALPHA_0= RULE_ALPHA | this_DIGIT_1= RULE_DIGIT | kw= KEYWORD_11 | kw= KEYWORD_12 | kw= KEYWORD_21 | kw= KEYWORD_23 | kw= KEYWORD_3 | kw= KEYWORD_14 | kw= KEYWORD_8 | kw= KEYWORD_9 | kw= KEYWORD_19 | kw= KEYWORD_13 | kw= KEYWORD_20 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1223:1: (this_ALPHA_0= RULE_ALPHA | this_DIGIT_1= RULE_DIGIT | kw= KEYWORD_11 | kw= KEYWORD_12 | kw= KEYWORD_21 | kw= KEYWORD_23 | kw= KEYWORD_3 | kw= KEYWORD_14 | kw= KEYWORD_8 | kw= KEYWORD_9 | kw= KEYWORD_19 | kw= KEYWORD_13 | kw= KEYWORD_20 )
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
            case KEYWORD_11:
                {
                alt37=3;
                }
                break;
            case KEYWORD_12:
                {
                alt37=4;
                }
                break;
            case KEYWORD_21:
                {
                alt37=5;
                }
                break;
            case KEYWORD_23:
                {
                alt37=6;
                }
                break;
            case KEYWORD_3:
                {
                alt37=7;
                }
                break;
            case KEYWORD_14:
                {
                alt37=8;
                }
                break;
            case KEYWORD_8:
                {
                alt37=9;
                }
                break;
            case KEYWORD_9:
                {
                alt37=10;
                }
                break;
            case KEYWORD_19:
                {
                alt37=11;
                }
                break;
            case KEYWORD_13:
                {
                alt37=12;
                }
                break;
            case KEYWORD_20:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1223:6: this_ALPHA_0= RULE_ALPHA
                    {
                    this_ALPHA_0=(Token)match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_ruleNchar3430); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ALPHA_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ALPHA_0, grammarAccess.getNcharAccess().getALPHATerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1231:10: this_DIGIT_1= RULE_DIGIT
                    {
                    this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleNchar3456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DIGIT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DIGIT_1, grammarAccess.getNcharAccess().getDIGITTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1240:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleNchar3480); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getHyphenMinusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1247:2: kw= KEYWORD_12
                    {
                    kw=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleNchar3499); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getFullStopKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1254:2: kw= KEYWORD_21
                    {
                    kw=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleNchar3518); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().get_Keyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1261:2: kw= KEYWORD_23
                    {
                    kw=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleNchar3537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getTildeKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1268:2: kw= KEYWORD_3
                    {
                    kw=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleNchar3556); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getDollarSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1275:2: kw= KEYWORD_14
                    {
                    kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleNchar3575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getColonKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1282:2: kw= KEYWORD_8
                    {
                    kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleNchar3594); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getAsteriskKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1289:2: kw= KEYWORD_9
                    {
                    kw=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNchar3613); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getPlusSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1296:2: kw= KEYWORD_19
                    {
                    kw=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleNchar3632); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getQuestionMarkKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1303:2: kw= KEYWORD_13
                    {
                    kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleNchar3651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getSolidusKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1310:2: kw= KEYWORD_20
                    {
                    kw=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleNchar3670); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1323:1: entryRulePct_encoded returns [String current=null] : iv_rulePct_encoded= rulePct_encoded EOF ;
    public final String entryRulePct_encoded() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePct_encoded = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1324:1: (iv_rulePct_encoded= rulePct_encoded EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1325:2: iv_rulePct_encoded= rulePct_encoded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPct_encodedRule()); 
            }
            pushFollow(FOLLOW_rulePct_encoded_in_entryRulePct_encoded3710);
            iv_rulePct_encoded=rulePct_encoded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePct_encoded.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePct_encoded3721); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1332:1: rulePct_encoded returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_4 this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT ) ;
    public final AntlrDatatypeRuleToken rulePct_encoded() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_XDIGIT_1=null;
        Token this_XDIGIT_2=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1336:6: ( (kw= KEYWORD_4 this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1337:1: (kw= KEYWORD_4 this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1337:1: (kw= KEYWORD_4 this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1338:2: kw= KEYWORD_4 this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT
            {
            kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rulePct_encoded3759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPct_encodedAccess().getPercentSignKeyword_0()); 
                  
            }
            this_XDIGIT_1=(Token)match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rulePct_encoded3774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XDIGIT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_XDIGIT_1, grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_1()); 
                  
            }
            this_XDIGIT_2=(Token)match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rulePct_encoded3794); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1365:1: entryRuleStrval returns [String current=null] : iv_ruleStrval= ruleStrval EOF ;
    public final String entryRuleStrval() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStrval = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1366:1: (iv_ruleStrval= ruleStrval EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1367:2: iv_ruleStrval= ruleStrval EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStrvalRule()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_entryRuleStrval3839);
            iv_ruleStrval=ruleStrval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStrval.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrval3850); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1374:1: ruleStrval returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Nchar_0= ruleNchar | this_Pct_encoded_1= rulePct_encoded )+ ;
    public final AntlrDatatypeRuleToken ruleStrval() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Nchar_0 = null;

        AntlrDatatypeRuleToken this_Pct_encoded_1 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1378:6: ( (this_Nchar_0= ruleNchar | this_Pct_encoded_1= rulePct_encoded )+ )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1379:1: (this_Nchar_0= ruleNchar | this_Pct_encoded_1= rulePct_encoded )+
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1379:1: (this_Nchar_0= ruleNchar | this_Pct_encoded_1= rulePct_encoded )+
            int cnt38=0;
            loop38:
            do {
                int alt38=3;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==KEYWORD_3||(LA38_0>=KEYWORD_8 && LA38_0<=KEYWORD_9)||(LA38_0>=KEYWORD_11 && LA38_0<=KEYWORD_14)||(LA38_0>=KEYWORD_19 && LA38_0<=KEYWORD_21)||(LA38_0>=KEYWORD_23 && LA38_0<=RULE_DIGIT)||LA38_0==RULE_ALPHA) ) {
                    alt38=1;
                }
                else if ( (LA38_0==KEYWORD_4) ) {
                    alt38=2;
                }


                switch (alt38) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1380:5: this_Nchar_0= ruleNchar
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStrvalAccess().getNcharParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleNchar_in_ruleStrval3897);
            	    this_Nchar_0=ruleNchar();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Nchar_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1392:5: this_Pct_encoded_1= rulePct_encoded
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStrvalAccess().getPct_encodedParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulePct_encoded_in_ruleStrval3930);
            	    this_Pct_encoded_1=rulePct_encoded();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Pct_encoded_1);
            	          
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


    // $ANTLR start "entryRuleLogicalOpAliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1410:1: entryRuleLogicalOpAliases returns [String current=null] : iv_ruleLogicalOpAliases= ruleLogicalOpAliases EOF ;
    public final String entryRuleLogicalOpAliases() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalOpAliases = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1411:1: (iv_ruleLogicalOpAliases= ruleLogicalOpAliases EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1412:2: iv_ruleLogicalOpAliases= ruleLogicalOpAliases EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOpAliasesRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOpAliases_in_entryRuleLogicalOpAliases3976);
            iv_ruleLogicalOpAliases=ruleLogicalOpAliases();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOpAliases.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOpAliases3987); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLogicalOpAliases"


    // $ANTLR start "ruleLogicalOpAliases"
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1419:1: ruleLogicalOpAliases returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_34 | kw= KEYWORD_35 | kw= KEYWORD_36 ) ;
    public final AntlrDatatypeRuleToken ruleLogicalOpAliases() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1423:6: ( (kw= KEYWORD_34 | kw= KEYWORD_35 | kw= KEYWORD_36 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1424:1: (kw= KEYWORD_34 | kw= KEYWORD_35 | kw= KEYWORD_36 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1424:1: (kw= KEYWORD_34 | kw= KEYWORD_35 | kw= KEYWORD_36 )
            int alt39=3;
            switch ( input.LA(1) ) {
            case KEYWORD_34:
                {
                alt39=1;
                }
                break;
            case KEYWORD_35:
                {
                alt39=2;
                }
                break;
            case KEYWORD_36:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1425:2: kw= KEYWORD_34
                    {
                    kw=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleLogicalOpAliases4025); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogicalOpAliasesAccess().getOrKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1432:2: kw= KEYWORD_35
                    {
                    kw=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleLogicalOpAliases4044); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogicalOpAliasesAccess().getAndKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1439:2: kw= KEYWORD_36
                    {
                    kw=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleLogicalOpAliases4063); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogicalOpAliasesAccess().getNotKeyword_2()); 
                          
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
    // $ANTLR end "ruleLogicalOpAliases"

    // $ANTLR start synpred1_InternalRQLParser
    public final void synpred1_InternalRQLParser_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1013:3: ( RULE_WSP )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1013:4: RULE_WSP
        {
        match(input,RULE_WSP,FOLLOW_RULE_WSP_in_synpred1_InternalRQLParser2786); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalRQLParser

    // Delegated rules

    public final boolean synpred1_InternalRQLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalRQLParser_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_EOF_in_entryRuleModel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleModel123 = new BitSet(new long[]{0x0000210000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleModel138 = new BitSet(new long[]{0x6DC3FBFFF1D409B0L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleModel156 = new BitSet(new long[]{0x6DC3FBFFF1D409B0L});
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleModel172 = new BitSet(new long[]{0x0000210000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleAnd258 = new BitSet(new long[]{0x6DC3DAFFF1D409B0L});
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleAnd280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleOr375 = new BitSet(new long[]{0x6DC3DAFFF1D409B0L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleOr394 = new BitSet(new long[]{0x6DC3DAFFF1D409B0L});
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleOr417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_entryRuleHoOperand462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHoOperand473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleHoOperand514 = new BitSet(new long[]{0x6DC3DAFFF1D409B2L});
    public static final BitSet FOLLOW_ruleHigherOrderCall_in_ruleHoOperand544 = new BitSet(new long[]{0x4000003000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_ruleHoOperand577 = new BitSet(new long[]{0x4000003000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleHoOperand610 = new BitSet(new long[]{0x4000003000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleHoOperand643 = new BitSet(new long[]{0x4000003000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleHoOperand668 = new BitSet(new long[]{0x6FC7DBFFF1D409B0L});
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleHoOperand690 = new BitSet(new long[]{0x6FC7DBFFF1D409B0L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleHoOperand718 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleOr_in_ruleHoOperand751 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleHoOperand770 = new BitSet(new long[]{0x4000003000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleHoOperand789 = new BitSet(new long[]{0x4000003000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_ruleHoOperand810 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleHoOperand826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHigherOrderCall_in_entryRuleHigherOrderCall868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHigherOrderCall879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOpAliases_in_ruleHigherOrderCall926 = new BitSet(new long[]{0x4000020000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleHigherOrderCall947 = new BitSet(new long[]{0x4000020000000000L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleHigherOrderCall967 = new BitSet(new long[]{0x6DC3FEFFF1D409B0L});
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleHigherOrderCall990 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleHigherOrderCall1009 = new BitSet(new long[]{0x6DC3FEFFF1D409B0L});
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleHigherOrderCall1031 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleHigherOrderCall1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOpAliasesWithEqualsSign_in_entryRuleBinaryOpAliasesWithEqualsSign1092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOpAliasesWithEqualsSign1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleBinaryOpAliasesWithEqualsSign1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleBinaryOpAliasesWithEqualsSign1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleBinaryOpAliasesWithEqualsSign1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleBinaryOpAliasesWithEqualsSign1198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleBinaryOpAliasesWithEqualsSign1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleBinaryOpAliasesWithEqualsSign1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_ruleBinaryOpAliasesWithEqualsSign1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOpAliases_in_entryRuleBinaryOpAliases1295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOpAliases1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleBinaryOpAliases1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleBinaryOpAliases1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleBinaryOpAliases1382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleBinaryOpAliases1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleBinaryOpAliases1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleBinaryOpAliases1439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_ruleBinaryOpAliases1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompOps_in_entryRuleCompOps1498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompOps1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleCompOps1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleCompOps1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleCompOps1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleCompOps1604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleCompOps1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleCompOps1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_ruleComparison1740 = new BitSet(new long[]{0x403800000E03F040L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleComparison1761 = new BitSet(new long[]{0x403800000E03F040L});
    public static final BitSet FOLLOW_ruleBinaryOpAliasesWithEqualsSign_in_ruleComparison1791 = new BitSet(new long[]{0x6DC3DAC000280600L});
    public static final BitSet FOLLOW_ruleCompOps_in_ruleComparison1824 = new BitSet(new long[]{0x6DC3DAC000280600L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleComparison1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_entryRuleCallOperator1897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallOperator1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOpAliases_in_ruleCallOperator1956 = new BitSet(new long[]{0x4000020000000000L});
    public static final BitSet FOLLOW_ruleFunctionsTbl_in_ruleCallOperator1989 = new BitSet(new long[]{0x4000020000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleCallOperator2011 = new BitSet(new long[]{0x4000020000000000L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleCallOperator2031 = new BitSet(new long[]{0x6DC3DEC000280600L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleCallOperator2054 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleCallOperator2073 = new BitSet(new long[]{0x6DC3DAC000280600L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleCallOperator2095 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleCallOperator2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate2157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredTbl_in_rulePredicate2215 = new BitSet(new long[]{0x4000020000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePredicate2236 = new BitSet(new long[]{0x4000020000000000L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rulePredicate2256 = new BitSet(new long[]{0x6DC3DEC000280600L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rulePredicate2279 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rulePredicate2298 = new BitSet(new long[]{0x6DC3DAC000280600L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rulePredicate2320 = new BitSet(new long[]{0x0000240000000000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rulePredicate2342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredTbl_in_entryRulePredTbl2382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredTbl2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_rulePredTbl2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_rulePredTbl2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_rulePredTbl2469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_rulePredTbl2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_rulePredTbl2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr2547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpr2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePrimaryExpr2599 = new BitSet(new long[]{0x6DC3DAC000280600L});
    public static final BitSet FOLLOW_ruleConstFuncTbl_in_rulePrimaryExpr2630 = new BitSet(new long[]{0x4000020000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePrimaryExpr2651 = new BitSet(new long[]{0x4000020000000000L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rulePrimaryExpr2671 = new BitSet(new long[]{0x4000040000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePrimaryExpr2687 = new BitSet(new long[]{0x4000040000000000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rulePrimaryExpr2707 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rulePrimaryExpr2736 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rulePrimaryExpr2769 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePrimaryExpr2795 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionsTbl_in_entryRuleFunctionsTbl2842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionsTbl2853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_ruleFunctionsTbl2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleFunctionsTbl2910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleFunctionsTbl2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstFuncTbl_in_entryRuleConstFuncTbl2969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstFuncTbl2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleConstFuncTbl3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleConstFuncTbl3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_ruleConstFuncTbl3056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleConstFuncTbl3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray3115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleArray3164 = new BitSet(new long[]{0x6DC3D8C000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleArray3180 = new BitSet(new long[]{0x6DC3D8C000000000L});
    public static final BitSet FOLLOW_ruleStrval_in_ruleArray3209 = new BitSet(new long[]{0x4000240000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleArray3230 = new BitSet(new long[]{0x4000240000000000L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleArray3251 = new BitSet(new long[]{0x6DC3D8C000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleArray3267 = new BitSet(new long[]{0x6DC3D8C000000000L});
    public static final BitSet FOLLOW_ruleStrval_in_ruleArray3296 = new BitSet(new long[]{0x4000240000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleArray3317 = new BitSet(new long[]{0x4000240000000000L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleArray3339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNchar_in_entryRuleNchar3379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNchar3390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_ruleNchar3430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleNchar3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleNchar3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleNchar3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleNchar3518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleNchar3537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleNchar3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleNchar3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleNchar3594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNchar3613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleNchar3632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleNchar3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleNchar3670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePct_encoded_in_entryRulePct_encoded3710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePct_encoded3721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rulePct_encoded3759 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rulePct_encoded3774 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rulePct_encoded3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_entryRuleStrval3839 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrval3850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNchar_in_ruleStrval3897 = new BitSet(new long[]{0x2DC3D8C000000002L});
    public static final BitSet FOLLOW_rulePct_encoded_in_ruleStrval3930 = new BitSet(new long[]{0x2DC3D8C000000002L});
    public static final BitSet FOLLOW_ruleLogicalOpAliases_in_entryRuleLogicalOpAliases3976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOpAliases3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleLogicalOpAliases4025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleLogicalOpAliases4044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleLogicalOpAliases4063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_synpred1_InternalRQLParser2786 = new BitSet(new long[]{0x0000000000000002L});

}