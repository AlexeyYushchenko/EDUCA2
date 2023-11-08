package com.yushchenkoaleksey.edu.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FinalPricesWithSpecialDiscountInShopTest {

    FinalPricesWithSpecialDiscountInShop discountInShop = new FinalPricesWithSpecialDiscountInShop();

    @Test
    void finalPrices() {
        var actual = new int[]{1, 2, 3, 4, 5};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, discountInShop.finalPrices(actual));
    }

    @Test
    void finalPrices2() {
        var actual = new int[]{8,4,6,2,3};
        assertArrayEquals(new int[]{4,2,4,2,3}, discountInShop.finalPrices(actual));
    }

    @Test
    void finalPrices3() {
        var actual = new int[]{10,1,1,6};
        assertArrayEquals(new int[]{9,0,1,6}, discountInShop.finalPrices(actual));
    }
}