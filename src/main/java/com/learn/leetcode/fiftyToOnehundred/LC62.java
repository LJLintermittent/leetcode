package com.learn.leetcode.fiftyToOnehundred;

/**
 * Description:
 * date: 2021/8/1 22:03
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC62 {

    public static void main(String[] args) {

        System.out.println(uniquePaths(3, 7));
    }

    /**
     * 不同路径
     * 动态规划
     * dp[i][j]表示从左上角走到（i，j）位置的路径的数量
     */
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];

    }
}
