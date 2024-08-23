package com.yushchenkoaleksey.edu.leetcode.middle.hashtable;

//https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/?envType=daily-question&envId=2023-09-11
//1282. Group the People Given the Group Size They Belong To

import java.util.ArrayList;
import java.util.List;

public class GroupThePeople {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] a = new boolean[groupSizes.length];
        for (int i = 0; i < groupSizes.length; i++) {
            fitIntoGroups(groupSizes, i, a, res);
        }
        return res;
    }

    private void fitIntoGroups(int[] groupSizes, int i, boolean[] a, List<List<Integer>> res) {
        if (!a[groupSizes[i]]) {
            List<Integer> group = new ArrayList<>();
            for (int j = i; j < groupSizes.length; j++) {
                if (groupSizes[i] == groupSizes[j]) {
                    group.add(j);
                    if (group.size() == groupSizes[i]) {
                        res.add(group);
                        group = new ArrayList<>();
                    }
                }
            }
            a[groupSizes[i]] = true;
        }
    }
}
