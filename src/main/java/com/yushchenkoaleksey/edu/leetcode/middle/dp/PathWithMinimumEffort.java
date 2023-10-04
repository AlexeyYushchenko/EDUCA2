package com.yushchenkoaleksey.edu.leetcode.middle.dp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/path-with-minimum-effort/description/?envType=daily-question&envId=2023-09-02
//1631. Path With Minimum Effort

class Vertex {
    int y;
    int x;
    int height;
}

public class PathWithMinimumEffort {

    class Node {
        int y;
        int x;
        int height;

        private Node(int y, int x, int height) {
            this.y = y;
            this.x = x;
            this.height = height;
        }
    }

    private int[][] directions = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int minimumEffortPath(int[][] heights) {
        var dp = new int[heights.length][heights[0].length];
        for (var row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dp[0][0] = 0;

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a.height));
        priorityQueue.offer(new Node(0, 0, 0));

        while (!priorityQueue.isEmpty()) {
            var next = priorityQueue.poll();
            int y = next.y;
            int x = next.x;
            int height = next.height;

            if (height > dp[y][x]) continue;
            if (y == dp.length - 1 && x == dp[0].length - 1) return height;

            for (int i = 0; i < 4; i++) {
                int rr = y + directions[i][0];
                int rc = x + directions[i][1];
                if (rr < 0 || rr >= heights.length) continue;
                if (rc < 0 || rc >= heights[0].length) continue;
                int minEffort = Math.max(dp[y][x], Math.abs(heights[y][x] - heights[rr][rc]));
                if (minEffort < dp[rr][rc]) {
                    priorityQueue.add(new Node(rr, rc, minEffort));
                    dp[rr][rc] = minEffort;
                }
            }
        }

        return dp[dp.length - 1][dp[0].length - 1];
    }
}
