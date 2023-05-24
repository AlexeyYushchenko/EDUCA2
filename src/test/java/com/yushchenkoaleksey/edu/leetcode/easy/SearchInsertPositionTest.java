package com.yushchenkoaleksey.edu.leetcode.easy;

import org.junit.jupiter.api.Test;
import static com.yushchenkoaleksey.edu.leetcode.easy.SearchInsertPosition.searchInsert;
import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void checkSearchInsert1() {
        int[] arr = new int[]{1, 3, 5, 6};
        int target = 5;
        var actual = searchInsert(arr, target);
        assertEquals(2, actual);
    }

    @Test
    void checkSearchInsert2() {
        int[] arr = new int[]{1, 3, 5, 6};
        int target = 2;
        var actual = searchInsert(arr, target);
        assertEquals(1, actual);
    }

    @Test
    void checkSearchInsert3() {
        int[] arr = new int[]{1, 3, 5, 6};
        int target = 7;
        var actual = searchInsert(arr, target);
        assertEquals(4, actual);
    }

    @Test
    void checkSearchInsert4() {
        int[] arr = new int[]{1, 3};
        int target = 2;
        var actual = searchInsert(arr, target);
        assertEquals(1, actual);
    }

    @Test
    void checkSearchInsert5() {
        int[] arr = new int[]{1, 3};
        int target = 0;
        var actual = searchInsert(arr, target);
        assertEquals(0, actual);
    }

    @Test
    void checkSearchInsert6() {
        int[] arr = new int[]{1, 3};
        int target = 4;
        var actual = searchInsert(arr, target);
        assertEquals(2, actual);
    }

    @Test
    void checkSearchInsert7() {
        int[] arr = new int[]{1, 3};
        int target = 1;
        var actual = searchInsert(arr, target);
        assertEquals(0, actual);
    }

    @Test
    void checkSearchInsert8() {
        int[] arr = new int[]{1, 3, 5};
        int target = 4;
        var actual = searchInsert(arr, target);
        assertEquals(2, actual);
    }

    @Test
    void checkSearchInsert9() {
        int[] arr = new int[]{1,2,4,6,7};
        int target = 3;
        var actual = searchInsert(arr, target);
        assertEquals(2, actual);
    }
}