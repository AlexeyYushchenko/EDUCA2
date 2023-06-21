package com.yushchenkoaleksey.edu.leetcode.middle.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TopKFrequentElementsTest {

    @Test
    void topKFrequent() {
        var nums = new int[]{1, 1, 3, 3, 3, 4, 5, 6, 7, 7, 4, 4, 4, 7, 7, 5};
        var actual = new TopKFrequentElements().topKFrequent(nums, 3);
        Assertions.assertArrayEquals(new int[]{4,7,3}, actual);

        nums = new int[]{5, 3, 1, 1, 1, 3, 73, 1};
        actual = new TopKFrequentElements().topKFrequent(nums, 2);
        Assertions.assertArrayEquals(new int[]{1, 3}, actual);
    }
}
