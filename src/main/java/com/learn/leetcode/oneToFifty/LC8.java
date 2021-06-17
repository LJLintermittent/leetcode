package com.learn.leetcode.oneToFifty;

/**
 * Description:
 * date: 2021/6/17 14:33
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class LC8 {

    public static void main(String[] args) {
        String s = " -42";
        String s1 = "4193 with words";
        String s2 = "words and 987";
        String s3 = "-91283472332";
        System.out.println(myAtoi(s3));
    }

    /**
     * 字符串转换为整数
     */
    public static int myAtoi(String str) {
        str = str.trim();
        if (str.length() == 0) return 0;
        if (!Character.isDigit(str.charAt(0))
                && str.charAt(0) != '-' && str.charAt(0) != '+')
            return 0;
        long ans = 0L;
        boolean neg = str.charAt(0) == '-';
        int i = !Character.isDigit(str.charAt(0)) ? 1 : 0;
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            ans = ans * 10 + (str.charAt(i++) - '0');
            if (!neg && ans > Integer.MAX_VALUE) {
                ans = Integer.MAX_VALUE;
                break;
            }
            if (neg && ans > 1L + Integer.MAX_VALUE) {
                ans = 1L + Integer.MAX_VALUE;
                break;
            }
        }
        return neg ? (int) -ans : (int) ans;
    }

    public static String myAtoi1(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') {
                continue;
            } else if (s.charAt(i) == 'a' || s.charAt(i) == 'b') {
                return "0";
            } else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                stringBuilder.append(s.charAt(i));
            } else if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3' || s.charAt(i) == '4' ||
                    s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7' || s.charAt(i) == '8' || s.charAt(i) == '9') {
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}
