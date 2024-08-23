package com.yushchenkoaleksey.edu.leetcode.easy.twopointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsTest {

    ReverseVowels reverseVowels = new ReverseVowels();

    @Test
    void reverseVowels1() {
        assertEquals("holle", reverseVowels.reverseVowels("hello"));
    }
    @Test
    void reverseVowels2() {
        assertEquals("leotcede", reverseVowels.reverseVowels("leetcode"));
    }
    @Test
    void reverseVowels3() {
        assertEquals(" ", reverseVowels.reverseVowels(" "));
    }
}