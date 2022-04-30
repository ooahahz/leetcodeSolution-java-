import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=908 lang=java
 *
 * [908] 最小差值 I
 * 如果maxNum - minNum <= 2k，那么可以将整数数组 nums 的所有元素都改为同一个整数,此时结果为 0
 * 如果 maxNum - minNum > 2k，那么更改后的整数数组 nums 的最低分数为 maxNum - minNum - 2k 
 */

// @lc code=start
/*
Method 1:
*/
// class Solution {
//     public int smallestRangeI(int[] nums, int k) {
//         int n = nums.length;
//         if (n == 1) {
//             return 0;
//         }
// 
//         Arrays.sort(nums);
//         int min = nums[0] + k;
//         if (nums[n - 1] - k > min) {
//             int max = nums[n - 1] - k;
//             return max - min;
//         } else {
//             return 0;
//         }
//         
// 
//     }
// }
/*
  三叶姐
 */
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int minNum = nums[0], maxNum = nums[0];
        for (int num : nums) {
            minNum = Math.min(minNum, num);
            maxNum = Math.max(maxNum, num);
        }
        return Math.max(0, maxNum - minNum - 2*k);

    }
}
/*
    官方题解
 */
// class Solution {
//     public int smallestRangeI(int[] nums, int k) {
//         int minNum = Arrays.stream(nums).min().getAsInt(); 
//         int maxNum = Arrays.stream(nums).max().getAsInt(); 
//         return maxNum - minNum <= 2 * k ? 0 : maxNum - minNum - 2 * k;
//     }
// }
// @lc code=end

