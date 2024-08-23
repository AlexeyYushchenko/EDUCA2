package com.yushchenkoaleksey.edu.leetcode.easy.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumStrongPairXorTest {

    MaximumStrongPairXor maximumStrongPairXor = new MaximumStrongPairXor();
    @Test
    void maximumStrongPairXor() {
        Assertions.assertEquals(7, maximumStrongPairXor.maximumStrongPairXor(new int[]{1,2,3,4,5}));
    }

    @Test
    void maximumStrongPairXor2() {
        Assertions.assertEquals(0, maximumStrongPairXor.maximumStrongPairXor(new int[]{10, 100}));
    }

    @Test
    void maximumStrongPairXor3() {
        Assertions.assertEquals(7, maximumStrongPairXor.maximumStrongPairXor(new int[]{5,6,25,30}));
    }

    @Test
    void maximumStrongPairXor4() {
        Assertions.assertEquals(3, maximumStrongPairXor.maximumStrongPairXor(new int[]{1,1,10,3, 9}));
    }
}