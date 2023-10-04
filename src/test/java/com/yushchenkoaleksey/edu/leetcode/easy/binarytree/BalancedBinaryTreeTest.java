package com.yushchenkoaleksey.edu.leetcode.easy.binarytree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBinaryTreeTest {
    BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
    @Test
    void isBalanced1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        assertTrue(balancedBinaryTree.isBalanced(root));
    }
    @Test
    void isBalanced2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        assertFalse(balancedBinaryTree.isBalanced(root));
    }

    @Test
    void isBalanced3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right.right.right = new TreeNode(4);
        assertFalse(balancedBinaryTree.isBalanced(root));
    }
}