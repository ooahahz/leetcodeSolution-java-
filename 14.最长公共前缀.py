#
# @lc app=leetcode.cn id=14 lang=python
#
# [14] 最长公共前缀
#

# @lc code=start

####################################### SOLUTION 1 #####################################
# class Solution(object):
#     def longestCommonPrefix(self, strs):
#         """
#         :type strs: List[str]
#         :rtype: str
#         编写一个函数来查找字符串数组中的最长公共前缀，如果不存在公共前缀，返回空字符串""。
#         """
#         if not strs:
#             return ""
#         flag = len(strs[0])
#         for i in range(len(strs)):
#             flag = min(flag, len(strs[i]))
#             if flag == 0:
#                 return ""
#             for j in range(flag):
#                 if strs[0][j] != strs[i][j]:
#                     flag = j
#                     break
#         return strs[0][:flag]
#####################################################################################
######################################### SOLUTION 2 ################################
# class Solution:
#     def longestCommonPrefix(self, strs):
#         """
#         zip(*iterables) 创建了一个聚合了来自每个可迭代对象中的元素的迭代器。返回一个元组的迭代器，其中的第 i 个元组包含来自每个参数序列或可迭代对象的第i个元素。当输入可迭代对象中最短的一个被耗尽时，迭代器将终止迭代。当只有一个可迭代对象参数时，它将返回一个单元组的迭代器。不带参数时，它将返回一个空迭代器。


#         """
#         s = ''
#         for i in zip(*strs):
#             if len(set(i)) == 1: # 将i转化成集合，这样就可以用集合的性质来判断元素的个数
#                 s += i[0]
#             else:
#                 break
#         return s 

#####################################################################################
class Solution:
    """
    依次遍历字符串数组中的每个字符串，对于每个遍历到的字符串，更新最长公共前缀，当遍历完所有的字符串以后，即可得到字符串数组中的最长公共前缀。
    """
    def longestCommonPrefix(self, strs):
        if not strs:
            return ""
        prefix, count = strs[0], len(strs)
        for i in range(1, count):
            prefix = self.lcp(prefix, strs[i])
            if not prefix:
                break
        return prefix
    
    def lcp(self, str1, str2):
        """
        比较两个字符串，返回它们的前公共部分
        """
        length, index = min(len(str1), len(str2)), 0
        while index < length and str1[index] == str2[index]:
            index += 1
        return str2[:index] # 切片不包括索引 index 上的值

solution = Solution() 
a = solution.lcp('apple','app')
print(a)

print(solution.longestCommonPrefix(['appbyes', 'appbye','appbnab' ]))
# @lc code=end

