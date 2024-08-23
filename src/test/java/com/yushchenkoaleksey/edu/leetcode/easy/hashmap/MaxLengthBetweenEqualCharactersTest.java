package com.yushchenkoaleksey.edu.leetcode.easy.hashmap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxLengthBetweenEqualCharactersTest {
    MaxLengthBetweenEqualCharacters maxLengthBetweenEqualCharacters = new MaxLengthBetweenEqualCharacters();

    @Test
    void maxLengthBetweenEqualCharacters1() {
        Assertions.assertEquals(0, maxLengthBetweenEqualCharacters.maxLengthBetweenEqualCharacters("aa"));
    }
    @Test
    void maxLengthBetweenEqualCharacters2() {
        Assertions.assertEquals(2, maxLengthBetweenEqualCharacters.maxLengthBetweenEqualCharacters("abca"));
    }
    @Test
    void maxLengthBetweenEqualCharacters3() {
        Assertions.assertEquals(-1, maxLengthBetweenEqualCharacters.maxLengthBetweenEqualCharacters("abcde"));
    }
    @Test
    void maxLengthBetweenEqualCharacters4() {
        Assertions.assertEquals(5, maxLengthBetweenEqualCharacters.maxLengthBetweenEqualCharacters("abcadea"));
    }
    @Test
    void maxLengthBetweenEqualCharacters5() {
        Assertions.assertEquals(18, maxLengthBetweenEqualCharacters.maxLengthBetweenEqualCharacters("mgntdygtxrvxjnwksqhxuxtrv"));
    }
}