#
# @lc app=leetcode.cn id=20 lang=python
#
# [20] 有效的括号
#

# @lc code=start
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if len(s) % 2 == 1: # 如果长度为奇数，说明不匹配，直接返回 false 
            return False
        match = {"]":"[", ")":"(", "}":"{"}
        stack = list()
        for ch in s:
            if ch in {'(', '[', '{'}:
                stack.append(ch)
            else:
                if stack and stack[-1] == match[ch]:
                    stack.pop()
                else:
                    return False
        if stack == []:
            return True
        else:
            return False

# @lc code=end

