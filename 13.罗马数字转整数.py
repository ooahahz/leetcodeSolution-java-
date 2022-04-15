#
# @lc app=leetcode.cn id=13 lang=python
#
# [13] 罗马数字转整数
#

# @lc code=start
# class Solution(object):
#     def romanToInt(self, s):
#         """
#         :type s: str
#         :rtype: int
#         """
#         dic = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
#         ans = 0
#         for i in range(len(s)):
#             if i < len(s)-1 and dic[s[i]]<dic[s[i+1]]:
#                 ans = ans - dic[s[i]]
#             else:
#                 ans = ans + dic[s[i]]

#         return ans

class Solution(object):
    def romanToInt(self, s):
        """
        """
        dic = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        ans = 0
        i = 0
        while i < len(s):
            if i + 1 < len(s) and dic[s[i]] < dic[s[i+1]]:
                ans += dic[s[i+1]] - dic[s[i]]
                i += 2
            else:
                ans += dic[s[i]]
                i += 1
        return ans
                
            

            
        
# @lc code=end

