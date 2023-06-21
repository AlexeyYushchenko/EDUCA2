package com.yushchenkoaleksey.edu.leetcode.middle.array;

public class ValidSudoku {

    public static void main(String[] args) {
        char[][] sudoku = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(new ValidSudoku().isValidSudoku(sudoku));
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') continue;
                if (!isRowValid(i, j, board) || !isColumnValid(i, j, board) || !isSquareValid(i, j, board))
                    return false;
            }
        }
        return true;
    }

    private boolean isSquareValid(int i, int j, char[][] board) {
        var columnEnd = (i / 3 + 1) * 3;
        var rowEnd = (j / 3 + 1) * 3;
        for (int c = columnEnd - 3; c < columnEnd; c++) {
            for (int r = rowEnd - 3; r < rowEnd; r++) {
                if (c == i && r == j) continue;
                if (board[c][r] == board[i][j]) return false;
            }
        }
        return true;
    }

    private boolean isColumnValid(int i, int j, char[][] board) {
        for (int c = 0; c < board.length; c++) {
            if (c == i) continue;
            if (board[c][j] == board[i][j]) return false;
        }
        return true;
    }

    private boolean isRowValid(int i, int j, char[][] board) {
        for (int r = 0; r < board[0].length; r++) {
            if (r == j) continue;
            if (board[i][r] == board[i][j]) return false;
        }
        return true;
    }
}