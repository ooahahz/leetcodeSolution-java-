/*
 * @lc app=leetcode.cn id=507 lang=java
 *
 * [507] 完美数
 */

// @lc code=start
class Solution {
    public static boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int sum = 1;
        for (int d = 2; d * d <= num; d++) {
            if (num % d == 0) {
                sum += d;
                if (d * d < num) {
                    sum += num / d;
                }
            }
            // if (sum > num) {
            //     return false;
            // }
        }
        return sum == num;
    }

    // public static void main(String[] args) {
    //    int num = 8128; 
    //    System.out.println(checkPerfectNumber(num));
    // }
}
// @lc code=end

