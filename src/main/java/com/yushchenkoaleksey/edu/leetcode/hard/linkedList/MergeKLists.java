package com.yushchenkoaleksey.edu.leetcode.hard.linkedList;

import java.util.*;

public class MergeKLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return String.format("%s %s", val, next);
        }
    }

    public static void main(String[] args) {
        ListNode one = null;
        ListNode two = new ListNode(-5, new ListNode(3, new ListNode(7)));
        ListNode thr = null;
        ListNode fou = new ListNode(-4, new ListNode(-2, new ListNode(-3, new ListNode(-1))));
        System.out.println("Result:");
        System.out.println(mergeKLists(new ListNode[]{one, two, thr, fou}));
        System.out.println(mergeKLists(null));
    }

    private static ListNode mergeKLists(ListNode[] listNodes) {
        if (listNodes == null || listNodes.length == 0) return null;
        return mergeKLists(listNodes, 0, listNodes.length - 1);
    }

    private static ListNode mergeKLists(ListNode[] listNodes, int start, int end) {
         if (end == start) return listNodes[end];
         if (start + 1 == end) return merge(listNodes[start], listNodes[end]);

        int mid = (start + end) / 2;
        ListNode list1 = mergeKLists(listNodes, start, mid);
        ListNode list2 = mergeKLists(listNodes, mid + 1, end);
        return merge(list1,  list2);
    }

    private static ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode curr = dummyHead;
        while (list1 != null && list2 != null){
            if (list1.val < list2.val){
                curr.next = list1;
                list1 = list1.next;
            }else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = list1 != null? list1 : list2;
        return dummyHead.next;
    }

    public static ListNode mergeKLists2(ListNode[] lists) {
        if (lists == null) return null;
        List<Integer> list = new ArrayList<>(10000);
        ListNode dummyHead = new ListNode();
        ListNode curr = dummyHead;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null){
                curr.next = lists[i];
                while (curr.next != null) {
                    list.add(curr.next.val);
                    curr = curr.next;
                }
            }
        }
        Collections.sort(list);
        curr = dummyHead.next;
        int i = 0;
        while (curr != null){
            curr.val = list.get(i++);
            curr = curr.next;
        }
        return dummyHead.next;
    }
}
