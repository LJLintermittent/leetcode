package com.learn.leetcode.fivehundredToSixhundred;

/**
 * Description:
 * date: 2021/8/11 10:30
 * Package: com.learn.leetcode.fivehundredToSixhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC509 {

    public static void main(String[] args) {


    }

    /**
     * 斐波那契数
     */
    public int fib(int n) {
        int[] dp = new int[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

}
