#
# @lc app=leetcode.cn id=203 lang=python
#
# [203] 移除链表元素
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeElements(self, head, val):
        """
        :type head: ListNode
        :type val: int
        :rtype: ListNode
        """
        dummy_head = ListNode(next = head) # 添加一个虚拟头节点
        cur = dummy_head
        while cur.next != None:
            if cur.next.val == val:
                cur.next = cur.next.next # 删除 cur.next 节点
            else:
                cur = cur.next # 移动节点
        return dummy_head.next
# @lc code=end

