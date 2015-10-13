package alhorithms;

import alhorithms.tree.Tree;

public class App {
    public static void main(String args[]) {
        Tree tree = new Tree();
        tree.add(new Integer(10));
        tree.add(new Integer(5));
        tree.add(new Integer(7));
        tree.add(new Integer(1));
        tree.add(new Integer(2));
        tree.add(new Integer(8));
        tree.add(new Integer(9));
        tree.add(new Integer(6));
        tree.add(new Integer(15));
        tree.add(new Integer(13));
        tree.add(new Integer(20));

        //duplicate value
        tree.add(new Integer(1));
    }
}