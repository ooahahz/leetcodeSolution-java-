#
# @lc app=leetcode.cn id=70 lang=python
#
# [70] 爬楼梯
#

# @lc code=start
class Solution(object):
    # def climbStairs(self, n):
    #     """
    #     :type n: int
    #     :rtype: int
    #     动态规划
    #     """
    #     if n <= 2:
    #         return n
    #     dp =  [0] * n
    #     dp[0] = 1
    #     dp[1] = 2
    #     for i in range(2,n):
    #         dp[i] = dp[i-1] + dp[i-2]
    #     return dp[n-1]

    def climbStairs(self,n):
        """
        还是 DP, 只不过只储存了两个元素，减少了空间复杂度

        """
        if n == 1 or n == 2:
            return n 
        a, b, temp = 1, 2, 0 # 初始化参数
        for i in range(3,n+1):
            temp = a + b
            a = b
            b = temp
        return temp

# @lc code=end


