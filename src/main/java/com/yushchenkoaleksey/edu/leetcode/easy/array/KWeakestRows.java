package com.yushchenkoaleksey.edu.leetcode.easy.array;

//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/?envType=daily-question&envId=2023-09-18
//1337. The K Weakest Rows in a Matrix
public class KWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] soldiers = new int[mat.length];
        for (int i = 0; i < soldiers.length; i++) {
            soldiers[i] = ceil(mat[i]);
        }

        int[] kWeakest = new int[k];
        for (int i = 0; i < k; i++) {
            kWeakest[i] = findMin(soldiers);
        }
        return kWeakest;
    }

    private int findMin(int[] soldiers) {
        int minValue = Integer.MAX_VALUE;
        int minIdx = 0;
        for (int i = 0; i < soldiers.length; i++) {
            if (soldiers[i] >= 0 && soldiers[i] < minValue) {
                minIdx = i;
                minValue = soldiers[i];
            }
        }
        soldiers[minIdx] = -1;
        return minIdx;
    }

    private int ceil(int[] ints) {
        int s = 0;
        int e = ints.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (ints[m] > 0) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return s;
    }
}
