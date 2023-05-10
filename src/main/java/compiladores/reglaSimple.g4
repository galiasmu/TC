grammar reglaSimple;

@header { 
    package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

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
COMP : '==' | '>' | '<' | '=>' | '=<';

NUMERO : DIGITO+ ;
// OTRO : . ;

INT : 'int' ;

WHILE : 'while';

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

WS : [ \t\n\r] -> skip ;


programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : asignacion
            | declaracion
            | bloque
            | iwhile
            ;
bloque : LLA instrucciones LLC ;

asignacion : ID ASIGN (NUMERO|ID) PYC ;

declaracion : INT ID inicializacion listaid PYC ;

inicializacion : ASIGN NUMERO
               |
               ;
listaid : COMA ID inicializacion listaid
        |
        ;

iwhile : WHILE PA comparacion PC (bloque|instruccion); 

comparacion : (NUMERO|ID) COMP (NUMERO|ID);

// expresion : termino exp ;
// exp : SUMA  termino exp
//     | RESTA termino exp
//     |
//     ;

// termino : factor term ;

// term : MULT factor term
//      | DIV  factor term
//      | MOD  factor term
//      |
//      ;

// factor : NUMERO
//        | ID
//        | PA expresion PC 
//        ;

