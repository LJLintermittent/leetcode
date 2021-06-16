package com.learn.leetcode.oneToFifty;


/**
 * Description:
 * date: 2021/4/3 17:35
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class LC3 {
    public static void main(String[] args) {
        String a = "abccc";
        int i = lengthOfLongestSubstring(a);
        System.out.println(i);
    }


    /**
     * ****************无重复字符的最长子串 (滑动窗口法)
     *
     * @param s 字符串
     * @return 无重复字符的最长子串的长度
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int left = 0;
        int right = 0;
        char[] c = s.toCharArray();
        for (int i = 1; i < c.length; i++) {
            for (int j = left; j < i; j++) {
                if (c[i] == c[j]) {
                    left = j + 1;
                }
            }
            right = Math.max(right, (i + 1 - left));
        }
        return right;
    }

}

/*
if (s.length() < 2) {
            return s.length();
        }
        int left = 0;
        int right = 0;
        char[] c = s.toCharArray();
        for (int i = 1; i < c.length; i++) {
            for (int j = left; j < i; j++) {
                if (c[i] == c[j]) {
                    left = j + 1;
                }
            }
            right = Math.max(right, (i + 1 - left));
        }
        return right;
 */
