package com.yushchenkoaleksey.edu.leetcode.middle.heap;

//215. Kth Largest Element in an Array
//https://leetcode.com/problems/kth-largest-element-in-an-array/?envType=study-plan-v2&envId=top-interview-150
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        //solution with Counting sort algorithm
        int max = 10000;
        int min = -10000;
        int[] countArray = new int[max - min + 1];
        for (int n : nums) {
            countArray[n - min]++;
        }
        //going back from the biggest value to the lowest one
        for (int i = countArray.length - 1; i >= 0; i--) {
            while (countArray[i] > 0) {
                k--;
                countArray[i]--;
                if (k <= 0) return i - min;
            }
        }
        return -1;
    }
}
