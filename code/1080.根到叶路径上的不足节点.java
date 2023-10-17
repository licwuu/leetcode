import defaultClass.TreeNode;

/*
 * @lc app=leetcode.cn id=1080 lang=java
 *
 * [1080] 根到叶路径上的不足节点
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
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        boolean res = isInsufficent(root, limit, 0);
        return res ? null : root;

    }
    private boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
    private boolean isInsufficent(TreeNode root, int limit, int sum){
        sum += root.val;
        if(isLeaf(root)){
            return sum < limit;
        }
        boolean res = false;
        // 左右子树都存在
        if(root.left != null && root.right != null){
            boolean left = isInsufficent(root.left, limit, sum);
            if(left) root.left = null;
            boolean right = isInsufficent(root.right, limit, sum);
            if(right) root.right = null;
            res = left && right;
        }
        // 只存在左子树
        else if(root.left != null){
            boolean left = isInsufficent(root.left, limit, sum);
            if(left)
                root.left = null;
            res = left;
        }
        // 只存在右子树
        else if(root.right != null){
            boolean right = isInsufficent(root.right, limit, sum);
            if(right)
                root.right = null;
            res = right;
        }
        sum -= root.val;
        return res;
    }
}
// @lc code=end

