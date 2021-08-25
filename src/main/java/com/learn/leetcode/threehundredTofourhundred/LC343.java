package com.learn.leetcode.threehundredTofourhundred;

/**
 * Description:
 * date: 2021/8/25 11:27
 * Package: com.learn.leetcode.threehundredTofourhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC343 {

    public static void main(String[] args) {
    }

    /**
     * 整数拆分
     */
    public int integerBreak(int n) {
        if (n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }
        int sum = 1;
        while (n > 4) {
            sum *= 3;
            n = n - 3;
        }
        return sum * n;
    }
}
