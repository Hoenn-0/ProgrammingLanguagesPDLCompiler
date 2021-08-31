package Assigment_two;

// windows: ctrl + D Linux: ctrl + z

import Compiler.*;
import Compiler.pdlLexer;
import Compiler.pdlParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Main extends JFrame {

private JTreeImpl jti;
private static Displayer displayer;

    public void drawUI() {
     //   Displayer displayer1 = new Displayer();
        add(displayer.getJTree());

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Display the structure of a program for PDL grammar ");
        this.setSize(new Dimension(400,300));
        this.setLocation(new java.awt.Point(200, 200));
        this.pack();
        this.setVisible(true);
    }

    public static void Program(){

        try {

            String[] InputFile = {"src/inputForGrammar.pdl", "src/divideTwoNumbers.pdl", "src/WhileLoop.pdl"};
            InputStream inStream = System.in;
            System.out.println("ctrl + D");
            System.out.println("+_____Choose a file_____+\n0:" + InputFile[0] + "\n1:" + InputFile[1] + "\n2:" + InputFile[2] );
            Scanner scanFile = new Scanner(System.in);
            int choiceFile = scanFile.nextInt();

            ANTLRInputStream input;
            inStream = new FileInputStream(InputFile[choiceFile]);

            //input = new ANTLRInputStream(System.in); // Console Input
            input = new ANTLRInputStream(inStream); //File Input

            pdlLexer lexer = new pdlLexer(input); //pdlLexer makes the rule/structure see pdlLexer.tokens.interp
            CommonTokenStream tokens = new CommonTokenStream(lexer);// receives/handles consistent tokens from lexer and feeds it to parser
            pdlParser parser = new pdlParser(tokens);
            ParseTree tree = parser.program(); // starts in grammar rule/node in and method is called to return context

            ParseTreeWalker walker = new ParseTreeWalker();

           displayer = new Displayer();
            walker.walk(displayer, tree);


            //USER OPTIONS
            System.out.println("Choose an option number:\n 1:Worker\n 2:Searcher\n 3:Displayer\n 4:Compiler");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();

            //ask user again for valid option
            while (choice > 5 || choice < 0) {
                System.out.println("Invalid choice, Choose again:");
                choice = scan.nextInt();
            }

            while (choice != 5){// mostly using parse tree wallker .walk method for each option
                switch (choice) {
                    case 1 -> {
                        Worker worker = new Worker();
                        walker.walk(worker, tree);
                        //System.out.println("aaa" + tree.getChildCount());
                        //   System.out.println("aaa" + tree.getChild(5).getText());
                        System.out.println("\nS-Expressions:");
                        for (int i =0;  i<tree.getChildCount() ;i++){
                          //  System.out.println( tree.getChild(i).getText());// prints out root Node of parserTree object //s-expression

                         //   System.out.println("\nS-ExpressionsNumberTwo: " + tree.getChild(i).toStringTree(parser));// prints out root Node of parserTree object //s-expression
                           // System.out.println("\n\nS-Expressions Summary: " + tree.toStringTree(parser));// prints out root Node of parserTree object //s-expression
                            System.out.println("Node "+ i + ": " +tree.getChild(i).toStringTree(parser));

                        }
                        System.out.println("\nS-Expressions Summary: " + tree.toStringTree(parser));// prints out root Node of parserTree object //s-expression



                    }
                    case 2 -> {
                        Searcher searcher = new Searcher();
                        walker.walk(searcher, tree);
                        if (choiceFile == 2){searcher.getWhileLoopResult();}
                        searcher.getLeafNodes();
                       // System.out.println("Find A WORD IN GRAMMAR: ");
                        //String scan2 = scan.nextLine();
                        String findWord = ("endprogram"); // change input to find a different valid word
                        searcher.setFindUserInput(findWord);
                        searcher.ReturnStringInputSearch();
                     //   System.out.println("Get Parent" + tokens.getTokens().toString());
                       // System.out.println("DIVISION " + searcher.getResult());
                    }
                    case 3 -> {

                        SwingUtilities.invokeLater(new Runnable() {
                            @Override
                            public void run() {
                                Main main = new Main();
                                main.drawUI();
                            }
                        });
                    }

                    case 4 ->{
                        Compiler compiler = new Compiler();
                        walker.walk(compiler, tree);
                        System.out.println("Result is" + compiler.getResult());
                        FileWriter writer = new FileWriter("src/output.js");
                       writer.write(compiler.toString());
                        writer.close();
                    }

                }
                System.out.println("\n\nChoose option number:\n 1:Worker\n 2:Searcher\n 3:Displayer\n 4:Exit");
                choice = scan.nextInt();
            }


//            Integer result = worker.visit(tree);
//            System.out.println("The result was "+ result);

        } catch (IOException e) {
            e.printStackTrace();
        }

        catch (Exception ex) {
            System.out.println("Exception whilst creating parse tree.");
        }





    }

    public static void main(String[] args) {

   Program();
    } // main method
//18:43 how towrite file and javascirpt






}  // Main class



/*
*
*
*
*
* */

