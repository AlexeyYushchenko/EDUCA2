package com.yushchenkoaleksey.edu.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KWeakestRowsTest {
    KWeakestRows rows = new KWeakestRows();

    @Test
    void kWeakestRows() {
        var griglia = new int[][]{
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        assertArrayEquals(new int[]{2, 0, 3}, rows.kWeakestRows(griglia, 3));
    }
}