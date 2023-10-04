//package com.yushchenkoaleksey.edu.leetcode.middle.linkedlist;
//
//
//class Node{
//    int val;
//    Node previous;
//    boolean visited;
//
//    public Node(int val){
//        this.val = val;
//    }
//
//    public void setPrevious(Node previous) {
//        this.previous = previous;
//    }
//
//    @Override
//    public String toString() {
//        return "" + val;
//    }
//}
//public class LinkedListCycle {
//    public static void main(String[] args) {
//        Node one = new Node(1);
//        Node four = new Node(4);
//        Node two = new Node(2);
//        Node three = new Node(3);
//        Node five = new Node(5);
//        Node six = new Node(6);
//        one.setPrevious(four);
//        four.setPrevious(two);
//        two.setPrevious(three);
//        three.setPrevious(five);
//        five.setPrevious(six);
//        six.setPrevious(two);
//
//        System.out.println(findCycle(one));
//
//        one = new Node(1);
//        four = new Node(4);
//        two = new Node(2);
//        one.setPrevious(four);
//        four.setPrevious(two);
//        System.out.println(findCycle(one));
//
//        one = new Node(1);
//        four = new Node(4);
//        two = new Node(2);
//        one.setPrevious(four);
//        four.setPrevious(two);
//        two.setPrevious(one);
//        System.out.println(findCycle(one));
//    }
//
//    private static int findCycle(Node tail) {
//        Node temp = tail;
//        while (temp.previous != null){
//            temp.visited = true;
//            if (temp.previous.visited) return temp.previous.val;
//            temp = temp.previous;
//        }
//        return -1;
//    }
//}
