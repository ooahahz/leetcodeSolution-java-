/*
 * @lc app=leetcode.cn id=739 lang=java
 *
 * [739] 每日温度
 */

// @lc code=start
class Solution {
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            int current = T[i];
            if (current < 100) {
                for (int j = i + 1; j < length; j++) {
                    if (T[j] > current) {
                        result[i] = j - i;
                        break;
                    }
                }
            }
        }
        return result;
    }

}
// @lc code=end

