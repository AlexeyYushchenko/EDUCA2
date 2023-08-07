package com.yushchenkoaleksey.edu.leetcode.easy.twopointers;

//https://leetcode.com/problems/number-of-arithmetic-triplets/
public class arithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int uniqueTriplets = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            while (nums[j] - nums[i] < diff && j < nums.length - 1 && j < nums[i] + diff) j++;
            if (j == nums.length - 1 || nums[j] != nums[i] + diff) continue;
            int k = j + 1;
            while (nums[k] - nums[j] < diff && k < nums.length - 1 && k < nums[j] + diff) k++;
            if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) uniqueTriplets++;
        }
        return uniqueTriplets;
    }

    public int arithmeticTriplets2(int[] nums, int diff) {
        final int[] firstFreq = new int[6];
        final int[] secondFreq = new int[6];
        int answer = 0;
        for(final int i: nums) {
            if (i - diff >= 0) {
                answer += secondFreq[i - diff];
                secondFreq[i] += firstFreq[i - diff];
            }
            firstFreq[i] += 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        var arithmeticTriplets = new arithmeticTriplets();
        System.out.println(arithmeticTriplets.arithmeticTriplets2(new int[]{0,1,2,3,4,5}, 2));
        System.out.println(arithmeticTriplets.arithmeticTriplets2(new int[]{0,1,4,6,7,10}, 3));
        System.out.println(arithmeticTriplets.arithmeticTriplets2(new int[]{4,5,6,7,8,9}, 2));
        System.out.println(arithmeticTriplets.arithmeticTriplets2(new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,92,93,94,95,96,97,98,99,100}, 10));
    }
}
