#
# @lc app=leetcode.cn id=125 lang=python
#
# [125] 验证回文串
#

# @lc code=start
# class Solution(object):
#     def isPalindrome(self, s):
#         """
#         :type s: str
#         :rtype: bool
#         """
#         al = re.sub('[^A-Za-z0-9]+','',s).lower()
#         # 正则匹配
#         return al == al[::-1]

# class Solution(object):
#     """
#     暴力方法，对原字符串进行筛选,用到了字符串 isalnum() 方法,用来筛选字母和数字
#     """
#     def isPalindrome(self,s):
#         s_filter = ''.join(ch.lower() for ch in s if ch.isalnum() )
#         return s_filter == s_filter[::-1] # 暴力

class Solution(object):
    def isPalindrome(self,s):
        """
        双指针验证回文串
        """
        s_filter = ''.join(ch.lower() for ch in s if ch.isalnum())

        length = len(s_filter)

        left = 0
        right = length - 1

        while left < right:
            if s_filter[left] != s_filter[right]:
                return False
            left += 1
            right -= 1

        return True

# @lc code=end

