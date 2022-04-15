/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {
    // public int countSubstrings(String s) {
    //     // 动态规划法
    //     boolean[][] dp = new boolean[s.length()][s.length()];
    //     int ans = 0;

    //     for (int j = 0; j < s.length(); j++) {
    //         for (int i = 0; i <= j; i++) {
    //             if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
    //                 dp[i][j] = true;
    //                 ans++;
    //             }
    //         }
    //     }
    //     return ans;
    // }
    public int countSubstrings(String s) {// 选取一个或两个char作为中心,两个指针向外扩展
        int ans = 0;
        for (int center = 0; center < 2 * s.length() - 1; center++) {
            int left = center / 2;
            int right = center % 2 == 1 ? left + 1: left;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                ans++;
                left--;
                right++;
            }
        }
        return ans;
    }
}
// @lc code=end

