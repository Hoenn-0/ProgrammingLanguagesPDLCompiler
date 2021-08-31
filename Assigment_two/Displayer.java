package Assigment_two;
import Compiler.*;
import org.antlr.v4.runtime.ParserRuleContext;

import javax.swing.JTree;

public class Displayer extends pdlBaseListener{

    private JTreeImpl jti;
    public JTree getJTree() { return this.jti.getTree(); }

    String Node;

    @Override public void enterProgram(pdlParser.ProgramContext ctx) {
            Node = ctx.getStart().getText();
            jti = new JTreeImpl(Node);

        }

    @Override public void exitProgram(pdlParser.ProgramContext ctx) {

            jti.exitNode();

    }

    @Override public void enterProgramHeader(pdlParser.ProgramHeaderContext ctx) {
        //Condition to check if ctx has "Program" to remove null nodes from GUI
        if(ctx.getStart().getText().equals("program")) {

            jti.enterNode("ProgramHeader");
            for (int i = 0; i < ctx.getChildCount(); i++) {
                jti.addLeaf(ctx.getChild(i).getText());
            }
        }
    }

    @Override public void exitProgramHeader(pdlParser.ProgramHeaderContext ctx) {
        if(ctx.getStart().getText().equals("program")) {

            jti.exitNode();
        }
    }
    @Override public void enterGlobals(pdlParser.GlobalsContext ctx) {
        Node = ctx.getStart().getText();

        jti.enterNode(Node);//"enterGlobals"
        for (int i=0; i<ctx.getChildCount();i++) {
            jti.addLeaf(ctx.getChild(i).getText());
        }

    }

    @Override public void exitGlobals(pdlParser.GlobalsContext ctx) {
        jti.exitNode();

    }

    @Override public void enterBlock(pdlParser.BlockContext ctx) {
        jti.enterNode("Block");
    }

    @Override public void exitBlock(pdlParser.BlockContext ctx) {
        jti.exitNode();
    }
    //Condition to check if ctx has "Program" to remove null nodes from GUI

    @Override public void enterProgramEnds(pdlParser.ProgramEndsContext ctx) {
        if(ctx.getStart().getText().equals("endprogram")) {

            jti.enterNode("ProgramEnds");
        }

    }

    @Override public void exitProgramEnds(pdlParser.ProgramEndsContext ctx) {
        if(ctx.getStart().getText().equals("endprogram")) {

            jti.addLeaf(ctx.getText());
            jti.exitNode();
        }
    }


    @Override public void enterProcDefun(pdlParser.ProcDefunContext ctx) {
        //Condition to check if ctx has "Program" to remove null nodes from GUI

        if(ctx.getStart().getText().equals("proc")) {

            jti.enterNode("ProcDeFun");
            for (int i = 0; i < ctx.getChildCount(); i++) {
                jti.addLeaf(ctx.getChild(i).getText());
            }
        }
    }

    @Override public void exitProcDefun(pdlParser.ProcDefunContext ctx) {
        if(ctx.getStart().getText().equals("proc")) {

            jti.exitNode();
        }
    }

    @Override public void enterComparator(pdlParser.ComparatorContext ctx) {

        jti.enterNode("Comparator");
        for (int i=0; i<ctx.getChildCount();i++) {
            jti.addLeaf(ctx.getChild(i).getText());
        }
    }

    @Override public void exitComparator(pdlParser.ComparatorContext ctx) {
        jti.exitNode();
    }

    @Override public void enterValue(pdlParser.ValueContext ctx) {
        jti.enterNode("Value");
        for (int i=0; i<ctx.getChildCount();i++) {
            jti.addLeaf(ctx.getChild(i).getText());
        }        //System.out.println(ctx.getText());
    }
    @Override public void exitValue(pdlParser.ValueContext ctx) {
       jti.exitNode();
    }

        @Override public void enterOutputStatement(pdlParser.OutputStatementContext ctx) {
        Node = ctx.getStart().getText();

        jti.enterNode(Node);
        for (int i=0; i<ctx.getChildCount();i++) {
            jti.addLeaf(ctx.getChild(i).getText());
        }
    }


        @Override public void exitOutputStatement(pdlParser.OutputStatementContext ctx) {

    }

    @Override public void enterIfElse(pdlParser.IfElseContext ctx) {
       // jti.addLeaf(ctx.getText());
        Node = ctx.getStart().getText();

        jti.enterNode(Node);
        /*for (int i=0; i<ctx.getChildCount();i++) {
            jti.addLeaf(ctx.getChild(i).getText());
        }*/
    }
    @Override public void exitIfElse(pdlParser.IfElseContext ctx) {
        jti.exitNode();
    }

    @Override public void enterAssignment(pdlParser.AssignmentContext ctx) {
        Node = ctx.getStart().getText();

        jti.enterNode(Node);
        for (int i=0; i<ctx.getChildCount();i++) {
            jti.addLeaf(ctx.getChild(i).getText());
        }

    }

    @Override public void exitAssignment(pdlParser.AssignmentContext ctx) {
        jti.exitNode();

    }

    @Override public void enterExpr(pdlParser.ExprContext ctx) {

        jti.enterNode("Expression");

        for (int i=0; i<ctx.getChildCount();i++) {
            jti.addLeaf(ctx.getChild(i).getText());
        }
    }

    @Override public void exitExpr(pdlParser.ExprContext ctx) {
        jti.exitNode();
    }

    @Override public void enterWhileLoop(pdlParser.WhileLoopContext ctx) {
        jti.enterNode("WhileLoop");
       // jti.addLeaf(ctx.getChild(2).getText());

       for (int i=0; i<ctx.getChildCount();i++) {
            jti.addLeaf(ctx.getChild(i).getText());
        }
    }


    @Override public void exitWhileLoop(pdlParser.WhileLoopContext ctx) { jti.exitNode();
    }










}
