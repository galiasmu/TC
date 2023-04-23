grammar parentesis;

PA : '(' ;
PC : ')';

WS : [ \t\n\r] -> skip ;

programa : balanceo EOF ;

balanceo
    : (parens)*
    ;

parens
    : PA balanceo PC
    ;
