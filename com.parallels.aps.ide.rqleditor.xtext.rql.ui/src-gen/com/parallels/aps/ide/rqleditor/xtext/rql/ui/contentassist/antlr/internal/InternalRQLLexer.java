package com.parallels.aps.ide.rqleditor.xtext.rql.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRQLLexer extends Lexer {
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

    public InternalRQLLexer() {;} 
    public InternalRQLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalRQLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:11:6: ( ',' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:11:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:12:6: ( '&' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:12:8: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:13:7: ( ';' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:14:7: ( '|' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:14:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:15:7: ( '=ne=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:15:9: '=ne='
            {
            match("=ne="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:16:7: ( '=eq=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:16:9: '=eq='
            {
            match("=eq="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:17:7: ( '=lt=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:17:9: '=lt='
            {
            match("=lt="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:18:7: ( '=le=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:18:9: '=le='
            {
            match("=le="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:19:7: ( '=gt=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:19:9: '=gt='
            {
            match("=gt="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:20:7: ( '=ge=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:20:9: '=ge='
            {
            match("=ge="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:21:7: ( '=like=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:21:9: '=like='
            {
            match("=like="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:22:7: ( 'ne' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:22:9: 'ne'
            {
            match("ne"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:23:7: ( 'eq' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:23:9: 'eq'
            {
            match("eq"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:24:7: ( 'lt' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:24:9: 'lt'
            {
            match("lt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:25:7: ( 'le' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:25:9: 'le'
            {
            match("le"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:26:7: ( 'gt' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:26:9: 'gt'
            {
            match("gt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:27:7: ( 'ge' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:27:9: 'ge'
            {
            match("ge"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:28:7: ( 'like' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:28:9: 'like'
            {
            match("like"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:29:7: ( '!=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:29:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:30:7: ( '=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:30:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:31:7: ( '<' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:31:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:32:7: ( '<=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:32:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:33:7: ( '>' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:33:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:34:7: ( '>=' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:34:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:35:7: ( 'select' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:35:9: 'select'
            {
            match("select"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:36:7: ( 'sort' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:36:9: 'sort'
            {
            match("sort"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:37:7: ( 'limit' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:37:9: 'limit'
            {
            match("limit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:38:7: ( 'implementing' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:38:9: 'implementing'
            {
            match("implementing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:39:7: ( 'composing' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:39:9: 'composing'
            {
            match("composing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:40:7: ( 'isnull' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:40:9: 'isnull'
            {
            match("isnull"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:41:7: ( 'in' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:41:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:42:7: ( 'out' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:42:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:43:7: ( 'true' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:43:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:44:7: ( 'false' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:44:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:45:7: ( 'empty' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:45:9: 'empty'
            {
            match("empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:46:7: ( 'null' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:46:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:47:7: ( '-' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:47:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:48:7: ( '.' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:48:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:49:7: ( '_' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:49:9: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:50:7: ( '~' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:50:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:51:7: ( '$' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:51:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:52:7: ( ':' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:52:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:53:7: ( '*' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:53:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:54:7: ( '+' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:54:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:55:7: ( '?' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:55:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:56:7: ( '/' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:56:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:57:7: ( '@' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:57:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:58:7: ( 'or' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:58:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:59:7: ( 'and' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:59:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:60:7: ( 'not' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:60:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:61:7: ( '\\r' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:61:9: '\\r'
            {
            match('\r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:62:7: ( '\\n' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:62:9: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:63:7: ( '(' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:63:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:64:7: ( ')' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:64:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:65:7: ( '%' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:65:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            int _type = RULE_DIGIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3473:12: ( '0' .. '9' )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3473:14: '0' .. '9'
            {
            matchRange('0','9'); 

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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3475:13: ( ( RULE_DIGIT | 'A' .. 'F' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3475:15: ( RULE_DIGIT | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                input.consume();

            }
            else {
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3477:12: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3477:14: ( 'A' .. 'Z' | 'a' .. 'z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
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
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3479:10: ( ( ' ' | '\\t' ) )
            // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:3479:12: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
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
        // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | RULE_DIGIT | RULE_XDIGIT | RULE_ALPHA | RULE_WSP )
        int alt1=59;
        alt1 = dfa1.predict(input);
        switch (alt1) {
            case 1 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:10: T__8
                {
                mT__8(); 

                }
                break;
            case 2 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:15: T__9
                {
                mT__9(); 

                }
                break;
            case 3 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:20: T__10
                {
                mT__10(); 

                }
                break;
            case 4 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:26: T__11
                {
                mT__11(); 

                }
                break;
            case 5 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:32: T__12
                {
                mT__12(); 

                }
                break;
            case 6 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:38: T__13
                {
                mT__13(); 

                }
                break;
            case 7 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:44: T__14
                {
                mT__14(); 

                }
                break;
            case 8 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:50: T__15
                {
                mT__15(); 

                }
                break;
            case 9 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:56: T__16
                {
                mT__16(); 

                }
                break;
            case 10 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:62: T__17
                {
                mT__17(); 

                }
                break;
            case 11 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:68: T__18
                {
                mT__18(); 

                }
                break;
            case 12 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:74: T__19
                {
                mT__19(); 

                }
                break;
            case 13 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:80: T__20
                {
                mT__20(); 

                }
                break;
            case 14 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:86: T__21
                {
                mT__21(); 

                }
                break;
            case 15 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:92: T__22
                {
                mT__22(); 

                }
                break;
            case 16 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:98: T__23
                {
                mT__23(); 

                }
                break;
            case 17 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:104: T__24
                {
                mT__24(); 

                }
                break;
            case 18 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:110: T__25
                {
                mT__25(); 

                }
                break;
            case 19 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:116: T__26
                {
                mT__26(); 

                }
                break;
            case 20 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:122: T__27
                {
                mT__27(); 

                }
                break;
            case 21 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:128: T__28
                {
                mT__28(); 

                }
                break;
            case 22 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:134: T__29
                {
                mT__29(); 

                }
                break;
            case 23 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:140: T__30
                {
                mT__30(); 

                }
                break;
            case 24 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:146: T__31
                {
                mT__31(); 

                }
                break;
            case 25 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:152: T__32
                {
                mT__32(); 

                }
                break;
            case 26 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:158: T__33
                {
                mT__33(); 

                }
                break;
            case 27 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:164: T__34
                {
                mT__34(); 

                }
                break;
            case 28 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:170: T__35
                {
                mT__35(); 

                }
                break;
            case 29 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:176: T__36
                {
                mT__36(); 

                }
                break;
            case 30 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:182: T__37
                {
                mT__37(); 

                }
                break;
            case 31 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:188: T__38
                {
                mT__38(); 

                }
                break;
            case 32 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:194: T__39
                {
                mT__39(); 

                }
                break;
            case 33 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:200: T__40
                {
                mT__40(); 

                }
                break;
            case 34 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:206: T__41
                {
                mT__41(); 

                }
                break;
            case 35 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:212: T__42
                {
                mT__42(); 

                }
                break;
            case 36 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:218: T__43
                {
                mT__43(); 

                }
                break;
            case 37 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:224: T__44
                {
                mT__44(); 

                }
                break;
            case 38 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:230: T__45
                {
                mT__45(); 

                }
                break;
            case 39 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:236: T__46
                {
                mT__46(); 

                }
                break;
            case 40 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:242: T__47
                {
                mT__47(); 

                }
                break;
            case 41 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:248: T__48
                {
                mT__48(); 

                }
                break;
            case 42 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:254: T__49
                {
                mT__49(); 

                }
                break;
            case 43 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:260: T__50
                {
                mT__50(); 

                }
                break;
            case 44 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:266: T__51
                {
                mT__51(); 

                }
                break;
            case 45 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:272: T__52
                {
                mT__52(); 

                }
                break;
            case 46 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:278: T__53
                {
                mT__53(); 

                }
                break;
            case 47 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:284: T__54
                {
                mT__54(); 

                }
                break;
            case 48 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:290: T__55
                {
                mT__55(); 

                }
                break;
            case 49 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:296: T__56
                {
                mT__56(); 

                }
                break;
            case 50 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:302: T__57
                {
                mT__57(); 

                }
                break;
            case 51 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:308: T__58
                {
                mT__58(); 

                }
                break;
            case 52 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:314: T__59
                {
                mT__59(); 

                }
                break;
            case 53 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:320: T__60
                {
                mT__60(); 

                }
                break;
            case 54 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:326: T__61
                {
                mT__61(); 

                }
                break;
            case 55 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:332: T__62
                {
                mT__62(); 

                }
                break;
            case 56 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:338: RULE_DIGIT
                {
                mRULE_DIGIT(); 

                }
                break;
            case 57 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:349: RULE_XDIGIT
                {
                mRULE_XDIGIT(); 

                }
                break;
            case 58 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:361: RULE_ALPHA
                {
                mRULE_ALPHA(); 

                }
                break;
            case 59 :
                // ../com.parallels.aps.ide.rqleditor.xtext.rql.ui/src-gen/com/parallels/aps/ide/rqleditor/xtext/rql/ui/contentassist/antlr/internal/InternalRQL.g:1:372: RULE_WSP
                {
                mRULE_WSP(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\5\uffff\1\54\4\46\1\uffff\1\70\1\72\6\46\13\uffff\1\46\60\uffff";
    static final String DFA1_eofS =
        "\117\uffff";
    static final String DFA1_minS =
        "\1\11\4\uffff\2\145\1\155\2\145\1\uffff\2\75\1\145\1\155\1\157"+
        "\2\162\1\141\13\uffff\1\156\13\uffff\2\145\10\uffff\1\153\32\uffff";
    static final String DFA1_maxS =
        "\1\176\4\uffff\1\156\1\165\1\161\2\164\1\uffff\2\75\1\157\1\163"+
        "\1\157\1\165\1\162\1\141\13\uffff\1\156\13\uffff\2\164\10\uffff"+
        "\1\155\32\uffff";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\5\uffff\1\23\10\uffff\1\45\1\46\1\47\1"+
        "\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\uffff\1\63\1\64\1\65\1"+
        "\66\1\67\1\70\1\71\1\72\1\73\1\5\1\6\2\uffff\1\24\1\14\1\44\1\62"+
        "\1\15\1\43\1\16\1\17\1\uffff\1\20\1\21\1\26\1\25\1\30\1\27\1\31"+
        "\1\32\1\34\1\36\1\37\1\35\1\40\1\60\1\41\1\42\1\61\1\70\1\71\1\7"+
        "\1\10\1\13\1\11\1\12\1\22\1\33";
    static final String DFA1_specialS =
        "\117\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\47\1\40\2\uffff\1\37\22\uffff\1\47\1\12\2\uffff\1\27\1\43"+
            "\1\2\1\uffff\1\41\1\42\1\31\1\32\1\1\1\23\1\24\1\34\12\44\1"+
            "\30\1\3\1\13\1\5\1\14\1\33\1\35\6\45\24\46\4\uffff\1\25\1\uffff"+
            "\1\36\1\46\1\17\1\46\1\7\1\22\1\11\1\46\1\16\2\46\1\10\1\46"+
            "\1\6\1\20\3\46\1\15\1\21\6\46\1\uffff\1\4\1\uffff\1\26",
            "",
            "",
            "",
            "",
            "\1\51\1\uffff\1\53\4\uffff\1\52\1\uffff\1\50",
            "\1\55\11\uffff\1\57\5\uffff\1\56",
            "\1\61\3\uffff\1\60",
            "\1\63\3\uffff\1\64\12\uffff\1\62",
            "\1\66\16\uffff\1\65",
            "",
            "\1\67",
            "\1\71",
            "\1\73\11\uffff\1\74",
            "\1\75\1\77\4\uffff\1\76",
            "\1\100",
            "\1\102\2\uffff\1\101",
            "\1\103",
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
            "\1\105",
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
            "\1\111\3\uffff\1\112\12\uffff\1\110",
            "\1\114\16\uffff\1\113",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\115\1\uffff\1\116",
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
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | RULE_DIGIT | RULE_XDIGIT | RULE_ALPHA | RULE_WSP );";
        }
    }
 

}