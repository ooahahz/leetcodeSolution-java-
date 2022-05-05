/*
 * @lc app=leetcode.cn id=713 lang=java
 *
 * [713] 乘积小于 K 的子数组
 */

// @lc code=start
class Test {
    int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }
        int left = 0, right = 0, ans = 0;
        int mul = 1;

        // 用右指针遍历整个数组
        while (right < nums.length) {
            mul *= nums[right];

            while (mul >= k) {
                // 当乘积大于等于k，需要将左指针右移，并且除掉左指针上的值
                mul /= nums[left];
                left++;
            }
            ans += right - left + 1; // 记录每一轮的个数
            right++; // 进行下一轮，右指针右移
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 6 };
        int k = 100;
        Test solution = new Test();
        System.out.println(solution.numSubarrayProductLessThanK(nums, k));

    }
}
// @lc code=end
