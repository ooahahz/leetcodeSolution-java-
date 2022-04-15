#
# @lc app=leetcode.cn id=34 lang=python
#
# [34] 在排序数组中查找元素的第一个和最后一个位置
#

# @lc code=start
class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        # def getRightBorder(nums, target):
        #     left, right = 0, len(nums)-1
        #     rightBorder = -2 # 记录一下 rightBorder 没有被赋值的情况
        #     while left <= right:
        #         middle = (left + right)//2
        #         if nums[middle] > target:
        #             right = middle -1
        #         else: # 寻找右边界，nums[middle] == target 的时候更新left
        #             left = middle + 1
        #             rightBorder = left 
        #     return rightBorder

        # def getLeftBorder(nums, target):
        #     left, right = 0, len(nums)-1
        #     leftBorder = -2 # 更新以下 leftBorder 没有被赋值的情况
        #     while left <= right:
        #         middle = (left + right) // 2
        #         if nums[middle] >= target:
        #             right = middle - 1
        #             leftBorder = right
        #         else:
        #             left = middle + 1
        #     return leftBorder
        # leftBorder = getLeftBorder(nums, target)
        # rightBorder = getRightBorder(nums, target)

        # # 情况一
        # if leftBorder == -2 or rightBorder == -2:
        #     return [-1, -1]
        # # 情况三
        # if rightBorder - leftBorder > 1:
        #     return [leftBorder+1, rightBorder-1]
        # # 情况二
        # return [-1, -1]

        # # 解法二
        # # 1. 首先，在 nums 数组中二分查找 target
        # # 2. 如果二分查找没有找到，则 binarySearch 返回 -1，表明 nums 中没有 target，此时，searchRanch 直接返回{-1，-1}
        # # 3. 如果二分查找成功，则 binarySeach 返回 nums 中值为 target 的一个下标，然后通过左右滑动指针来找到符合题意得区间
        # def binarySearch(nums, target):
        #     left, right = 0, len(nums) - 1
        #     while left <= right: # 不变量：左闭右闭区间
        #         middle = left + (right-left)//2
        #         if nums[middle] > target:
        #             right = middle - 1
        #         elif nums[middle] < target:
        #             left = middle + 1
        #         else:
        #             return middle
        #     return -1

        # index = binarySearch(nums, target)
        # if index == -1: return [-1, -1] # nums 中不存在 target, 直接返回{-1， -1}
        # # nums 中存在 target, 则左右滑动指针，来找到符合题意的区间
        # left, right = index, index
        # # 向左滑动，找左边界
        # while left-1 >= 0 and nums[left-1] == target:
        #     left -= 1
        # while right + 1 < len(nums) and nums[right+1] == target:
        #     right += 1
        # return [left, right]

        # 解法三
        # 1. 首先，在 nums 数组中二分查找得到第一个大于等于 target 得下标 leftBorder；
        # 2. 在 nums 数组中二分查找得到第一个大于等于 target+1 得下标， 减1则得到 rightBorder；
        # 3. 如果开始位置在数组得右边或者不存在 target ， 则返回[-1,-1], 否则返回[leftBorder, rightBorder]
        def binarySearch(nums, target):
            left, right = 0, len(nums)-1
            while left <= right:
                middle = left + (right-left)//2
                if nums[middle] >= target:
                    right = middle - 1
                else:
                    left = middle + 1
            return left # 若存在 target, 则返回第一个等于 target 的值

        leftBorder = binarySearch(nums, target) # 搜索左边界
        rightBorder = binarySearch(nums, target+1) - 1
        if leftBorder  == len(nums) or nums[leftBorder] != target: # 情况一和情况二
            return [-1, -1]
        return [leftBorder, rightBorder]



    



# @lc code=end

