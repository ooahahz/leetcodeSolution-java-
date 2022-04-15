/*
 * @lc app=leetcode.cn id=796 lang=java
 *
 * [796] 旋转字符串
 */

// @lc code=start
class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s+s).contains(goal);
    }
    // public boolean rotateString(String s, String goal) {
    //     int m = s.length(), n = goal.length();
    //     if (m != n) {
    //         return false;
    //     }
    //     for (int i = 0; i < n; i++) {
    //         boolean flag = true;
    //         for (int j = 0; j < n; j++) {
    //             if (s.charAt((i + j) % n) != goal.charAt(j)) {
    //                 flag = false;
    //                 break;
    //             }
    //         }
    //         if (flag) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }
}
// @lc code=end

