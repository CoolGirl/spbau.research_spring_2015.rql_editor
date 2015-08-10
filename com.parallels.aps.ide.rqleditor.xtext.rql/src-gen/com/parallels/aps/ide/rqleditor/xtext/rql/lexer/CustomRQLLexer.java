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
    public static final int KEYWORD_3=31;
    public static final int KEYWORD_2=30;
    public static final int KEYWORD_5=33;
    public static final int KEYWORD_4=32;
    public static final int KEYWORD_1=29;
    public static final int RULE_WSP=53;
    public static final int KEYWORD_29=25;
    public static final int KEYWORD_28=24;
    public static final int KEYWORD_27=23;
    public static final int KEYWORD_26=22;
    public static final int KEYWORD_25=21;
    public static final int KEYWORD_24=20;
    public static final int KEYWORD_23=19;
    public static final int KEYWORD_22=18;
    public static final int KEYWORD_21=49;
    public static final int KEYWORD_20=48;
    public static final int RULE_DIGIT=50;
    public static final int KEYWORD_19=47;
    public static final int KEYWORD_18=46;
    public static final int KEYWORD_17=45;
    public static final int KEYWORD_16=44;
    public static final int KEYWORD_15=43;
    public static final int KEYWORD_14=42;
    public static final int KEYWORD_13=41;
    public static final int KEYWORD_12=40;
    public static final int KEYWORD_11=39;
    public static final int KEYWORD_10=38;
    public static final int RULE_ALPHA=52;
    public static final int KEYWORD_46=4;
    public static final int KEYWORD_45=5;
    public static final int KEYWORD_44=7;
    public static final int KEYWORD_43=6;
    public static final int KEYWORD_42=10;
    public static final int KEYWORD_41=9;
    public static final int EOF=-1;
    public static final int KEYWORD_40=8;
    public static final int KEYWORD_39=14;
    public static final int KEYWORD_38=13;
    public static final int KEYWORD_37=12;
    public static final int KEYWORD_36=11;
    public static final int KEYWORD_35=17;
    public static final int KEYWORD_34=16;
    public static final int RULE_XDIGIT=51;
    public static final int KEYWORD_33=15;
    public static final int KEYWORD_32=28;
    public static final int KEYWORD_31=27;
    public static final int KEYWORD_30=26;
    public static final int KEYWORD_7=35;
    public static final int KEYWORD_6=34;
    public static final int KEYWORD_9=37;
    public static final int KEYWORD_8=36;

    	private boolean logicalOpEnabled = false;


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

    // $ANTLR start "KEYWORD_46"
    public final void mKEYWORD_46() throws RecognitionException {
        try {
            int _type = KEYWORD_46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:22:12: ( 'implementing' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:22:14: 'implementing'
            {
            match("implementing"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_46"

    // $ANTLR start "KEYWORD_45"
    public final void mKEYWORD_45() throws RecognitionException {
        try {
            int _type = KEYWORD_45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:24:12: ( 'composing' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:24:14: 'composing'
            {
            match("composing"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_45"

    // $ANTLR start "KEYWORD_43"
    public final void mKEYWORD_43() throws RecognitionException {
        try {
            int _type = KEYWORD_43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:26:12: ( 'isnull' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:26:14: 'isnull'
            {
            match("isnull"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:28:12: ( 'select' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:28:14: 'select'
            {
            match("select"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_44"

    // $ANTLR start "KEYWORD_40"
    public final void mKEYWORD_40() throws RecognitionException {
        try {
            int _type = KEYWORD_40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:30:12: ( 'empty' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:30:14: 'empty'
            {
            match("empty"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:32:12: ( 'false' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:32:14: 'false'
            {
            match("false"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:34:12: ( 'limit' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:34:14: 'limit'
            {
            match("limit"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_42"

    // $ANTLR start "KEYWORD_36"
    public final void mKEYWORD_36() throws RecognitionException {
        try {
            int _type = KEYWORD_36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:36:12: ( 'like' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:36:14: 'like'
            {
            match("like"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:38:12: ( 'null' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:38:14: 'null'
            {
            match("null"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:40:12: ( 'sort' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:40:14: 'sort'
            {
            match("sort"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:42:12: ( 'true' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:42:14: 'true'
            {
            match("true"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEYWORD_39"

    // $ANTLR start "KEYWORD_33"
    public final void mKEYWORD_33() throws RecognitionException {
        try {
            int _type = KEYWORD_33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:44:12: ({...}? => ( ( 'and' ( RULE_WSP )* '(' )=> 'and' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:44:14: {...}? => ( ( 'and' ( RULE_WSP )* '(' )=> 'and' )
            {
            if ( !((logicalOpEnabled)) ) {
                if (state.backtracking>0) {state.failed=true; return ;}
                throw new FailedPredicateException(input, "KEYWORD_33", "logicalOpEnabled");
            }
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:44:36: ( ( 'and' ( RULE_WSP )* '(' )=> 'and' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:44:38: ( 'and' ( RULE_WSP )* '(' )=> 'and'
            {
            match("and"); if (state.failed) return ;


            }


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:46:12: ( 'not' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:46:14: 'not'
            {
            match("not"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:48:12: ( 'out' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:48:14: 'out'
            {
            match("out"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:50:12: ( '!=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:50:14: '!='
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:52:12: ( '<=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:52:14: '<='
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:54:12: ( '>=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:54:14: '>='
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:56:12: ( 'eq' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:56:14: 'eq'
            {
            match("eq"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:58:12: ( 'ge' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:58:14: 'ge'
            {
            match("ge"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:60:12: ( 'gt' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:60:14: 'gt'
            {
            match("gt"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:62:12: ( 'in' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:62:14: 'in'
            {
            match("in"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:64:12: ( 'le' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:64:14: 'le'
            {
            match("le"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:66:12: ( 'lt' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:66:14: 'lt'
            {
            match("lt"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:68:12: ( 'ne' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:68:14: 'ne'
            {
            match("ne"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:70:12: ( 'or' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:70:14: 'or'
            {
            match("or"); if (state.failed) return ;


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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:72:11: ( '$' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:72:13: '$'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:74:11: ( '%' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:74:13: '%'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:76:11: ( '&' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:76:13: '&'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:78:11: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:78:13: '('
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:80:11: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:80:13: ')'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:82:11: ( '*' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:82:13: '*'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:84:11: ( '+' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:84:13: '+'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:86:11: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:86:13: ','
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:88:11: ( '-' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:88:13: '-'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:90:12: ( '.' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:90:14: '.'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:92:12: ( '/' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:92:14: '/'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:94:12: ( ':' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:94:14: ':'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:96:12: ( ';' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:96:14: ';'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:98:12: ( '<' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:98:14: '<'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:100:12: ( '=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:100:14: '='
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:102:12: ( '>' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:102:14: '>'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:104:12: ( '?' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:104:14: '?'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:106:12: ( '@' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:106:14: '@'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:108:12: ( '_' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:108:14: '_'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:110:12: ( '|' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:110:14: '|'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:112:12: ( '~' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:112:14: '~'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:116:12: ( '0' .. '9' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:116:14: '0' .. '9'
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:118:13: ( ( RULE_DIGIT | 'A' .. 'F' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:118:15: ( RULE_DIGIT | 'A' .. 'F' )
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:120:12: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:120:14: ( 'A' .. 'Z' | 'a' .. 'z' )
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:122:10: ( ( ' ' | '\\t' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:122:12: ( ' ' | '\\t' )
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
        // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:8: ( KEYWORD_46 | KEYWORD_45 | KEYWORD_43 | KEYWORD_44 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | RULE_DIGIT | RULE_XDIGIT | RULE_ALPHA | RULE_WSP )
        int alt1=50;
        alt1 = dfa1.predict(input);
        switch (alt1) {
            case 1 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:10: KEYWORD_46
                {
                mKEYWORD_46(); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:21: KEYWORD_45
                {
                mKEYWORD_45(); if (state.failed) return ;

                }
                break;
            case 3 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:32: KEYWORD_43
                {
                mKEYWORD_43(); if (state.failed) return ;

                }
                break;
            case 4 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:43: KEYWORD_44
                {
                mKEYWORD_44(); if (state.failed) return ;

                }
                break;
            case 5 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:54: KEYWORD_40
                {
                mKEYWORD_40(); if (state.failed) return ;

                }
                break;
            case 6 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:65: KEYWORD_41
                {
                mKEYWORD_41(); if (state.failed) return ;

                }
                break;
            case 7 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:76: KEYWORD_42
                {
                mKEYWORD_42(); if (state.failed) return ;

                }
                break;
            case 8 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:87: KEYWORD_36
                {
                mKEYWORD_36(); if (state.failed) return ;

                }
                break;
            case 9 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:98: KEYWORD_37
                {
                mKEYWORD_37(); if (state.failed) return ;

                }
                break;
            case 10 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:109: KEYWORD_38
                {
                mKEYWORD_38(); if (state.failed) return ;

                }
                break;
            case 11 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:120: KEYWORD_39
                {
                mKEYWORD_39(); if (state.failed) return ;

                }
                break;
            case 12 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:131: KEYWORD_33
                {
                mKEYWORD_33(); if (state.failed) return ;

                }
                break;
            case 13 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:142: KEYWORD_34
                {
                mKEYWORD_34(); if (state.failed) return ;

                }
                break;
            case 14 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:153: KEYWORD_35
                {
                mKEYWORD_35(); if (state.failed) return ;

                }
                break;
            case 15 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:164: KEYWORD_22
                {
                mKEYWORD_22(); if (state.failed) return ;

                }
                break;
            case 16 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:175: KEYWORD_23
                {
                mKEYWORD_23(); if (state.failed) return ;

                }
                break;
            case 17 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:186: KEYWORD_24
                {
                mKEYWORD_24(); if (state.failed) return ;

                }
                break;
            case 18 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:197: KEYWORD_25
                {
                mKEYWORD_25(); if (state.failed) return ;

                }
                break;
            case 19 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:208: KEYWORD_26
                {
                mKEYWORD_26(); if (state.failed) return ;

                }
                break;
            case 20 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:219: KEYWORD_27
                {
                mKEYWORD_27(); if (state.failed) return ;

                }
                break;
            case 21 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:230: KEYWORD_28
                {
                mKEYWORD_28(); if (state.failed) return ;

                }
                break;
            case 22 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:241: KEYWORD_29
                {
                mKEYWORD_29(); if (state.failed) return ;

                }
                break;
            case 23 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:252: KEYWORD_30
                {
                mKEYWORD_30(); if (state.failed) return ;

                }
                break;
            case 24 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:263: KEYWORD_31
                {
                mKEYWORD_31(); if (state.failed) return ;

                }
                break;
            case 25 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:274: KEYWORD_32
                {
                mKEYWORD_32(); if (state.failed) return ;

                }
                break;
            case 26 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:285: KEYWORD_1
                {
                mKEYWORD_1(); if (state.failed) return ;

                }
                break;
            case 27 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:295: KEYWORD_2
                {
                mKEYWORD_2(); if (state.failed) return ;

                }
                break;
            case 28 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:305: KEYWORD_3
                {
                mKEYWORD_3(); if (state.failed) return ;

                }
                break;
            case 29 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:315: KEYWORD_4
                {
                mKEYWORD_4(); if (state.failed) return ;

                }
                break;
            case 30 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:325: KEYWORD_5
                {
                mKEYWORD_5(); if (state.failed) return ;

                }
                break;
            case 31 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:335: KEYWORD_6
                {
                mKEYWORD_6(); if (state.failed) return ;

                }
                break;
            case 32 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:345: KEYWORD_7
                {
                mKEYWORD_7(); if (state.failed) return ;

                }
                break;
            case 33 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:355: KEYWORD_8
                {
                mKEYWORD_8(); if (state.failed) return ;

                }
                break;
            case 34 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:365: KEYWORD_9
                {
                mKEYWORD_9(); if (state.failed) return ;

                }
                break;
            case 35 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:375: KEYWORD_10
                {
                mKEYWORD_10(); if (state.failed) return ;

                }
                break;
            case 36 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:386: KEYWORD_11
                {
                mKEYWORD_11(); if (state.failed) return ;

                }
                break;
            case 37 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:397: KEYWORD_12
                {
                mKEYWORD_12(); if (state.failed) return ;

                }
                break;
            case 38 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:408: KEYWORD_13
                {
                mKEYWORD_13(); if (state.failed) return ;

                }
                break;
            case 39 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:419: KEYWORD_14
                {
                mKEYWORD_14(); if (state.failed) return ;

                }
                break;
            case 40 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:430: KEYWORD_15
                {
                mKEYWORD_15(); if (state.failed) return ;

                }
                break;
            case 41 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:441: KEYWORD_16
                {
                mKEYWORD_16(); if (state.failed) return ;

                }
                break;
            case 42 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:452: KEYWORD_17
                {
                mKEYWORD_17(); if (state.failed) return ;

                }
                break;
            case 43 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:463: KEYWORD_18
                {
                mKEYWORD_18(); if (state.failed) return ;

                }
                break;
            case 44 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:474: KEYWORD_19
                {
                mKEYWORD_19(); if (state.failed) return ;

                }
                break;
            case 45 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:485: KEYWORD_20
                {
                mKEYWORD_20(); if (state.failed) return ;

                }
                break;
            case 46 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:496: KEYWORD_21
                {
                mKEYWORD_21(); if (state.failed) return ;

                }
                break;
            case 47 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:507: RULE_DIGIT
                {
                mRULE_DIGIT(); if (state.failed) return ;

                }
                break;
            case 48 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:518: RULE_XDIGIT
                {
                mRULE_XDIGIT(); if (state.failed) return ;

                }
                break;
            case 49 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:530: RULE_ALPHA
                {
                mRULE_ALPHA(); if (state.failed) return ;

                }
                break;
            case 50 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql/src/com/parallels/aps/ide/rqleditor/xtext/rql/lexer/CustomRQLLexer.g:1:541: RULE_WSP
                {
                mRULE_WSP(); if (state.failed) return ;

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\1\uffff\12\44\1\uffff\1\72\1\74\1\44\64\uffff";
    static final String DFA1_eofS =
        "\103\uffff";
    static final String DFA1_minS =
        "\1\11\1\155\1\157\1\145\1\155\1\141\2\145\1\162\1\156\1\162\1\uffff"+
        "\2\75\1\145\40\uffff\1\153\23\uffff";
    static final String DFA1_maxS =
        "\1\176\1\163\2\157\1\161\1\141\1\164\1\165\1\162\1\156\1\165\1"+
        "\uffff\2\75\1\164\40\uffff\1\155\23\uffff";
    static final String DFA1_acceptS =
        "\13\uffff\1\17\3\uffff\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
        "\1\42\1\43\1\44\1\45\1\46\1\50\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
        "\1\61\1\62\1\1\1\3\1\25\1\2\1\4\1\12\1\5\1\22\1\6\1\uffff\1\26\1"+
        "\27\1\11\1\15\1\30\1\13\1\14\1\16\1\31\1\20\1\47\1\21\1\51\1\23"+
        "\1\24\1\57\1\60\1\7\1\10";
    static final String DFA1_specialS =
        "\11\uffff\1\0\71\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\45\26\uffff\1\45\1\13\2\uffff\1\17\1\20\1\21\1\uffff\1\22"+
            "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\12\42\1\32\1\33\1\14\1\34"+
            "\1\15\1\35\1\36\6\43\24\44\4\uffff\1\37\1\uffff\1\11\1\44\1"+
            "\2\1\44\1\4\1\5\1\16\1\44\1\1\2\44\1\6\1\44\1\7\1\12\3\44\1"+
            "\3\1\10\6\44\1\uffff\1\40\1\uffff\1\41",
            "\1\46\1\50\4\uffff\1\47",
            "\1\51",
            "\1\52\11\uffff\1\53",
            "\1\54\3\uffff\1\55",
            "\1\56",
            "\1\60\3\uffff\1\57\12\uffff\1\61",
            "\1\64\11\uffff\1\63\5\uffff\1\62",
            "\1\65",
            "\1\66",
            "\1\70\2\uffff\1\67",
            "",
            "\1\71",
            "\1\73",
            "\1\75\16\uffff\1\76",
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
            "",
            "",
            "",
            "",
            "",
            "\1\102\1\uffff\1\101",
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

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KEYWORD_46 | KEYWORD_45 | KEYWORD_43 | KEYWORD_44 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | RULE_DIGIT | RULE_XDIGIT | RULE_ALPHA | RULE_WSP );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA1_9 = input.LA(1);

                         
                        int index1_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA1_9=='n') && ((logicalOpEnabled))) {s = 54;}

                        else s = 36;

                         
                        input.seek(index1_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 1, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}