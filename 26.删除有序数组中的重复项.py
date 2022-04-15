#
# @lc app=leetcode.cn id=26 lang=python
#
# [26] 删除有序数组中的重复项
#

# @lc code=start
# class Solution(object):
#     def removeDuplicates(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: int
#         双指针
#         """
#         if not nums:
#             return 0
#         n = len(nums)
#         fast = slow = 1
#         while fast < n:
#             if nums[fast] != nums[fast-1]:
#                 nums[slow] = nums[fast]
#                 slow += 1
#             fast += 1

#         return slow

class Solution:
    """
    双指针解法
    一个指针 fast 进行数组的遍历，另一个指针 slow 指向有效数组的最后一个位置。
    只有当 fast 所指向的值和 slow 指向的值不一致时，才将 fast 处的值添加到 slow 
    的下一个位置。

    """
    def removeDuplicates(self,nums):
        n = len(nums)
        slow= 0
        for fast in range(n):
            if nums[fast] != nums[slow]:
                slow +=1
                nums[slow] = nums[fast]
        return slow + 1



# @lc code=end

