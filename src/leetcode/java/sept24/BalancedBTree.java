package leetcode.java.sept24;

public class BalancedBTree {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;

        int left = getMaxHeight(root.left);
        int right = getMaxHeight(root.right);

        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int getMaxHeight(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(getMaxHeight(root.left), getMaxHeight(root.right));
    }

    private class TreeNode {
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
