package com.yushchenkoaleksey.edu.sort;

import java.util.List;

public class BubbleSort {

    public static void bubbleSort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            boolean swap = false;
            for (int j = 1; j < list.size() - i; j++) {
                if (list.get(j) < list.get(j - 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                    swap = true;
                }
            }
            if (!swap) break;
        }
    }
}
