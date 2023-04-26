grammar parentesis;


PI : '(' ;
PD : ')' ;

LI : '{' ;
LD : '}' ;

CI : '[' ;
CD : ']' ;

WS : [ \t\n\r] -> skip ;



si : s
   | EOF
   ;


s   : LI s LD s
    | PI s PD s
    | CI s CD s
    |  
    ;   

