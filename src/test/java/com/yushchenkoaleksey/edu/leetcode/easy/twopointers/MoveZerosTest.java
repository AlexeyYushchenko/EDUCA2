package com.yushchenkoaleksey.edu.leetcode.easy.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    MoveZeros moveZeros = new MoveZeros();
    @Test
    void moveZeroes1() {
        var arr = new int[]{1, 0, 0, 2, 3};
        moveZeros.moveZeroes(arr);
        assertArrayEquals(new int[]{1, 2, 3, 0, 0}, arr);
    }
    @Test
    void moveZeroes2() {
        var arr = new int[]{0, 0, 0, 2, 0};
        moveZeros.moveZeroes(arr);
        assertArrayEquals(new int[]{2, 0, 0, 0, 0}, arr);
    }
}