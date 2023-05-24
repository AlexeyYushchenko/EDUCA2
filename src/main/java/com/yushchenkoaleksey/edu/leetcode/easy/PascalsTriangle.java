package com.yushchenkoaleksey.edu.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(List.of(1)));

        for (int i = 2; i <= numRows; i++) {
            res.add(new ArrayList<>());
            for (int j = 0; j < i; j++) {
                var currentRow = res.get(i - 1);
                if (j == 0 || j == i - 1) {
                    currentRow.add(1);
                }else {
                    var previousRow = res.get(i - 2);
                    int sum = previousRow.get(j) + previousRow.get(j - 1);
                    currentRow.add(sum);
                }
            }
        }
        return res;
    }

    public List<List<Integer>> generate(int numRows) {
        int[][] triange = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            int[] row = new int[i + 1];
            row[0] = 1;
            row[i] = 1;
            for (int j = 1; j < i; j++) {
                row[j] = triange[i - 1][j - 1] + triange[i - 1][j];
            }
            triange[i] = row;
        }
        return (List) Arrays.asList(triange);
    }
}