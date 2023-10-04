package com.yushchenkoaleksey.edu.leetcode.easy.binarytree;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinimumDepthBinaryTree {

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        MinimumDepthBinaryTree minimumDepthBinaryTree = new MinimumDepthBinaryTree();
        System.out.println(minimumDepthBinaryTree.minDepth(node1));

//        TreeNode node1 = new TreeNode(1);
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node3 = new TreeNode(3);
//        TreeNode node4 = new TreeNode(4);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node6 = new TreeNode(6);
//        node1.right = node2;
//        node2.right = node3;
//        node3.right = node4;
//        node4.right = node5;
//        node5.right = node6;
//        MinimumDepthBinaryTree minimumDepthBinaryTree = new MinimumDepthBinaryTree();
//        System.out.println(minimumDepthBinaryTree.minDepth(node1));
    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        int layer = 1;
        int currentLayerNodesNumber = 1;
        while (true) {
            int addedNodes = 0;
            for (int i = currentLayerNodesNumber; i > 0; i--) {
                var current = deque.poll();
                if (current.left == null && current.right == null) return layer;
                if (current.left != null){
                    deque.add(current.left);
                    addedNodes++;
                }
                if (current.right != null){
                    deque.add(current.right);
                    addedNodes++;
                }
            }
            layer++;
            currentLayerNodesNumber = addedNodes;
        }
    }

    private int minDepth(TreeNode node, int depth, Deque<TreeNode> deque) {
        var current = deque.poll();
        if (current.left == null && current.right == null) return depth;

        if (current.left != null && current.right != null) {
            deque.add(current.left);
            deque.add(current.right);
            return Math.min(minDepth(current.left, depth + 1, deque), minDepth(current.right, depth + 1, deque));
        } else if (current.left != null) {
            deque.add(current.left);
            return minDepth(current.left, depth + 1, deque);
        }
        deque.add(current.right);
        return minDepth(current.right, depth + 1, deque);

    }

//    private int minDepth(TreeNode node, int depth) {
//        if (node.left == null && node.right == null) return depth;
//        if (node.left != null && node.right != null) {
//            return Math.min(minDepth(node.left, depth + 1), minDepth(node.right, depth + 1));
//        } else if (node.left != null) {
//            return minDepth(node.left, depth + 1);
//        }
//        return minDepth(node.right, depth + 1);
//    }
}
