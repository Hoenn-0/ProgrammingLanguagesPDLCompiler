grammar pdl;
@header{
package Compiler;
}
program	
		: programHeader
		  block* 
		  programEnds
		  procDefun+
		;

programHeader
		: 'program' IDENT COLON
		  globals?
		;

globals	: 'global' IDENT (COMMA IDENT)*
		;

programEnds
		: 'endprogram'
		;

block	: outputStatement
		| inputStatement
		| procedureCall
		| assignment
		| whileLoop
		| ifElse
		;

procDefun
		: 'proc' IDENT
		  block*
		  'endproc'	
		;

comparator
		: LT | GT | EQUALS | LE | GE | NE | NLT | NGT
		;

math	: ADD | SUB | MUL | DIV | MOD ;

outputStatement
		: 'output' LPARENS STRING (COMMA IDENT)* RPARENS
		;

inputStatement
		: 'input' LPARENS IDENT RPARENS
		;

procedureCall
		: 'call' IDENT (LPARENS value (COMMA value)* RPARENS)?
		;

expr	: value
		| LPARENS IDENT math value RPARENS
		;

assignment
		: 'set' IDENT 'to' expr
		;

whileLoop
		: 'while' LPARENS IDENT comparator value RPARENS 'do'
		  block*
		  'endwhile'
		;

ifElse	: 'if' LPARENS IDENT comparator value RPARENS 'then'
		  block*
		  ('else'
		  block*)?
		  'endif' 
		;

value	: NUMBER | STRING | IDENT
		;

CHAR		  : '[A-Za-z]' ;
COLON		  : ':' ;
SEMICOLON	  :	';' ;
LPARENS		  : '(' ;
RPARENS		  : ')' ;
QUOTE		  : '"' ;
COMMA		  : ',' ;
DOT			  : '.' ;
LT			  : '<' ;
GT			  : '>' ;
EQUALS		  : '=' ;
LE			  : '<=' ;
GE			  : '>=' ;
NE			  : '!=' ;
NLT			  : '!<' ;
NGT			  : '!>' ;
ADD			  : '+' ;
SUB			  : '-' ;
MUL			  : '*' ;
DIV			  : '/' ;
MOD			  : '%' ;
NEWLINE		  : '\r'? '\n' -> skip ;     
WS : [ \t\r\n]+ -> skip ;
QUESTION	  : '?' ;
BANG		  : '!' ;
SPACE		  : ' ' ;

SIGN	: ADD | SUB ;

IDENT   : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*   
		;

NUMBER	: SIGN? DIGIT+ ('.' DIGIT*)?
		;

fragment
DIGIT	: [0-9] ;

STRING	: QUOTE .*? QUOTE ;
