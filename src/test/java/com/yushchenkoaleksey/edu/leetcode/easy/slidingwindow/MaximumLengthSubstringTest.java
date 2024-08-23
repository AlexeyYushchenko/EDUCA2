package com.yushchenkoaleksey.edu.leetcode.easy.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumLengthSubstringTest {

    MaximumLengthSubstring m = new MaximumLengthSubstring();
    @Test
    void maximumLengthSubstring1() {
        assertEquals(4, m.maximumLengthSubstring("bcbbbcba"));
    }
    @Test
    void maximumLengthSubstring2() {
        assertEquals(2, m.maximumLengthSubstring("aaaa"));
    }
    @Test
    void maximumLengthSubstring3() {
        assertEquals(3, m.maximumLengthSubstring("bbbab"));
    }
    @Test
    void maximumLengthSubstring4() {
        assertEquals(9, m.maximumLengthSubstring("eebadadbfa"));
    }
}