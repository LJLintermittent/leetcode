package com.learn.leetcode;

/**
 * Description:
 * date: 2021/6/16 20:23
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class LC13 {

    public static void main(String[] args) {
        String s = "IX";
        int i = romanToInt(s);
        System.out.println(i);
    }

    /**
     * 罗马数字转整数
     */
    public static int romanToInt(String s) {
        int sum = 0;
        int preNum = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int num = getValue(s.charAt(i));
            if (preNum < num) {
                sum = sum - preNum;
            }
            if (preNum >= num) {
                sum = sum + preNum;
            }
            preNum = num;
        }
        sum = sum + preNum;
        return sum;
    }

    private static int getValue(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
