package com.yushchenkoaleksey.edu.leetcode.easy.array;

public class GuessGame {

    public int guessNumber(int n) {
        long l = 1L;
        long h = Integer.MAX_VALUE;
        while (l <= h) {
            long m = (int)l +  (h - l) / 2;
            int response = guess(m);
            if (response == 1) {
                l = m + 1;
            } else if (response == 0) {
                return (int) m;
            } else {
                h = m - 1;
            }
        }
        return -1;
    }

    private int guess(long m) {
        int num = 1702766719;
        if (m > num) return -1;
        if (m < num) return 1;
        return 0;
    }
}
