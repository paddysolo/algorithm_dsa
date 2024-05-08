package org.solomononaiwu.binary_search_tree;

public class BinarySearchTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(900);
        tree.insert(30);
        tree.insert(23);
        tree.insert(29);
        tree.insert(45);
        tree.insert(49);
        tree.insert(43);
        tree.insert(5000);
        tree.insert(-200);

        tree.transverseInOrder();
        System.out.println("\n");
        System.out.println("MIN : "+tree.min());
        System.out.println("MAX : "+tree.max());

        System.out.println("MIN : "+tree.minimum());
        System.out.println("MAX : "+tree.maximum());

        System.out.println("\n");
        tree.get(485);
        System.out.println();
        System.out.println(tree.getData(12));
    }
}
