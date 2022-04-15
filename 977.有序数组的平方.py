#
# @lc app=leetcode.cn id=977 lang=python
#
# [977] 有序数组的平方
#

# @lc code=start
class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # return sorted([i**2 for i in nums])

        # result = []
        # for i in nums:
        #     result.append(i**2)
        # result.sort()
        # return result


        # 双指针法，时间复杂度为 O(n)
        n = len(nums)
        i, j, k = 0, n-1, n-1
        ans = [0] * n
        while i <= j:
            lm = nums[i] ** 2
            rm = nums[j] ** 2
            if lm > rm:
                ans[k] = lm
                i += 1
            else:
                ans[k] = rm
                j -= 1
            k -= 1
        return ans
# @lc code=end

