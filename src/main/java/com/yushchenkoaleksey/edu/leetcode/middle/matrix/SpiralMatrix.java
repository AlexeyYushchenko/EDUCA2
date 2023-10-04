package com.yushchenkoaleksey.edu.leetcode.middle.matrix;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/?envType=study-plan-v2&envId=top-interview-150
//54. Spiral Matrix
public class SpiralMatrix {

    public static void main(String[] args) {
        SpiralMatrix matrix = new SpiralMatrix();
        var list = matrix.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        System.out.println(list);
        var list1 = matrix.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}});
        System.out.println(list1);
        //1,2,3,4,8,12,11,10,9,5,6,7
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int top = 0;
        int rightSide = matrix[0].length - 1;
        int leftSide = 0;
        int bottom = matrix.length - 1;

        int start = top;
        int end = rightSide;

        int[] axis = new int[]{0, 0}; //y, x
        var sides = new int[]{0, matrix[0].length, matrix.length, 0}; //top - right - bottom - left
        var vector = new int[4][2];
        vector[0][0] = sides[3]; //left
        vector[0][1] = sides[1]; //right
        vector[1][0] = sides[0]; //top
        vector[1][1] = sides[2]; //bottom
        vector[2][0] = sides[1]; //right
        vector[2][1] = sides[3]; //left
        vector[3][0] = sides[2]; //bottom
        vector[3][1] = sides[0]; //top
        int[] increment = new int[]{1, -1, -1, 1}; //top right bottom left
        int[] xyIncrement = new int[]{1, 1, -1, -1}; //
        int uIdx = 0;
        while (top + 1 != bottom || leftSide + 1 != rightSide) {
            if (uIdx % 2 == 0) {
                //increment x
                int y = sides[uIdx % 4];
                for (int x = vector[uIdx % 4][0]; x != vector[uIdx % 4][1]; x += xyIncrement[uIdx % 4]) {
                    res.add(matrix[y][x]);
                }
            } else {
//                increment y
                int x = sides[uIdx % 4] - 1;
                for (int y = vector[uIdx % 4][0]; y != vector[uIdx % 4][1]; y += xyIncrement[uIdx % 4]) {
                    res.add(matrix[y][x]);
                }
            }
            sides[uIdx % 4] += xyIncrement[uIdx % 4];
            uIdx++;
        }
        return res;
    }

    private void swapAxis(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
