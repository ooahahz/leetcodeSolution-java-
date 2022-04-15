import java.util.HashMap;
import java.util.HashSet;

import javax.swing.tree.TreeNode;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode.cn id=236 lang=java
 *
 * [236] 二叉树的最近公共祖先
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     if (root == null) {
    //         return null;
    //     }
    //     // key 的父节点是 value
    //     HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
    //     parentMap.put(root, null);
    //     fillParentMap(root, parentMap);
    //     HashSet<TreeNode> pSet = new HashSet<>();
    //     TreeNode cur = p;
    //     pSet.add(cur);
    //     while (parentMap.get(cur) != null) {
    //         cur = parentMap.get(cur);
    //         pSet.add(cur);
    //     }
    //     cur = q;
    //     while (!pSet.contains(cur)) {
    //         cur = parentMap.get(cur);
    //     }
    //     return cur;
        
    // }

    // private static void fillParentMap(TreeNode root, HashMap<TreeNode, TreeNode> parentMap) {
    //     if (root.left != null) {
    //         parentMap.put(root.left, root);
    //         fillParentMap(root.left, parentMap);
    //     }
    //     if (root.right != null) {
    //         parentMap.put(root.right, root);
    //         fillParentMap(root.right, parentMap);
    //     }
    // }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;

    }
}
// @lc code=end

