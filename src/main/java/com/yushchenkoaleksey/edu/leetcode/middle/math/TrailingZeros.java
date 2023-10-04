package com.yushchenkoaleksey.edu.leetcode.middle.math;

//https://leetcode.com/problems/factorial-trailing-zeroes/description/?envType=study-plan-v2&envId=top-interview-150
//172. Factorial Trailing Zeroes

public class TrailingZeros {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n != 0) {
            var i = n / 5;
            res += i;
            n = i;
        }
        return res;
    }
}
