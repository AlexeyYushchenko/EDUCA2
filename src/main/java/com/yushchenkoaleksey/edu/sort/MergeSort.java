package com.yushchenkoaleksey.edu.sort;

import lombok.experimental.UtilityClass;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@UtilityClass
public class MergeSort {

    public static void mergeSort(List<Integer> list) {
        if (list.size() < 2) return;

        int mid = list.size() / 2;
        var list1 = list.subList(0, mid).stream().collect(Collectors.toList());
        var list2 = list.subList(mid, list.size()).stream().collect(Collectors.toList());
        mergeSort(list1);
        mergeSort(list2);

        merge(list, list1, list2);
    }

    private static void merge(List<Integer> list, List<Integer> list1, List<Integer> list2) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                list.set(k++, list1.get(i++));
            } else {
                list.set(k++, list2.get(j++));
            }
        }
        while (i < list1.size()) {
            list.set(k++, list1.get(i++));
        }
        while (j < list2.size()) {
            list.set(k++, list2.get(j++));
        }
    }
}
