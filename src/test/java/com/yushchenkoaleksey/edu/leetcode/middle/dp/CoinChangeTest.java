package com.yushchenkoaleksey.edu.leetcode.middle.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {
    CoinChange coinChange = new CoinChange();

    @Test
    void coinChange1() {
        assertEquals(2, coinChange.coinChange(new int[]{3, 4, 7, 12}, 11));
    }

    @Test
    void coinChange2() {
        assertEquals(-1, coinChange.coinChange(new int[]{2}, 3));
    }

    @Test
    void coinChange3() {
        assertEquals(0, coinChange.coinChange(new int[]{1}, 0));
    }

    @Test
    void coinChange4() {
        assertEquals(20, coinChange.coinChange(new int[]{186, 419, 83, 408}, 6249));
    }

    @Test
    void coinChange5() {
        assertEquals(3, coinChange.coinChange(new int[]{1, 74, 100}, 149));
    }
}