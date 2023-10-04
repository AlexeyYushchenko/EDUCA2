package com.yushchenkoaleksey.edu.leetcode.middle.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathWithMinimumEffortTest {

        PathWithMinimumEffort solution = new PathWithMinimumEffort();
    @Test
    void test1() {
        var griglia = new int[][]{
                {1, 2, 1, 1, 1, 2, 2},
                {1, 1, 1, 2, 1, 1, 1}
        };

        assertEquals(0, solution.minimumEffortPath(griglia));
    }
    @Test
    void test2() {
        var griglia = new int[][]{
                {1, 2, 3},
                {2, 9, 6},
                {3, 5, 7}
        };

        assertEquals(2, solution.minimumEffortPath(griglia));
    }
    @Test
    void test3() {
        var griglia = new int[][]{
                {1}
        };

        assertEquals(0, solution.minimumEffortPath(griglia));
    }
    @Test
    void test4() {
        var griglia = new int[][]{
                {1,10,6,7,9,10,4,9}
        };

        assertEquals(9, solution.minimumEffortPath(griglia));
    }
    @Test
    void test5() {
        var griglia = new int[][]{
                {4,3,4,10,5,5,9,2},{10,8,2,10,9,7,5,6},{5,8,10,10,10,7,4,2},{5,1,3,1,1,3,1,9},{6,4,10,6,10,9,4,6}
        };

        assertEquals(5, solution.minimumEffortPath(griglia));
    }
}