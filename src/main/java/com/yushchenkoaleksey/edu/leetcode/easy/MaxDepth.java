package com.yushchenkoaleksey.edu.leetcode.easy;

public class MaxDepth {

    public static class TreeNode {
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

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.left = new TreeNode(7);
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode node) {
        return Math.max(check(node.left, 2), check(node.right, 2));
    }

    public static int check(TreeNode node, int l){
        if (node == null) return l - 1;
        return Math.max(check(node.left, l + 1), check(node.right, l + 1));
    }
}
