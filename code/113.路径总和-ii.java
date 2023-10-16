import java.util.ArrayList;
import java.util.List;

import defaultClass.TreeNode;

/*
 * @lc app=leetcode.cn id=113 lang=java
 *
 * [113] 路径总和 II
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, targetSum, 0, path, res);
        return res;
    }

    private void dfs(TreeNode root, int targetSum, int pathSum,
            List<Integer> path, List<List<Integer>> res) {

        if (root == null) {
            return;
        }
        path.add(root.val);
        pathSum += root.val;
        if (root.left == null && root.right == null) {
            if (targetSum == pathSum) {
                res.add(new ArrayList<>(path));
            }
            path.remove(path.size() - 1);
            pathSum -= root.val;
            return;
        }
        if (root.left != null) {
            dfs(root.left, targetSum, pathSum, path, res);
        }
        if (root.right != null) {
            dfs(root.right, targetSum, pathSum, path, res);
        }
        path.remove(path.size() - 1);
        pathSum -= root.val;
    }

}
// @lc code=end

