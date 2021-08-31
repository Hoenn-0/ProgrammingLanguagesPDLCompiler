package Assigment_two;
import Compiler.*;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Stack;

public class Searcher extends pdlBaseListener {
    //containers
  private ArrayList<String> container = new ArrayList<>();// whileloop Container
  private ArrayList<String> leafNodes = new ArrayList<String>(); // leafNode Container
    private ArrayList<String> CheckUserInput = new ArrayList<String>(); // UserInput Container

    //Counter
    private int WhileLoopCounter;


    public void setFindUserInput(String findUserInput) {
        FindUserInput = findUserInput;
    }

    private String FindUserInput = "endprogram";


public void getWhileLoopResult(){
    System.out.println("Amount of times WhileLoop is used: " + WhileLoopCounter + "times");
    }

    public void getLeafNodes(){
        for (String leaf:leafNodes) {
            System.out.println(leaf);
        }
    }




public void ReturnStringInputSearch(){
    for (String FindIN:CheckUserInput) {
        System.out.println("Word: " + FindUserInput + ". And was found in: " + FindIN);
    }
}




    @Override public void enterProgram(pdlParser.ProgramContext ctx) {
// condition to find user input
        if (FindUserInput != null) { // if FindUserInput is defined
           for (int i =0; i< ctx.getChildCount();i++){
                String s2=ctx.getChild(0).getText();


            System.out.println("Outer" + s2.contains(FindUserInput));
            //if a match is found with the userInput, add it to the stack
                if (s2.contains(FindUserInput)){
                    CheckUserInput.add(ctx.getParent().getText());
                    System.out.println("INNER");
                }
           }

        }
        //if finduserinput is null/not defined
        if (FindUserInput == null){
            System.out.println("String search is " + FindUserInput);
        }
    }



    @Override public void exitEveryRule(ParserRuleContext ctx) {
//
        //condition to find leaf nodes with 0 child
        if(ctx.getChildCount() == 1) {
            String s1 = "Leaf Node:-> " + ctx.getChild(0).getText() + "       Class/Rule Name:->$ " + ctx.getClass();
            leafNodes.add(s1);
           // System.out.println("HOW MANY" + ctx.getChild(0).getText() + ctx.getClass());
        }


    }
    //Condition to check if list container = "while"  if so counter++
        @Override public void enterWhileLoop (pdlParser.WhileLoopContext ctx){

            //performance will be O(n); unsorted. Binary Search  tree O(logn) Sorted algo.
            container.add(ctx.getText());
            //condition to check if arraylist contains while if so set WhileLoopcounter++
            for (int i = 0; i < container.size(); i++) {

                if (container.get(i).startsWith("while")) {
                    WhileLoopCounter++;
                }

            }


        }


    @Override public void enterAssignment(pdlParser.AssignmentContext ctx) {
        //System.out.println(ctx.getChild(3).getText()+ "cCount ");
        /*IntContainer.push(Integer.parseInt(ctx.getChild(3).getText()));

        System.out.println("RESULT IS" + Result);*/
    //String a = ctx.getChild(3).getText();

    }

    @Override public void enterBlock(pdlParser.BlockContext ctx) {

    }


    @Override public void enterValue(pdlParser.ValueContext ctx) {
       // System.out.println(ctx.getChild(0).getText()+ "cCount " +ctx.getParent().getText());
      //  System.out.println(ctx.getChildCount());
       // System.out.println("string valuea"+ctx.getText());



        //<___>


    }
    @Override public void enterProgramEnds(pdlParser.ProgramEndsContext ctx) {
    }

}
