package com.yushchenkoaleksey.edu.leetcode.easy;

public class majorityElement {

    //    Boyer-Moore Voting Algorithm shows an element that appears more than n/2 times.
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        System.out.println(count);
        return candidate;

    }
}
