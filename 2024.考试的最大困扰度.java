/*
 * @lc app=leetcode.cn id=2024 lang=java
 *
 * [2024] 考试的最大困扰度
 */

// @lc code=start
class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int ans = 0;
        for (int left = 0, right = 0, countsT = 0, countsF = 0; right < answerKey.length(); right++) {
            countsT += answerKey.charAt(right) == 'T' ? 1 : 0;
            countsF += answerKey.charAt(right) == 'F' ? 1 : 0;
            while (countsT > k && countsF > k) {
                countsT -= answerKey.charAt(left) == 'T' ? 1 : 0;
                countsF -= answerKey.charAt(left) == 'F' ? 1 : 0;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
// @lc code=end

