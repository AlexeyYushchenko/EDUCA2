package com.yushchenkoaleksey.edu.miscellaneous;

public class LongestCommonPrefixEasy {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"abcdef", "ab", "abcde", "abcd"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs[0].isEmpty()) return "";
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(res) != 0) {
                res = res.substring(0, res.length() - 1);
            }
        }
        return res;
    }
}
