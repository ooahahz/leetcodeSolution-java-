#
# @lc app=leetcode.cn id=707 lang=python
#
# [707] 设计链表
#

# @lc code=start

class Node:
    
    def __init__(self,val):
        self.val = val
        self.next = None

class MyLinkedList(object):

    def __init__(self):
        self._head = Node(0) # 虚拟头部节点
        self._count = 0 # 添加的节点数


    def get(self, index):
        """
        :type index: int
        :rtype: int
        Get the value of the index-th node in the linked list. If the index is invalid, return -1.
        """
        if 0 <= index < self._count:
            node = self._head
            for _ in range(index+1):
                node = node.next
            return node.val
        else:
            return -1


    def addAtHead(self, val):
        """
        :type val: int
        :rtype: None
        """
        self.addAtIndex(0, val)


    def addAtTail(self, val):
        """
        :type val: int
        :rtype: None
        """
        self.addAtIndex(self._count, val)


    def addAtIndex(self, index, val):
        """
        :type index: int
        :type val: int
        :rtype: None
        Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be append to the end of linked list. If index is greater than the length, the node will not be inserted.
        """
        if index < 0:
            index = 0
        elif index > self._count:
            return

        # 计数加1
        self._count += 1

        add_node = Node(val)
        prev_node , current_node = None, self._head
        for _ in range(index+1):
            prev_node, current_node = current_node, current_node.next
        else:
            prev_node.next, add_node.next = add_node, current_node
        


    def deleteAtIndex(self, index):
        """
        :type index: int
        :rtype: None
        Delete the index-th node in the linked list, if the index is valid.
        """
        if 0 <= index < self._count:
            # 计数-1
            self._count -= 1
            prev_node, current_node = None, self._head
            for _ in range(index + 1):
                prev_node, current_node = current_node, current_node.next
            else:
                prev_node.next, current_node.next = current_node.next, None



# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)
# @lc code=end

