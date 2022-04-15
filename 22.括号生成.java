import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {

    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        if (n == 0) {
            return res;
        }
        generateParenthesis("", n, n);
        return res;

    }

    private void generateParenthesis(String str, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }
        if (left == right) { // 左右括号剩余数量一样
            generateParenthesis(str + "(", left - 1, right);

        } else {
            if (left > 0) {
                generateParenthesis( str + "(", left - 1, right);
            }
            generateParenthesis(str + ")", left, right - 1);
        }
    }
}
// @lc code=end

