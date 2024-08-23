package com.yushchenkoaleksey.edu.leetcode.easy.slidingwindow;

//https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/

public class CountGoodSubstrings {
    public int countGoodSubstrings(String s) {
        int res = 0;
        var chars = s.toCharArray();
        int i = 0;
        while (i <= chars.length - 3){
            char uno = chars[i];
            char duo = chars[i + 1];
            char tre = chars[i + 2];
            if (uno != duo && duo != tre && uno != tre) res++;
            i++;
        }
        return res;
    }
}
