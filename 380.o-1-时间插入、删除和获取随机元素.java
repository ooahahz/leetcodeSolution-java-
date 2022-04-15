import java.util.List;

/*
 * @lc app=leetcode.cn id=380 lang=java
 *
 * [380] O(1) 时间插入、删除和获取随机元素
 */

// @lc code=start
class RandomizedSet {

    List<Integer> list;
    public RandomizedSet() {
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) - val == 0) {
                return false;
            }
        }
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) - val == 0) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public int getRandom() {
        return list.get((int) (Math.random() * list.size()));

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
// @lc code=end

