import java.util.LinkedList;

import javax.management.ListenerNotFoundException;

/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     // 思路：
    //     // 删除倒数第 n 个节点，相当于删除链表长度 - n 的位置的节点
    //     // 首先循环得到链表的长度
    //     // 
    //     ListNode dummy = new ListNode(0, head); // 新建一个哑节点, 值为 1， 指向头节点
    //     int length = getLength(head);
    //     ListNode cur = dummy; // 将当前节点指向哑节点
    //     for (int i = 1; i < length - n + 1; i++) {
    //         cur = cur.next; // 循环结束时来到将被删除节点的前一个节点
    //     }
    //     cur.next = cur.next.next;  
    //     ListNode ans = dummy.next; // 指向头节点
    //     return ans;
    // }

    // public int getLength(ListNode head) {
    //     int length = 0;
    //     while (head != null) {
    //         length++;
    //         head = head.next;
    //     }
    //     return length;
    // }
    //
    // public ListNode removeNthFromEnd(ListNode head, int n) {
    //     // 思路：利用栈，遍历链表的同时，将节点加入栈中，
    //     // 则从栈顶开始数第 n 个节点就是我们需要删除的节点，从栈顶依次弹出到第 n 个节点
    //     ListNode dummy = new ListNode(0, head);
    //     Deque<ListNode> stack = new LinkedList<>();
    //     ListNode cur = dummy;
    //     while (cur != null) {
    //         stack.push(cur);
    //         cur = cur.next;
    //     }
    //     for (int i = 0; i < n; i++) {
    //         stack.pop();
    //     }
    //     ListNode prev = stack.peek(); // 得到栈顶的节点，即待删除节点的前置节点
    //     prev.next = prev.next.next;
    //     ListNode ans = dummy.next;
    //     return ans;
    // }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 思路：双指针
        // 第一个指针指向第二个指针的后 n 位节点（所以要循环 n 次）
        // 两个指针同时开始走，第一个指针指向链表结尾时，第二个指针刚好指向待删除的节点
        // 为了更好的实现，设置一个哑节点，第一个指针指向头节点，第二个指针指向哑节点
        // 当第一个指针指向尾节点后的 null 节点时，第二个指针刚好指向待删除节点的前一个节点
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; i++) {
            first = first.next; // 为了和第二个节点相差 n 个节点
        }
        while (first != null) {
            first = first.next; // 两个指针同时走
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
// @lc code=end

