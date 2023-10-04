package com.yushchenkoaleksey.edu.leetcode.middle.dp;

import java.util.*;

//https://leetcode.com/problems/word-break/?envType=study-plan-v2&envId=top-interview-150
//139. Word Break
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()];
        return functionName(s, 0, wordDict, dp);
    }

    private boolean functionName(String s, int pointer, List<String> wordDict, int[] dp){
        if (pointer >= s.length()) return true;
        if (dp[pointer] != 0) return false;
        for (String word : wordDict){
            if (s.startsWith(word, pointer) && functionName(s, pointer + word.length(), wordDict, dp)){
                return true;
            }
        }
        dp[pointer] = 1;
        return false;
    }
}