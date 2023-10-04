package com.yushchenkoaleksey.edu.leetcode.easy.binarytree;

//100. Same Tree
//https://leetcode.com/problems/same-tree/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node. */
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

    @Override
    public String toString() {
        return String.valueOf(this.val);
    }
}

public class BinaryTreeSolutions {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if(p.val != q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        var temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        return hasPathSum(root, targetSum, 0);
    }

    public boolean hasPathSum(TreeNode node, int targetSum, int sum) {
        if (node.left == null && node.right == null){
            return sum + node.val == targetSum;
        }else if (node.left == null){
            return hasPathSum(node.right, targetSum, sum + node.val);
        }else if(node.right == null){
            return hasPathSum(node.left, targetSum, sum + node.val);
        }
        return hasPathSum(node.left, targetSum, sum + node.val) || hasPathSum(node.right, targetSum, sum + node.val);
    }

    public int countNodes(TreeNode root) {
        return countNodes(root, 0);
    }

    private int countNodes(TreeNode node, int counter) {
        if (node == null) return 0;
        return counter + 1 + countNodes(node.right, counter) + countNodes(node.left, counter);
    }


    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> sums = new ArrayList<>();
        List<Integer> nodesNum = new ArrayList<>();
        nodesWalker(root, 0, sums, nodesNum);
        for (int i = 0; i < sums.size(); i++) {
            sums.set(i, sums.get(i) / nodesNum.get(i));
        }
        return sums;
    }

    private void nodesWalker(TreeNode node, int level, List<Double> sums, List<Integer> nodesNum){
        if (node == null) return;
        if(sums.size() <= level) sums.add(0.0);
        if(nodesNum.size() <= level) nodesNum.add(0);
        sums.set(level, sums.get(level) + node.val);
        nodesNum.set(level, nodesNum.get(level) + 1);
        nodesWalker(node.left, level + 1, sums, nodesNum);
        nodesWalker(node.right, level + 1, sums, nodesNum);
    }

    public static void main(String[] args) {
//        TreeNode treeNode = new TreeNode(1, new TreeNode(2), null);
//        System.out.println(new BinaryTreeSolutions().hasPathSum(treeNode, 3));

        //[5,4,8,11,null,13,4,7,2,null,null,null,1]
//        TreeNode treeNode1 = new TreeNode(5,
//                new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null),
//                new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(11))));
//        System.out.println(new BinaryTreeSolutions().hasPathSum(treeNode1, 22));

        //[3,9,20,null,null,15,7]
        TreeNode treeNode2 = new TreeNode(3, new TreeNode(9, null, null), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(new BinaryTreeSolutions().averageOfLevels(treeNode2));
    }
}