package com.learn.leetcode.onethousandTomore;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 * date: 2021/8/20 10:14
 * Package: com.learn.leetcode.onethousandTomore
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC1306 {

    public static void main(String[] args) {
        int[] arr = {4,2,3,0,3,1,2};
        boolean ans = canReach(arr, 5);
        System.out.println(ans);

    }

    /**
     * 跳跃游戏 III
     */
    public static boolean canReach(int[] arr, int start) {
        if (arr[start] == 0) {
            return true;
        }
        int len = arr.length;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        boolean[] used = new boolean[len];
        used[start] = true;
        while (!queue.isEmpty()) {
            // top是下标
            Integer top = queue.poll();
            if (top + arr[top] < len && !used[top + arr[top]]) {
                if (arr[top + arr[top]] == 0) {
                    return true;
                }
                // top + arr[top]也表示原数组中的下标位置
                queue.offer(top + arr[top]);
                used[top + arr[top]] = true;
            }
            if (top - arr[top] >= 0 && !used[top - arr[top]]) {
                if (arr[top - arr[top]] == 0) {
                    return true;
                }
                queue.offer(top - arr[top]);
                used[top - arr[top]] = true;
            }
        }
        return false;
    }
}
