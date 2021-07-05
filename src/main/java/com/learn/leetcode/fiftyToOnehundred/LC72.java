package com.learn.leetcode.fiftyToOnehundred;

/**
 * Description:
 * date: 2021/7/5 19:40
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC72 {

    public static void main(String[] args) {
        String s1 = "horse";
        String s2 = "ros";
        int i = minDistance(s1, s2);
        System.out.println(i);

    }

    /**
     * 编辑距离
     * 动态规划
     */
    public static int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 1; i <= len1; i++) {
            dp[i][0] = dp[i - 1][0] + 1;
        }
        for (int j = 1; j <= len2; j++) {
            dp[0][j] = dp[0][j - 1] + 1;
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1])) + 1;
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1]);
                }
            }
        }
        return dp[len1][len2];
    }

}
