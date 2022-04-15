import java.util.List;

/*
 * @lc app=leetcode.cn id=682 lang=java
 *
 * [682] 棒球比赛
 */

// @lc code=start
class Solution {
    public int calPoints(String[] ops) {
    //     int[] arr = new int[ops.length];
    //     int i = 0;
    //     for (String s : ops) {
    //         if (s.equals("+")) {
    //             arr[i] = arr[i-1] + arr[i-2];
    //             i++;
    //         } else if (s.equals("D")) {
    //             arr[i] = arr[i - 1] * 2;
    //             i++;
    //         } else if (s.equals("C")) {
    //             arr[i - 1] = 0;
    //             i--;
    //         } else {
    //             arr[i] = Integer.valueOf(s);
    //             i++;
    //         }
    //     }
    //     int sum = 0;
    //     for (int k = 0; k < arr.length; k++) {
    //         sum+=arr[k];
    //     }
    //     return sum;

        // int[] arr = new int[ops.length];
        // int i = 0;
        // for (String s: ops) {
        //     switch (s) {
        //         case "+": arr[i] = arr[i - 1] + arr[i - 2];
        //         i++;
        //         break;
        //         case "D": arr[i] = 2 * arr[i - 1];
        //         i++;
        //         break;
        //         case "C": arr[i - 1] = 0;
        //         i--;
        //         break;
        //         default:
        //             arr[i] = Integer.valueOf(s);
        //             i++;
        //             break;
        //     }
        // }
        // int sum = 0;
        // for (int j = 0; j < arr.length; j++) {
        //     sum+=arr[j];
        // }
        // return sum;

        int ret = 0;
        List<Integer> points = new ArrayList<>();
        for (String op : ops) {
            int n = points.size();
            switch (op.charAt(0)) {
                case '+' :
                    ret += points.get(n - 1) + points.get(n - 2);
                    points.add(points.get(n - 1) + points.get(n - 2));
                    break;
                case 'D' :
                    ret += 2 * points.get(n - 1);
                    points.add(2 * points.get(n - 1));
                    break;
                case 'C' :
                    ret -= points.get(n - 1);
                    points.remove(n - 1);
                    break;
                default :
                    ret += Integer.parseInt(op);
                    points.add(Integer.parseInt(op));
            }
        }
        return ret;
    }
}
// @lc code=end

