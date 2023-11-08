package com.yushchenkoaleksey.edu.leetcode.middle.dp;

import java.util.*;

//https://leetcode.com/problems/combination-sum-iv/?envType=daily-question&envId=2023-09-09
//377. Combination Sum IV

class Holder {
    private int val;

    public Holder() {
        this.val = 0;
    }

    public int getVal() {
        return val;
    }

    public void increment() {
        val++;
    }
}

public class CombinationsSumIV {

//    public static void main(String[] args) {
//        CombinationsSumIV combinationsSumIV = new CombinationsSumIV();
//        System.out.println(combinationsSumIV.combinationSum4(new int[]{1, 2, 3}, 35));
//        System.out.println(combinationsSumIV.combinationSum4(new int[]{9}, 3));
//    }

//    public static void main(String[] args) {
//        int target = 4;
//        int[] nums = {1, 2, 3};
//
//        int[] dp = new int[target + 1];
//        Arrays.fill(dp, -1);
//        var combinations = findCombinations(nums, target, dp);
//
//        System.out.println("Total number of combinations: " + combinations);
//    }

    private static int findCombinations(int[] nums, int target, int[] dp) {
        if (target == 0) return 1;
        if (target < 0) return 0;
        if (dp[target] != -1) return dp[target];
        int count = 0;
        for (int n : nums) count += findCombinations(nums, target - n, dp);
        dp[target] = count;
        return count;
    }


//    public int combinationSum4(int[] nums, int target) {
//        if (nums == null || nums.length < 1) return 0;
//        Arrays.sort(nums);
//        Holder holder = new Holder();
//        int sum = 0;
//        combinationSum4(nums, 0, target, sum, holder);
//        return holder.getVal();
//    }
//
//    public void combinationSum4(int[] nums, int i, int target, int sum, Holder holder) {
//        if (i < 0 || i == nums.length) return;
//        if (sum > target || nums[i] > target || sum + nums[i] > target) return;
//        if (sum + nums[i] == target){
//            holder.increment();
//            return;
//        }
//        for (int j = 0; j < nums.length; j++) {
//            combinationSum4(nums, j, target, sum + nums[i], holder);
//        }
//    }


    public static void main(String[] args) {
        System.out.println(getWays(166, Arrays.asList(5l, 37l, 8l, 39l, 33l, 17l, 22l, 32l, 13l, 7l, 10l, 35l, 40l, 2l, 43l, 49l, 46l, 19l, 41l, 1l, 12l, 11l, 28l)));
    }

    static long combinations = 0;
    public static long getWays(long n, List<Long> c) {
        Collections.sort(c);
        findCombinations((long) n, c, 0, 0);
        return combinations;
    }

    private static void findCombinations(long target, List<Long> c, int k, long tempRes) {
        if (tempRes > target) return;
        if (tempRes == target) {
            combinations++;
        } else {
            for (int i = k; i < c.size(); i++) {
                if (tempRes + c.get(i) > target) break;
                findCombinations(target, c, i, tempRes + c.get(i));
            }
        }
    }
}
