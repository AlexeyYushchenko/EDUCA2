package com.yushchenkoaleksey.edu.leetcode.middle.array.hashtable;

import com.yushchenkoaleksey.edu.leetcode.middle.hashtable.GroupThePeople;
import org.junit.jupiter.api.Test;

class GroupThePeopleTest {
    GroupThePeople groupThePeople = new GroupThePeople();
    @Test
    void groupThePeople1() {
        int[] groupSizes  = new int[]{3,3,3,3,3,1,3};
        System.out.println(groupThePeople.groupThePeople(groupSizes));
    }

    @Test
    void groupThePeople2() {
        int[] groupSizes  = new int[]{2,1,3,3,3,2};
        System.out.println(groupThePeople.groupThePeople(groupSizes));
    }
}