import java.util.ArrayList;
import java.util.List;


/*
 * @lc app=leetcode.cn id=1305 lang=java
 *
 * [1305] 两棵二叉搜索树中的所有元素
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> nums1 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();
        inSort(root1, nums1);
        inSort(root2, nums2);

        List<Integer> nums = new ArrayList<>(); //这个数组存放最终返回的结果 
        int p1 = 0, p2 = 0; // 定义双指针

        while (true) {
            if (nums1.size() == p1) {
                nums.addAll(nums2.subList(p2, nums2.size()));
                break;
            } 
            if (nums2.size() == p2) {
                nums.addAll(nums1.subList(p1, nums1.size()));
                break;
            }
            if (nums1.get(p1) < nums2.get(p2)) {
                nums.add(nums1.get(p1++));
            } else {
                nums.add(nums2.get(p2++));
            }
        }
        return nums;
    }

    public void inSort(TreeNode root, List<Integer> nums) { // 二叉树的中序遍历
        if (root != null) {
            inSort(root.left, nums);
            nums.add(root.val);
            inSort(root.right, nums);
        }
    }
}
// @lc code=end

