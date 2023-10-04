package com.yushchenkoaleksey.edu.leetcode.middle.matrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeTest {

    @Test
    void gameOfLife() {
        //Input: board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}}
        //Output: {{0,0,0},{1,0,1},{0,1,1},{0,1,0}}
        GameOfLife gameOfLife = new GameOfLife();
        var board = new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        gameOfLife.gameOfLife(board);
        for (int[] arr : board){
            System.out.println(Arrays.toString(arr));
        }
        assertArrayEquals(new int[][]{{0, 0, 0}, {1, 0, 1}, {0, 1, 1}, {0, 1, 0}}, board);
    }
}