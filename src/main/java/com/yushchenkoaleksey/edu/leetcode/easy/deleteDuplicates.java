package com.yushchenkoaleksey.edu.leetcode.easy;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

public class deleteDuplicates {

    @NoArgsConstructor
    @EqualsAndHashCode(of = {"val", "next"})
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

public static ListNode deleteDuplicates(ListNode head) {
            if (head == null) return null;
            if (head.next == null) return head;

            ListNode node1 = head;
            ListNode node2 = head.next;

            while (node2 != null){
                if (node1.val != node2.val){
                    node1.next = node2;
                    node1 = node2;
                }
                node2 = node2.next;
            }

            return head;
        }



    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {Set<Integer> set = new HashSet<>();
        int a = 0;
        int b = 0;
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1 != null){
            a++;
            node1 = node1.next;
        }
        while (node2 != null){
            b++;
            node2 = node2.next;
        }
        node1 = headA;
        node2 = headB;
        if (a > b){
            while (a - b++ > 0){
                node1 = node1.next;
            }
        }else {
            while (b - a++ > 0){
                node2 = node2.next;
            }
        }
        while (node1 != node2){
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }

    public static void main(String[] args) {
        var commonEnd = new ListNode(2, new ListNode(4));
        ListNode headA = new ListNode(1, new ListNode(9, new ListNode(1, commonEnd)));
        ListNode headB = new ListNode(3, commonEnd);
        System.out.println(getIntersectionNode(headA, headB));
    }

}
