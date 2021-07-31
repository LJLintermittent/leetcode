package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/7/31 12:32
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer10 {

    public static void main(String[] args) {

    }

    /**
     * 剑指 Offer 10- II. 青蛙跳台阶问题
     */
    public int numWays(int n) {
        if (n < 2) {
            return 1;
        }
        int[] dp = new int[n + 2];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }
}
