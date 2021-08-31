package Assigment_two;
import Compiler.pdlBaseListener;
import org.antlr.v4.runtime.ParserRuleContext;
import Compiler.*;

//To show parse tree can be walk show how many child nodes there are and print its value(week 12)
//can use a visitor to show each node can be walked look at week 12 26min:code will have define/print to each rule
//48mins:37 can SOUT the parse tree like that with a visitor
public class Worker extends pdlBaseListener {
//enterEveryRule and exitEveryrule to walk the tree watch week 13 min 15+
    //40mins ++ to see how parse tree walker is instantiated in Main class
//TODO: SHOW parse tree can be walked by printing out each rule


//TODO: Display parse treeusing s-expressions with associated value
    //Walking the tree
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
       //System.out.println("enter everyRule: " + ctx.getChild(0).getText()); // getting value

       System.out.println("Grammar node->" + ctx.getStart().getText() + " With a value of: " + ctx.getText());
       System.out.println("And the node has: " + ctx.getChildCount() + " children");


    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    //    System.out.println("exit everyRule: " + ctx.getText());
        //System.out.println(" aa"+ ctx.getText()); // grammar header
        //    System.out.println("BBBB"+ctx.getText());
        //      System.out.println(ctx.getText() +"aaaaa");
        // System.out.println("ADDD"+ctx.getText());
        // System.out.println(ctx.getParent().getChild(0).getText() +"getCHILD");

    }






}
