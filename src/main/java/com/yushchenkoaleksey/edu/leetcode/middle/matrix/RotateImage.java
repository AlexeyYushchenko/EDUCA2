package com.yushchenkoaleksey.edu.leetcode.middle.matrix;

import java.util.Arrays;

public class RotateImage {
    public void rotate(int[][] matrix) {
        var length = matrix.length;
        for (int i = 0; i < length; i++) {
            rotateColumn(matrix,i, -i);
        }
        for (int i = 0; i < length; i++) {
            rotateRow(matrix,i, -(length - 1 - i));
        }
        for (int i = 0; i < length; i++) {
            rotateColumn(matrix,i, length - 1 - i);
        }
    }

    private void rotateRow(int[][] matrix, int row, int shift) {
        if (shift == 0) return;
        shift = shift < 0 ? matrix[0].length + shift : shift;
        int xLen = matrix[row].length;
        reverseRow(matrix, row, 0, shift);
        reverseRow(matrix, row, shift, xLen);
        reverseRow(matrix, row, 0, xLen);
    }
    private void reverseRow(int[][]matrix, int row, int s, int e) {
        for (int i = 0; i + s < (s + e) / 2; i++) {
            int temp = matrix[row][s + i];
            matrix[row][s + i] = matrix[row][e - 1 - i];
            matrix[row][e - 1 - i] = temp;
        }
    }

    private void rotateColumn(int[][] matrix, int column, int shift) {
        if (shift == 0) return;
        shift = shift < 0 ? matrix[0].length + shift : shift;
        int yLen = matrix.length;
        reverseColumn(matrix, column, 0, shift);
        reverseColumn(matrix, column, shift, yLen);
        reverseColumn(matrix, column, 0, yLen);
    }
    private void reverseColumn(int[][]matrix, int column, int s, int e) {
        for (int i = 0; i + s < (s + e) / 2; i++) {
            int temp = matrix[s + i][column];
            matrix[s + i][column] = matrix[e - 1 - i][column];
            matrix[e - 1 - i][column] = temp;
        }
    }

    public static void main(String[] args) {
        RotateImage image = new RotateImage();
        int[][]matrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] matrix2 = new int[][]{{1,2,3,4}, {5,6, 7, 8}, {9, 10, 11, 12}, {13,14,15,16}};

        var length = matrix2.length;
        for (int i = 0; i < length; i++) {
            image.rotateColumn(matrix2,i, -i);
        }
        for (int i = 0; i < length; i++) {
            image.rotateRow(matrix2,i, -(length - 1 - i));
        }
        for (int i = 0; i < length; i++) {
            image.rotateColumn(matrix2,i, length - 1 - i);
        }
        for (int[] row : matrix2){
            System.out.println(Arrays.toString(row));
        }
    }
}
