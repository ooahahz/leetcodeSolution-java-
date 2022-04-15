import javax.sql.rowset.spi.SyncResolver;

/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public static String longestPalindrome(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            // 以 s[i] 为中心的最长回文子串
            String s1 = palindrome(s, i, i);
            // 以 s[i] 和 s[i+1] 为中心的最长回文子串
            String s2 = palindrome(s, i, i+1);
            // res = longest(res, s1, s2)
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }

    // 在 s 中寻找以 s[l] s[r] 为中心的最长回文串
    public static String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }

    // public String longestPalindrome(String s) {
    //     int len = s.length();
    //     String result = "";

    //     for (int i = 0; i < len * 2 - 1; i++) {
    //         int left = i / 2;
    //         int right = left + i % 2;
    //         while (left >= 0 && right < len && s.charAt(left) == s.charAt(right)) {
    //             String tmp = s.substring(left, right + 1);
    //             if (tmp.length() > result.length()) {
    //                 result = tmp;
    //             }
    //             left--;
    //             right++;
    //         }
    //     }
    //     return result;
    // }

    // public static void main(String[] args) {
    //     String s = "babad";
    //     System.out.println(longestPalindrome(s));
    // }
}
// @lc code=end

