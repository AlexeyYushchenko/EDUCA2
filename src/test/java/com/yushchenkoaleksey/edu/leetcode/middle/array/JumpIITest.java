package com.yushchenkoaleksey.edu.leetcode.middle.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JumpIITest {

    JumpII jump = new JumpII();

    @Test
    void jump1() {
        Assertions.assertEquals(2, jump.jump(new int[]{2, 3, 1, 1, 4}));
    }

    @Test
    void jump2() {
        Assertions.assertEquals(2, jump.jump(new int[]{2, 3, 0, 1, 4}));
    }

    @Test
    void jump3() {
        Assertions.assertEquals(0, jump.jump(new int[]{0}));
    }

    @Test
    void jump4() {
        Assertions.assertEquals(1, jump.jump(new int[]{1, 2}));
    }

    @Test
    void jump5() {
        Assertions.assertEquals(2, jump.jump(new int[]{1, 2, 3}));
    }

    @Test
    void jump6() {
        Assertions.assertEquals(3, jump.jump(new int[]{1, 2, 1, 1, 1}));
    }

    @Test
    void jump7() {
        Assertions.assertEquals(2, jump.jump(new int[]{2, 0, 2, 0, 1}));
    }
}