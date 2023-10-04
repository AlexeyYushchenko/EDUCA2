package com.yushchenkoaleksey.edu.leetcode.middle.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpTest {

    Jump jump = new Jump();

    @Test
    void canJump() {
        assertTrue(jump.canJump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void canJump1() {
        assertTrue(jump.canJump(new int[]{10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));
    }

    @Test
    void canJump5() {
        assertTrue(jump.canJump(new int[]{10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
    }

    @Test
    void canJump2() {
        assertFalse(jump.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    @Test
    void canJump3() {
        assertTrue(jump.canJump(new int[]{0}));
    }

    @Test
    void canJump4() {
        assertFalse(jump.canJump(new int[]{0, 1, 1, 1}));
    }
}