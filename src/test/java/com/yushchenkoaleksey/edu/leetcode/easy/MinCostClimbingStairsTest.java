package com.yushchenkoaleksey.edu.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinCostClimbingStairsTest {

    MinCostClimbingStairs minCost = new MinCostClimbingStairs();
    @Test
    void minCostClimbingStairs1() {
        assertEquals(15, minCost.minCostClimbingStairs(new int[]{10,15,20}));
    }
    @Test
    void minCostClimbingStairs2() {
        assertEquals(6, minCost.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
}