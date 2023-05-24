package com.yushchenkoaleksey.edu.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacterInAString {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {
        int temp = Integer.MAX_VALUE;
        for (int ch = 'a'; ch <= 'z'; ch++) {
            var first = s.indexOf(ch);
            var last = s.lastIndexOf(ch);
            if (first != -1 && first == last){
                temp = Math.min(temp,first);
            }
        }
        return temp == Integer.MAX_VALUE ? -1 : temp;
    }
}
