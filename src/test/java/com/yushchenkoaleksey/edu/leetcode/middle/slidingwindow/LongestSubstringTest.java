package com.yushchenkoaleksey.edu.leetcode.middle.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    @Test
    void longest() {
        LongestSubstring longestSubstring = new LongestSubstring();
        assertEquals(7, longestSubstring.longest("abcdefgfgfg"));
        assertEquals(3, longestSubstring.longest("abcabcbb"));
        assertEquals(1, longestSubstring.longest("bbbbb"));
        assertEquals(3, longestSubstring.longest("pwwkew"));
        assertEquals(2, longestSubstring.longest("au"));
    }
}