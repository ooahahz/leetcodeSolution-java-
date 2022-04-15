
# @lc app=leetcode.cn id=7 lang=python

# [7] 整数反转


# @lc code=start

# class Solution(object):
#     def reverse(self, x):
#         """
#         整数转字符串，反转字符串，然后再转整数
#         :type x: int
#         :rtype: int
#         """
#         # 符号与数字分离
#         plus_minus = ''
#         revers_x = ''
#         if x < 0:
#             plus_minus = '-'
#             x = -x
#         for i in str(x): # 整数变成字符串, for 循环遍历字符串
#             revers_x = i + revers_x # 加号实现字符串的拼接
#         revers_x = plus_minus + revers_x
#         if int(revers_x) > pow(2, 31) or int(revers_x) < pow(-2, 31):
#             return 0 
#         return int(revers_x)

# class Solution:
#     def reverse(self, x):
#         a = str(x) if x > 0 else str(-x) + '-'
#         a = int(a[: : -1])
#         return a if a <= 2**31-1 and a >= -2**31-1 else 0

class Solution:
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        listX = str(x).split('-')
        if len(listX) > 1:
            x = int('-' + listX[-1][::-1])
        else:
            x = int(listX[-1][::-1])
        return x if x > pow(-2, 31) and x < pow(2, 31) - 1 else 0





# @lc code=end

