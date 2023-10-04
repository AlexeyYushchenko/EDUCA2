package com.yushchenkoaleksey.edu.leetcode.middle.slidingwindow;

public class MinSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        int s = 0;
        var length = nums.length;
        for (int e = 0; e < length; e++) {
            sum += nums[e];
            while (s <= e && sum >= target) {
                if (sum >= target) {
                    minLen = Math.min(minLen, e - s + 1);

                }
                sum -= nums[s];
                s++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public int minSubArrayLen2(int target, int[] nums) {
        int i = 0;
        int j = i;
        var length = nums.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        while (j < length) {
            if (sum < target) {
                sum += nums[++j];
            } else if (sum == target) {
                minLen = Math.min(minLen, j - i + 1);
                sum -= nums[++i];
            } else {
                sum -= nums[++i];
            }
            if (i == j) j++;
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        MinSubArrayLen minSubArrayLen = new MinSubArrayLen();
        System.out.println(minSubArrayLen.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(minSubArrayLen.minSubArrayLen(4, new int[]{1, 4, 4}));
        System.out.println(minSubArrayLen.minSubArrayLen(11, new int[]{2, 3, 1, 2, 4, 3}));
        System.out.println(minSubArrayLen.minSubArrayLen(3, new int[]{0, 0, 3}));
        System.out.println(minSubArrayLen.minSubArrayLen(3, new int[]{0, 0, 3, 0, 0}));
        System.out.println(minSubArrayLen.minSubArrayLen(11, new int[]{1,2,3,4,5}));

    }
}
