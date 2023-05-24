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
ASIGN : '=' ;
COMA  : ',' ;
SUMA  : '+' ;
RESTA : '-' ;
MULT  : '*' ;
DIV   : '/' ;
MOD   : '%' ;
// Deberia subdividir COMP? y hacer una regla gramatical que detecte cada uno
COMP :  '==' | '>' | '<' | '=>' | '=<' | '||' | '&&' | '!=' ;
INC : '++' ;
DEC : '--' ;
//IF : 'if';
//WHILE : 'while';

TIPO : 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'signed' | 'unsigned' | 'string' ;


fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

NUMERO : DIGITO+ ;

// INT : 'int' ;

// VOID : 'void';

IF_TOKEN : 'if' ;
ELSE_TOKEN : 'else' ;

FOR : 'for' ;

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
            | rof
            ;

bloque : LLA instrucciones LLC ;

asignacion : ID ASIGN expresion PYC ;

incFor : asignacion
      | incremento
      | ID COMP ID
      | exp
      | term
      |
      ;
// el problema estaba aca, al yo poner (NUMERO|ID) en ves de expresion se asumia el trato de enteros,
// pero para la division esto no siempre sera asi

declaracion : TIPO ID inicializacion listaid PYC ;

inicializacion : ASIGN NUMERO
               |
               ;

incremento : ID (INC|DEC)  ;

listaid : COMA ID inicializacion listaid
        |
        ;

funcion : TIPO ID  PA asignacion PC instruccion ;

dec : TIPO ID (COMP expresion)? PYC ;

iwhile : WHILE PA comparacion PC instruccion ;

fi : IF_TOKEN PA comparacion PC instruccion ELSE_TOKEN instruccion ;

rof : FOR PA declaracion  comparacion PYC incFor PC instruccion ; 



comparacion : expresion COMP expresion 
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
      
 factor : NUMERO
        | ID
        | PA expresion PC 
        ;