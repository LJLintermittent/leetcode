package com.learn.leetcode.offer;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Description:
 * date: 2021/8/27 11:47
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer49 {

    public static void main(String[] args) {

    }

    /**
     * 丑数二
     */
    public int nthUglyNumber(int n) {
        int[] factor = {2, 3, 5};
        PriorityQueue<Long> queue = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        queue.offer(1L);
        set.add(1L);
        int ugly = 0;
        for (int i = 0; i < n; i++) {
            long cur = queue.poll();
            ugly = (int) cur;
            for (int num : factor) {
                long next = cur * num;
                if (set.add(next)) {
                    queue.offer(next);
                    set.add(next);
                }
            }
        }
        return ugly;
    }

}
