package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/12 9:40
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer48 {

    public static void main(String[] args) {
        String s = "pwwkew";
        int ans = lengthOfLongestSubstring(s);
        System.out.println(ans);
    }

    /**
     * 剑指 Offer 48. 最长不含重复字符的子字符串
     */
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int left = 0;
        int right = 0;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            for (int j = left; j < i; j++) {
                if (chars[i] == chars[j]) {
                    left = j + 1;
                }
            }
            right = Math.max(right, (i + 1 - left));
        }
        return right;
    }
}
