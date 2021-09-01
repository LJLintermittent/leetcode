package com.learn.leetcode.oneToFifty;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/9/1 12:01
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC32 {

    public static void main(String[] args) {
        String s = ")()())";
        int i = longestValidParentheses(s);
        System.out.println(i);

    }

    /**
     * 最长有效括号
     */
    public static int longestValidParentheses(String s) {
        int maxans = 0;
        Deque<Integer> stack = new LinkedList<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }
}
