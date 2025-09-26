package Clike;
import Clike.Absyn.*;
/** BNFC-Generated Abstract Visitor */
public class AbstractVisitor<R,A> implements AllVisitor<R,A> {
/* Program */
    public R visit(Clike.Absyn.PDefs p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(Clike.Absyn.Program p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Def */
    public R visit(Clike.Absyn.DFun p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(Clike.Absyn.Def p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Arg */
    public R visit(Clike.Absyn.ADecl p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(Clike.Absyn.Arg p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Stm */
    public R visit(Clike.Absyn.SExp p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.SDecl p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.SDecls p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.SInit p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.SReturn p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.SWhile p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.SBlock p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.SIfElse p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(Clike.Absyn.Stm p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Exp */
    public R visit(Clike.Absyn.EInt p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.EDouble p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.EString p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.ETrue p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.EFalse p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.EId p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.ECall p, A arg) { return visitDefault(p, arg); }

    public R visit(Clike.Absyn.EPIncr p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.EPDecr p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.EIncr p, A arg) { return visitDefault(p, arg); }

    public R visit(Clike.Absyn.EDecr p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.ENeg p, A arg) { return visitDefault(p, arg); }

    public R visit(Clike.Absyn.EMul p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.EDiv p, A arg) { return visitDefault(p, arg); }

    public R visit(Clike.Absyn.EAdd p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.ESub p, A arg) { return visitDefault(p, arg); }

    public R visit(Clike.Absyn.ELt p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.EGt p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.ELEq p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.EGEq p, A arg) { return visitDefault(p, arg); }

    public R visit(Clike.Absyn.EEq p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.ENEq p, A arg) { return visitDefault(p, arg); }

    public R visit(Clike.Absyn.EAnd p, A arg) { return visitDefault(p, arg); }

    public R visit(Clike.Absyn.EOr p, A arg) { return visitDefault(p, arg); }

    public R visit(Clike.Absyn.EAss p, A arg) { return visitDefault(p, arg); }







    public R visitDefault(Clike.Absyn.Exp p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }
/* Type */
    public R visit(Clike.Absyn.Tbool p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.Tdouble p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.Tint p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.Tstring p, A arg) { return visitDefault(p, arg); }
    public R visit(Clike.Absyn.Tvoid p, A arg) { return visitDefault(p, arg); }
    public R visitDefault(Clike.Absyn.Type p, A arg) {
      throw new IllegalArgumentException(this.getClass().getName() + ": " + p);
    }

}
