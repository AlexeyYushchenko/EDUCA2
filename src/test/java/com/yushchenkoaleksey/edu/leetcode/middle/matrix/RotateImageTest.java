package com.yushchenkoaleksey.edu.leetcode.middle.matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateImageTest {
    int[][] cube = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] cube2 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    RotateImage rotateImage = new RotateImage();

    @Test
    void cubeTest1() {
        rotateImage.rotate(cube);
        Assertions.assertArrayEquals(new int[]{7, 4, 1}, cube[0]);
        Assertions.assertArrayEquals(new int[]{8, 5, 2}, cube[1]);
        Assertions.assertArrayEquals(new int[]{9, 6, 3}, cube[2]);
    }

    @Test
    void cubeTest2() {
        rotateImage.rotate(cube2);
        Assertions.assertArrayEquals(new int[]{13, 9, 5, 1,}, cube2[0]);
        Assertions.assertArrayEquals(new int[]{14, 10, 6, 2,}, cube2[1]);
        Assertions.assertArrayEquals(new int[]{15, 11, 7, 3,}, cube2[2]);
        Assertions.assertArrayEquals(new int[]{16, 12, 8, 4,}, cube2[3]);
    }
}