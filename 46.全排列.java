import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution { // 全排列 回溯
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        List<Integer> output = new ArrayList<>();
        for (int num : nums) {
            output.add(num);
        }

        int n = nums.length;

        backtrack(n, output, res, 0); // 回溯

        return res;
    }

    private void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        if (first == n) { // 所有的数都填完了
            res.add(new ArrayList<Integer>(output)); // 注意：此处要重新new一个ArrayList对象，
            // 因为如果不重新构造对象的话，那么在回溯的过程中，
            // 由于引用类型，会将ArrayList的元素进行移除，这样最终的结果就为[]
        }
        for (int i = first; i < n; i++) {
            Collections.swap(output, first, i); // 将数组 output 中的下标 first 元素和下标 i 元素交换
            backtrack(n, output, res, first + 1); // 递归填下一个数
            Collections.swap(output, first, i); // 回退操作
        }
    }
}
// @lc code=end

