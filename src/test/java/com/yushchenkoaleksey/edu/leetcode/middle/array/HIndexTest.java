package com.yushchenkoaleksey.edu.leetcode.middle.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HIndexTest {

    HIndex hIndex = new HIndex();

    @Test
    void hIndex7() {
        assertEquals(2, hIndex.hIndex(new int[]{11, 15}));
    }
    @Test
    void hIndex6() {
        assertEquals(1, hIndex.hIndex(new int[]{100}));
    }

    @Test
    void hIndex5() {
        assertEquals(1, hIndex.hIndex(new int[]{0, 1}));
    }

    @Test
    void hIndex4() {
        assertEquals(0, hIndex.hIndex(new int[]{0, 0}));
    }

    @Test
    void hIndex() {
        assertEquals(3, hIndex.hIndex(new int[]{3, 0, 6, 1, 5}));
    }

    @Test
    void hIndex2() {
        assertEquals(1, hIndex.hIndex(new int[]{1, 3, 1}));
    }

    @Test
    void hIndex3() {
        assertEquals(3, hIndex.hIndex(new int[]{6, 5, 4, 3, 2, 1}));
    }
}