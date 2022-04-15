import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeSet;

/*
 * @lc app=leetcode.cn id=1606 lang=java
 *
 * [1606] 找到处理最多请求的服务器
 */

// @lc code=start
class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        TreeSet<Integer> available = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            available.add(i);
        }
        PriorityQueue<int[]> busy = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        int[] requesets = new int[k];
        for (int i = 0; i < arrival.length; i++) {
            while (!busy.isEmpty() && busy.peek()[0] <= arrival[i]) {
                available.add(busy.poll()[1]);
            }
            if (available.isEmpty()) {
                continue;
            }
            Integer p = available.ceiling(i % k);
            if (p == null) {
                p = available.first();
            }
            requesets[p]++;
            busy.offer(new int[]{arrival[i] + load[i], p});
            available.remove(p);
        }
        int maxRequest = Arrays.stream(requesets).max().getAsInt();
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (requesets[i] == maxRequest) {
                ret.add(i);
            }
        }
        return ret;
    }
}
// @lc code=end

