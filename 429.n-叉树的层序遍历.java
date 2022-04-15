import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import com.sun.org.apache.bcel.internal.classfile.Node;

/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N 叉树的层序遍历
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    // Solution1:广度优先遍历(BFS)
    // public List<List<Integer>> levelOrder(Node root) {
    //     if (root == null) {
    //         return new ArrayList<List<Integer>>();
    //     }

    //     List<List<Integer>> ans = new ArrayList<List<Integer>>();
    //     Queue<Node> queue = new ArrayDeque<>();
    //     queue.offer(root);

    //     while (!queue.isEmpty()) {
    //         int cnt = queue.size();
    //         List<Integer> level = new ArrayList<>();
    //         for (int i = 0; i < cnt; i++) {
    //             Node cur = queue.poll();
    //             level.add(cur.val);
    //             for (Node chil : cur.children) {
    //                 queue.offer(chil);
    //             }
    //         }
    //         ans.add(level);
    //     }
    //     return ans;
        
    // }
    // // }

    // Solution2: 深度优先遍历 (DFS)
    // 使用哈希表存储每个深度depth对应的节点列表，当处理到
    // 节点u时，将其值添加到其所在的深度列表中
    // 在DFS过程中记录最大深度max，跑完DFS后，通过深度遍历获取哈希表中每个深度对应的节点列表值
    int max; // 初始化 max
    Map<Integer, List<Integer>> map = new HashMap<>();
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return ans;
        }

        dfs(root, 0); // 跑一遍 DFS，初始节点为根节点，深度为 0

        for (int i = 0; i <= max; i++) { // max 为深度
            ans.add(map.get(i));
        }
        return ans;
    }

    void dfs(Node u, int depth) { // 深度优先遍历
        max = Math.max(max, depth); // 更新深度
        List<Integer> list = map.getOrDefault(depth, new ArrayList<>()); // 如果 map 为空的话，就新建一个 ArrayList<>()
        list.add(u.val); // 向当前 depth 对应的 list 中添加节点值
        map.put(depth, list); 

        for (Node node : u.children) { // 对当前节点的所有孩子节点递归地做 dfs
            dfs(node, depth + 1);
        }
    }
}
// @lc code=end

