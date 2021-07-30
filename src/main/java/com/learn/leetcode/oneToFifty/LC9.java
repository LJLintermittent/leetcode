package com.learn.leetcode.oneToFifty;

/**
 * Description:
 * date: 2021/7/30 21:43
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC9 {

    public static void main(String[] args) {
        int x = 121;
        boolean ans = isPalindrome(x);
        System.out.println(ans);

    }

    /**
     * 回文数
     */
    public static boolean isPalindrome(int x) {
        //负数不可能有回文，且最后一位数字不能是0，因为如果最后一位是0，那么第一位就是0，显然不可能
        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        }
        int reverse = 0;
        //我们给原始数字除以10，给反转数字乘以10，所以当原始数字不大于反转数字的时候，就是处理了一半数字了
        while (x > reverse) {
            reverse = reverse * 10 + x % 10;
            x = x / 10;
        }
        //数字长度为奇数，我们要通过x == reverse / 10来去除中位数字
        return x == reverse || x == reverse / 10;
    }
}
