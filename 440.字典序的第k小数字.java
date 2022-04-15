/*
 * @lc app=leetcode.cn id=440 lang=java
 *
 * [440] 字典序的第K小数字
 */

// @lc code=start
//BFS+DFS
class Solution {
    public int findKthNumber(int n, int k) {
        //构造指针与前缀
        int point=1, curN =1;
        while(point<k){
            //当前要求数字是否在当前前缀下
            long count=getCount(curN,curN,n);
            if(point+count>k){//在当前前缀下
                curN *=10;
                //修改指针,把指针指向该节点下第一个子节点的位置
               //当前节点的子节点中，取走当前根节点，dfs向下 (比如 1 -> 10)
                point++;
            }else if(point+count<=k){//第k个数不在当前前缀下
                curN++;
                //修改指针,把指针指向同层下一前缀的起点
               //当前节点中总数都小于需要的数，可以全部取走，bfs到同层下一点 (比如 1 -> 2)
                point+=count;
            }
        }
        return curN;
    }
    //确定指定前缀下的所有子节点数(包括当前节点)
    //输入：相邻两前缀节点、上界
    public long getCount(long curN,long nextN, int n){
        if(curN>n){return 0;}
        //满十叉树及未满情况
        //当前层有 curN - nextN + 1 个节点可取，递归到下一层。
        long curCount=Math.min(nextN,n)-curN+1;
        //curN*10:从10变成100， nextN*10+9:从19变成199
        return curCount+getCount(curN*10,nextN*10+9,n);
    }
}
// @lc code=end

