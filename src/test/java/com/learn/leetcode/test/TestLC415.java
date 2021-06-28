package com.learn.leetcode.test;

/**
 * Description:
 * date: 2021/6/28 16:50
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TestLC415 {

    public static void main(String[] args) {
        String s1 = "1234";
        String s2 = "1239";
        System.out.println(addStrings(s1, s2));

    }

    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) {
                carry = carry + num1.charAt(i--) - '0';
            }
            if (j >= 0) {
                carry = carry + num2.charAt(j--) - '0';
            }
            sb.append(carry % 10);
            carry = carry / 10;
        }
        return sb.reverse().toString();
    }
}
