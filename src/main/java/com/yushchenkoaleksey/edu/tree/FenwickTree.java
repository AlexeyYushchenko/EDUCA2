package com.yushchenkoaleksey.edu.tree;

class BIT {
    int size;
    int[] tree;

    public BIT(int size) {
        this.size = size;
        this.tree = new int[size + 1];
    }

    void update(int index, int value){
        while (index <= size){
            tree[index] += value;
            index += (index & -index);
        }
    }

    int query(int index){
        int sum = 0;
        while (index > 0){
            sum += tree[index];
            index -= (index & -index);
        }
        return sum;
    }

    int queryRange(int left, int right){
        return query(right) - query(left - 1);
    }
}

public class FenwickTree {
}
