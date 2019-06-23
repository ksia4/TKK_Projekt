grammar CPPGrama;

unitToTranslate
   : declarationSequence? EOF
   ;


unqualifiedID
   : Identifier
   | functionOperatorID
   | functionConversionID
   | literalOperatorID
   | '~' classname
   ;

unaryExpression
   : postfixExpression
   | '++' castExpression
   | '--' castExpression
   | unaryOperator castExpression
   | Sizeof unaryExpression
   | Sizeof '(' theTypeID ')'
   | Sizeof '...' '(' Identifier ')'
   | noExceptExpression
   | newExpression
   | deleteExpression
   ;

unaryOperator
   : '|'
   | '*'
   | '&'
   | '+'
   | '!'
   | '~'
   | '-'
   | 'not'
   ;


primaryExpression
   : literal
   | This
   | '(' expression ')'
   | unqualifiedID
   ;


nestedNameSpecifier
   : '::'
   | theTypename '::'
   | originalNamespacename '::'
   | nestedNameSpecifier Identifier '::'
   ;

defaultCapture
   : '&'
   | '='
   ;

captureList
   : capture '...'?
   | captureList ',' capture '...'?
   ;

capture
   : simpleCapture
   | initCapture
   ;

simpleCapture
   : Identifier
   | '&' Identifier
   | This
   ;

initCapture
   : Identifier initializer
   | '&' Identifier initializer
   ;


postfixExpression
   : primaryExpression
   | postfixExpression '[' expression ']'
   | postfixExpression '[' bracedInitList ']'
   | postfixExpression '(' expressionlist? ')'
   | simpleTypeSpecifier '(' expressionlist? ')'
   | typenameSpecifier '(' expressionlist? ')'
   | simpleTypeSpecifier bracedInitList
   | typenameSpecifier bracedInitList
   | postfixExpression '.' pseudoDestructorName
   | postfixExpression '->' pseudoDestructorName
   | postfixExpression '++'
   | postfixExpression '--'
   | Dynamic_cast '<' theTypeID '>' '(' expression ')'
   | Static_cast '<' theTypeID '>' '(' expression ')'
   | Reinterpret_cast '<' theTypeID '>' '(' expression ')'
   | Const_cast '<' theTypeID '>' '(' expression ')'
   | typeIDofTheTypeID '(' expression ')'
   | typeIDofTheTypeID '(' theTypeID ')'
   ;

typeIDofExpr
   : Typeid
   ;

typeIDofTheTypeID
   : Typeid
   ;

expressionlist
   : initializerList
   ;

pseudoDestructorName
   : nestedNameSpecifier? theTypename '::' '~' theTypename
   | nestedNameSpecifier? '~' theTypename
   ;


newExpression
   : '::'? New newPlacement? newTypeID newInitializer?
   | '::'? New newPlacement? '(' theTypeID ')' newInitializer?
   ;

newPlacement
   : '(' expressionlist ')'
   ;

newTypeID
   : typeSpecifierSequence newDeclarator?
   ;

newDeclarator
   : ptrOperator newDeclarator?
   | noptrNewDeclarator
   ;

noptrNewDeclarator
   : '[' expression ']' attributeSpecifierSequence?
   | noptrNewDeclarator '[' constantExpression ']' attributeSpecifierSequence?
   ;

newInitializer
   : '(' expressionlist? ')'
   | bracedInitList
   ;

deleteExpression
   : '::'? Delete castExpression
   | '::'? Delete '[' ']' castExpression
   ;

noExceptExpression
   : Noexcept '(' expression ')'
   ;

castExpression
   : unaryExpression
   | '(' theTypeID ')' castExpression
   ;

pmExpression
   : castExpression
   | pmExpression '.*' castExpression
   | pmExpression '->*' castExpression
   ;

mulExpression
   : pmExpression
   | mulExpression '*' pmExpression
   | mulExpression '/' pmExpression
   | mulExpression '%' pmExpression
   ;

addExpression
   : mulExpression
   | addExpression '+' mulExpression
   | addExpression '-' mulExpression
   ;

shiftExpression
   : addExpression
   | shiftExpression shiftOperator addExpression
   ;

shiftOperator
  : RightShift
  | LeftShift
  ;

relationalExpression
   : shiftExpression
   | relationalExpression '<' shiftExpression
   | relationalExpression '>' shiftExpression
   | relationalExpression '<=' shiftExpression
   | relationalExpression '>=' shiftExpression
   ;

eqExpression
   : relationalExpression
   | eqExpression '==' relationalExpression
   | eqExpression '!=' relationalExpression
   ;

andExpression
   : eqExpression
   | andExpression '&' eqExpression
   ;

exorExpression
   : andExpression
   | exorExpression '^' andExpression
   ;

inclusiveorExpression
   : exorExpression
   | inclusiveorExpression '|' exorExpression
   ;

logicandExpression
   : inclusiveorExpression
   | logicandExpression '&&' inclusiveorExpression
   | logicandExpression 'and' inclusiveorExpression
   ;

logicorExpression
   : logicandExpression
   | logicorExpression '||' logicandExpression
   | logicorExpression 'or' logicandExpression
   ;

conditionExpression
   : logicorExpression
   | logicorExpression '?' expression ':' assignmentExpression
   ;

assignmentExpression
   : conditionExpression
   | logicorExpression assignmentOperator initializerclause
   | throwexpression
   ;

assignmentOperator
   : '='
   | '*='
   | '/='
   | '%='
   | '+='
   | '-='
   | RightShiftAssign
   | LeftShiftAssign
   | '&='
   | '^='
   | '|='
   ;

expression
   : assignmentExpression
   | expression ',' assignmentExpression
   ;

constantExpression
   : conditionExpression
   ;


statement
   : labeledStatement
   | attributeSpecifierSequence? expressionStatement
   | attributeSpecifierSequence? compoundStatement
   | attributeSpecifierSequence? selectStatement
   | attributeSpecifierSequence? iterationStatement
   | attributeSpecifierSequence? jumpStatement
   | declarationStatement
   | attributeSpecifierSequence? tryblock
   ;

labeledStatement
   : attributeSpecifierSequence? Identifier ':' statement
   | attributeSpecifierSequence? Case constantExpression ':' statement
   | attributeSpecifierSequence? Default ':' statement
   ;

expressionStatement
   : expression? ';'
   ;

compoundStatement
   : '{' statementSequence? '}'
   ;

statementSequence
   : statement
   | statementSequence statement
   ;

selectStatement
   : If '(' condition ')' statement
   | If '(' condition ')' statement Else statement
   | Switch '(' condition ')' statement
   ;

condition
   : expression
   | attributeSpecifierSequence? declSpecifierSequence declarator '=' initializerclause
   | attributeSpecifierSequence? declSpecifierSequence declarator bracedInitList
   ;

iterationStatement
   : While '(' condition ')' statement
   | Do statement While '(' expression ')' ';'
   | For '(' forInitStatement condition? ';' expression? ')' statement
   | For '(' forRangeDeclaration ':' forRangeInitializer ')' statement
   ;

forInitStatement
   : expressionStatement
   | simpleDeclaration
   ;

forRangeDeclaration
   : attributeSpecifierSequence? declSpecifierSequence declarator
   ;

forRangeInitializer
   : expression
   | bracedInitList
   ;

jumpStatement
   : Break ';'
   | Continue ';'
   | Return expression? ';'
   | Return bracedInitList ';'
   | Goto Identifier ';'
   ;

declarationStatement
   : blockDeclaration
   ;


declarationSequence
   : declaration
   | declarationSequence declaration
   ;

declaration
   : blockDeclaration
   | functiondefinition
   | linkagespecification
   | namespaceDefinition
   | emptyDeclaration
   | attributeDeclaration
   ;

blockDeclaration
   : simpleDeclaration
   | usingdeclaration
   | usingdirective
   | opaqueEnumDeclaration
   ;


simpleDeclaration
   : declSpecifierSequence? initdeclaratorlist? ';'
   | attributeSpecifierSequence declSpecifierSequence? initdeclaratorlist ';'
   ;

emptyDeclaration
   : ';'
   ;

attributeDeclaration
   : attributeSpecifierSequence ';'
   ;

declSpecifier
   : storageClassSpecifier
   | typeSpecifier
   | functionSpecifier
   | Friend
   | Typedef
   | Constexpr
   ;

declSpecifierSequence
   : declSpecifier attributeSpecifierSequence?
   | declSpecifier declSpecifierSequence
   ;

storageClassSpecifier
   : Static
   | Extern
   ;

functionSpecifier
   : Inline
   | Virtual
   | Explicit
   ;

typedefName
   : Identifier
   ;

typeSpecifier
   : trailingTypeSpecifier
   | classspecifier
   | enumSpecifier
   ;

trailingTypeSpecifier
   : simpleTypeSpecifier
   | elaboratedTypeSpecifier
   | typenameSpecifier
   | cvqualifier
   ;

typeSpecifierSequence
   : typeSpecifier attributeSpecifierSequence?
   | typeSpecifier typeSpecifierSequence
   ;

trailingTypeSpecifierSequence
   : trailingTypeSpecifier attributeSpecifierSequence?
   | trailingTypeSpecifier trailingTypeSpecifierSequence
   ;

simpleTypeSpecifier
   : nestedNameSpecifier? theTypename
   | Char
   | Char16
   | Char32
   | Bool
   | Short
   | Int
   | Long
   | Signed
   | Unsigned
   | Float
   | Double
   | Void
   | Auto
   ;

theTypename
   : classname
   | enumname
   | typedefName
   ;

elaboratedTypeSpecifier
   : classkey attributeSpecifierSequence? nestedNameSpecifier? Identifier
   | Enum nestedNameSpecifier? Identifier
   ;

enumname
   : Identifier
   ;

enumSpecifier
   : enumHead '{' enumeratorlist? '}'
   | enumHead '{' enumeratorlist ',' '}'
   ;

enumHead
   : enumKey attributeSpecifierSequence? Identifier? enumBase?
   | enumKey attributeSpecifierSequence? nestedNameSpecifier Identifier enumBase?
   ;

opaqueEnumDeclaration
   : enumKey attributeSpecifierSequence? Identifier enumBase? ';'
   ;

enumKey
   : Enum
   | Enum Class
   | Enum Struct
   ;

enumBase
   : ':' typeSpecifierSequence
   ;

enumeratorlist
   : enumeratorDefinition
   | enumeratorlist ',' enumeratorDefinition
   ;

enumeratorDefinition
   : enumerator
   | enumerator '=' constantExpression
   ;

enumerator
   : Identifier
   ;

originalNamespacename
   : Identifier
   ;

namespaceDefinition
   : namednamespacedefinition
   | unnamedNamesPaceDefinition
   ;

namednamespacedefinition
   : originalNamespaceDefinition
   | extensionNamespaceDefinition
   ;

originalNamespaceDefinition
   : Inline? Namespace Identifier '{' namespaceBody '}'
   ;

extensionNamespaceDefinition
   : Inline? Namespace originalNamespacename '{' namespaceBody '}'
   ;

unnamedNamesPaceDefinition
   : Inline? Namespace '{' namespaceBody '}'
   ;

namespaceBody
   : declarationSequence?
   ;

qualifiednamespacespecifier
   : nestedNameSpecifier? originalNamespacename
   ;

usingdeclaration
   : Using Typename? nestedNameSpecifier unqualifiedID ';'
   | Using '::' unqualifiedID ';'
   ;

usingdirective
   : attributeSpecifierSequence? Using Namespace nestedNameSpecifier? originalNamespacename ';'
   ;

linkagespecification
   : Extern Stringliteral '{' declarationSequence? '}'
   | Extern Stringliteral declaration
   ;

attributeSpecifierSequence
   : attributespecifier
   | attributeSpecifierSequence attributespecifier
   ;

attributespecifier
   : '[' '[' attributelist ']' ']'
   ;

attributelist
   : attribute?
   | attributelist ',' attribute?
   | attribute '...'
   | attributelist ',' attribute '...'
   ;

attribute
   : attributetoken attributeargumentclause?
   ;

attributetoken
   : Identifier
   | attributescopedtoken
   ;

attributescopedtoken
   : attributenamespace '::' Identifier
   ;

attributenamespace
   : Identifier
   ;

attributeargumentclause
   : '(' balancedtokenseq ')'
   ;

balancedtokenseq
   : balancedtoken?
   | balancedtokenseq balancedtoken
   ;

balancedtoken
   : '(' balancedtokenseq ')'
   | '[' balancedtokenseq ']'
   | '{' balancedtokenseq '}'
   ;

initdeclaratorlist
   : initdeclarator
   | initdeclaratorlist ',' initdeclarator
   ;

initdeclarator
   : declarator initializer?
   ;

declarator
   : ptrdeclarator
   | noptrdeclarator parametersandqualifiers trailingreturntype
   ;

ptrdeclarator
   : noptrdeclarator
   | ptrOperator ptrdeclarator
   ;

noptrdeclarator
   : declaratorid attributeSpecifierSequence?
   | noptrdeclarator parametersandqualifiers
   | noptrdeclarator '[' constantExpression? ']' attributeSpecifierSequence?
   | '(' ptrdeclarator ')'
   ;

parametersandqualifiers
   : '(' parameterdeclarationclause ')' cvqualifierseq? refqualifier? exceptionspecification? attributeSpecifierSequence?
   ;

trailingreturntype
   : '->' trailingTypeSpecifierSequence abstractdeclarator?
   ;

ptrOperator
   : '*' attributeSpecifierSequence? cvqualifierseq?
   | '&' attributeSpecifierSequence?
   | '&&' attributeSpecifierSequence?
   | nestedNameSpecifier '*' attributeSpecifierSequence? cvqualifierseq?
   ;

cvqualifierseq
   : cvqualifier cvqualifierseq?
   ;

cvqualifier
   : Const
   ;

refqualifier
   : '&'
   | '&&'
   ;

declaratorid
   : '...'? unqualifiedID
   ;

theTypeID
   : typeSpecifierSequence abstractdeclarator?
   ;

abstractdeclarator
   : ptrabstractdeclarator
   | noptrabstractdeclarator? parametersandqualifiers trailingreturntype
   | abstractpackdeclarator
   ;

ptrabstractdeclarator
   : noptrabstractdeclarator
   | ptrOperator ptrabstractdeclarator?
   ;

noptrabstractdeclarator
   : noptrabstractdeclarator parametersandqualifiers
   | parametersandqualifiers
   | noptrabstractdeclarator '[' constantExpression? ']' attributeSpecifierSequence?
   | '[' constantExpression? ']' attributeSpecifierSequence?
   | '(' ptrabstractdeclarator ')'
   ;

abstractpackdeclarator
   : noptrabstractpackdeclarator
   | ptrOperator abstractpackdeclarator
   ;

noptrabstractpackdeclarator
   : noptrabstractpackdeclarator parametersandqualifiers
   | noptrabstractpackdeclarator '[' constantExpression? ']' attributeSpecifierSequence?
   | '...'
   ;

parameterdeclarationclause
   : parameterdeclarationlist? '...'?
   | parameterdeclarationlist ',' '...'
   ;

parameterdeclarationlist
   : parameterdeclaration
   | parameterdeclarationlist ',' parameterdeclaration
   ;

parameterdeclaration
   : attributeSpecifierSequence? declSpecifierSequence declarator
   | attributeSpecifierSequence? declSpecifierSequence declarator '=' initializerclause
   | attributeSpecifierSequence? declSpecifierSequence abstractdeclarator?
   | attributeSpecifierSequence? declSpecifierSequence abstractdeclarator? '=' initializerclause
   ;

functiondefinition
   : attributeSpecifierSequence? declSpecifierSequence? declarator virtspecifierseq? functionbody
   ;

functionbody
   : ctorinitializer? compoundStatement
   | functiontryblock
   | '=' Default ';'
   | '=' Delete ';'
   ;

initializer
   : braceorequalinitializer
   | '(' expressionlist ')'
   ;

braceorequalinitializer
   : '=' initializerclause
   | bracedInitList
   ;

initializerclause
   : assignmentExpression
   | bracedInitList
   ;

initializerList
   : initializerclause '...'?
   | initializerList ',' initializerclause '...'?
   ;

bracedInitList
   : '{' initializerList ','? '}'
   | '{' '}'
   ;


classname
   : Identifier
   ;

classspecifier
   : classhead '{' memberspecification? '}'
   ;

classhead
   : classkey attributeSpecifierSequence? classheadname classvirtspecifier? baseclause?
   | classkey attributeSpecifierSequence? baseclause?
   ;

classheadname
   : nestedNameSpecifier? classname
   ;

classvirtspecifier
   : Final
   ;

classkey
   : Class
   | Struct
   | Union
   ;

memberspecification
   : memberdeclaration memberspecification?
   | accessspecifier ':' memberspecification?
   ;

memberdeclaration
   : attributeSpecifierSequence? declSpecifierSequence? memberdeclaratorlist? ';'
   | functiondefinition
   | usingdeclaration
   | emptyDeclaration
   ;

memberdeclaratorlist
   : memberdeclarator
   | memberdeclaratorlist ',' memberdeclarator
   ;

memberdeclarator
   : declarator virtspecifierseq? purespecifier?
   | declarator braceorequalinitializer?
   | Identifier? attributeSpecifierSequence? ':' constantExpression
   ;

virtspecifierseq
   : virtspecifier
   | virtspecifierseq virtspecifier
   ;

virtspecifier
   : Override
   | Final
   ;


purespecifier
   : Assign val = Octalliteral
   {if($val.text.compareTo("0")!=0) throw new InputMismatchException(this);}
   ;


baseclause
   : ':' basespecifierlist
   ;

basespecifierlist
   : basespecifier '...'?
   | basespecifierlist ',' basespecifier '...'?
   ;

basespecifier
   : attributeSpecifierSequence? basetypespecifier
   | attributeSpecifierSequence? Virtual accessspecifier? basetypespecifier
   | attributeSpecifierSequence? accessspecifier Virtual? basetypespecifier
   ;

classordecltype
   : nestedNameSpecifier? classname
   ;

basetypespecifier
   : classordecltype
   ;

accessspecifier
   : Private
   | Protected
   | Public
   ;


functionConversionID
   : Operator conversiontypeid
   ;

conversiontypeid
   : typeSpecifierSequence conversiondeclarator?
   ;

conversiondeclarator
   : ptrOperator conversiondeclarator?
   ;

ctorinitializer
   : ':' meminitializerlist
   ;

meminitializerlist
   : meminitializer '...'?
   | meminitializer '...'? ',' meminitializerlist
   ;

meminitializer
   : meminitializerid '(' expressionlist? ')'
   | meminitializerid bracedInitList
   ;

meminitializerid
   : classordecltype
   | Identifier
   ;


functionOperatorID
   : Operator theoperator
   ;

literalOperatorID
   : Operator Stringliteral Identifier
   | Operator Userdefinedstringliteral
   ;

typeparameter
   : Class '...'? Identifier?
   | Class Identifier? '=' theTypeID
   | Typename '...'? Identifier?
   | Typename Identifier? '=' theTypeID
   ;


typenameSpecifier
   : Typename nestedNameSpecifier Identifier
   ;


tryblock
   : Try compoundStatement handlerseq
   ;

functiontryblock
   : Try ctorinitializer? compoundStatement handlerseq
   ;

handlerseq
   : handler handlerseq?
   ;

handler
   : Catch '(' exceptiondeclaration ')' compoundStatement
   ;

exceptiondeclaration
   : attributeSpecifierSequence? typeSpecifierSequence declarator
   | attributeSpecifierSequence? typeSpecifierSequence abstractdeclarator?
   | '...'
   ;

throwexpression
   : Throw assignmentExpression?
   ;

exceptionspecification
   : dynamicexceptionspecification
   | noexceptspecification
   ;

dynamicexceptionspecification
   : Throw '(' typeidlist? ')'
   ;

typeidlist
   : theTypeID '...'?
   | typeidlist ',' theTypeID '...'?
   ;

noexceptspecification
   : Noexcept '(' constantExpression ')'
   | Noexcept
   ;


Directive
   : '#' ~ [\n]* -> channel (HIDDEN)
   ;
/*Lexer*/

/*Keywords*/

Auto
   : 'auto'
   ;

Bool
   : 'bool'
   ;

Break
   : 'break'
   ;

Case
   : 'case'
   ;

Catch
   : 'catch'
   ;

Char
   : 'char'
   ;

Char16
   : 'char16_t'
   ;

Char32
   : 'char32_t'
   ;

Class
   : 'class'
   ;

Const
   : 'const'
   ;

Constexpr
   : 'constexpr'
   ;

Const_cast
   : 'const_cast'
   ;

Continue
   : 'continue'
   ;

Default
   : 'default'
   ;

Delete
   : 'delete'
   ;

Do
   : 'do'
   ;

Double
   : 'double'
   ;

Dynamic_cast
   : 'dynamic_cast'
   ;

Else
   : 'else'
   ;

Enum
   : 'enum'
   ;

Explicit
   : 'explicit'
   ;

Export
   : 'export'
   ;

Extern
   : 'extern'
   ;

False
   : 'false'
   ;

Final
   : 'final'
   ;

Float
   : 'float'
   ;

For
   : 'for'
   ;

Friend
   : 'friend'
   ;

Goto
   : 'goto'
   ;

If
   : 'if'
   ;

Inline
   : 'inline'
   ;

Int
   : 'int'
   ;

Long
   : 'long'
   ;

Namespace
   : 'namespace'
   ;

New
   : 'new'
   ;

Noexcept
   : 'noexcept'
   ;

Nullptr
   : 'nullptr'
   ;

Operator
   : 'operator'
   ;

Override
   : 'override'
   ;

Private
   : 'private'
   ;

Protected
   : 'protected'
   ;

Public
   : 'public'
   ;

Reinterpret_cast
   : 'reinterpret_cast'
   ;

Return
   : 'return'
   ;

Short
   : 'short'
   ;

Signed
   : 'signed'
   ;

Sizeof
   : 'sizeof'
   ;

Static
   : 'static'
   ;

Static_cast
   : 'static_cast'
   ;

Struct
   : 'struct'
   ;

Switch
   : 'switch'
   ;

This
   : 'this'
   ;

Throw
   : 'throw'
   ;

True
   : 'true'
   ;

Try
   : 'try'
   ;

Typedef
   : 'typedef'
   ;

Typeid
   : 'typeid'
   ;

Typename
   : 'typename'
   ;

Union
   : 'union'
   ;

Unsigned
   : 'unsigned'
   ;

Using
   : 'using'
   ;

Virtual
   : 'virtual'
   ;

Void
   : 'void'
   ;

While
   : 'while'
   ;
/*Operators*/


LeftParen
   : '('
   ;

RightParen
   : ')'
   ;

LeftBracket
   : '['
   ;

RightBracket
   : ']'
   ;

LeftBrace
   : '{'
   ;

RightBrace
   : '}'
   ;

Plus
   : '+'
   ;

Minus
   : '-'
   ;

Star
   : '*'
   ;

Div
   : '/'
   ;

Mod
   : '%'
   ;

Caret
   : '^'
   ;

And
   : '&'
   ;

Or
   : '|'
   ;

Tilde
   : '~'
   ;

Not
   : '!'
   | 'not'
   ;

Assign
   : '='
   ;

Less
   : '<'
   ;

Greater
   : '>'
   ;

PlusAssign
   : '+='
   ;

MinusAssign
   : '-='
   ;

StarAssign
   : '*='
   ;

DivAssign
   : '/='
   ;

ModAssign
   : '%='
   ;

XorAssign
   : '^='
   ;

AndAssign
   : '&='
   ;

OrAssign
   : '|='
   ;

LeftShift
   : '<<'
   ;

RightShift
   :
   '>>'
   ;

LeftShiftAssign
   : '<<='
   ;

RightShiftAssign
   :
   '>>='
   ;

Equal
   : '=='
   ;

NotEqual
   : '!='
   ;

LessEqual
   : '<='
   ;

GreaterEqual
   : '>='
   ;

AndAnd
   : '&&'
   | 'and'
   ;

OrOr
   : '||'
   | 'or'
   ;

PlusPlus
   : '++'
   ;

MinusMinus
   : '--'
   ;

Comma
   : ','
   ;

ArrowStar
   : '->*'
   ;

Arrow
   : '->'
   ;

Question
   : '?'
   ;

Colon
   : ':'
   ;

Doublecolon
   : '::'
   ;

Semi
   : ';'
   ;

Dot
   : '.'
   ;

DotStar
   : '.*'
   ;

theoperator
   : New
   | Delete
   | New '[' ']'
   | Delete '[' ']'
   | '+'
   | '-'
   | '*'
   | '/'
   | '%'
   | '^'
   | '&'
   | '|'
   | '~'
   | '!'
   | 'not'
   | '='
   | '<'
   | '>'
   | '+='
   | '-='
   | '*='
   | '/='
   | '%='
   | '^='
   | '&='
   | '|='
   | LeftShift
   | RightShift
   | RightShiftAssign
   | LeftShiftAssign
   | '=='
   | '!='
   | '<='
   | '>='
   | '&&'
   | 'and'
   | '||'
   | 'or'
   | '++'
   | '--'
   | ','
   | '->*'
   | '->'
   | '(' ')'
   | '[' ']'
   ;


Identifier
   :
   NONDIGIT (NONDIGIT | DIGIT)*
   ;

fragment NONDIGIT
   : [a-zA-Z_]
   ;

fragment DIGIT
   : [0-9]
   ;

literal
   : Integerliteral
   | Characterliteral
   | Floatingliteral
   | Stringliteral
   | booleanliteral
   | pointerliteral
   | userdefinedliteral
   ;

Integerliteral
   : Decimalliteral Integersuffix?
   | Octalliteral Integersuffix?
   | Hexadecimalliteral Integersuffix?
   | Binaryliteral Integersuffix?
   ;

Decimalliteral
   : NONZERODIGIT (DIGIT)*
   ;

Octalliteral
   : '0' (OCTALDIGIT)*
   ;

Hexadecimalliteral
   : ('0x' | '0X') HEXADECIMALDIGIT (HEXADECIMALDIGIT)*
   ;

Binaryliteral
   : ('0b' | '0B') BINARYDIGIT (BINARYDIGIT)*
   ;

fragment NONZERODIGIT
   : [1-9]
   ;

fragment OCTALDIGIT
   : [0-7]
   ;

fragment HEXADECIMALDIGIT
   : [0-9a-fA-F]
   ;

fragment BINARYDIGIT
   : [01]
   ;

Integersuffix
   : [uU] [lL]?
   | [uU] Longlongsuffix?
   | [lL] [uU]?
   | Longlongsuffix [uU]?
   ;

fragment Longlongsuffix
   : 'll'
   | 'LL'
   ;

Characterliteral
   : '\'' Cchar+ '\''
   ;

fragment Cchar
   : ~ ['\\\r\n]
   | Escapesequence
   ;

fragment Escapesequence
   : Simpleescapesequence
   | Octalescapesequence
   | Hexadecimalescapesequence
   ;

fragment Simpleescapesequence
   : '\\\''
   | '\\"'
   | '\\?'
   | '\\\\'
   | '\\a'
   | '\\b'
   | '\\f'
   | '\\n'
   | '\\r'
   | '\\t'
   | '\\v'
   ;

fragment Octalescapesequence
   : '\\' OCTALDIGIT
   | '\\' OCTALDIGIT OCTALDIGIT
   | '\\' OCTALDIGIT OCTALDIGIT OCTALDIGIT
   ;

fragment Hexadecimalescapesequence
   : '\\x' HEXADECIMALDIGIT+
   ;

Floatingliteral
   : Fractionalconstant Exponentpart? Floatingsuffix?
   | Digitsequence Exponentpart Floatingsuffix?
   ;

fragment Fractionalconstant
   : Digitsequence? '.' Digitsequence
   | Digitsequence '.'
   ;

fragment Exponentpart
   : 'e' SIGN? Digitsequence
   | 'E' SIGN? Digitsequence
   ;

fragment SIGN
   : [+-]
   ;

fragment Digitsequence
   : DIGIT (DIGIT)*
   ;

fragment Floatingsuffix
   : [flFL]
   ;

Stringliteral
   : Encodingprefix? '"' Schar* '"'
   ;

fragment Encodingprefix
   : 'u8'
   | 'u'
   | 'U'
   ;

fragment Schar
   : ~ ["\\\r\n]
   | Escapesequence
   ;

fragment Rawstring
   : '"' .*? '(' .*? ')' .*? '"'
   ;

booleanliteral
   : False
   | True
   ;

pointerliteral
   : Nullptr
   ;

userdefinedliteral
   : Userdefinedintegerliteral
   | Userdefinedfloatingliteral
   | Userdefinedstringliteral
   | Userdefinedcharacterliteral
   ;

Userdefinedintegerliteral
   : Decimalliteral Udsuffix
   | Octalliteral Udsuffix
   | Hexadecimalliteral Udsuffix
   | Binaryliteral Udsuffix
   ;

Userdefinedfloatingliteral
   : Fractionalconstant Exponentpart? Udsuffix
   | Digitsequence Exponentpart Udsuffix
   ;

Userdefinedstringliteral
   : Stringliteral Udsuffix
   ;

Userdefinedcharacterliteral
   : Characterliteral Udsuffix
   ;

fragment Udsuffix
   : Identifier
   ;

Whitespace
   : [ \t]+ -> skip
   ;

Newline
   : ('\r' '\n'? | '\n') -> skip
   ;

BlockComment
   : '/*' .*? '*/' -> skip
   ;

LineComment
   : '//' ~ [\r\n]* -> skip
   ;
