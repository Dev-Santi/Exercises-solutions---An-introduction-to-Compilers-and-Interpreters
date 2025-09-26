package Clike;
import Clike.Absyn.*;
/** BNFC-Generated Composition Visitor
*/

public class ComposVisitor<A> implements
  Clike.Absyn.Program.Visitor<Clike.Absyn.Program,A>,
  Clike.Absyn.Def.Visitor<Clike.Absyn.Def,A>,
  Clike.Absyn.Arg.Visitor<Clike.Absyn.Arg,A>,
  Clike.Absyn.Stm.Visitor<Clike.Absyn.Stm,A>,
  Clike.Absyn.Exp.Visitor<Clike.Absyn.Exp,A>,
  Clike.Absyn.Type.Visitor<Clike.Absyn.Type,A>
{
/* Program */
    public Program visit(Clike.Absyn.PDefs p, A arg)
    {
      ListDef listdef_ = new ListDef();
      for (Def x : p.listdef_)
      {
        listdef_.add(x.accept(this,arg));
      }
      return new Clike.Absyn.PDefs(listdef_);
    }
/* Def */
    public Def visit(Clike.Absyn.DFun p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String id_ = p.id_;
      ListArg listarg_ = new ListArg();
      for (Arg x : p.listarg_)
      {
        listarg_.add(x.accept(this,arg));
      }
      ListStm liststm_ = new ListStm();
      for (Stm x : p.liststm_)
      {
        liststm_.add(x.accept(this,arg));
      }
      return new Clike.Absyn.DFun(type_, id_, listarg_, liststm_);
    }
/* Arg */
    public Arg visit(Clike.Absyn.ADecl p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String id_ = p.id_;
      return new Clike.Absyn.ADecl(type_, id_);
    }
/* Stm */
    public Stm visit(Clike.Absyn.SExp p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new Clike.Absyn.SExp(exp_);
    }    public Stm visit(Clike.Absyn.SDecl p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String id_ = p.id_;
      return new Clike.Absyn.SDecl(type_, id_);
    }    public Stm visit(Clike.Absyn.SDecls p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String id_ = p.id_;
      ListId listid_ = p.listid_;
      return new Clike.Absyn.SDecls(type_, id_, listid_);
    }    public Stm visit(Clike.Absyn.SInit p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String id_ = p.id_;
      Exp exp_ = p.exp_.accept(this, arg);
      return new Clike.Absyn.SInit(type_, id_, exp_);
    }    public Stm visit(Clike.Absyn.SReturn p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new Clike.Absyn.SReturn(exp_);
    }    public Stm visit(Clike.Absyn.SWhile p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      Stm stm_ = p.stm_.accept(this, arg);
      return new Clike.Absyn.SWhile(exp_, stm_);
    }    public Stm visit(Clike.Absyn.SBlock p, A arg)
    {
      ListStm liststm_ = new ListStm();
      for (Stm x : p.liststm_)
      {
        liststm_.add(x.accept(this,arg));
      }
      return new Clike.Absyn.SBlock(liststm_);
    }    public Stm visit(Clike.Absyn.SIfElse p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      Stm stm_1 = p.stm_1.accept(this, arg);
      Stm stm_2 = p.stm_2.accept(this, arg);
      return new Clike.Absyn.SIfElse(exp_, stm_1, stm_2);
    }
/* Exp */
    public Exp visit(Clike.Absyn.EInt p, A arg)
    {
      Integer integer_ = p.integer_;
      return new Clike.Absyn.EInt(integer_);
    }    public Exp visit(Clike.Absyn.EDouble p, A arg)
    {
      Double double_ = p.double_;
      return new Clike.Absyn.EDouble(double_);
    }    public Exp visit(Clike.Absyn.EString p, A arg)
    {
      String string_ = p.string_;
      return new Clike.Absyn.EString(string_);
    }    public Exp visit(Clike.Absyn.ETrue p, A arg)
    {
      return new Clike.Absyn.ETrue();
    }    public Exp visit(Clike.Absyn.EFalse p, A arg)
    {
      return new Clike.Absyn.EFalse();
    }    public Exp visit(Clike.Absyn.EId p, A arg)
    {
      String id_ = p.id_;
      return new Clike.Absyn.EId(id_);
    }    public Exp visit(Clike.Absyn.ECall p, A arg)
    {
      String id_ = p.id_;
      ListExp listexp_ = new ListExp();
      for (Exp x : p.listexp_)
      {
        listexp_.add(x.accept(this,arg));
      }
      return new Clike.Absyn.ECall(id_, listexp_);
    }    public Exp visit(Clike.Absyn.EPIncr p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new Clike.Absyn.EPIncr(exp_);
    }    public Exp visit(Clike.Absyn.EPDecr p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new Clike.Absyn.EPDecr(exp_);
    }    public Exp visit(Clike.Absyn.EIncr p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new Clike.Absyn.EIncr(exp_);
    }    public Exp visit(Clike.Absyn.EDecr p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new Clike.Absyn.EDecr(exp_);
    }    public Exp visit(Clike.Absyn.ENeg p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new Clike.Absyn.ENeg(exp_);
    }    public Exp visit(Clike.Absyn.EMul p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new Clike.Absyn.EMul(exp_1, exp_2);
    }    public Exp visit(Clike.Absyn.EDiv p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new Clike.Absyn.EDiv(exp_1, exp_2);
    }    public Exp visit(Clike.Absyn.EAdd p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new Clike.Absyn.EAdd(exp_1, exp_2);
    }    public Exp visit(Clike.Absyn.ESub p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new Clike.Absyn.ESub(exp_1, exp_2);
    }    public Exp visit(Clike.Absyn.ELt p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new Clike.Absyn.ELt(exp_1, exp_2);
    }    public Exp visit(Clike.Absyn.EGt p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new Clike.Absyn.EGt(exp_1, exp_2);
    }    public Exp visit(Clike.Absyn.ELEq p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new Clike.Absyn.ELEq(exp_1, exp_2);
    }    public Exp visit(Clike.Absyn.EGEq p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new Clike.Absyn.EGEq(exp_1, exp_2);
    }    public Exp visit(Clike.Absyn.EEq p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new Clike.Absyn.EEq(exp_1, exp_2);
    }    public Exp visit(Clike.Absyn.ENEq p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new Clike.Absyn.ENEq(exp_1, exp_2);
    }    public Exp visit(Clike.Absyn.EAnd p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new Clike.Absyn.EAnd(exp_1, exp_2);
    }    public Exp visit(Clike.Absyn.EOr p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new Clike.Absyn.EOr(exp_1, exp_2);
    }    public Exp visit(Clike.Absyn.EAss p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new Clike.Absyn.EAss(exp_1, exp_2);
    }
/* Type */
    public Type visit(Clike.Absyn.Tbool p, A arg)
    {
      return new Clike.Absyn.Tbool();
    }    public Type visit(Clike.Absyn.Tdouble p, A arg)
    {
      return new Clike.Absyn.Tdouble();
    }    public Type visit(Clike.Absyn.Tint p, A arg)
    {
      return new Clike.Absyn.Tint();
    }    public Type visit(Clike.Absyn.Tstring p, A arg)
    {
      return new Clike.Absyn.Tstring();
    }    public Type visit(Clike.Absyn.Tvoid p, A arg)
    {
      return new Clike.Absyn.Tvoid();
    }
}
