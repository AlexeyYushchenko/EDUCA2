package com.yushchenkoaleksey.edu.leetcode.middle.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {

    GasStation gasStation = new GasStation();
    @Test
    void canCompleteCircuit1() {
        //gas = [1,2,3,4,5], cost = [3,4,5,1,2]
        assertEquals(3, gasStation.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
    }

    @Test
    void canCompleteCircuit2() {
        //gas = [1,2,3,4,5], cost = [3,4,5,1,2]
        assertEquals(-1, gasStation.canCompleteCircuit(new int[]{0}, new int[]{1}));
    }
    @Test
    void canCompleteCircuit3() {
        //gas = [1,2,3,4,5], cost = [3,4,5,1,2]
        assertEquals(0, gasStation.canCompleteCircuit(new int[]{1}, new int[]{1}));
    }
    @Test
    void canCompleteCircuit4() {
        assertEquals(3, gasStation.canCompleteCircuit(new int[]{5,8,2,8}, new int[]{6,5,6,6}));
    }
    @Test
    void canCompleteCircuit5() {
        assertEquals(0, gasStation.canCompleteCircuit(new int[]{2}, new int[]{2}));
    }
    @Test
    void canCompleteCircuit6() {
        assertEquals(0, gasStation.canCompleteCircuit(new int[]{2, 2, 2, 0, 0, 0}, new int[]{0, 0, 0, 2, 2, 2}));
    }
}