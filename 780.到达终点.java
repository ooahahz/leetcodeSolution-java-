/*
 * @lc app=leetcode.cn id=780 lang=java
 *
 * [780] 到达终点
 */

// @lc code=start
class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        while (tx > sx && ty > sy && tx != ty) {
            if (tx > ty) {
                tx = tx % ty;
            } else {
                ty = ty % tx;
            }
        }

        if (tx == sx && ty == sy) {
            return true;
        } else if (tx == sx) {
            return ty > sy && (ty - sy) % sx == 0;
        } else if (ty == sy) {
            return tx > sx && (tx -sx) % sy == 0;
        } else {
            return false;
        }
    }
}
// @lc code=end

