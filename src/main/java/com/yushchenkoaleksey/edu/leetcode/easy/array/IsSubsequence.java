package com.yushchenkoaleksey.edu.leetcode.easy.array;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        var sChars = s.toCharArray();
        var tChars = t.toCharArray();
        int sLen = s.length();
        int tLen = t.length();
        int i = 0;
        int j = 0;
        while (i < sLen && j < tLen){
            if (sChars[i] == tChars[j]){
                i++;
            }
            j++;
        }
        return i == sLen;
    }

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println(isSubsequence.isSubsequence("axc", "ahbgdc"));
//        System.out.println(isSubsequence.isSubsequence("a", "abcde"));
    }
}
