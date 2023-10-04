package com.yushchenkoaleksey.edu.leetcode.easy.hashmap;

public class RansomNote {

    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();
        System.out.println(ransomNote.canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
        System.out.println(ransomNote.canConstruct("aa", "aab"));
    }


    public boolean canConstruct(String ransomNote, String magazine) {
        var ransomChars = ransomNote.toCharArray();
        int[] alphabet = new int[26];
        for (char ch : ransomChars) {
            int index = magazine.indexOf(ch, alphabet[ch - 'a']);
            if (index != -1){
                alphabet[ch - 'a'] = index + 1;
            }else {
                return false;
            }
        }
        return true;
    }

    //fast, but not enough (97%)
    public boolean canConstruct2(String ransomNote, String magazine) {
        var mChars = magazine.toCharArray();
        var rChars = ransomNote.toCharArray();
        char[] alphabet = new char[26];
        int counter = 0;
        for (Character ch : rChars) {
            alphabet[ch - 'a']++;
            counter++;
        }
        for (Character ch : mChars) {
            if (alphabet[ch - 'a'] > 0){
                alphabet[ch - 'a']--;
                counter--;
                if (counter == 0) return true;
            }
        }
        return false;
    }
}
