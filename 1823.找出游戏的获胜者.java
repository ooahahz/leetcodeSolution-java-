import java.util.ArrayDeque;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=1823 lang=java
 * 
 * 约瑟夫环
 * 法一：利用队列模拟
 * 法二：数学解法，递推式 f(n, k) = (f(n-1, k) + k) % n
 *
 * [1823] 找出游戏的获胜者
 */

// @lc code=start
// class Solution {
//     public int findTheWinner(int n, int k) {
//         Queue<Integer> queue = new ArrayDeque<>();
//         for (int i = 1; i <= n; i++) { // 将整数 1 ~ n 加入到队列中
//             queue.offer(i);
//         }
// 
//         while (queue.size() > 1) {
//             for (int i = 1; i < k; i++) { // 将数字 k 之前的元素依次取出放到队尾
//                 queue.offer(queue.poll()); // 取出队头元素，即为需要删除的元素
//             }
//             queue.poll(); // 删除对头的元素
//         }
//         return queue.peek(); // 最后队列中只剩下一个元素
// 
//     }
// }

class Solution {
    // 迭代
    public int findTheWinner(int n, int k) {
        int p = 0;
        for (int i = 2; i <= n; i++) {
            p = (p + k) % i;
        }
        return p + 1;

    }
    // public int findTheWinner(int n, int k) { // 递归
    // if (n == 1) {
    // return 1;
    // }
    // return (k + findTheWinner(n - 1, k) - 1) % n + 1;
    // }
}
// @lc code=end
