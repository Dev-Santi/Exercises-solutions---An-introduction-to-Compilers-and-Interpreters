JAVAC=javac
JAVAC_FLAGS=-sourcepath .
JAVA=java
JAVA_FLAGS=
PARSER=${JAVA} ${JAVA_FLAGS} java_cup.Main
PARSER_FLAGS=-nopositions -expect 100
LEXER=${JAVA} ${JAVA_FLAGS} JLex.Main
LEXER_FLAGS=
all : test

test : absyn Clike/Yylex.class Clike/PrettyPrinter.class Clike/Test.class Clike/ComposVisitor.class Clike/AbstractVisitor.class Clike/FoldVisitor.class Clike/AllVisitor.class Clike/parser.class Clike/sym.class Clike/Test.class

.PHONY : absyn

%.class : %.java
	${JAVAC} ${JAVAC_FLAGS} $^

absyn : Clike/Absyn/Program.java Clike/Absyn/PDefs.java Clike/Absyn/ListDef.java Clike/Absyn/Def.java Clike/Absyn/DFun.java Clike/Absyn/ListArg.java Clike/Absyn/ListStm.java Clike/Absyn/Arg.java Clike/Absyn/ADecl.java Clike/Absyn/Stm.java Clike/Absyn/SExp.java Clike/Absyn/SDecl.java Clike/Absyn/SDecls.java Clike/Absyn/SInit.java Clike/Absyn/SReturn.java Clike/Absyn/SWhile.java Clike/Absyn/SBlock.java Clike/Absyn/SIfElse.java Clike/Absyn/Exp.java Clike/Absyn/EInt.java Clike/Absyn/EDouble.java Clike/Absyn/EString.java Clike/Absyn/ETrue.java Clike/Absyn/EFalse.java Clike/Absyn/EId.java Clike/Absyn/ECall.java Clike/Absyn/EPIncr.java Clike/Absyn/EPDecr.java Clike/Absyn/EIncr.java Clike/Absyn/EDecr.java Clike/Absyn/ENeg.java Clike/Absyn/EMul.java Clike/Absyn/EDiv.java Clike/Absyn/EAdd.java Clike/Absyn/ESub.java Clike/Absyn/ELt.java Clike/Absyn/EGt.java Clike/Absyn/ELEq.java Clike/Absyn/EGEq.java Clike/Absyn/EEq.java Clike/Absyn/ENEq.java Clike/Absyn/EAnd.java Clike/Absyn/EOr.java Clike/Absyn/EAss.java Clike/Absyn/ListExp.java Clike/Absyn/Type.java Clike/Absyn/Tbool.java Clike/Absyn/Tdouble.java Clike/Absyn/Tint.java Clike/Absyn/Tstring.java Clike/Absyn/Tvoid.java Clike/Absyn/ListId.java
	${JAVAC} ${JAVAC_FLAGS} $^

Clike/Yylex.java : Clike/Yylex
	${LEXER} ${LEXER_FLAGS} Clike/Yylex

Clike/parser.java Clike/sym.java : Clike/_cup.cup
	${PARSER} ${PARSER_FLAGS} Clike/_cup.cup
	mv parser.java sym.java Clike/

Clike/Yylex.class : Clike/Yylex.java Clike/parser.java Clike/sym.java

Clike/sym.class : Clike/sym.java

Clike/parser.class : Clike/parser.java Clike/sym.java

Clike/PrettyPrinter.class : Clike/PrettyPrinter.java

clean :
	rm -f Clike/Absyn/*.class Clike/*.class

distclean : vclean

vclean :
	 rm -f Clike/Absyn/Program.java Clike/Absyn/PDefs.java Clike/Absyn/ListDef.java Clike/Absyn/Def.java Clike/Absyn/DFun.java Clike/Absyn/ListArg.java Clike/Absyn/ListStm.java Clike/Absyn/Arg.java Clike/Absyn/ADecl.java Clike/Absyn/Stm.java Clike/Absyn/SExp.java Clike/Absyn/SDecl.java Clike/Absyn/SDecls.java Clike/Absyn/SInit.java Clike/Absyn/SReturn.java Clike/Absyn/SWhile.java Clike/Absyn/SBlock.java Clike/Absyn/SIfElse.java Clike/Absyn/Exp.java Clike/Absyn/EInt.java Clike/Absyn/EDouble.java Clike/Absyn/EString.java Clike/Absyn/ETrue.java Clike/Absyn/EFalse.java Clike/Absyn/EId.java Clike/Absyn/ECall.java Clike/Absyn/EPIncr.java Clike/Absyn/EPDecr.java Clike/Absyn/EIncr.java Clike/Absyn/EDecr.java Clike/Absyn/ENeg.java Clike/Absyn/EMul.java Clike/Absyn/EDiv.java Clike/Absyn/EAdd.java Clike/Absyn/ESub.java Clike/Absyn/ELt.java Clike/Absyn/EGt.java Clike/Absyn/ELEq.java Clike/Absyn/EGEq.java Clike/Absyn/EEq.java Clike/Absyn/ENEq.java Clike/Absyn/EAnd.java Clike/Absyn/EOr.java Clike/Absyn/EAss.java Clike/Absyn/ListExp.java Clike/Absyn/Type.java Clike/Absyn/Tbool.java Clike/Absyn/Tdouble.java Clike/Absyn/Tint.java Clike/Absyn/Tstring.java Clike/Absyn/Tvoid.java Clike/Absyn/ListId.java Clike/Absyn/Program.class Clike/Absyn/PDefs.class Clike/Absyn/ListDef.class Clike/Absyn/Def.class Clike/Absyn/DFun.class Clike/Absyn/ListArg.class Clike/Absyn/ListStm.class Clike/Absyn/Arg.class Clike/Absyn/ADecl.class Clike/Absyn/Stm.class Clike/Absyn/SExp.class Clike/Absyn/SDecl.class Clike/Absyn/SDecls.class Clike/Absyn/SInit.class Clike/Absyn/SReturn.class Clike/Absyn/SWhile.class Clike/Absyn/SBlock.class Clike/Absyn/SIfElse.class Clike/Absyn/Exp.class Clike/Absyn/EInt.class Clike/Absyn/EDouble.class Clike/Absyn/EString.class Clike/Absyn/ETrue.class Clike/Absyn/EFalse.class Clike/Absyn/EId.class Clike/Absyn/ECall.class Clike/Absyn/EPIncr.class Clike/Absyn/EPDecr.class Clike/Absyn/EIncr.class Clike/Absyn/EDecr.class Clike/Absyn/ENeg.class Clike/Absyn/EMul.class Clike/Absyn/EDiv.class Clike/Absyn/EAdd.class Clike/Absyn/ESub.class Clike/Absyn/ELt.class Clike/Absyn/EGt.class Clike/Absyn/ELEq.class Clike/Absyn/EGEq.class Clike/Absyn/EEq.class Clike/Absyn/ENEq.class Clike/Absyn/EAnd.class Clike/Absyn/EOr.class Clike/Absyn/EAss.class Clike/Absyn/ListExp.class Clike/Absyn/Type.class Clike/Absyn/Tbool.class Clike/Absyn/Tdouble.class Clike/Absyn/Tint.class Clike/Absyn/Tstring.class Clike/Absyn/Tvoid.class Clike/Absyn/ListId.class
	 rm -f Clike/Absyn/*.class
	 rmdir Clike/Absyn/
	 rm -f Clike/Yylex Clike/_cup.cup Clike/Yylex.java Clike/VisitSkel.java Clike/ComposVisitor.java Clike/AbstractVisitor.java Clike/FoldVisitor.java Clike/AllVisitor.java Clike/PrettyPrinter.java Clike/Skeleton.java Clike/Test.java Clike/parser.java Clike/sym.java Clike/*.class
	 rm -f Makefile
	 rmdir -p Clike/
