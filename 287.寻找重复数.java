import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=287 lang=java
 *
 * [287] 寻找重复数
 */

// @lc code=start
class Solution {
    // public int findDuplicate(int[] nums) {
    //     Arrays.sort(nums);
    //     for (int i = 1; i < nums.length; i++) {
    //         if (nums[i] == nums[i-1]) {
    //             return nums[i];
    //         }
    //     }
    //     return nums.length;

    // }

    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
// @lc code=end

