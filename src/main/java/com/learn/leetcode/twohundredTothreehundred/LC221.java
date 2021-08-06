package com.learn.leetcode.twohundredTothreehundred;

/**
 * Description:
 * date: 2021/8/6 13:46
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC221 {

    public static void main(String[] args) {

    }

    /**
     * 最大正方形
     * dp[i][j]表示以第i行第j列为右下角所能构成的最大正方形边长
     */
    public int maximalSquare(char[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (row < 1) {
            return 0;
        }
        int max = 0;
        int[][] dp = new int[row + 1][col + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (matrix[i - 1][j - 1] == '1') {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max * max;
    }
}
