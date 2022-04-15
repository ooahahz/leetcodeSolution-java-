/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        int ans = x ^ y; // 亦或运算 相同的运算结果为 0，不同的运算结果为 1 ,
        // 将二进制位不同的位置数目的问题转化为统计 1 的个数的问题
        int res = 0;
        while ( ans != 0) {
            res ++;
            ans = ans & (ans - 1); // a & (a - 1) 会将 a 最右侧的 1 变成 0
        }
        return res;
    }
}
// @lc code=end

