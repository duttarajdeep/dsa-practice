package ds.prep.firstround.binarytree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private TreeNode root;

    public void create() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        root = node1;
        node1.left = node2;
        node1.right = node3;
        node2.right = node4;
        node3.left = node5;
    }

    // Pre-order traversals
    public void recursivePreOrder(TreeNode root) {
        //base
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        recursivePreOrder(root.left);
        recursivePreOrder(root.right);
    }

    public void iterativePreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");
            if (temp.right != null) stack.push(temp.right);
            if (temp.left != null) stack.push(temp.left);
        }
    }


    // In-order traversals
    public void iterativeInOrder(TreeNode root) {
        if (root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {

            /** if current node is not null:
             *      push current node to stack
             *      move to the left of the node
             * else:
             *      pop current node;
             *      visit current node;
             *      move to right of the current node
             * */

            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void recursiveInOrder(TreeNode root) {
        if (root == null) return;

        recursiveInOrder(root.left);
        System.out.print(root.data + " ");
        recursiveInOrder(root.right);

    }


    // Post-order traversals
    public void recursivePostOrder(TreeNode root) {
        // base condition
        if (root == null) return;

        // Traverse left nodes
        recursivePostOrder(root.left);

        // Traverse right nodes
        recursivePostOrder(root.right);

        // Visit current parent
        System.out.print(root.data + " ");
    }

    public void iterativePostOrder(TreeNode root) {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                /** push the element to the stack and move to the left-subtree */
                stack.push(current);
                current = current.left;
            } else {
                /**
                 * check the right sub-tree of the current node
                 * if its not null:
                 *      check if the node is the left or the right child of the parent
                 *      if its left child, continue
                 *      if its right child,
                 *          pop the parent from the stack and visit it
                 * else:
                 *
                 * */
                TreeNode temp = stack.peek().right;
                if (temp == null) {
                    // at this point, both the children of the parent are null
                    // so now we can visit the parent node
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;
                }
            }
        }
    }


    // Level-order traversal
    public void levelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");
            if (temp.left != null) queue.offer(temp.left);
            if (temp.right != null) queue.offer(temp.right);
        }
    }

    public int findMax(TreeNode root) {
        // base case
        if (root == null) return Integer.MIN_VALUE;

        int res = root.data;

        int left = findMax(root.left);
        int right = findMax(root.right);

        if (left > res) res = left;
        if (right > res) res = right;

        return res;
    }

    public TreeNode root() {
        return this.root;
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
