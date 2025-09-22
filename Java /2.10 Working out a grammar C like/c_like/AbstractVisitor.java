package c_like;
import c_like.Absyn.*;
/** BNFC-Generated Abstract Visitor */
public class AbstractVisitor<R,A> implements AllVisitor<R,A> {
/* Program */
    public R visit(c_like.Absyn.Pdefs p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(c_like.Absyn.Program p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Def */
    public R visit(c_like.Absyn.DFun p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(c_like.Absyn.Def p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Arg */
    public R visit(c_like.Absyn.ADecl p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(c_like.Absyn.Arg p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Stm */
    public R visit(c_like.Absyn.SExp p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.SDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.SDecls p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.SInit p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.SReturn p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.SWhile p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.SBlock p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.SIfElse p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(c_like.Absyn.Stm p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Exp */
    public R visit(c_like.Absyn.EInt p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.EDouble p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.EString p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.ETrue p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.EFalse p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.EId p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.ECall p, A arg) { return visitDefault(p, arg); }

    public R visit(c_like.Absyn.EPIncr p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.EPDecr p, A arg) { return visitDefault(p, arg); }

    public R visit(c_like.Absyn.EIncr p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.EDecr p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.ENeg p, A arg) { return visitDefault(p, arg); }

    public R visit(c_like.Absyn.EMul p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.EDiv p, A arg) { return visitDefault(p, arg); }

    public R visit(c_like.Absyn.EAdd p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.ESub p, A arg) { return visitDefault(p, arg); }

    public R visit(c_like.Absyn.ELt p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.EGt p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.ELEq p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.EGEq p, A arg) { return visitDefault(p, arg); }

    public R visit(c_like.Absyn.EEq p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.ENEq p, A arg) { return visitDefault(p, arg); }

    public R visit(c_like.Absyn.EAnd p, A arg) { return visitDefault(p, arg); }

    public R visit(c_like.Absyn.EOr p, A arg) { return visitDefault(p, arg); }

    public R visit(c_like.Absyn.EAss p, A arg) { return visitDefault(p, arg); }







    public R visitDefault(c_like.Absyn.Exp p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Type */
    public R visit(c_like.Absyn.Tbool p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.Tdouble p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.Tint p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.Tstring p, A arg) { return visitDefault(p, arg); }
    public R visit(c_like.Absyn.Tvoid p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(c_like.Absyn.Type p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
