#
# @lc app=leetcode.cn id=344 lang=python
#
# [344] 反转字符串
#

# @lc code=start
class Solution(object):
    def reverseString(self, s):
        """
        :type s: List[str]
        :rtype: None Do not return anything, modify s in-place instead.
        """
        n = len(s)
        if n % 2 == 1:
            i = n //2 + 1
        else:
            i = n / 2
        j = 0
        while j <= i:
            s[j], s[n-j-1] = s[n-j-1], s[j]
            j += 1
        return s
# @lc code=end

