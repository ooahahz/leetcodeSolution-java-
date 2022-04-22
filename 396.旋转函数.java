import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=396 lang=java
 *
 * [396] 旋转函数
 */

// @lc code=start
/**
 * 找规律可以得到递推公式
 * F(k) = F(k-1) + numSum - n * nums[n-k]
 * numSum 为数组元素之和
 * n 为数组的长度
 */
class Solution {
    public int maxRotateFunction(int[] nums) {
        int f = 0;
        int numsLen = nums.length;
        int numSum = 0;

        // numSum = Arrays.stream(nums).sum(); // 调用系统API计算数组之和
        for (int i = 0; i < numsLen; i++) {
            numSum += nums[i]; // 计算数组所有元素之和
        }

        for (int i = 0; i < numsLen; i++) {
            f += i * nums[i]; // 计算 F(0)
        }

        int res = f;
        for (int j = numsLen - 1; j > 0; j--) {
            f += numSum - numsLen * nums[j];
            res = Math.max(res, f);

        }
        return res;

    }
}
// @lc code=end

