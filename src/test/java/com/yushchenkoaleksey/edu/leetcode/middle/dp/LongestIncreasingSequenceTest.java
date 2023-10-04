package com.yushchenkoaleksey.edu.leetcode.middle.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSequenceTest {

    LongestIncreasingSequence longest = new LongestIncreasingSequence();

    @Test
    void lengthOfLIS1() {
        assertEquals(4, longest.findLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(4, longest.findLIS2(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    @Test
    void lengthOfLIS2() {
        assertEquals(3, longest.findLIS(new int[]{1, 2, 3, 1, 2, 3}));
        assertEquals(3, longest.findLIS2(new int[]{1, 2, 3, 1, 2, 3}));
    }

    @Test
    void lengthOfLIS3() {
        assertEquals(4, longest.findLIS(new int[]{0, 1, 0, 3, 2, 3}));
        assertEquals(4, longest.findLIS2(new int[]{0, 1, 0, 3, 2, 3}));
    }

    @Test
    void lengthOfLIS4() {
        assertEquals(1, longest.findLIS(new int[]{7, 7, 7, 7, 7, 7}));
        assertEquals(1, longest.findLIS2(new int[]{7, 7, 7, 7, 7, 7}));
    }
    @Test
    void lengthOfLIS5() {
        assertEquals(3, longest.findLIS(new int[]{1, 2, 2, 4}));
        assertEquals(3, longest.findLIS2(new int[]{1, 2, 2, 4}));
    }
}