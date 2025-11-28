grammar MiniLenguaje;



// --- SINTAXIS (PARSER) ---

programa : (instruccion | funcion)* EOF ;

funcion : TIPO ID '(' parametros? ')' bloque ;

parametros : param (',' param)* ;
param : TIPO ID ;

bloque : '{' instructions '}' ;
instructions : instruccion* ;

instruccion 
    : declaracion                       # InstrDeclaracion
    | asignacion ';'                    # InstrAsignacion
    | 'if' '(' expresion ')' bloque ('else' bloque)?  # InstrIf
    | 'while' '(' expresion ')' bloque  # InstrWhile
    | 'return' expresion? ';'           # InstrReturn
    | expresion ';'                     # InstrExpresion
    | bloque                            # InstrBloque
    ;

// Declaración de variables y Arrays (ej: int x; o int lista[10];)
declaracion : TIPO ID ('[' NUMERO ']')? ('=' expresion)? (',' ID ('[' NUMERO ']')? ('=' expresion)?)* ';' ;

// Asignación (ej: x = 5; o lista[0] = 10;)
asignacion : ID ('[' expresion ']')? '=' expresion ;

// Expresiones matemáticas y lógicas
expresion
    : '(' expresion ')'                 # ExprParentesis
    | '!' expresion                     # ExprNot
    | '-' expresion                     # ExprNegativo
    | expresion ('*'|'/'|'%') expresion # ExprMulDiv
    | expresion ('+'|'-') expresion     # ExprSumRest
    | expresion ('>'|'<'|'>='|'<=') expresion # ExprRelacional
    | expresion ('=='|'!=') expresion   # ExprIgualdad
    | expresion '&&' expresion          # ExprAnd
    | expresion '||' expresion          # ExprOr
    | ID ('[' expresion ']')?           # ExprID
    | ID '(' argumentos? ')'            # ExprLlamada
    | NUMERO                            # ExprNumero
    | DECIMAL                           # ExprDecimal
    | CADENA                            # ExprCadena
    | CHAR                              # ExprChar
    | ('true' | 'false')                # ExprBoolean
    ;

argumentos : expresion (',' expresion)* ;

// --- LÉXICO (TOKENS) ---

TIPO : 'int' | 'char' | 'double' | 'bool' | 'void' | 'string' ;

ID : [a-zA-Z_][a-zA-Z0-9_]* ;
NUMERO : [0-9]+ ;
DECIMAL : [0-9]+ '.' [0-9]+ ;
CADENA : '"' .*? '"' ;
CHAR : '\'' . '\'' ;

// Ignorar espacios y comentarios
WS : [ \t\r\n]+ -> skip ;
COMENTARIO : '//' ~[\r\n]* -> skip ;
MULTILINEA : '/*' .*? '*/' -> skip ;
