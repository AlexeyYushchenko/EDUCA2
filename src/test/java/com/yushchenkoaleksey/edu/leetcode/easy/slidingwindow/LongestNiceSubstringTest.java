package com.yushchenkoaleksey.edu.leetcode.easy.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestNiceSubstringTest {
    LongestNiceSubstring longestNiceSubstring = new LongestNiceSubstring();

    @Test
    void longestNiceSubstring1() {
        assertEquals("aAa", longestNiceSubstring.longestNiceSubstring("YazaAay"));
    }
    @Test
    void longestNiceSubstring() {
        assertEquals("YaByabABay", longestNiceSubstring.longestNiceSubstring("YaByabABay"));
    }
    @Test
    void longestNiceSubstring2() {
        assertEquals("Bb", longestNiceSubstring.longestNiceSubstring("Bb"));
    }
    @Test
    void longestNiceSubstring3() {
        assertEquals("", longestNiceSubstring.longestNiceSubstring("c"));
    }
}