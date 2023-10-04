package com.yushchenkoaleksey.edu.leetcode.middle.dp;

import java.util.Arrays;

//https://leetcode.com/problems/longest-increasing-subsequence/?envType=study-plan-v2&envId=top-interview-150
//300. Longest Increasing Subsequence
public class LongestIncreasingSequence {

    //l'approccio con una complessita' temporale di O(n log n)
    public static int findLIS(int[] arr) {
        int n = arr.length;
        int[] tail = new int[n];
        int len = 1;
        tail[0] = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < tail[0]) {
                tail[0] = arr[i];
            } else if (arr[i] > tail[len - 1]) {
                tail[len++] = arr[i];
            } else {
                int l = -1;
                int r = len - 1;
                while (r - l > 1) { //perche deve essere piu di 1?
                    var m = l + (r - l) / 2;
                    if (tail[m] >= arr[i]) {
                        r = m;
                    } else {
                        l = m;
                    }
                }
                tail[r] = arr[i];
            }
        }
        return len;
    }

    //l'approccio di programmazione dinamico con una complessita' temporale di O(n^2)
    public int findLIS2(int[] nums) {
        var dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
