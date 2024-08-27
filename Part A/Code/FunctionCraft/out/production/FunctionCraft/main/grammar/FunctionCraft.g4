grammar FunctionCraft;

program :
(function | pattern)*
main_function;

function:
DEF
name = IDENTIFIER
{System.out.println("FuncDec: " + $name.text);}
function_arg
function_body
END;

main_function:
DEF
MAIN
{System.out.println("MAIN");}
LPAR
RPAR
function_body
END;

function_body:
(statement)*
(return_statement | );

function_arg:
LPAR
(
    (IDENTIFIER COMMA)+ (IDENTIFIER | predefine_arg) |
    IDENTIFIER |
    predefine_arg |

)
RPAR;


lambda_function:
POINTER
{System.out.println("Structure: LAMBDA");}
function_arg
LBRACE
function_body
RBRACE;


predefine_arg:
LBRACKET
(assignmentp COMMA) *
assignmentp
RBRACKET;


return_statement:
RETURN
{System.out.println("RETURN");}
return_val
SEMICOLON;

function_call:
(IDENTIFIER | lambda_function)
function_call_bodyp;

function_call_body:
LPAR
(
    ((value | lambda_function) COMMA) * (value | lambda_function) |
    ((value | lambda_function) | )
)
RPAR;

function_call_bodyp:
LPAR
(
    {System.out.println("Function Call");}
    ((value | lambda_function) COMMA) * (value | lambda_function) |
    ((value | lambda_function) | )
)
RPAR;

built_in_function:
puts |
push |
chomp |
chop |
len |
method;

value:
absolute_expression (LBRACKET value RBRACKET)+ |
absolute_expression |
raw_value
;

statement:
built_in_function SEMICOLON |
function_call SEMICOLON |
pattern_matching SEMICOLON |
if_else_elseif |
loop_do |
for_in |
assignment SEMICOLON;

absolute_expression:
expression name = APPEND expression2 {System.out.println("Operator: " + $name.text);}|
expression2 name = OR expression3 {System.out.println("Operator: " + $name.text);}|
expression3 name = AND expression4 {System.out.println("Operator: " + $name.text);}|
expression4 name = EQUAL expression5 {System.out.println("Operator: " + $name.text);}|
expression4 name = NEQUAL expression5 {System.out.println("Operator: " + $name.text);}|
expression5 name = LES expression6 {System.out.println("Operator: " + $name.text);}|
expression5 name = LESE expression6 {System.out.println("Operator: " + $name.text);}|
expression5 name = GRT expression6 {System.out.println("Operator: " + $name.text);}|
expression5 name = GRTE expression6 {System.out.println("Operator: " + $name.text);}|
expression6 name = PLUS expression7 {System.out.println("Operator: " + $name.text);}|
expression6 name = MINUS expression7 {System.out.println("Operator: " + $name.text);}|
expression7 name = MULT expression8 {System.out.println("Operator: " + $name.text);}|
expression7 name = DIV expression8 {System.out.println("Operator: " + $name.text);}|
expression7 name = MOD expression8 {System.out.println("Operator: " + $name.text);}|
name = NOT expression8 {System.out.println("Operator: " + $name.text);}|
name = MINUS expression8 {System.out.println("Operator: " + $name.text);}|
expression9 name = DPLUS {System.out.println("Operator: " + $name.text);}|
expression9 name = DMINUS {System.out.println("Operator: " + $name.text);}|
LPAR expression RPAR;

expression:
expression name = APPEND expression2 {System.out.println("Operator: " + $name.text);} |
expression2;
expression2:
expression2 name = OR expression3 {System.out.println("Operator: " + $name.text);} |
expression3;
expression3:
expression3 name = AND expression4 {System.out.println("Operator: " + $name.text);} |
expression4;
expression4:
expression4 name = EQUAL expression5 {System.out.println("Operator: " + $name.text);} |
expression4 name = NEQUAL expression5 {System.out.println("Operator: " + $name.text);} |
expression5;
expression5:
expression5 name = LES expression6 {System.out.println("Operator: " + $name.text);} |
expression5 name = LESE expression6 {System.out.println("Operator: " + $name.text);} |
expression5 name = GRT expression6 {System.out.println("Operator: " + $name.text);} |
expression5 name = GRTE expression6 {System.out.println("Operator: " + $name.text);} |
expression6;
expression6:
expression6 name = PLUS expression7 {System.out.println("Operator: " + $name.text);} |
expression6 name = MINUS expression7 {System.out.println("Operator: " + $name.text);} |
expression7;
expression7:
expression7 name = MULT expression8 {System.out.println("Operator: " + $name.text);} |
expression7 name = DIV expression8 {System.out.println("Operator: " + $name.text);} |
expression7 name = MOD expression8 {System.out.println("Operator: " + $name.text);} |
expression8;
expression8:
name = NOT expression8 {System.out.println("Operator: " + $name.text);} |
name = MINUS expression8 {System.out.println("Operator: " + $name.text);} |
expression9;
expression9:
expression9 name = DPLUS {System.out.println("Operator: " + $name.text);} |
expression9 name = DMINUS {System.out.println("Operator: " + $name.text);} |
LPAR expression RPAR |
raw_value;

raw_value:
raw_value(LBRACKET value RBRACKET)+ |
built_in_function |
function_call |
pattern_matching |
list_val |
STRING_VAL |
INT_VAL |
FLOAT_VAL |
TRUE |
FALSE |
IDENTIFIER;

list_val :
LBRACKET
(
    (value COMMA)+ value |
    (value | )
)
RBRACKET;

assignment:
(name = IDENTIFIER
(ASSIGN
| PLUS_ASSIGN
| MINUS_ASSIGN
| MULT_ASSIGN
| MOD_ASSIGN )
(value | lambda_function){System.out.println("Assignment: " + $name.text);})
|(IDENTIFIER name = APPEND {System.out.println("Operator: " + $name.text);}
(value | lambda_function))
;

assignmentp:
name = IDENTIFIER
ASSIGN
(value | lambda_function);

if_proposition:
LPAR
(
    if_proposition name = AND if_proposition {System.out.println("Operator: " + $name.text);}|
    if_proposition name = OR if_proposition {System.out.println("Operator: " + $name.text);}|
    name = NOT if_proposition {System.out.println("Operator: " + $name.text);}|
    raw_value name = EQUAL raw_value {System.out.println("Operator: " + $name.text);}|
    raw_value name = NEQUAL raw_value {System.out.println("Operator: " + $name.text);}|
    raw_value name = LESE raw_value {System.out.println("Operator: " + $name.text);}|
    raw_value name = GRTE raw_value {System.out.println("Operator: " + $name.text);}|
    raw_value name = GRT raw_value {System.out.println("Operator: " + $name.text);}|
    raw_value name = LES raw_value {System.out.println("Operator: " + $name.text);}|
    raw_value
)
RPAR;

if_else_elseif:
IF {System.out.println("Decision: IF");} if_proposition if_body
(ELSEIF {System.out.println("Decision: ELSE IF");} if_proposition if_body)*
(ELSE {System.out.println("Decision: ELSE");} if_body | )
END;

if_body:
(statement)*;

loop_do:
LOOP DO
{System.out.println("Loop: DO");}
loop_body
END;

range:
LPAR
(INT_VAL | IDENTIFIER)
'..'
(INT_VAL | IDENTIFIER) 
RPAR |
IDENTIFIER |
list_val;

next_if:
NEXT IF {System.out.println("Control: NEXT");} if_proposition SEMICOLON;

break_if:
BREAK IF {System.out.println("Control: BREAK");} if_proposition SEMICOLON;

loop_body:
(statement |
NEXT {System.out.println("Control: NEXT");} SEMICOLON |
next_if |
BREAK {System.out.println("Control: BREAK");} SEMICOLON|
break_if) *;

for_in:
FOR
IDENTIFIER
IN
{System.out.println("Loop: FOR");}
range
loop_body
END;

puts:
PUTS {System.out.println("Built-In: PUTS");} function_call_body;

push:
PUSH {System.out.println("Built-In: PUSH");} function_call_body;

len:
LEN {System.out.println("Built-In: LEN");} function_call_body;

chop:
CHOP {System.out.println("Built-In: CHOP");} function_call_body;

chomp:
CHOMP {System.out.println("Built-In: CHOMP");} function_call_body;

method:
METHOD
LPAR
COLON
IDENTIFIER
RPAR;

pattern:
PATTERN
name = IDENTIFIER
{System.out.println("PatternDec: " + $name.text);}
function_arg
(
    TAB if_proposition ASSIGN value
) +
SEMICOLON;

pattern_matching:
IDENTIFIER
DOT
MATCH
{System.out.println("Built-In: MATCH");}
function_call_body;

return_val:
value |
lambda_function |
LPAR return_val RPAR |
 ;

INT_VAL : [1-9][0-9]* | '0';
FLOAT_VAL : INT_VAL'.'[0-9]* | '.'[0-9]+;
STRING_VAL : '"' (~["]*) '"';

DOT : '.';
MULT : '*';
MOD : '%';
PLUS : '+';
MINUS : '-';
DIV : '/';
DMINUS : '--';
DPLUS : '++';
LES : '<';
GRT : '>';
COLON : ':';
LESE : '<=';
GRTE : '>=';
AND : '&&';
OR : '||';
NOT : '!';
APPEND : '<<';
ASSIGN : '=';
EQUAL : '==';
NEQUAL : '!=';
PLUS_ASSIGN : '+=';
MINUS_ASSIGN : '-=';
MULT_ASSIGN : '*=';
MOD_ASSIGN : '%=';

SEMICOLON : ';';
COMMA : ',';
RETURN : 'return';
MAIN : 'main';
END : 'end';
DEF : 'def';
TRUE : 'true';
FALSE : 'false';
ELSEIF : 'elseif';
ELSE : 'else';
IF : 'if';
PUSH : 'push';
PUTS : 'puts';
CHOP : 'chop';
CHOMP : 'chomp';
LOOP : 'loop';
BREAK : 'break';
NEXT : 'next';
MATCH : 'match';
METHOD : 'method';
PATTERN : 'pattern';
PATTERNOR : '|';
LEN : 'Len';
IN : 'in';
FOR : 'for';
DO : 'do';
LPAR : '(';
RPAR : ')';
LBRACE : '{';
RBRACE : '}';
LBRACKET : '[';
RBRACKET : ']';
POINTER : '->';

IDENTIFIER : [a-zA-Z][a-zA-Z0-9_]*;
SIGMA : [a-zA-Z0-9];
OLCOMMENT : '#'~[\r\n]* -> skip;
COMMENT : '=begin' (.*?) '=end' -> skip;
OWS : ('  ')*' ' -> skip;
TWS : '  ' -> skip;
WN : [\n\r] -> skip;
TAB : '    |';