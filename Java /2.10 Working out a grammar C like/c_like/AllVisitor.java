package c_like;

import c_like.Absyn.*;

/** BNFC-Generated All Visitor */
public interface AllVisitor<R,A> extends
  c_like.Absyn.Program.Visitor<R,A>,
  c_like.Absyn.Def.Visitor<R,A>,
  c_like.Absyn.Arg.Visitor<R,A>,
  c_like.Absyn.Stm.Visitor<R,A>,
  c_like.Absyn.Exp.Visitor<R,A>,
  c_like.Absyn.Type.Visitor<R,A>
{}
