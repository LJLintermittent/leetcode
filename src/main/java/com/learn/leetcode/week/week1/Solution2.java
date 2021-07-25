package com.learn.leetcode.week.week1;

/**
 * Description:
 * date: 2021/7/24 22:53
 * Package: com.learn.leetcode.week
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Solution2 {

    public static void main(String[] args) {

    }

    /**
     * 最小未被占据椅子的编号
     * <p>
     * 有 n 个朋友在举办一个派对，这些朋友从 0 到 n - 1 编号。派对里有 无数 张椅子，
     * 编号为 0 到 infinity 。当一个朋友到达派对时，他会占据 编号最小 且未被占据的椅子。
     * <p>
     * 比方说，当一个朋友到达时，如果椅子 0 ，1 和 5 被占据了，那么他会占据 2 号椅子。
     * 当一个朋友离开派对时，他的椅子会立刻变成未占据状态。如果同一时刻有另一个朋友到达，可以立即占据这张椅子。
     * <p>
     * 给你一个下标从 0 开始的二维整数数组 times ，其中 times[i] = [arrivali, leavingi]
     * 表示第 i 个朋友到达和离开的时刻，同时给你一个整数 targetFriend 。所有到达时间 互不相同 。
     * <p>
     * 请你返回编号为 targetFriend 的朋友占据的 椅子编号 。
     */
    public int smallestChair(int[][] times, int targetFriend) {
        // i 表示朋友的个数
        int pnum = times.length;
        for (int i = 0; i < pnum; i++) {
            

        }


        return 0;
    }
}
