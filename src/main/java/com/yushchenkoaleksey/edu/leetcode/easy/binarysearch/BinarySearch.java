package com.yushchenkoaleksey.edu.leetcode.easy.binarysearch;

public class BinarySearch {
    public int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int mid = (e + s) / 2;
            if (nums[mid] < target) {
                s = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(new int[]{0, 1, 2,3,5, 9,12}, 13));
    }
}
