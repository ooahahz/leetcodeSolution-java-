/*
 * @lc app=leetcode.cn id=2028 lang=java
 *
 * [2028] 找出缺失的观测数据
 */

// @lc code=start
class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] res = new int[n];
        int m = rolls.length;
        int totalsum = mean * (n + m);
        int tol = 0;
        for (int i = 0; i < m; i++) {
            tol+=rolls[i];
        }
        int sub = totalsum - tol;
        int ave = sub / n;
        int remainder = sub % n;
        if (sub < n || sub > 6 * n) {// 总和减和的余数太小了，不够 n 个去分，另外一方面太大了，每个分六点都不够
            return new int[0];
        }
        for (int i = 0; i < n; i++) {
            res[i] = ave + (i < remainder? 1 : 0 );
        }
        return res;
    }
}
// @lc code=end

