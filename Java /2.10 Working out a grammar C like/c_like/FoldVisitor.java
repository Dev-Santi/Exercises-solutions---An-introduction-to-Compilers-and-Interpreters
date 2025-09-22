package c_like;

import c_like.Absyn.*;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/** BNFC-Generated Fold Visitor */
public abstract class FoldVisitor<R,A> implements AllVisitor<R,A> {
    public abstract R leaf(A arg);
    public abstract R combine(R x, R y, A arg);

/* Program */
    public R visit(c_like.Absyn.Pdefs p, A arg) {
      R r = leaf(arg);
      for (Def x : p.listdef_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }

/* Def */
    public R visit(c_like.Absyn.DFun p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      for (Arg x : p.listarg_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      for (Stm x : p.liststm_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }

/* Arg */
    public R visit(c_like.Absyn.ADecl p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }

/* Stm */
    public R visit(c_like.Absyn.SExp p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.SDecl p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.SDecls p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.SInit p, A arg) {
      R r = leaf(arg);
      r = combine(p.type_.accept(this, arg), r, arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.SReturn p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.SWhile p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      r = combine(p.stm_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.SBlock p, A arg) {
      R r = leaf(arg);
      for (Stm x : p.liststm_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(c_like.Absyn.SIfElse p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      r = combine(p.stm_1.accept(this, arg), r, arg);
      r = combine(p.stm_2.accept(this, arg), r, arg);
      return r;
    }

/* Exp */
    public R visit(c_like.Absyn.EInt p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(c_like.Absyn.EDouble p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(c_like.Absyn.EString p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(c_like.Absyn.ETrue p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(c_like.Absyn.EFalse p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(c_like.Absyn.EId p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(c_like.Absyn.ECall p, A arg) {
      R r = leaf(arg);
      for (Exp x : p.listexp_)
      {
        r = combine(x.accept(this, arg), r, arg);
      }
      return r;
    }
    public R visit(c_like.Absyn.EPIncr p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.EPDecr p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.EIncr p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.EDecr p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.ENeg p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.EMul p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.EDiv p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.EAdd p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.ESub p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.ELt p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.EGt p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.ELEq p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.EGEq p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.EEq p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.ENEq p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.EAnd p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.EOr p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }
    public R visit(c_like.Absyn.EAss p, A arg) {
      R r = leaf(arg);
      r = combine(p.exp_1.accept(this, arg), r, arg);
      r = combine(p.exp_2.accept(this, arg), r, arg);
      return r;
    }

/* Type */
    public R visit(c_like.Absyn.Tbool p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(c_like.Absyn.Tdouble p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(c_like.Absyn.Tint p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(c_like.Absyn.Tstring p, A arg) {
      R r = leaf(arg);
      return r;
    }
    public R visit(c_like.Absyn.Tvoid p, A arg) {
      R r = leaf(arg);
      return r;
    }


}
