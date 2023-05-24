package com.yushchenkoaleksey.edu.leetcode.easy;

import java.math.BigInteger;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        char c = '0', c1 = '1';
        while (i < j) {
            while (i < j && !(Character.isDigit(c = s.charAt(i))) || Character.isAlphabetic(c = s.charAt(i))) {
                i++;
            }
            while (i < j && !(Character.isDigit(c1 = s.charAt(j)) || Character.isAlphabetic(c1 = s.charAt(j)))) {
                j--;
            }
            if (i == j) return true;
            if (c != c1) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(isPalindrome("race a car"));
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome("ab_a"));

//        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
//        System.out.println(addBinary(a, "1010101"));

        System.out.println(addBinary("111", "111"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int memory = 0;
        while (i >= 0 || j >= 0){
            int sum = memory;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            memory = sum / 2;
        }
        if (memory != 0) sb.append(memory);
        return sb.reverse().toString();
    }

}
