package com.learn.leetcode.week.test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Description:
 * date: 2021/9/22 10:53
 * Package: com.learn.leetcode.week.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class DaHua1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s;
        s = read.nextLine();
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        if (s == null) {
            return s;
        }
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.contains(c)) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() > c
                    && s.indexOf(stack.peek(), i) > 0) {
                stack.pop();
            }
            stack.push(c);
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()) {
            sb.append(stack.pollLast());
        }
        return sb.toString();
    }
}
