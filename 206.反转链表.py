#
# @lc app=leetcode.cn id=206 lang=python
#
# [206] 反转链表
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        cur = head
        pre = None
        while cur != None:
            temp = cur.next # temp 为临时变量，保存一下 cur 的下一个节点，因为接下来要改变 cur->next
            cur.next = pre # 反转
            # 循环更新 pre, cur 指针
            pre = cur
            cur = temp
        return pre
# @lc code=end

