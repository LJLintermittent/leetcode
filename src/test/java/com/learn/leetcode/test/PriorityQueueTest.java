package com.learn.leetcode.test;

import java.util.PriorityQueue;

/**
 * Description:
 * date: 2021/8/30 9:30
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class PriorityQueueTest {
    public static void main(String[] args) {
        //小顶堆
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> (a - b));
        //大顶堆
        PriorityQueue<Integer> queue1 = new PriorityQueue<>((a, b) -> (b - a));
        queue1.offer(1);
        queue1.offer(3);
        queue1.offer(4);
        queue1.offer(2);
        queue1.offer(1);
        queue1.offer(5);
        System.out.println(queue1);
    }
}
