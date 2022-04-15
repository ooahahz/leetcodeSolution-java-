import java.util.List;

/*
 * @lc app=leetcode.cn id=728 lang=java
 *
 * [728] 自除数
 */

// @lc code=start
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isDividing(i)) {
                ans.add(i);
            }
        }
        return ans;
    }

    private boolean isDividing(int num) {
        int temp = num;
        while (temp > 0) {
            int res = temp % 10;
            if (res == 0 || num % res != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
// @lc code=end

