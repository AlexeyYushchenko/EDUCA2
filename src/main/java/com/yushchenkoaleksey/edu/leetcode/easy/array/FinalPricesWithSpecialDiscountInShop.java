package com.yushchenkoaleksey.edu.leetcode.easy.array;//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/
//1475. Final Prices With a Special Discount in a Shop

public class FinalPricesWithSpecialDiscountInShop {
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            prices[i] = getPrice(i, prices);
        }
        return prices;
    }

    private int getPrice(int i, int[] prices) {
        for (int j = i + 1; j < prices.length; j++) {
            if (prices[j] <= prices[i]) {
                return prices[i] - prices[j];
            }
        }
        return prices[i];
    }
}