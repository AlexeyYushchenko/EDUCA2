package com.yushchenkoaleksey.edu.leetcode.middle.array;

//122. Best Time to Buy and Sell Stock II
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii

public class BestTimeToSellStockII {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
                sum = Math.max(sum + prices[i], sum + prices[i - 1]);
        }
        return sum;
    }
}
