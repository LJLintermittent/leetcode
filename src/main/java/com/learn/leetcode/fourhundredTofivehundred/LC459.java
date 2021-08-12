package com.learn.leetcode.fourhundredTofivehundred;

/**
 * Description:
 * date: 2021/8/12 11:16
 * Package: com.learn.leetcode.fourhundredTofivehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC459 {

    public static void main(String[] args) {
        String s = "aba";
        boolean ans = repeatedSubstringPattern(s);
        System.out.println(ans);

    }

    /**
     * 重复的子字符串
     */
    public static boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s).append(s);
        String newstr = sb.substring(1, sb.length() - 1);
        return newstr.contains(s);
    }
}
