package com.yushchenkoaleksey.edu.leetcode.easy.array;

import java.util.HashMap;

public class XOfAKind {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = 0;
        for (int i : deck){
            var frequency = map.getOrDefault(i, 0);
            frequency++;
            map.put(i, frequency);
            n = frequency;
        }
        if (n <= 1) return false;
        for (var entry : map.entrySet()){
            if (n != entry.getValue()) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new XOfAKind().hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1}));
        System.out.println(new XOfAKind().hasGroupsSizeX(new int[]{1,1,1,2,2,2,3,3}));
    }

    public int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
