package Java;

import Java.helpClass.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
            return ans;
        List<Integer> levelList = new ArrayList<>();
        TreeNode tmp;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);//每层结束加入null作为标识
        while(!q.isEmpty()){
            tmp = q.remove();
            if(tmp != null){
                levelList.add(tmp.val);
                if(tmp.left != null){
                    q.add(tmp.left);
                }
                if(tmp.right != null){
                    q.add(tmp.right);
                }
            }else{
                if(!q.isEmpty()){
                    q.add(null);//每层结束加入null作为标识
                }
                ans.add(levelList);
                levelList = new ArrayList<>();
            }        
        }
        return ans;
    }
}
// @lc code=end

