package com.yushchenkoaleksey.edu.leetcode.easy.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefuseTheBombTest {
    DefuseTheBomb defuseTheBomb = new DefuseTheBomb();

    @Test
    void decrypt() {
        Assertions.assertArrayEquals(new int[]{12, 10, 16, 13}, defuseTheBomb.decrypt(new int[]{5, 7, 1, 4}, 3));
    }
    @Test
    void decrypt2() {
        Assertions.assertArrayEquals(new int[]{12,5,6,13}, defuseTheBomb.decrypt(new int[]{2, 4, 9, 3}, -2));
    }
    @Test
    void decrypt3() {
        Assertions.assertArrayEquals(new int[]{22,26,22,28,29,22,19,22,18,21,28,19}, defuseTheBomb.decrypt(new int[]{10,5,7,7,3,2,10,3,6,9,1,6}, -4));
    }
}