import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import javax.management.QueryEval;
import javax.swing.tree.TreeNode;

// import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=653 lang=java
 *
 * [653] 两数之和 IV - 输入 BST
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

// Solution 1: DFS + HashSet
// class Solution{
//     Set<Integer> set = new HashSet<>();

//     public boolean findTarget(TreeNode root, int k) {
//         if (root == null) {
//             return false;
//         }
//         if (set.contains(k-root.val)) {
//             return true;
//         }
//         set.add(root.val);

//         return findTarget(root.left, k) || findTarget(root.right, k);
//     }
// }

// Solution 2: 广度优先遍历 + HashSet
// class Solution {
//     public boolean findTarget(TreeNode root, int k) {
//         Set<Integer> set = new HashSet<>();
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root);
//         while (!queue.isEmpty()) {
//             TreeNode node = queue.poll();
//             if (set.contains(k-node.val)) {
//                 return true;
//             }
//             set.add(node.val);
//             if (node.left != null) {
//                 queue.offer(node.left);
//             }
//             if (node.right != null) {
//                 queue.offer(node.right);
//             }
//         }
//         return false;
//     }
// }

// 中序遍历 + 双指针
class Solution {
    List<Integer> list = new ArrayList<>();

    public boolean findTarget(TreeNode root, int k) {
        inOrderTraver(root);
        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (list.get(left) + list.get(right) == k) {
                return true;
            }
            if (list.get(left) + list.get(right) < k) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public void inOrderTraver(TreeNode node) {// 中序遍历二叉搜索树，升序结果存储在 list 里面，
        if (node == null) {
            return;
        }
        inOrderTraver(node.left);
        list.add(node.val);
        inOrderTraver(node.right);
    }
}
// @lc code=end

