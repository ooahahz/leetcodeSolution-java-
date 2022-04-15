import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=145 lang=java
 *
 * [145] 二叉树的后序遍历
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
    // Solution 1: 递归
    // public List<Integer> postorderTraversal(TreeNode root) {
    //     List<Integer> res = new ArrayList<>();
    //     lastOrder(root, res);
    //     return res;
    // }
    // private void lastOrder(TreeNode root, List<Integer> res) {
    //     if (root == null) {
    //         return;
    //     }
    //     lastOrder(root.left, res);
    //     lastOrder(root.right, res);
    //     res.add(root.val);
    // }

    // Solution 2 : 迭代，维护栈
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root != null) {
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            s1.push(root);
            while(!s1.isEmpty()) {
                root = s1.pop();
                s2.push(root);
                if (root.left != null) {
                    s1.push(root.left);
                }
                if (root.right != null) {
                    s1.push(root.right);
                }
            }
            while (!s2.isEmpty()) {
                res.add(s2.pop().val);
            }
        }
        return res;

    }
}
// @lc code=end

