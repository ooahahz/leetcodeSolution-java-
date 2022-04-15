#
# @lc app=leetcode.cn id=83 lang=python
#
# [83] 删除排序链表中的重复元素
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        if not head:
            return head
        
        cur = head
        while cur.next:
            if cur.val == cur.next.val:
                cur.next = cur.next.next # 如果 cur 的值等于 cur 下一个节点的值，那么就将cur的下一个节点删除
            else:
                cur = cur.next 
        return head # 最后返回链表的头节点即可
# @lc code=end

