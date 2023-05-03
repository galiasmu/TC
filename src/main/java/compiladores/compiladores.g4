grammar compiladores;

// @header {
// package compiladores;
// }

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

PYC : ';' ;
PA  : '(' ;
PC  : ')' ;
LLA : '{' ;
LLC : '}' ;
ASIGN : '=' ;
COMA : ',' ;
EQ : '==' ;
SUMA : '+';
RESTA: '-';
MULT : '*';
DIV : '/';
MDD : '%';
NUMERO : DIGITO+ ;
// OTRO : . ;

INT : 'int' ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

WS : [ \t\n\r] -> skip ;

// s : ID     { System.out.println("ID ->" + $ID.getText() + "<--"); }         s
//   | NUMERO { System.out.println("NUMERO ->" + $NUMERO.getText() + "<--"); } s
//   | OTRO   { System.out.println("Otro ->" + $OTRO.getText() + "<--"); }     s
//   | EOF
//   ;

// si : s
//    | EOF
//    ;

// s : PA s PC s
//   |
//   ;

programa : instrucciones EOF ;

instrucciones : instruccion instrucciones
              |
              ;

instruccion : asignacion
            | declaracion
            | bloque
            ;
bloque : LLA instrucciones LLC;

asignacion : ID ASIGN expresion PYC;

declaracion : INT ID inicializacion listaid PYC ;

inicializacion : ASIGN NUMERO
               |
               ;

listaid : COMA ID inicializacion listaid
        |
        ;

expresion : termino exp ;

exp : SUMA termino exp
    | RESTA termino exp
    |
    ;

termino : factor term;
//term es algun operador o vacio
term : MULT factor term
  | DIV factor term
  | MDD factor term
  ;

factor : NUMERO
       | ID
       | PA expresion PC
       ;