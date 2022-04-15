/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 */

// @lc code=start
class Solution {
    // 阶乘尾零的个数即为因子 10 的个数，10 = 2 * 5 ,2 的倍数多于 5 的
    // 倍数，因此问题转化为只用考虑 5 的个数问题
    // 首先统计 5 的倍数有哪些，在统计每个 5 的倍数中有多少个 5
    // public int trailingZeroes(int n) {
    //     int ans = 0;
    //     for (int i = 5; i <=n; i+=5) {
    //         for (int x = i; x % 5 == 0; x /=5) {
    //             ans++;
    //         }
    //     }
    //     return ans;
    // }

    public int trailingZeroes(int n) {
        int ans = 0;
        while (n != 0) {
            n /= 5;
            ans += n;
        }
        return ans;
    }
}
// @lc code=end

