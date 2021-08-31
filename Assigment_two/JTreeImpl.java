package Assigment_two;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.Stack;

public class JTreeImpl {
    private JTree tree;
    public JTree getTree() { return this.tree; }

    private final Stack<DefaultMutableTreeNode> memory = new Stack<>();

    // to create  gui JTREE: this 4 methods are important
    // root node of the program
    public JTreeImpl(String rootTxt) {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(rootTxt);
        tree = new JTree(root);
        tree.setShowsRootHandles(true);
        memory.push(root);
    }

    public void enterNode(String text) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(text);
        memory.peek().add(node);
        memory.push(node);
    }

    public void exitNode() {
        memory.pop();
    }
    public void addLeaf(String text) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(text);
        memory.peek().add(node);
    }
}