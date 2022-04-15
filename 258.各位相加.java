/*
 * @lc app=leetcode.cn id=258 lang=java
 *
 * [258] 各位相加
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        if (num / 10 == 0) {
            return num;
        }
        return addDigits(sum(num));
    }
    private int sum(int num) {
        int tol = 0;
        while (num != 0) {
            tol += num % 10;
            num /= 10;
        }
        return tol;
    }
}
// @lc code=end

