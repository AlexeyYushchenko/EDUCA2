package com.yushchenkoaleksey.edu.leetcode.middle.dp;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0) return 0;
        if (cost.length == 2) return Math.min(cost[0], cost[1]);

        int n = cost.length;
        var dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];

        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(cost[i] + dp[i - 2], cost[i] + dp[i - 1]);
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}
