package Clike;
import Clike.Absyn.*;

public class PrettyPrinter
{
  //For certain applications increasing the initial size of the buffer may improve performance.
  private static final int INITIAL_BUFFER_SIZE = 128;
  private static final int INDENT_WIDTH = 2;
  //You may wish to change the parentheses used in precedence.
  private static final String _L_PAREN = new String("(");
  private static final String _R_PAREN = new String(")");
  //You may wish to change render
  private static void render(String s)
  {
    if (s.equals("{"))
    {
       buf_.append("\n");
       indent();
       buf_.append(s);
       _n_ = _n_ + INDENT_WIDTH;
       buf_.append("\n");
       indent();
    }
    else if (s.equals("(") || s.equals("["))
       buf_.append(s);
    else if (s.equals(")") || s.equals("]"))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals("}"))
    {
       int t;
       _n_ = _n_ - INDENT_WIDTH;
       for(t=0; t<INDENT_WIDTH; t++) {
         backup();
       }
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals(","))
    {
       backup();
       buf_.append(s);
       buf_.append(" ");
    }
    else if (s.equals(";"))
    {
       backup();
       buf_.append(s);
       buf_.append("\n");
       indent();
    }
    else if (s.equals("")) return;
    else
    {
       buf_.append(s);
       buf_.append(" ");
    }
  }


  //  print and show methods are defined for each category.
  public static String print(Clike.Absyn.Program foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(Clike.Absyn.Program foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(Clike.Absyn.ListDef foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(Clike.Absyn.ListDef foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(Clike.Absyn.Def foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(Clike.Absyn.Def foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(Clike.Absyn.ListArg foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(Clike.Absyn.ListArg foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(Clike.Absyn.ListStm foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(Clike.Absyn.ListStm foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(Clike.Absyn.Arg foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(Clike.Absyn.Arg foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(Clike.Absyn.Stm foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(Clike.Absyn.Stm foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(Clike.Absyn.Exp foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(Clike.Absyn.Exp foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(Clike.Absyn.ListExp foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(Clike.Absyn.ListExp foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(Clike.Absyn.Type foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(Clike.Absyn.Type foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String print(Clike.Absyn.ListId foo)
  {
    pp(foo, 0);
    trim();
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  public static String show(Clike.Absyn.ListId foo)
  {
    sh(foo);
    String temp = buf_.toString();
    buf_.delete(0,buf_.length());
    return temp;
  }
  /***   You shouldn't need to change anything beyond this point.   ***/

  private static void pp(Clike.Absyn.Program foo, int _i_)
  {
    if (foo instanceof Clike.Absyn.PDefs)
    {
       Clike.Absyn.PDefs _pdefs = (Clike.Absyn.PDefs) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_pdefs.listdef_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(Clike.Absyn.ListDef foo, int _i_)
  {
     for (java.util.Iterator<Def> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), _i_);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }  }

  private static void pp(Clike.Absyn.Def foo, int _i_)
  {
    if (foo instanceof Clike.Absyn.DFun)
    {
       Clike.Absyn.DFun _dfun = (Clike.Absyn.DFun) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_dfun.type_, 0);
       pp(_dfun.id_, 0);
       render("(");
       pp(_dfun.listarg_, 0);
       render(")");
       render("{");
       pp(_dfun.liststm_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(Clike.Absyn.ListArg foo, int _i_)
  {
     for (java.util.Iterator<Arg> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), _i_);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }  }

  private static void pp(Clike.Absyn.ListStm foo, int _i_)
  {
     for (java.util.Iterator<Stm> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), _i_);
       if (it.hasNext()) {
         render("");
       } else {
         render("");
       }
     }  }

  private static void pp(Clike.Absyn.Arg foo, int _i_)
  {
    if (foo instanceof Clike.Absyn.ADecl)
    {
       Clike.Absyn.ADecl _adecl = (Clike.Absyn.ADecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_adecl.type_, 0);
       pp(_adecl.id_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(Clike.Absyn.Stm foo, int _i_)
  {
    if (foo instanceof Clike.Absyn.SExp)
    {
       Clike.Absyn.SExp _sexp = (Clike.Absyn.SExp) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sexp.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.SDecl)
    {
       Clike.Absyn.SDecl _sdecl = (Clike.Absyn.SDecl) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sdecl.type_, 0);
       pp(_sdecl.id_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.SDecls)
    {
       Clike.Absyn.SDecls _sdecls = (Clike.Absyn.SDecls) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sdecls.type_, 0);
       pp(_sdecls.id_, 0);
       render(",");
       pp(_sdecls.listid_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.SInit)
    {
       Clike.Absyn.SInit _sinit = (Clike.Absyn.SInit) foo;
       if (_i_ > 0) render(_L_PAREN);
       pp(_sinit.type_, 0);
       pp(_sinit.id_, 0);
       render("=");
       pp(_sinit.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.SReturn)
    {
       Clike.Absyn.SReturn _sreturn = (Clike.Absyn.SReturn) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("return");
       pp(_sreturn.exp_, 0);
       render(";");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.SWhile)
    {
       Clike.Absyn.SWhile _swhile = (Clike.Absyn.SWhile) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("while");
       render("(");
       pp(_swhile.exp_, 0);
       render(")");
       pp(_swhile.stm_, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.SBlock)
    {
       Clike.Absyn.SBlock _sblock = (Clike.Absyn.SBlock) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("{");
       pp(_sblock.liststm_, 0);
       render("}");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.SIfElse)
    {
       Clike.Absyn.SIfElse _sifelse = (Clike.Absyn.SIfElse) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("if");
       render("(");
       pp(_sifelse.exp_, 0);
       render(")");
       pp(_sifelse.stm_1, 0);
       render("else");
       pp(_sifelse.stm_2, 0);
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(Clike.Absyn.Exp foo, int _i_)
  {
    if (foo instanceof Clike.Absyn.EInt)
    {
       Clike.Absyn.EInt _eint = (Clike.Absyn.EInt) foo;
       if (_i_ > 15) render(_L_PAREN);
       pp(_eint.integer_, 0);
       if (_i_ > 15) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EDouble)
    {
       Clike.Absyn.EDouble _edouble = (Clike.Absyn.EDouble) foo;
       if (_i_ > 15) render(_L_PAREN);
       pp(_edouble.double_, 0);
       if (_i_ > 15) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EString)
    {
       Clike.Absyn.EString _estring = (Clike.Absyn.EString) foo;
       if (_i_ > 15) render(_L_PAREN);
       printQuoted(_estring.string_);
       if (_i_ > 15) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.ETrue)
    {
       Clike.Absyn.ETrue _etrue = (Clike.Absyn.ETrue) foo;
       if (_i_ > 15) render(_L_PAREN);
       render("true");
       if (_i_ > 15) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EFalse)
    {
       Clike.Absyn.EFalse _efalse = (Clike.Absyn.EFalse) foo;
       if (_i_ > 15) render(_L_PAREN);
       render("false");
       if (_i_ > 15) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EId)
    {
       Clike.Absyn.EId _eid = (Clike.Absyn.EId) foo;
       if (_i_ > 15) render(_L_PAREN);
       pp(_eid.id_, 0);
       if (_i_ > 15) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.ECall)
    {
       Clike.Absyn.ECall _ecall = (Clike.Absyn.ECall) foo;
       if (_i_ > 15) render(_L_PAREN);
       pp(_ecall.id_, 0);
       render("(");
       pp(_ecall.listexp_, 0);
       render(")");
       if (_i_ > 15) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EPIncr)
    {
       Clike.Absyn.EPIncr _epincr = (Clike.Absyn.EPIncr) foo;
       if (_i_ > 14) render(_L_PAREN);
       pp(_epincr.exp_, 15);
       render("++");
       if (_i_ > 14) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EPDecr)
    {
       Clike.Absyn.EPDecr _epdecr = (Clike.Absyn.EPDecr) foo;
       if (_i_ > 14) render(_L_PAREN);
       pp(_epdecr.exp_, 15);
       render("--");
       if (_i_ > 14) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EIncr)
    {
       Clike.Absyn.EIncr _eincr = (Clike.Absyn.EIncr) foo;
       if (_i_ > 14) render(_L_PAREN);
       render("++");
       pp(_eincr.exp_, 14);
       if (_i_ > 14) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EDecr)
    {
       Clike.Absyn.EDecr _edecr = (Clike.Absyn.EDecr) foo;
       if (_i_ > 13) render(_L_PAREN);
       render("--");
       pp(_edecr.exp_, 14);
       if (_i_ > 13) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.ENeg)
    {
       Clike.Absyn.ENeg _eneg = (Clike.Absyn.ENeg) foo;
       if (_i_ > 13) render(_L_PAREN);
       render("-");
       pp(_eneg.exp_, 14);
       if (_i_ > 13) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EMul)
    {
       Clike.Absyn.EMul _emul = (Clike.Absyn.EMul) foo;
       if (_i_ > 12) render(_L_PAREN);
       pp(_emul.exp_1, 12);
       render("*");
       pp(_emul.exp_2, 13);
       if (_i_ > 12) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EDiv)
    {
       Clike.Absyn.EDiv _ediv = (Clike.Absyn.EDiv) foo;
       if (_i_ > 12) render(_L_PAREN);
       pp(_ediv.exp_1, 12);
       render("/");
       pp(_ediv.exp_2, 13);
       if (_i_ > 12) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EAdd)
    {
       Clike.Absyn.EAdd _eadd = (Clike.Absyn.EAdd) foo;
       if (_i_ > 11) render(_L_PAREN);
       pp(_eadd.exp_1, 11);
       render("+");
       pp(_eadd.exp_2, 12);
       if (_i_ > 11) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.ESub)
    {
       Clike.Absyn.ESub _esub = (Clike.Absyn.ESub) foo;
       if (_i_ > 11) render(_L_PAREN);
       pp(_esub.exp_1, 11);
       render("-");
       pp(_esub.exp_2, 12);
       if (_i_ > 11) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.ELt)
    {
       Clike.Absyn.ELt _elt = (Clike.Absyn.ELt) foo;
       if (_i_ > 9) render(_L_PAREN);
       pp(_elt.exp_1, 9);
       render("<");
       pp(_elt.exp_2, 10);
       if (_i_ > 9) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EGt)
    {
       Clike.Absyn.EGt _egt = (Clike.Absyn.EGt) foo;
       if (_i_ > 9) render(_L_PAREN);
       pp(_egt.exp_1, 9);
       render(">");
       pp(_egt.exp_2, 10);
       if (_i_ > 9) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.ELEq)
    {
       Clike.Absyn.ELEq _eleq = (Clike.Absyn.ELEq) foo;
       if (_i_ > 9) render(_L_PAREN);
       pp(_eleq.exp_1, 9);
       render("<=");
       pp(_eleq.exp_2, 10);
       if (_i_ > 9) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EGEq)
    {
       Clike.Absyn.EGEq _egeq = (Clike.Absyn.EGEq) foo;
       if (_i_ > 9) render(_L_PAREN);
       pp(_egeq.exp_1, 9);
       render(">=");
       pp(_egeq.exp_2, 10);
       if (_i_ > 9) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EEq)
    {
       Clike.Absyn.EEq _eeq = (Clike.Absyn.EEq) foo;
       if (_i_ > 8) render(_L_PAREN);
       pp(_eeq.exp_1, 8);
       render("==");
       pp(_eeq.exp_2, 9);
       if (_i_ > 8) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.ENEq)
    {
       Clike.Absyn.ENEq _eneq = (Clike.Absyn.ENEq) foo;
       if (_i_ > 8) render(_L_PAREN);
       pp(_eneq.exp_1, 8);
       render("!=");
       pp(_eneq.exp_2, 9);
       if (_i_ > 8) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EAnd)
    {
       Clike.Absyn.EAnd _eand = (Clike.Absyn.EAnd) foo;
       if (_i_ > 4) render(_L_PAREN);
       pp(_eand.exp_1, 4);
       render("&&");
       pp(_eand.exp_2, 5);
       if (_i_ > 4) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EOr)
    {
       Clike.Absyn.EOr _eor = (Clike.Absyn.EOr) foo;
       if (_i_ > 3) render(_L_PAREN);
       pp(_eor.exp_1, 3);
       render("||");
       pp(_eor.exp_2, 4);
       if (_i_ > 3) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.EAss)
    {
       Clike.Absyn.EAss _eass = (Clike.Absyn.EAss) foo;
       if (_i_ > 2) render(_L_PAREN);
       pp(_eass.exp_1, 3);
       render("=");
       pp(_eass.exp_2, 2);
       if (_i_ > 2) render(_R_PAREN);
    }
  }

  private static void pp(Clike.Absyn.ListExp foo, int _i_)
  {
     for (java.util.Iterator<Exp> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), _i_);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }  }

  private static void pp(Clike.Absyn.Type foo, int _i_)
  {
    if (foo instanceof Clike.Absyn.Tbool)
    {
       Clike.Absyn.Tbool _tbool = (Clike.Absyn.Tbool) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("bool");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.Tdouble)
    {
       Clike.Absyn.Tdouble _tdouble = (Clike.Absyn.Tdouble) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("double");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.Tint)
    {
       Clike.Absyn.Tint _tint = (Clike.Absyn.Tint) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("int");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.Tstring)
    {
       Clike.Absyn.Tstring _tstring = (Clike.Absyn.Tstring) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("string");
       if (_i_ > 0) render(_R_PAREN);
    }
    else     if (foo instanceof Clike.Absyn.Tvoid)
    {
       Clike.Absyn.Tvoid _tvoid = (Clike.Absyn.Tvoid) foo;
       if (_i_ > 0) render(_L_PAREN);
       render("void");
       if (_i_ > 0) render(_R_PAREN);
    }
  }

  private static void pp(Clike.Absyn.ListId foo, int _i_)
  {
     for (java.util.Iterator<String> it = foo.iterator(); it.hasNext();)
     {
       pp(it.next(), _i_);
       if (it.hasNext()) {
         render(",");
       } else {
         render("");
       }
     }  }


  private static void sh(Clike.Absyn.Program foo)
  {
    if (foo instanceof Clike.Absyn.PDefs)
    {
       Clike.Absyn.PDefs _pdefs = (Clike.Absyn.PDefs) foo;
       render("(");
       render("PDefs");
       render("[");
       sh(_pdefs.listdef_);
       render("]");
       render(")");
    }
  }

  private static void sh(Clike.Absyn.ListDef foo)
  {
     for (java.util.Iterator<Def> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(Clike.Absyn.Def foo)
  {
    if (foo instanceof Clike.Absyn.DFun)
    {
       Clike.Absyn.DFun _dfun = (Clike.Absyn.DFun) foo;
       render("(");
       render("DFun");
       sh(_dfun.type_);
       sh(_dfun.id_);
       render("[");
       sh(_dfun.listarg_);
       render("]");
       render("[");
       sh(_dfun.liststm_);
       render("]");
       render(")");
    }
  }

  private static void sh(Clike.Absyn.ListArg foo)
  {
     for (java.util.Iterator<Arg> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(Clike.Absyn.ListStm foo)
  {
     for (java.util.Iterator<Stm> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(Clike.Absyn.Arg foo)
  {
    if (foo instanceof Clike.Absyn.ADecl)
    {
       Clike.Absyn.ADecl _adecl = (Clike.Absyn.ADecl) foo;
       render("(");
       render("ADecl");
       sh(_adecl.type_);
       sh(_adecl.id_);
       render(")");
    }
  }

  private static void sh(Clike.Absyn.Stm foo)
  {
    if (foo instanceof Clike.Absyn.SExp)
    {
       Clike.Absyn.SExp _sexp = (Clike.Absyn.SExp) foo;
       render("(");
       render("SExp");
       sh(_sexp.exp_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.SDecl)
    {
       Clike.Absyn.SDecl _sdecl = (Clike.Absyn.SDecl) foo;
       render("(");
       render("SDecl");
       sh(_sdecl.type_);
       sh(_sdecl.id_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.SDecls)
    {
       Clike.Absyn.SDecls _sdecls = (Clike.Absyn.SDecls) foo;
       render("(");
       render("SDecls");
       sh(_sdecls.type_);
       sh(_sdecls.id_);
       render("[");
       sh(_sdecls.listid_);
       render("]");
       render(")");
    }
    if (foo instanceof Clike.Absyn.SInit)
    {
       Clike.Absyn.SInit _sinit = (Clike.Absyn.SInit) foo;
       render("(");
       render("SInit");
       sh(_sinit.type_);
       sh(_sinit.id_);
       sh(_sinit.exp_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.SReturn)
    {
       Clike.Absyn.SReturn _sreturn = (Clike.Absyn.SReturn) foo;
       render("(");
       render("SReturn");
       sh(_sreturn.exp_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.SWhile)
    {
       Clike.Absyn.SWhile _swhile = (Clike.Absyn.SWhile) foo;
       render("(");
       render("SWhile");
       sh(_swhile.exp_);
       sh(_swhile.stm_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.SBlock)
    {
       Clike.Absyn.SBlock _sblock = (Clike.Absyn.SBlock) foo;
       render("(");
       render("SBlock");
       render("[");
       sh(_sblock.liststm_);
       render("]");
       render(")");
    }
    if (foo instanceof Clike.Absyn.SIfElse)
    {
       Clike.Absyn.SIfElse _sifelse = (Clike.Absyn.SIfElse) foo;
       render("(");
       render("SIfElse");
       sh(_sifelse.exp_);
       sh(_sifelse.stm_1);
       sh(_sifelse.stm_2);
       render(")");
    }
  }

  private static void sh(Clike.Absyn.Exp foo)
  {
    if (foo instanceof Clike.Absyn.EInt)
    {
       Clike.Absyn.EInt _eint = (Clike.Absyn.EInt) foo;
       render("(");
       render("EInt");
       sh(_eint.integer_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EDouble)
    {
       Clike.Absyn.EDouble _edouble = (Clike.Absyn.EDouble) foo;
       render("(");
       render("EDouble");
       sh(_edouble.double_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EString)
    {
       Clike.Absyn.EString _estring = (Clike.Absyn.EString) foo;
       render("(");
       render("EString");
       sh(_estring.string_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.ETrue)
    {
       Clike.Absyn.ETrue _etrue = (Clike.Absyn.ETrue) foo;
       render("ETrue");
    }
    if (foo instanceof Clike.Absyn.EFalse)
    {
       Clike.Absyn.EFalse _efalse = (Clike.Absyn.EFalse) foo;
       render("EFalse");
    }
    if (foo instanceof Clike.Absyn.EId)
    {
       Clike.Absyn.EId _eid = (Clike.Absyn.EId) foo;
       render("(");
       render("EId");
       sh(_eid.id_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.ECall)
    {
       Clike.Absyn.ECall _ecall = (Clike.Absyn.ECall) foo;
       render("(");
       render("ECall");
       sh(_ecall.id_);
       render("[");
       sh(_ecall.listexp_);
       render("]");
       render(")");
    }
    if (foo instanceof Clike.Absyn.EPIncr)
    {
       Clike.Absyn.EPIncr _epincr = (Clike.Absyn.EPIncr) foo;
       render("(");
       render("EPIncr");
       sh(_epincr.exp_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EPDecr)
    {
       Clike.Absyn.EPDecr _epdecr = (Clike.Absyn.EPDecr) foo;
       render("(");
       render("EPDecr");
       sh(_epdecr.exp_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EIncr)
    {
       Clike.Absyn.EIncr _eincr = (Clike.Absyn.EIncr) foo;
       render("(");
       render("EIncr");
       sh(_eincr.exp_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EDecr)
    {
       Clike.Absyn.EDecr _edecr = (Clike.Absyn.EDecr) foo;
       render("(");
       render("EDecr");
       sh(_edecr.exp_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.ENeg)
    {
       Clike.Absyn.ENeg _eneg = (Clike.Absyn.ENeg) foo;
       render("(");
       render("ENeg");
       sh(_eneg.exp_);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EMul)
    {
       Clike.Absyn.EMul _emul = (Clike.Absyn.EMul) foo;
       render("(");
       render("EMul");
       sh(_emul.exp_1);
       sh(_emul.exp_2);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EDiv)
    {
       Clike.Absyn.EDiv _ediv = (Clike.Absyn.EDiv) foo;
       render("(");
       render("EDiv");
       sh(_ediv.exp_1);
       sh(_ediv.exp_2);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EAdd)
    {
       Clike.Absyn.EAdd _eadd = (Clike.Absyn.EAdd) foo;
       render("(");
       render("EAdd");
       sh(_eadd.exp_1);
       sh(_eadd.exp_2);
       render(")");
    }
    if (foo instanceof Clike.Absyn.ESub)
    {
       Clike.Absyn.ESub _esub = (Clike.Absyn.ESub) foo;
       render("(");
       render("ESub");
       sh(_esub.exp_1);
       sh(_esub.exp_2);
       render(")");
    }
    if (foo instanceof Clike.Absyn.ELt)
    {
       Clike.Absyn.ELt _elt = (Clike.Absyn.ELt) foo;
       render("(");
       render("ELt");
       sh(_elt.exp_1);
       sh(_elt.exp_2);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EGt)
    {
       Clike.Absyn.EGt _egt = (Clike.Absyn.EGt) foo;
       render("(");
       render("EGt");
       sh(_egt.exp_1);
       sh(_egt.exp_2);
       render(")");
    }
    if (foo instanceof Clike.Absyn.ELEq)
    {
       Clike.Absyn.ELEq _eleq = (Clike.Absyn.ELEq) foo;
       render("(");
       render("ELEq");
       sh(_eleq.exp_1);
       sh(_eleq.exp_2);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EGEq)
    {
       Clike.Absyn.EGEq _egeq = (Clike.Absyn.EGEq) foo;
       render("(");
       render("EGEq");
       sh(_egeq.exp_1);
       sh(_egeq.exp_2);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EEq)
    {
       Clike.Absyn.EEq _eeq = (Clike.Absyn.EEq) foo;
       render("(");
       render("EEq");
       sh(_eeq.exp_1);
       sh(_eeq.exp_2);
       render(")");
    }
    if (foo instanceof Clike.Absyn.ENEq)
    {
       Clike.Absyn.ENEq _eneq = (Clike.Absyn.ENEq) foo;
       render("(");
       render("ENEq");
       sh(_eneq.exp_1);
       sh(_eneq.exp_2);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EAnd)
    {
       Clike.Absyn.EAnd _eand = (Clike.Absyn.EAnd) foo;
       render("(");
       render("EAnd");
       sh(_eand.exp_1);
       sh(_eand.exp_2);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EOr)
    {
       Clike.Absyn.EOr _eor = (Clike.Absyn.EOr) foo;
       render("(");
       render("EOr");
       sh(_eor.exp_1);
       sh(_eor.exp_2);
       render(")");
    }
    if (foo instanceof Clike.Absyn.EAss)
    {
       Clike.Absyn.EAss _eass = (Clike.Absyn.EAss) foo;
       render("(");
       render("EAss");
       sh(_eass.exp_1);
       sh(_eass.exp_2);
       render(")");
    }
  }

  private static void sh(Clike.Absyn.ListExp foo)
  {
     for (java.util.Iterator<Exp> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }

  private static void sh(Clike.Absyn.Type foo)
  {
    if (foo instanceof Clike.Absyn.Tbool)
    {
       Clike.Absyn.Tbool _tbool = (Clike.Absyn.Tbool) foo;
       render("Tbool");
    }
    if (foo instanceof Clike.Absyn.Tdouble)
    {
       Clike.Absyn.Tdouble _tdouble = (Clike.Absyn.Tdouble) foo;
       render("Tdouble");
    }
    if (foo instanceof Clike.Absyn.Tint)
    {
       Clike.Absyn.Tint _tint = (Clike.Absyn.Tint) foo;
       render("Tint");
    }
    if (foo instanceof Clike.Absyn.Tstring)
    {
       Clike.Absyn.Tstring _tstring = (Clike.Absyn.Tstring) foo;
       render("Tstring");
    }
    if (foo instanceof Clike.Absyn.Tvoid)
    {
       Clike.Absyn.Tvoid _tvoid = (Clike.Absyn.Tvoid) foo;
       render("Tvoid");
    }
  }

  private static void sh(Clike.Absyn.ListId foo)
  {
     for (java.util.Iterator<String> it = foo.iterator(); it.hasNext();)
     {
       sh(it.next());
       if (it.hasNext())
         render(",");
     }
  }


  private static void pp(Integer n, int _i_) { buf_.append(n); buf_.append(" "); }
  private static void pp(Double d, int _i_) { buf_.append(d); buf_.append(" "); }
  private static void pp(String s, int _i_) { buf_.append(s); buf_.append(" "); }
  private static void pp(Character c, int _i_) { buf_.append("'" + c.toString() + "'"); buf_.append(" "); }
  private static void sh(Integer n) { render(n.toString()); }
  private static void sh(Double d) { render(d.toString()); }
  private static void sh(Character c) { render(c.toString()); }
  private static void sh(String s) { printQuoted(s); }
  private static void printQuoted(String s) { render("\"" + s + "\""); }
  private static void indent()
  {
    int n = _n_;
    while (n > 0)
    {
      buf_.append(" ");
      n--;
    }
  }
  private static void backup()
  {
     if (buf_.charAt(buf_.length() - 1) == ' ') {
      buf_.setLength(buf_.length() - 1);
    }
  }
  private static void trim()
  {
     while (buf_.length() > 0 && buf_.charAt(0) == ' ')
        buf_.deleteCharAt(0);
    while (buf_.length() > 0 && buf_.charAt(buf_.length()-1) == ' ')
        buf_.deleteCharAt(buf_.length()-1);
  }
  private static int _n_ = 0;
  private static StringBuilder buf_ = new StringBuilder(INITIAL_BUFFER_SIZE);
}

