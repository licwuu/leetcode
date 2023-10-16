package Java;

import Java.helpClass.TreeNode;

/*
 * @lc app=leetcode.cn id=108 lang=java
 *
 * [108] 将有序数组转换为二叉搜索树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void sortedArrayToBSTHelper(int[] nums, int start, int end, TreeNode node){
        int m = (start + end)/2;
        node.val = nums[m];
        if(start < m){
            node.left = new TreeNode();
            sortedArrayToBSTHelper(nums, start, m, node.left);
        }
        if( m + 1 < end){
            node.right = new TreeNode();
            sortedArrayToBSTHelper(nums, m+1, end, node.right);
        }

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
        TreeNode node = new TreeNode();
        sortedArrayToBSTHelper(nums, 0, nums.length, node);
        return node;
    }
}
// @lc code=end

