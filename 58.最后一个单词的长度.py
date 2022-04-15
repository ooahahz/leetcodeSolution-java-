#
# @lc app=leetcode.cn id=58 lang=python
#
# [58] 最后一个单词的长度
#

# @lc code=start
class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        s = s.strip()
        if ' ' not in s:
           return len(s)
        for i,str in enumerate(s[::-1]):
           
            if s[len(s)-i-1] == ' ':
                break
        return i

# class Solution(object):
#     def lengthOfLastWord(self, s):
#         s = s.strip() # 去除字符串两边的空格，还有 lstrip, rstrip
#         L = s.split(' ')[-1] # 按空格切片，取出最后一个
#         return len(L)

# @lc code=end

