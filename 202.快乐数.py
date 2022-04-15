#
# @lc app=leetcode.cn id=202 lang=python
#
# [202] 快乐数
#

# @lc code=start
class Solution(object):
    def happynum(self,n):
        m = 0
        for i in str(n):
            m += int(i)**2
        return m
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        res = []
        m = self.happynum(n)
        while m != 1:
            if m in res:
                return False
            else:
                res.append(m)
            m = self.happynum(m)
        return True

       

# @lc code=end

