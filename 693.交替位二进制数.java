/*
 * @lc app=leetcode.cn id=693 lang=java
 *
 * [693] 交替位二进制数
 */

// @lc code=start
class Solution {
    // Solution1 : 位运算
    // public boolean hasAlternatingBits(int n) {
    //     int m = n ^ (n >> 1);
    //     return (m & (m + 1)) == 0;
    // }

    // Solution2 : 模拟 左移(/2)
    public boolean hasAlternatingBits(int n) {
        int prev = 3; // prev 初始不取 1 or 0 都可
        while (n != 0) {
            int cur = n % 2;
            if (cur == prev) {
                return false;
            }
            prev = cur;
            n = n / 2; // 不断左移
        }
        return true;
    }
}
// @lc code=end

