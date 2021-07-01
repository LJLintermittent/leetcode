package com.learn.leetcode.test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Description:
 * date: 2021/7/1 18:49
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TestLC151 {
    public static void main(String[] args) {
        String s = "Alice does not even like bob";
        String ans = reverseWords(s);
        System.out.println(ans);
    }

    public static String reverseWords(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left <= right && s.charAt(left) == ' ') {
            left = left + 1;
        }
        while (left <= right && s.charAt(right) == ' ') {
            right = right - 1;
        }
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder word = new StringBuilder();
        while (left <= right) {
            char c = s.charAt(left);
            if (word.length() != 0 && c == ' ') {
                deque.addFirst(word.toString());
                word.setLength(0);
            } else if (c != ' ') {
                word.append(c);
            }
            left = left + 1;
        }
        deque.addFirst(word.toString());
        return String.join(" ", deque);
    }
}
