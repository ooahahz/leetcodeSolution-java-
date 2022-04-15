import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=78 lang=java
 *
 * [78] 子集
 */

// @lc code=start
class Solution { // 回溯
    List<Integer> t = new ArrayList<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums);
        return this.ans;
    }

    public void dfs(int cur, int[] nums) {
        if (cur == nums.length) {
            ans.add(new ArrayList<Integer>(t));
            return;
        }
        t.add(nums[cur]); // 将当前元素加入，对下一个位置进行递归
        dfs(cur + 1, nums);
        t.remove(t.size() - 1); // 回溯，回到上一个状态
        dfs(cur + 1, nums); // 不把当前元素加入
    }

}
// @lc code=end

