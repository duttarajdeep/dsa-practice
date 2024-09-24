package leetcode.java.sept24;

/**
 * Approach:
 * start from root
 * check if current node > both p && q
 * if yes, move to left
 * check if current node < both p && q
 * if yes, move to right
 * if we have found a node such that p < node.val < q, then this is the LCA node
 * Also, if we have found a node where node.val == p || node.val == q, then this is the LCA node
 */

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
