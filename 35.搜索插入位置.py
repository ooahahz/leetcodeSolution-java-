#
# @lc app=leetcode.cn id=35 lang=python
#
# [35] 搜索插入位置
#

# @lc code=start
class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        二分查找
        """
        l = len(nums)
        left = 0
        right = l-1
        while left <= right:
            mid = left + (right - left) // 2
            if nums[mid] == target:
                return mid
            elif nums[mid] > target:
                right = mid -1
            elif nums[mid] < target:
                left = mid + 1

        else:
            return left

# class Solution(object):
#     def searchInsert(self, nums, target):
#         if target in nums:
#             return nums.index(target)
#         else:
#             nums.append(target)
#             nums.sort()
#             return nums.index(target)
        

# @lc code=end

