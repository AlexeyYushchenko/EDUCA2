package com.yushchenkoaleksey.edu.leetcode.easy.array;

import java.util.Arrays;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for (int i = 0, j = 0; i < n; i++, j += 2) {
            arr[j] = nums[i];
            arr[j + 1] = nums[i + n];
        }
        return arr;
    }

    public static void main(String[] args) {
        new ShuffleArray().shuffle(new int[]{1, 2, 3, 4, 5, 6}, 3);
    }
}
