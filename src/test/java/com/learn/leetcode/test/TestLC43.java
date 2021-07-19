package com.learn.leetcode.test;

/**
 * Description:
 * date: 2021/7/19 9:54
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TestLC43 {

    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "24";

        String add = addStrings(s1, s2);
        System.out.println(add);
        String ans = multiply(s1, s2);
        System.out.println(ans);


    }

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int len1 = num1.length();
        int len2 = num2.length();
        String ans = "0";
        for (int i = len2 - 1; i >= 0; i--) {
            StringBuilder stringBuilder = new StringBuilder();
            int add = 0;
            for (int j = len2 - 1; j > i; j--) {
                stringBuilder.append(0);
            }
            int x = num2.charAt(i) - '0';
            for (int m = len1 - 1; m >= 0; m--) {
                int y = num1.charAt(m) - '0';
                int result = x * y + add;
                stringBuilder.append(result % 10);
                add = result / 10;
            }
            if (add != 0) {
                stringBuilder.append(add % 10);
            }
            ans = addStrings(ans, stringBuilder.reverse().toString());
        }
        return ans;
    }

    //大数相加
    private static String addStrings(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int add = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? s1.charAt(i) - '0' : 0;
            int y = j >= 0 ? s2.charAt(j) - '0' : 0;
            int result = x + y + add;
            sb.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
