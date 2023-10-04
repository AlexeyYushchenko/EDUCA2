package com.yushchenkoaleksey.edu.leetcode.middle.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringTest {
    ReverseWordsInAString reverseWordsInAString = new ReverseWordsInAString();
    @Test
    void reverseWords1() {
        assertEquals("world hello", reverseWordsInAString.reverseWords("  hello world  "));
    }
    @Test
    void reverseWords2() {
        assertEquals("example good a", reverseWordsInAString.reverseWords("a good   example"));
    }
}