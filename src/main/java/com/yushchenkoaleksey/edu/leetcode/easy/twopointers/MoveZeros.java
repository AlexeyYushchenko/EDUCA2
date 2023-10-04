package com.yushchenkoaleksey.edu.leetcode.easy.twopointers;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/?envType=study-plan-v2&envId=leetcode-75
//283.Move Zeros
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        if(nums.length == 1) return;
        int i = 0;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != 0) nums[i++] = nums[k];
        }
        Arrays.fill(nums, i, nums.length, 0);
    }
}
