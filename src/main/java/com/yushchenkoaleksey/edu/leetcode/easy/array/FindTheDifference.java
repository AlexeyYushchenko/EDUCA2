package com.yushchenkoaleksey.edu.leetcode.easy.array;

import java.util.Arrays;

//https://leetcode.com/problems/find-the-difference/?envType=daily-question&envId=2023-09-21
//389. Find The Difference
public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int res = 0;
        var chars = t.toCharArray();
        for (char c : chars) {
            res ^= c;
        }
        chars = s.toCharArray();
        for (char c : chars) {
            res ^= c;
        }
        return (char) res;
    }
}
