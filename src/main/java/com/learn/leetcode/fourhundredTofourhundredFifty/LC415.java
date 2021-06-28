package com.learn.leetcode.fourhundredTofourhundredFifty;

/**
 * Description:
 * date: 2021/6/28 16:05
 * Package: com.learn.leetcode.fourhundredTofourhundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC415 {

    public static void main(String[] args) {
        String n1 = "1234";
        String n2 = "1239"; //2473
        String s = addStrings(n1, n2);
        System.out.println(s);
    }

    /**
     * 字符串相加
     * 大数相加
     */
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
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
