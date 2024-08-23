package com.yushchenkoaleksey.edu.leetcode.easy.slidingwindow;

//https://leetcode.com/problems/defuse-the-bomb/
//1652. Defuse the Bomb
public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        if (k == 0) return res;

        var numLen = Math.abs(k);
        int start = k > 0 ? 1 : code.length - numLen;

        int sum = 0;
        for (int j = 0; j < numLen; j++) {
            sum += code[(start + j) % code.length];
        }
        res[0] = sum;

        for (int i = 1; i < code.length; i++) {
            sum = sum - code[start % code.length] + code[(start + numLen) % code.length];
            res[i] = sum;
            start++;
        }
        return res;





//        if (k > 0) {
//            for (int i = 0; i < res.length; i++) {
//                int sum = 0;
//                for (int j = 1; j <= k; j++) {
//                    sum += code[(i + j) % code.length];
//                }
//                res[i] = sum;
//            }
//            return res;
//
//        } else {
//            for (int i = 0; i < res.length; i++) {
//                int sum = 0;
//                for (int j = 0; j < k * -1; j++) {
//                    sum += code[(i + code.length + k + j) % code.length];
//                }
//                res[i] = sum;
//            }
//            return res;
//        }
    }
}
