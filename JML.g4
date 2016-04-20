grammar JML;

primaryExpression
    :   ID
    |   Constant
    |   '(' expression ')'
    ;

postfixExpression
    :   primaryExpression
    |   postfixExpression '[' expression ']'
    |   postfixExpression '(' argumentExpressionList? ')'
    |   postfixExpression '++'
    |   postfixExpression '--'
    ;

expression
    : assignmentExpression
    ;

argumentExpressionList
    :   assignmentExpression
    |   argumentExpressionList ',' assignmentExpression
    ;

unaryExpression
    :   postfixExpression
    |   '++' unaryExpression
    |   '--' unaryExpression
    |   unaryOperator unaryExpression
    ;

unaryOperator
    :  '+' | '-' | '~' | '!'
    ;

multiplicativeExpression
    :   unaryExpression
    |   multiplicativeExpression '*' unaryExpression
    |   multiplicativeExpression '/' unaryExpression
    |   multiplicativeExpression '%' unaryExpression
    ;

additiveExpression
    :   multiplicativeExpression
    |   additiveExpression '+' multiplicativeExpression
    |   additiveExpression '-' multiplicativeExpression
    ;

relationalExpression
    :   additiveExpression
    |   relationalExpression '<' additiveExpression
    |   relationalExpression '>' additiveExpression
    |   relationalExpression '<=' additiveExpression
    |   relationalExpression '>=' additiveExpression
    ;

equalityExpression
    :   relationalExpression
    |   equalityExpression '==' relationalExpression
    |   equalityExpression '!=' relationalExpression
    ;

logicalAndExpression
    :   equalityExpression
    |   logicalAndExpression '&&' equalityExpression
    ;

logicalOrExpression
    :   logicalAndExpression
    |   logicalOrExpression '||' logicalAndExpression
    ;

assignmentExpression
    :   unaryExpression assignmentOperator assignmentExpression
    ;

assignmentOperator
    :   '=' | '*=' | '/=' | '%=' | '+=' | '-='
    ;

declaration
    :   typeSpecifier ID '=' assignmentExpression
    ;

typeSpecifier
    :   typeName ('[' ']')?
    ;


typeName
    :   'void'
    |   'char'
    |   'int'
    |   'double'
    |   'bul'
    ;


parameterList
    :   parameterDeclaration
    |   parameterList ',' parameterDeclaration
    ;

parameterDeclaration
    :   typeName ID
    ;


statement
    :   compoundStatement
    |   expressionStatement
    |   declaration
    |   selectionStatement
    |   iterationStatement
    |   jumpStatement    ;

compoundStatement
    :   '{' blockItemList? '}'
    ;

blockItemList
    :   statement
    |   blockItemList statement
    ;


expressionStatement
    :   expression? ';'
    ;

selectionStatement
    :   'if' '(' expression ')' statement ('else' statement)?
    |   'switch' '(' expression ')' statement
    ;

iterationStatement
    :   'while' '(' expression ')' statement
    |   'do' statement 'while' '(' expression ')' ';'
    |   'for' '(' expression? ';' expression? ';' expression? ')' statement
    |   'for' '(' declaration expression? ';' expression? ')' statement
    ;

jumpStatement
    :   'goto' ID ';'
    |   'continue' ';'
    |   'break' ';'
    |   'return' expression? ';'
    |   'goto' unaryExpression ';' // GCC extension
    ;

functionDefinition
    :   typeSpecifier ID '(' parameterList? ')' statement
    ;

program
    :   functionDefinition
    |   program functionDefinition
    ;

STRING_LITERAL
   : '\"' ('\'\'' | ~ ('\''))* '\"'
   ;


CHAR_LITERLAL
   : '\'' ('\'\'' | ~ ('\'')) '\''
   ;

ENT: 'entero';
REAL: 'real';
Si:'si';
Sino: 'sino';
Mientras: 'mientras';
Caracter: 'caracter';
SONIDO: 'sonido';
Global: 'global';
Print: 'print';
Play: 'play';
Leer: 'leer';
Tempo: 'tempo';
BUL: 'bul';

NUMENT: [0-9]+;
NUMREAL:[0-9]+ ('.' [0-9]+);
VALBUL: ('cierto' | 'falso');
ID: [a-zA-Z][A-Za-z0-9]*;
VALSON: '#' [a-hA-H]+;
VALCAR: [a-zA-z0-9]+[' ' |a-zA-z0-9|'_']*;


OP_SUM: '+';
OP_RES: '-';
OP_MUL: '*';
OP_DIV: '/';
OP_IG: '=';
OP_MAYQ: '>';
OP_MENQ: '<';
OP_MAYIQ: '>=';
OP_MENIQ: '<=';
OP_AND: ('&&' | 'AND');
OP_OR: '||';

DELIM: (';'| '[' | ']' | '{' | '}' | '(' | ')' | ',' );

Constant
   : NUMENT
   | NUMREAL
   | VALBUL
   | VALSON
   | VALCAR
   ;


