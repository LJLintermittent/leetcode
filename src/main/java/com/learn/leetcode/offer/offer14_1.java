package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/25 11:09
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer14_1 {

    public static void main(String[] args) {


    }

    /**
     * 剑指 Offer 14- I. 剪绳子
     */
    public int cuttingRope(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int sum = 1;
        while (n > 4) {
            sum *= 3;
            n -= 3;
        }
        return sum * n;
    }
}
