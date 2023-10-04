package com.yushchenkoaleksey.edu.miscellaneous;

import lombok.NoArgsConstructor;
import lombok.ToString;

public class ReverseLinkedList {

    @NoArgsConstructor
    @ToString
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
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode next = head.next;
        ListNode reversed = head;
        reversed.next = null;
        while (next != null){
            reversed = new ListNode(next.val, reversed);
            next = next.next;
        }
        return reversed;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        System.out.println(reverseList(head));
    }
}
