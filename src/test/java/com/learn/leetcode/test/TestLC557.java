package com.learn.leetcode.test;

/**
 * Description:
 * date: 2021/7/23 9:46
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TestLC557 {

    public static void main(String[] args) {
        String s = " acd lijiale haha";
        String ans = reverseWords(s);
        System.out.println(ans);
    }

    /**
     * 反转字符串中的每一个单词3
     */
    public static String reverseWords(String s) {
        int len = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < len) {
            int start = i;
            while (i < len && s.charAt(i) != ' ') {
                i++;
            }
            for (int m = start; m < i; m++) {
                stringBuilder.append(s.charAt(start + i - 1 - m));
            }
            while (i < len && s.charAt(i) == ' ') {
                i++;
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }
}
