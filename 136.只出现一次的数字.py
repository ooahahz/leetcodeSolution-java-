#
# @lc app=leetcode.cn id=136 lang=python
#
# [136] 只出现一次的数字
#

# @lc code=start
# class Solution(object):
#     def singleNumber(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: int
#         """
#         if len(nums) == 1:
#             return nums[0]
#         nums.sort()
#         for i in range(1,len(nums),2):
#             if nums[i-1] != nums[i]:
#                 return nums[i-1]
#             if (i+2) == len(nums):
#                 return nums[-1]

# class Solution(object):
#     def singleNumber(self, nums):
#         """
#         删除两次数字，如果不够删 则说明是返回的数字
#         """
#         while True:
#             d = nums[0]
#             nums.remove(d)
#             try:
#                 nums.remove(d)
#             except:
#                 return d

# class Solution(object):
#     def singleNumber(self, nums):
#         """
#         求和法
#         """
#         return sum(set(nums))*2 - sum(nums)

class Solution(object):
    def singleNumber(self, nums):
        """
        从第一个元素开始依次作亦或运算
        最后的到的值就是返回值
        亦或满足交换律
        0 ^ a = a
        a ^ a = 0
        a ^ b ^ a = a ^ a ^ b = 0 ^ b = b
        """
        res = nums[0]
        for i in range(1,len(nums)):
            res ^= nums[i]
        return res

# @lc code=end

