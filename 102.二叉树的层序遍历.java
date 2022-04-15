import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

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

        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        // 根节点入队
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int currentLevelSize= queue.size();

            for (int i = 0; i < currentLevelSize; i++) {
                // 节点出队
                TreeNode node = queue.remove();
                // 节点的左子树入队
                if (node.left != null) {
                    queue.add(node.left);
                }
                // 节点的右子树入队
                if (node.right != null) {
                    queue.add(node.right);
                }
                level.add(node.val);
            }
            res.add(level);
        } 
        return res;
    }
}
// @lc code=end

