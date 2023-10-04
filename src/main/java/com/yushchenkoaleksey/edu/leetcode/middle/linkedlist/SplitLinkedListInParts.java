package com.yushchenkoaleksey.edu.leetcode.middle.linkedlist;

//https://leetcode.com/problems/split-linked-list-in-parts/?envType=daily-question&envId=2023-09-06
//725. Split Linked List In Parts


import java.util.ArrayList;
import java.util.List;

public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count ++;
            current = current.next;
        }

        var res = new ListNode[k];
        current = head;
        int d = k;
        int len = count;
        for (int i = 0; i < k; i++) {
            if (current == null) break;
            res[i] = current;
            int additional = len % d > 0 ? 1 : 0;
            int nodeNum = len / d + additional;
            for (int j = 0; j < nodeNum; j++) {
                if (j + 1 == nodeNum) {
                    ListNode prev = current;
                    current = current.next;
                    prev.next = null;
                }else {
                    current = current.next;
                }
            }
            len -= nodeNum;
            d--;
        }
        return res;
    }
}
