/*
 * @lc app=leetcode.cn id=868 lang=java
 *
 * [868] 二进制间距
 */

// @lc code=start
/**
 * 位运算
 * 循环、右移
 */
class Solution {
    public int binaryGap(int n) {
        int last = -1, ans = 0;
        for (int i = 0; n != 0; i++) {
            if ((n & 1) == 1) { // n 和 1 做与运算，可以判断 n 的最低为是否为 1
                if (last != -1) {
                    ans = Math.max(ans, i - last); // 更新结果
                }
                last = i;
            }
            n >>= 1; // n 不断右移
        }
        return ans;
    }
}
// @lc code=end

