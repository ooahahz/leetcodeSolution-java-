#
# @lc app=leetcode.cn id=118 lang=python
#
# [118] 杨辉三角
#

# @lc code=start
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        if numRows == 0:
            return [1]
        pas = [1]
        ans = [[1]]
        for j in range(numRows-1):
            pas = [1] + [pas[i] + pas[i+1] for i in range(len(pas)-1)] + [1]
            ans.append(pas)
        return ans
        

# @lc code=end

