package Assigment_two;
import Compiler.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Compiler extends pdlBaseListener {

StringBuilder SB = new StringBuilder();
STGroup stg = new STGroupFile("PDL.stg");
String ProgramName;
private Stack<Double> DoubleContainer = new Stack<>();
private double Result;
// Ctx is returned as string due to .getText. so parsing it to a double is needed in order to do calculations
    public  double isNumeric(String str) {
        try {
            double value = Double.parseDouble(str);
            if (value != 0.0) {
                System.out.println(value);
                return value;
            }
        } catch (NumberFormatException e) {
            return -1;
        }
        return -1;
    }

    private void calculateResult(){
        // DoubleContainer.pop();
        // DoubleContainer.pop();

        double operandRight = DoubleContainer.pop();
        double operandLeft = DoubleContainer.pop();
        if(operandRight != 0.0){
            System.out.println("Can Not Divide by zero!");
        } else {
            Result = operandLeft / operandRight;
        }

    }

    public double getResult(){
        calculateResult();
        return Result;
    }


    @Override public void exitValue(pdlParser.ValueContext ctx) {
        for (int i =0; i<ctx.getChildCount();i++) {
        // System.out.println(ctx.getChild(0).getText() + "values ");
        //if value is numeric push it to stack

        String value_Zero = ctx.getChild(i).getText();
        System.out.println(ctx.getChild(i).getText() + ctx.getClass());
        if (isNumeric(value_Zero) != -1) {
            DoubleContainer.push(isNumeric(value_Zero));
            // System.out.println(DoubleContainer.peek());
        }
    }
    }


        @Override public void enterProgram(pdlParser.ProgramContext ctx) {
        List<ParseTree> values = ctx.children;
        ArrayList<String> valueNames = new ArrayList<String>();

        // System.out.println(ctx.children.toString() + "a");

    }

    @Override public void exitProgram(pdlParser.ProgramContext ctx) {
     //   for ()
        SB.append("document.getElementById('results').innerHTML = result;\n" +
                "    }\n" +
                "</script>\n" +
                "\n" +
                "<input type=\"button\" value=\"Result\" onClick=\"CalculateResult()\" />\n" +
                "<br/>\n" +
                "Result: <span id=\"results\">(click \"CalculateResult\")</span>\n");
    }


        @Override public void enterGlobals(pdlParser.GlobalsContext ctx) {
        List<ParseTree> values = ctx.children;
        ArrayList<String> valueNames = new ArrayList<String>();
        System.out.println(values.get(1).getText()+ "CheckV");

        for(int i=1; i<ctx.getChildCount(); i++)
            valueNames.add(values.get(i).getText());

        ST st = stg.getInstanceOf("globals");
        st.add("values", valueNames);
        SB.append(st.render());
    }

// ctx child count is 7 ident[2] value[4]
    public void enterWhileLoop(pdlParser.WhileLoopContext ctx) {
        String comp = ctx.getChild(3).getText();
        if (comp.compareTo("=") == 0) comp = "==";

        ST st = stg.getInstanceOf("whileLoop");
        st.add("operandLeft", ctx.getChild(2).getText());
        st.add("comparator", comp);
        st.add("operandRight", ctx.getChild(4).getText());

        SB.append(st.render().trim());
    }

//endProc
    public void enterProcedureCall(pdlParser.ProcedureCallContext ctx) {
        String procedureName = ctx.getChild(1).getText();
        List<ParseTree> values = ctx.children;
        ArrayList<String> params = new ArrayList<String>();

        ST st = stg.getInstanceOf("procCall");
        for(int i=3; i<ctx.getChildCount(); i+=2)
            params.add(values.get(i).getText());

        st.add("getResult", procedureName);
        st.add("values", params);
        SB.append(st.render());
    }

    //https://jsfiddle.net/
    public  String toString() { return SB.toString(); }


}
