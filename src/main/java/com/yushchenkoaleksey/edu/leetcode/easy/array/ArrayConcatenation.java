package com.yushchenkoaleksey.edu.leetcode.easy.array;

import java.util.Arrays;

public class ArrayConcatenation {

    public int[] getConcatenation3(int[] nums) {
        var len = nums.length * 3;
        int[] arr = new int[len];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = arr[i + nums.length] = arr[i + nums.length * 2] = nums[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ArrayConcatenation().getConcatenation3(new int[]{1, 2, 3})));
    }
    public int[] getConcatenation2(int[] nums) {
        var len = nums.length * 2;
        int[] arr = new int[len];
        System.arraycopy(nums, 0, arr,0, nums.length);
        System.arraycopy(nums, 0, arr,nums.length, nums.length);
        return arr;
    }

    public int[] getConcatenation1(int[] nums) {
        var len = nums.length * 2;
        var arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = nums[i % nums.length];
        }
        return arr;
    }

    public static void main3(String[] args) {
        var nums = new int[]{1, 2, 3};
        var iterations = 1000;
        long time = 0;

        var arrayConcatenation = new ArrayConcatenation();

        System.out.println("1");
        for (int i = 0; i < iterations; i++) {
            var start = System.nanoTime();
            var concatenation = arrayConcatenation.getConcatenation1(nums);
            var end = System.nanoTime();
            time += (end - start);
        }
        System.out.println(time);

        System.out.println();

        System.out.println("2");
        for (int i = 0; i < iterations; i++) {
            var start = System.nanoTime();
            var concatenation = arrayConcatenation.getConcatenation2(nums);
            var end = System.nanoTime();
            time += (end - start);
        }
        System.out.println(time);

        System.out.println();

        System.out.println("3");
        for (int i = 0; i < iterations; i++) {
            var start = System.nanoTime();
            var concatenation = arrayConcatenation.getConcatenation3(nums);
            var end = System.nanoTime();
            time += (end - start);
        }
        System.out.println(time);
    }
}
