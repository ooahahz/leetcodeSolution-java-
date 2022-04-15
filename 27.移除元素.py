#
# @lc app=leetcode.cn id=27 lang=python
#
# [27] 移除元素
#

# @lc code=start
# class Solution(object):
#     def removeElement(self, nums, val):
#         """
#         :type nums: List[int]
#         :type val: int
#         :rtype: int
#         双指针做
#         """
#         slow = 0
#         for fast in range(len(nums)):
#             if nums[fast] != val:
#                 nums[slow] = nums[fast]
#                 slow += 1
#             fast += 1
#         return slow

# class Solution(object):
#     """
#     倒序遍历，进行删除不会影响前面元素的索引
#     """
#     def removeElement(self, nums, val):
#         j = len(nums)
#         for i in range(j-1, -1, -1):
#             if nums[i] == val:
#                 nums.pop(i)
#         return len(nums)


class Solution(object):
    """
    双指针法
    空间复杂度：O(n)
    时间复杂度：O(1)
    """
    def removeElement(self, nums, val):
        fast = slow = 0

        while fast < len(nums):
            if nums[fast] != val:
                nums[slow] = nums[fast]
                slow += 1
            
            fast += 1
        return slow


# @lc code=end

