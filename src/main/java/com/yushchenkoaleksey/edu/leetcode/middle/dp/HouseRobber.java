package com.yushchenkoaleksey.edu.leetcode.middle.dp;

//https://leetcode.com/problems/house-robber/description/?envType=study-plan-v2&envId=top-interview-150
//198. House Robber

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        int[]dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        return dp[dp.length - 1];
    }
}
