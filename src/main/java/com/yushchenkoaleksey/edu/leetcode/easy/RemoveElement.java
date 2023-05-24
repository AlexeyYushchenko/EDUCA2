package com.yushchenkoaleksey.edu.leetcode.easy;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int k = 0;
        var length = nums.length;
        while (i < length) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
            i++;
        }
        return k;
    }
}
