package com.yushchenkoaleksey.edu.leetcode.middle.matrix;

//https://leetcode.com/problems/game-of-life/?envType=study-plan-v2&envId=top-interview-150
//289. Game of Life

import java.util.Arrays;

public class GameOfLife {

    private static int[] yShift = new int[]{-1, -1, 1, 1, 0, 0, -1, 1};
    private static int[] xShift = new int[]{-1, 1, -1, 1, -1, 1, 0, 0};

    public void gameOfLife(int[][] board) {
        int[][] res = new int[board.length][board[0].length];
        for (int i = 0; i < res.length; i++) res[i] = Arrays.copyOf(board[i], board[i].length);

        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[0].length; x++) {
                if (board[y][x] == 0){
                    if(checkDeadCell(board, y, x)) res[y][x] = 1;
                }else {
                    var neighbors = countNeighbors(board, y, x);
                    if (neighbors < 2 || neighbors > 3){
                        res[y][x] = 0;
                    }else {
                        res[y][x] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < board.length; i++) board[i] = Arrays.copyOf(res[i], res[i].length);
    }

    private int countNeighbors(int[][] board, int y, int x) {
        //Any live cell with fewer than two live neighbors dies as if caused by under-population.
        //Any live cell with two or three live neighbors lives on to the next generation.
        //Any live cell with more than three live neighbors dies, as if by over-population.
        int neighbors = 0;
        for (int i = 0; i < yShift.length; i++) {
            int rc = y + yShift[i];
            int rr = x + xShift[i];
            if (rc < 0 || rc >= board.length) continue;
            if (rr < 0 || rr >= board[0].length) continue;
            if (board[rc][rr] == 1) neighbors++;
        }
        return neighbors;
    }

    private boolean checkDeadCell(int[][] board, int y, int x) {
        //Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
        int countLive = 0;
        for (int i = 0; i < yShift.length; i++) {
            int rc = y + yShift[i];
            int rr = x + xShift[i];
            if (rc < 0 || rc >= board.length) continue;
            if (rr < 0 || rr >= board[0].length) continue;
            if (board[rc][rr] == 1) countLive++;
        }
        return (countLive == 3);
    }
}
