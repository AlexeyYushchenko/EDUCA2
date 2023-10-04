package com.yushchenkoaleksey.edu.leetcode.easy.binarytree;

//https://leetcode.com/problems/balanced-binary-tree/
//110. Balanced Binary Tree
public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (checkBalance(root) == -1) return false;
        return true;
    }

    private int checkBalance(TreeNode node) {
        if (node == null) return 0;
        int left = checkBalance(node.left);
        int right = checkBalance(node.right);

        if (left == -1 || right == -1) return -1;
        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }

    private int calcDepth(TreeNode node, int depth) {
        if (node == null) return depth - 1;
        return Math.max(calcDepth(node.left, depth + 1), calcDepth(node.right, depth + 1));
    }

    private boolean isBalanced(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null && (node2.right != null || node2.left != null)) {
            return false;
        } else if (node2 == null && (node1.right != null || node1.left != null)) {
            return false;
        } else {
            return isBalanced(node1.left, node1.right) && isBalanced(node2.left, node2.right);
        }
    }
}
