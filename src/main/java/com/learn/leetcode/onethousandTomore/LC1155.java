package com.learn.leetcode.onethousandTomore;

/**
 * Description:
 * date: 2021/8/18 10:56
 * Package: com.learn.leetcode.onethousandTomore
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC1155 {

    public static void main(String[] args) {

        int i = numRollsToTarget(2, 6, 7);
        System.out.println(i);

    }

    private static final int MOD = 1000000007;

    /**
     * 掷骰子的N种方法
     * dp[i][j]表示扔i个骰子的和为j的组合个数
     */
    public static int numRollsToTarget(int d, int f, int target) {
        int[][] dp = new int[31][1001];
        int min = Math.min(f, target);
        for (int i = 1; i <= min; i++) {
            dp[1][i] = 1;
        }
        int targetMax = d * f;
        for (int i = 2; i <= d; i++) {
            for (int j = i; j <= targetMax; j++) {
                for (int k = 1; j - k >= 0 && k <= f; k++) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - k]) % MOD;
                }
            }
        }
        return dp[d][target];

    }
}

