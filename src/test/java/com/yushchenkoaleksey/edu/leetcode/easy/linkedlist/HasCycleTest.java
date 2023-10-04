package com.yushchenkoaleksey.edu.leetcode.easy.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HasCycleTest {

    @Test
    void hasCycle() {
        HasCycle hasCycle = new HasCycle();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.setNext(listNode2);
        listNode2.setNext(listNode3);
        listNode3.setNext(listNode4);

        assertFalse(hasCycle.hasCycle(listNode1));

        listNode4.setNext(listNode1);
        assertTrue(hasCycle.hasCycle(listNode1));
    }
}