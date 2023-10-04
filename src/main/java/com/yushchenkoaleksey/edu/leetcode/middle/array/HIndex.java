package com.yushchenkoaleksey.edu.leetcode.middle.array;

//274. H index
//https://leetcode.com/problems/h-index/?envType=study-plan-v2&envId=top-interview-150

public class HIndex {
    public int hIndex(int[] citations) {
        var countArray = new int[citations.length + 1];
        for (int n : citations) {
            if (n >= citations.length) {
                countArray[citations.length]++;
            } else {
                countArray[n]++;
            }
        }

        int points = 0;
        for (int i = citations.length; i >= 0; i--) {
            points += countArray[i];
            if (points >= i) {
                return i;
            }
        }

        return 0;
    }


}
