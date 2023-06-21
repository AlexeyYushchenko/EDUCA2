package com.yushchenkoaleksey.edu.leetcode.middle.array;

import java.util.Arrays;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{0,1,2,4,8,5,6,7,9,3,55,88,77,99,999999999}));
    }

    public static int longestConsecutive(int[] nums) {
        if(nums.length < 1) return 0;
        int max = 1;
        int temp = 1;
        if (nums.length < 1000) {
            Arrays.sort(nums);
            int i = 0;
            int j = 1;
            while (i < nums.length && j < nums.length) {
                if (nums[j] - nums[i] == 1) {
                    temp++;
                } else if (nums[j] - nums[i] > 1) {
                    temp = 1;
                }
                if (max < temp) max = temp;
                i++;
                j++;
            }
            return max;
        }else {
            int maxValue = Integer.MIN_VALUE;
            int minValue = Integer.MAX_VALUE;
            for(int n : nums){
                if (maxValue < n) maxValue = n;
                if (minValue > n) minValue = n;
            }
            boolean[] consecutive = new boolean[maxValue - minValue + 1];
            for (int n : nums){
                consecutive[n - minValue] = true;
            }
            max = 0;
            temp = 0;
            for(boolean b : consecutive){
                if (b){
                    temp++;
                    max = temp > max? temp : max;
                }else {
                    temp = 0;
                }
            }
            return max;
        }
    }
}
