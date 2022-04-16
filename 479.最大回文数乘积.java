/*
 * @lc app=leetcode.cn id=479 lang=java
 *
 * [479] 最大回文数乘积
 */

// @lc code=start
/**
 * 两个n位整数的乘积最多是2n位数，从10^n-1开始枚举左半部分
 * 从大到小枚举回文数，可以先确定回文数的左半部分
 * 左半部分确定了，右半部分也随之确定了
 * 合并左右两部分，即可得到回文数p
 * 从10^n-1开始循环递减x,判断x,p/x是否是 p的因子
 * 只需要递减到 sqrt(p) 即可
 */
class Solution {
    public int largestPalindrome(int n) {
        if (n == 1) {
            return 9;
        }
        int upper = (int) Math.pow(10, n) - 1;
        int ans = 0;
        for (int left = upper; ans == 0; left--) {
            long p = left;
            for (int x = left; x > 0; x /= 10) {
                p = p * 10 + x % 10; // 翻转左半部分，得到回文数p
            }
            for (long x = upper; x * x >= p; x--) {
                if (p % x == 0) {
                    ans = (int)(p % 1337);
                    break;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

