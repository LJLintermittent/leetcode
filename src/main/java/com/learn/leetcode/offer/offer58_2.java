package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/28 13:03
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer58_2 {

    public static void main(String[] args) {

    }

    /**
     * 剑指 Offer 58 - II. 左旋转字符串
     */
    public String reverseLeftWords(String s, int n) {
        if (n == 0) {
            return s;
        }
        String substring = s.substring(n, s.length());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(substring);
        for (int i = 0; i < n; i++) {
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }
}
