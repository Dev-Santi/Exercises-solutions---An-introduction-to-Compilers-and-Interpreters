package c_like;
import c_like.Absyn.*;
/*** BNFC-Generated Visitor Design Pattern Skeleton. ***/
/* This implements the common visitor design pattern.
   Tests show it to be slightly less efficient than the
   instanceof method, but easier to use.
   Replace the R and A parameters with the desired return
   and context types.*/

public class VisitSkel
{
  public class ProgramVisitor<R,A> implements Program.Visitor<R,A>
  {
    public R visit(c_like.Absyn.Pdefs p, A arg)
    { /* Code For Pdefs Goes Here */
      for (Def x: p.listdef_)
      { /* ... */ }
      return null;
    }
  }
  public class DefVisitor<R,A> implements Def.Visitor<R,A>
  {
    public R visit(c_like.Absyn.DFun p, A arg)
    { /* Code For DFun Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.id_;
      for (Arg x: p.listarg_)
      { /* ... */ }
      for (Stm x: p.liststm_)
      { /* ... */ }
      return null;
    }
  }
  public class ArgVisitor<R,A> implements Arg.Visitor<R,A>
  {
    public R visit(c_like.Absyn.ADecl p, A arg)
    { /* Code For ADecl Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.id_;
      return null;
    }
  }
  public class StmVisitor<R,A> implements Stm.Visitor<R,A>
  {
    public R visit(c_like.Absyn.SExp p, A arg)
    { /* Code For SExp Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(c_like.Absyn.SDecl p, A arg)
    { /* Code For SDecl Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.id_;
      return null;
    }    public R visit(c_like.Absyn.SDecls p, A arg)
    { /* Code For SDecls Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.id_;
      for (String x: p.listid_)
      { /* ... */ }
      return null;
    }    public R visit(c_like.Absyn.SInit p, A arg)
    { /* Code For SInit Goes Here */
      p.type_.accept(new TypeVisitor<R,A>(), arg);
      //p.id_;
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(c_like.Absyn.SReturn p, A arg)
    { /* Code For SReturn Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(c_like.Absyn.SWhile p, A arg)
    { /* Code For SWhile Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      p.stm_.accept(new StmVisitor<R,A>(), arg);
      return null;
    }    public R visit(c_like.Absyn.SBlock p, A arg)
    { /* Code For SBlock Goes Here */
      for (Stm x: p.liststm_)
      { /* ... */ }
      return null;
    }    public R visit(c_like.Absyn.SIfElse p, A arg)
    { /* Code For SIfElse Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      p.stm_1.accept(new StmVisitor<R,A>(), arg);
      p.stm_2.accept(new StmVisitor<R,A>(), arg);
      return null;
    }
  }
  public class ExpVisitor<R,A> implements Exp.Visitor<R,A>
  {
    public R visit(c_like.Absyn.EInt p, A arg)
    { /* Code For EInt Goes Here */
      //p.integer_;
      return null;
    }    public R visit(c_like.Absyn.EDouble p, A arg)
    { /* Code For EDouble Goes Here */
      //p.double_;
      return null;
    }    public R visit(c_like.Absyn.EString p, A arg)
    { /* Code For EString Goes Here */
      //p.string_;
      return null;
    }    public R visit(c_like.Absyn.ETrue p, A arg)
    { /* Code For ETrue Goes Here */
      return null;
    }    public R visit(c_like.Absyn.EFalse p, A arg)
    { /* Code For EFalse Goes Here */
      return null;
    }    public R visit(c_like.Absyn.EId p, A arg)
    { /* Code For EId Goes Here */
      //p.id_;
      return null;
    }    public R visit(c_like.Absyn.ECall p, A arg)
    { /* Code For ECall Goes Here */
      //p.id_;
      for (Exp x: p.listexp_)
      { /* ... */ }
      return null;
    }        public R visit(c_like.Absyn.EPIncr p, A arg)
    { /* Code For EPIncr Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(c_like.Absyn.EPDecr p, A arg)
    { /* Code For EPDecr Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(c_like.Absyn.EIncr p, A arg)
    { /* Code For EIncr Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(c_like.Absyn.EDecr p, A arg)
    { /* Code For EDecr Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(c_like.Absyn.ENeg p, A arg)
    { /* Code For ENeg Goes Here */
      p.exp_.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(c_like.Absyn.EMul p, A arg)
    { /* Code For EMul Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(c_like.Absyn.EDiv p, A arg)
    { /* Code For EDiv Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(c_like.Absyn.EAdd p, A arg)
    { /* Code For EAdd Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(c_like.Absyn.ESub p, A arg)
    { /* Code For ESub Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(c_like.Absyn.ELt p, A arg)
    { /* Code For ELt Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(c_like.Absyn.EGt p, A arg)
    { /* Code For EGt Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(c_like.Absyn.ELEq p, A arg)
    { /* Code For ELEq Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(c_like.Absyn.EGEq p, A arg)
    { /* Code For EGEq Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(c_like.Absyn.EEq p, A arg)
    { /* Code For EEq Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }    public R visit(c_like.Absyn.ENEq p, A arg)
    { /* Code For ENEq Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(c_like.Absyn.EAnd p, A arg)
    { /* Code For EAnd Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(c_like.Absyn.EOr p, A arg)
    { /* Code For EOr Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }        public R visit(c_like.Absyn.EAss p, A arg)
    { /* Code For EAss Goes Here */
      p.exp_1.accept(new ExpVisitor<R,A>(), arg);
      p.exp_2.accept(new ExpVisitor<R,A>(), arg);
      return null;
    }
  }
  public class TypeVisitor<R,A> implements Type.Visitor<R,A>
  {
    public R visit(c_like.Absyn.Tbool p, A arg)
    { /* Code For Tbool Goes Here */
      return null;
    }    public R visit(c_like.Absyn.Tdouble p, A arg)
    { /* Code For Tdouble Goes Here */
      return null;
    }    public R visit(c_like.Absyn.Tint p, A arg)
    { /* Code For Tint Goes Here */
      return null;
    }    public R visit(c_like.Absyn.Tstring p, A arg)
    { /* Code For Tstring Goes Here */
      return null;
    }    public R visit(c_like.Absyn.Tvoid p, A arg)
    { /* Code For Tvoid Goes Here */
      return null;
    }
  }
}
