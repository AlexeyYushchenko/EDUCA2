package com.yushchenkoaleksey.edu.leetcode.easy.bst;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
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

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int s, int e) {
        if (s > e) return null;
        int mid = (s + e) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, s, mid - 1);
        node.right = sortedArrayToBST(nums, mid + 1, e);
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums, int s, int e, TreeNode parent) {
        if (s >= e) return null;
        int mid = (s + e) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = sortedArrayToBST(nums, 0, mid - 1, node);
        node.right = sortedArrayToBST(nums, mid + 1, nums.length - 1, node);
        return node;
    }

    public static void main(String[] args) {
        SortedArrayToBST sortedArrayToBST = new SortedArrayToBST();
//        var node = sortedArrayToBST.sortedArrayToBST(new int[]{1, 2, 3});
//        System.out.println(node);
        var node1 = sortedArrayToBST.sortedArrayToBST(new int[]{-10, -3, 0, 5, 7, 9});
        System.out.println(node1);
    }
}



















