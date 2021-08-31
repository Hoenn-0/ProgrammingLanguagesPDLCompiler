// Generated from C:/Users/Hoenn/OneDrive - Sheffield Hallam University/Important/FOPL_assigment2/src\pdl.g4 by ANTLR 4.9.1

package Compiler;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pdlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pdlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pdlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(pdlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#programHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeader(pdlParser.ProgramHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#globals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobals(pdlParser.GlobalsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#programEnds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramEnds(pdlParser.ProgramEndsContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(pdlParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#procDefun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcDefun(pdlParser.ProcDefunContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(pdlParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(pdlParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#outputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatement(pdlParser.OutputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(pdlParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#procedureCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureCall(pdlParser.ProcedureCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(pdlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(pdlParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(pdlParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElse(pdlParser.IfElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pdlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(pdlParser.ValueContext ctx);
}