// Generated from C:/Users/Hoenn/OneDrive - Sheffield Hallam University/Important/FOPL_assigment2/src\pdl.g4 by ANTLR 4.9.1

package Compiler;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pdlParser}.
 */
public interface pdlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pdlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(pdlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(pdlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeader(pdlParser.ProgramHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#programHeader}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeader(pdlParser.ProgramHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#globals}.
	 * @param ctx the parse tree
	 */
	void enterGlobals(pdlParser.GlobalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#globals}.
	 * @param ctx the parse tree
	 */
	void exitGlobals(pdlParser.GlobalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#programEnds}.
	 * @param ctx the parse tree
	 */
	void enterProgramEnds(pdlParser.ProgramEndsContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#programEnds}.
	 * @param ctx the parse tree
	 */
	void exitProgramEnds(pdlParser.ProgramEndsContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(pdlParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(pdlParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#procDefun}.
	 * @param ctx the parse tree
	 */
	void enterProcDefun(pdlParser.ProcDefunContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#procDefun}.
	 * @param ctx the parse tree
	 */
	void exitProcDefun(pdlParser.ProcDefunContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(pdlParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(pdlParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(pdlParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(pdlParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatement(pdlParser.OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatement(pdlParser.OutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(pdlParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(pdlParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void enterProcedureCall(pdlParser.ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#procedureCall}.
	 * @param ctx the parse tree
	 */
	void exitProcedureCall(pdlParser.ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(pdlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(pdlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(pdlParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(pdlParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(pdlParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(pdlParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(pdlParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(pdlParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pdlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(pdlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pdlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(pdlParser.ValueContext ctx);
}