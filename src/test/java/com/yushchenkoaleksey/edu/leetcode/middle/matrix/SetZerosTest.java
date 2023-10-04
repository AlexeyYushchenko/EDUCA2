package com.yushchenkoaleksey.edu.leetcode.middle.matrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SetZerosTest {
    SetZeros setZeros = new SetZeros();
    @Test
    void setZeroes1() {
        int[][] matrix = new int[][]{{1, 1, 1, 1, 1},{1, 1, 1, 1, 1},{1, 0, 1, 0, 1},{1, 1, 1, 1, 1},{1, 1, 1, 1, 1}};
        setZeros.setZeroes(matrix);
        for(int [] row : matrix) System.out.println(Arrays.toString(row));
        assertArrayEquals(new int[][]{{1, 0, 1, 0, 1},{1, 0, 1, 0, 1},{0, 0, 0, 0, 0},{1, 0, 1, 0, 1},{1, 0, 1, 0, 1}}, matrix);
    }

    @Test()
    void setZeroes2() {
        int[][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeros.setZeroes(matrix);
        for(int [] row : matrix) System.out.println(Arrays.toString(row));
        assertArrayEquals(new int[][]{{0,0,0,0},{0,4,5,0},{0,3,1,0}}, matrix);
    }

    @Test()
    void setZeroes3() {
        int[][] matrix = new int[][]{{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
        for(int [] row : matrix) System.out.println(Arrays.toString(row));
        setZeros.setZeroes(matrix);
        System.out.println("actual:");
        for(int [] row : matrix) System.out.println(Arrays.toString(row));
        var expected = new int[][]{{0, 0, 3, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        System.out.println("expected:");
        for(int [] row : expected) System.out.println(Arrays.toString(row));
        assertArrayEquals(expected, matrix);
    }
}