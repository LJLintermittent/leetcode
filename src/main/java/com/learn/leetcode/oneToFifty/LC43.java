package com.learn.leetcode.oneToFifty;

/**
 * Description:
 * date: 2021/7/19 9:11
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC43 {

    public static void main(String[] args) {
        String n1 = "123";
        String n2 = "24";
        String ans = multiply(n1, n2);
        System.out.println(ans);

    }

    /**
     * 字符串相乘
     * 竖式相乘
     * 将乘数从右往左遍历，每一位与被乘数相乘
     * 注意乘数除了最后一位以外，其余的位与被乘数相乘后都要补零
     * 最后将结果相加
     * 算法中注意倒序与进位
     */
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return String.valueOf(0);
        }
        String ans = "0";
        int len1 = num1.length();
        int len2 = num2.length();
        for (int i = len2 - 1; i >= 0; i--) {
            StringBuilder stringBuilder = new StringBuilder();
            //进位
            int add = 0;
            // 乘数的最后一位不补零，其余位数均补零，j除了第一次循环外，
            // 后面j永远比i大
            for (int j = len2 - 1; j > i; j--) {
                stringBuilder.append(0);
            }
            //拿乘数的一位与后面将要循环了的被乘数的每一位相乘，注意进位
            int y = num2.charAt(i) - '0';
            for (int j = len1 - 1; j >= 0; j--) {
                int x = num1.charAt(j) - '0';
                int product = x * y + add;
                stringBuilder.append(product % 10);
                add = product / 10;
            }
            //如果最后还有进位，那么补上
            if (add != 0) {
                stringBuilder.append(add % 10);
            }
            //将结果每轮相加一次，注意反转字符串
            ans = addStrings(ans, stringBuilder.reverse().toString());
        }
        return ans;
    }

    public static String addStrings(String nums1, String nums2) {
        int i = nums1.length() - 1;
        int j = nums2.length() - 1;
        StringBuilder stringBuilder = new StringBuilder();
        int add = 0;
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? nums1.charAt(i) - '0' : 0;
            int y = j >= 0 ? nums2.charAt(j) - '0' : 0;
            int result = x + y + add;
            stringBuilder.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        stringBuilder.reverse();
        return stringBuilder.toString();

    }
}
