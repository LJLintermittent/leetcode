package com.learn.leetcode.offer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Description:
 * date: 2021/8/26 10:46
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer59_1 {

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] ans = maxSlidingWindow(nums, 3);
        System.out.println(Arrays.toString(ans));

    }

    /**
     * 剑指 Offer 59 - I. 滑动窗口的最大值
     */
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[0];
        }
        int[] ans = new int[nums.length - k + 1];
        int count = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = k - 1; i <= nums.length - 1; i++) {
            for (int j = 1; j <= k; j++) {
                queue.offer(nums[i - k + j]);
            }
            ans[count++] = queue.peek();
            queue.clear();
        }
        return ans;
    }
}
