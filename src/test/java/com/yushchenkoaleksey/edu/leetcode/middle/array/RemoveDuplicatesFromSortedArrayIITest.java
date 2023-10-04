package com.yushchenkoaleksey.edu.leetcode.middle.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayIITest {

    RemoveDuplicatesFromSortedArrayII instance = new RemoveDuplicatesFromSortedArrayII();

    @Test
    void removeDuplicates1() {
        assertEquals(5, instance.removeDuplicates(new int[]{1,1,1,2,2,3}));
    }
    @Test
    void removeDuplicates2() {
        assertEquals(7, instance.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }
}