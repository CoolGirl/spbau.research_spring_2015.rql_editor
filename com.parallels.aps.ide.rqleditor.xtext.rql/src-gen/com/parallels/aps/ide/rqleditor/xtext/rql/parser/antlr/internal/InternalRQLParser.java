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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_53", "KEYWORD_52", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_46", "KEYWORD_47", "KEYWORD_48", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "KEYWORD_20", "KEYWORD_21", "RULE_DIGIT", "RULE_XDIGIT", "RULE_ALPHA", "RULE_WSP"
    };
    public static final int KEYWORD_3=38;
    public static final int KEYWORD_2=37;
    public static final int KEYWORD_5=40;
    public static final int KEYWORD_4=39;
    public static final int KEYWORD_1=36;
    public static final int RULE_WSP=60;
    public static final int KEYWORD_29=32;
    public static final int KEYWORD_28=31;
    public static final int KEYWORD_27=30;
    public static final int KEYWORD_26=29;
    public static final int KEYWORD_25=28;
    public static final int KEYWORD_24=27;
    public static final int KEYWORD_23=26;
    public static final int KEYWORD_22=25;
    public static final int KEYWORD_21=56;
    public static final int KEYWORD_20=55;
    public static final int RULE_DIGIT=57;
    public static final int KEYWORD_19=54;
    public static final int KEYWORD_18=53;
    public static final int KEYWORD_17=52;
    public static final int KEYWORD_16=51;
    public static final int KEYWORD_15=50;
    public static final int KEYWORD_14=49;
    public static final int KEYWORD_13=48;
    public static final int KEYWORD_12=47;
    public static final int KEYWORD_11=46;
    public static final int KEYWORD_10=45;
    public static final int KEYWORD_53=4;
    public static final int KEYWORD_52=5;
    public static final int KEYWORD_51=8;
    public static final int KEYWORD_50=7;
    public static final int RULE_ALPHA=59;
    public static final int KEYWORD_49=6;
    public static final int KEYWORD_48=11;
    public static final int KEYWORD_47=10;
    public static final int KEYWORD_46=9;
    public static final int KEYWORD_45=21;
    public static final int KEYWORD_44=20;
    public static final int KEYWORD_43=19;
    public static final int KEYWORD_42=18;
    public static final int KEYWORD_41=17;
    public static final int EOF=-1;
    public static final int KEYWORD_40=16;
    public static final int KEYWORD_39=15;
    public static final int KEYWORD_38=14;
    public static final int KEYWORD_37=13;
    public static final int KEYWORD_36=12;
    public static final int KEYWORD_35=24;
    public static final int KEYWORD_34=23;
    public static final int RULE_XDIGIT=58;
    public static final int KEYWORD_33=22;
    public static final int KEYWORD_32=35;
    public static final int KEYWORD_31=34;
    public static final int KEYWORD_30=33;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:70:1: ruleModel returns [EObject current=null] : ( ( (lv_operands_0_0= ruleHoOperand ) ) ( (otherlv_1= KEYWORD_8 | otherlv_2= KEYWORD_3 ) ruleHoOperand )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_operands_0_0 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:73:28: ( ( ( (lv_operands_0_0= ruleHoOperand ) ) ( (otherlv_1= KEYWORD_8 | otherlv_2= KEYWORD_3 ) ruleHoOperand )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:74:1: ( ( (lv_operands_0_0= ruleHoOperand ) ) ( (otherlv_1= KEYWORD_8 | otherlv_2= KEYWORD_3 ) ruleHoOperand )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:74:1: ( ( (lv_operands_0_0= ruleHoOperand ) ) ( (otherlv_1= KEYWORD_8 | otherlv_2= KEYWORD_3 ) ruleHoOperand )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:74:2: ( (lv_operands_0_0= ruleHoOperand ) ) ( (otherlv_1= KEYWORD_8 | otherlv_2= KEYWORD_3 ) ruleHoOperand )*
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

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:92:2: ( (otherlv_1= KEYWORD_8 | otherlv_2= KEYWORD_3 ) ruleHoOperand )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==KEYWORD_3||LA2_0==KEYWORD_8) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:92:3: (otherlv_1= KEYWORD_8 | otherlv_2= KEYWORD_3 ) ruleHoOperand
            	    {
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:92:3: (otherlv_1= KEYWORD_8 | otherlv_2= KEYWORD_3 )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==KEYWORD_8) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==KEYWORD_3) ) {
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
            	            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:93:2: otherlv_1= KEYWORD_8
            	            {
            	            otherlv_1=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleModel138); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_1, grammarAccess.getModelAccess().getCommaKeyword_1_0_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:99:2: otherlv_2= KEYWORD_3
            	            {
            	            otherlv_2=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleModel156); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:128:1: ruleAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_3 this_HoOperand_1= ruleHoOperand ) ;
    public final AntlrDatatypeRuleToken ruleAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_HoOperand_1 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:132:6: ( (kw= KEYWORD_3 this_HoOperand_1= ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:133:1: (kw= KEYWORD_3 this_HoOperand_1= ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:133:1: (kw= KEYWORD_3 this_HoOperand_1= ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:134:2: kw= KEYWORD_3 this_HoOperand_1= ruleHoOperand
            {
            kw=(Token)match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_ruleAnd258); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:167:1: ruleOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= KEYWORD_13 | kw= KEYWORD_20 ) this_HoOperand_2= ruleHoOperand ) ;
    public final AntlrDatatypeRuleToken ruleOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_HoOperand_2 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:171:6: ( ( (kw= KEYWORD_13 | kw= KEYWORD_20 ) this_HoOperand_2= ruleHoOperand ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:172:1: ( (kw= KEYWORD_13 | kw= KEYWORD_20 ) this_HoOperand_2= ruleHoOperand )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:172:1: ( (kw= KEYWORD_13 | kw= KEYWORD_20 ) this_HoOperand_2= ruleHoOperand )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:172:2: (kw= KEYWORD_13 | kw= KEYWORD_20 ) this_HoOperand_2= ruleHoOperand
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:172:2: (kw= KEYWORD_13 | kw= KEYWORD_20 )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KEYWORD_13) ) {
                alt3=1;
            }
            else if ( (LA3_0==KEYWORD_20) ) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:173:2: kw= KEYWORD_13
                    {
                    kw=(Token)match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_ruleOr375); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOrAccess().getSemicolonKeyword_0_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:180:2: kw= KEYWORD_20
                    {
                    kw=(Token)match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_ruleOr394); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:213:1: ruleHoOperand returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WSP_0= RULE_WSP )* (this_HigherOrderCall_1= ruleHigherOrderCall | this_CallOperator_2= ruleCallOperator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= KEYWORD_4 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_5 ) )? (this_WSP_10= RULE_WSP )* ) ;
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:217:6: ( ( (this_WSP_0= RULE_WSP )* (this_HigherOrderCall_1= ruleHigherOrderCall | this_CallOperator_2= ruleCallOperator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= KEYWORD_4 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_5 ) )? (this_WSP_10= RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:218:1: ( (this_WSP_0= RULE_WSP )* (this_HigherOrderCall_1= ruleHigherOrderCall | this_CallOperator_2= ruleCallOperator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= KEYWORD_4 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_5 ) )? (this_WSP_10= RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:218:1: ( (this_WSP_0= RULE_WSP )* (this_HigherOrderCall_1= ruleHigherOrderCall | this_CallOperator_2= ruleCallOperator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= KEYWORD_4 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_5 ) )? (this_WSP_10= RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:218:2: (this_WSP_0= RULE_WSP )* (this_HigherOrderCall_1= ruleHigherOrderCall | this_CallOperator_2= ruleCallOperator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= KEYWORD_4 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_5 ) )? (this_WSP_10= RULE_WSP )*
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

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:225:3: (this_HigherOrderCall_1= ruleHigherOrderCall | this_CallOperator_2= ruleCallOperator | this_Predicate_3= rulePredicate | this_Comparison_4= ruleComparison | (kw= KEYWORD_4 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_5 ) )?
            int alt6=6;
            switch ( input.LA(1) ) {
                case KEYWORD_33:
                case KEYWORD_34:
                case KEYWORD_32:
                    {
                    alt6=1;
                    }
                    break;
                case KEYWORD_50:
                case KEYWORD_42:
                case KEYWORD_35:
                case KEYWORD_25:
                case KEYWORD_26:
                case KEYWORD_27:
                case KEYWORD_28:
                case KEYWORD_29:
                case KEYWORD_30:
                case KEYWORD_31:
                    {
                    alt6=2;
                    }
                    break;
                case KEYWORD_53:
                case KEYWORD_52:
                case KEYWORD_51:
                case KEYWORD_48:
                case KEYWORD_44:
                    {
                    alt6=3;
                    }
                    break;
                case KEYWORD_1:
                case KEYWORD_2:
                case KEYWORD_6:
                case KEYWORD_7:
                case KEYWORD_9:
                case KEYWORD_10:
                case KEYWORD_11:
                case KEYWORD_12:
                case KEYWORD_17:
                case KEYWORD_18:
                case KEYWORD_19:
                case KEYWORD_21:
                case RULE_DIGIT:
                case RULE_ALPHA:
                    {
                    alt6=4;
                    }
                    break;
                case KEYWORD_4:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:273:6: (kw= KEYWORD_4 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_5 )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:273:6: (kw= KEYWORD_4 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_5 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:274:2: kw= KEYWORD_4 this_HoOperand_6= ruleHoOperand (this_And_7= ruleAnd | this_Or_8= ruleOr ) kw= KEYWORD_5
                    {
                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleHoOperand668); if (state.failed) return current;
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

                    if ( (LA5_0==KEYWORD_3) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==KEYWORD_13||LA5_0==KEYWORD_20) ) {
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

                    kw=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleHoOperand770); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:334:1: entryRuleHigherOrderCall returns [String current=null] : iv_ruleHigherOrderCall= ruleHigherOrderCall EOF ;
    public final String entryRuleHigherOrderCall() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHigherOrderCall = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:335:1: (iv_ruleHigherOrderCall= ruleHigherOrderCall EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:336:2: iv_ruleHigherOrderCall= ruleHigherOrderCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHigherOrderCallRule()); 
            }
            pushFollow(FOLLOW_ruleHigherOrderCall_in_entryRuleHigherOrderCall836);
            iv_ruleHigherOrderCall=ruleHigherOrderCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHigherOrderCall.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHigherOrderCall847); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:343:1: ruleHigherOrderCall returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_LogicalOpAliases_0= ruleLogicalOpAliases (this_WSP_1= RULE_WSP )* kw= KEYWORD_4 (this_HoOperand_3= ruleHoOperand (kw= KEYWORD_8 this_HoOperand_5= ruleHoOperand )* ) kw= KEYWORD_5 ) ;
    public final AntlrDatatypeRuleToken ruleHigherOrderCall() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_LogicalOpAliases_0 = null;

        AntlrDatatypeRuleToken this_HoOperand_3 = null;

        AntlrDatatypeRuleToken this_HoOperand_5 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:347:6: ( (this_LogicalOpAliases_0= ruleLogicalOpAliases (this_WSP_1= RULE_WSP )* kw= KEYWORD_4 (this_HoOperand_3= ruleHoOperand (kw= KEYWORD_8 this_HoOperand_5= ruleHoOperand )* ) kw= KEYWORD_5 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:348:1: (this_LogicalOpAliases_0= ruleLogicalOpAliases (this_WSP_1= RULE_WSP )* kw= KEYWORD_4 (this_HoOperand_3= ruleHoOperand (kw= KEYWORD_8 this_HoOperand_5= ruleHoOperand )* ) kw= KEYWORD_5 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:348:1: (this_LogicalOpAliases_0= ruleLogicalOpAliases (this_WSP_1= RULE_WSP )* kw= KEYWORD_4 (this_HoOperand_3= ruleHoOperand (kw= KEYWORD_8 this_HoOperand_5= ruleHoOperand )* ) kw= KEYWORD_5 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:349:5: this_LogicalOpAliases_0= ruleLogicalOpAliases (this_WSP_1= RULE_WSP )* kw= KEYWORD_4 (this_HoOperand_3= ruleHoOperand (kw= KEYWORD_8 this_HoOperand_5= ruleHoOperand )* ) kw= KEYWORD_5
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getHigherOrderCallAccess().getLogicalOpAliasesParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLogicalOpAliases_in_ruleHigherOrderCall894);
            this_LogicalOpAliases_0=ruleLogicalOpAliases();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_LogicalOpAliases_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:359:1: (this_WSP_1= RULE_WSP )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_WSP) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:359:6: this_WSP_1= RULE_WSP
            	    {
            	    this_WSP_1=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleHigherOrderCall915); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_1, grammarAccess.getHigherOrderCallAccess().getWSPTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleHigherOrderCall935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getHigherOrderCallAccess().getLeftParenthesisKeyword_2()); 
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:372:1: (this_HoOperand_3= ruleHoOperand (kw= KEYWORD_8 this_HoOperand_5= ruleHoOperand )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:373:5: this_HoOperand_3= ruleHoOperand (kw= KEYWORD_8 this_HoOperand_5= ruleHoOperand )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getHigherOrderCallAccess().getHoOperandParserRuleCall_3_0()); 
                  
            }
            pushFollow(FOLLOW_ruleHoOperand_in_ruleHigherOrderCall958);
            this_HoOperand_3=ruleHoOperand();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_HoOperand_3);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:383:1: (kw= KEYWORD_8 this_HoOperand_5= ruleHoOperand )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==KEYWORD_8) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:384:2: kw= KEYWORD_8 this_HoOperand_5= ruleHoOperand
            	    {
            	    kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleHigherOrderCall977); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getHigherOrderCallAccess().getCommaKeyword_3_1_0()); 
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getHigherOrderCallAccess().getHoOperandParserRuleCall_3_1_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleHoOperand_in_ruleHigherOrderCall999);
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
            	    break loop9;
                }
            } while (true);


            }

            kw=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleHigherOrderCall1020); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:414:1: entryRuleBinaryOpAliasesWithEqualsSign returns [String current=null] : iv_ruleBinaryOpAliasesWithEqualsSign= ruleBinaryOpAliasesWithEqualsSign EOF ;
    public final String entryRuleBinaryOpAliasesWithEqualsSign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOpAliasesWithEqualsSign = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:415:1: (iv_ruleBinaryOpAliasesWithEqualsSign= ruleBinaryOpAliasesWithEqualsSign EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:416:2: iv_ruleBinaryOpAliasesWithEqualsSign= ruleBinaryOpAliasesWithEqualsSign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOpAliasesWithEqualsSignRule()); 
            }
            pushFollow(FOLLOW_ruleBinaryOpAliasesWithEqualsSign_in_entryRuleBinaryOpAliasesWithEqualsSign1060);
            iv_ruleBinaryOpAliasesWithEqualsSign=ruleBinaryOpAliasesWithEqualsSign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOpAliasesWithEqualsSign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOpAliasesWithEqualsSign1071); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:423:1: ruleBinaryOpAliasesWithEqualsSign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_41 | kw= KEYWORD_36 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_38 | kw= KEYWORD_37 | kw= KEYWORD_49 ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOpAliasesWithEqualsSign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:427:6: ( (kw= KEYWORD_41 | kw= KEYWORD_36 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_38 | kw= KEYWORD_37 | kw= KEYWORD_49 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:428:1: (kw= KEYWORD_41 | kw= KEYWORD_36 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_38 | kw= KEYWORD_37 | kw= KEYWORD_49 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:428:1: (kw= KEYWORD_41 | kw= KEYWORD_36 | kw= KEYWORD_40 | kw= KEYWORD_39 | kw= KEYWORD_38 | kw= KEYWORD_37 | kw= KEYWORD_49 )
            int alt10=7;
            switch ( input.LA(1) ) {
            case KEYWORD_41:
                {
                alt10=1;
                }
                break;
            case KEYWORD_36:
                {
                alt10=2;
                }
                break;
            case KEYWORD_40:
                {
                alt10=3;
                }
                break;
            case KEYWORD_39:
                {
                alt10=4;
                }
                break;
            case KEYWORD_38:
                {
                alt10=5;
                }
                break;
            case KEYWORD_37:
                {
                alt10=6;
                }
                break;
            case KEYWORD_49:
                {
                alt10=7;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:429:2: kw= KEYWORD_41
                    {
                    kw=(Token)match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_ruleBinaryOpAliasesWithEqualsSign1109); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getNeKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:436:2: kw= KEYWORD_36
                    {
                    kw=(Token)match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_ruleBinaryOpAliasesWithEqualsSign1128); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getEqKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:443:2: kw= KEYWORD_40
                    {
                    kw=(Token)match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_ruleBinaryOpAliasesWithEqualsSign1147); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getLtKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:450:2: kw= KEYWORD_39
                    {
                    kw=(Token)match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_ruleBinaryOpAliasesWithEqualsSign1166); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getLeKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:457:2: kw= KEYWORD_38
                    {
                    kw=(Token)match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_ruleBinaryOpAliasesWithEqualsSign1185); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getGtKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:464:2: kw= KEYWORD_37
                    {
                    kw=(Token)match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_ruleBinaryOpAliasesWithEqualsSign1204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesWithEqualsSignAccess().getGeKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:471:2: kw= KEYWORD_49
                    {
                    kw=(Token)match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_ruleBinaryOpAliasesWithEqualsSign1223); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:484:1: entryRuleBinaryOpAliases returns [String current=null] : iv_ruleBinaryOpAliases= ruleBinaryOpAliases EOF ;
    public final String entryRuleBinaryOpAliases() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinaryOpAliases = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:485:1: (iv_ruleBinaryOpAliases= ruleBinaryOpAliases EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:486:2: iv_ruleBinaryOpAliases= ruleBinaryOpAliases EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBinaryOpAliasesRule()); 
            }
            pushFollow(FOLLOW_ruleBinaryOpAliases_in_entryRuleBinaryOpAliases1263);
            iv_ruleBinaryOpAliases=ruleBinaryOpAliases();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBinaryOpAliases.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryOpAliases1274); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:493:1: ruleBinaryOpAliases returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_31 | kw= KEYWORD_25 | kw= KEYWORD_30 | kw= KEYWORD_29 | kw= KEYWORD_27 | kw= KEYWORD_26 | kw= KEYWORD_42 ) ;
    public final AntlrDatatypeRuleToken ruleBinaryOpAliases() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:497:6: ( (kw= KEYWORD_31 | kw= KEYWORD_25 | kw= KEYWORD_30 | kw= KEYWORD_29 | kw= KEYWORD_27 | kw= KEYWORD_26 | kw= KEYWORD_42 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:498:1: (kw= KEYWORD_31 | kw= KEYWORD_25 | kw= KEYWORD_30 | kw= KEYWORD_29 | kw= KEYWORD_27 | kw= KEYWORD_26 | kw= KEYWORD_42 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:498:1: (kw= KEYWORD_31 | kw= KEYWORD_25 | kw= KEYWORD_30 | kw= KEYWORD_29 | kw= KEYWORD_27 | kw= KEYWORD_26 | kw= KEYWORD_42 )
            int alt11=7;
            switch ( input.LA(1) ) {
            case KEYWORD_31:
                {
                alt11=1;
                }
                break;
            case KEYWORD_25:
                {
                alt11=2;
                }
                break;
            case KEYWORD_30:
                {
                alt11=3;
                }
                break;
            case KEYWORD_29:
                {
                alt11=4;
                }
                break;
            case KEYWORD_27:
                {
                alt11=5;
                }
                break;
            case KEYWORD_26:
                {
                alt11=6;
                }
                break;
            case KEYWORD_42:
                {
                alt11=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:499:2: kw= KEYWORD_31
                    {
                    kw=(Token)match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_ruleBinaryOpAliases1312); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesAccess().getNeKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:506:2: kw= KEYWORD_25
                    {
                    kw=(Token)match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_ruleBinaryOpAliases1331); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesAccess().getEqKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:513:2: kw= KEYWORD_30
                    {
                    kw=(Token)match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_ruleBinaryOpAliases1350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesAccess().getLtKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:520:2: kw= KEYWORD_29
                    {
                    kw=(Token)match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_ruleBinaryOpAliases1369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesAccess().getLeKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:527:2: kw= KEYWORD_27
                    {
                    kw=(Token)match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_ruleBinaryOpAliases1388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesAccess().getGtKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:534:2: kw= KEYWORD_26
                    {
                    kw=(Token)match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_ruleBinaryOpAliases1407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getBinaryOpAliasesAccess().getGeKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:541:2: kw= KEYWORD_42
                    {
                    kw=(Token)match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_ruleBinaryOpAliases1426); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:554:1: entryRuleCompOps returns [String current=null] : iv_ruleCompOps= ruleCompOps EOF ;
    public final String entryRuleCompOps() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompOps = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:555:1: (iv_ruleCompOps= ruleCompOps EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:556:2: iv_ruleCompOps= ruleCompOps EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompOpsRule()); 
            }
            pushFollow(FOLLOW_ruleCompOps_in_entryRuleCompOps1466);
            iv_ruleCompOps=ruleCompOps();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompOps.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompOps1477); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:563:1: ruleCompOps returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_22 | kw= KEYWORD_15 | kw= KEYWORD_14 | kw= KEYWORD_23 | kw= KEYWORD_16 | kw= KEYWORD_24 ) ;
    public final AntlrDatatypeRuleToken ruleCompOps() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:567:6: ( (kw= KEYWORD_22 | kw= KEYWORD_15 | kw= KEYWORD_14 | kw= KEYWORD_23 | kw= KEYWORD_16 | kw= KEYWORD_24 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:568:1: (kw= KEYWORD_22 | kw= KEYWORD_15 | kw= KEYWORD_14 | kw= KEYWORD_23 | kw= KEYWORD_16 | kw= KEYWORD_24 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:568:1: (kw= KEYWORD_22 | kw= KEYWORD_15 | kw= KEYWORD_14 | kw= KEYWORD_23 | kw= KEYWORD_16 | kw= KEYWORD_24 )
            int alt12=6;
            switch ( input.LA(1) ) {
            case KEYWORD_22:
                {
                alt12=1;
                }
                break;
            case KEYWORD_15:
                {
                alt12=2;
                }
                break;
            case KEYWORD_14:
                {
                alt12=3;
                }
                break;
            case KEYWORD_23:
                {
                alt12=4;
                }
                break;
            case KEYWORD_16:
                {
                alt12=5;
                }
                break;
            case KEYWORD_24:
                {
                alt12=6;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:569:2: kw= KEYWORD_22
                    {
                    kw=(Token)match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_ruleCompOps1515); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompOpsAccess().getExclamationMarkEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:576:2: kw= KEYWORD_15
                    {
                    kw=(Token)match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_ruleCompOps1534); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompOpsAccess().getEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:583:2: kw= KEYWORD_14
                    {
                    kw=(Token)match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_ruleCompOps1553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompOpsAccess().getLessThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:590:2: kw= KEYWORD_23
                    {
                    kw=(Token)match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_ruleCompOps1572); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompOpsAccess().getLessThanSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:597:2: kw= KEYWORD_16
                    {
                    kw=(Token)match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_ruleCompOps1591); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getCompOpsAccess().getGreaterThanSignKeyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:604:2: kw= KEYWORD_24
                    {
                    kw=(Token)match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_ruleCompOps1610); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:617:1: entryRuleComparison returns [String current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final String entryRuleComparison() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparison = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:618:1: (iv_ruleComparison= ruleComparison EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:619:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1650);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1661); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:626:1: ruleComparison returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* (this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign | this_CompOps_3= ruleCompOps ) this_PrimaryExpr_4= rulePrimaryExpr ) ;
    public final AntlrDatatypeRuleToken ruleComparison() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_1=null;
        AntlrDatatypeRuleToken this_Strval_0 = null;

        AntlrDatatypeRuleToken this_BinaryOpAliasesWithEqualsSign_2 = null;

        AntlrDatatypeRuleToken this_CompOps_3 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr_4 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:630:6: ( (this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* (this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign | this_CompOps_3= ruleCompOps ) this_PrimaryExpr_4= rulePrimaryExpr ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:631:1: (this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* (this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign | this_CompOps_3= ruleCompOps ) this_PrimaryExpr_4= rulePrimaryExpr )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:631:1: (this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* (this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign | this_CompOps_3= ruleCompOps ) this_PrimaryExpr_4= rulePrimaryExpr )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:632:5: this_Strval_0= ruleStrval (this_WSP_1= RULE_WSP )* (this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign | this_CompOps_3= ruleCompOps ) this_PrimaryExpr_4= rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getStrvalParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleStrval_in_ruleComparison1708);
            this_Strval_0=ruleStrval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Strval_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:642:1: (this_WSP_1= RULE_WSP )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_WSP) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:642:6: this_WSP_1= RULE_WSP
            	    {
            	    this_WSP_1=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleComparison1729); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_1, grammarAccess.getComparisonAccess().getWSPTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:649:3: (this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign | this_CompOps_3= ruleCompOps )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KEYWORD_49||(LA14_0>=KEYWORD_36 && LA14_0<=KEYWORD_41)) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=KEYWORD_22 && LA14_0<=KEYWORD_24)||(LA14_0>=KEYWORD_14 && LA14_0<=KEYWORD_16)) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:650:5: this_BinaryOpAliasesWithEqualsSign_2= ruleBinaryOpAliasesWithEqualsSign
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparisonAccess().getBinaryOpAliasesWithEqualsSignParserRuleCall_2_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinaryOpAliasesWithEqualsSign_in_ruleComparison1759);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:662:5: this_CompOps_3= ruleCompOps
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparisonAccess().getCompOpsParserRuleCall_2_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompOps_in_ruleComparison1792);
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
            pushFollow(FOLLOW_rulePrimaryExpr_in_ruleComparison1820);
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:691:1: entryRuleCallOperator returns [String current=null] : iv_ruleCallOperator= ruleCallOperator EOF ;
    public final String entryRuleCallOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCallOperator = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:692:1: (iv_ruleCallOperator= ruleCallOperator EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:693:2: iv_ruleCallOperator= ruleCallOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCallOperator_in_entryRuleCallOperator1865);
            iv_ruleCallOperator=ruleCallOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCallOperator.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallOperator1876); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:700:1: ruleCallOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_BinaryOpAliases_0= ruleBinaryOpAliases | this_FunctionsTbl_1= ruleFunctionsTbl ) (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_6= rulePrimaryExpr )* )? kw= KEYWORD_5 ) ;
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:704:6: ( ( (this_BinaryOpAliases_0= ruleBinaryOpAliases | this_FunctionsTbl_1= ruleFunctionsTbl ) (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_6= rulePrimaryExpr )* )? kw= KEYWORD_5 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:705:1: ( (this_BinaryOpAliases_0= ruleBinaryOpAliases | this_FunctionsTbl_1= ruleFunctionsTbl ) (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_6= rulePrimaryExpr )* )? kw= KEYWORD_5 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:705:1: ( (this_BinaryOpAliases_0= ruleBinaryOpAliases | this_FunctionsTbl_1= ruleFunctionsTbl ) (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_6= rulePrimaryExpr )* )? kw= KEYWORD_5 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:705:2: (this_BinaryOpAliases_0= ruleBinaryOpAliases | this_FunctionsTbl_1= ruleFunctionsTbl ) (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_6= rulePrimaryExpr )* )? kw= KEYWORD_5
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:705:2: (this_BinaryOpAliases_0= ruleBinaryOpAliases | this_FunctionsTbl_1= ruleFunctionsTbl )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KEYWORD_42||(LA15_0>=KEYWORD_25 && LA15_0<=KEYWORD_27)||(LA15_0>=KEYWORD_29 && LA15_0<=KEYWORD_31)) ) {
                alt15=1;
            }
            else if ( (LA15_0==KEYWORD_50||LA15_0==KEYWORD_35||LA15_0==KEYWORD_28) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:706:5: this_BinaryOpAliases_0= ruleBinaryOpAliases
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCallOperatorAccess().getBinaryOpAliasesParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBinaryOpAliases_in_ruleCallOperator1924);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:718:5: this_FunctionsTbl_1= ruleFunctionsTbl
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCallOperatorAccess().getFunctionsTblParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleFunctionsTbl_in_ruleCallOperator1957);
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

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:728:2: (this_WSP_2= RULE_WSP )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_WSP) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:728:7: this_WSP_2= RULE_WSP
            	    {
            	    this_WSP_2=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleCallOperator1979); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_2, grammarAccess.getCallOperatorAccess().getWSPTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleCallOperator1999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCallOperatorAccess().getLeftParenthesisKeyword_2()); 
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:741:1: (this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_6= rulePrimaryExpr )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=KEYWORD_46 && LA18_0<=KEYWORD_47)||LA18_0==KEYWORD_43||LA18_0==KEYWORD_45||(LA18_0>=KEYWORD_1 && LA18_0<=KEYWORD_2)||LA18_0==KEYWORD_4||(LA18_0>=KEYWORD_6 && LA18_0<=KEYWORD_7)||(LA18_0>=KEYWORD_9 && LA18_0<=KEYWORD_12)||(LA18_0>=KEYWORD_17 && LA18_0<=KEYWORD_19)||(LA18_0>=KEYWORD_21 && LA18_0<=RULE_DIGIT)||(LA18_0>=RULE_ALPHA && LA18_0<=RULE_WSP)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:742:5: this_PrimaryExpr_4= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_6= rulePrimaryExpr )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCallOperatorAccess().getPrimaryExprParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpr_in_ruleCallOperator2022);
                    this_PrimaryExpr_4=rulePrimaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PrimaryExpr_4);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:752:1: (kw= KEYWORD_8 this_PrimaryExpr_6= rulePrimaryExpr )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==KEYWORD_8) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:753:2: kw= KEYWORD_8 this_PrimaryExpr_6= rulePrimaryExpr
                    	    {
                    	    kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleCallOperator2041); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getCallOperatorAccess().getCommaKeyword_3_1_0()); 
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getCallOperatorAccess().getPrimaryExprParserRuleCall_3_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_rulePrimaryExpr_in_ruleCallOperator2063);
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
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleCallOperator2085); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:783:1: entryRulePredicate returns [String current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final String entryRulePredicate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePredicate = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:784:1: (iv_rulePredicate= rulePredicate EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:785:2: iv_rulePredicate= rulePredicate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredicateRule()); 
            }
            pushFollow(FOLLOW_rulePredicate_in_entryRulePredicate2125);
            iv_rulePredicate=rulePredicate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredicate.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicate2136); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:792:1: rulePredicate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_PredTbl_0= rulePredTbl (this_WSP_1= RULE_WSP )* kw= KEYWORD_4 (this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_5= rulePrimaryExpr )* )? kw= KEYWORD_5 ) ;
    public final AntlrDatatypeRuleToken rulePredicate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WSP_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_PredTbl_0 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr_3 = null;

        AntlrDatatypeRuleToken this_PrimaryExpr_5 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:796:6: ( (this_PredTbl_0= rulePredTbl (this_WSP_1= RULE_WSP )* kw= KEYWORD_4 (this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_5= rulePrimaryExpr )* )? kw= KEYWORD_5 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:797:1: (this_PredTbl_0= rulePredTbl (this_WSP_1= RULE_WSP )* kw= KEYWORD_4 (this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_5= rulePrimaryExpr )* )? kw= KEYWORD_5 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:797:1: (this_PredTbl_0= rulePredTbl (this_WSP_1= RULE_WSP )* kw= KEYWORD_4 (this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_5= rulePrimaryExpr )* )? kw= KEYWORD_5 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:798:5: this_PredTbl_0= rulePredTbl (this_WSP_1= RULE_WSP )* kw= KEYWORD_4 (this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_5= rulePrimaryExpr )* )? kw= KEYWORD_5
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPredicateAccess().getPredTblParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePredTbl_in_rulePredicate2183);
            this_PredTbl_0=rulePredTbl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_PredTbl_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:808:1: (this_WSP_1= RULE_WSP )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WSP) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:808:6: this_WSP_1= RULE_WSP
            	    {
            	    this_WSP_1=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePredicate2204); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_1, grammarAccess.getPredicateAccess().getWSPTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rulePredicate2224); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPredicateAccess().getLeftParenthesisKeyword_2()); 
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:821:1: (this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_5= rulePrimaryExpr )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=KEYWORD_46 && LA21_0<=KEYWORD_47)||LA21_0==KEYWORD_43||LA21_0==KEYWORD_45||(LA21_0>=KEYWORD_1 && LA21_0<=KEYWORD_2)||LA21_0==KEYWORD_4||(LA21_0>=KEYWORD_6 && LA21_0<=KEYWORD_7)||(LA21_0>=KEYWORD_9 && LA21_0<=KEYWORD_12)||(LA21_0>=KEYWORD_17 && LA21_0<=KEYWORD_19)||(LA21_0>=KEYWORD_21 && LA21_0<=RULE_DIGIT)||(LA21_0>=RULE_ALPHA && LA21_0<=RULE_WSP)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:822:5: this_PrimaryExpr_3= rulePrimaryExpr (kw= KEYWORD_8 this_PrimaryExpr_5= rulePrimaryExpr )*
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPredicateAccess().getPrimaryExprParserRuleCall_3_0()); 
                          
                    }
                    pushFollow(FOLLOW_rulePrimaryExpr_in_rulePredicate2247);
                    this_PrimaryExpr_3=rulePrimaryExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PrimaryExpr_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:832:1: (kw= KEYWORD_8 this_PrimaryExpr_5= rulePrimaryExpr )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==KEYWORD_8) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:833:2: kw= KEYWORD_8 this_PrimaryExpr_5= rulePrimaryExpr
                    	    {
                    	    kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rulePredicate2266); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	              current.merge(kw);
                    	              newLeafNode(kw, grammarAccess.getPredicateAccess().getCommaKeyword_3_1_0()); 
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	              newCompositeNode(grammarAccess.getPredicateAccess().getPrimaryExprParserRuleCall_3_1_1()); 
                    	          
                    	    }
                    	    pushFollow(FOLLOW_rulePrimaryExpr_in_rulePredicate2288);
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
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rulePredicate2310); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:863:1: entryRulePredTbl returns [String current=null] : iv_rulePredTbl= rulePredTbl EOF ;
    public final String entryRulePredTbl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePredTbl = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:864:1: (iv_rulePredTbl= rulePredTbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:865:2: iv_rulePredTbl= rulePredTbl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPredTblRule()); 
            }
            pushFollow(FOLLOW_rulePredTbl_in_entryRulePredTbl2350);
            iv_rulePredTbl=rulePredTbl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePredTbl.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePredTbl2361); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:872:1: rulePredTbl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_51 | kw= KEYWORD_44 | kw= KEYWORD_48 | kw= KEYWORD_53 | kw= KEYWORD_52 ) ;
    public final AntlrDatatypeRuleToken rulePredTbl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:876:6: ( (kw= KEYWORD_51 | kw= KEYWORD_44 | kw= KEYWORD_48 | kw= KEYWORD_53 | kw= KEYWORD_52 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:877:1: (kw= KEYWORD_51 | kw= KEYWORD_44 | kw= KEYWORD_48 | kw= KEYWORD_53 | kw= KEYWORD_52 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:877:1: (kw= KEYWORD_51 | kw= KEYWORD_44 | kw= KEYWORD_48 | kw= KEYWORD_53 | kw= KEYWORD_52 )
            int alt22=5;
            switch ( input.LA(1) ) {
            case KEYWORD_51:
                {
                alt22=1;
                }
                break;
            case KEYWORD_44:
                {
                alt22=2;
                }
                break;
            case KEYWORD_48:
                {
                alt22=3;
                }
                break;
            case KEYWORD_53:
                {
                alt22=4;
                }
                break;
            case KEYWORD_52:
                {
                alt22=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:878:2: kw= KEYWORD_51
                    {
                    kw=(Token)match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_rulePredTbl2399); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPredTblAccess().getSelectKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:885:2: kw= KEYWORD_44
                    {
                    kw=(Token)match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_rulePredTbl2418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPredTblAccess().getSortKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:892:2: kw= KEYWORD_48
                    {
                    kw=(Token)match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rulePredTbl2437); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPredTblAccess().getLimitKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:899:2: kw= KEYWORD_53
                    {
                    kw=(Token)match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_rulePredTbl2456); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPredTblAccess().getImplementingKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:906:2: kw= KEYWORD_52
                    {
                    kw=(Token)match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_rulePredTbl2475); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:919:1: entryRulePrimaryExpr returns [String current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final String entryRulePrimaryExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimaryExpr = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:920:1: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:921:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr2515);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpr2526); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:928:1: rulePrimaryExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_WSP_0= RULE_WSP )* ( (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_WSP_4= RULE_WSP )* kw= KEYWORD_5 ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )* ) ;
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:932:6: ( ( (this_WSP_0= RULE_WSP )* ( (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_WSP_4= RULE_WSP )* kw= KEYWORD_5 ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )* ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:933:1: ( (this_WSP_0= RULE_WSP )* ( (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_WSP_4= RULE_WSP )* kw= KEYWORD_5 ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )* )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:933:1: ( (this_WSP_0= RULE_WSP )* ( (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_WSP_4= RULE_WSP )* kw= KEYWORD_5 ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )* )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:933:2: (this_WSP_0= RULE_WSP )* ( (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_WSP_4= RULE_WSP )* kw= KEYWORD_5 ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval ) ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )*
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:933:2: (this_WSP_0= RULE_WSP )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_WSP) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:933:7: this_WSP_0= RULE_WSP
            	    {
            	    this_WSP_0=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePrimaryExpr2567); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_0, grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_0()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:940:3: ( (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_WSP_4= RULE_WSP )* kw= KEYWORD_5 ) | this_Array_6= ruleArray | this_Strval_7= ruleStrval )
            int alt26=3;
            switch ( input.LA(1) ) {
            case KEYWORD_46:
            case KEYWORD_47:
            case KEYWORD_43:
            case KEYWORD_45:
                {
                alt26=1;
                }
                break;
            case KEYWORD_4:
                {
                alt26=2;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_2:
            case KEYWORD_6:
            case KEYWORD_7:
            case KEYWORD_9:
            case KEYWORD_10:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_17:
            case KEYWORD_18:
            case KEYWORD_19:
            case KEYWORD_21:
            case RULE_DIGIT:
            case RULE_ALPHA:
                {
                alt26=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:940:4: (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_WSP_4= RULE_WSP )* kw= KEYWORD_5 )
                    {
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:940:4: (this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_WSP_4= RULE_WSP )* kw= KEYWORD_5 )
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:941:5: this_ConstFuncTbl_1= ruleConstFuncTbl (this_WSP_2= RULE_WSP )* kw= KEYWORD_4 (this_WSP_4= RULE_WSP )* kw= KEYWORD_5
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExprAccess().getConstFuncTblParserRuleCall_1_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleConstFuncTbl_in_rulePrimaryExpr2598);
                    this_ConstFuncTbl_1=ruleConstFuncTbl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ConstFuncTbl_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:951:1: (this_WSP_2= RULE_WSP )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==RULE_WSP) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:951:6: this_WSP_2= RULE_WSP
                    	    {
                    	    this_WSP_2=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePrimaryExpr2619); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_WSP_2);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WSP_2, grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_1_0_1()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rulePrimaryExpr2639); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getLeftParenthesisKeyword_1_0_2()); 
                          
                    }
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:964:1: (this_WSP_4= RULE_WSP )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_WSP) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:964:6: this_WSP_4= RULE_WSP
                    	    {
                    	    this_WSP_4=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePrimaryExpr2655); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		current.merge(this_WSP_4);
                    	          
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	          newLeafNode(this_WSP_4, grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_1_0_3()); 
                    	          
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    kw=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rulePrimaryExpr2675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPrimaryExprAccess().getRightParenthesisKeyword_1_0_4()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:979:5: this_Array_6= ruleArray
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExprAccess().getArrayParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArray_in_rulePrimaryExpr2704);
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:991:5: this_Strval_7= ruleStrval
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExprAccess().getStrvalParserRuleCall_1_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStrval_in_rulePrimaryExpr2737);
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

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1001:2: ( ( RULE_WSP )=>this_WSP_8= RULE_WSP )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_WSP) ) {
                    int LA27_1 = input.LA(2);

                    if ( (synpred1_InternalRQLParser()) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1001:3: ( RULE_WSP )=>this_WSP_8= RULE_WSP
            	    {
            	    this_WSP_8=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_rulePrimaryExpr2763); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_8);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_8, grammarAccess.getPrimaryExprAccess().getWSPTerminalRuleCall_2()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1016:1: entryRuleFunctionsTbl returns [String current=null] : iv_ruleFunctionsTbl= ruleFunctionsTbl EOF ;
    public final String entryRuleFunctionsTbl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionsTbl = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1017:1: (iv_ruleFunctionsTbl= ruleFunctionsTbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1018:2: iv_ruleFunctionsTbl= ruleFunctionsTbl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFunctionsTblRule()); 
            }
            pushFollow(FOLLOW_ruleFunctionsTbl_in_entryRuleFunctionsTbl2810);
            iv_ruleFunctionsTbl=ruleFunctionsTbl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFunctionsTbl.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionsTbl2821); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1025:1: ruleFunctionsTbl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_50 | kw= KEYWORD_28 | kw= KEYWORD_35 ) ;
    public final AntlrDatatypeRuleToken ruleFunctionsTbl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1029:6: ( (kw= KEYWORD_50 | kw= KEYWORD_28 | kw= KEYWORD_35 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1030:1: (kw= KEYWORD_50 | kw= KEYWORD_28 | kw= KEYWORD_35 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1030:1: (kw= KEYWORD_50 | kw= KEYWORD_28 | kw= KEYWORD_35 )
            int alt28=3;
            switch ( input.LA(1) ) {
            case KEYWORD_50:
                {
                alt28=1;
                }
                break;
            case KEYWORD_28:
                {
                alt28=2;
                }
                break;
            case KEYWORD_35:
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1031:2: kw= KEYWORD_50
                    {
                    kw=(Token)match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_ruleFunctionsTbl2859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionsTblAccess().getIsnullKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1038:2: kw= KEYWORD_28
                    {
                    kw=(Token)match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_ruleFunctionsTbl2878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getFunctionsTblAccess().getInKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1045:2: kw= KEYWORD_35
                    {
                    kw=(Token)match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_ruleFunctionsTbl2897); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1058:1: entryRuleConstFuncTbl returns [String current=null] : iv_ruleConstFuncTbl= ruleConstFuncTbl EOF ;
    public final String entryRuleConstFuncTbl() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstFuncTbl = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1059:1: (iv_ruleConstFuncTbl= ruleConstFuncTbl EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1060:2: iv_ruleConstFuncTbl= ruleConstFuncTbl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstFuncTblRule()); 
            }
            pushFollow(FOLLOW_ruleConstFuncTbl_in_entryRuleConstFuncTbl2937);
            iv_ruleConstFuncTbl=ruleConstFuncTbl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstFuncTbl.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstFuncTbl2948); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1067:1: ruleConstFuncTbl returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_45 | kw= KEYWORD_47 | kw= KEYWORD_46 | kw= KEYWORD_43 ) ;
    public final AntlrDatatypeRuleToken ruleConstFuncTbl() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1071:6: ( (kw= KEYWORD_45 | kw= KEYWORD_47 | kw= KEYWORD_46 | kw= KEYWORD_43 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1072:1: (kw= KEYWORD_45 | kw= KEYWORD_47 | kw= KEYWORD_46 | kw= KEYWORD_43 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1072:1: (kw= KEYWORD_45 | kw= KEYWORD_47 | kw= KEYWORD_46 | kw= KEYWORD_43 )
            int alt29=4;
            switch ( input.LA(1) ) {
            case KEYWORD_45:
                {
                alt29=1;
                }
                break;
            case KEYWORD_47:
                {
                alt29=2;
                }
                break;
            case KEYWORD_46:
                {
                alt29=3;
                }
                break;
            case KEYWORD_43:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1073:2: kw= KEYWORD_45
                    {
                    kw=(Token)match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_ruleConstFuncTbl2986); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConstFuncTblAccess().getTrueKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1080:2: kw= KEYWORD_47
                    {
                    kw=(Token)match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_ruleConstFuncTbl3005); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConstFuncTblAccess().getFalseKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1087:2: kw= KEYWORD_46
                    {
                    kw=(Token)match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_ruleConstFuncTbl3024); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getConstFuncTblAccess().getEmptyKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1094:2: kw= KEYWORD_43
                    {
                    kw=(Token)match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_ruleConstFuncTbl3043); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1107:1: entryRuleArray returns [String current=null] : iv_ruleArray= ruleArray EOF ;
    public final String entryRuleArray() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArray = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1108:1: (iv_ruleArray= ruleArray EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1109:2: iv_ruleArray= ruleArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArrayRule()); 
            }
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray3083);
            iv_ruleArray=ruleArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArray.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray3094); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1116:1: ruleArray returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_4 (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= KEYWORD_8 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= KEYWORD_5 ) ;
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1120:6: ( (kw= KEYWORD_4 (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= KEYWORD_8 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= KEYWORD_5 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1121:1: (kw= KEYWORD_4 (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= KEYWORD_8 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= KEYWORD_5 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1121:1: (kw= KEYWORD_4 (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= KEYWORD_8 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= KEYWORD_5 )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1122:2: kw= KEYWORD_4 (this_WSP_1= RULE_WSP )* this_Strval_2= ruleStrval (this_WSP_3= RULE_WSP )* (kw= KEYWORD_8 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )* kw= KEYWORD_5
            {
            kw=(Token)match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_ruleArray3132); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getArrayAccess().getLeftParenthesisKeyword_0()); 
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1127:1: (this_WSP_1= RULE_WSP )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_WSP) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1127:6: this_WSP_1= RULE_WSP
            	    {
            	    this_WSP_1=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleArray3148); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_1);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_1, grammarAccess.getArrayAccess().getWSPTerminalRuleCall_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArrayAccess().getStrvalParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleStrval_in_ruleArray3177);
            this_Strval_2=ruleStrval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_Strval_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1145:1: (this_WSP_3= RULE_WSP )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_WSP) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1145:6: this_WSP_3= RULE_WSP
            	    {
            	    this_WSP_3=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleArray3198); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_WSP_3);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_WSP_3, grammarAccess.getArrayAccess().getWSPTerminalRuleCall_3()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1152:3: (kw= KEYWORD_8 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )* )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==KEYWORD_8) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1153:2: kw= KEYWORD_8 (this_WSP_5= RULE_WSP )* this_Strval_6= ruleStrval (this_WSP_7= RULE_WSP )*
            	    {
            	    kw=(Token)match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_ruleArray3219); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getArrayAccess().getCommaKeyword_4_0()); 
            	          
            	    }
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1158:1: (this_WSP_5= RULE_WSP )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==RULE_WSP) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1158:6: this_WSP_5= RULE_WSP
            	    	    {
            	    	    this_WSP_5=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleArray3235); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		current.merge(this_WSP_5);
            	    	          
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WSP_5, grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_1()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getArrayAccess().getStrvalParserRuleCall_4_2()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleStrval_in_ruleArray3264);
            	    this_Strval_6=ruleStrval();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_Strval_6);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1176:1: (this_WSP_7= RULE_WSP )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==RULE_WSP) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1176:6: this_WSP_7= RULE_WSP
            	    	    {
            	    	    this_WSP_7=(Token)match(input,RULE_WSP,FOLLOW_RULE_WSP_in_ruleArray3285); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		current.merge(this_WSP_7);
            	    	          
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	          newLeafNode(this_WSP_7, grammarAccess.getArrayAccess().getWSPTerminalRuleCall_4_3()); 
            	    	          
            	    	    }

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            kw=(Token)match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_ruleArray3307); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1197:1: entryRuleNchar returns [String current=null] : iv_ruleNchar= ruleNchar EOF ;
    public final String entryRuleNchar() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNchar = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1198:1: (iv_ruleNchar= ruleNchar EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1199:2: iv_ruleNchar= ruleNchar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNcharRule()); 
            }
            pushFollow(FOLLOW_ruleNchar_in_entryRuleNchar3347);
            iv_ruleNchar=ruleNchar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNchar.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNchar3358); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1206:1: ruleNchar returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ALPHA_0= RULE_ALPHA | this_DIGIT_1= RULE_DIGIT | kw= KEYWORD_9 | kw= KEYWORD_10 | kw= KEYWORD_19 | kw= KEYWORD_21 | kw= KEYWORD_1 | kw= KEYWORD_12 | kw= KEYWORD_6 | kw= KEYWORD_7 | kw= KEYWORD_17 | kw= KEYWORD_11 | kw= KEYWORD_18 ) ;
    public final AntlrDatatypeRuleToken ruleNchar() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ALPHA_0=null;
        Token this_DIGIT_1=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1210:6: ( (this_ALPHA_0= RULE_ALPHA | this_DIGIT_1= RULE_DIGIT | kw= KEYWORD_9 | kw= KEYWORD_10 | kw= KEYWORD_19 | kw= KEYWORD_21 | kw= KEYWORD_1 | kw= KEYWORD_12 | kw= KEYWORD_6 | kw= KEYWORD_7 | kw= KEYWORD_17 | kw= KEYWORD_11 | kw= KEYWORD_18 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1211:1: (this_ALPHA_0= RULE_ALPHA | this_DIGIT_1= RULE_DIGIT | kw= KEYWORD_9 | kw= KEYWORD_10 | kw= KEYWORD_19 | kw= KEYWORD_21 | kw= KEYWORD_1 | kw= KEYWORD_12 | kw= KEYWORD_6 | kw= KEYWORD_7 | kw= KEYWORD_17 | kw= KEYWORD_11 | kw= KEYWORD_18 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1211:1: (this_ALPHA_0= RULE_ALPHA | this_DIGIT_1= RULE_DIGIT | kw= KEYWORD_9 | kw= KEYWORD_10 | kw= KEYWORD_19 | kw= KEYWORD_21 | kw= KEYWORD_1 | kw= KEYWORD_12 | kw= KEYWORD_6 | kw= KEYWORD_7 | kw= KEYWORD_17 | kw= KEYWORD_11 | kw= KEYWORD_18 )
            int alt35=13;
            switch ( input.LA(1) ) {
            case RULE_ALPHA:
                {
                alt35=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt35=2;
                }
                break;
            case KEYWORD_9:
                {
                alt35=3;
                }
                break;
            case KEYWORD_10:
                {
                alt35=4;
                }
                break;
            case KEYWORD_19:
                {
                alt35=5;
                }
                break;
            case KEYWORD_21:
                {
                alt35=6;
                }
                break;
            case KEYWORD_1:
                {
                alt35=7;
                }
                break;
            case KEYWORD_12:
                {
                alt35=8;
                }
                break;
            case KEYWORD_6:
                {
                alt35=9;
                }
                break;
            case KEYWORD_7:
                {
                alt35=10;
                }
                break;
            case KEYWORD_17:
                {
                alt35=11;
                }
                break;
            case KEYWORD_11:
                {
                alt35=12;
                }
                break;
            case KEYWORD_18:
                {
                alt35=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1211:6: this_ALPHA_0= RULE_ALPHA
                    {
                    this_ALPHA_0=(Token)match(input,RULE_ALPHA,FOLLOW_RULE_ALPHA_in_ruleNchar3398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ALPHA_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ALPHA_0, grammarAccess.getNcharAccess().getALPHATerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1219:10: this_DIGIT_1= RULE_DIGIT
                    {
                    this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_RULE_DIGIT_in_ruleNchar3424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_DIGIT_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_DIGIT_1, grammarAccess.getNcharAccess().getDIGITTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1228:2: kw= KEYWORD_9
                    {
                    kw=(Token)match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_ruleNchar3448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getHyphenMinusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1235:2: kw= KEYWORD_10
                    {
                    kw=(Token)match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_ruleNchar3467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getFullStopKeyword_3()); 
                          
                    }

                    }
                    break;
                case 5 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1242:2: kw= KEYWORD_19
                    {
                    kw=(Token)match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_ruleNchar3486); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().get_Keyword_4()); 
                          
                    }

                    }
                    break;
                case 6 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1249:2: kw= KEYWORD_21
                    {
                    kw=(Token)match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_ruleNchar3505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getTildeKeyword_5()); 
                          
                    }

                    }
                    break;
                case 7 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1256:2: kw= KEYWORD_1
                    {
                    kw=(Token)match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_ruleNchar3524); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getDollarSignKeyword_6()); 
                          
                    }

                    }
                    break;
                case 8 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1263:2: kw= KEYWORD_12
                    {
                    kw=(Token)match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_ruleNchar3543); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getColonKeyword_7()); 
                          
                    }

                    }
                    break;
                case 9 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1270:2: kw= KEYWORD_6
                    {
                    kw=(Token)match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_ruleNchar3562); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getAsteriskKeyword_8()); 
                          
                    }

                    }
                    break;
                case 10 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1277:2: kw= KEYWORD_7
                    {
                    kw=(Token)match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_ruleNchar3581); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getPlusSignKeyword_9()); 
                          
                    }

                    }
                    break;
                case 11 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1284:2: kw= KEYWORD_17
                    {
                    kw=(Token)match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_ruleNchar3600); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getQuestionMarkKeyword_10()); 
                          
                    }

                    }
                    break;
                case 12 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1291:2: kw= KEYWORD_11
                    {
                    kw=(Token)match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_ruleNchar3619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNcharAccess().getSolidusKeyword_11()); 
                          
                    }

                    }
                    break;
                case 13 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1298:2: kw= KEYWORD_18
                    {
                    kw=(Token)match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_ruleNchar3638); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1311:1: entryRulePct_encoded returns [String current=null] : iv_rulePct_encoded= rulePct_encoded EOF ;
    public final String entryRulePct_encoded() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePct_encoded = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1312:1: (iv_rulePct_encoded= rulePct_encoded EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1313:2: iv_rulePct_encoded= rulePct_encoded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPct_encodedRule()); 
            }
            pushFollow(FOLLOW_rulePct_encoded_in_entryRulePct_encoded3678);
            iv_rulePct_encoded=rulePct_encoded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePct_encoded.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePct_encoded3689); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1320:1: rulePct_encoded returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_2 this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT ) ;
    public final AntlrDatatypeRuleToken rulePct_encoded() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_XDIGIT_1=null;
        Token this_XDIGIT_2=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1324:6: ( (kw= KEYWORD_2 this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1325:1: (kw= KEYWORD_2 this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1325:1: (kw= KEYWORD_2 this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1326:2: kw= KEYWORD_2 this_XDIGIT_1= RULE_XDIGIT this_XDIGIT_2= RULE_XDIGIT
            {
            kw=(Token)match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rulePct_encoded3727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPct_encodedAccess().getPercentSignKeyword_0()); 
                  
            }
            this_XDIGIT_1=(Token)match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rulePct_encoded3742); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_XDIGIT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_XDIGIT_1, grammarAccess.getPct_encodedAccess().getXDIGITTerminalRuleCall_1()); 
                  
            }
            this_XDIGIT_2=(Token)match(input,RULE_XDIGIT,FOLLOW_RULE_XDIGIT_in_rulePct_encoded3762); if (state.failed) return current;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1353:1: entryRuleStrval returns [String current=null] : iv_ruleStrval= ruleStrval EOF ;
    public final String entryRuleStrval() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStrval = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1354:1: (iv_ruleStrval= ruleStrval EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1355:2: iv_ruleStrval= ruleStrval EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStrvalRule()); 
            }
            pushFollow(FOLLOW_ruleStrval_in_entryRuleStrval3807);
            iv_ruleStrval=ruleStrval();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStrval.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrval3818); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1362:1: ruleStrval returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Nchar_0= ruleNchar | this_Pct_encoded_1= rulePct_encoded )+ ;
    public final AntlrDatatypeRuleToken ruleStrval() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Nchar_0 = null;

        AntlrDatatypeRuleToken this_Pct_encoded_1 = null;


         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1366:6: ( (this_Nchar_0= ruleNchar | this_Pct_encoded_1= rulePct_encoded )+ )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1367:1: (this_Nchar_0= ruleNchar | this_Pct_encoded_1= rulePct_encoded )+
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1367:1: (this_Nchar_0= ruleNchar | this_Pct_encoded_1= rulePct_encoded )+
            int cnt36=0;
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==KEYWORD_1||(LA36_0>=KEYWORD_6 && LA36_0<=KEYWORD_7)||(LA36_0>=KEYWORD_9 && LA36_0<=KEYWORD_12)||(LA36_0>=KEYWORD_17 && LA36_0<=KEYWORD_19)||(LA36_0>=KEYWORD_21 && LA36_0<=RULE_DIGIT)||LA36_0==RULE_ALPHA) ) {
                    alt36=1;
                }
                else if ( (LA36_0==KEYWORD_2) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1368:5: this_Nchar_0= ruleNchar
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStrvalAccess().getNcharParserRuleCall_0()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleNchar_in_ruleStrval3865);
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
            	    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1380:5: this_Pct_encoded_1= rulePct_encoded
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getStrvalAccess().getPct_encodedParserRuleCall_1()); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulePct_encoded_in_ruleStrval3898);
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
            	    if ( cnt36 >= 1 ) break loop36;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1398:1: entryRuleLogicalOpAliases returns [String current=null] : iv_ruleLogicalOpAliases= ruleLogicalOpAliases EOF ;
    public final String entryRuleLogicalOpAliases() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalOpAliases = null;


        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1399:1: (iv_ruleLogicalOpAliases= ruleLogicalOpAliases EOF )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1400:2: iv_ruleLogicalOpAliases= ruleLogicalOpAliases EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOpAliasesRule()); 
            }
            pushFollow(FOLLOW_ruleLogicalOpAliases_in_entryRuleLogicalOpAliases3944);
            iv_ruleLogicalOpAliases=ruleLogicalOpAliases();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOpAliases.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOpAliases3955); if (state.failed) return current;

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
    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1407:1: ruleLogicalOpAliases returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= KEYWORD_32 | kw= KEYWORD_33 | kw= KEYWORD_34 ) ;
    public final AntlrDatatypeRuleToken ruleLogicalOpAliases() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1411:6: ( (kw= KEYWORD_32 | kw= KEYWORD_33 | kw= KEYWORD_34 ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1412:1: (kw= KEYWORD_32 | kw= KEYWORD_33 | kw= KEYWORD_34 )
            {
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1412:1: (kw= KEYWORD_32 | kw= KEYWORD_33 | kw= KEYWORD_34 )
            int alt37=3;
            switch ( input.LA(1) ) {
            case KEYWORD_32:
                {
                alt37=1;
                }
                break;
            case KEYWORD_33:
                {
                alt37=2;
                }
                break;
            case KEYWORD_34:
                {
                alt37=3;
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1413:2: kw= KEYWORD_32
                    {
                    kw=(Token)match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_ruleLogicalOpAliases3993); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogicalOpAliasesAccess().getOrKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1420:2: kw= KEYWORD_33
                    {
                    kw=(Token)match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_ruleLogicalOpAliases4012); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogicalOpAliasesAccess().getAndKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1427:2: kw= KEYWORD_34
                    {
                    kw=(Token)match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_ruleLogicalOpAliases4031); if (state.failed) return current;
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
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1001:3: ( RULE_WSP )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/parser/antlr/internal/InternalRQLParser.g:1001:4: RULE_WSP
        {
        match(input,RULE_WSP,FOLLOW_RULE_WSP_in_synpred1_InternalRQLParser2754); if (state.failed) return ;

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
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleModel123 = new BitSet(new long[]{0x0000084000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleModel138 = new BitSet(new long[]{0x1B70FEFFF1D409B0L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleModel156 = new BitSet(new long[]{0x1B70FEFFF1D409B0L});
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleModel172 = new BitSet(new long[]{0x0000084000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_ruleAnd258 = new BitSet(new long[]{0x1B70F6BFF1D409B0L});
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleAnd280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_ruleOr375 = new BitSet(new long[]{0x1B70F6BFF1D409B0L});
    public static final BitSet FOLLOW_KEYWORD_20_in_ruleOr394 = new BitSet(new long[]{0x1B70F6BFF1D409B0L});
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleOr417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoOperand_in_entryRuleHoOperand462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHoOperand473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleHoOperand514 = new BitSet(new long[]{0x1B70F6BFF1D409B2L});
    public static final BitSet FOLLOW_ruleHigherOrderCall_in_ruleHoOperand544 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_ruleHoOperand577 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_ruleHoOperand610 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleHoOperand643 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleHoOperand668 = new BitSet(new long[]{0x1BF1F6FFF1D409B0L});
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleHoOperand690 = new BitSet(new long[]{0x1BF1F6FFF1D409B0L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleHoOperand718 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ruleOr_in_ruleHoOperand751 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleHoOperand770 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleHoOperand789 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleHigherOrderCall_in_entryRuleHigherOrderCall836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHigherOrderCall847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOpAliases_in_ruleHigherOrderCall894 = new BitSet(new long[]{0x1000008000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleHigherOrderCall915 = new BitSet(new long[]{0x1000008000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleHigherOrderCall935 = new BitSet(new long[]{0x1B70FFBFF1D409B0L});
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleHigherOrderCall958 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleHigherOrderCall977 = new BitSet(new long[]{0x1B70FFBFF1D409B0L});
    public static final BitSet FOLLOW_ruleHoOperand_in_ruleHigherOrderCall999 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleHigherOrderCall1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOpAliasesWithEqualsSign_in_entryRuleBinaryOpAliasesWithEqualsSign1060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOpAliasesWithEqualsSign1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_ruleBinaryOpAliasesWithEqualsSign1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_ruleBinaryOpAliasesWithEqualsSign1128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_ruleBinaryOpAliasesWithEqualsSign1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_ruleBinaryOpAliasesWithEqualsSign1166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_ruleBinaryOpAliasesWithEqualsSign1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_ruleBinaryOpAliasesWithEqualsSign1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_ruleBinaryOpAliasesWithEqualsSign1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOpAliases_in_entryRuleBinaryOpAliases1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryOpAliases1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_ruleBinaryOpAliases1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_ruleBinaryOpAliases1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_ruleBinaryOpAliases1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_ruleBinaryOpAliases1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_ruleBinaryOpAliases1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_ruleBinaryOpAliases1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_ruleBinaryOpAliases1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompOps_in_entryRuleCompOps1466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompOps1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_ruleCompOps1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_ruleCompOps1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_ruleCompOps1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_ruleCompOps1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_ruleCompOps1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_ruleCompOps1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_ruleComparison1708 = new BitSet(new long[]{0x100E00000E03F040L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleComparison1729 = new BitSet(new long[]{0x100E00000E03F040L});
    public static final BitSet FOLLOW_ruleBinaryOpAliasesWithEqualsSign_in_ruleComparison1759 = new BitSet(new long[]{0x1B70F6B000280600L});
    public static final BitSet FOLLOW_ruleCompOps_in_ruleComparison1792 = new BitSet(new long[]{0x1B70F6B000280600L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleComparison1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallOperator_in_entryRuleCallOperator1865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallOperator1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryOpAliases_in_ruleCallOperator1924 = new BitSet(new long[]{0x1000008000000000L});
    public static final BitSet FOLLOW_ruleFunctionsTbl_in_ruleCallOperator1957 = new BitSet(new long[]{0x1000008000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleCallOperator1979 = new BitSet(new long[]{0x1000008000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleCallOperator1999 = new BitSet(new long[]{0x1B70F7B000280600L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleCallOperator2022 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleCallOperator2041 = new BitSet(new long[]{0x1B70F6B000280600L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_ruleCallOperator2063 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleCallOperator2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate2125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicate2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredTbl_in_rulePredicate2183 = new BitSet(new long[]{0x1000008000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePredicate2204 = new BitSet(new long[]{0x1000008000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rulePredicate2224 = new BitSet(new long[]{0x1B70F7B000280600L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rulePredicate2247 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rulePredicate2266 = new BitSet(new long[]{0x1B70F6B000280600L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_rulePredicate2288 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rulePredicate2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredTbl_in_entryRulePredTbl2350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredTbl2361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_rulePredTbl2399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_rulePredTbl2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rulePredTbl2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_rulePredTbl2456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_rulePredTbl2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpr_in_entryRulePrimaryExpr2515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpr2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePrimaryExpr2567 = new BitSet(new long[]{0x1B70F6B000280600L});
    public static final BitSet FOLLOW_ruleConstFuncTbl_in_rulePrimaryExpr2598 = new BitSet(new long[]{0x1000008000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePrimaryExpr2619 = new BitSet(new long[]{0x1000008000000000L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rulePrimaryExpr2639 = new BitSet(new long[]{0x1000010000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePrimaryExpr2655 = new BitSet(new long[]{0x1000010000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rulePrimaryExpr2675 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_rulePrimaryExpr2704 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_rulePrimaryExpr2737 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_rulePrimaryExpr2763 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionsTbl_in_entryRuleFunctionsTbl2810 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionsTbl2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_ruleFunctionsTbl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_ruleFunctionsTbl2878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_ruleFunctionsTbl2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstFuncTbl_in_entryRuleConstFuncTbl2937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstFuncTbl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_ruleConstFuncTbl2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_ruleConstFuncTbl3005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_ruleConstFuncTbl3024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_ruleConstFuncTbl3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray3083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_ruleArray3132 = new BitSet(new long[]{0x1B70F63000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleArray3148 = new BitSet(new long[]{0x1B70F63000000000L});
    public static final BitSet FOLLOW_ruleStrval_in_ruleArray3177 = new BitSet(new long[]{0x1000090000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleArray3198 = new BitSet(new long[]{0x1000090000000000L});
    public static final BitSet FOLLOW_KEYWORD_8_in_ruleArray3219 = new BitSet(new long[]{0x1B70F63000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleArray3235 = new BitSet(new long[]{0x1B70F63000000000L});
    public static final BitSet FOLLOW_ruleStrval_in_ruleArray3264 = new BitSet(new long[]{0x1000090000000000L});
    public static final BitSet FOLLOW_RULE_WSP_in_ruleArray3285 = new BitSet(new long[]{0x1000090000000000L});
    public static final BitSet FOLLOW_KEYWORD_5_in_ruleArray3307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNchar_in_entryRuleNchar3347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNchar3358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALPHA_in_ruleNchar3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DIGIT_in_ruleNchar3424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_ruleNchar3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_ruleNchar3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_ruleNchar3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_ruleNchar3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_ruleNchar3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_ruleNchar3543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_ruleNchar3562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_ruleNchar3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_ruleNchar3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_ruleNchar3619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_ruleNchar3638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePct_encoded_in_entryRulePct_encoded3678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePct_encoded3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rulePct_encoded3727 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rulePct_encoded3742 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RULE_XDIGIT_in_rulePct_encoded3762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrval_in_entryRuleStrval3807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrval3818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNchar_in_ruleStrval3865 = new BitSet(new long[]{0x0B70F63000000002L});
    public static final BitSet FOLLOW_rulePct_encoded_in_ruleStrval3898 = new BitSet(new long[]{0x0B70F63000000002L});
    public static final BitSet FOLLOW_ruleLogicalOpAliases_in_entryRuleLogicalOpAliases3944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOpAliases3955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_ruleLogicalOpAliases3993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_ruleLogicalOpAliases4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_ruleLogicalOpAliases4031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_WSP_in_synpred1_InternalRQLParser2754 = new BitSet(new long[]{0x0000000000000002L});

}