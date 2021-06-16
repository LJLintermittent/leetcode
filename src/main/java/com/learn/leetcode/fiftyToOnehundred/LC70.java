package com.learn.leetcode.fiftyToOnehundred;

/**
 * Description:
 * date: 2021/4/1 21:06
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
public class LC70 {
    public static void main(String[] args) {
        LC70 climbStairs = new LC70();
        System.out.println(climbStairs.climbStairs(4));

    }

    /**
     *************************************爬楼梯
     * @param n： 楼梯的台阶数
     * @return    总共有多少种可能
     */
    public int climbStairs(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n不能小于1");
        }
        if (n == 1 || n == 2 || n == 3) {
            return n;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);

    }
}
