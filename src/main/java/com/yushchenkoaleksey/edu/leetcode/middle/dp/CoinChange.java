package com.yushchenkoaleksey.edu.leetcode.middle.dp;

import java.util.Arrays;

//https://leetcode.com/problems/coin-change/?envType=study-plan-v2&envId=top-interview-150
//322. Coin Change
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        var dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(var coin : coins)
            for (int i = coin; i < dp.length; i++) dp[i] = Math.min(dp[i], dp[i - coin] + 1);

        return dp[amount] == amount + 1? -1 : dp[amount];
    }
}












