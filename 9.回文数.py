#
# @lc app=leetcode.cn id=9 lang=python
#
# [9] 回文数
#

# @lc code=start
############################# SOLUTION 1 ################################
# class Solution(object):
#     def isPalindrome(self, x):
#         """
#         :type x: int
#         :rtype: bool
#         字符串切片操作，str[index:index:step]，中括号里面分别为：字符起点、终点和步长
#         """
#         x = str(x)
#         if x[::-1] == x:
#             return True
#         else:
#             return False
        
############################## SOLUTION 2 ##################################
# class Solution(object):
#     def isPalindrome(self, x):
#         """
#         数学方法：值得思考一下（还不是很懂）
#         """
#         if x < 0 or x % 10 == 0 and x != 0:
#             return False 
#         y = 0
#         while(x>y):
#             y = x % 10 + y * 10
#             x = x // 10

#         return x == y or x == y // 10

############################### SOLUTION 3 ###################################
# class Solution(object):
#     def isPalindrome(self,x):
#         """
#         比较对称位置的数是否相等，关键是找到对称位置下标之间的关系
#         """
#         str_x = str(x)
#         for i in range(0, int(len(str_x)/2)):
#             if str_x[i] != str_x[-i-1]:
#                 return False

#         return True

################################ SOLUTION 4 ###################################
class Solution(object):
    def isPalindrome(self, x):
        """
        遍历字符串，加到空字符串上，得到回文数，与原数进行比较
        """
        str_x = str(x)
        str_y = ''
        for i in str_x:
            str_y = i + str_y
        return str_x == str_y

        # @lc code=end

