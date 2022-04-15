#
# @lc app=leetcode.cn id=53 lang=python
#
# [53] 最大子序和
#

# @lc code=start
# class Solution(object):
#     def maxSubArray(self, nums):
#         """
#         :type nums: List[int]
#         :rtype: int
#         思路：我觉得可以用双指针做
#         """
#         # # 暴力破解超时了
#         result = -float('inf')
#         for i in range(0, len(nums)):
#             sum = 0
#             for j in range(i, len(nums)):
#                 if nums[j] < 0 and sum < 0:
#                     break
#                 sum = sum + nums[j]
#                 result = max(sum, result)
#         return result


class Solution:
    def maxSubArray(self, nums):
        result = -float('inf')
        count = 0
        for i in range(len(nums)):
            count += nums[i]
            if count > result:
                result = count
            if count <= 0:
                count = 0
        return result



# @lc code=end

