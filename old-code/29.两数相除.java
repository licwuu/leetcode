package Java;

/*
 * @lc app=leetcode.cn id=29 lang=java
 *
 * [29] 两数相除
 */

// @lc code=start
class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        return dividend / divisor;
    }
}
// @lc code=end

