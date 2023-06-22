package com.yushchenkoaleksey.edu.leetcode.hard.twopointers;

public class LargestRectangleArea {
    public static void main(String[] args) {
        var res = new LargestRectangleArea().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3});
        System.out.println(res);
        res = new LargestRectangleArea().largestRectangleArea(new int[]{2, 4});
        System.out.println(res);
        res = new LargestRectangleArea().largestRectangleArea(new int[]{4, 4, 5, 6, 2, 3});
        System.out.println(res);
    }

    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        for (int i = 0; i < heights.length - 1; i++) {
            var square = Math.min(heights[i], heights[i + 1]);
            var squareArea = square  * 2;
            if (maxArea < squareArea) maxArea = squareArea;
        }
        return maxArea;
    }
}
