grammar TP1;

@header { 
    package compiladores;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;


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
OR : 'OR';
AND : 'AND';
COMP : '==' | '>' | '<' | '=>' | '=<';

NUMERO : DIGITO+ ;

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

asignacion : ID ASIGN expresion PYC ;
// el problema estaba aca, al yo poner (NUMERO|ID) en ves de expresion se asumia el trato de enteros,
// pero para la division esto no siempre sera asi



declaracion : INT ID inicializacion listaid PYC ;

inicializacion : ASIGN NUMERO
               |
               ;
listaid : COMA ID inicializacion listaid
        |
        ;

iwhile : WHILE PA comparacion PC (bloque|instruccion); 

comparacion : (NUMERO|ID) COMP (NUMERO|ID);

 expresion : termino exp ;


 termino : factor term ;

 exp : SUMA termino exp
     | RESTA termino exp
     |  
     | term ((SUMA | RESTA) term) *
     ;



 
 term : MULT factor term
      | DIV  factor term
      | MOD  factor term
      | factor ((MULT | DIV | MOD) factor) *
      |
      ;
      
 factor : NUMERO
        | ID
        | PA expresion PC 
        ;