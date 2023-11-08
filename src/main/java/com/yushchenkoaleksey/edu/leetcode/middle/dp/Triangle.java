package com.yushchenkoaleksey.edu.leetcode.middle.dp;

//https://leetcode.com/problems/triangle/?envType=study-plan-v2&envId=top-interview-150
//120. Triangle

import java.util.Arrays;
import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() < 2) return triangle.get(0).get(0);

        int min = Integer.MAX_VALUE;
        var size = triangle.size();
        int[][] dp = new int[size][triangle.get(size - 1).size()];
        for (int[] arr : dp) Arrays.fill(arr, Integer.MAX_VALUE);
        dp[0][0] = triangle.get(0).get(0);

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + triangle.get(i + 1).get(j));
                dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i][j] + triangle.get(i + 1).get(j + 1));
                if (i + 1 == size - 1){
                    min = Math.min(min, dp[i + 1][j]);
                    min = Math.min(min, dp[i + 1][j + 1]);
                }
            }
        }

        for (int[]arr : dp) System.out.println(Arrays.toString(arr));

//        for (int n : dp[size - 1]) min = Math.min(min, n);
        return min;
    }
}
