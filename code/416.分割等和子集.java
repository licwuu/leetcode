/**
 * 01背包问题
 */
package Java.动态规划.背包问题;

/*
 * @lc app=leetcode.cn id=416 lang=java
 *
 * [416] 分割等和子集
 */

// @lc code=start
class Solution {
    public boolean canPartition(int[] nums) {
        if(nums.length < 2) 
            return false;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if(sum % 2 == 1) return false;
        int target = sum /2 ;
        int[] f = new int[target + 1];
        for(int i = 0; i < nums.length; i++ ){
            for(int j = target; j >= nums[i]; j--){
                f[j] = Math.max(f[j], f[j - nums[i]] + nums[i]);
            }
        }
        return f[target] == target;
    }
}
// @lc code=end

