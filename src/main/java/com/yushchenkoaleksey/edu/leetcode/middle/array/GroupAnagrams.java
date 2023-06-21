package com.yushchenkoaleksey.edu.leetcode.middle.array;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        var groupAnagrams = new GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagrams.groupAnagrams(new String[]{""}));
        System.out.println(groupAnagrams.groupAnagrams(new String[]{"a"}));
    }

    //Best Solution 99.69%
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer, LinkedList<String>> map = new HashMap<>();
        char[] letters;
        for (String s : strs) {
            letters = new char[26];
            for (char c : s.toCharArray()) letters[c - 'a']++;
            var key = Arrays.hashCode(letters);
            map.computeIfAbsent(key, val -> new LinkedList<>());
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
