package com.yushchenkoaleksey.edu.leetcode.middle.array;

//https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times

import java.util.HashMap;

public class CountSubarrays {
    public long countSubarrays(int[] nums, int k) {
        if (nums.length < 1) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = nums[0];
        for (int size = 1; size <= nums.length; size++) {
            for (int i = 0; i + size <= nums.length; i++) {
                int count = 0;
                max = Math.max(max, nums[i]);
                for (int j = i; j < i + size; j++) {
                    if (nums[j] == max) count++;
                    if (count >= k) {
                        map.merge(max, 1, Integer::sum);
                        break;
                    }
                }
            }
        }
        return map.get(max) == null? 0 : map.get(max);
    }

}
