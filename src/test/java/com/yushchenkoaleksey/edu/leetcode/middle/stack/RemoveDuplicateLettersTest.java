package com.yushchenkoaleksey.edu.leetcode.middle.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateLettersTest {
    RemoveDuplicateLetters removeDuplicateLetters = new RemoveDuplicateLetters();
    @Test
    void removeDuplicateLetters() {
        assertEquals("abc", removeDuplicateLetters.removeDuplicateLetters("bcabc"));
    }
}