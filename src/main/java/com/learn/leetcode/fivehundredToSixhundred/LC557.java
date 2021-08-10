package com.learn.leetcode.fivehundredToSixhundred;

/**
 * Description:
 * date: 2021/7/22 10:03
 * Package: com.learn.leetcode.fivehundredToSixhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC557 {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);
    }

    /**
     * 反转字符串中的单词Ⅲ
     */
    public static String reverseWords(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = s.length();
        int i = 0;
        while (i < length) {
            int start = i;
            while (i < length && s.charAt(i) != ' ') {
                i++;
            }
            for (int p = start; p < i; p++) {
                stringBuilder.append(s.charAt(start + i - 1 - p));
            }
            while (i < length && s.charAt(i) == ' ') {
                i++;
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }
}