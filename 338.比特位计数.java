/*
 * @lc app=leetcode.cn id=338 lang=java
 *
 * [338] 比特位计数
 */

// @lc code=start
class Solution {
    // public int[] countBits(int n) {
    //     int[] ans = new int[n+1];
    //     for (int i = 0; i <=n; i++) {
    //         ans[i] = countOnes(i);
    //     }
    //     return ans;

    // }

    // private int countOnes(int x) {// Brian Kernighan算法
    //     int cnt = 0; 
    //     while (x != 0) {
    //         x = x & (x - 1); // 这个运算把二进制表示的最后一个1变成0
    //         cnt++;
    //     }
    //     return cnt;
    // }
    // Solution2:动态规划-最高有效位
    // public int[] countBits(int n) {
    //     int[] bits = new int[n+1];
    //     int highBit = 0;
    //     for (int i = 1; i <= n; i++) {
    //         if ((i & (i-1)) == 0) {
    //             highBit = i;
    //         }
    //         bits[i] = bits[i-highBit] + 1;
    //     }
    //     return bits;
    // }

    // Solution3:动态规划-最低有效位
    // public int[] countBits(int n) {
    //     int[] bits  = new int[n+1];
    //     for (int i = 1; i <= n; i++) { // Tips: 偶数的最低位为0，奇数的最低位为1
    //         bits[i] = bits[ i>>1 ] + (i&1);// 把奇偶两种情况合并  记住：i&1得到i/2后的余数
    //     }
    //     return bits;
    // }

    // Solution4:动态规划-最低设置位
    public int[] countBits(int n) {
        int[] bits = new int[n+1];
        for (int i = 1; i <= n; i++) {
            bits[i] = bits[i&(i-1)] + 1;
        }
        return bits;
    }
}
// @lc code=end

