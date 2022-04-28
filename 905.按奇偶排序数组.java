/*
 * @lc app=leetcode.cn id=905 lang=java
 *
 * [905] 按奇偶排序数组
 * 双指针
 * 开辟一个数组空间
 * 遍历原数组，遇到偶数移动左指针，遇到奇数移动右指针，直至遍历完数组
 */

// @lc code=start
class Solution {
    int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0, right = n - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                res[left++] = num;
            } else {
                res[right--] = num;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = { 4, 3, 5, 9, 8, 7 };
        int[] res = solution.sortArrayByParity(nums);
        for (int num : res) {
            System.out.println(num);
        }
        

    }
    
}
// @lc code=end

