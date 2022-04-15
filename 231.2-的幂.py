#
# @lc app=leetcode.cn id=231 lang=python
#
# [231] 2 的幂
#

# @lc code=start
class Solution(object):
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        思路：除以二，余数为0
        """
        if n == 1 or n == 2:
            return True
        if n == 0:
            return False
        while True:
            if n % 2 ==0:
                n = n / 2
                if n == 2:
                    return True
            else:
                return False

# class Solution(object):
#     """
#     二进制表示，位运算技巧
#     """
#     def isPowerOfTwo(self, n):
#         return n > 0 and n & (n-1) == 0

# class Solution(object):
#     def isPowerOfTwo(self, n):
#         return n > 0 and n & (-n) == n

# class Solution(object):
#     """
#     判断是否为最大 22 的幂的约数
#     """
#     BIG = 2 ** 30
#     def isPowerOfTwo(self, n):
#         return n > 0 and Solution.BIG % n == 0
# @lc code=end

