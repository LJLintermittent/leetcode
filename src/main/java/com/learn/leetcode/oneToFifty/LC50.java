package com.learn.leetcode.oneToFifty;

/**
 * Description:
 * date: 2021/8/5 10:06
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC50 {

    public static void main(String[] args) {

    }

    /**
     * Pow(x, n)
     * 快速幂+递归
     */
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickPow(x, N) : 1.0 / quickPow(x, -N);
    }

    private double quickPow(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickPow(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }
}
