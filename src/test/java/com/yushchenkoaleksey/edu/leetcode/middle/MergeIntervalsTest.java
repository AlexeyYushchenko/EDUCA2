package com.yushchenkoaleksey.edu.leetcode.middle;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {
    MergeIntervals mergeIntervals = new MergeIntervals();

    @Test
    void merge1() {
        var merge = mergeIntervals.merge(new int[][]{{1, 4}, {6, 7}, {9, 11}});
        assertArrayEquals(new int[][]{{1, 4}, {6, 7}, {9, 11}}, merge);
    }

    @Test
    void merge2() {
        var merge = mergeIntervals.merge(new int[][]{{1, 4}, {5, 7}, {9, 11}});
        assertArrayEquals(new int[][]{{1, 4}, {5,7}, {9, 11}}, merge);
    }

    @Test
    void merge3() {
        var merge = mergeIntervals.merge(new int[][]{{5, 7}, {9, 11}, {0, 15}});
        assertArrayEquals(new int[][]{{0, 15}}, merge);
    }
    @Test
    void merge4() {
        var merge = mergeIntervals.merge(new int[][]{{1, 4}, {0, 4}});
        assertArrayEquals(new int[][]{{0, 4}}, merge);
    }
}