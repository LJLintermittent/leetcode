package com.learn.leetcode.twohundredTothreehundred;

/**
 * Description:
 * date: 2021/8/8 13:56
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC263 {

    public static void main(String[] args) {
        int n = 6;
        boolean ans = isUgly(n);
        System.out.println(ans);

    }

    /**
     * 丑数:只包含质因数为或2,3,5的正整数
     * 对能被2,3,5整除的数不断除2,3,5，最后剩1就是丑数，剩0就不是丑数，除2可以用位运算替换
     */
    public static boolean isUgly(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 2 == 0) {
            n = n >> 1;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        return n == 1;
    }
}
