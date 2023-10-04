package com.yushchenkoaleksey.edu.leetcode.middle.dp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {

    WordBreak wordBreak = new WordBreak();
    @Test
    void wordBreak1() {
        var wordDict = new ArrayList<String>(Arrays.asList("i", "am"));
        var res = wordBreak.wordBreak("iam", wordDict);
        assertTrue(res);
    }
    @Test
    void wordBreak2() {
        var wordDict = new ArrayList<String>(Arrays.asList("apple", "pen"));
        var res = wordBreak.wordBreak("applepenapple", wordDict);
        assertTrue(res);
    }
    @Test
    void wordBreak3() {
        var wordDict = new ArrayList<String>(Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
        var res = wordBreak.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab", wordDict);
        assertFalse(res);
    }
    @Test
    void wordBreak4() {
        var wordDict = new ArrayList<String>(Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"));
        var res = wordBreak.wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", wordDict);
        assertTrue(res);
    }
}