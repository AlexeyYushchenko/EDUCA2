package com.yushchenkoaleksey.edu.leetcode.middle.binarysearch;

import com.yushchenkoaleksey.edu.leetcode.easy.binarysearch.BinarySearch;

//74. Search a 2D Matrix
//https://leetcode.com/problems/search-a-2d-matrix/
public class SearchMatrix {

    private int getRowIndex(int[][] matrix, int target) {
        int s = 0;
        int e = matrix.length - 1;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (matrix[mid][matrix[0].length - 1] < target){
                s = mid + 1;
            }else if(matrix[mid][matrix[0].length - 1] >= target && matrix[mid][0] <= target){
                return mid;
            }else{
                e = mid - 1;
            }
        }
        return -1;
    }

    public int binarySearch(int[] nums, int target) {
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


    public boolean searchMatrix(int[][] matrix, int target) {
        var rowIndex = getRowIndex(matrix, target);
        if (rowIndex != -1 && binarySearch(matrix[rowIndex], target) != -1) return true;
        return false;
    }
}
