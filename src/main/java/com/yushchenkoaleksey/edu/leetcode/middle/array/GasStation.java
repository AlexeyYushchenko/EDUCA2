package com.yushchenkoaleksey.edu.leetcode.middle.array;

import java.util.*;

//134. Gas Station
//https://leetcode.com/problems/gas-station/?envType=study-plan-v2&envId=top-interview-150
public class GasStation {

    //Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
    //Output: 3
    //Explanation:
    //Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
    //Travel to station 4. Your tank = 4 - 1 + 5 = 8
    //Travel to station 0. Your tank = 8 - 2 + 1 = 7
    //Travel to station 1. Your tank = 7 - 3 + 2 = 6
    //Travel to station 2. Your tank = 6 - 4 + 3 = 5
    //Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
    //Therefore, return 3 as the starting index.
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalFuel = 0;
        int totalCosts = 0;
        List<Integer> list = new ArrayList<>();
        double bestRatio = Double.MIN_VALUE;
        double ratio = 0;
        for (int i = 0; i < gas.length; i++) {
            if (gas[i] == cost[i]) continue;
            totalFuel += gas[i];
            totalCosts += cost[i];
            if ((ratio = (double) gas[i] / cost[i]) > bestRatio){
                bestRatio = ratio;
                list.add(0, i);
            }else {
                list.add(i);
            }
        }
        if (totalCosts > totalFuel) return -1;
        if (list.isEmpty()) return 0;

        for (int i = 0; i < list.size(); i++) {
            int initial = list.get(i);
            int j = initial;
            int fuel = 0;
            while (fuel >= 0) {
                fuel += gas[j];
                fuel -= cost[j];
                if (fuel < 0) break;
                j = ++j % cost.length;
                while (gas[j] == cost[j] && j != initial) j = ++j % cost.length;
                if (j == initial) return initial;
            }
        }

//        for (int i = listOfBestRatios.size() - 1; i >= 0; i--) {
//            int initialPosition = listOfBestRatios.get(i);
//            int j = initialPosition;
//            int fuel = 0;
//            while (fuel >= 0) {
//                fuel += gas[j];
//                fuel -= cost[j];
//                if (fuel < 0) break;
//                j = ++j % cost.length;
//                while (gas[j] == cost[j] && j != i) j = ++j % cost.length;
//                if (j == i) return i;
//            }
//        }
        return -1;
    }

}
