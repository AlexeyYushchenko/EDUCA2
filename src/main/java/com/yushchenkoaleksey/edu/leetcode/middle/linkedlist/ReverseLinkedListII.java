package com.yushchenkoaleksey.edu.leetcode.middle.linkedlist;

//https://leetcode.com/problems/reverse-linked-list-ii/?envType=daily-question&envId=2023-09-07
//92. Reverse Linked List II

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedListII {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ReverseLinkedListII reverse = new ReverseLinkedListII();
        var linkedList = reverse.reverseBetween(node1, 2, 4);
        System.out.println(linkedList);
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (left == right) return head;

        int idx = 1;
        ListNode node1 = null;
        ListNode head2 = null;
        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;
        while (idx <= right && current != null) {
            if (idx == left) head2 = current;
            if (idx + 1 == left) node1 = current;

//            if (idx == right) node2 = current.next;
            next = current.next;
            if (idx > left){
                current.next = prev;
            }

            prev = current.next;
            current = next;
            idx++;
        }

        if (node1 != null){
            node1.next = head2;
        }
        if (current != null){
            head2.next = next;
        }
        return head;
    }

    private void reverseValues(List<ListNode> nodes) {
        for (int i = 0; i < nodes.size() / 2; i++) {
            int temp = nodes.get(i).val;
            nodes.get(i).val = nodes.get(nodes.size() - 1 - i).val;
            nodes.get(nodes.size() - 1 - i).val = temp;
        }
    }
}
