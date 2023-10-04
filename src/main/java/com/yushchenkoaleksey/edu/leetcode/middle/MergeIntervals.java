package com.yushchenkoaleksey.edu.leetcode.middle;

import java.util.*;

//https://leetcode.com/problems/merge-intervals/?envType=study-plan-v2&envId=top-interview-150
//56. Merge Intervals
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {

        //[[1,3],[2,6],[4,9],[8,10],[15,18]]
        //min =1 max= 15
        //
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < intervals.length; i++) {
            min = Math.min(intervals[i][0], min);
            max = Math.max(intervals[i][0], max);
        }
        //[[1,3],[2,6],[4,9],[8,10],[15,18]]
        int[] range = new int[max - min + 1];
        //System.out.println(Arrays.toString(range));
        for (int i = 0; i < intervals.length; i++) {
            range[intervals[i][0] - min] = Math.max(intervals[i][1] - min, range[intervals[i][0] - min]);
        }
        //  System.out.println(Arrays.toString(range));

        int start = 0, end = 0;
        LinkedList<int[]> result = new LinkedList<>();
        for (int i = 0; i < range.length; i++) {
            if (range[i] == 0) {
                // this mean that interval with this rage[i] start value not exist
                continue;
            }
            if (i <= end) {
                end = Math.max(range[i], end);//7,7,8,8,8,9
            } else {
                result.add(new int[]{start + min, end + min});
                start = i;
                end = range[i];
            }
        }

        result.add(new int[]{start + min, end + min});
        return result.toArray(new int[result.size()][]);
    }

    //12% SLOW
    public int[][] merge2(int[][] intervals) {
        if (intervals[0].length < 1) return new int[0][0];
        if (intervals.length == 1) return intervals;

        Arrays.sort(intervals, Comparator.comparing(x -> x[0]));
        int idx = 0;
        int[] current = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= current[current.length - 1]) {
                current[0] = Math.min(intervals[i][0], current[0]);
                current[current.length - 1] = Math.max(intervals[i][intervals[i].length - 1], current[current.length - 1]);
            } else {
                intervals[idx++] = current;
                current = intervals[i];
            }
            if (i == intervals.length - 1) intervals[idx++] = current;
        }
//        System.out.println(Arrays.deepToString(intervals));
        var res = Arrays.copyOfRange(intervals, 0, idx);
//        System.out.println("res");
//        System.out.println(Arrays.deepToString(res));
        return res;
    }

//        List<List<Integer>> res = new ArrayList<>();
//        for (int i = 0; i < intervals.length; i++) {
//            if (i  == intervals.length - 1) {
//                res.add(new ArrayList<>(Arrays.asList(intervals[i][0], intervals[i][intervals[i].length - 1])));
//            }else if (intervals[i][intervals[i].length - 1] >= intervals[i + 1][0]) {
//                res.add(new ArrayList<>(Arrays.asList(intervals[i][0], intervals[i + 1][intervals[i + 1].length - 1])));
//                i++;
//            }else {
//                res.add(new ArrayList<>(Arrays.asList(intervals[i][0], intervals[i][intervals[i].length - 1])));
//            }
//        }
//        System.out.println(res);
//        return res.stream().map(
//                        innerArray -> innerArray.stream()
//                                .mapToInt(Integer::intValue)
//                                .toArray())
//                .toArray(int[][]::new);
//    }
}