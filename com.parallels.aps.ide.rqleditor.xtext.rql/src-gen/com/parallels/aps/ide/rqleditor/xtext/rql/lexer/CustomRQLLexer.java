package com.parallels.aps.ide.rqleditor.xtext.rql.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class CustomRQLLexer extends Lexer {
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

    public CustomRQLLexer() {;} 
    public CustomRQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CustomRQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g"; }

    // $ANTLR start "KEYWORD_53"
    public final void mKEYWORD_53() throws RecognitionException {
        try {
            int _type = KEYWORD_53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:19:12: ( ( 'implementing(' )=> 'implementing' | ( 'i' )=> 'i' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='i') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='m') && (synpred1_CustomRQLLexer())) {
                    alt1=1;
                }
                else {
                    alt1=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:19:14: ( 'implementing(' )=> 'implementing'
                    {
                    match("implementing"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:19:51: ( 'i' )=> 'i'
                    {
                    match('i'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_53"

    // $ANTLR start "KEYWORD_52"
    public final void mKEYWORD_52() throws RecognitionException {
        try {
            int _type = KEYWORD_52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:21:12: ( ( 'composing(' )=> 'composing' | ( 'c' )=> 'c' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='c') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='o') && (synpred3_CustomRQLLexer())) {
                    alt2=1;
                }
                else {
                    alt2=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:21:14: ( 'composing(' )=> 'composing'
                    {
                    match("composing"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:21:45: ( 'c' )=> 'c'
                    {
                    match('c'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_52"

    // $ANTLR start "KEYWORD_49"
    public final void mKEYWORD_49() throws RecognitionException {
        try {
            int _type = KEYWORD_49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:12: ( '=' ( ( 'like=' )=> 'like=' | ( 'le=' )=> 'le=' | ( 'lt=' )=> 'lt=' )? )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:14: '=' ( ( 'like=' )=> 'like=' | ( 'le=' )=> 'le=' | ( 'lt=' )=> 'lt=' )?
            {
            match('='); if (state.failed) return ;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:18: ( ( 'like=' )=> 'like=' | ( 'le=' )=> 'le=' | ( 'lt=' )=> 'lt=' )?
            int alt3=4;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='l') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='i') && (synpred5_CustomRQLLexer())) {
                    alt3=1;
                }
                else if ( (LA3_1=='e') && (synpred6_CustomRQLLexer())) {
                    alt3=2;
                }
                else if ( (LA3_1=='t') && (synpred7_CustomRQLLexer())) {
                    alt3=3;
                }
            }
            switch (alt3) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:19: ( 'like=' )=> 'like='
                    {
                    match("like="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:41: ( 'le=' )=> 'le='
                    {
                    match("le="); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                      _type = KEYWORD_39;
                    }

                    }
                    break;
                case 3 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:82: ( 'lt=' )=> 'lt='
                    {
                    match("lt="); if (state.failed) return ;

                    if ( state.backtracking==0 ) {
                      _type = KEYWORD_40;
                    }

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_49"

    // $ANTLR start "KEYWORD_50"
    public final void mKEYWORD_50() throws RecognitionException {
        try {
            int _type = KEYWORD_50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:25:12: ( ( 'isnull(' )=> 'isnull' | ( 'i' )=> 'i' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='i') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='s') && (synpred8_CustomRQLLexer())) {
                    alt4=1;
                }
                else {
                    alt4=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:25:14: ( 'isnull(' )=> 'isnull'
                    {
                    match("isnull"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:25:40: ( 'i' )=> 'i'
                    {
                    match('i'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_50"

    // $ANTLR start "KEYWORD_51"
    public final void mKEYWORD_51() throws RecognitionException {
        try {
            int _type = KEYWORD_51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:27:12: ( ( 'select(' )=> 'select' | ( 's' )=> 's' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='s') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='e') && (synpred10_CustomRQLLexer())) {
                    alt5=1;
                }
                else {
                    alt5=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:27:14: ( 'select(' )=> 'select'
                    {
                    match("select"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:27:40: ( 's' )=> 's'
                    {
                    match('s'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_51"

    // $ANTLR start "KEYWORD_46"
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:29:12: ( ( 'empty(' )=> 'empty' | ( 'e' )=> 'e' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='e') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='m') && (synpred12_CustomRQLLexer())) {
                    alt6=1;
                }
                else {
                    alt6=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:29:14: ( 'empty(' )=> 'empty'
                    {
                    match("empty"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:29:38: ( 'e' )=> 'e'
                    {
                    match('e'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_46"

    // $ANTLR start "KEYWORD_47"
    public final void mKEYWORD_47() throws RecognitionException {
        try {
            int _type = KEYWORD_47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:31:12: ( ( 'false(' )=> 'false' | ( 'f' )=> 'f' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='f') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='a') && (synpred14_CustomRQLLexer())) {
                    alt7=1;
                }
                else {
                    alt7=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:31:14: ( 'false(' )=> 'false'
                    {
                    match("false"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:31:38: ( 'f' )=> 'f'
                    {
                    match('f'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_47"

    // $ANTLR start "KEYWORD_48"
    public final void mKEYWORD_48() throws RecognitionException {
        try {
            int _type = KEYWORD_48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:33:12: ( ( 'limit(' )=> 'limit' | ( 'l' )=> 'l' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='l') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='i') && (synpred16_CustomRQLLexer())) {
                    alt8=1;
                }
                else {
                    alt8=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:33:14: ( 'limit(' )=> 'limit'
                    {
                    match("limit"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:33:38: ( 'l' )=> 'l'
                    {
                    match('l'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_48"

    // $ANTLR start "KEYWORD_36"
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:35:12: ( '=eq=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:35:14: '=eq='
            {
            match("=eq="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_36"

    // $ANTLR start "KEYWORD_37"
    public final void mKEYWORD_37() throws RecognitionException {
        try {
            int _type = KEYWORD_37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:37:12: ( '=ge=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:37:14: '=ge='
            {
            match("=ge="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_37"

    // $ANTLR start "KEYWORD_38"
    public final void mKEYWORD_38() throws RecognitionException {
        try {
            int _type = KEYWORD_38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:39:12: ( '=gt=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:39:14: '=gt='
            {
            match("=gt="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_38"

    // $ANTLR start "KEYWORD_39"
    public final void mKEYWORD_39() throws RecognitionException {
        try {
            int _type = KEYWORD_39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:41:12: ( '=le=' | 'u9876' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='=') ) {
                alt9=1;
            }
            else if ( (LA9_0=='u') ) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:41:14: '=le='
                    {
                    match("=le="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:41:23: 'u9876'
                    {
                    match("u9876"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_39"

    // $ANTLR start "KEYWORD_40"
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:43:12: ( '=lt=' | 'u9875' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='=') ) {
                alt10=1;
            }
            else if ( (LA10_0=='u') ) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:43:14: '=lt='
                    {
                    match("=lt="); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:43:23: 'u9875'
                    {
                    match("u9875"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_40"

    // $ANTLR start "KEYWORD_41"
    public final void mKEYWORD_41() throws RecognitionException {
        try {
            int _type = KEYWORD_41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:45:12: ( '=ne=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:45:14: '=ne='
            {
            match("=ne="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_41"

    // $ANTLR start "KEYWORD_42"
    public final void mKEYWORD_42() throws RecognitionException {
        try {
            int _type = KEYWORD_42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:47:12: ( ( 'like(' )=> 'like' | ( 'l' )=> 'l' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='l') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='i') && (synpred18_CustomRQLLexer())) {
                    alt11=1;
                }
                else {
                    alt11=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:47:14: ( 'like(' )=> 'like'
                    {
                    match("like"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:47:36: ( 'l' )=> 'l'
                    {
                    match('l'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_42"

    // $ANTLR start "KEYWORD_43"
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:49:12: ( ( 'null(' )=> 'null' | ( 'n' )=> 'n' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='n') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='u') && (synpred20_CustomRQLLexer())) {
                    alt12=1;
                }
                else {
                    alt12=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:49:14: ( 'null(' )=> 'null'
                    {
                    match("null"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:49:36: ( 'n' )=> 'n'
                    {
                    match('n'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_43"

    // $ANTLR start "KEYWORD_44"
    public final void mKEYWORD_44() throws RecognitionException {
        try {
            int _type = KEYWORD_44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:51:12: ( ( 'sort(' )=> 'sort' | ( 's' )=> 's' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='s') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='o') && (synpred22_CustomRQLLexer())) {
                    alt13=1;
                }
                else {
                    alt13=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:51:14: ( 'sort(' )=> 'sort'
                    {
                    match("sort"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:51:36: ( 's' )=> 's'
                    {
                    match('s'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_44"

    // $ANTLR start "KEYWORD_45"
    public final void mKEYWORD_45() throws RecognitionException {
        try {
            int _type = KEYWORD_45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:53:12: ( ( 'true(' )=> 'true' | ( 't' )=> 't' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='t') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='r') && (synpred24_CustomRQLLexer())) {
                    alt14=1;
                }
                else {
                    alt14=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:53:14: ( 'true(' )=> 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:53:36: ( 't' )=> 't'
                    {
                    match('t'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_45"

    // $ANTLR start "KEYWORD_33"
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:55:12: ( ( 'and(' )=> 'and' | ( 'a' )=> 'a' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='a') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='n') && (synpred26_CustomRQLLexer())) {
                    alt15=1;
                }
                else {
                    alt15=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:55:14: ( 'and(' )=> 'and'
                    {
                    match("and"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:55:34: ( 'a' )=> 'a'
                    {
                    match('a'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_33"

    // $ANTLR start "KEYWORD_34"
    public final void mKEYWORD_34() throws RecognitionException {
        try {
            int _type = KEYWORD_34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:57:12: ( ( 'not(' )=> 'not' | ( 'n' )=> 'n' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='n') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='o') && (synpred28_CustomRQLLexer())) {
                    alt16=1;
                }
                else {
                    alt16=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:57:14: ( 'not(' )=> 'not'
                    {
                    match("not"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:57:34: ( 'n' )=> 'n'
                    {
                    match('n'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_34"

    // $ANTLR start "KEYWORD_35"
    public final void mKEYWORD_35() throws RecognitionException {
        try {
            int _type = KEYWORD_35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:59:12: ( ( 'out(' )=> 'out' | ( 'o' )=> 'o' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='o') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='u') && (synpred30_CustomRQLLexer())) {
                    alt17=1;
                }
                else {
                    alt17=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:59:14: ( 'out(' )=> 'out'
                    {
                    match("out"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:59:34: ( 'o' )=> 'o'
                    {
                    match('o'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_35"

    // $ANTLR start "KEYWORD_22"
    public final void mKEYWORD_22() throws RecognitionException {
        try {
            int _type = KEYWORD_22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:61:12: ( '!=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:61:14: '!='
            {
            match("!="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_22"

    // $ANTLR start "KEYWORD_23"
    public final void mKEYWORD_23() throws RecognitionException {
        try {
            int _type = KEYWORD_23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:63:12: ( '<=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:63:14: '<='
            {
            match("<="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_23"

    // $ANTLR start "KEYWORD_24"
    public final void mKEYWORD_24() throws RecognitionException {
        try {
            int _type = KEYWORD_24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:65:12: ( '>=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:65:14: '>='
            {
            match(">="); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_24"

    // $ANTLR start "KEYWORD_25"
    public final void mKEYWORD_25() throws RecognitionException {
        try {
            int _type = KEYWORD_25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:67:12: ( ( 'eq(' )=> 'eq' | ( 'e' )=> 'e' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='e') ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='q') && (synpred32_CustomRQLLexer())) {
                    alt18=1;
                }
                else {
                    alt18=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:67:14: ( 'eq(' )=> 'eq'
                    {
                    match("eq"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:67:32: ( 'e' )=> 'e'
                    {
                    match('e'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_25"

    // $ANTLR start "KEYWORD_26"
    public final void mKEYWORD_26() throws RecognitionException {
        try {
            int _type = KEYWORD_26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:69:12: ( ( 'ge(' )=> 'ge' | ( 'g' )=> 'g' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='g') ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='e') && (synpred34_CustomRQLLexer())) {
                    alt19=1;
                }
                else {
                    alt19=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:69:14: ( 'ge(' )=> 'ge'
                    {
                    match("ge"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:69:32: ( 'g' )=> 'g'
                    {
                    match('g'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_26"

    // $ANTLR start "KEYWORD_27"
    public final void mKEYWORD_27() throws RecognitionException {
        try {
            int _type = KEYWORD_27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:71:12: ( ( 'gt(' )=> 'gt' | ( 'g' )=> 'g' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='g') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='t') && (synpred36_CustomRQLLexer())) {
                    alt20=1;
                }
                else {
                    alt20=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:71:14: ( 'gt(' )=> 'gt'
                    {
                    match("gt"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:71:32: ( 'g' )=> 'g'
                    {
                    match('g'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_27"

    // $ANTLR start "KEYWORD_28"
    public final void mKEYWORD_28() throws RecognitionException {
        try {
            int _type = KEYWORD_28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:73:12: ( ( 'in(' )=> 'in' | ( 'i' )=> 'i' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='i') ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1=='n') && (synpred38_CustomRQLLexer())) {
                    alt21=1;
                }
                else {
                    alt21=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:73:14: ( 'in(' )=> 'in'
                    {
                    match("in"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:73:32: ( 'i' )=> 'i'
                    {
                    match('i'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_28"

    // $ANTLR start "KEYWORD_29"
    public final void mKEYWORD_29() throws RecognitionException {
        try {
            int _type = KEYWORD_29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:75:12: ( ( 'le(' )=> 'le' | ( 'l' )=> 'l' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='l') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='e') && (synpred40_CustomRQLLexer())) {
                    alt22=1;
                }
                else {
                    alt22=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:75:14: ( 'le(' )=> 'le'
                    {
                    match("le"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:75:32: ( 'l' )=> 'l'
                    {
                    match('l'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_29"

    // $ANTLR start "KEYWORD_30"
    public final void mKEYWORD_30() throws RecognitionException {
        try {
            int _type = KEYWORD_30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:77:12: ( ( 'lt(' )=> 'lt' | ( 'l' )=> 'l' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='l') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='t') && (synpred42_CustomRQLLexer())) {
                    alt23=1;
                }
                else {
                    alt23=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:77:14: ( 'lt(' )=> 'lt'
                    {
                    match("lt"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:77:32: ( 'l' )=> 'l'
                    {
                    match('l'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_30"

    // $ANTLR start "KEYWORD_31"
    public final void mKEYWORD_31() throws RecognitionException {
        try {
            int _type = KEYWORD_31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:79:12: ( ( 'ne(' )=> 'ne' | ( 'n' )=> 'n' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='n') ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1=='e') && (synpred44_CustomRQLLexer())) {
                    alt24=1;
                }
                else {
                    alt24=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:79:14: ( 'ne(' )=> 'ne'
                    {
                    match("ne"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:79:32: ( 'n' )=> 'n'
                    {
                    match('n'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_31"

    // $ANTLR start "KEYWORD_32"
    public final void mKEYWORD_32() throws RecognitionException {
        try {
            int _type = KEYWORD_32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:81:12: ( ( 'or(' )=> 'or' | ( 'o' )=> 'o' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='o') ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1=='r') && (synpred46_CustomRQLLexer())) {
                    alt25=1;
                }
                else {
                    alt25=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:81:14: ( 'or(' )=> 'or'
                    {
                    match("or"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:81:32: ( 'o' )=> 'o'
                    {
                    match('o'); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                      _type = RULE_ALPHA;
                    }

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_32"

    // $ANTLR start "KEYWORD_1"
    public final void mKEYWORD_1() throws RecognitionException {
        try {
            int _type = KEYWORD_1;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:83:11: ( '$' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:83:13: '$'
            {
            match('$'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_1"

    // $ANTLR start "KEYWORD_2"
    public final void mKEYWORD_2() throws RecognitionException {
        try {
            int _type = KEYWORD_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:85:11: ( '%' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:85:13: '%'
            {
            match('%'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_2"

    // $ANTLR start "KEYWORD_3"
    public final void mKEYWORD_3() throws RecognitionException {
        try {
            int _type = KEYWORD_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:87:11: ( '&' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:87:13: '&'
            {
            match('&'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_3"

    // $ANTLR start "KEYWORD_4"
    public final void mKEYWORD_4() throws RecognitionException {
        try {
            int _type = KEYWORD_4;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:89:11: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:89:13: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_4"

    // $ANTLR start "KEYWORD_5"
    public final void mKEYWORD_5() throws RecognitionException {
        try {
            int _type = KEYWORD_5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:91:11: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:91:13: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_5"

    // $ANTLR start "KEYWORD_6"
    public final void mKEYWORD_6() throws RecognitionException {
        try {
            int _type = KEYWORD_6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:93:11: ( '*' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:93:13: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_6"

    // $ANTLR start "KEYWORD_7"
    public final void mKEYWORD_7() throws RecognitionException {
        try {
            int _type = KEYWORD_7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:95:11: ( '+' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:95:13: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_7"

    // $ANTLR start "KEYWORD_8"
    public final void mKEYWORD_8() throws RecognitionException {
        try {
            int _type = KEYWORD_8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:97:11: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:97:13: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_8"

    // $ANTLR start "KEYWORD_9"
    public final void mKEYWORD_9() throws RecognitionException {
        try {
            int _type = KEYWORD_9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:99:11: ( '-' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:99:13: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_9"

    // $ANTLR start "KEYWORD_10"
    public final void mKEYWORD_10() throws RecognitionException {
        try {
            int _type = KEYWORD_10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:101:12: ( '.' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:101:14: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_10"

    // $ANTLR start "KEYWORD_11"
    public final void mKEYWORD_11() throws RecognitionException {
        try {
            int _type = KEYWORD_11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:103:12: ( '/' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:103:14: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_11"

    // $ANTLR start "KEYWORD_12"
    public final void mKEYWORD_12() throws RecognitionException {
        try {
            int _type = KEYWORD_12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:105:12: ( ':' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:105:14: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_12"

    // $ANTLR start "KEYWORD_13"
    public final void mKEYWORD_13() throws RecognitionException {
        try {
            int _type = KEYWORD_13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:107:12: ( ';' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:107:14: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_13"

    // $ANTLR start "KEYWORD_14"
    public final void mKEYWORD_14() throws RecognitionException {
        try {
            int _type = KEYWORD_14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:109:12: ( '<' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:109:14: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_14"

    // $ANTLR start "KEYWORD_15"
    public final void mKEYWORD_15() throws RecognitionException {
        try {
            int _type = KEYWORD_15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:111:12: ( '=' | 'u9874' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='=') ) {
                alt26=1;
            }
            else if ( (LA26_0=='u') ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:111:14: '='
                    {
                    match('='); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:111:20: 'u9874'
                    {
                    match("u9874"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_15"

    // $ANTLR start "KEYWORD_16"
    public final void mKEYWORD_16() throws RecognitionException {
        try {
            int _type = KEYWORD_16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:113:12: ( '>' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:113:14: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_16"

    // $ANTLR start "KEYWORD_17"
    public final void mKEYWORD_17() throws RecognitionException {
        try {
            int _type = KEYWORD_17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:115:12: ( '?' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:115:14: '?'
            {
            match('?'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_17"

    // $ANTLR start "KEYWORD_18"
    public final void mKEYWORD_18() throws RecognitionException {
        try {
            int _type = KEYWORD_18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:117:12: ( '@' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:117:14: '@'
            {
            match('@'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_18"

    // $ANTLR start "KEYWORD_19"
    public final void mKEYWORD_19() throws RecognitionException {
        try {
            int _type = KEYWORD_19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:119:12: ( '_' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:119:14: '_'
            {
            match('_'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_19"

    // $ANTLR start "KEYWORD_20"
    public final void mKEYWORD_20() throws RecognitionException {
        try {
            int _type = KEYWORD_20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:121:12: ( '|' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:121:14: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_20"

    // $ANTLR start "KEYWORD_21"
    public final void mKEYWORD_21() throws RecognitionException {
        try {
            int _type = KEYWORD_21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:123:12: ( '~' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:123:14: '~'
            {
            match('~'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_21"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:127:12: ( '0' .. '9' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:127:14: '0' .. '9'
            {
            matchRange('0','9'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_XDIGIT"
    public final void mRULE_XDIGIT() throws RecognitionException {
        try {
            int _type = RULE_XDIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:129:13: ( ( RULE_DIGIT | 'A' .. 'F' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:129:15: ( RULE_DIGIT | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_XDIGIT"

    // $ANTLR start "RULE_ALPHA"
    public final void mRULE_ALPHA() throws RecognitionException {
        try {
            int _type = RULE_ALPHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:131:12: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:131:14: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ALPHA"

    // $ANTLR start "RULE_WSP"
    public final void mRULE_WSP() throws RecognitionException {
        try {
            int _type = RULE_WSP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:133:10: ( ( ' ' | '\\t' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:133:12: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WSP"

    public void mTokens() throws RecognitionException {
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:8: ( KEYWORD_53 | KEYWORD_52 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | RULE_DIGIT | RULE_XDIGIT | RULE_ALPHA | RULE_WSP )
        int alt27=57;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:10: KEYWORD_53
                {
                mKEYWORD_53(); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:21: KEYWORD_52
                {
                mKEYWORD_52(); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:32: KEYWORD_49
                {
                mKEYWORD_49(); if (state.failed) return ;

                }
                break;
            case 4 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:43: KEYWORD_50
                {
                mKEYWORD_50(); if (state.failed) return ;

                }
                break;
            case 5 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:54: KEYWORD_51
                {
                mKEYWORD_51(); if (state.failed) return ;

                }
                break;
            case 6 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:65: KEYWORD_46
                {
                mKEYWORD_46(); if (state.failed) return ;

                }
                break;
            case 7 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:76: KEYWORD_47
                {
                mKEYWORD_47(); if (state.failed) return ;

                }
                break;
            case 8 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:87: KEYWORD_48
                {
                mKEYWORD_48(); if (state.failed) return ;

                }
                break;
            case 9 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:98: KEYWORD_36
                {
                mKEYWORD_36(); if (state.failed) return ;

                }
                break;
            case 10 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:109: KEYWORD_37
                {
                mKEYWORD_37(); if (state.failed) return ;

                }
                break;
            case 11 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:120: KEYWORD_38
                {
                mKEYWORD_38(); if (state.failed) return ;

                }
                break;
            case 12 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:131: KEYWORD_39
                {
                mKEYWORD_39(); if (state.failed) return ;

                }
                break;
            case 13 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:142: KEYWORD_40
                {
                mKEYWORD_40(); if (state.failed) return ;

                }
                break;
            case 14 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:153: KEYWORD_41
                {
                mKEYWORD_41(); if (state.failed) return ;

                }
                break;
            case 15 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:164: KEYWORD_42
                {
                mKEYWORD_42(); if (state.failed) return ;

                }
                break;
            case 16 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:175: KEYWORD_43
                {
                mKEYWORD_43(); if (state.failed) return ;

                }
                break;
            case 17 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:186: KEYWORD_44
                {
                mKEYWORD_44(); if (state.failed) return ;

                }
                break;
            case 18 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:197: KEYWORD_45
                {
                mKEYWORD_45(); if (state.failed) return ;

                }
                break;
            case 19 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:208: KEYWORD_33
                {
                mKEYWORD_33(); if (state.failed) return ;

                }
                break;
            case 20 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:219: KEYWORD_34
                {
                mKEYWORD_34(); if (state.failed) return ;

                }
                break;
            case 21 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:230: KEYWORD_35
                {
                mKEYWORD_35(); if (state.failed) return ;

                }
                break;
            case 22 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:241: KEYWORD_22
                {
                mKEYWORD_22(); if (state.failed) return ;

                }
                break;
            case 23 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:252: KEYWORD_23
                {
                mKEYWORD_23(); if (state.failed) return ;

                }
                break;
            case 24 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:263: KEYWORD_24
                {
                mKEYWORD_24(); if (state.failed) return ;

                }
                break;
            case 25 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:274: KEYWORD_25
                {
                mKEYWORD_25(); if (state.failed) return ;

                }
                break;
            case 26 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:285: KEYWORD_26
                {
                mKEYWORD_26(); if (state.failed) return ;

                }
                break;
            case 27 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:296: KEYWORD_27
                {
                mKEYWORD_27(); if (state.failed) return ;

                }
                break;
            case 28 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:307: KEYWORD_28
                {
                mKEYWORD_28(); if (state.failed) return ;

                }
                break;
            case 29 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:318: KEYWORD_29
                {
                mKEYWORD_29(); if (state.failed) return ;

                }
                break;
            case 30 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:329: KEYWORD_30
                {
                mKEYWORD_30(); if (state.failed) return ;

                }
                break;
            case 31 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:340: KEYWORD_31
                {
                mKEYWORD_31(); if (state.failed) return ;

                }
                break;
            case 32 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:351: KEYWORD_32
                {
                mKEYWORD_32(); if (state.failed) return ;

                }
                break;
            case 33 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:362: KEYWORD_1
                {
                mKEYWORD_1(); if (state.failed) return ;

                }
                break;
            case 34 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:372: KEYWORD_2
                {
                mKEYWORD_2(); if (state.failed) return ;

                }
                break;
            case 35 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:382: KEYWORD_3
                {
                mKEYWORD_3(); if (state.failed) return ;

                }
                break;
            case 36 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:392: KEYWORD_4
                {
                mKEYWORD_4(); if (state.failed) return ;

                }
                break;
            case 37 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:402: KEYWORD_5
                {
                mKEYWORD_5(); if (state.failed) return ;

                }
                break;
            case 38 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:412: KEYWORD_6
                {
                mKEYWORD_6(); if (state.failed) return ;

                }
                break;
            case 39 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:422: KEYWORD_7
                {
                mKEYWORD_7(); if (state.failed) return ;

                }
                break;
            case 40 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:432: KEYWORD_8
                {
                mKEYWORD_8(); if (state.failed) return ;

                }
                break;
            case 41 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:442: KEYWORD_9
                {
                mKEYWORD_9(); if (state.failed) return ;

                }
                break;
            case 42 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:452: KEYWORD_10
                {
                mKEYWORD_10(); if (state.failed) return ;

                }
                break;
            case 43 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:463: KEYWORD_11
                {
                mKEYWORD_11(); if (state.failed) return ;

                }
                break;
            case 44 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:474: KEYWORD_12
                {
                mKEYWORD_12(); if (state.failed) return ;

                }
                break;
            case 45 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:485: KEYWORD_13
                {
                mKEYWORD_13(); if (state.failed) return ;

                }
                break;
            case 46 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:496: KEYWORD_14
                {
                mKEYWORD_14(); if (state.failed) return ;

                }
                break;
            case 47 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:507: KEYWORD_15
                {
                mKEYWORD_15(); if (state.failed) return ;

                }
                break;
            case 48 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:518: KEYWORD_16
                {
                mKEYWORD_16(); if (state.failed) return ;

                }
                break;
            case 49 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:529: KEYWORD_17
                {
                mKEYWORD_17(); if (state.failed) return ;

                }
                break;
            case 50 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:540: KEYWORD_18
                {
                mKEYWORD_18(); if (state.failed) return ;

                }
                break;
            case 51 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:551: KEYWORD_19
                {
                mKEYWORD_19(); if (state.failed) return ;

                }
                break;
            case 52 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:562: KEYWORD_20
                {
                mKEYWORD_20(); if (state.failed) return ;

                }
                break;
            case 53 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:573: KEYWORD_21
                {
                mKEYWORD_21(); if (state.failed) return ;

                }
                break;
            case 54 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:584: RULE_DIGIT
                {
                mRULE_DIGIT(); if (state.failed) return ;

                }
                break;
            case 55 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:595: RULE_XDIGIT
                {
                mRULE_XDIGIT(); if (state.failed) return ;

                }
                break;
            case 56 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:607: RULE_ALPHA
                {
                mRULE_ALPHA(); if (state.failed) return ;

                }
                break;
            case 57 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:618: RULE_WSP
                {
                mRULE_WSP(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_CustomRQLLexer
    public final void synpred1_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:19:14: ( 'implementing(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:19:15: 'implementing('
        {
        match("implementing("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred1_CustomRQLLexer

    // $ANTLR start synpred2_CustomRQLLexer
    public final void synpred2_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:19:51: ( 'i' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:19:52: 'i'
        {
        match('i'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_CustomRQLLexer

    // $ANTLR start synpred3_CustomRQLLexer
    public final void synpred3_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:21:14: ( 'composing(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:21:15: 'composing('
        {
        match("composing("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred3_CustomRQLLexer

    // $ANTLR start synpred4_CustomRQLLexer
    public final void synpred4_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:21:45: ( 'c' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:21:46: 'c'
        {
        match('c'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_CustomRQLLexer

    // $ANTLR start synpred5_CustomRQLLexer
    public final void synpred5_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:19: ( 'like=' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:20: 'like='
        {
        match("like="); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred5_CustomRQLLexer

    // $ANTLR start synpred6_CustomRQLLexer
    public final void synpred6_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:41: ( 'le=' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:42: 'le='
        {
        match("le="); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred6_CustomRQLLexer

    // $ANTLR start synpred7_CustomRQLLexer
    public final void synpred7_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:82: ( 'lt=' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:83: 'lt='
        {
        match("lt="); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred7_CustomRQLLexer

    // $ANTLR start synpred8_CustomRQLLexer
    public final void synpred8_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:25:14: ( 'isnull(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:25:15: 'isnull('
        {
        match("isnull("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred8_CustomRQLLexer

    // $ANTLR start synpred9_CustomRQLLexer
    public final void synpred9_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:25:40: ( 'i' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:25:41: 'i'
        {
        match('i'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_CustomRQLLexer

    // $ANTLR start synpred10_CustomRQLLexer
    public final void synpred10_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:27:14: ( 'select(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:27:15: 'select('
        {
        match("select("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred10_CustomRQLLexer

    // $ANTLR start synpred11_CustomRQLLexer
    public final void synpred11_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:27:40: ( 's' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:27:41: 's'
        {
        match('s'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred11_CustomRQLLexer

    // $ANTLR start synpred12_CustomRQLLexer
    public final void synpred12_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:29:14: ( 'empty(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:29:15: 'empty('
        {
        match("empty("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred12_CustomRQLLexer

    // $ANTLR start synpred13_CustomRQLLexer
    public final void synpred13_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:29:38: ( 'e' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:29:39: 'e'
        {
        match('e'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_CustomRQLLexer

    // $ANTLR start synpred14_CustomRQLLexer
    public final void synpred14_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:31:14: ( 'false(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:31:15: 'false('
        {
        match("false("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred14_CustomRQLLexer

    // $ANTLR start synpred15_CustomRQLLexer
    public final void synpred15_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:31:38: ( 'f' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:31:39: 'f'
        {
        match('f'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_CustomRQLLexer

    // $ANTLR start synpred16_CustomRQLLexer
    public final void synpred16_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:33:14: ( 'limit(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:33:15: 'limit('
        {
        match("limit("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred16_CustomRQLLexer

    // $ANTLR start synpred17_CustomRQLLexer
    public final void synpred17_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:33:38: ( 'l' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:33:39: 'l'
        {
        match('l'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_CustomRQLLexer

    // $ANTLR start synpred18_CustomRQLLexer
    public final void synpred18_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:47:14: ( 'like(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:47:15: 'like('
        {
        match("like("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred18_CustomRQLLexer

    // $ANTLR start synpred19_CustomRQLLexer
    public final void synpred19_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:47:36: ( 'l' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:47:37: 'l'
        {
        match('l'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_CustomRQLLexer

    // $ANTLR start synpred20_CustomRQLLexer
    public final void synpred20_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:49:14: ( 'null(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:49:15: 'null('
        {
        match("null("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred20_CustomRQLLexer

    // $ANTLR start synpred21_CustomRQLLexer
    public final void synpred21_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:49:36: ( 'n' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:49:37: 'n'
        {
        match('n'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_CustomRQLLexer

    // $ANTLR start synpred22_CustomRQLLexer
    public final void synpred22_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:51:14: ( 'sort(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:51:15: 'sort('
        {
        match("sort("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred22_CustomRQLLexer

    // $ANTLR start synpred23_CustomRQLLexer
    public final void synpred23_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:51:36: ( 's' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:51:37: 's'
        {
        match('s'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_CustomRQLLexer

    // $ANTLR start synpred24_CustomRQLLexer
    public final void synpred24_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:53:14: ( 'true(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:53:15: 'true('
        {
        match("true("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred24_CustomRQLLexer

    // $ANTLR start synpred25_CustomRQLLexer
    public final void synpred25_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:53:36: ( 't' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:53:37: 't'
        {
        match('t'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_CustomRQLLexer

    // $ANTLR start synpred26_CustomRQLLexer
    public final void synpred26_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:55:14: ( 'and(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:55:15: 'and('
        {
        match("and("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred26_CustomRQLLexer

    // $ANTLR start synpred27_CustomRQLLexer
    public final void synpred27_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:55:34: ( 'a' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:55:35: 'a'
        {
        match('a'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred27_CustomRQLLexer

    // $ANTLR start synpred28_CustomRQLLexer
    public final void synpred28_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:57:14: ( 'not(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:57:15: 'not('
        {
        match("not("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred28_CustomRQLLexer

    // $ANTLR start synpred29_CustomRQLLexer
    public final void synpred29_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:57:34: ( 'n' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:57:35: 'n'
        {
        match('n'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred29_CustomRQLLexer

    // $ANTLR start synpred30_CustomRQLLexer
    public final void synpred30_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:59:14: ( 'out(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:59:15: 'out('
        {
        match("out("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred30_CustomRQLLexer

    // $ANTLR start synpred31_CustomRQLLexer
    public final void synpred31_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:59:34: ( 'o' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:59:35: 'o'
        {
        match('o'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_CustomRQLLexer

    // $ANTLR start synpred32_CustomRQLLexer
    public final void synpred32_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:67:14: ( 'eq(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:67:15: 'eq('
        {
        match("eq("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred32_CustomRQLLexer

    // $ANTLR start synpred33_CustomRQLLexer
    public final void synpred33_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:67:32: ( 'e' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:67:33: 'e'
        {
        match('e'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_CustomRQLLexer

    // $ANTLR start synpred34_CustomRQLLexer
    public final void synpred34_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:69:14: ( 'ge(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:69:15: 'ge('
        {
        match("ge("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred34_CustomRQLLexer

    // $ANTLR start synpred35_CustomRQLLexer
    public final void synpred35_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:69:32: ( 'g' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:69:33: 'g'
        {
        match('g'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred35_CustomRQLLexer

    // $ANTLR start synpred36_CustomRQLLexer
    public final void synpred36_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:71:14: ( 'gt(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:71:15: 'gt('
        {
        match("gt("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred36_CustomRQLLexer

    // $ANTLR start synpred37_CustomRQLLexer
    public final void synpred37_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:71:32: ( 'g' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:71:33: 'g'
        {
        match('g'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_CustomRQLLexer

    // $ANTLR start synpred38_CustomRQLLexer
    public final void synpred38_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:73:14: ( 'in(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:73:15: 'in('
        {
        match("in("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred38_CustomRQLLexer

    // $ANTLR start synpred39_CustomRQLLexer
    public final void synpred39_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:73:32: ( 'i' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:73:33: 'i'
        {
        match('i'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_CustomRQLLexer

    // $ANTLR start synpred40_CustomRQLLexer
    public final void synpred40_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:75:14: ( 'le(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:75:15: 'le('
        {
        match("le("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred40_CustomRQLLexer

    // $ANTLR start synpred41_CustomRQLLexer
    public final void synpred41_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:75:32: ( 'l' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:75:33: 'l'
        {
        match('l'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred41_CustomRQLLexer

    // $ANTLR start synpred42_CustomRQLLexer
    public final void synpred42_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:77:14: ( 'lt(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:77:15: 'lt('
        {
        match("lt("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred42_CustomRQLLexer

    // $ANTLR start synpred43_CustomRQLLexer
    public final void synpred43_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:77:32: ( 'l' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:77:33: 'l'
        {
        match('l'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_CustomRQLLexer

    // $ANTLR start synpred44_CustomRQLLexer
    public final void synpred44_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:79:14: ( 'ne(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:79:15: 'ne('
        {
        match("ne("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred44_CustomRQLLexer

    // $ANTLR start synpred45_CustomRQLLexer
    public final void synpred45_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:79:32: ( 'n' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:79:33: 'n'
        {
        match('n'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred45_CustomRQLLexer

    // $ANTLR start synpred46_CustomRQLLexer
    public final void synpred46_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:81:14: ( 'or(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:81:15: 'or('
        {
        match("or("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred46_CustomRQLLexer

    // $ANTLR start synpred47_CustomRQLLexer
    public final void synpred47_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:81:32: ( 'o' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:81:33: 'o'
        {
        match('o'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred47_CustomRQLLexer

    public final boolean synpred30_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred43_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred34_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred46_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred46_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred40_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred44_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred44_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_CustomRQLLexer() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_CustomRQLLexer_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\1\uffff\1\47\1\uffff\1\57\1\60\1\62\1\uffff\1\70\1\45\1\72\2\uffff"+
        "\1\77\1\uffff\1\102\1\104\1\105\104\uffff";
    static final String DFA27_eofS =
        "\125\uffff";
    static final String DFA27_minS =
        "\1\11\1\156\1\uffff\1\145\1\157\1\161\1\uffff\1\145\1\71\1\145"+
        "\2\uffff\1\162\1\uffff\2\75\1\164\33\uffff\2\145\7\uffff\1\153\3"+
        "\uffff\1\70\21\uffff\2\75\1\uffff\1\67\2\uffff\1\64\3\uffff";
    static final String DFA27_maxS =
        "\1\176\1\163\1\uffff\1\156\1\157\1\161\1\uffff\1\164\1\71\1\157"+
        "\2\uffff\1\162\1\uffff\2\75\1\164\33\uffff\2\164\7\uffff\1\155\3"+
        "\uffff\1\70\21\uffff\2\75\1\uffff\1\67\2\uffff\1\66\3\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\3\uffff\1\7\3\uffff\1\22\1\23\1\uffff\1\26\3\uffff"+
        "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
        "\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\1\1\4\1\34\1\2\1"+
        "\11\2\uffff\1\16\1\3\1\5\1\21\1\6\1\31\1\7\1\uffff\1\35\1\36\1\10"+
        "\1\uffff\1\20\1\24\1\37\1\22\1\23\1\25\1\40\1\27\1\56\1\30\1\60"+
        "\1\32\1\33\1\66\1\67\1\12\1\13\2\uffff\1\17\1\uffff\2\3\1\uffff"+
        "\1\14\1\15\1\57";
    static final String DFA27_specialS =
        "\125\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\46\26\uffff\1\46\1\15\2\uffff\1\21\1\22\1\23\1\uffff\1\24"+
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\12\43\1\34\1\35\1\16\1\3"+
            "\1\17\1\36\1\37\6\44\24\45\4\uffff\1\40\1\uffff\1\13\1\45\1"+
            "\2\1\45\1\5\1\6\1\20\1\45\1\1\2\45\1\7\1\45\1\11\1\14\3\45\1"+
            "\4\1\12\1\10\5\45\1\uffff\1\41\1\uffff\1\42",
            "\1\51\4\uffff\1\50",
            "",
            "\1\53\1\uffff\1\54\4\uffff\1\55\1\uffff\1\56",
            "\1\61",
            "\1\63",
            "",
            "\1\66\3\uffff\1\65\12\uffff\1\67",
            "\1\71",
            "\1\74\11\uffff\1\73",
            "",
            "",
            "\1\100",
            "",
            "\1\101",
            "\1\103",
            "\1\106",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\111\16\uffff\1\112",
            "\1\113\3\uffff\1\57\12\uffff\1\114",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\115\1\uffff\1\70",
            "",
            "",
            "",
            "\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117",
            "\1\120",
            "",
            "\1\121",
            "",
            "",
            "\1\124\1\123\1\122",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_53 | KEYWORD_52 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | RULE_DIGIT | RULE_XDIGIT | RULE_ALPHA | RULE_WSP );";
        }
    }
 

}