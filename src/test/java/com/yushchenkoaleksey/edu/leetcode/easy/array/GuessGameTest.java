package com.yushchenkoaleksey.edu.leetcode.easy.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessGameTest {
    GuessGame guessGame = new GuessGame();
    @Test
    void guessNumber() {
//        2126753390
//1702766719
        assertEquals(1702766719,   guessGame.guessNumber(2126753390));
    }
}