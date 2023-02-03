grammar mcfpp;

@header{
package top.alumopper.mcfpp.lib;
}

//一个mcfpp文件
compilationUnit
    :   namespaceDeclaration?
        (   namespaceDeclaration
        |   typeDeclaration
        |   fieldDeclaration
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
    :   STATIC? type Identifier
    ;

//表达式
expression
    :   conditionalOrExpression
    ;

//能作为语句的表达式
statementExpression
    :   varWithSelector '=' expression ';'
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
    :   additiveExpression ( relationalOp additiveExpression )?
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
    :   primary
    |   varWithSelector
    ;

//强制类型转换表达式
castExpression
    :  '(' type ')' unaryExpression
    ;

//初级表达式
primary
    :   var
    |   number
    ;

varWithSelector
    : var selector*
    ;

var
    :   '(' expression ')'
    |   Identifier identifierSuffix*
    |   'this'
    |   'super'
    |   constructorCall
    ;

identifierSuffix
    :   '[' conditionalExpression ']'
    ;

selector
    :   '.' var
    ;

arguments
    :   '(' expressionList? ')'
    ;

functionBody
    :   statement*
    ;

functionCall
    :   Identifier arguments
    |   'this' arguments
    |   'super' arguments
    |   (basicExpression '.') Identifier arguments
    ;

statement
    :   fieldDeclaration
    |   statementExpression
    |   functionCall
    |   ifStatement
    |   forStatement
    |   whileStatement
    |   doWhileStatement
    |   ';'
    |   selfAddOrMinusStatement
    |   tryStoreStatement
    |   controlStatement
    ;

controlStatement
    :   BREAK
    |   CONTINUE
    ;

ifStatement
    :   IF'('expression')' ifBlock (ELSE (elseIfStatement|ifBlock))?
    ;

elseIfStatement
    :   ifStatement
    ;

ifBlock
    :   block
    ;

forStatement
    :   FOR '(' forControl ')' forBlock
    ;

forBlock
    :   block
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

whileStatement
    :   WHILE '(' expression ')' whileBlock
    ;

whileBlock
    :   block
    ;

doWhileStatement
    :   DO doWhileBlock WHILE '{' expression '}' ';'
    ;

doWhileBlock
    :   block
    ;

selfAddOrMinusStatement
    :   selfAddOrMinusExpression ';'
    ;

tryStoreStatement
    :   TRY block  STORE '(' Identifier ')' ';'
    ;

block
    :   '{' statement* '}'
    ;

selfAddOrMinusExpression
    :   Identifier ('++'|'--')
    ;

expressionList
    :   expression (',' expression)*
    ;

type
    :   'int'
    |   'string'
    |   'bool'
    |   'decimal'
    |   className
    ;

functionType
    :   'void'
    |   type
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

BREAK:'break';
CONTINUE:'continue';

STATIC:'static';

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