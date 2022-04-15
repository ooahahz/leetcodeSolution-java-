/*
 * @lc app=leetcode.cn id=357 lang=java
 *
 * [357] 计算各个位数不同的数字个数
 */

// @lc code=start
class Solution {
    // public int countNumbersWithUniqueDigits(int n) {
    //     if (n == 0) {
    //         return 1;
    //     }
    //     if (n == 1) {
    //         return 10;
    //     }

    //     int res = 10, cur = 9;
    //     for (int i = 0; i < n - 1; i++) {
    //         cur = cur * (9 - i);
    //         res += cur;
    //     }
    //     return res;
    // }

    // Solution 2: 动态规划
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 10;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + (dp[i-1] - dp[i-2]) * (10 - i + 1);
        }
        return dp[n];
    }
}
// @lc code=end

