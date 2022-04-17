import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=819 lang=java
 *
 * [819] 最常见的单词
 */

// @lc code=start
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for (String word : banned) {
            bannedSet.add(word); // 用一个 HashSet 记录需要 ban 的单词
        }
        int maxFrequency = 0; // 初始化最大数位0
        Map<String, Integer> frequencies = new HashMap<>();
        StringBuffer sb = new StringBuffer();
        int length = paragraph.length();
        for (int i = 0; i <= length; i++) {
            if (i < length && Character.isLetter(paragraph.charAt(i))) {
                sb.append(Character.toLowerCase(paragraph.charAt(i)));
            } else if (sb.length() > 0) {
                String word = sb.toString();
                if (!bannedSet.contains(word)) {
                    int frequency = frequencies.getOrDefault(word, 0) + 1;
                    frequencies.put(word, frequency);
                    maxFrequency = Math.max(maxFrequency, frequency); // 更新 maxFrequency
                }
                sb.setLength(0);
            }
        }

        String mostCommon = "";
        Set<Map.Entry<String, Integer>> entries = frequencies.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String word = entry.getKey();
            int frequency = entry.getValue();
            if (frequency == maxFrequency) {
                mostCommon = word;
                break;
            }
        }
        return mostCommon;
    }
}
// @lc code=end

