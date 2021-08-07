package com.learn.leetcode.twohundredTothreehundred;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/8/7 13:21
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC224 {

    public static void main(String[] args) {
        String s = "(1+(4+5+2)-3)+(6+8)";
        int ans = calculate(s);
        System.out.println(ans);

    }

    /**
     * 基本计算器
     * 栈
     */
    public static int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        int i = 0;
        int res = 0;
        int len = s.length();
        int sign = 1;
        while (i < len) {
            if (s.charAt(i) == ' ') {
                i++;
            } else if (s.charAt(i) == '+') {
                sign = stack.peek();
                i++;
            } else if (s.charAt(i) == '-') {
                sign = -stack.peek();
                i++;
            } else if (s.charAt(i) == '(') {
                stack.push(sign);
                i++;
            } else if (s.charAt(i) == ')') {
                stack.pop();
                i++;
            } else {
                long num = 0;
                while (i < len && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + s.charAt(i) - '0';
                    i++;
                }
                res += sign * num;
            }
        }
        return res;
    }

    /**
     * 基本计算器
     */
    public static int calculate1(String s) {
        Deque<Integer> stack = new LinkedList<>();
        // sign为正负号
        int sign = 1;
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int cur = c - '0';
                while (i + 1 < len && Character.isDigit(s.charAt(i + 1))) {
                    cur = c * 10 + s.charAt(++i) - '0';
                }
                ans = ans + sign * cur;
            } else if (c == '+') {
                sign = 1;
            } else if (c == '-') {
                sign = -1;
            } else if (c == '(') {
                stack.push(ans);
                ans = 0;
                stack.push(sign);
                sign = 1;
            } else if (c == ')') {
                ans = stack.pop() * ans + stack.pop();
            }
        }
        return ans;
    }
}
