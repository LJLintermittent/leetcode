package com.learn.leetcode.twohundredTotwohundredFifty;

import java.util.*;

/**
 * Description:
 * date: 2021/7/28 9:55
 * Package: com.learn.leetcode.twohundredTotwohundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC239 {

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] ans = maxSlidingWindow(nums, 3);
        System.out.println(Arrays.toString(ans));
    }


    /**
     * 题解
     */
    public static int[] maxSlidingWindow1(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return nums;
        }
        LinkedList<Integer> list = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!list.isEmpty() && nums[list.peekLast()] <= nums[i]) {
                list.pollLast();
            }
            list.addLast(i);
            if (list.peek() <= i - k) {
                list.poll();
            }
            if (i - k + 1 >= 0) {
                res[i - k + 1] = nums[list.peek()];
            }
        }
        return res;
    }

    /**
     * 滑动窗口的最大值
     * 使用优先队列来优化数组排序
     * 依然超时
     */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int count = 0;
        for (int i = k - 1; i <= nums.length - 1; i++) {
            PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            for (int j = 1; j <= k; j++) {
                queue.offer(nums[i - k + j]);
            }
            ans[count] = queue.peek();
            count++;
        }
        return ans;
    }
}
