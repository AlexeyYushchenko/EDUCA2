package com.yushchenkoaleksey.edu.leetcode.easy.bitwiseoperations;

import java.util.Arrays;

//https://leetcode.com/problems/counting-bits/?envType=daily-question&envId=2023-09-01
//338. Counting Bits
public class CountingBits {
    public int[] countBits(int n) {
        int arr[] = new int[n + 1];
        helper(arr, 1, 1);
        return arr;
    }

    void helper(int arr[], int bits, int count) {
        if (count >= arr.length)
            return;
        arr[count] = bits;
        count <<= 1;
        helper(arr, bits, count);
        helper(arr, ++bits, ++count);
    }

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(new CountingBits().countBits(5)));
        int i = 5;
        int j = 10;
        i >>= 1;
        j >>= 1;
        System.out.println(i);
        System.out.println(j);
    }
}
