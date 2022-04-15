#
# @lc app=leetcode.cn id=904 lang=python
#
# [904] 水果成篮
#

# @lc code=start
class Solution(object):
    def totalFruit(self, fruits):
        """
        :type fruits: List[int]
        :rtype: int
        """
        # # 按块扫描
        # blocks = [(k,len(list(v))) for k, v in itertools.groupby(fruits)]

        # ans = i = 0
        # while i < len(blocks):
        #     # We'll start scan at block[i].
        #     # types: the different values of fruits[i] seen
        #     # weight: the total number of fruits represented
        #     #         by blocks under consideration
        #     types, weight = set(), 0

        #     # For each block from i and going forword,
        #     for j in xrange(i, len(blocks)):
        #         # add each block to consideration
        #         types.add(blocks[j][0])
        #         weight += blocks[j][1]

        #         # if we have 3 types, this is not a legal subarray
        #         if len(types) >= 3:
        #             i = j - 1
        #             break
                
        #         ans = max(ans, weight)

        #     # if we go to the last block, then stop
        #     else:
        #         break
        # return ans

        # 滑动窗口
        ans = i = 0
        count = collections.Counter()
        for j, x in enumerate(fruits):
            count[x] += 1
            while len(count) >= 3:
                count[fruits[i]] -= 1
                if count[fruits[i]] == 0:
                    del count[fruits[i]]
                i += 1
            ans = max(ans, j-i+1)
        return ans

# @lc code=end

