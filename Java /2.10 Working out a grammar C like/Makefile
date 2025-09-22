JAVAC=javac
JAVAC_FLAGS=-sourcepath .
JAVA=java
JAVA_FLAGS=
PARSER=${JAVA} ${JAVA_FLAGS} java_cup.Main
PARSER_FLAGS=-nopositions -expect 100
LEXER=${JAVA} ${JAVA_FLAGS} JLex.Main
LEXER_FLAGS=
all : test

test : absyn c_like/Yylex.class c_like/PrettyPrinter.class c_like/Test.class c_like/ComposVisitor.class c_like/AbstractVisitor.class c_like/FoldVisitor.class c_like/AllVisitor.class c_like/parser.class c_like/sym.class c_like/Test.class

.PHONY : absyn

%.class : %.java
	${JAVAC} ${JAVAC_FLAGS} $^

absyn : c_like/Absyn/Program.java c_like/Absyn/Pdefs.java c_like/Absyn/ListDef.java c_like/Absyn/Def.java c_like/Absyn/DFun.java c_like/Absyn/ListArg.java c_like/Absyn/ListId.java c_like/Absyn/ListStm.java c_like/Absyn/Arg.java c_like/Absyn/ADecl.java c_like/Absyn/Stm.java c_like/Absyn/SExp.java c_like/Absyn/SDecl.java c_like/Absyn/SDecls.java c_like/Absyn/SInit.java c_like/Absyn/SReturn.java c_like/Absyn/SWhile.java c_like/Absyn/SBlock.java c_like/Absyn/SIfElse.java c_like/Absyn/Exp.java c_like/Absyn/EInt.java c_like/Absyn/EDouble.java c_like/Absyn/EString.java c_like/Absyn/ETrue.java c_like/Absyn/EFalse.java c_like/Absyn/EId.java c_like/Absyn/ECall.java c_like/Absyn/EPIncr.java c_like/Absyn/EPDecr.java c_like/Absyn/EIncr.java c_like/Absyn/EDecr.java c_like/Absyn/ENeg.java c_like/Absyn/EMul.java c_like/Absyn/EDiv.java c_like/Absyn/EAdd.java c_like/Absyn/ESub.java c_like/Absyn/ELt.java c_like/Absyn/EGt.java c_like/Absyn/ELEq.java c_like/Absyn/EGEq.java c_like/Absyn/EEq.java c_like/Absyn/ENEq.java c_like/Absyn/EAnd.java c_like/Absyn/EOr.java c_like/Absyn/EAss.java c_like/Absyn/ListExp.java c_like/Absyn/Type.java c_like/Absyn/Tbool.java c_like/Absyn/Tdouble.java c_like/Absyn/Tint.java c_like/Absyn/Tstring.java c_like/Absyn/Tvoid.java
	${JAVAC} ${JAVAC_FLAGS} $^

c_like/Yylex.java : c_like/Yylex
	${LEXER} ${LEXER_FLAGS} c_like/Yylex

c_like/parser.java c_like/sym.java : c_like/_cup.cup
	${PARSER} ${PARSER_FLAGS} c_like/_cup.cup
	mv parser.java sym.java c_like/

c_like/Yylex.class : c_like/Yylex.java c_like/parser.java c_like/sym.java

c_like/sym.class : c_like/sym.java

c_like/parser.class : c_like/parser.java c_like/sym.java

c_like/PrettyPrinter.class : c_like/PrettyPrinter.java

clean :
	rm -f c_like/Absyn/*.class c_like/*.class

distclean : vclean

vclean :
	 rm -f c_like/Absyn/Program.java c_like/Absyn/Pdefs.java c_like/Absyn/ListDef.java c_like/Absyn/Def.java c_like/Absyn/DFun.java c_like/Absyn/ListArg.java c_like/Absyn/ListId.java c_like/Absyn/ListStm.java c_like/Absyn/Arg.java c_like/Absyn/ADecl.java c_like/Absyn/Stm.java c_like/Absyn/SExp.java c_like/Absyn/SDecl.java c_like/Absyn/SDecls.java c_like/Absyn/SInit.java c_like/Absyn/SReturn.java c_like/Absyn/SWhile.java c_like/Absyn/SBlock.java c_like/Absyn/SIfElse.java c_like/Absyn/Exp.java c_like/Absyn/EInt.java c_like/Absyn/EDouble.java c_like/Absyn/EString.java c_like/Absyn/ETrue.java c_like/Absyn/EFalse.java c_like/Absyn/EId.java c_like/Absyn/ECall.java c_like/Absyn/EPIncr.java c_like/Absyn/EPDecr.java c_like/Absyn/EIncr.java c_like/Absyn/EDecr.java c_like/Absyn/ENeg.java c_like/Absyn/EMul.java c_like/Absyn/EDiv.java c_like/Absyn/EAdd.java c_like/Absyn/ESub.java c_like/Absyn/ELt.java c_like/Absyn/EGt.java c_like/Absyn/ELEq.java c_like/Absyn/EGEq.java c_like/Absyn/EEq.java c_like/Absyn/ENEq.java c_like/Absyn/EAnd.java c_like/Absyn/EOr.java c_like/Absyn/EAss.java c_like/Absyn/ListExp.java c_like/Absyn/Type.java c_like/Absyn/Tbool.java c_like/Absyn/Tdouble.java c_like/Absyn/Tint.java c_like/Absyn/Tstring.java c_like/Absyn/Tvoid.java c_like/Absyn/Program.class c_like/Absyn/Pdefs.class c_like/Absyn/ListDef.class c_like/Absyn/Def.class c_like/Absyn/DFun.class c_like/Absyn/ListArg.class c_like/Absyn/ListId.class c_like/Absyn/ListStm.class c_like/Absyn/Arg.class c_like/Absyn/ADecl.class c_like/Absyn/Stm.class c_like/Absyn/SExp.class c_like/Absyn/SDecl.class c_like/Absyn/SDecls.class c_like/Absyn/SInit.class c_like/Absyn/SReturn.class c_like/Absyn/SWhile.class c_like/Absyn/SBlock.class c_like/Absyn/SIfElse.class c_like/Absyn/Exp.class c_like/Absyn/EInt.class c_like/Absyn/EDouble.class c_like/Absyn/EString.class c_like/Absyn/ETrue.class c_like/Absyn/EFalse.class c_like/Absyn/EId.class c_like/Absyn/ECall.class c_like/Absyn/EPIncr.class c_like/Absyn/EPDecr.class c_like/Absyn/EIncr.class c_like/Absyn/EDecr.class c_like/Absyn/ENeg.class c_like/Absyn/EMul.class c_like/Absyn/EDiv.class c_like/Absyn/EAdd.class c_like/Absyn/ESub.class c_like/Absyn/ELt.class c_like/Absyn/EGt.class c_like/Absyn/ELEq.class c_like/Absyn/EGEq.class c_like/Absyn/EEq.class c_like/Absyn/ENEq.class c_like/Absyn/EAnd.class c_like/Absyn/EOr.class c_like/Absyn/EAss.class c_like/Absyn/ListExp.class c_like/Absyn/Type.class c_like/Absyn/Tbool.class c_like/Absyn/Tdouble.class c_like/Absyn/Tint.class c_like/Absyn/Tstring.class c_like/Absyn/Tvoid.class
	 rm -f c_like/Absyn/*.class
	 rmdir c_like/Absyn/
	 rm -f c_like/Yylex c_like/_cup.cup c_like/Yylex.java c_like/VisitSkel.java c_like/ComposVisitor.java c_like/AbstractVisitor.java c_like/FoldVisitor.java c_like/AllVisitor.java c_like/PrettyPrinter.java c_like/Skeleton.java c_like/Test.java c_like/parser.java c_like/sym.java c_like/*.class
	 rm -f Makefile
	 rmdir -p c_like/
