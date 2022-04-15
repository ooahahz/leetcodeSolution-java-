/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>(); // 回溯维护一个字符串
        if (digits.length() == 0) {
            return combinations;
        }

        // 使用哈希表存储每个数字对应的所有可能的字母，然后进行回溯操作
        Map<Character, String> phoneMap = new HashMap<>() {
            {
                put('2', "abc");
                put('3', "def");
                put('4', "ghi");
                put('5', "jkl");
                put('6', "mno");
                put('7', "pqrs");
                put('8', "tuv");
                put('9', "wxyz");
            }
        };
        backtrack(combinations, phoneMap, digits, 0, new StringBuffer());
        return combinations;
    }

    private void backtrack(List<String> combinations, Map<Character, String> phoneMap, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
        } else {
            char digit = digits.charAt(index);
            String letters = phoneMap.get(digit);
            int lettersCount = letters.length();
            for (int i = 0; i < lettersCount; i++) {
                combination.append(letters.charAt(i)); // 将字母插入到已有的字母排列后面
                backtrack(combinations, phoneMap, digits, index+1, combination);
                combination.deleteCharAt(index); // 回退操作
            }

        }

    }
}
// @lc code=end

