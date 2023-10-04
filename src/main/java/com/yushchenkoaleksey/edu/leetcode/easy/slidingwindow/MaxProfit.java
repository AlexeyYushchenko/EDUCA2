package com.yushchenkoaleksey.edu.leetcode.easy.slidingwindow;

//121. Best Time to Buy and Sell Stock
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class MaxProfit {

    public int maxProfit2(int[] prices) {
        int maxProfit = 0;
        int j = 1;
        while (j < prices.length) {
            int i = 0;
            int k = j;
            while (k < prices.length) {
                maxProfit = Math.max(maxProfit, prices[k] - prices[i]);
                i++;
                k++;
            }
            j++;
        }
        return maxProfit;
    }

    public int maxProfit3(int[] prices) {
        int i = 0;
        int j = 0;
        int maxProfit = 0;
        while (j < prices.length){
            if (prices[j] < prices[i]){
                i = j;
                j = i + 1;
                continue;
            }
            maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            j++;
        }
        return maxProfit;
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestPrice = prices[0];
        for (int price : prices) {
            maxProfit = Math.max(maxProfit, price - lowestPrice);
            if (price < lowestPrice) lowestPrice = price;
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        MaxProfit profit = new MaxProfit();
        System.out.println(profit.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(profit.maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(profit.maxProfit(new int[]{7,6,4,3,4}));
    }

}