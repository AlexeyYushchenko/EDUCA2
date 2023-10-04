package com.yushchenkoaleksey.edu.miscellaneous;

public class RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 1, 1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println(removeDuplicates(new int[]{-3, -1, 0, 0, 0, 3, 3}));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        int len = nums.length;
        int n = nums[i];
        while (j < len){
            if (nums[j] != n){
                nums[++i] = nums[j];
                n = nums[i];
            }
            j++;
        }
        return ++i;
    }
}
