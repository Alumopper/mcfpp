grammar mcfpp;

@header{
package top.alumopper.mcfpp.lib;
}

//一个mcfpp文件
compilationUnit
    :   namespaceDeclaration?
        typeDeclaration *
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
    |   nativeFuncDeclaration
    |   nativeClassDeclaration
    ;

//类声明
classDeclaration
    :   STATIC? FINAL? 'class' className (EXTENDS className)? classBody
    ;

nativeClassDeclaration
    :   NATIVE 'class' className '->' javaRefer ';'
    ;


classBody
    :   '{' (classMemberDeclaration|staticClassMemberDeclaration)* '}'
    ;

staticClassMemberDeclaration
    :   accessModifier? STATIC classMember
    ;

classMemberDeclaration
    :   accessModifier? classMember
    ;

//类成员
classMember
    :   classFunctionDeclaration
    |   fieldDeclaration ';'
    |   constructorDeclaration
    |   nativeFuncDeclaration
    |   nativeConstructorDeclaration
    ;

classFunctionDeclaration
    :    'func' Identifier '(' parameterList? ')' '{' functionBody '}'
    ;

//函数声明
functionDeclaration
    :    INLINE? functionTag? 'func' namespaceID '(' parameterList? ')' '{' functionBody '}'
    ;

namespaceID
    : (Identifier ':')? Identifier
    ;

nativeFuncDeclaration
    :   accessModifier? NATIVE 'func' Identifier '(' parameterList? ')' '->' javaRefer ';'
    ;

javaRefer
    :   stringName ('.' stringName)*
    ;

stringName
    :   Identifier
    |   ClassIdentifier
    |   NORMALSTRING
    ;

accessModifier
    :   PRIVATE
    |   PROTECTED
    |   PUBLIC
    ;

//构造函数声明
constructorDeclaration
    :   className '(' parameterList? ')' '{' functionBody '}'
    ;

//构造函数声明
nativeConstructorDeclaration
    :   accessModifier? NATIVE? className '(' parameterList? ')' '->' javaRefer ';'
    ;

//构造函数的调用
constructorCall
    :   'new' className arguments
    ;

//变量声明
fieldDeclaration
    :   CONST? type Identifier
    |   CONST? type Identifier '=' expression
    ;

//参数列表
parameterList
    :   parameter (',' parameter)*
    ;

//参数
parameter
    :   STATIC? CONCRETE? type Identifier
    ;

//表达式
expression
    :   conditionalOrExpression
    ;

//能作为语句的表达式
statementExpression
    :   basicExpression '=' expression
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
    |   value
    ;

varWithSelector
    : var selector*
    | className selector+
    ;

var
    :   '(' expression ')'
    |   Identifier identifierSuffix*
    |   THIS
    |   SUPER
    |   constructorCall
    |   TargetSelector
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
    :   namespaceID arguments
    |   'this' arguments
    |   'super' arguments
    |   basicExpression arguments
    ;

statement
    :   fieldDeclaration ';'
    |   statementExpression ';'
    |   functionCall ';'
    |   ifStatement
    |   forStatement
    |   whileStatement
    |   doWhileStatement ';'
    |   ';'
    |   selfAddOrMinusStatement ';'
    |   tryStoreStatement
    |   controlStatement ';'
    |   orgCommand
    ;

orgCommand
    :   OrgCommand
    ;

OrgCommand
    :   '/' [a-z]* ([ ][a-z:_{}\\[0-9A-Z\]]*)+
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
    :   forInit* ';' expression? ';' forUpdate
    ;

forInit
    :   fieldDeclaration
    |   statementExpression
    ;

forUpdate
    :   statementExpression*
    ;

whileStatement
    :   WHILE '(' expression ')' whileBlock
    ;

whileBlock
    :   block
    ;

doWhileStatement
    :   DO doWhileBlock WHILE '(' expression ')'
    ;

doWhileBlock
    :   block
    ;

selfAddOrMinusStatement
    :   selfAddOrMinusExpression
    ;

tryStoreStatement
    :   TRY block  STORE '(' Identifier ')' ';'
    ;

block
    :   '{' statement* '}'
    ;

selfAddOrMinusExpression
    :   Identifier op = ('++'|'--')
    ;

expressionList
    :   expression (',' expression)*
    ;

type
    :   'int'
    |   'bool'
    |   className
    ;

value
    :   INT
    |   DECIMAL
    |   STRING
    ;

className
    :   (Identifier ':')? ClassIdentifier
    |   (Identifier ':')? InsideClass
    ;

functionTag
    :   namespaceID
    ;

TargetSelector
    :   '@' ('a'|'r'|'p'|'s'|'e')
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
EXTENDS:'extends';
NATIVE:'native';
CONCRETE:'concrete';
FINAL:'final ';

PUBLIC:'public';
PROTECTED:'protected';
PRIVATE:'private';

CONST:'const';
INLINE:'inline';

InsideClass
    :   'entity'
    |   'selector'
    |   'string'
    |   VEC INT
    ;

INT
    :   [1-9][0-9]*|[0]
    ;

DECIMAL
    :   INT
    |   INT '.' [0-9]+
    ;

VEC:'vec';

WAVE:'~';

Identifier
    :   [a-z0-9_]+
    ;

ClassIdentifier
    :   [A-Z][a-zA-Z0-9_]*
    ;

NORMALSTRING
    :   [A-Za-z0-9_]+
    ;

STRING
    :   '"' .*? '"'
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