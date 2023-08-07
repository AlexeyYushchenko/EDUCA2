package com.yushchenkoaleksey.edu.leetcode.middle.twopointers;

public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            i = j - 1;
            int sum;
            while ((sum = numbers[i] + numbers[j]) != target) {
                if (sum < target) {
                    j++;
                } else {
                    i--;
                }
            }
        }
        return new int[]{i + 1, j + 1};
    }
}