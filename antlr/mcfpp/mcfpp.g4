grammar mcfpp;

@header{
package top.alumopper.mcfpp.lib;
}

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
    :   'class' className '{' classMember* '}'
    ;

//函数声明
functionDeclaration
    :    namespaceID? 'func' Identifier '(' parameterList? ')' '{' functionBody '}'
    ;

//类成员
classMember
    :   functionDeclaration
    |   fieldDeclaration
    |   constructorDeclaration
    ;

//构造函数声明
constructorDeclaration
    :   className '(' parameterList ')' '{' functionBody '}'
    ;

//构造函数的调用
constructorCall
    :   'new' className arguments
    ;

//变量声明
fieldDeclaration
    :   type Identifier ';'
    |   type Identifier '=' expression ';'
    ;

//参数列表
parameterList
    :   parameter (',' parameter)*
    ;

//参数
parameter
    :   type Identifier
    ;

//表达式
expression
    :   conditionalExpression
    ;

//能作为语句的表达式
statementExpression
    :   var  ('=' expression )?';'
    ;

//条件表达式
conditionalExpression
    :   conditionalOrExpression ( '?' expression ':' expression )?
    ;

//或门
conditionalOrExpression
    :   conditionalAndExpression ( '||' conditionalAndExpression )*
    ;

//与门
conditionalAndExpression
    :   equalityExpression ( '&&' equalityExpression )*
    ;

//等同
equalityExpression
    :   relationalExpression ( op=('==' | '!=') relationalExpression )*
    ;

//比较关系
relationalExpression
    :   additiveExpression ( relationalOp additiveExpression )*
    ;

//比较关系运算符
relationalOp
    :   '<='
    |   '>='
    |   '<'
    |   '>'
    ;

//加减
additiveExpression
    :   multiplicativeExpression ( op=('+' | '-') multiplicativeExpression )*
    ;

//乘除
multiplicativeExpression
    :   unaryExpression ( op=( '*' | '/' | '%' ) unaryExpression )*
    ;

//一元表达式
unaryExpression
    :   '!' unaryExpression
    |   castExpression
    |   basicExpression
    ;

basicExpression
    :   primary selector*
    ;


//强制类型转换表达式
castExpression
    :  '(' type ')' unaryExpression
    ;

//初级表达式
primary
    :   '(' expression ')'
    |   var
    |   'this' arguments?
    |   'super' superSuffix
    |   number
    |   constructorCall
    ;

//变量
var
    :   THIS selector+
    |   SUPER selector+
    |   Identifier identifierSuffix? selector*
    ;

identifierSuffix
    :   '[' conditionalExpression ']'
    |   arguments
    ;

selectorSuffix
	:	'super' superSuffix
	|	Identifier arguments
	;

selector
    :   '.' Identifier arguments?
	|	'.' selectorSuffix
    |   '.' 'this'
    |   '.' 'super' superSuffix
    |   '[' expression ']'
    ;

superSuffix
    :   arguments
    ;

arguments
    :   '(' expressionList? ')'
    ;

functionBody
    :   statement*
    ;

statement
    :   fieldDeclaration
    |   statementExpression
    |   IF'('expression')' block (ELSE block)?
    |   FOR '(' forControl ')' block
    |   WHILE '(' expression ')' block
    |   DO block WHILE '{' expression '}' ';'
    |   ';'
    |   selfAddOrMinusExpression ';'
    |   TRY block  STORE '(' Identifier ')' ';'
    ;

block
    :   '{' statement* '}'
    ;

selfAddOrMinusExpression
    :   Identifier ('++'|'--')
    ;

forControl
    :   forInit? ';' expression? ';' forUpdate?
    ;

forInit
    :   forVariableDeclaration
    |   expressionList
    ;

forUpdate
    :   expressionList
    ;

forVariableDeclaration
    :   type Identifier '=' expression
    ;

expressionList
    :   expression (',' expression)*
    ;

type
    :   'int'
    |   'float'
    |   'string'
    |   'bool'
    |   'decimal'
    |   className
    ;

number
    :   INT
    |   DECIMAL
    ;

className
    :   ClassIdentifier
    |   InsideClass
    ;

namespaceID
    :   Identifier (':' Identifier)?
    ;

THIS:'this';
SUPER:'super';
IF:'if';
ELSE:'else';
WHILE:'while';
FOR:'for';
DO:'do';
TRY:'try';
STORE:'store';

Identifier
    :   [a-z]+
    ;

InsideClass
    :   'entity'
    |   'pos'
    |   VEC INT
    ;

ClassIdentifier
    :   [A-Z][a-z]*
    ;

INT
    :   [1-9][0-9]*|[0]
    ;

DECIMAL
    :   INT
    |   INT '.' [0-9]+
    ;

VEC
    :   'vec'
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