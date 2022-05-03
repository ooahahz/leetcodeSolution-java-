import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=937 lang=java
 *
 * [937] 重新排列日志文件
 */

// @lc code=start
class Solution {
    public String[] reorderLogFiles(String[] logs) {
        int length = logs.length;
        Pair[] arr = new Pair[length];
        for (int i = 0; i < length; i++) {
            arr[i] = new Pair(logs[i], i); // 相当于HashMap
        }
        Arrays.sort(arr, (a, b) -> logCompare(a, b)); // 新的比较器
        String[] reOrdered = new String[length];
        for (int i = 0; i < length; i++) {
            reOrdered[i] = arr[i].log;
        }
        return reOrdered;
    }

    public int logCompare(Pair pair1, Pair pair2) {
        String log1 = pair1.log, log2 = pair2.log;
        int index1 = pair1.index, index2 = pair2.index;
        String[] split1 = log1.split(" ", 2); // 第二个参数是切割的份数
        String[] split2 = log2.split(" ", 2);
        // 判断是否为数字类型
        boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
        boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
        if (isDigit1 && isDigit2) {// 如果两个比较都是数字类型，则按照序号的相对大小比较
            return index1 - index2;
        }
        if (!isDigit1 && !isDigit2) { // 如果两个都是字母类型
            int sc = split1[1].compareTo(split2[1]);// 比较两个字符串
            if (sc != 0) { // 如果内容不相等，直接返回比较结果
                return sc;
            }
            // 内容相等，则比较它们的
            return split1[0].compareTo(split2[0]);
        }
        return isDigit1 ? 1 : -1; // 把数字类型排在后面
    }
}

class Pair {
    String log;
    int index;

    public Pair(String log, int index) {
        this.log = log;
        this.index = index;
    }
}
// @lc code=end
