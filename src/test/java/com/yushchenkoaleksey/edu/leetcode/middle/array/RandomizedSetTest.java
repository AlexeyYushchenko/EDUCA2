package com.yushchenkoaleksey.edu.leetcode.middle.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RandomizedSetTest {

    @Test
    void test1() {
        //Input
        //["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
        //[[], [1], [2], [2], [], [1], [2], []]
        //Output
        //[null, true, false, true, 2, true, false, 2]

        //RandomizedSet randomizedSet = new RandomizedSet();
        //randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        //randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
        //randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
        //randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
        //randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
        //randomizedSet.insert(2); // 2 was already in the set, so return false.
        //randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.
        RandomizedSet randomizedSet = new RandomizedSet();
        assertTrue(randomizedSet.insert(1));
        assertFalse(randomizedSet.remove(2));
        assertTrue(randomizedSet.insert(2));
        assertTrue(List.of(1, 2).contains(randomizedSet.getRandom()));
        assertTrue(randomizedSet.remove(1));
        assertFalse(randomizedSet.insert(2));
        assertTrue(List.of(2).contains(randomizedSet.getRandom()));
    }

    @Test
    void test2() {
        RandomizedSet randomizedSet = new RandomizedSet();
        assertTrue(randomizedSet.insert(-1));
        assertFalse(randomizedSet.remove(-2));
        assertTrue(randomizedSet.insert(-2));
        assertTrue(List.of(-1, -2).contains(randomizedSet.getRandom()));
        assertTrue(randomizedSet.remove(-1));
        assertFalse(randomizedSet.insert(-2));
        assertTrue(List.of(-2).contains(randomizedSet.getRandom()));
//        "RandomizedSet","insert","remove","insert","getRandom","remove","insert","getRandom";
    }

    @Test
    void test3() {
            //["RandomizedSet","insert","insert","remove","insert","remove","getRandom"]
            //[[],[0],[1],[0],[2],[1],[]]
            RandomizedSet randomizedSet = new RandomizedSet();
            assertTrue(randomizedSet.insert(0));
        assertTrue(randomizedSet.insert(1));
        assertTrue(randomizedSet.remove(0));
        assertTrue(randomizedSet.insert(2));
        assertTrue(randomizedSet.remove(1));
        assertTrue(List.of(2).contains(randomizedSet.getRandom()));
    }

    @Test
    void test4() {
        //["RandomizedSet","insert","insert","remove","insert","remove","getRandom"]
        //[[],[0],[1],[0],[2],[1],[]]
        RandomizedSet randomizedSet = new RandomizedSet();
        assertTrue(randomizedSet.insert(1));
        assertTrue(randomizedSet.insert(10));
        assertTrue(randomizedSet.insert(20));
        assertTrue(randomizedSet.insert(30));
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
        System.out.println(randomizedSet.getRandom());
    }

    @Test
    void test5() {
        //["RandomizedSet","remove","remove","insert","getRandom","remove","insert"]
        //[[],[0],[0],[0],[],[0],[0]]
        RandomizedSet randomizedSet = new RandomizedSet();
        assertFalse(randomizedSet.remove(0));
        assertFalse(randomizedSet.remove(0));
        assertTrue(randomizedSet.insert(0));
        assertTrue(List.of(0).contains(randomizedSet.getRandom()));
        assertTrue(randomizedSet.remove(0));
        assertTrue(randomizedSet.insert(0));
    }
}