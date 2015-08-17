

/*
* generated by Xtext
*/
lexer grammar CustomRQLLexer;


@header {
package com.parallels.aps.ide.rqleditor.xtext.rql.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@members{
	private boolean enabled = false;
	private boolean alreadyWereEnabled = false;
}



KEYWORD_46 : {alreadyWereEnabled = alreadyWereEnabled && !enabled || 
!alreadyWereEnabled && enabled; enabled = alreadyWereEnabled;} 'implementing';

KEYWORD_45 : 'composing';

KEYWORD_43 : 'isnull';

KEYWORD_44 : 'select';

KEYWORD_40 : 'empty';

KEYWORD_41 : 'false';

KEYWORD_42 : 'limit';

KEYWORD_36 : ((('like(')=>'like') | ({enabled}? => ( ('like=')=> 'like' )) | ('l') => 'l' {$type = RULE_ALPHA;});

KEYWORD_37 : 'null';

KEYWORD_38 : 'sort';

KEYWORD_39 : 'true';

KEYWORD_33 : ((('and(')=>'and') | ('a') => 'a' {$type = RULE_ALPHA;});

KEYWORD_34 : ((('not(')=>'not') | ('n') => 'n' {$type = RULE_ALPHA;});

KEYWORD_35 : 'out';

KEYWORD_22 : '!=';

KEYWORD_23 : '<=';

KEYWORD_24 : '>=';

KEYWORD_25 : ((('eq(')=>'eq') | ('e') => 'e' {$type = RULE_ALPHA;});

KEYWORD_26 : 'ge';

KEYWORD_27 : 'gt';

KEYWORD_28 : 'in';

KEYWORD_29 : 'le';

KEYWORD_30 : 'lt';

KEYWORD_31 : 'ne';

KEYWORD_32 : 'or';

KEYWORD_1 : '$';

KEYWORD_2 : '%';

KEYWORD_3 : '&';

KEYWORD_4 : '(';

KEYWORD_5 : ')';

KEYWORD_6 : '*';

KEYWORD_7 : '+';

KEYWORD_8 : ',';

KEYWORD_9 : '-';

KEYWORD_10 : '.';

KEYWORD_11 : '/';

KEYWORD_12 : ':';

KEYWORD_13 : ';';

KEYWORD_14 : '<';

KEYWORD_15 : ('=')=> '=' {enabled = true;};

KEYWORD_16 : '>';

KEYWORD_17 : '?';

KEYWORD_18 : '@';

KEYWORD_19 : '_';

KEYWORD_20 : '|';

KEYWORD_21 : '~';


RULE_DIGIT : '0'..'9';

RULE_XDIGIT : (RULE_DIGIT|'A'..'F');

RULE_ALPHA : ('A'..'Z'|'a'..'z');

RULE_WSP : (' '|'\t');