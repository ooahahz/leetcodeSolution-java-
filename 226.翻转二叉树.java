import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
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
    // 从根节点开始，递归地对树进行遍历，从叶子节点开始翻转
    // 如果当前遍历到的节点 root 的左右两颗子树都已经翻转，
    // 那么我们只需要交换两颗子树的位置，既可以完成以 root
    // 为根节点的树的翻转
    public TreeNode invertTree(TreeNode root) {
        if (root == null) { // 递归终止条件
            return null;
        }
        TreeNode left = invertTree(root.left); // 左子树已经翻转
        TreeNode right = invertTree(root.right); // 右子树已经翻转
        root.left = right; // 交换两颗子树的位置
        root.right = left;
        return root;
    }
}
// @lc code=end

