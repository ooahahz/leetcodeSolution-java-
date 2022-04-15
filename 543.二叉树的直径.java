/*
 * @lc app=leetcode.cn id=543 lang=java
 *
 * [543] 二叉树的直径
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
    int MaxDiameter = 0;

    // public int diameterOfBinaryTree(TreeNode root) {
    //     traverse(root);
    //     return MaxDiameter;
    // }

    // // 遍历二叉树 
    // void traverse(TreeNode root) {
    //     if (root == null) {
    //         return;
    //     }
    //     // 对每个节点计算直径
    //     int leftMax = maxDepth(root.left);
    //     int rightMax = maxDepth(root.right);
    //     int myDiameter = leftMax + rightMax;
    //     MaxDiameter = Math.max(myDiameter, MaxDiameter);

    //     traverse(root.left);
    //     traverse(root.right);
    // }

    // // 计算二叉树的最大深度
    // int maxDepth(TreeNode root) {
    //     if (root == null) {
    //         return 0;
    //     }
    //     int leftMax = maxDepth(root.left);
    //     int rightMax = maxDepth(root.right);
    //     return 1 + Math.max(leftMax, rightMax);
    // }

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return MaxDiameter;
    }

    int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        int myDiameter = leftMax + rightMax;
        MaxDiameter = Math.max(myDiameter, MaxDiameter);

        return 1 + Math.max(leftMax, rightMax);
    }
}
// @lc code=end

