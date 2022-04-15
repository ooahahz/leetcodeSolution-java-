/*
 * @lc app=leetcode.cn id=661 lang=java
 *
 * [661] 图片平滑器
 */

// @lc code=start
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length, n = img[0].length; // m为矩阵的行，n为矩阵的列
        int[][] ret = new int[m][n];
        for (int i = 0; i < m; i++) { // 两个 for 循环遍历矩阵的每一个元素
            for (int j = 0; j < n; j++) {
                int num = 0, sum = 0;
                for (int x = i - 1; x <= i + 1; x++) { // 得到每个元素的前、后、上、下元素
                    for (int y = j - 1; y <= j + 1; y++) {
                        if (x >= 0 && x < m && y >= 0 && y < n) { // if 判断边界情况
                            num++; // 统计四周元素个数
                            sum+=img[x][y];
                        }    
                    }
                }
                ret[i][j] = sum / num;
            }
        }
        return ret;
    }
}
// @lc code=end

