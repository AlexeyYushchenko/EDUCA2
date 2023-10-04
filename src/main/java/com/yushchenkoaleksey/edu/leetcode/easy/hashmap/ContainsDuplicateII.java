package com.yushchenkoaleksey.edu.leetcode.easy.hashmap;

import java.util.HashSet;

public class ContainsDuplicateII {


    public static void main(String[] args) {
        ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(containsDuplicateII.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>(nums.length, 1);
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])){
                for (int j = 1; j <= k && i - j >= 0; j++) {
                    if (nums[i] == nums[i - j]) return true;
                }
            }
        }
        return false;
    }
}
