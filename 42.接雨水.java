/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        // int n = height.length;
        // int res = 0;
        // for (int i = 1; i < n - 1; i++) {
        //     int lMax = 0, rMax = 0;
        //     // 找右边最高的柱子
        //     for (int j = i; j < n; j ++) {
        //         rMax = Math.max(rMax, height[j]);
        //     }
        //     // 找左边最高的柱子
        //     for (int j = i; j >= 0; j--) {
        //         lMax = Math.max(lMax, height[j]);
        //     }
        //     res += Math.min(rMax, lMax) - height[i];
        // }
        // return res;

        // 备忘录优化
        // if (height.length == 0) {
        //     return 0;
        // }
        // int n = height.length;
        // int res = 0;
        // // 数组充当备忘录
        // int[] lMax = new int[n];
        // int[] rMax = new int[n];
        // // 初始化 base case
        // lMax[0] = height[0];
        // rMax[n - 1] = height[n - 1];
        // // 从左向右计算 lMax
        // for (int i = 1; i < n; i++) {
        //     lMax[i] = Math.max(height[i], lMax[i - 1]);
        // }
        // // 从右向左计算 rMax
        // for (int i = n - 2; i >= 0; i--) {
        //     rMax[i] = Math.max(height[i], rMax[i + 1]);
        // }
        // // 计算结果
        // for (int i = 1; i < n - 1; i++) {
        //     res += Math.min(lMax[i], rMax[i]) - height[i];
        // }
        // return res;


        // 双指针解法
        int left = 0, right = height.length - 1;
        int lMax = 0, rMax = 0;

        int res = 0;
        while (left < right) {
            // lMax 表示 height[0...left] 最高柱子的高度，
            // rMax 表示 height[right...end] 最高柱子的高度
            lMax = Math.max(lMax, height[left]);
            rMax = Math.max(rMax,height[right]);

            if (lMax < rMax) {
                res += lMax - height[left];
                left++;
            } else {
                res += rMax - height[right];
                right--;
            }
        }
        return res;
    }
}
// @lc code=end

