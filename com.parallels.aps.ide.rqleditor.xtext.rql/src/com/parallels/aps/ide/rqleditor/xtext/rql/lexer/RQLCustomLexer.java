// $ANTLR 3.5.1 F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g 2015-08-18 18:33:05

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
public class RQLCustomLexer extends Lexer {
	public static final int EOF=-1;
	public static final int KEYWORD_1=4;
	public static final int KEYWORD_10=5;
	public static final int KEYWORD_11=6;
	public static final int KEYWORD_12=7;
	public static final int KEYWORD_13=8;
	public static final int KEYWORD_14=9;
	public static final int KEYWORD_15=10;
	public static final int KEYWORD_16=11;
	public static final int KEYWORD_17=12;
	public static final int KEYWORD_18=13;
	public static final int KEYWORD_19=14;
	public static final int KEYWORD_2=15;
	public static final int KEYWORD_20=16;
	public static final int KEYWORD_21=17;
	public static final int KEYWORD_22=18;
	public static final int KEYWORD_23=19;
	public static final int KEYWORD_24=20;
	public static final int KEYWORD_25=21;
	public static final int KEYWORD_26=22;
	public static final int KEYWORD_27=23;
	public static final int KEYWORD_28=24;
	public static final int KEYWORD_29=25;
	public static final int KEYWORD_3=26;
	public static final int KEYWORD_30=27;
	public static final int KEYWORD_31=28;
	public static final int KEYWORD_32=29;
	public static final int KEYWORD_33=30;
	public static final int KEYWORD_34=31;
	public static final int KEYWORD_35=32;
	public static final int KEYWORD_36=33;
	public static final int KEYWORD_37=34;
	public static final int KEYWORD_38=35;
	public static final int KEYWORD_39=36;
	public static final int KEYWORD_4=37;
	public static final int KEYWORD_40=38;
	public static final int KEYWORD_41=39;
	public static final int KEYWORD_42=40;
	public static final int KEYWORD_43=41;
	public static final int KEYWORD_44=42;
	public static final int KEYWORD_45=43;
	public static final int KEYWORD_46=44;
	public static final int KEYWORD_5=45;
	public static final int KEYWORD_6=46;
	public static final int KEYWORD_7=47;
	public static final int KEYWORD_8=48;
	public static final int KEYWORD_9=49;
	public static final int RULE_ALPHA=50;
	public static final int RULE_DIGIT=51;
	public static final int RULE_WSP=52;
	public static final int RULE_XDIGIT=53;

		private boolean enabled = false;
		private boolean alreadyWereEnabled = false;


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public RQLCustomLexer() {} 
	public RQLCustomLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public RQLCustomLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g"; }

	// $ANTLR start "KEYWORD_46"
	public final void mKEYWORD_46() throws RecognitionException {
		try {
			int _type = KEYWORD_46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:23:12: ( 'implementing' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:23:14: 'implementing'
			{
			if ( state.backtracking==0 ) {alreadyWereEnabled = alreadyWereEnabled && !enabled || 
			!alreadyWereEnabled && enabled; enabled = alreadyWereEnabled;}
			match("implementing"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_46"

	// $ANTLR start "KEYWORD_45"
	public final void mKEYWORD_45() throws RecognitionException {
		try {
			int _type = KEYWORD_45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:26:12: ( 'composing' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:26:14: 'composing'
			{
			match("composing"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_45"

	// $ANTLR start "KEYWORD_43"
	public final void mKEYWORD_43() throws RecognitionException {
		try {
			int _type = KEYWORD_43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:28:12: ( 'isnull' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:28:14: 'isnull'
			{
			match("isnull"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_43"

	// $ANTLR start "KEYWORD_44"
	public final void mKEYWORD_44() throws RecognitionException {
		try {
			int _type = KEYWORD_44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:30:12: ( 'select' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:30:14: 'select'
			{
			match("select"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_44"

	// $ANTLR start "KEYWORD_40"
	public final void mKEYWORD_40() throws RecognitionException {
		try {
			int _type = KEYWORD_40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:32:12: ( 'empty' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:32:14: 'empty'
			{
			match("empty"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_40"

	// $ANTLR start "KEYWORD_41"
	public final void mKEYWORD_41() throws RecognitionException {
		try {
			int _type = KEYWORD_41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:34:12: ( 'false' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:34:14: 'false'
			{
			match("false"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_41"

	// $ANTLR start "KEYWORD_42"
	public final void mKEYWORD_42() throws RecognitionException {
		try {
			int _type = KEYWORD_42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:36:12: ( 'limit' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:36:14: 'limit'
			{
			match("limit"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_42"

	// $ANTLR start "KEYWORD_36"
	public final void mKEYWORD_36() throws RecognitionException {
		try {
			int _type = KEYWORD_36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:12: ( ( ( ( 'like(' )=> 'like' ) | ({...}? => ( ( 'like=' )=> 'like' ) ) | ( 'l' )=> 'l' ) )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:14: ( ( ( 'like(' )=> 'like' ) | ({...}? => ( ( 'like=' )=> 'like' ) ) | ( 'l' )=> 'l' )
			{
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:14: ( ( ( 'like(' )=> 'like' ) | ({...}? => ( ( 'like=' )=> 'like' ) ) | ( 'l' )=> 'l' )
			int alt1=3;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='l') && ((enabled))) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='i') && ((enabled))) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2=='k') && ((enabled))) {
						int LA1_4 = input.LA(4);
						if ( (LA1_4=='e') && ((enabled))) {
							int LA1_5 = input.LA(5);
							if ( (synpred1_RQLCustomLexer()) ) {
								alt1=1;
							}
							else if ( ((enabled)) ) {
								alt1=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 1, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

					}

				}

			}

			switch (alt1) {
				case 1 :
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:15: ( ( 'like(' )=> 'like' )
					{
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:15: ( ( 'like(' )=> 'like' )
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:16: ( 'like(' )=> 'like'
					{
					match("like"); if (state.failed) return;

					}

					}
					break;
				case 2 :
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:37: ({...}? => ( ( 'like=' )=> 'like' ) )
					{
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:37: ({...}? => ( ( 'like=' )=> 'like' ) )
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:38: {...}? => ( ( 'like=' )=> 'like' )
					{
					if ( !((enabled)) ) {
						if (state.backtracking>0) {state.failed=true; return;}
						throw new FailedPredicateException(input, "KEYWORD_36", "enabled");
					}
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:52: ( ( 'like=' )=> 'like' )
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:54: ( 'like=' )=> 'like'
					{
					match("like"); if (state.failed) return;

					}

					}

					}
					break;
				case 3 :
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:78: ( 'l' )=> 'l'
					{
					match('l'); if (state.failed) return;
					if ( state.backtracking==0 ) {_type = RULE_ALPHA;}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_36"

	// $ANTLR start "KEYWORD_37"
	public final void mKEYWORD_37() throws RecognitionException {
		try {
			int _type = KEYWORD_37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:40:12: ( 'null' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:40:14: 'null'
			{
			match("null"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_37"

	// $ANTLR start "KEYWORD_38"
	public final void mKEYWORD_38() throws RecognitionException {
		try {
			int _type = KEYWORD_38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:42:12: ( 'sort' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:42:14: 'sort'
			{
			match("sort"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_38"

	// $ANTLR start "KEYWORD_39"
	public final void mKEYWORD_39() throws RecognitionException {
		try {
			int _type = KEYWORD_39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:44:12: ( 'true' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:44:14: 'true'
			{
			match("true"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_39"

	// $ANTLR start "KEYWORD_33"
	public final void mKEYWORD_33() throws RecognitionException {
		try {
			int _type = KEYWORD_33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:46:12: ( ( ( ( 'and(' )=> 'and' ) | ( 'a' )=> 'a' ) )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:46:14: ( ( ( 'and(' )=> 'and' ) | ( 'a' )=> 'a' )
			{
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:46:14: ( ( ( 'and(' )=> 'and' ) | ( 'a' )=> 'a' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='a') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='n') && (synpred4_RQLCustomLexer())) {
					alt2=1;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:46:15: ( ( 'and(' )=> 'and' )
					{
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:46:15: ( ( 'and(' )=> 'and' )
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:46:16: ( 'and(' )=> 'and'
					{
					match("and"); if (state.failed) return;

					}

					}
					break;
				case 2 :
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:46:35: ( 'a' )=> 'a'
					{
					match('a'); if (state.failed) return;
					if ( state.backtracking==0 ) {_type = RULE_ALPHA;}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_33"

	// $ANTLR start "KEYWORD_34"
	public final void mKEYWORD_34() throws RecognitionException {
		try {
			int _type = KEYWORD_34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:48:12: ( ( ( ( 'not(' )=> 'not' ) | ( 'n' )=> 'n' ) )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:48:14: ( ( ( 'not(' )=> 'not' ) | ( 'n' )=> 'n' )
			{
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:48:14: ( ( ( 'not(' )=> 'not' ) | ( 'n' )=> 'n' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='n') ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='o') && (synpred6_RQLCustomLexer())) {
					alt3=1;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:48:15: ( ( 'not(' )=> 'not' )
					{
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:48:15: ( ( 'not(' )=> 'not' )
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:48:16: ( 'not(' )=> 'not'
					{
					match("not"); if (state.failed) return;

					}

					}
					break;
				case 2 :
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:48:35: ( 'n' )=> 'n'
					{
					match('n'); if (state.failed) return;
					if ( state.backtracking==0 ) {_type = RULE_ALPHA;}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_34"

	// $ANTLR start "KEYWORD_35"
	public final void mKEYWORD_35() throws RecognitionException {
		try {
			int _type = KEYWORD_35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:50:12: ( 'out' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:50:14: 'out'
			{
			match("out"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_35"

	// $ANTLR start "KEYWORD_22"
	public final void mKEYWORD_22() throws RecognitionException {
		try {
			int _type = KEYWORD_22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:52:12: ( '!=' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:52:14: '!='
			{
			match("!="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_22"

	// $ANTLR start "KEYWORD_23"
	public final void mKEYWORD_23() throws RecognitionException {
		try {
			int _type = KEYWORD_23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:54:12: ( '<=' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:54:14: '<='
			{
			match("<="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_23"

	// $ANTLR start "KEYWORD_24"
	public final void mKEYWORD_24() throws RecognitionException {
		try {
			int _type = KEYWORD_24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:56:12: ( '>=' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:56:14: '>='
			{
			match(">="); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_24"

	// $ANTLR start "KEYWORD_25"
	public final void mKEYWORD_25() throws RecognitionException {
		try {
			int _type = KEYWORD_25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:58:12: ( ( ( ( 'eq(' )=> 'eq' ) | ( 'e' )=> 'e' ) )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:58:14: ( ( ( 'eq(' )=> 'eq' ) | ( 'e' )=> 'e' )
			{
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:58:14: ( ( ( 'eq(' )=> 'eq' ) | ( 'e' )=> 'e' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='e') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='q') && (synpred8_RQLCustomLexer())) {
					alt4=1;
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:58:15: ( ( 'eq(' )=> 'eq' )
					{
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:58:15: ( ( 'eq(' )=> 'eq' )
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:58:16: ( 'eq(' )=> 'eq'
					{
					match("eq"); if (state.failed) return;

					}

					}
					break;
				case 2 :
					// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:58:33: ( 'e' )=> 'e'
					{
					match('e'); if (state.failed) return;
					if ( state.backtracking==0 ) {_type = RULE_ALPHA;}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_25"

	// $ANTLR start "KEYWORD_26"
	public final void mKEYWORD_26() throws RecognitionException {
		try {
			int _type = KEYWORD_26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:60:12: ( 'ge' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:60:14: 'ge'
			{
			match("ge"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_26"

	// $ANTLR start "KEYWORD_27"
	public final void mKEYWORD_27() throws RecognitionException {
		try {
			int _type = KEYWORD_27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:62:12: ( 'gt' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:62:14: 'gt'
			{
			match("gt"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_27"

	// $ANTLR start "KEYWORD_28"
	public final void mKEYWORD_28() throws RecognitionException {
		try {
			int _type = KEYWORD_28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:64:12: ( 'in' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:64:14: 'in'
			{
			match("in"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_28"

	// $ANTLR start "KEYWORD_29"
	public final void mKEYWORD_29() throws RecognitionException {
		try {
			int _type = KEYWORD_29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:66:12: ( 'le' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:66:14: 'le'
			{
			match("le"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_29"

	// $ANTLR start "KEYWORD_30"
	public final void mKEYWORD_30() throws RecognitionException {
		try {
			int _type = KEYWORD_30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:68:12: ( 'lt' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:68:14: 'lt'
			{
			match("lt"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_30"

	// $ANTLR start "KEYWORD_31"
	public final void mKEYWORD_31() throws RecognitionException {
		try {
			int _type = KEYWORD_31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:70:12: ( 'ne' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:70:14: 'ne'
			{
			match("ne"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_31"

	// $ANTLR start "KEYWORD_32"
	public final void mKEYWORD_32() throws RecognitionException {
		try {
			int _type = KEYWORD_32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:72:12: ( 'or' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:72:14: 'or'
			{
			match("or"); if (state.failed) return;

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_32"

	// $ANTLR start "KEYWORD_1"
	public final void mKEYWORD_1() throws RecognitionException {
		try {
			int _type = KEYWORD_1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:74:11: ( '$' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:74:13: '$'
			{
			match('$'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_1"

	// $ANTLR start "KEYWORD_2"
	public final void mKEYWORD_2() throws RecognitionException {
		try {
			int _type = KEYWORD_2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:76:11: ( '%' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:76:13: '%'
			{
			match('%'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_2"

	// $ANTLR start "KEYWORD_3"
	public final void mKEYWORD_3() throws RecognitionException {
		try {
			int _type = KEYWORD_3;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:78:11: ( '&' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:78:13: '&'
			{
			match('&'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_3"

	// $ANTLR start "KEYWORD_4"
	public final void mKEYWORD_4() throws RecognitionException {
		try {
			int _type = KEYWORD_4;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:80:11: ( '(' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:80:13: '('
			{
			match('('); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_4"

	// $ANTLR start "KEYWORD_5"
	public final void mKEYWORD_5() throws RecognitionException {
		try {
			int _type = KEYWORD_5;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:82:11: ( ')' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:82:13: ')'
			{
			match(')'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_5"

	// $ANTLR start "KEYWORD_6"
	public final void mKEYWORD_6() throws RecognitionException {
		try {
			int _type = KEYWORD_6;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:84:11: ( '*' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:84:13: '*'
			{
			match('*'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_6"

	// $ANTLR start "KEYWORD_7"
	public final void mKEYWORD_7() throws RecognitionException {
		try {
			int _type = KEYWORD_7;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:86:11: ( '+' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:86:13: '+'
			{
			match('+'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_7"

	// $ANTLR start "KEYWORD_8"
	public final void mKEYWORD_8() throws RecognitionException {
		try {
			int _type = KEYWORD_8;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:88:11: ( ',' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:88:13: ','
			{
			match(','); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_8"

	// $ANTLR start "KEYWORD_9"
	public final void mKEYWORD_9() throws RecognitionException {
		try {
			int _type = KEYWORD_9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:90:11: ( '-' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:90:13: '-'
			{
			match('-'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_9"

	// $ANTLR start "KEYWORD_10"
	public final void mKEYWORD_10() throws RecognitionException {
		try {
			int _type = KEYWORD_10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:92:12: ( '.' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:92:14: '.'
			{
			match('.'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_10"

	// $ANTLR start "KEYWORD_11"
	public final void mKEYWORD_11() throws RecognitionException {
		try {
			int _type = KEYWORD_11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:94:12: ( '/' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:94:14: '/'
			{
			match('/'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_11"

	// $ANTLR start "KEYWORD_12"
	public final void mKEYWORD_12() throws RecognitionException {
		try {
			int _type = KEYWORD_12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:96:12: ( ':' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:96:14: ':'
			{
			match(':'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_12"

	// $ANTLR start "KEYWORD_13"
	public final void mKEYWORD_13() throws RecognitionException {
		try {
			int _type = KEYWORD_13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:98:12: ( ';' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:98:14: ';'
			{
			match(';'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_13"

	// $ANTLR start "KEYWORD_14"
	public final void mKEYWORD_14() throws RecognitionException {
		try {
			int _type = KEYWORD_14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:100:12: ( '<' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:100:14: '<'
			{
			match('<'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_14"

	// $ANTLR start "KEYWORD_15"
	public final void mKEYWORD_15() throws RecognitionException {
		try {
			int _type = KEYWORD_15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:102:12: ( ( '=' )=> '=' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:102:14: ( '=' )=> '='
			{
			match('='); if (state.failed) return;
			if ( state.backtracking==0 ) {enabled = true;}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_15"

	// $ANTLR start "KEYWORD_16"
	public final void mKEYWORD_16() throws RecognitionException {
		try {
			int _type = KEYWORD_16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:104:12: ( '>' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:104:14: '>'
			{
			match('>'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_16"

	// $ANTLR start "KEYWORD_17"
	public final void mKEYWORD_17() throws RecognitionException {
		try {
			int _type = KEYWORD_17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:106:12: ( '?' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:106:14: '?'
			{
			match('?'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_17"

	// $ANTLR start "KEYWORD_18"
	public final void mKEYWORD_18() throws RecognitionException {
		try {
			int _type = KEYWORD_18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:108:12: ( '@' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:108:14: '@'
			{
			match('@'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_18"

	// $ANTLR start "KEYWORD_19"
	public final void mKEYWORD_19() throws RecognitionException {
		try {
			int _type = KEYWORD_19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:110:12: ( '_' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:110:14: '_'
			{
			match('_'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_19"

	// $ANTLR start "KEYWORD_20"
	public final void mKEYWORD_20() throws RecognitionException {
		try {
			int _type = KEYWORD_20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:112:12: ( '|' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:112:14: '|'
			{
			match('|'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_20"

	// $ANTLR start "KEYWORD_21"
	public final void mKEYWORD_21() throws RecognitionException {
		try {
			int _type = KEYWORD_21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:114:12: ( '~' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:114:14: '~'
			{
			match('~'); if (state.failed) return;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KEYWORD_21"

	// $ANTLR start "RULE_DIGIT"
	public final void mRULE_DIGIT() throws RecognitionException {
		try {
			int _type = RULE_DIGIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:117:12: ( '0' .. '9' )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_DIGIT"

	// $ANTLR start "RULE_XDIGIT"
	public final void mRULE_XDIGIT() throws RecognitionException {
		try {
			int _type = RULE_XDIGIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:119:13: ( ( RULE_DIGIT | 'A' .. 'F' ) )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_XDIGIT"

	// $ANTLR start "RULE_ALPHA"
	public final void mRULE_ALPHA() throws RecognitionException {
		try {
			int _type = RULE_ALPHA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:121:12: ( ( 'A' .. 'Z' | 'a' .. 'z' ) )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_ALPHA"

	// $ANTLR start "RULE_WSP"
	public final void mRULE_WSP() throws RecognitionException {
		try {
			int _type = RULE_WSP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:123:10: ( ( ' ' | '\\t' ) )
			// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:
			{
			if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
				input.consume();
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RULE_WSP"

	@Override
	public void mTokens() throws RecognitionException {
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:8: ( KEYWORD_46 | KEYWORD_45 | KEYWORD_43 | KEYWORD_44 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | RULE_DIGIT | RULE_XDIGIT | RULE_ALPHA | RULE_WSP )
		int alt5=50;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:10: KEYWORD_46
				{
				mKEYWORD_46(); if (state.failed) return;

				}
				break;
			case 2 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:21: KEYWORD_45
				{
				mKEYWORD_45(); if (state.failed) return;

				}
				break;
			case 3 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:32: KEYWORD_43
				{
				mKEYWORD_43(); if (state.failed) return;

				}
				break;
			case 4 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:43: KEYWORD_44
				{
				mKEYWORD_44(); if (state.failed) return;

				}
				break;
			case 5 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:54: KEYWORD_40
				{
				mKEYWORD_40(); if (state.failed) return;

				}
				break;
			case 6 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:65: KEYWORD_41
				{
				mKEYWORD_41(); if (state.failed) return;

				}
				break;
			case 7 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:76: KEYWORD_42
				{
				mKEYWORD_42(); if (state.failed) return;

				}
				break;
			case 8 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:87: KEYWORD_36
				{
				mKEYWORD_36(); if (state.failed) return;

				}
				break;
			case 9 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:98: KEYWORD_37
				{
				mKEYWORD_37(); if (state.failed) return;

				}
				break;
			case 10 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:109: KEYWORD_38
				{
				mKEYWORD_38(); if (state.failed) return;

				}
				break;
			case 11 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:120: KEYWORD_39
				{
				mKEYWORD_39(); if (state.failed) return;

				}
				break;
			case 12 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:131: KEYWORD_33
				{
				mKEYWORD_33(); if (state.failed) return;

				}
				break;
			case 13 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:142: KEYWORD_34
				{
				mKEYWORD_34(); if (state.failed) return;

				}
				break;
			case 14 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:153: KEYWORD_35
				{
				mKEYWORD_35(); if (state.failed) return;

				}
				break;
			case 15 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:164: KEYWORD_22
				{
				mKEYWORD_22(); if (state.failed) return;

				}
				break;
			case 16 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:175: KEYWORD_23
				{
				mKEYWORD_23(); if (state.failed) return;

				}
				break;
			case 17 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:186: KEYWORD_24
				{
				mKEYWORD_24(); if (state.failed) return;

				}
				break;
			case 18 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:197: KEYWORD_25
				{
				mKEYWORD_25(); if (state.failed) return;

				}
				break;
			case 19 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:208: KEYWORD_26
				{
				mKEYWORD_26(); if (state.failed) return;

				}
				break;
			case 20 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:219: KEYWORD_27
				{
				mKEYWORD_27(); if (state.failed) return;

				}
				break;
			case 21 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:230: KEYWORD_28
				{
				mKEYWORD_28(); if (state.failed) return;

				}
				break;
			case 22 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:241: KEYWORD_29
				{
				mKEYWORD_29(); if (state.failed) return;

				}
				break;
			case 23 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:252: KEYWORD_30
				{
				mKEYWORD_30(); if (state.failed) return;

				}
				break;
			case 24 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:263: KEYWORD_31
				{
				mKEYWORD_31(); if (state.failed) return;

				}
				break;
			case 25 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:274: KEYWORD_32
				{
				mKEYWORD_32(); if (state.failed) return;

				}
				break;
			case 26 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:285: KEYWORD_1
				{
				mKEYWORD_1(); if (state.failed) return;

				}
				break;
			case 27 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:295: KEYWORD_2
				{
				mKEYWORD_2(); if (state.failed) return;

				}
				break;
			case 28 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:305: KEYWORD_3
				{
				mKEYWORD_3(); if (state.failed) return;

				}
				break;
			case 29 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:315: KEYWORD_4
				{
				mKEYWORD_4(); if (state.failed) return;

				}
				break;
			case 30 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:325: KEYWORD_5
				{
				mKEYWORD_5(); if (state.failed) return;

				}
				break;
			case 31 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:335: KEYWORD_6
				{
				mKEYWORD_6(); if (state.failed) return;

				}
				break;
			case 32 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:345: KEYWORD_7
				{
				mKEYWORD_7(); if (state.failed) return;

				}
				break;
			case 33 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:355: KEYWORD_8
				{
				mKEYWORD_8(); if (state.failed) return;

				}
				break;
			case 34 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:365: KEYWORD_9
				{
				mKEYWORD_9(); if (state.failed) return;

				}
				break;
			case 35 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:375: KEYWORD_10
				{
				mKEYWORD_10(); if (state.failed) return;

				}
				break;
			case 36 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:386: KEYWORD_11
				{
				mKEYWORD_11(); if (state.failed) return;

				}
				break;
			case 37 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:397: KEYWORD_12
				{
				mKEYWORD_12(); if (state.failed) return;

				}
				break;
			case 38 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:408: KEYWORD_13
				{
				mKEYWORD_13(); if (state.failed) return;

				}
				break;
			case 39 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:419: KEYWORD_14
				{
				mKEYWORD_14(); if (state.failed) return;

				}
				break;
			case 40 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:430: KEYWORD_15
				{
				mKEYWORD_15(); if (state.failed) return;

				}
				break;
			case 41 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:441: KEYWORD_16
				{
				mKEYWORD_16(); if (state.failed) return;

				}
				break;
			case 42 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:452: KEYWORD_17
				{
				mKEYWORD_17(); if (state.failed) return;

				}
				break;
			case 43 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:463: KEYWORD_18
				{
				mKEYWORD_18(); if (state.failed) return;

				}
				break;
			case 44 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:474: KEYWORD_19
				{
				mKEYWORD_19(); if (state.failed) return;

				}
				break;
			case 45 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:485: KEYWORD_20
				{
				mKEYWORD_20(); if (state.failed) return;

				}
				break;
			case 46 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:496: KEYWORD_21
				{
				mKEYWORD_21(); if (state.failed) return;

				}
				break;
			case 47 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:507: RULE_DIGIT
				{
				mRULE_DIGIT(); if (state.failed) return;

				}
				break;
			case 48 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:518: RULE_XDIGIT
				{
				mRULE_XDIGIT(); if (state.failed) return;

				}
				break;
			case 49 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:530: RULE_ALPHA
				{
				mRULE_ALPHA(); if (state.failed) return;

				}
				break;
			case 50 :
				// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:1:541: RULE_WSP
				{
				mRULE_WSP(); if (state.failed) return;

				}
				break;

		}
	}

	// $ANTLR start synpred1_RQLCustomLexer
	public final void synpred1_RQLCustomLexer_fragment() throws RecognitionException {
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:16: ( 'like(' )
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:17: 'like('
		{
		match("like("); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_RQLCustomLexer

	// $ANTLR start synpred3_RQLCustomLexer
	public final void synpred3_RQLCustomLexer_fragment() throws RecognitionException {
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:78: ( 'l' )
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:38:79: 'l'
		{
		match('l'); if (state.failed) return;
		}

	}
	// $ANTLR end synpred3_RQLCustomLexer

	// $ANTLR start synpred4_RQLCustomLexer
	public final void synpred4_RQLCustomLexer_fragment() throws RecognitionException {
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:46:16: ( 'and(' )
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:46:17: 'and('
		{
		match("and("); if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_RQLCustomLexer

	// $ANTLR start synpred5_RQLCustomLexer
	public final void synpred5_RQLCustomLexer_fragment() throws RecognitionException {
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:46:35: ( 'a' )
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:46:36: 'a'
		{
		match('a'); if (state.failed) return;
		}

	}
	// $ANTLR end synpred5_RQLCustomLexer

	// $ANTLR start synpred6_RQLCustomLexer
	public final void synpred6_RQLCustomLexer_fragment() throws RecognitionException {
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:48:16: ( 'not(' )
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:48:17: 'not('
		{
		match("not("); if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_RQLCustomLexer

	// $ANTLR start synpred7_RQLCustomLexer
	public final void synpred7_RQLCustomLexer_fragment() throws RecognitionException {
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:48:35: ( 'n' )
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:48:36: 'n'
		{
		match('n'); if (state.failed) return;
		}

	}
	// $ANTLR end synpred7_RQLCustomLexer

	// $ANTLR start synpred8_RQLCustomLexer
	public final void synpred8_RQLCustomLexer_fragment() throws RecognitionException {
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:58:16: ( 'eq(' )
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:58:17: 'eq('
		{
		match("eq("); if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_RQLCustomLexer

	// $ANTLR start synpred9_RQLCustomLexer
	public final void synpred9_RQLCustomLexer_fragment() throws RecognitionException {
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:58:33: ( 'e' )
		// F:\\Workspace\\32bit_eclipse_main\\spbau.research_spring_2015.rql_editor\\com.parallels.aps.ide.rqleditor.xtext.rql\\src\\com\\parallels\\aps\\ide\\rqleditor\\xtext\\rql\\lexer\\RQLCustomLexer.g:58:34: 'e'
		{
		match('e'); if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_RQLCustomLexer

	public final boolean synpred1_RQLCustomLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_RQLCustomLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_RQLCustomLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_RQLCustomLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_RQLCustomLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_RQLCustomLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_RQLCustomLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_RQLCustomLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_RQLCustomLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_RQLCustomLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_RQLCustomLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_RQLCustomLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_RQLCustomLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_RQLCustomLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_RQLCustomLexer() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_RQLCustomLexer_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\1\uffff\3\44\1\55\1\44\1\62\1\64\1\44\1\uffff\1\44\1\uffff\1\73\1\75"+
		"\1\44\64\uffff";
	static final String DFA5_eofS =
		"\103\uffff";
	static final String DFA5_minS =
		"\1\11\1\155\1\157\1\145\1\155\1\141\2\145\1\162\1\uffff\1\162\1\uffff"+
		"\2\75\1\145\40\uffff\1\153\23\uffff";
	static final String DFA5_maxS =
		"\1\176\1\163\2\157\1\155\1\141\1\164\1\165\1\162\1\uffff\1\165\1\uffff"+
		"\2\75\1\164\40\uffff\1\155\23\uffff";
	static final String DFA5_acceptS =
		"\11\uffff\1\14\1\uffff\1\17\3\uffff\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
		"\1\41\1\42\1\43\1\44\1\45\1\46\1\50\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
		"\1\61\1\62\1\1\1\3\1\25\1\2\1\4\1\12\1\5\1\22\1\6\1\uffff\1\26\1\27\1"+
		"\10\1\11\1\15\1\30\1\13\1\14\1\16\1\31\1\20\1\47\1\21\1\51\1\23\1\24\1"+
		"\57\1\60\1\7";
	static final String DFA5_specialS =
		"\103\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\45\26\uffff\1\45\1\13\2\uffff\1\17\1\20\1\21\1\uffff\1\22\1\23\1\24"+
			"\1\25\1\26\1\27\1\30\1\31\12\42\1\32\1\33\1\14\1\34\1\15\1\35\1\36\6"+
			"\43\24\44\4\uffff\1\37\1\uffff\1\11\1\44\1\2\1\44\1\4\1\5\1\16\1\44\1"+
			"\1\2\44\1\6\1\44\1\7\1\12\3\44\1\3\1\10\6\44\1\uffff\1\40\1\uffff\1\41",
			"\1\46\1\50\4\uffff\1\47",
			"\1\51",
			"\1\52\11\uffff\1\53",
			"\1\54",
			"\1\56",
			"\1\60\3\uffff\1\57\12\uffff\1\61",
			"\1\65\17\uffff\1\63",
			"\1\66",
			"",
			"\1\71\2\uffff\1\70",
			"",
			"\1\72",
			"\1\74",
			"\1\76\16\uffff\1\77",
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
			"\1\62\1\uffff\1\102",
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

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( KEYWORD_46 | KEYWORD_45 | KEYWORD_43 | KEYWORD_44 | KEYWORD_40 | KEYWORD_41 | KEYWORD_42 | KEYWORD_36 | KEYWORD_37 | KEYWORD_38 | KEYWORD_39 | KEYWORD_33 | KEYWORD_34 | KEYWORD_35 | KEYWORD_22 | KEYWORD_23 | KEYWORD_24 | KEYWORD_25 | KEYWORD_26 | KEYWORD_27 | KEYWORD_28 | KEYWORD_29 | KEYWORD_30 | KEYWORD_31 | KEYWORD_32 | KEYWORD_1 | KEYWORD_2 | KEYWORD_3 | KEYWORD_4 | KEYWORD_5 | KEYWORD_6 | KEYWORD_7 | KEYWORD_8 | KEYWORD_9 | KEYWORD_10 | KEYWORD_11 | KEYWORD_12 | KEYWORD_13 | KEYWORD_14 | KEYWORD_15 | KEYWORD_16 | KEYWORD_17 | KEYWORD_18 | KEYWORD_19 | KEYWORD_20 | KEYWORD_21 | RULE_DIGIT | RULE_XDIGIT | RULE_ALPHA | RULE_WSP );";
		}
	}

}
