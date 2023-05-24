package com.yushchenkoaleksey.edu.sort;

import java.util.List;

public class CountingSort {

    public static void countingSortI(List<Integer> list) {
        int max = list.stream().max(Integer::compareTo).orElse(Integer.MAX_VALUE);
        int min = list.stream().min(Integer::compareTo).orElse(0);

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
