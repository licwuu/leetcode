package Java;

/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0], sum = 0;
        for (int num : nums) {
            sum += num;
            ans = Math.max(ans, sum);
            sum = Math.max(0, sum);
        }
        return ans;
    }
}
// @lc code=end

