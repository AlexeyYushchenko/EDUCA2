package com.yushchenkoaleksey.edu.leetcode.easy.array;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("a", "a"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] count = new int[26];
        var sChars = s.toCharArray();
        for (int i = 0; i < sChars.length; i++) {
            count[sChars[i] - 'a']++;
        }
        var tChars = t.toCharArray();
        for (int i = 0; i < tChars.length; i++) {
            count[tChars[i] - 'a']--;
        }
        for (int n : count) if (n != 0) return false;
        return true;
    }
}
