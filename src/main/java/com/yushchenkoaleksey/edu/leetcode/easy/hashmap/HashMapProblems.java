package com.yushchenkoaleksey.edu.leetcode.easy.hashmap;

import java.util.HashMap;

public class HashMapProblems {
    public static void main(String[] args) {
        HashMapProblems strings = new HashMapProblems();
//        System.out.println(strings.isIsomorphic("egg", "add"));
//        System.out.println(strings.isIsomorphic("badc", "baba"));
//        System.out.println(strings.isIsomorphic("foo", "bar"));
//        System.out.println(strings.isIsomorphic("13", "42"));

//        System.out.println(strings.wordPattern("abba", "cat dog dog cat"));
//        System.out.println(strings.wordPattern("abba", "dog cat cat fish"));

        System.out.println(strings.isHappy(19));
        System.out.println(strings.isHappy(2));
        System.out.println(strings.isHappy(20));
        System.out.println(strings.isHappy(3));
    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        var sChars = s.toCharArray();
        var tChars = t.toCharArray();
        char[] sMap = new char[128];
        char[] tMap = new char[128];
        for (int i = 0; i < tChars.length; i++) {
            if (sMap[sChars[i]] == 0 && tMap[tChars[i]] == 0){
                sMap[sChars[i]] = tChars[i];
                tMap[tChars[i]] = sChars[i];
            }
            if (sMap[sChars[i]] == 0 && tMap[tChars[i]] != 0) return false;
            if (sMap[sChars[i]] != 0 && tMap[tChars[i]] != sChars[i]) return false;
        }
        return true;
    }

    //100%
    public boolean wordPattern(String pattern, String s) {
        var split = s.split(" ");
        if (pattern.length() != split.length) return false;
        var sChars = pattern.toCharArray();
        String[] words = new String[128];
        HashMap<String, Character> map = new HashMap<>();
        for (int i = 0; i < sChars.length; i++) {
            if (words[sChars[i]] == null && map.get(split[i]) == null){
                words[sChars[i]] = split[i];
                map.put(split[i], sChars[i]);
            }
            if (words[sChars[i]] == null && map.get(split[i]) != null) return false;
            if (words[sChars[i]] != null && (map.get(split[i]) == null || map.get(split[i]) != sChars[i])) return false;
        }
        return true;
    }


    public boolean isHappy(int n) {
        if (n == 1) return true;
        int slow = n;
        int fast = n;
        do {
            slow = getSquareSum(slow);
            fast = getSquareSum(getSquareSum(fast));
        }while (slow != fast);

        return slow == 1;
    }

    private int getSquareSum(int num) {
        int res = 0;
        while (num > 0){
            int lastDigit = num % 10;
            res += lastDigit * lastDigit;
            num /= 10;
        }
        return res;
    }
}























