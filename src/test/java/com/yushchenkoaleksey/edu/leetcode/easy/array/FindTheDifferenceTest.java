package com.yushchenkoaleksey.edu.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheDifferenceTest {

    FindTheDifference findTheDifference = new FindTheDifference();

    @Test
    void findTheDifference1() {
        String s = "abcd";
        String t = "abcde";
        assertEquals('e', findTheDifference.findTheDifference(s, t));
    }
    @Test
    void findTheDifference2() {
        String s = "";
        String t = "y";
        assertEquals('y', findTheDifference.findTheDifference(s, t));
    }
}