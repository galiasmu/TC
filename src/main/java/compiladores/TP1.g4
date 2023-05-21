grammar TP1;

@header { 
    package compiladores;
}

// tokens
CI : '['  ;
CD : ']'  ;
PYC : ';' ;
PA  : '(' ;
PC  : ')' ;
LLA : '{' ;
LLC : '}' ;
//ASIGN : '=' ;
COMA  : ',' ;
SUMA  : '+' ;
RESTA : '-' ;
MULT  : '*' ;
DIV   : '/' ;
MOD   : '%' ;
COMP : '=' |'==' | '>' | '<' | '=>' | '=<' | '||' | '&&' | '!=';
//IF : 'if';
//WHILE : 'while';

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

NUMERO : DIGITO+ ;

INT : 'int' ;

IF_TOKEN : 'if' ;
ELSE_TOKEN : 'else' ;

WHILE : 'while' ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

WS : [ \t\n\r] -> skip ;

//reglas gramaticales
programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : asignacion
            | declaracion
            | bloque
            | iwhile
            | fi
            ;

bloque : LLA instrucciones LLC ;

asignacion : ID COMP expresion PYC ;
// el problema estaba aca, al yo poner (NUMERO|ID) en ves de expresion se asumia el trato de enteros,
// pero para la division esto no siempre sera asi

declaracion : INT ID inicializacion listaid PYC ;

inicializacion : COMP NUMERO
               |
               ;
listaid : COMA ID inicializacion listaid
        |
        ;

iwhile : WHILE PA comparacion PC (bloque|instruccion);

fi : IF_TOKEN PA comparacion PC (bloque|instruccion) ;

comparacion : (NUMERO|ID) COMP (NUMERO|ID) 
            | (NUMERO|ID)
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
      
 factor : NUMERO
        | ID
        | PA expresion PC 
        ;