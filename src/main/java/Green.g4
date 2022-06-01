// Define a grammar called main
grammar Green;
program: 'main' subprogram func* ;

//арифметические операции
OP: '+'|'-'|'*'|'/';
// ключевые слова
RANGE: 'range' ;
RETURN: ('return' WS ID)| 'return';
FUNK: 'void';
ADD: 'add';
DELETE: 'delete';
TYPE: '['('element'|'list'|'int')']'|'[]';
STREAM_OP: (IN|OUT) WS;
ELEMENT_POINTER: DOT NUM;
BINARY_OP: WS (DELETE|ADD);
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
NUM: [0-9]+ ;
ID : [a-zA-Z]+ NUM* ELEMENT_POINTER?;// match lower-case identifiers
PARAM: TYPE WS? ID | ID;
// логические операции
COMPARE_OP: '=='|'<>'|'>'|'<';
ASSIG: '=';
LANDING: '_';
DOT: '.';
IF: '?';
ELSE: 'else';
THEN : 'then';
FOR: 'for';
IN: 'in';
OUT: 'out';
GLOBAL: 'global';

//подпрограмма (Свойство 4)
subprogram: '<' (statement)* RETURN ';' '>';
//функция
func: FUNK PARAM '(' PARAM? (','PARAM)*')' subprogram;
statement: WS? (block|io|var_define|landing_expression|var_action|func_call|operations_with_list) ';';

global_program: (global_assign)* program{1}(subprogram)*;
//Маркер блочного оператора явные (Свойство 5)
block: (for_block|if_block|if_else_block) '<'statement*'>';
//конструкция for
for_block: RANGE ID WS? '->' WS? (NUM| ID );
//Двух вариантный оператор if-else (Свойство 6)
if_block: IF '(' math_expression COMPARE_OP math_expression ')';
if_else_block: if_block '<'statement*'>' ELSE block;
global_assign: GLOBAL var_action;

//Передача параметров в подпрограмму только по значению
func_call: ID '(' math_expression? (',' math_expression )* ')';
// НЕ ЯВНОЕ ОБЪЯВЛЕНИЕ ПЕРЕМЕННЫХ (Свойство 1)
var_action: ID (var_reform|binary_expression);
binary_expression: BINARY_OP  math_expression;
//  ОДНОЦЕЛЕВОЙ ОПЕРАТОР ПРИСВАИВАНИЯ (Свойство 3)
var_reform: ASSIG math_expression;

io: STREAM_OP math_expression;

landing_expression: LANDING ID OP math_expression;
math_expression:
    typeCast
    | inBrackets
    | math_expression OP math_expression
    | have_value
    ;
// ЯВНОЕ ПРЕОБРАЗОВАНИЕ ТИПОВ  (Свойство 2)
typeCast: '(' TYPE ')' math_expression;
inBrackets: '('math_expression')';

var_define: ID ASSIG (math_expression|list_special_define);
have_value: ID|NUM;
list_special_define: '{' (NUM)+ '}';

operations_with_list: ID DOT (ADD|DELETE) ('(' ID ')');

