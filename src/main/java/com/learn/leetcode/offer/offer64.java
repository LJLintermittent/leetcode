package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/31 11:57
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer64 {

    public static void main(String[] args) {

    }

    /**
     * 剑指 Offer 64. 求1+2+…+n
     */
    public int sumNums(int n) {
        int sum  = n;
        boolean flag = n>0&& (sum+=sumNums(n-1)) > 0;
        return sum;
    }
}
