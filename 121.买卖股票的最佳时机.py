#
# @lc app=leetcode.cn id=121 lang=python
#
# [121] 买卖股票的最佳时机
#

# @lc code=start
class Solution(object):
    # def maxProfit(self, prices):
    #     """
    #     :type prices: List[int]
    #     :rtype: int
    #     """
    #     minprice = float('inf')
    #     maxprofit = 0
    #     for price in prices:
    #         minprice = min(minprice, price)
    #         maxprofit = max(maxprofit, price-minprice)
    #     return maxprofit

    def maxProfit(self, prices):
        n = len(prices)
        if n == 0:
            return 0
        dp = [0] * n
        minprice = prices[0]

        for i in range(1, n):
            minprice = min(minprice, prices[i])
            dp[i] = max(dp[i-1], prices[i] - minprice)
        
        return dp[-1]
            
# @lc code=end

