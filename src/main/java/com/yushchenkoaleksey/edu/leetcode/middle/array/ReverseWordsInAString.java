package com.yushchenkoaleksey.edu.leetcode.middle.array;

//https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=top-interview-150
//151. Reverse Words In A String
public class ReverseWordsInAString {


    //100%
    public String reverseWords(String s){
        var chars = s.toCharArray();
        var res = new char[chars.length];
        int i = chars.length - 1;
        int idx = 0;
        int wordLen = 0;
        while (i >= 0 && chars[i] == ' ') i--;
        while (i >= 0) {
            wordLen = i;
            while (i >= 0 && chars[i] != ' ') i--;
            if (idx > 0) res[idx++] = ' ';
            for (int k = i + 1; k <= wordLen; k++) res[idx++] = chars[k];

            while (i >= 0 && chars[i] == ' ') i--;
        }
        return new String(res, 0, idx);
    }

    //60%
    public String reverseWords2(String s) {
        var split = s.trim().split("\\s+");
        if (split.length < 2) return s;
        StringBuilder sb = new StringBuilder(split[split.length - 1]);
        for (int i = split.length - 2; i >= 0; i--) {
            sb.append(" ").append(split[i]);
        }
        return sb.toString();
    }
}
