package com.yushchenkoaleksey.edu.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorOfStringsTest {

    GreatestCommonDivisorOfStrings divisor = new GreatestCommonDivisorOfStrings();
    @Test
    void gcdOfStrings1() {
        String str1 = "ABCABC";
        String str2 = "ABC";
        assertEquals("ABC", divisor.gcdOfStrings(str1, str2));
    }

    @Test
    void gcdOfStrings2() {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        assertEquals("AB", divisor.gcdOfStrings(str1, str2));
    }

    @Test
    void gcdOfStrings3() {
        String str1 = "LEED";
        String str2 = "CODE";
        assertEquals("", divisor.gcdOfStrings(str1, str2));
    }


    @Test
    void gcd(){
        assertEquals(1, divisor.gcd(7, 3));
        assertEquals(1, divisor.gcd(3, 7));
    }

    @Test
    void gcd2(){
        assertEquals(4, divisor.gcd(4, 8));
        assertEquals(4, divisor.gcd(8, 4));
    }

    @Test
    void gcd3(){
        assertEquals(3, divisor.gcd(3, 9));
        assertEquals(3, divisor.gcd(9, 3));
    }
}