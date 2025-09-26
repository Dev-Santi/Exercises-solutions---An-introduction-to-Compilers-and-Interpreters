package Clike;

import Clike.Absyn.*;

/** BNFC-Generated All Visitor */
public interface AllVisitor<R,A> extends
  Clike.Absyn.Program.Visitor<R,A>,
  Clike.Absyn.Def.Visitor<R,A>,
  Clike.Absyn.Arg.Visitor<R,A>,
  Clike.Absyn.Stm.Visitor<R,A>,
  Clike.Absyn.Exp.Visitor<R,A>,
  Clike.Absyn.Type.Visitor<R,A>
{}
