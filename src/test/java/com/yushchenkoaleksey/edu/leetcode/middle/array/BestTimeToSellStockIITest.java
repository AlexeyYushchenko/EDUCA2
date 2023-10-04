package com.yushchenkoaleksey.edu.leetcode.middle.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToSellStockIITest {

    BestTimeToSellStockII best = new BestTimeToSellStockII();

    @Test
    void maxProfit1() {
        assertEquals(7, best.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void maxProfit2() {
        assertEquals(4, best.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void maxProfit3() {
        assertEquals(0, best.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}