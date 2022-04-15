#
# @lc app=leetcode.cn id=28 lang=python
#
# [28] 实现 strStr()
#

# @lc code=start
# class Solution(object):
#     def strStr(self, haystack, needle):
#         """
#         :type haystack: str
#         :type needle: str
#         :rtype: int
#         """
#         if needle not in haystack:
#             return -1
#         else:
#             return haystack.find(needle)

class Solution(object):
    def strStr(str, haystack, needle):
        """
        """
        l = len(needle)
        for i in range(len(haystack)-l+1):
            if haystack[i:i+l] == needle:
                return i

        return -1
            

# @lc code=end

