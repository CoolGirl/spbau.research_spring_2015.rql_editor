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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:19:50: ( 'i' )=> 'i'
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:21:44: ( 'c' )=> 'c'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:12: ( ( 'like(' )=> 'like' | ( 'l' )=> 'l' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='l') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='i') && (synpred5_CustomRQLLexer())) {
                    alt3=1;
                }
                else {
                    alt3=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:14: ( 'like(' )=> 'like'
                    {
                    match("like"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:34: ( 'l' )=> 'l'
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

                if ( (LA4_1=='s') && (synpred7_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:25:38: ( 'i' )=> 'i'
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

                if ( (LA5_1=='e') && (synpred9_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:27:15: ( 'select(' )=> 'select'
                    {
                    match("select"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:27:39: ( 's' )=> 's'
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

                if ( (LA6_1=='m') && (synpred11_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:29:15: ( 'empty(' )=> 'empty'
                    {
                    match("empty"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:29:37: ( 'e' )=> 'e'
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

                if ( (LA7_1=='a') && (synpred13_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:31:15: ( 'false(' )=> 'false'
                    {
                    match("false"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:31:37: ( 'f' )=> 'f'
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

                if ( (LA8_1=='i') && (synpred15_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:33:15: ( 'limit(' )=> 'limit'
                    {
                    match("limit"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:33:37: ( 'l' )=> 'l'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:41:12: ( '=le=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:41:14: '=le='
            {
            match("=le="); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:43:12: ( '=lt=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:43:14: '=lt='
            {
            match("=lt="); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:47:12: ( '=like=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:47:14: '=like='
            {
            match("=like="); if (state.failed) return ;


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
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='n') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='u') && (synpred17_CustomRQLLexer())) {
                    alt9=1;
                }
                else {
                    alt9=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:49:15: ( 'null(' )=> 'null'
                    {
                    match("null"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:49:35: ( 'n' )=> 'n'
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
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='s') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='o') && (synpred19_CustomRQLLexer())) {
                    alt10=1;
                }
                else {
                    alt10=2;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:51:15: ( 'sort(' )=> 'sort'
                    {
                    match("sort"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:51:35: ( 's' )=> 's'
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
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='t') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='r') && (synpred21_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:53:15: ( 'true(' )=> 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:53:35: ( 't' )=> 't'
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
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='a') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='n') && (synpred23_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:55:14: ( 'and(' )=> 'and'
                    {
                    match("and"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:55:32: ( 'a' )=> 'a'
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
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='n') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='o') && (synpred25_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:57:14: ( 'not(' )=> 'not'
                    {
                    match("not"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:57:32: ( 'n' )=> 'n'
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
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='o') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='u') && (synpred27_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:59:15: ( 'out(' )=> 'out'
                    {
                    match("out"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:59:33: ( 'o' )=> 'o'
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
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='e') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='q') && (synpred29_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:67:15: ( 'eq(' )=> 'eq'
                    {
                    match("eq"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:67:31: ( 'e' )=> 'e'
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
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='g') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='e') && (synpred31_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:69:15: ( 'ge(' )=> 'ge'
                    {
                    match("ge"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:69:31: ( 'g' )=> 'g'
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
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='g') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='t') && (synpred33_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:71:15: ( 'gt(' )=> 'gt'
                    {
                    match("gt"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:71:31: ( 'g' )=> 'g'
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
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='i') ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='n') && (synpred35_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:73:15: ( 'in(' )=> 'in'
                    {
                    match("in"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:73:31: ( 'i' )=> 'i'
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
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='l') ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='e') && (synpred37_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:75:15: ( 'le(' )=> 'le'
                    {
                    match("le"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:75:31: ( 'l' )=> 'l'
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
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='l') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='t') && (synpred39_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:77:15: ( 'lt(' )=> 'lt'
                    {
                    match("lt"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:77:31: ( 'l' )=> 'l'
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
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='n') ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1=='e') && (synpred41_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:79:15: ( 'ne(' )=> 'ne'
                    {
                    match("ne"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:79:31: ( 'n' )=> 'n'
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
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='o') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='r') && (synpred43_CustomRQLLexer())) {
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
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:81:14: ( 'or(' )=> 'or'
                    {
                    match("or"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:81:30: ( 'o' )=> 'o'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:111:12: ( '=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:111:14: '='
            {
            match('='); if (state.failed) return ;

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
        int alt23=57;
        alt23 = dfa23.predict(input);
        switch (alt23) {
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
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:19:50: ( 'i' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:19:51: 'i'
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
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:21:44: ( 'c' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:21:45: 'c'
        {
        match('c'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_CustomRQLLexer

    // $ANTLR start synpred5_CustomRQLLexer
    public final void synpred5_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:14: ( 'like(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:15: 'like('
        {
        match("like("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred5_CustomRQLLexer

    // $ANTLR start synpred6_CustomRQLLexer
    public final void synpred6_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:34: ( 'l' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:23:35: 'l'
        {
        match('l'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred6_CustomRQLLexer

    // $ANTLR start synpred7_CustomRQLLexer
    public final void synpred7_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:25:14: ( 'isnull(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:25:15: 'isnull('
        {
        match("isnull("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred7_CustomRQLLexer

    // $ANTLR start synpred8_CustomRQLLexer
    public final void synpred8_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:25:38: ( 'i' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:25:39: 'i'
        {
        match('i'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_CustomRQLLexer

    // $ANTLR start synpred9_CustomRQLLexer
    public final void synpred9_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:27:15: ( 'select(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:27:16: 'select('
        {
        match("select("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred9_CustomRQLLexer

    // $ANTLR start synpred10_CustomRQLLexer
    public final void synpred10_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:27:39: ( 's' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:27:40: 's'
        {
        match('s'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_CustomRQLLexer

    // $ANTLR start synpred11_CustomRQLLexer
    public final void synpred11_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:29:15: ( 'empty(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:29:16: 'empty('
        {
        match("empty("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred11_CustomRQLLexer

    // $ANTLR start synpred12_CustomRQLLexer
    public final void synpred12_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:29:37: ( 'e' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:29:38: 'e'
        {
        match('e'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_CustomRQLLexer

    // $ANTLR start synpred13_CustomRQLLexer
    public final void synpred13_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:31:15: ( 'false(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:31:16: 'false('
        {
        match("false("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred13_CustomRQLLexer

    // $ANTLR start synpred14_CustomRQLLexer
    public final void synpred14_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:31:37: ( 'f' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:31:38: 'f'
        {
        match('f'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_CustomRQLLexer

    // $ANTLR start synpred15_CustomRQLLexer
    public final void synpred15_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:33:15: ( 'limit(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:33:16: 'limit('
        {
        match("limit("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred15_CustomRQLLexer

    // $ANTLR start synpred16_CustomRQLLexer
    public final void synpred16_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:33:37: ( 'l' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:33:38: 'l'
        {
        match('l'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_CustomRQLLexer

    // $ANTLR start synpred17_CustomRQLLexer
    public final void synpred17_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:49:15: ( 'null(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:49:16: 'null('
        {
        match("null("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred17_CustomRQLLexer

    // $ANTLR start synpred18_CustomRQLLexer
    public final void synpred18_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:49:35: ( 'n' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:49:36: 'n'
        {
        match('n'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_CustomRQLLexer

    // $ANTLR start synpred19_CustomRQLLexer
    public final void synpred19_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:51:15: ( 'sort(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:51:16: 'sort('
        {
        match("sort("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred19_CustomRQLLexer

    // $ANTLR start synpred20_CustomRQLLexer
    public final void synpred20_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:51:35: ( 's' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:51:36: 's'
        {
        match('s'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred20_CustomRQLLexer

    // $ANTLR start synpred21_CustomRQLLexer
    public final void synpred21_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:53:15: ( 'true(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:53:16: 'true('
        {
        match("true("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred21_CustomRQLLexer

    // $ANTLR start synpred22_CustomRQLLexer
    public final void synpred22_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:53:35: ( 't' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:53:36: 't'
        {
        match('t'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_CustomRQLLexer

    // $ANTLR start synpred23_CustomRQLLexer
    public final void synpred23_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:55:14: ( 'and(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:55:15: 'and('
        {
        match("and("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred23_CustomRQLLexer

    // $ANTLR start synpred24_CustomRQLLexer
    public final void synpred24_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:55:32: ( 'a' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:55:33: 'a'
        {
        match('a'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_CustomRQLLexer

    // $ANTLR start synpred25_CustomRQLLexer
    public final void synpred25_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:57:14: ( 'not(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:57:15: 'not('
        {
        match("not("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred25_CustomRQLLexer

    // $ANTLR start synpred26_CustomRQLLexer
    public final void synpred26_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:57:32: ( 'n' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:57:33: 'n'
        {
        match('n'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_CustomRQLLexer

    // $ANTLR start synpred27_CustomRQLLexer
    public final void synpred27_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:59:15: ( 'out(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:59:16: 'out('
        {
        match("out("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred27_CustomRQLLexer

    // $ANTLR start synpred28_CustomRQLLexer
    public final void synpred28_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:59:33: ( 'o' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:59:34: 'o'
        {
        match('o'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_CustomRQLLexer

    // $ANTLR start synpred29_CustomRQLLexer
    public final void synpred29_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:67:15: ( 'eq(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:67:16: 'eq('
        {
        match("eq("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred29_CustomRQLLexer

    // $ANTLR start synpred30_CustomRQLLexer
    public final void synpred30_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:67:31: ( 'e' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:67:32: 'e'
        {
        match('e'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred30_CustomRQLLexer

    // $ANTLR start synpred31_CustomRQLLexer
    public final void synpred31_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:69:15: ( 'ge(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:69:16: 'ge('
        {
        match("ge("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred31_CustomRQLLexer

    // $ANTLR start synpred32_CustomRQLLexer
    public final void synpred32_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:69:31: ( 'g' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:69:32: 'g'
        {
        match('g'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_CustomRQLLexer

    // $ANTLR start synpred33_CustomRQLLexer
    public final void synpred33_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:71:15: ( 'gt(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:71:16: 'gt('
        {
        match("gt("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred33_CustomRQLLexer

    // $ANTLR start synpred34_CustomRQLLexer
    public final void synpred34_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:71:31: ( 'g' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:71:32: 'g'
        {
        match('g'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred34_CustomRQLLexer

    // $ANTLR start synpred35_CustomRQLLexer
    public final void synpred35_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:73:15: ( 'in(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:73:16: 'in('
        {
        match("in("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred35_CustomRQLLexer

    // $ANTLR start synpred36_CustomRQLLexer
    public final void synpred36_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:73:31: ( 'i' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:73:32: 'i'
        {
        match('i'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_CustomRQLLexer

    // $ANTLR start synpred37_CustomRQLLexer
    public final void synpred37_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:75:15: ( 'le(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:75:16: 'le('
        {
        match("le("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred37_CustomRQLLexer

    // $ANTLR start synpred38_CustomRQLLexer
    public final void synpred38_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:75:31: ( 'l' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:75:32: 'l'
        {
        match('l'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_CustomRQLLexer

    // $ANTLR start synpred39_CustomRQLLexer
    public final void synpred39_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:77:15: ( 'lt(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:77:16: 'lt('
        {
        match("lt("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred39_CustomRQLLexer

    // $ANTLR start synpred40_CustomRQLLexer
    public final void synpred40_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:77:31: ( 'l' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:77:32: 'l'
        {
        match('l'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_CustomRQLLexer

    // $ANTLR start synpred41_CustomRQLLexer
    public final void synpred41_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:79:15: ( 'ne(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:79:16: 'ne('
        {
        match("ne("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred41_CustomRQLLexer

    // $ANTLR start synpred42_CustomRQLLexer
    public final void synpred42_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:79:31: ( 'n' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:79:32: 'n'
        {
        match('n'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred42_CustomRQLLexer

    // $ANTLR start synpred43_CustomRQLLexer
    public final void synpred43_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:81:14: ( 'or(' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:81:15: 'or('
        {
        match("or("); if (state.failed) return ;


        }
    }
    // $ANTLR end synpred43_CustomRQLLexer

    // $ANTLR start synpred44_CustomRQLLexer
    public final void synpred44_CustomRQLLexer_fragment() throws RecognitionException {   
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:81:30: ( 'o' )
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:81:31: 'o'
        {
        match('o'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred44_CustomRQLLexer

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


    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA23_eotS =
        "\1\uffff\1\46\1\uffff\1\55\1\56\1\60\1\uffff\1\67\1\70\2\uffff"+
        "\1\75\1\uffff\1\100\1\102\1\103\75\uffff";
    static final String DFA23_eofS =
        "\115\uffff";
    static final String DFA23_minS =
        "\1\11\1\156\1\uffff\1\145\1\157\1\161\1\uffff\2\145\2\uffff\1\162"+
        "\1\uffff\2\75\1\164\32\uffff\1\153\11\uffff\2\145\27\uffff";
    static final String DFA23_maxS =
        "\1\176\1\163\1\uffff\1\164\1\157\1\161\1\uffff\1\156\1\157\2\uffff"+
        "\1\162\1\uffff\2\75\1\164\32\uffff\1\155\11\uffff\2\164\27\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\3\uffff\1\7\2\uffff\1\22\1\23\1\uffff\1\26\3\uffff"+
        "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
        "\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\1\1\4\1\34\1\2\1"+
        "\uffff\1\35\1\36\1\3\1\5\1\21\1\6\1\31\1\7\1\11\2\uffff\1\16\1\57"+
        "\1\20\1\24\1\37\1\22\1\23\1\25\1\40\1\27\1\56\1\30\1\60\1\32\1\33"+
        "\1\66\1\67\1\10\1\12\1\13\1\14\1\15\1\17";
    static final String DFA23_specialS =
        "\115\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\45\26\uffff\1\45\1\14\2\uffff\1\20\1\21\1\22\1\uffff\1\23"+
            "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\12\42\1\33\1\34\1\15\1\7"+
            "\1\16\1\35\1\36\6\43\24\44\4\uffff\1\37\1\uffff\1\12\1\44\1"+
            "\2\1\44\1\5\1\6\1\17\1\44\1\1\2\44\1\3\1\44\1\10\1\13\3\44\1"+
            "\4\1\11\6\44\1\uffff\1\40\1\uffff\1\41",
            "\1\50\4\uffff\1\47",
            "",
            "\1\53\3\uffff\1\52\12\uffff\1\54",
            "\1\57",
            "\1\61",
            "",
            "\1\63\1\uffff\1\64\4\uffff\1\65\1\uffff\1\66",
            "\1\72\11\uffff\1\71",
            "",
            "",
            "\1\76",
            "",
            "\1\77",
            "\1\101",
            "\1\104",
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
            "\1\55\1\uffff\1\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110\16\uffff\1\111",
            "\1\112\3\uffff\1\114\12\uffff\1\113",
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
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_53 | KEYWORD_52 | KEYWORD_49 | KEYWORD_50 | KEYWORD_51 | KEYWORD_46 | KEYWORD_47 | KEYWORD_48 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_43 | KEYWORD_44 | KEYWORD_45 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | RULE_DIGIT | RULE_XDIGIT | RULE_ALPHA | RULE_WSP );";
        }
    }
 

}