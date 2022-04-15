import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=804 lang=java
 *
 * [804] 唯一摩尔斯密码词
 */

// @lc code=start
class Solution {
    public static final String[] MORSE = {".-","-...","-.-.",
    "-..",".","..-.","--.","....","..",".---","-.-",".-..",
    "--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> seen = new HashSet<>();
        for (String word : words) { // 遍历字符串数组
            StringBuilder code = new StringBuilder();
            for (int i = 0; i < word.length(); i++) { // 遍历每一个字符串中的字符
                char ch = word.charAt(i); // 得到字符
                code.append(MORSE[ch - 'a']); // 定位当前 ch 所对应的 MORSE 密码, 加入到 code 中去
            }
            seen.add(code.toString());
        }
        return seen.size();
    }
}
// @lc code=end

