package com.yushchenkoaleksey.edu.leetcode.easy.intervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SummaryRanges {

    public static void main(String[] args) {
        SummaryRanges ranges = new SummaryRanges();
        System.out.println(ranges.summaryRanges(new int[]{0, 1, 2, 3, 5}));
        System.out.println(ranges.summaryRanges(new int[]{}));
        System.out.println(ranges.summaryRanges(new int[]{1, 3, 5}));
        System.out.println(ranges.summaryRanges(new int[]{1,2, 4, 5, 7,8}));

    }

    //0. 1. 2 .3 . 5
    public List<String> summaryRanges(int[] nums) {
        if (nums.length < 1)return Collections.emptyList();
        List<String> res = new ArrayList<>();
        int s = 0;
        int e = -1;
        int current = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (e == -1){
                s = i;
            }else {
                //e!= s
                if (current + 1 == nums[i]){
                }else if(s == e){
                    res.add(sb.append(nums[s]).toString());
                    sb.setLength(0);
                    s = i;
                }else{
                    res.add(sb.append(nums[s]).append("->").append(nums[e]).toString());
                    sb.setLength(0);
                    s = i;
                }
            }
            current = nums[i];
            e = i;
        }
        if (s == e){
            res.add(sb.append(nums[s]).toString());
        }else{
            res.add(sb.append(nums[s]).append("->").append(nums[e]).toString());
        }
        return res;
    }
}