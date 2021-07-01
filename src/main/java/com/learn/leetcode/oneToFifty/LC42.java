package com.learn.leetcode.oneToFifty;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/7/1 14:07
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC42 {

    public static void main(String[] args) {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height1 = {4, 2, 0, 3, 2, 5};
        int trap = trap(height);
        System.out.println(trap);

    }

    /**
     * 接雨水
     */
    public static int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int left = stack.peek();
                int currWidth = i - left - 1;
                int currHeight = Math.min(height[left], height[i]) - height[top];
                ans = ans + (currHeight * currWidth);
            }
            stack.push(i);
        }
        return ans;
    }

}
