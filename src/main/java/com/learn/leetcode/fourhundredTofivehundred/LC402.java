package com.learn.leetcode.fourhundredTofivehundred;

/**
 * Description:
 * date: 2021/8/29 10:39
 * Package: com.learn.leetcode.fourhundredTofivehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC402 {

    public static void main(String[] args) {
        String s = "1432219";
        String s1 = "10200";
        String s2 = "112";
        String ans = removeKdigits(s2, 1);
        System.out.println(ans);

    }

    /**
     * 移掉 K 位数字
     */
    public static String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder(num);
        for (int i = 0; i < k; i++) {
            for (int j = 1; j < stringBuilder.length() && stringBuilder.charAt(j) >= stringBuilder.charAt(j - 1); j++) {
                stringBuilder.deleteCharAt(j);
                while (stringBuilder.length() > 1 && stringBuilder.charAt(0) == '0') {
                    stringBuilder.deleteCharAt(0);
                }
            }
        }
        return stringBuilder.toString();

    }
}
