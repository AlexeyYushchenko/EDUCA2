package com.yushchenkoaleksey.edu.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum ^= num;
        }
        return sum;
    }

    public int singleNumber2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            var num = nums[i];
            if (set.contains(num)){
                set.remove(num);
            }else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        int[] a = {4,1,2,1,2};
        System.out.println(singleNumber(a));
    }
}
