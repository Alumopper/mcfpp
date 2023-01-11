grammar test;

stat    :assign;
assign  :ID'='expr';';

expr:expr('*'|'/')expr
    |expr('+'|'-')expr
    |INT
    ;

ID : [a-zA-Z]*;

INT : [1-9][0-9]*|[0];

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;