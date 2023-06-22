package com.yushchenkoaleksey.edu.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 4,2,5,3,9,7,8,6};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSort(int[] arr, int s, int e){
        if (s >= e) return;
        var partition = partition(arr, s, e);
        quickSort(arr, s, partition - 1);
        quickSort(arr, partition + 1, e);
    }

    private static int partition(int[] arr, int s, int e) {
        int i = s;
        int j = i - 1;
        while (i < e){
            if (arr[i] < arr[e]){
                j++;
                swap(arr, i, j);
            }
            i++;
        }
        j++;
        swap(arr, i, j);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
