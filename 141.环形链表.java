import java.util.HashSet;

import javax.management.ListenerNotFoundException;

/*
 * @lc app=leetcode.cn id=141 lang=java
 *
 * [141] 环形链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) { // Floyd 判圈算法
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    // public boolean hasCycle(ListNode head) {
    //     Set<ListNode> seen = new HashSet<>();
    //     while (head != null) {
    //         if (!seen.add(head)) { // 说明 HashSet 中已经有相同的元素了
    //             return true;
    //         }
    //         head = head.next;
    //     }
    //     return false;
    // }
}
// @lc code=end

