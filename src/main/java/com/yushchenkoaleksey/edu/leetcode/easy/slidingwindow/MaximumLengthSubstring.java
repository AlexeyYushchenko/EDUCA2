package com.yushchenkoaleksey.edu.leetcode.easy.slidingwindow;

//3090. Maximum Length Substring With Two Occurrences
// Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character.
public class MaximumLengthSubstring {
    public int maximumLengthSubstring(String s) {
        int maxLen = 0;
        int currentLen = 0;
        int[] alphabet = new int[26];
        int start = 0;
            for (int j = 0; j < s.length(); j++) {
                while (alphabet[s.charAt(j) - 'a'] >= 2){
                    alphabet[s.charAt(start) - 'a']--;
                    start++;
                    currentLen--;
                }
                alphabet[s.charAt(j) - 'a']++;
                currentLen++;
                maxLen = Math.max(maxLen, currentLen);
            }
        return maxLen;
    }
}