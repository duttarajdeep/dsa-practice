package leetcode.java.sept22;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        invertTree(root);
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            final TreeNode current = queue.poll();

            //swap
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return root;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
