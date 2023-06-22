package com.yushchenkoaleksey.edu.sort;

import java.util.List;

public class CountingSort {

    public static void countingSortI(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : list){
            if (n > max) max = n;
            if (n < min) min = n;
        }

        int[]c = new int[max - min + 1];
        for (int value : list){
            c[value - min]++;
        }

        int k = 0;
        for (int i = 0; i < c.length; i++) {
            while (c[i] > 0){
                list.set(k++, i + min);
                c[i]--;
            }
        }
    }
}
