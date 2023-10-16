package Java;

/*
 * @lc app=leetcode.cn id=905 lang=java
 *
 * [905] 按奇偶排序数组
 */
/**
 * 时间复杂度：O(n)
 * 空间复杂度：O(1)
 */
// @lc code=start
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0, end = nums.length - 1;
        while(start < end){
            if(nums[start] % 2 == 1){
                while(end > start && nums[end] % 2 == 1) end--;
                int tmp = nums[start];
                nums[start] = nums[end];
                nums[end] = tmp;
            }
            start++;
        }
        return nums;
    }
}
// @lc code=end

