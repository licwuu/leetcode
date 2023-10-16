package Java;

import Java.helpClass.TreeNode;


/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        if((root.left != null && root.left.val >= root.val) ||
        (root.right != null && root.right.val <= root.val))
            return false;
        TreeNode left = root.left, rignt = root.right;
        while(left != null){
            if(left.val >= root.val)
                return false;
            left = left.right;
        }
        while(rignt != null){
            if(rignt.val <= root.val)
                return false;
            rignt = rignt.left;
        }
        return isValidBST(root.left) && isValidBST(root.right);
    }
}
// @lc code=end

