package ds.prep.firstround.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public TreeNode root;

    public boolean validate() {
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean validate(TreeNode root, int min, int max) {
        if (root == null) return true;
        if (root.data >= max || root.data <= min) return false;

        boolean left = validate(root.left, min, root.data);
        if (left) {
            boolean right = validate(root.right, root.data, max);
            return right;
        }
        return false;
    }

    public String search(int key) {
        return search(root, key) != null ? "Exists" : "Does not exist";
    }

    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.data == key) return root;
        if (root.data > key) return search(root.left, key);
        else return search(root.right, key);
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        // base case
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data)
            root.left = insert(root.left, value);
        else
            root.right = insert(root.right, value);

        return root;
    }

    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void levelOrder() {
        levelOrderTraversal(root);
    }

    public void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) queue.offer(temp.left);
            if (temp.right != null) queue.offer(temp.right);
        }
    }

    private class TreeNode {
        private final int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }
}
