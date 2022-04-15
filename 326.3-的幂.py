#
# @lc app=leetcode.cn id=326 lang=python
#
# [326] 3的幂
#

# @lc code=start
# class Solution(object):
#     def isPowerOfThree(self, n):
#         """
#         :type n: int
#         :rtype: bool
#         """
#         if n == 0:
#             return False
#         if n == 1:
#             return True
#         while True:
#             if n % 3 == 0:
#                 n = n / 3
#                 if n == 1:
#                     return True
#             else:
#                 return False 
            
#         return n == 1
 
# class Solution(object):
#     def isPowerOfThree(self,n):
#         res = 1
#         while res < n:
#             res = 3 * res
#         return res == n

# class Solution(object):
#     """
#     recursion
#     """
#     def isPowerOfThree(self, n):
#         if n == 1:
#             return True
#         if (n == 0 or n % 3 != 0):
#             return False
#         return self.isPowerOfThree(n/3)

class Solution(object):
    """
    对数的换底公式
    """
    def isPowerOfThree(self, n):
        if n <= 0:
            return False
        x = log10(n) / log10(3)
        return x == floor(x)
        
# @lc code=end

