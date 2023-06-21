package com.yushchenkoaleksey.edu.leetcode.easy.array;

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        aPermutations(nums, 0);

        return nums;
    }

    private void aPermutations(int[] nums, int i) {
        if (i < nums.length){
            int index = nums[i];
            int result = nums[index];
            aPermutations(nums, i + 1);
            nums[i] = result;
        }
    }
}
