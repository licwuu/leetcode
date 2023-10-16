package Java;

/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1)
            return true;
        int dp =  nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(dp == 0){
                return false;
            }
            dp = Math.max(dp - 1, nums[i]);
        }
        return true;
    }
}
// @lc code=end

