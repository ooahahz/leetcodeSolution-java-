#
# @lc app=leetcode.cn id=704 lang=python
#
# [704] 二分查找
#

# @lc code=start
class Solution(object):
    # def search(self, nums, target):
    #     """
    #     :type nums: List[int]
    #     :type target: int
    #     :rtype: int
    #     :左闭右闭区间
    #     """
    #     left, right = 0, len(nums)-1

    #     while left <= right:
    #         middle = (left + right) //2

    #         if nums[middle] < target:
    #             left = middle + 1
    #         elif nums[middle] > target:
    #             right = middle -1
    #         else:
    #             return middle
    #     return -1

    def search(self, nums, target):
        """
        左闭右开区间
        """
        left, right = 0, len(nums)

        while left < right:
            mid = (left + right) // 2
            if nums[mid] < target:
                left = mid + 1
            elif nums[mid] > target:
                right = mid
            else:
                return mid
        return -1
            
# @lc code=end

