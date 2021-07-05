package com.learn.leetcode.onethousandTomore;


/**
 * Description:
 * date: 2021/7/5 15:34
 * Package: com.learn.leetcode.onethousandTomore
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC1143 {

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        int i = longestCommonSubsequence(s1, s2);
        System.out.println(i);

    }

    /**
     * 最长公共子序列
     * 动态规划
     */
    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int i = 1; i <= text1.length(); i++) {
            char char1 = text1.charAt(i - 1);
            for (int j = 1; j <= text2.length(); j++) {
                char char2 = text2.charAt(j - 1);
                if (char1 == char2) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
