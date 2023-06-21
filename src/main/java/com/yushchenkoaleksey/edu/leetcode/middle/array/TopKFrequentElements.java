package com.yushchenkoaleksey.edu.leetcode.middle.array;

import java.util.ArrayList;
import java.util.List;

public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) return nums;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (var n : nums) {
            if (n < min) min = n;
            if (max < n) max = n;
        }
        int[] c = new int[max - min + 1];
        for (int n : nums) {
            c[n - min]++;
        }

        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        var maxFreq = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] > 0) {
                if (bucket[c[i]] == null) bucket[c[i]] = new ArrayList<>();
                bucket[c[i]].add(i + min);
                if (maxFreq < c[i]) maxFreq = c[i];
            }
        }
        int[] res = new int[k];
        int currentIndex = 0;
        for (int i = maxFreq; i >= 0 && currentIndex < k; i--) {
            if (bucket[i] != null){
                for(var n : bucket[i]){
                    res[currentIndex++] = n;
                    if (currentIndex == k) break;
                }
            }
        }
        return res;
    }
}
