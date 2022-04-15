import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=954 lang=java
 *
 * [954] 二倍数对数组
 */

// @lc code=start
class Solution {
    public boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x: arr) { // 遍历数组，得到元素个数的哈希表
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
        }

        if (cnt.getOrDefault(0, 0) % 2 != 0) { // 如果 0 的个数为奇数直接不满足，返回false
            return false;
        }

        List<Integer> vals = new ArrayList<>();

        for (int x: cnt.keySet()) { // 将哈希表中的键加入数组
            vals.add(x);
        }

        Collections.sort(vals, (a, b) -> Math.abs(a) - Math.abs(b)); // 将数组按照绝对值从小到大排序

        for (int x : vals) {
            if (cnt.getOrDefault(2 * x, 0) < cnt.get(x)) {
                return false; // x 的两倍的个数多余 x 的个数，不够匹配，返回 false 
            }

            cnt.put(2*x, cnt.getOrDefault(2*x, 0) - cnt.get(x)); // 与 x 匹配完的 2x 个数要减去，剩下的继续和2x的两倍继续匹配 
        }
        return true;
    }
}
// @lc code=end

