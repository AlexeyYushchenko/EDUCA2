package com.yushchenkoaleksey.edu.leetcode.easy;

public class ConvertSortedArrayToBinarySearchTree {

    public static class TreeNode {
        int val;
        BinaryTreeInorderTraversal.TreeNode left;
        BinaryTreeInorderTraversal.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, BinaryTreeInorderTraversal.TreeNode left, BinaryTreeInorderTraversal.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        var root = nums[nums.length / 2];
        return new TreeNode(root);
    }

    public void buildTree(){

    }
}
