package com.yushchenkoaleksey.edu.leetcode.middle.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {
    HouseRobber robber = new HouseRobber();
    @Test
    void rob1() {
        assertEquals(4, robber.rob(new int[]{1,2,3,1}));
    }
    @Test
    void rob2() {
        assertEquals(12, robber.rob(new int[]{2,7,9,3,1}));
    }
    @Test
    void rob3() {
        assertEquals(15, robber.rob(new int[]{10,2,2,5}));
    }
    @Test
    void rob4() {
        assertEquals(103, robber.rob(new int[]{1,3,1,3, 100}));
    }
    @Test
    void rob5() {
        assertEquals(39, robber.rob(new int[]{6,3,10,8,2,10,3,5,10,5,3}));
    }
}