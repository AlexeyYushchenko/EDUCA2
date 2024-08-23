package com.yushchenkoaleksey.edu.leetcode.easy.slidingwindow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountGoodSubstringsTest {

    CountGoodSubstrings countGoodSubstrings = new CountGoodSubstrings();

    @Test
    void setCountGoodSubstrings(){
        Assertions.assertEquals(1, countGoodSubstrings.countGoodSubstrings("xyzzaz"));
    }
    @Test
    void setCountGoodSubstrings2(){
        Assertions.assertEquals(4, countGoodSubstrings.countGoodSubstrings("aababcabc"));
    }
}