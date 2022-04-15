/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
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
    // 同时遍历两个链表，逐位计算它们相应位上的和，并与当前位置的进位值相加（初始的进位值为 0）
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null; // 返回结果链表的头节点
        ListNode tail = null; // 返回结果链表的尾节点（开始时，两个头尾节点都指向空）
        int carry = 0; // 进位

        while (l1 != null || l2 != null) { // l1, l2 初始时为两个链表的头节点 
            int n1 = l1 != null ? l1.val : 0;  
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10); // 第一步，头尾节点同时指向新链表的链头，然后 head 就不动，tail逐步向后移动
            } else {
                tail.next = new ListNode(sum % 10); // 之后的每一步头节点都不为空,执行这一条语句
                tail = tail.next;
            }
            carry = sum / 10; // 记录下当前位的进位值，为下一位计算做好准备
            if( l1 != null) {
                l1 = l1.next; // 链表1头指针依次向后移动
            }
            if (l2 != null) {
                l2 = l2.next; // 链表2头指针依次向后移动
            }
        }
        if (carry > 0) { // 最后一位如果有进位，不要忘了
            tail.next = new ListNode(carry);
        }
        return head;

    }
}
// @lc code=end

