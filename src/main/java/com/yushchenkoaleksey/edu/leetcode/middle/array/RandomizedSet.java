package com.yushchenkoaleksey.edu.leetcode.middle.array;

import java.util.*;

//380. Insert Delete GetRandom O(1)
//https://leetcode.com/problems/insert-delete-getrandom-o1/?envType=study-plan-v2&envId=top-interview-150
class RandomizedSet {
    private final Map<Integer, Integer> map;
    private final List<Integer> list;
    private final Random random;

    public RandomizedSet() {
        this.map = new HashMap<>(20000);
        this.list = new ArrayList<>(20000);
        this.random = new Random();
    }

    public boolean insert(int val) {
        if (map.get(val) != null) return false;
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;

        var index = map.get(val);
        map.put(list.get(index), index);
        map.remove(val);
        list.set(index, list.get(list.size() - 1));
        list.remove(list.size() - 1);
        return true;

//        map.put(list.get(list.size()-1), index) ;
//        map.remove(val) ;
//        list.set(index, list.get(list.size()-1)) ;
//        list.remove(list.size()-1) ;
//        return true ;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */