package leetcode.java.sept21;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1, new TreeNode(2), null);
        TreeNode root2 = new TreeNode(1, null, new TreeNode(2));
        System.out.println(new SameTree().compareTrees(root1, root2));

    }

    public boolean compareTrees(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);

        while (!queue.isEmpty()) {
            TreeNode first = queue.poll();
            TreeNode second = queue.poll();

            if (first == null && second == null)
                continue;
            else if (first == null || second == null || first.val != second.val)
                return false;

            queue.offer(first.left);
            queue.offer(second.left);
            queue.offer(first.right);
            queue.offer(second.right);
        }
        return true;
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
