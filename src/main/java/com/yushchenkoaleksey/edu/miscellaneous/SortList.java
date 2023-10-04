package com.yushchenkoaleksey.edu.miscellaneous;

//https://leetcode.com/problems/sort-list/

import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Arrays;


public class SortList {

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

//    public static ListNode sortList(ListNode head) {
//        if (head == null || head.next == null) return head;
//
//        ListNode mid = getMid(head);
//        var left = sortList(head);
//        var right = sortList(mid);
//
//        return merge(left, right);
//    }
//
//    private static ListNode merge(ListNode list1, ListNode list2) {
//        ListNode dummyHead = new ListNode();
//        ListNode tail = dummyHead;
//        while (list1 != null && list2 != null){
//            if (list1.val < list2.val){
//                tail.next = new ListNode(list1.val);
//                list1 = list1.next;
//            }else {
//                tail.next = new ListNode(list2.val);
//                list2 = list2.next;
//            }
//            tail = tail.next;
//        }
//        tail.next = list1 != null? list1 : list2;
//
//        return dummyHead.next;
//    }
//
//    private static ListNode getMid(ListNode head) {
//        ListNode midPrev = null;
//        while (head != null && head.next != null){
//            midPrev = midPrev == null? head : midPrev.next;
//            head = head.next.next;
//        }
//        ListNode mid = midPrev.next;
//        midPrev.next = null;
//        return mid;
//    }

//    static ListNode sortList(ListNode p, ListNode q) {
//        if (p == null || p == q) {
//            return p;
//        }
//        boolean sorted = true;
//        ListNode curr = p;
//        while (curr.next != null && curr != q) {
//            if (curr.val > curr.next.val) {
//                sorted = false;
//                break;
//            }
//            curr = curr.next;
//        }
//        if (sorted) {
//            return p;
//        }
//        ListNode pre = p;
//        ListNode head = p;
//        curr = pre.next;
//        while (curr != null && curr != q) {
//            ListNode next = curr.next;
//            if (curr.val < p.val) {
//                pre.next = next;
//                curr.next = head;
//                head = curr;
//            } else {
//                pre = curr;
//            }
//            curr = next;
//        }
//        p.next = sortList(p.next, q);
//        return sortList(head, p);
//    }

    public static ListNode sortList(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;
        }

        int[] arr = new int[count];
        curr = head;
        int k = 0;
        while (curr != null) {
            arr[k++] = curr.val;
            curr = curr.next;
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        curr = head;
        k = 0;
        while (curr != null){
            curr.val = arr[k++];
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4, new ListNode(2, new ListNode(1, new ListNode(3))));
        System.out.println(sortList(head));
    }
}
