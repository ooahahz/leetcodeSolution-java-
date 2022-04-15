#
# @lc app=leetcode.cn id=119 lang=python
#
# [119] 杨辉三角 II
#

# @lc code=start
# class Solution(object):
#     def getRow(self, rowIndex):
#         """
#         :type rowIndex: int
#         :rtype: List[int]
#         """
#         if rowIndex== 0:
#             return [1]
#         pas = [1]
#         ans = [[1]]
#         for j in range(rowIndex):
#             pas = [1] + [pas[i] + pas[i+1] for i in range(len(pas)-1)] + [1]
#             ans.append(pas)
#         return ans[(-1]

# class Solution(object):
#     def getRow(self, rowIndex):
#         ret = []
#         for i in range(1, rowIndex+2):
#             tmp = [1 for _ in range(i)]
#             for j in range(1, len(tmp)-1):
#                 tmp[j] = ret[i-2][j-1] + ret[i-2][j]
#             ret.append(tmp)
#         return ret[-1]

class Solution(object):
    def getRow(self, rowIndex):
        temp = 1
        res = []
        for i in range(rowIndex+1):
            res.append(temp)
            temp = temp * (rowIndex-i)//(i+1)
        return res
# @lc code=end

