package com.learn.leetcode.test;

/**
 * Description:
 * date: 2021/6/17 15:28
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class TestLC8 {
    public static void main(String[] args) {
        /**
         * Integer.MAX_VALUE + 1L = 2147483648
         * Integer.MAX_VALUE = 2147483647
         */
        String s = " -42";
        String s1 = "4193 with words";
        String s2 = "words and 987";
        String s3 = "-91283472332";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        String str = s.trim();
        if (str.length() == 0) {
            return 0;
        }
        if (!Character.isDigit(str.charAt(0)) && str.charAt(0) == '-' && str.charAt(0) == '+') {
            return 0;
        }
        long ans = 0L;
        boolean neg = str.charAt(0) == '-';
        //如果第一个字符不是数字那么返回1 否则返回0
        //例如 -42 那么i=1 就从4开始遍历
        // 55 i=0
        int i = !Character.isDigit(str.charAt(0)) ? 1 : 0;
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            ans = ans * 10 + (str.charAt(i++) - '0');
            //如果这串数字为整数 + 且越界2的31次方 -1
            if (!neg && ans > Integer.MAX_VALUE) {
                ans = Integer.MAX_VALUE;
                break;
            }
            //如果这串数字为负数 - 且越界 2的31次方
            if (neg && ans > 1L + Integer.MAX_VALUE) {
                ans = 1L + Integer.MAX_VALUE;
                break;
            }
        }
        return neg ? (int) -ans : (int) ans;
    }

}
