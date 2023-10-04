package com.yushchenkoaleksey.edu.leetcode.middle.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

//50. Pow(x, n)
//https://leetcode.com/problems/powx-n/?envType=study-plan-v2&envId=top-interview-150
public class Pow {
    public double myPow(double x, int n) {
        long temp = n;
        if (temp < 0) {
            temp *= -1;
        }

        double res = 1;
        while (temp > 0) {
            if (temp % 2 != 0) {
                res *= x;
            }
            x *= x;
            temp >>= 1;
        }
        return BigDecimal.valueOf(n < 0 ? 1.0 / res : res).setScale(5, RoundingMode.HALF_UP).doubleValue();
    }
}