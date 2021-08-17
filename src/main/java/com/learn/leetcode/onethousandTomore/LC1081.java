package com.learn.leetcode.onethousandTomore;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/8/17 11:33
 * Package: com.learn.leetcode.onethousandTomore
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC1081 {

    public static void main(String[] args) {

    }

    /**
     * 不同字符的最小子序列
     */
    public String smallestSubsequence(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.contains(c)) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > c && s.indexOf(stack.peek(), i) != -1) {
                stack.pop();
            }
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
