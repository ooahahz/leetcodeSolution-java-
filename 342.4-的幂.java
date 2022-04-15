/*
 * @lc app=leetcode.cn id=342 lang=java
 *
 * [342] 4的幂
 */

// @lc code=start
class Solution { // lowbit 如果一个数 n 是 2 的幂，那么有 lowbit(n)=n, lowbit(n) = n & -n
    // public boolean isPowerOfFour(int n) {
    //     if (n <= 0) {
    //         return false;
    //     }
    //     int x = (int) Math.sqrt(n);
    //     return x * x == n && (x & -x) == x;
    //     // return x * x == n && (x & (x-1)) == 0;

    // }

    // public boolean isPowerOfFour(int n) {
    //     return n > 0 && (n & (n-1)) == 0 && (n & 0xaaaaaaaa) == 0;
    // }

    // public boolean isPowerOfFour(int n) {
    //     if (n <= 0) {
    //         return false;
    //     }
    //     while (n % 4 == 0) {
    //         n  4;
    //     }
    //     return n == 1;
    // }

    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n-1)) == 0 && n % 3 == 1;
    }
}
// @lc code=end

