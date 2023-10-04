package com.yushchenkoaleksey.edu.leetcode.middle.array;

//55. Jump Game
//https://leetcode.com/problems/jump-game/

public class Jump {
    public boolean canJump(int[] nums) {
        if (nums.length < 2) return true;
        if (nums[0] == 0) return false;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) return false;
            max = Math.max(max, i + nums[i]);
            if (max >= nums.length - 1) return true;
        }
        return false;
    }
}
