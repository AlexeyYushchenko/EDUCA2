package com.yushchenkoaleksey.edu.leetcode.middle.heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

//373. Find K Pairs with Smallest Sums
//https://leetcode.com/problems/find-k-pairs-with-smallest-sums/?envType=study-plan-v2&envId=top-interview-150

public class KSmallestPairs {

    class Pair implements Comparable<Pair>{
        int val1;
        int val2;

        private Pair(){}

        public Pair(int val1, int val2) {
            this.val1 = val1;
            this.val2 = val2;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(val1 + val2, o.val1 + o.val2);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "val1=" + val1 +
                    ", val2=" + val2 +
                    '}';
        }
    }

    public static void main(String[] args) {
        KSmallestPairs kSmallestPairs = new KSmallestPairs();
        System.out.println(kSmallestPairs.kSmallestPairs(new int[]{1,7,11}, new int[]{2,4,6}, 3));
        System.out.println(kSmallestPairs.kSmallestPairs(new int[]{1,1,2}, new int[]{1,2,3}, 2));
        System.out.println(kSmallestPairs.kSmallestPairs(new int[]{1,2,4,5,6}, new int[]{3,5,7,9}, 3));
    }
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        res.add(Arrays.asList(nums1[i], nums2[j]));
        return res;
    }
}