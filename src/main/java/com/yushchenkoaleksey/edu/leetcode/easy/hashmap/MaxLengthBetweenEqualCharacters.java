package com.yushchenkoaleksey.edu.leetcode.easy.hashmap;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/largest-substring-between-two-equal-characters
public class MaxLengthBetweenEqualCharacters {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        var chars = s.toCharArray();
        for (int i = 'a'; i <= 'z'; i++) {
            int first = chars[i - 'a'];
            int last = chars[i - 'a'];
        }

        return max;
    }
}

//        for (int current = 0; current < chars.length; current++) {
//            if (map.containsKey(chars[current])) continue;
//
//            var lastIndex = s.lastIndexOf(chars[current]);
//            if (current == lastIndex) continue;
//
//            int temp = lastIndex - current - 1;
//            int next = s.indexOf(chars[current], current + 1);
//            while (next != lastIndex){
//                temp--;
//                current = next;
//                next = s.indexOf(chars[current], current + 1);
//            }
//            max = Math.max(max, temp);
//            map.put(chars[current], max);
//        }
//        return max;