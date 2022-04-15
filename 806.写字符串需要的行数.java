/*
 * @lc app=leetcode.cn id=806 lang=java
 *
 * [806] 写字符串需要的行数
 */

// @lc code=start
class Solution {
    public static final int MAX_WIDTH = 100;
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1; // lines 记录行数
        int width = 0;
        for (int i = 0; i < s.length(); i++) {
            int need = widths[s.charAt(i) - 'a']; // 得到第 i 个字母所占的单位 （本质上是一个哈希表）
            width += need; // 叠加当前行的单位
            if (width > MAX_WIDTH) { // 如果当前行的单位数大于 100，就要换行
                lines++; // 换行
                width = need; // width 记录换行后新的行的单位数，最后需要返回
            }
        }
        return new int[] { lines, width };
    }
}
// @lc code=end

