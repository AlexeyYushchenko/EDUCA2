package com.yushchenkoaleksey.edu.miscellaneous;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        if (target < nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;
        int start = 0;
        int end = nums.length;
        while (start < end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return target <= nums[start]? start : start + 1;
    }
}
