package com.yushchenkoaleksey.edu.leetcode.middle.stack;

import java.util.LinkedHashSet;
import java.util.Set;

//https://leetcode.com/problems/remove-duplicate-letters/?envType=daily-question&envId=2023-09-26
//316. Remove Duplicate Letters
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] letters = new int[26];
        var chars = s.toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for (var c : chars) if(set.add(c)) sb.append(c);
        return sb.toString();
    }
}
