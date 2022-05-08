import java.util.ArrayDeque;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=933 lang=java
 *
 * [933] 最近的请求次数
 */

// @lc code=start
class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        queue = new ArrayDeque<>();
    }

    public int ping(int t) {
        queue.offer(t);
        while (queue.peek() < t - 3000) {
            queue.poll(); // 队头出队
        }
        return queue.size();
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        recentCounter.ping(1);
        System.out.println(recentCounter.queue.size());
        recentCounter.ping(100);
        System.out.println(recentCounter.queue.size());
        recentCounter.ping(3001);
        System.out.println(recentCounter.queue.size());
        recentCounter.ping(3002);
        System.out.println(recentCounter.queue.size());
    }

}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
// @lc code=end
