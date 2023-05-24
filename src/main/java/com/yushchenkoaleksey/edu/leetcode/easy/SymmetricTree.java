package com.yushchenkoaleksey.edu.leetcode.easy;

public class SymmetricTree {

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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        var symmetric = isSymmetric(root);
        System.out.println(symmetric + ", correct=true");
        System.out.println();

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = null;
        root.left.right = new TreeNode(4);

        root.right = new TreeNode(2);
        root.right.left = null;
        root.right.right = new TreeNode(4);
        symmetric = isSymmetric(root);
        System.out.println(symmetric + ", correct=false");
        System.out.println();

//        root = null;
//        symmetric = isSymmetric(root);
//        System.out.println(symmetric + ", correct=false");
//        System.out.println();

        root = new TreeNode(1);
        root.left = null;
        root.right = new TreeNode(2);
        symmetric = isSymmetric(root);
        System.out.println(symmetric + ", correct=false");
        System.out.println();


        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);

        root.left.left = null;
        root.left.right = new TreeNode(3);

        root.right.right = null;
        root.right.left = new TreeNode(3);
        symmetric = isSymmetric(root);
        System.out.println(symmetric + ", correct=true");
        System.out.println();

//        2,3,3,4,5,4,5
        System.out.println("Test 6");
        root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);

        symmetric = isSymmetric(root);
        System.out.println(symmetric + ", correct=false");
        System.out.println();

    }

    public static boolean isSymmetric(TreeNode root) {
        return checkTree(root.left, root.right);
    }

    public static boolean checkTree(TreeNode p, TreeNode q){
        if (p == null || q == null) return p == q;
        return p.val == q.val && checkTree(p.left, q.right) && checkTree(p.right, q.left);
    }

}
