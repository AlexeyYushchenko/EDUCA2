package com.yushchenkoaleksey.edu.leetcode.middle.linkedlist;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/copy-list-with-random-pointer/?envType=daily-question&envId=2023-09-05
//138. Copy List With Random Pointer

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Map<Node, Node> map = new HashMap<>();
        Node dummy = new Node(-1);
        Node currentCopy = dummy;
        Node currentOriginal = head;
        while (currentOriginal != null) {

            if (map.containsKey(currentOriginal)) {
                currentCopy.next = map.get(currentOriginal);
            } else {
                currentCopy.next = new Node(currentOriginal.val);
                map.put(currentOriginal, currentCopy.next);
            }

            if (currentOriginal.random == null) {
                currentCopy.next.random = null;
            } else if (map.containsKey(currentOriginal.random)) {
                currentCopy.next.random = map.get(currentOriginal.random);
            } else {
                currentCopy.next.random = new Node(currentOriginal.random.val);
                map.put(currentOriginal.random, currentCopy.next.random);
            }

            currentOriginal = currentOriginal.next;
            currentCopy = currentCopy.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
//        Node node1 = new Node(1);
//        Node node2 = new Node(2);
//        Node node3 = new Node(3);
//        node1.random = node3;
//        node3.random = node2;
//        node2.random = null;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = null;
        CopyListWithRandomPointer copy = new CopyListWithRandomPointer();
//        var copyNode = copy.copyRandomList(node1);
//        System.out.println(copyNode);

        var node1 = new Node(-1);
        node1.random = node1;
        node1.next = null;
        Node copyNode = copy.copyRandomList(node1);
        System.out.println(copyNode);
    }
}
