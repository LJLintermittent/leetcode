package com.learn.leetcode.onehundredFiftyToTwohundred;

import java.util.*;

/**
 * Description:
 * date: 2021/7/1 18:02
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC151 {

    public static void main(String[] args) {
        String s = "  Bob    Loves  Alice   ";
        String ans = reverseWords1(s);
        System.out.println(ans);

    }

    /**
     * 翻转字符串里的单词
     * 内置API
     */
    public static String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        List<String> strings = Arrays.asList(words);
        Collections.reverse(strings);
        return String.join(" ", strings);
    }

    /**
     * 双端队列
     */
    public static String reverseWords1(String s) {
        int left = 0, rigth = s.length() - 1;
        while (left <= rigth && s.charAt(left) == ' ') {
            left = left + 1;
        }
        while (left <= rigth && s.charAt(rigth) == ' ') {
            rigth = rigth - 1;
        }
        Deque<String> deque = new ArrayDeque<>();
        StringBuilder word = new StringBuilder();
        while (left <= rigth) {
            char c = s.charAt(left);
            if (word.length() != 0 && c == ' ') {
                //将单词添加到双端队列的头部，这样顺序就调过来了
                deque.offerFirst(word.toString());
                word.setLength(0);
            } else if (c != ' ') {
                word.append(c);
            }
            left = left + 1;
        }
        //最后一个字符由于到头了，没有办法通过再次判断为空字符进入循环来offerFirst
        //所以出了循环后还有再添加最后一个单词
        deque.offerFirst(word.toString());
        return String.join(" ", deque);
    }
}
