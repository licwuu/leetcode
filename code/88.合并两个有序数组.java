package Java;

/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pos1 = m - 1, pos2 = n - 1, pos = m + n - 1;
        while(pos1 >= 0 && pos2 >= 0){
            if(nums1[pos1] > nums2[pos2]){
                nums1[pos--] = nums1[pos1--];
            }else{
                nums1[pos--] = nums2[pos2--];
            }
        }
        while(pos2 >= 0){
            nums1[pos--] = nums2[pos2--];   
        }
    }
}
// @lc code=end

