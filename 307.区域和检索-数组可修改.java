/*
 * @lc app=leetcode.cn id=307 lang=java
 *
 * [307] 区域和检索 - 数组可修改
 */

// @lc code=start
class NumArray {
    private int[] sum; // sum[i] 表示第 i 个块的元素和
    private int size; // 块的大小
    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        int n = nums.length;
        size = (int) Math.sqrt(n); // 每个块的大小取 sqrt(n)
        sum = new int[(n+size-1) / size]; // n/size 向上取整
        for (int i = 0; i < n; i++) {
            sum[i / size] +=nums[i]; // 统计每个块的元素和
        }
    }
    
    public void update(int index, int val) {
        sum[index / size] = sum[index / size] +val - nums[index];
        nums[index] = val;
    }
    
    public int sumRange(int left, int right) {
        int b1 = left / size; // left 属于哪一块数
        int i1 = left % size; // 左端点属于小块的小索引
        int b2 = right / size; // right 属于哪一块数
        int i2 = right % size; // 右端点属于小块的小索引
        if (b1 == b2) {
            // 左右端点属于同一块
            int sum = 0;
            for (int j = i1; j <= i2; j++) {
                sum += nums[b1 * size + j];
            }
            return sum;
        }
        // 如果左右端点不属于同一块时，分三段处理
        int sum1 = 0;
        for (int j = i1; j < size; j++) {
            sum1 = sum1 + nums[b1 * size + j];
        }
        
        int sum2 = 0;
        for (int j = 0; j <= i2; j++) {
            sum2 = sum2 + nums[b2 * size + j];
        }

        int sum3 = 0;
        for (int j = b1 + 1; j < b2; j++) {
            sum3 = sum3 + sum[j]; // sum[j] 为第 j 块的元素和
        }
        return sum1 + sum2 + sum3;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */
// @lc code=end

