import java.util.Deque;
import java.util.LinkedList;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
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
// Solution 1 
// class Solution { // DFS
//     public int minDepth(TreeNode root) {
//         if (root == null) {
//             return 0;
//         }
//         if (root.left == null && root.right == null) {
//             return 1;
//         }
//         int mindep = Integer.MAX_VALUE;

//         if (root.left != null) {
//             mindep = Math.min(minDepth(root.left), mindep);
//         }
//         if (root.right != null) {
//             mindep = Math.min(minDepth(root.right), mindep);
//         }
//         return mindep + 1;

//     }
// }

// Solution 2 DFS
// class Solution {
//     public int minDepth(TreeNode root) {
//         if (root == null) {
//             return 0;
//         }
//         int left = minDepth(root.left);
//         int right = minDepth(root.right);
//         return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
//     }
// }

// Solution 3 广度优先搜索
class Solution {
    public int minDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
            Deque<TreeNode> deque = new LinkedList<>();
            deque.offer(root);
            int level = 1;
            while (!deque.isEmpty()) {
                int size = deque.size();
                for (int i = 0; i < size; i++) {
                    TreeNode cur = deque.poll();
                    if (cur.right == null && cur.left == null) {
                        return level;
                    }
                    if (cur.left != null) {
                        deque.offer(cur.left);
                    }
                    if (cur.right != null) {
                        deque.offer(cur.right);
                    }
                }
                level++;
            }
            return level;
        }
    }

// @lc code=end

