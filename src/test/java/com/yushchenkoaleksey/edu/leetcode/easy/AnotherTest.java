package com.yushchenkoaleksey.edu.leetcode.easy;

import com.yushchenkoaleksey.edu.miscellaneous.Another;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnotherTest {

    @Test
    void merge() {
        int[] arr1 = new int[]{1,2,3,0,0,0};
        int[] arr2 = new int[]{4,5,6};
        Another.merge(arr1, 3, arr2,  3);
        int[] result = new int[]{1,2,3,4,5,6};
        assertArrayEquals(result, arr1);
    }
}