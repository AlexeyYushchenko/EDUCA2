package com.yushchenkoaleksey.edu.leetcode.easy.linkedlist;

/**
 Definition for singly-linked list. */
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return false;
        ListNode turtle = head;
        ListNode rabbit = head.next;
        while (turtle != rabbit){
            if (rabbit.next == null || rabbit.next.next == null) return false;
            turtle = turtle.next;
            rabbit = rabbit.next.next;
        }
        return true;
    }
}

