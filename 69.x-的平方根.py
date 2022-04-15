#
# @lc app=leetcode.cn id=69 lang=python
#
# [69] x 的平方根
#

# @lc code=start
class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        可以使用牛顿迭代法
        """
        # if x <=1:
        #     return x
        # init = x
        # while init > x / init:  # 这里的循环条件为什么可以这么取 
        #         init =(init + x/init) // 2  # 这里为什么不能改成 * 1/2 可以 改成 * 0.5
        # return int(init)
######################################################
        # if x == 0:
        #     return 0
        # x0, x = float(0.5*x), float(x)
        # while True:
        #     xi = 0.5 * (x0 + x/x0)
        #     if abs(x0-xi) < 1e-7:
        #         break
        #     x0 = xi
        # return int(x0)

class Solution:
    """
    二分法二分查找的下界为 00，上界可以粗略地设定为 xx。在二分查找的每一步中，我们只需要比较中间元素 \textit{mid}mid 的平方与 xx 的大小关系，并通过比较的结果调整上下界的范围。由于我们所有的运算都是整数运算，不会存在误差，因此在得到最终的答案 \textit{ans}ans 后，也就不需要再去尝试 \textit{ans} + 1ans+1 了
    """
    def mySqrt(self, x):
        l, r, ans = 0, x, -1
        while l <= r:
            mid = (l + r) // 2
            if mid * mid <= x:
                ans = mid
                l = mid + 1
            else:
                r = mid - 1
        return ans


# @lc code=end

