package com.yushchenkoaleksey.edu.leetcode.middle.matrix;

import java.util.*;

//https://leetcode.com/problems/set-matrix-zeroes/?envType=study-plan-v2&envId=top-interview-150
//73. Set Matrix Zeros
public class SetZeros {
    public void setZeroes(int[][] matrix) {
        int col0 = 1;
        for (int y = 0; y < matrix.length; y++) {
            if (matrix[y][0] == 0) col0 = 0;
            for (int x = 1; x < matrix[0].length; x++) {
                if (matrix[y][x] == 0) {
                    matrix[y][0] = 0;
                    matrix[0][x] = 0;
                }
            }
        }
        for (int y = matrix.length - 1; y >= 0; y--) {
            for (int x = matrix[0].length - 1; x > 0; x--) {
                if (matrix[y][0] == 0 || matrix[0][x] == 0) matrix[y][x] = 0;
            }
            if (col0 == 0) matrix[y][0] = 0;
        }
    }

    //examine the method
    public void setZeroes9(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int col0 = 1;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j > 0; j--) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
            }
            if (col0 == 0) matrix[i][0] = 0;
        }
    }
}
