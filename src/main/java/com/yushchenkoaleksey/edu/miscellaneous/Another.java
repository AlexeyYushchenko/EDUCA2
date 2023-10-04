package com.yushchenkoaleksey.edu.miscellaneous;

public class Another {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr1 = new int[m];
        System.arraycopy(nums1, 0, arr1, 0, m);
        int[] arr2 = new int[n];
        System.arraycopy(nums2, 0, arr2, 0, n);
        mergeArrays(nums1, arr1, arr2);
    }

    private static void mergeArrays(int[] nums1, int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                nums1[k++] = arr1[i++];
            } else {
                nums1[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            nums1[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            nums1[k++] = arr2[j++];
        }
    }
}
