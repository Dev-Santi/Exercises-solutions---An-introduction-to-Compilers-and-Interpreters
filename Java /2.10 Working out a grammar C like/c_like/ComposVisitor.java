package c_like;
import c_like.Absyn.*;
/** BNFC-Generated Composition Visitor
*/

public class ComposVisitor<A> implements
  c_like.Absyn.Program.Visitor<c_like.Absyn.Program,A>,
  c_like.Absyn.Def.Visitor<c_like.Absyn.Def,A>,
  c_like.Absyn.Arg.Visitor<c_like.Absyn.Arg,A>,
  c_like.Absyn.Stm.Visitor<c_like.Absyn.Stm,A>,
  c_like.Absyn.Exp.Visitor<c_like.Absyn.Exp,A>,
  c_like.Absyn.Type.Visitor<c_like.Absyn.Type,A>
{
/* Program */
    public Program visit(c_like.Absyn.Pdefs p, A arg)
    {
      ListDef listdef_ = new ListDef();
      for (Def x : p.listdef_)
      {
        listdef_.add(x.accept(this,arg));
      }
      return new c_like.Absyn.Pdefs(listdef_);
    }
/* Def */
    public Def visit(c_like.Absyn.DFun p, A arg)
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
      return new c_like.Absyn.DFun(type_, id_, listarg_, liststm_);
    }
/* Arg */
    public Arg visit(c_like.Absyn.ADecl p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String id_ = p.id_;
      return new c_like.Absyn.ADecl(type_, id_);
    }
/* Stm */
    public Stm visit(c_like.Absyn.SExp p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new c_like.Absyn.SExp(exp_);
    }    public Stm visit(c_like.Absyn.SDecl p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String id_ = p.id_;
      return new c_like.Absyn.SDecl(type_, id_);
    }    public Stm visit(c_like.Absyn.SDecls p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String id_ = p.id_;
      ListId listid_ = p.listid_;
      return new c_like.Absyn.SDecls(type_, id_, listid_);
    }    public Stm visit(c_like.Absyn.SInit p, A arg)
    {
      Type type_ = p.type_.accept(this, arg);
      String id_ = p.id_;
      Exp exp_ = p.exp_.accept(this, arg);
      return new c_like.Absyn.SInit(type_, id_, exp_);
    }    public Stm visit(c_like.Absyn.SReturn p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new c_like.Absyn.SReturn(exp_);
    }    public Stm visit(c_like.Absyn.SWhile p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      Stm stm_ = p.stm_.accept(this, arg);
      return new c_like.Absyn.SWhile(exp_, stm_);
    }    public Stm visit(c_like.Absyn.SBlock p, A arg)
    {
      ListStm liststm_ = new ListStm();
      for (Stm x : p.liststm_)
      {
        liststm_.add(x.accept(this,arg));
      }
      return new c_like.Absyn.SBlock(liststm_);
    }    public Stm visit(c_like.Absyn.SIfElse p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      Stm stm_1 = p.stm_1.accept(this, arg);
      Stm stm_2 = p.stm_2.accept(this, arg);
      return new c_like.Absyn.SIfElse(exp_, stm_1, stm_2);
    }
/* Exp */
    public Exp visit(c_like.Absyn.EInt p, A arg)
    {
      Integer integer_ = p.integer_;
      return new c_like.Absyn.EInt(integer_);
    }    public Exp visit(c_like.Absyn.EDouble p, A arg)
    {
      Double double_ = p.double_;
      return new c_like.Absyn.EDouble(double_);
    }    public Exp visit(c_like.Absyn.EString p, A arg)
    {
      String string_ = p.string_;
      return new c_like.Absyn.EString(string_);
    }    public Exp visit(c_like.Absyn.ETrue p, A arg)
    {
      return new c_like.Absyn.ETrue();
    }    public Exp visit(c_like.Absyn.EFalse p, A arg)
    {
      return new c_like.Absyn.EFalse();
    }    public Exp visit(c_like.Absyn.EId p, A arg)
    {
      String id_ = p.id_;
      return new c_like.Absyn.EId(id_);
    }    public Exp visit(c_like.Absyn.ECall p, A arg)
    {
      String id_ = p.id_;
      ListExp listexp_ = new ListExp();
      for (Exp x : p.listexp_)
      {
        listexp_.add(x.accept(this,arg));
      }
      return new c_like.Absyn.ECall(id_, listexp_);
    }    public Exp visit(c_like.Absyn.EPIncr p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new c_like.Absyn.EPIncr(exp_);
    }    public Exp visit(c_like.Absyn.EPDecr p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new c_like.Absyn.EPDecr(exp_);
    }    public Exp visit(c_like.Absyn.EIncr p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new c_like.Absyn.EIncr(exp_);
    }    public Exp visit(c_like.Absyn.EDecr p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new c_like.Absyn.EDecr(exp_);
    }    public Exp visit(c_like.Absyn.ENeg p, A arg)
    {
      Exp exp_ = p.exp_.accept(this, arg);
      return new c_like.Absyn.ENeg(exp_);
    }    public Exp visit(c_like.Absyn.EMul p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new c_like.Absyn.EMul(exp_1, exp_2);
    }    public Exp visit(c_like.Absyn.EDiv p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new c_like.Absyn.EDiv(exp_1, exp_2);
    }    public Exp visit(c_like.Absyn.EAdd p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new c_like.Absyn.EAdd(exp_1, exp_2);
    }    public Exp visit(c_like.Absyn.ESub p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new c_like.Absyn.ESub(exp_1, exp_2);
    }    public Exp visit(c_like.Absyn.ELt p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new c_like.Absyn.ELt(exp_1, exp_2);
    }    public Exp visit(c_like.Absyn.EGt p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new c_like.Absyn.EGt(exp_1, exp_2);
    }    public Exp visit(c_like.Absyn.ELEq p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new c_like.Absyn.ELEq(exp_1, exp_2);
    }    public Exp visit(c_like.Absyn.EGEq p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new c_like.Absyn.EGEq(exp_1, exp_2);
    }    public Exp visit(c_like.Absyn.EEq p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new c_like.Absyn.EEq(exp_1, exp_2);
    }    public Exp visit(c_like.Absyn.ENEq p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new c_like.Absyn.ENEq(exp_1, exp_2);
    }    public Exp visit(c_like.Absyn.EAnd p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new c_like.Absyn.EAnd(exp_1, exp_2);
    }    public Exp visit(c_like.Absyn.EOr p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new c_like.Absyn.EOr(exp_1, exp_2);
    }    public Exp visit(c_like.Absyn.EAss p, A arg)
    {
      Exp exp_1 = p.exp_1.accept(this, arg);
      Exp exp_2 = p.exp_2.accept(this, arg);
      return new c_like.Absyn.EAss(exp_1, exp_2);
    }
/* Type */
    public Type visit(c_like.Absyn.Tbool p, A arg)
    {
      return new c_like.Absyn.Tbool();
    }    public Type visit(c_like.Absyn.Tdouble p, A arg)
    {
      return new c_like.Absyn.Tdouble();
    }    public Type visit(c_like.Absyn.Tint p, A arg)
    {
      return new c_like.Absyn.Tint();
    }    public Type visit(c_like.Absyn.Tstring p, A arg)
    {
      return new c_like.Absyn.Tstring();
    }    public Type visit(c_like.Absyn.Tvoid p, A arg)
    {
      return new c_like.Absyn.Tvoid();
    }
}
