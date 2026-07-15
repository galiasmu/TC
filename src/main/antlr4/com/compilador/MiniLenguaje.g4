grammar MiniLenguaje;

// =========================
//   REGLAS DEL PARSER
// =========================

programa
    : (instruccion | funcion)* EOF
    ;

// --------- FUNCIONES ---------

funcion
    : TIPO ID PAREN_IZQ parametros? PAREN_DER bloque
    ;

parametros
    : param (COMA param)*
    ;

param
    : TIPO ID
    ;

// --------- BLOQUES ---------

bloque
    : LLAVE_IZQ instructions? LLAVE_DER
    ;

instructions
    : instruccion+
    ;

// --------- INSTRUCCIONES ---------

instruccion
    : declaracion                        #InstrDeclaracion
    | asignacion                         #InstrAsignacion
    | ID PAREN_IZQ argumentos? PAREN_DER
      PUNTOYCOMA                         #InstrLlamada
    | RETURN expresion? PUNTOYCOMA       #InstrReturn
    | BREAK PUNTOYCOMA                   #InstrBreak
    | CONTINUE PUNTOYCOMA                #InstrContinue
    | IF PAREN_IZQ expresion PAREN_DER
      bloque (ELSE bloque)?              #InstrIf
    | WHILE PAREN_IZQ expresion PAREN_DER
      bloque                             #InstrWhile
    | FOR PAREN_IZQ forInit PUNTOYCOMA expresion? PUNTOYCOMA forUpdate PAREN_DER
      bloque                             #InstrFor
    ;

// --------- DECLARACIONES Y ASIGNACIONES ---------

declaracion
    : TIPO ID (COR_IZQ NUMERO COR_DER)? (ASIGN expresion)? PUNTOYCOMA
    ;

lvalue
    : ID (COR_IZQ expresion COR_DER)?   // variable o acceso a array
    ;

asignacion
    : lvalue ASIGN expresion PUNTOYCOMA
    ;

// --------- CLÁUSULAS DEL FOR (sin ';' propio: el ';' lo pone la regla instruccion) ---------

forInit
    : TIPO ID (ASIGN expresion)?   // declaración: for (int i = 0; ...)
    | lvalue ASIGN expresion       // asignación:  for (i = 0; ...)
    |                               // vacío:       for (; ...)
    ;

forUpdate
    : lvalue ASIGN expresion       // actualización: i = i + 1
    |                               // vacío
    ;

// argumentos de llamada: f(a, b, c)
argumentos
    : expresion (COMA expresion)*
    ;

// =========================
//   EXPRESIONES
// =========================

// Manejo de precedencia clásica:
//  ||
//  &&
//  comparaciones
//  + -
//  * / %
//  unarios
//  primarias / llamadas

expresion
    : expresion OR expresion             #ExprOr
    | expresion AND expresion            #ExprAnd
    | expresion IGUALIGUAL expresion     #ExprEq
    | expresion DISTINTO expresion       #ExprNeq
    | expresion MAYOR expresion          #ExprGt
    | expresion MENOR expresion          #ExprLt
    | expresion MAYORIGUAL expresion     #ExprGe
    | expresion MENORIGUAL expresion     #ExprLe
    | expresion MAS expresion            #ExprAdd
    | expresion MENOS expresion          #ExprSub
    | expresion POR expresion            #ExprMul
    | expresion DIV expresion            #ExprDiv
    | expresion MOD expresion            #ExprMod
    | NOT expresion                      #ExprNot
    | MENOS expresion                    #ExprNeg
    | PAREN_IZQ expresion PAREN_DER      #ExprParen
    | ID PAREN_IZQ argumentos? PAREN_DER #ExprCall
    | atomo                              #ExprAtom
    ;

// literales, identificadores, booleanos
atomo
    : ID (COR_IZQ expresion COR_DER)?  // ID o ID[exp]
    | NUMERO
    | DECIMAL
    | CHAR
    | TRUE
    | FALSE
    ;

// =========================
//   REGLAS DEL LEXER
// =========================

// --------- TIPOS ---------

TIPO
    : 'int'
    | 'double'
    | 'char'
    | 'bool'
    | 'void'
    ;

// CORCHETES PARA ARRAYS
COR_IZQ  : '[' ;
COR_DER  : ']' ;
// --------- PALABRAS RESERVADAS ---------

IF          : 'if' ;
ELSE        : 'else' ;
WHILE       : 'while' ;
FOR         : 'for' ;
RETURN      : 'return' ;
BREAK       : 'break' ;
CONTINUE    : 'continue' ;
TRUE        : 'true' ;
FALSE       : 'false' ;

// --------- IDENTIFICADORES Y LITERALES ---------

ID          : [a-zA-Z_][a-zA-Z0-9_]* ;

NUMERO      : [0-9]+ ;
DECIMAL     : [0-9]+ '.' [0-9]+ ;
CHAR        : '\'' (~['\\\r\n] | '\\' .) '\'' ;

// --------- OPERADORES ARITMÉTICOS ---------

MAS         : '+' ;
MENOS       : '-' ;
POR         : '*' ;
DIV         : '/' ;
MOD         : '%' ;

// --------- OPERADORES RELACIONALES ---------

MAYORIGUAL  : '>=' ;
MENORIGUAL  : '<=' ;
IGUALIGUAL  : '==' ;
DISTINTO    : '!=' ;
MAYOR       : '>' ;
MENOR       : '<' ;

// --------- OPERADORES LÓGICOS ---------

AND         : '&&' ;
OR          : '||' ;
NOT         : '!' ;

// --------- ASIGNACIÓN ---------

ASIGN       : '=' ;

// --------- SEPARADORES ---------

PAREN_IZQ   : '(' ;
PAREN_DER   : ')' ;
LLAVE_IZQ   : '{' ;
LLAVE_DER   : '}' ;
COMA        : ',' ;
PUNTOYCOMA  : ';' ;

// --------- ESPACIOS Y COMENTARIOS ---------

WS              : [ \t\r\n]+ -> skip ;
LINE_COMMENT    : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT   : '/*' .*? '*/' -> skip ;
