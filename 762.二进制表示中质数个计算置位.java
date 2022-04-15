/*
 * @lc app=leetcode.cn id=762 lang=java
 *
 * [762] 二进制表示中质数个计算置位
 */

// @lc code=start
class Solution {
    public int countPrimeSetBits(int left, int right) {
        int con = 0;
        for (int i = left; i <= right; i++) {
            int cont = oneCount(i);
            if (isPrime(cont)) {
                con++;
            }
        }
        return con;
    }

    boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    int oneCount(int num) {
        int count = 0;
        while (num != 0) {
            num &= num - 1;
            count++;
        }
        return count;
    }
}
// @lc code=end

