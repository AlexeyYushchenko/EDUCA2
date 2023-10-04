package com.yushchenkoaleksey.edu.leetcode.middle.slidingwindow;

//3. Longest Substring Without Repeating Characters
//https://leetcode.com/problems/longest-substring-without-repeating-characters/

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    int longest(String s){
        var chars = s.toCharArray();
        int pointer = 0;
        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = pointer; j < i; j++) {
                if(chars[j] == chars[i]){
                    pointer = j + 1;
                    res = Math.max(res, i - j);
                    break;
                }
            }
            res = Math.max(res, i - pointer + 1);
        }
        return res;
    }


    public int len(String s){
        int start = 0;
        int maxLen = 0;
        var chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            for (int j = start; j < i; j++) {
                if (chars[j] == chars[i]){
                    maxLen = Math.max(maxLen, i - j);
                    start = j + 1;
                    break;
                }
            }
            maxLen = Math.max(maxLen, i - start + 1);
        }
        return maxLen;
    }


    public int lengthOfLongestSubstring(String s) {
        char[] sChar = s.toCharArray();
        int maxLength = 0;
        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = check; j < i; j++) {
                if (sChar[i] == sChar[j]) {
                    maxLength = maxLength >= i - j ? maxLength : i - j;
                    check = j + 1;
                    break;
                }
            }
            maxLength = maxLength >= i - check + 1 ? maxLength : i - check + 1;
        }

        return maxLength;
    }

    //69%
    public int lengthOfLongestSubstring2(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        int maxLen = 1;
        Set<Character> uniqueChars = new HashSet<>();
        int i = 0;
        int j = 1;
        uniqueChars.add(s.charAt(i));
        while (j < s.length()) {
            var ch = s.charAt(j);
            if (!uniqueChars.contains(ch)) {
                uniqueChars.add(ch);
                maxLen = Math.max(maxLen, uniqueChars.size());
                j++;
            } else {
                uniqueChars.remove(s.charAt(i++));
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println(longestSubstring.longest("abcdefgfgfg"));
        System.out.println(longestSubstring.longest("abcabcbb"));
        System.out.println(longestSubstring.longest("bbbbb"));
        System.out.println(longestSubstring.longest("pwwkew"));
        System.out.println(longestSubstring.longest("au"));
    }
}

