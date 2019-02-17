grammar Betsh;

program
    : statement* EOF
    ;

statement
    : LET IDENTIFIER EQUAL expression SEMICOLON # Declaration
    | command                                   # Command
    ;

expression
    : arithmeticExpression # Arithmetic
    | stringExpression     # String
    ;

arithmeticExpression
    : arithmeticExpression op=(PLUS | MINUS | STAR | SLASH | CARET) atom # BinaryOp
    | atom # Ignore
    ;

atom
    : NUMBER                                    # Number
    | IDENTIFIER                                # Identifier
    | LEFTPAREN arithmeticExpression RIGHTPAREN # Parenthesized
    ;

stringExpression
    : STRING
    ;

command
    : CD argument*
    ;

argument
    : IDE

CD         : 'cd'   ;
LS         : 'ls'   ;
ECHO       : 'echo' ;
LET        : 'let'  ;
IDENTIFIER : LETTER (LETTER | DIGIT | UNDERSCORE)* ;

NUMBER : DIGIT+ ('.' DIGIT+)? ;
STRING : QUOTE .*? QUOTE       ;

PLUS       : '+' ;
MINUS      : '-' ;
STAR       : '*' ;
SLASH      : '/' ;
CARET      : '^' ;
EQUAL      : '=' ;
LEFTPAREN  : '(' ;
RIGHTPAREN : ')' ;
SEMICOLON  : ';' ;
QUOTE      : '"' ;

WS      : [ \t\n\r]               -> skip ;
COMMENT : '#' ~[\r\n]* '\r'? '\n' -> skip ;

fragment LETTER     : [a-zA-Z] ;
fragment DIGIT      : [0-9]    ;
fragment UNDERSCORE : '_'      ;
