package com.yushchenkoaleksey.edu.leetcode.middle;

import java.util.Arrays;

public class Rotate {
    //BEST EFFICIENCY, beats 100%
    public static void rotate3(int[] nums, int k) {
        if (k > nums.length) k = k % nums.length;
        var part1 = Arrays.copyOfRange(nums, 0, nums.length - k);
        var part2 = Arrays.copyOfRange(nums, nums.length - k, nums.length);
        System.arraycopy(part2, 0, nums, 0, part2.length);
        System.arraycopy(part1, 0, nums, part2.length, part1.length);
    }

    //Rotation mechanism. beats 53.29%
    public static void rotate2(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - k);
        reverse(nums, nums.length - k, nums.length);
        reverse(nums, 0, nums.length);
    }

    private static void reverse(int[] arr, int s, int e) {
        for (int i = s, j = e - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    //beats 53.29%
    public static void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        for (int i = 0; i < res.length; i++) {
            res[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(res, 0, nums, 0, res.length);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate2(arr, 3);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{1, 2};
        rotate2(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
