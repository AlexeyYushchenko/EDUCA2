package com.yushchenkoaleksey.edu.leetcode.middle.array;

//45.Jump Game II
//https://leetcode.com/problems/jump-game-ii

//Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
public class JumpII {
    public int jump(int[] nums) {
        //2,3,1,1,4
        //[0, 0, 0, 0, 0]

        // 0, 1
        //[0, 0]

        // 2, 3, 0, 1, 4
        //[0, 1, 2, 2, 2]

        // 1, 2, 3
        //[1, 1, 0]

        //1, 2, 1, 1, 1
//        0, 1, 2, 2, 0


        //2, 0, 2, 0, 1
//        0, 1, 1, 0, 0
        int ans = 0;
        int maxRange = nums[0];
        int curr = 0;
        int end = 0;
        while(curr < nums.length-1){
            maxRange = Math.max(maxRange, curr+nums[curr]);
            if(curr == end){
                end = maxRange;
                ans++;
            }
            curr++;
        }
        return ans;
    }
}
