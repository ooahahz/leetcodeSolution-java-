/*
 * @lc app=leetcode.cn id=744 lang=java
 *
 * [744] 寻找比目标字母大的最小字母
 */

// @lc code=start
class Solution {
    // // 线性查找
    // public char nextGreatestLetter(char[] letters, char target) {
    //     int len = letters.length;
    //     char ans = letters[0];
    //     for (int i = 0; i < len; i++) {
    //         if (letters[i] > target) {
    //             ans = letters[i];
    //             break;
    //         }
    //     }
    //     return ans;
    // }
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        if (target >= letters[len - 1]) {
            return letters[0];
        }

        int left = 0, right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            // int mid = left + right >> 1;
            if (letters[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return letters[left];
    }
}
// @lc code=end

