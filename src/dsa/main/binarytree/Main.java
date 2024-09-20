package dsa.main.binarytree;


public class Main {
    public static void main(String[] args) {
        BinaryTree bTree = new BinaryTree();
        bTree.create();

        // Recursive pre-order
        System.out.println("Recursive pre-order");
        bTree.recursivePreOrder(bTree.root());

        // Iterative pre-order
        System.out.println();
        System.out.println("Iterative pre-order");
        bTree.iterativePreOrder(bTree.root());

        // Recursive in-order
        System.out.println();
        System.out.println("Recursive in-order");
        bTree.recursiveInOrder(bTree.root());

        // Iterative in-order
        System.out.println();
        System.out.println("Iterative in-order");
        bTree.iterativeInOrder(bTree.root());

        // Recursive post-order
        System.out.println();
        System.out.println("Recursive post-order");
        bTree.recursivePostOrder(bTree.root());

        // Iterative post-order
        System.out.println();
        System.out.println("Iterative post-order");
        bTree.iterativePostOrder(bTree.root());

        // Level-order
        System.out.println();
        System.out.println("Level-order");
        bTree.levelOrder(bTree.root());

        // Find max - recursive
        System.out.println();
        System.out.println("Find max - Recursive");
        System.out.println("Max is: " + bTree.findMax(bTree.root()));

        // Binary Search Tree
        System.out.println("Binary Search Tree");
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(1);
        bst.insert(3);
        bst.insert(2);
        bst.insert(7);
        bst.insert(5);

        bst.inOrder();

        System.out.println(bst.search(7));
        System.out.println(bst.search(77));

        System.out.println(bst.validate());

    }
}
