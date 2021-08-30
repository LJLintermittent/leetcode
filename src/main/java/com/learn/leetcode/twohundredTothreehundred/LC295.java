package com.learn.leetcode.twohundredTothreehundred;

import java.util.PriorityQueue;

/**
 * Description:
 * date: 2021/8/30 8:49
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC295 {

    public static void main(String[] args) {
        LC295 lc295 = new LC295();
        lc295.addNum(1);
        lc295.addNum(2);
        lc295.addNum(3);
        lc295.addNum(4);
        lc295.addNum(1);
        lc295.addNum(2);
        lc295.addNum(8);
        lc295.addNum(5);
        double ans = lc295.findMedian();
        System.out.println(ans);

    }

    PriorityQueue<Integer> maxQueue;

    PriorityQueue<Integer> minQueue;

    /**
     * 数据流的中位数
     * PriorityQueue,在java中用二叉小根堆来实现，可以用完全二叉树来表示，（任意一个非叶子节点的权值不大于它的左右两个子节点）
     * 所以根据这种情况可以用数组来作为PriorityQueue的底层实现
     * 将元素放入数组中，会发现数组编号与父节点与子节点之间是有关联的
     */
    public LC295() {
        //堆顶元素最小，小顶堆，记录大于中位数的数，所以在计算中位数的时候直接取小根堆的堆顶元素，就是算中位数要用的那个数
        maxQueue = new PriorityQueue<>((a, b) -> (a - b));
        //堆顶元素最大，大顶堆，记录小于中位数的数，大顶堆里面放小于中位数的数，所以计算的时候直接取堆顶元素
        minQueue = new PriorityQueue<>((a, b) -> (b - a));
    }

    public void addNum(int num) {
        if (minQueue.isEmpty() || num <= minQueue.peek()) {
            minQueue.offer(num);
            if (maxQueue.size() + 1 < minQueue.size()) {
                maxQueue.offer(minQueue.poll());
            }
        } else {
            maxQueue.offer(num);
            if (maxQueue.size() > minQueue.size()) {
                minQueue.offer(maxQueue.poll());
            }
        }
    }

    public double findMedian() {
        if (minQueue.size() > maxQueue.size()) {
            return minQueue.peek();
        }
        return (minQueue.peek() + maxQueue.peek()) / 2.0;

    }
}
