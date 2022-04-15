#
# @lc app=leetcode.cn id=209 lang=python
#
# [209] 长度最小的子数组
#

# @lc code=start
class Solution(object):
    def minSubArrayLen(self, target, nums):
        """
        :type target: int
        :type nums: List[int]
        :rtype: int
        滑动窗口：不断调节子序列的起始位置和终止位置，最终得到我们想要的结果
        """
        # 定义一个无限大的数
        res = float('inf')
        Sum = 0
        index = 0
        for i in range(len(nums)):
            Sum += nums[i]
            while Sum >= target:
                res = min(res, i-index+1)
                Sum -= nums[index]
                index += 1
        return 0 if res == float('inf') else res

# @lc code=end

