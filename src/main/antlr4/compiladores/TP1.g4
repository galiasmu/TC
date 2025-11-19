grammar TP1;



// --- TOKENS ---
CI : '['  ;
CD : ']'  ;
PYC : ';' ;
PA  : '(' ;
PC  : ')' ;
LLA : '{' ;
LLC : '}' ;
ASIGN : '=' ;
COMA  : ',' ;
SUMA  : '+' ;
RESTA : '-' ;
MULT  : '*' ;
DIV   : '/' ;
MOD   : '%' ;
COMP :  '==' | '>' | '<' | '=>' | '=<' | '||' | '&&' | '!=' ;
INC : '++' ;
DEC : '--' ;

TIPO : 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'signed' | 'unsigned' | 'string' ;

NUMERO : [0-9]+ ;
ID : [a-zA-Z_][a-zA-Z0-9_]* ;
WS : [ \t\n\r]+ -> skip ;

// Palabras reservadas
IF_TOKEN : 'if' ;
ELSE_TOKEN : 'else' ;
FOR : 'for' ;
WHILE : 'while' ;

// --- REGLAS ---
programa : instrucciones EOF ;

instrucciones : instruccion instrucciones | ;

instruccion : asignacion
            | declaracion
            | bloque
            | iwhile
            | fi
            | rof
            | funcion
            ;

bloque : LLA instrucciones LLC ;

asignacion : ID ASIGN expresion PYC ;

incFor : asignacion | incremento | ID COMP ID | exp | term | ;

declaracion : TIPO ID inicializacion listaid PYC ;

inicializacion : ASIGN NUMERO | ;

incremento : ID (INC|DEC) ;

listaid : COMA ID inicializacion listaid | ;

funcion : TIPO ID PA (parametrosfunc)? PC instruccion ;

decFunc : TIPO ID ; // Corregido: decFunc debe tener tipo para parametros

parametrosfunc: decFunc (COMA decFunc)* ;

iwhile : WHILE PA comparacion PC instruccion ;

fi : IF_TOKEN PA comparacion PC instruccion ELSE_TOKEN instruccion ;

rof : FOR PA declaracion comparacion PYC incFor PC instruccion ; 

comparacion : expresion COMP expresion 
            | expresion ASIGN expresion
            |
            ; 

expresion : termino exp ;

termino : factor term ;

exp : SUMA termino exp
    | RESTA termino exp
    |
    ;

term : MULT factor term
     | DIV  factor term
     | MOD  factor term
     |
     ;
      
factor : NUMERO | ID | PA expresion PC ;