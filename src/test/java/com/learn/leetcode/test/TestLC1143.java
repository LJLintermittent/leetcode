package com.learn.leetcode.test;

/**
 * Description:
 * date: 2021/7/5 21:01
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TestLC1143 {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        int i = longestCommonSubsequence(s1, s2);
        System.out.println(i);
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            char char1 = text1.charAt(i - 1);
            for (int j = 1; j <= len2; j++) {
                char char2 = text2.charAt(j - 1);
                if (char1 == char2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[len1][len2];
    }
}
