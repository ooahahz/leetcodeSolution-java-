#
# @lc app=leetcode.cn id=867 lang=python
#
# [867] 转置矩阵
#

# @lc code=start
class Solution(object):
    def transpose(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[List[int]]
        """
        result = []
        for i in range(len(matrix[0])):
            row = []
            for j in range(len(matrix)):
                row.append(matrix[j][i])
            result.append(row)
        return result
       
# @lc code=end

