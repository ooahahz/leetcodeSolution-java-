/*
 * @lc app=leetcode.cn id=2038 lang=java
 *
 * [2038] 如果相邻两个颜色均相同则删除当前颜色
 */

// @lc code=start
class Solution {
    public boolean winnerOfGame(String colors) {
        char[] cs = colors.toCharArray();
        int n = cs.length;
        int a = 0, b = 0;
        for (int i = 1; i < n - 1; i++) {
            if (cs[i] == 'A' && cs[i-1] == 'A' && cs[i+1] == 'A') {
                a++;
            }
            if ( cs[i] == 'B' && cs[i-1] == 'B' && cs[i+1] == 'B') {
                b++;
            }
        }
        return a > b;

    }
}
// @lc code=end

