grammar Trigonometria;

expr:   'Sin(' expr ')'      #SinExpr
    |   'Cos(' expr ')'      #CosExpr
    |   'Tan(' expr ')'      #TanExpr
    |   NUM                  #Number
    ;

NUM:    [0-9]+ ('.' [0-9]+)?;
WS:     [ \t\n\r]+ -> skip;
