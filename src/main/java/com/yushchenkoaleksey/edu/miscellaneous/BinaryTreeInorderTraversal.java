package com.yushchenkoaleksey.edu.miscellaneous;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

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
    }

    public static void main(String[] args) {
        var four = new TreeNode(4);
        var five = new TreeNode(5);
        var six = new TreeNode(6);
        var seven = new TreeNode(7);
        var two = new TreeNode(2, four, five);
        var three = new TreeNode(3, six, seven);
        var one = new TreeNode(1, two, three);
        System.out.println(traverseTree(one));

//        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), new TreeNode(7, new TreeNode(1), null)));
//        System.out.println(inorderTraversal(treeNode));
//        treeNode = new TreeNode(1, new TreeNode(2), null);
//        System.out.println(inorderTraversal(treeNode));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        addNumbers(res, root);
        return res;
    }

    private static void addNumbers(List<Integer> res, TreeNode root) {
        if (root == null) return;

    }

    public static List<Integer> traverseTree(TreeNode node){
        Stack<Integer> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        walk(node, stack, res);
        return res;
    }

    private static void walk(TreeNode node, Stack<Integer> stack, List<Integer> res) {
        stack.add(node.val);
        if (node.left != null){
            walk(node.left, stack, res);
        }
            res.add(stack.pop());
        if (node.right != null){
            walk(node.right, stack, res);
        }
    }
}
