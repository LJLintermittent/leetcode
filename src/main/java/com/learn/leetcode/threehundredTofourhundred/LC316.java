package com.learn.leetcode.threehundredTofourhundred;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/8/17 11:05
 * Package: com.learn.leetcode.threehundredTofourhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC316 {

    public static void main(String[] args) {
        String s = "cbacdcbc";
        String s1 = removeDuplicateLetters(s);
        System.out.println(s1);

    }

    /**
     * 去除重复字母
     * 遇到一个新字符,如果比栈顶小并且在新字符后面还有和栈顶一样的,就把栈顶的字符抛弃了
     */
    public static String removeDuplicateLetters(String s) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.contains(c)) {
                continue;
            }
            // public int indexOf(int ch, int fromIndex):
            // 返回从 fromIndex 位置开始查找指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
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
