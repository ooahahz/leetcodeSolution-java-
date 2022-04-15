/*
 * @lc app=leetcode.cn id=73 lang=java
 *
 * [73] 矩阵置零
 */

// @lc code=start
class Solution {
    // public void setZeroes(int[][] matrix) {
    //     boolean[] row = new boolean[matrix.length];
    //     boolean[] col = new boolean[matrix[0].length];
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             if (matrix[i][j] == 0) {
    //                 row[i] = col[j] = true;
    //             }
    //         }
    //     }

    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[0].length; j++) {
    //             if (row[i] || col[j]) {
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }

    // }
    public void setZeroes(int[][] matrix) {

        int m = matrix.length, n = matrix[0].length;
        boolean flagCol0 = false, flagRow0 = false;

        for (int i = 0; i < m; i++) { // 遍历矩阵的第一列
            if (matrix[i][0] == 0) {// 
                flagCol0 = true; // 如果第一列有元素 0, 那么把列标记为 true
            }
        }

        for (int j = 0; j < n; j++) { // 遍历矩阵的第一行
            if (matrix[0][j] == 0) {
                flagRow0 = true; // 如果第一行有元素 0，那么把行标记为 true
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) { // 从第二行第二列开始，如果某个元素为 0，把这一行第一列和这一列第一行的元素更新为 0，为下一步把这一行全部更新为 0 做预先准备
                if (matrix[i][j] == 0) { // 因为之前已经记录下来了第一行和第一列是否有 0 的情况，这一步不影响之后的操作
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0; // 如果第一列某一行有元素 0，把这一行元素全部更新为 0；如果第一行某一列有元素 0，把这一列元素全部更新为 0.
                    // 
                }
            }
        }

        if (flagCol0) { // 如果第一列有元素 0，把第一列全部更新为 0
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

        if (flagRow0) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
// @lc code=end

