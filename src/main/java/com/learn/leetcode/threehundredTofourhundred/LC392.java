package com.learn.leetcode.threehundredTofourhundred;

/**
 * Description:
 * date: 2021/8/16 11:47
 * Package: com.learn.leetcode.threehundredTofourhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC392 {

    public static void main(String[] args) {
        String s = "abe";
        String t = "acebfe";
        boolean ans = isSubsequence(s, t);
        System.out.println(ans);

    }

    /**
     * 判断子序列
     * 双指针
     */
    public static boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;
    }
}
