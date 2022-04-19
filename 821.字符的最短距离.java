/*
 * @lc app=leetcode.cn id=821 lang=java
 * 
 * [821] 字符的最短距离
 */

// @lc code=start
class Solution {  
    // 正向循环遍历一次，记录目标的索引，作差
    // 再逆向循环一次，取最小值，更新数组
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        for (int i = 0, index = -n; i < n; i++) {
            if (s.charAt(i) == c) {
                index = i;
            }
            ans[i] = i - index;
        }

        for (int i = n - 1, index = 2 * n; i >= 0; i--) {
            if (s.charAt(i) == c) {
                index = i;
            }
            ans[i] = Math.min(ans[i], index - i);
        }

        return ans;
    }
}
// @lc code=end

