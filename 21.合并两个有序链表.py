#
# @lc app=leetcode.cn id=21 lang=python
#
# [21] 合并两个有序链表
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
# class Solution(object):
#     def mergeTwoLists(self, l1, l2):
#         """
#         :type l1: ListNode
#         :type l2: ListNode
#         :rtype: ListNode
#         递归写法
#         """
#         if l1 is None:
#             return l2
#         elif l2 is None:
#             return l1
#         elif l1.val < l2.val:
#             l1.next = self.mergeTwoLists(l1.next, l2)
#             return l1
#         else:
#             l2.next = self.mergeTwoLists(l1, l2.next)
#             return l2
#########################################
class Solution(object):
    def mergeTwoLists(self, l1, l2):
        prehead = ListNode(-1)
        prev = prehead
        while l1 and l2:
            if l1.val <= l2.val:
                prev.next = l1
                l1 = l1.next
            else:
                prev.next = l2
                l2 = l2.next
            prev = prev.next
        # 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接把链表末尾指向未合并完的链表即可
        prev.next = l1 if l1 is not None else l2

        return prehead.next
##################################################
# 在链表中穿针引线，想象一下针怎么穿即可。这里关键在于应该创建一个虚拟头节点(哑节点)，对于这种第一个元素不知道是谁的问题，都可以创建虚拟头节点来解题
# class Solution:
#     def mergeTwoLists(self, l1, l2):
#         if l1 == None:
#             return l2
#         if l2 == None:
#             return l1

#         preHead = ListNode(-1)
#         p1 = l1
#         p2 = l2
#         cur = preHead

#         while p1 != None and p2 != None:
#             if p1.val < p2.val:
#                 cur.next = p1
#                 cur = p1
#                 p1 = p1.next

#             else:
#                 cur.next = p2
#                 cur = p2
#                 p2 = p2.next
#         if p1:
#             cur.next = p1
#         if p2:
#             cur.next = p2
#         return preHead.next
# @lc code=end

