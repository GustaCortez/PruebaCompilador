grammar Simple;


program: PROGRAM ID BRACKET_OPEN
sentence*
BRACKET_CLOSE;

sentence: var_decl | var_assign | println;

var_decl: VAR ID SEMICOLON
{System.out.println("Declarando variable");};

var_assign: ID ASSIGN expression SEMICOLON
{System.out.println("Asignando variable");};

println: PRINTLN expression SEMICOLON
{System.out.println(expression.value);};


expresion returns[Object value]:
        NUMBER {$value = Integer.parseInt($NUMBER.text); }
        | ID { $value = $ID.text; };


PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

AND: '&&';
OR: '||';
NOT: '!';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

ASSIGN: '=';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

SEMICOLON: ';';

ID: [a-zA-Z][a-zA-Z0-9_]*;
NUMBER: [0-9]+;

WS: [ \t\n\r]+ -> skip;


