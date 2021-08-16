package com.learn.leetcode.onethousandTomore;

/**
 * Description:
 * date: 2021/8/16 11:10
 * Package: com.learn.leetcode.onethousandTomore
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC1277 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 0, 1}, {1, 1, 0}, {1, 1, 0}};
        int ans = countSquares(matrix);

        System.out.println(ans);

    }

    /**
     * 统计全为 1 的正方形子矩阵
     */
    public static int countSquares(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        // dp[i][j]表示以（i，j）为右下角的位置可能组成的正方形的个数
        int[][] dp = new int[row][col];
        int ans = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 1) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                        ans++;
                        continue;
                    }
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
                    ans += dp[i][j];
                }
            }
        }
        return ans;
    }
}
