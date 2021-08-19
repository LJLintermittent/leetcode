package com.learn.leetcode.twohundredTothreehundred;

import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * Description:
 * date: 2021/8/19 10:44
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC264 {

    public static void main(String[] args) {
        int n = 10;
        int i = nthUglyNumber(n);
        System.out.println(i);

    }

    /**
     * 丑数 II
     */
    public static int nthUglyNumber(int n) {
        int[] factor = {2, 3, 5};
        int ugly = 0;
        PriorityQueue<Long> heap = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        heap.offer(1L);
        set.add(1L);
        for (int i = 0; i < n; i++) {
            long cur = heap.poll();
            ugly = (int) cur;
            for (int num : factor) {
                long next = cur * num;
                if (set.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return ugly;
    }
}
