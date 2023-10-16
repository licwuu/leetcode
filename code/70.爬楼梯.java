package Java;

/*
 * @lc app=leetcode.cn id=70 lang=java
 *
 * [70] 爬楼梯
 */

// @lc code=start
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[46];
        
        for (int i = 0; i < dp.length; i++) {
            if(i <= 2){
                dp[i] = i;
            }else{
                dp[i] = dp[i-1] + dp[i - 2];
            }
        }
        return dp[n];
    }
}
// @lc code=end

