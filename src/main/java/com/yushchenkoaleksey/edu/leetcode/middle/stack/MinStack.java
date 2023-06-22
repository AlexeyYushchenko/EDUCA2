package com.yushchenkoaleksey.edu.leetcode.middle.stack;

class Node {
    int val;
    int min;
    Node previous;

    public Node(){}
}

public class MinStack {

    Node tail;
    int size;
    public MinStack() {
        this.tail = new Node();
        this.size = 0;
    }

    public void push(int val) {
        var node = new Node();
        node.val = val;
        if (tail.previous == null){
            tail.previous = node;
            node.min = val;
        }else {
            node.previous = tail.previous;
            node.min = Math.min(val, node.previous.min);
            tail.previous = node;
        }
        size++;
    }

    public void pop() {
        if (size> 0){
            tail = tail.previous;
            size--;
        }
    }

    public int top() {
        return tail.previous.val;
    }

    public int getMin() {
        return tail.previous.min;
    }
}
