package com.yushchenkoaleksey.edu.leetcode.middle.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
        System.out.println(Arrays.toString(new ProductOfArrayExceptSelf().productExceptSelf(new int[]{0, 2, 3, 4})));
    }

    public int[] productExceptSelf(int[] nums) {
        var product = nums[0] == 0? 1 : nums[0];
        int indexOfZero = -1;
        int zeros = 0;
        if (nums[0] == 0) {
            zeros = 1;
            indexOfZero = 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
                indexOfZero = i;
                if (zeros > 1) return new int[nums.length];
                continue;
            }
            product *= nums[i];
        }

        if (zeros > 0) {
            int[] res = new int[nums.length];
            res[indexOfZero] = product;
            return res;
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res[i] = product;
            } else {
                res[i] = product / nums[i];
            }

        }
        return res;
    }
}
