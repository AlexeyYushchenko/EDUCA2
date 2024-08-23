package com.yushchenkoaleksey.edu.leetcode.easy.twopointers;

//https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75

public class ReverseVowels {
    public String reverseVowels(String s) {
        var chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (!isVowel(chars [i]) && i < chars.length - 1 ) i++;
        while (!isVowel(chars [j]) && j > 0) j--;
        while (i < j){
            swapVowels(i, j, chars);
            i++;
            j--;
            while (!isVowel(chars [i]) && i < chars.length - 1 ) i++;
            while (!isVowel(chars [j]) && j > 0) j--;
        }
        return new String(chars);
    }

    private boolean isVowel(char c){
        return c == 'a'
                || c == 'e'
                || c == 'i'
                || c == 'o'
                || c == 'u'
                || c == 'A'
                || c == 'E'
                || c == 'I'
                || c == 'O'
                || c == 'U';
    }

    private void swapVowels(int i, int j, char[] chars) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
