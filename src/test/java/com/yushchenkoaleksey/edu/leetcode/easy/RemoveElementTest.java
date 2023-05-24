package com.yushchenkoaleksey.edu.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    void removeElement() {
        int[] expected = new int[]{2,2,3,3};
        int[] actual = new int[]{3,2,2,3};
        var k = RemoveElement.removeElement(actual, 3);
        System.out.println(Arrays.toString(actual));
        assertEquals(k, 2);

        actual = new int[]{0,1,2,2,3,0,4,2};
        k = RemoveElement.removeElement(actual, 2);
        System.out.println(Arrays.toString(actual));
        assertEquals(5, k);
    }
}