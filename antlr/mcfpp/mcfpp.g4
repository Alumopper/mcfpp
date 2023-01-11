grammar mcfpp;

//一个mcfpp文件
compilationUnit
    :   namespaceDeclaration?
        (   namespaceDeclaration
        |   typeDeclaration
        )*
        EOF
    ;

//命名空间声明
namespaceDeclaration
    :   'namespace' Identifier ';'
    ;

//类或函数声明
typeDeclaration
    :   classOrFunctionDeclaration
    ;

//类或函数声明
classOrFunctionDeclaration
    :   classDeclaration
    |   functionDeclaration
    ;

//类声明
classDeclaration
    :   'class' ClassName '{' classMember* '}'
    ;

//函数声明
functionDeclaration
    :   'func' Identifier '(' parameterList? ')' '{' functionBody '}'
    ;

//类成员
classMember
    :   functionDeclaration
    |   variableDeclaration
    |   constructorDeclaration
    ;

//构造函数声明
constructorDeclaration
    :   ClassName '(' parameterList ')' '{' functionBody '}'
    ;

constructorCall
    :   'new' ClassName arguments
    ;

//变量声明
variableDeclaration
    :   type Identifier ';'
    |   type Identifier '=' expression ';'
    ;

parameterList
    :   parameter (',' parameter)*
    ;

parameter
    :   type Identifier
    ;

expression
    :   conditionalExpression ('=' expression)?
    ;

statementExpression
    :   conditionalExpression ('=' expression)? ';'
    ;

conditionalExpression
    :   conditionalOrExpression ( '?' expression ':' expression )?
    ;


conditionalOrExpression
    :   conditionalAndExpression ( '||' conditionalAndExpression )*
    ;

conditionalAndExpression
    :   equalityExpression ( '&&' equalityExpression )*
    ;


equalityExpression
    :   relationalExpression ( ('==' | '!=') relationalExpression )*
    ;


relationalExpression
    :   additiveExpression ( relationalOp additiveExpression )*
    ;

relationalOp
    :   '<='
    |   '>='
    |   '<'
    |   '>'
    ;

additiveExpression
    :   multiplicativeExpression ( ('+' | '-') multiplicativeExpression )*
    ;

multiplicativeExpression
    :   unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
    ;

unaryExpression
    :   '!' unaryExpression
    |   castExpression
    |   primary selector*
    ;

castExpression
    :  '(' primitiveType ')' unaryExpression
    ;

primary
    :   '(' expression ')'
    |   'this' arguments?
    |   'super' superSuffix
    |   number
    |   constructorCall
    |   Identifier ('.' Identifier)* identifierSuffix?
    ;

identifierSuffix
    :   '[' conditionalExpression ']'
    |   arguments
    |   '.' primaryAndSelectorSuffix
    ;

primaryAndSelectorSuffix
	:	'super' superSuffix
	|	Identifier arguments
	;

selector
    :   '.' Identifier arguments?
	|	'.' primaryAndSelectorSuffix
    |   '.' 'this'
    |   '.' 'super' superSuffix
    |   '[' expression ']'
    ;

superSuffix
    :   arguments
    |   '.' Identifier arguments?
    ;

arguments
    :   '(' expressionList? ')'
    ;

primitiveType
    :   'boolean'
    |   'char'
    |   'byte'
    |   'short'
    |   'int'
    |   'long'
    |   'float'
    |   'double'
    ;

functionBody
    :   statement*
    ;

statement
    :   variableDeclaration
    |   statementExpression
    |   ';'
    ;

variableOperation
    :   Identifier '=' expression ';'
    ;

expressionList
    :   expression (',' expression)*
    ;

functionCall
    :   functionExpression ';'
    ;

functionExpression
    :   Identifier '(' expressionList? ')'
    ;

var
    :   Identifier
    ;

type
    :   'int'
    |   'float'
    |   'string'
    |   'bool'
    |   'decimal'
    ;

number
    :   INT
    |   DECIMAL
    |   var
    ;

Identifier
    :   [a-z]+
    ;

ClassName
    :   [A-Z][a-z]*
    ;

INT
    :   [1-9][0-9]*|[0]
    ;

DECIMAL
    :   INT
    |   INT '.' [0-9]+
    ;

//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;