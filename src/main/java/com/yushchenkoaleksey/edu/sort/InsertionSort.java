package com.yushchenkoaleksey.edu.sort;

import java.util.List;

public class InsertionSort {

    public static void insertionSort(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int temp = list.get(i);
            int j = i;
            while (j > 0 && temp < list.get(j - 1)) {
                list.set(j, list.get(j - 1));
                j--;
            }
            list.set(j, temp);
        }
    }
}
