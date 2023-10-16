package Java.剑指offer;
/**
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * 
 * 示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3 
 * 
 * 限制：
 * 2 <= n <= 100000
 * 
 * 思路：
 * 因为所有数字都在 0～n-1 的范围内，遍历数组将数字x放在其数组下标x的位置
 * 如果数组下标x的地方已经为x，则数字重复，x即为答案
 * 时间复杂度：O(n)，因为一共只有n个数字每次交换将一个数字放在正确的位置，最多交换n次即可
 * 空间复杂度：O(1)
 */
class Solution {
    public int findRepeatNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] != i && nums[nums[i]] != nums[i]){
                int tmp = nums[i];
                nums[i] = nums[nums[i]];
                nums[tmp] = tmp;
            }
            if(nums[i] != i)return nums[i];
        }
        return -1;
    }
}
