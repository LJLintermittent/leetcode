package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/7/31 19:52
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer10_1 {

    public static void main(String[] args) {

    }

    /**
     * 剑指 Offer 10- I. 斐波那契数列
     */
    public int fib(int n) {
        int[] dp = new int[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n + 1; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }
        return dp[n];
    }
}
