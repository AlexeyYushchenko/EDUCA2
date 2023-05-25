package com.yushchenkoaleksey.edu.leetcode.easy.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayFromPermutationTest {

    @Test
    void testBuildArray() {
        var test = new BuildArrayFromPermutation();
        int[] expected = {0, 1, 2, 4, 5, 3};
        var actual = new int[]{0, 2, 1, 5, 3, 4};
        assertArrayEquals(expected, test.buildArray(actual));
    }
}