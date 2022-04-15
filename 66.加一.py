#
# @lc app=leetcode.cn id=66 lang=python
#
# [66] 加一
#

# @lc code=start
# class Solution(object):
#     def plusOne(self, digits):
#         """
#         :type digits: List[int]
#         :rtype: List[int]
#         """
#         s = 0
#         for i in range(len(digits)):
#             s = s + int(digits[i]) * 10**(len(digits)-i-1)
#         s = s + 1
#         ans = [int(x) for x in str(s)]
            

#         return ans 
class Solution(object):
    def plusOne(self, digits):
        """
        digits前面加0，loop 逢9进一，最后判断加上去的那个[0]要不要去掉 time:最好O(1)，最坏O(n) space:O(1) 无额外空间
        """
        digits = [0] + digits 
        for i in range(len(digits)-1,-1,-1):
            if digits[i]!=9:
                digits[i] += 1
                break
            else:
                digits[i] = 0
        if digits[0] == 0:
            return digits[1:]    
        else:
            return digits

        
            
            
# @lc code=end

