package com.yushchenkoaleksey.edu.leetcode.middle.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowTest {
    static Pow pow = new Pow();

    @Test
    void myPow1() {
        assertEquals(4, pow.myPow(2, 2));
    }
    @Test
    void myPow2() {
        assertEquals(0.25, pow.myPow(2, -2));
    }
    @Test
    void myPow3() {
        assertEquals(1024, pow.myPow(2, 10));
    }
    @Test
    void myPow4() {
        assertEquals(9.261, pow.myPow(2.1, 3));
    }

    @Test
    void myPow5() {
        assertEquals(700.28148, pow.myPow(8.88023, 3));
    }

    @Test
    void myPow6() {
        assertEquals(0.99979, pow.myPow(1.0000000000001, Integer.MIN_VALUE));
    }

    @Test
    void myPow7() {
        assertEquals(1, pow.myPow(-1, Integer.MIN_VALUE));
    }

    @Test
    void myPow8() {
        assertEquals(0, pow.myPow(2, -2147483648));
    }
}