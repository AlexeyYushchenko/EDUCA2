package com.yushchenkoaleksey.edu.leetcode.middle.linkedlist;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SplitLinkedListInPartsTest {

    SplitLinkedListInParts split = new SplitLinkedListInParts();
    @Test
    void splitListToParts() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        var listNodes = split.splitListToParts(node1, 5);
        System.out.println(Arrays.toString(listNodes));

//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(4);
//        ListNode node5 = new ListNode(5);
//        ListNode node6 = new ListNode(6);
//        ListNode node7 = new ListNode(7);
//        ListNode node8 = new ListNode(8);
//        ListNode node9 = new ListNode(9);
//        ListNode node10 = new ListNode(10);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//        node5.next = node6;
//        node6.next = node7;
//        node7.next = node8;
//        node8.next = node9;
//        node9.next = node10;
//        var listNodes = split.splitListToParts(node1, 3);
//        System.out.println(Arrays.toString(listNodes));

    }
}