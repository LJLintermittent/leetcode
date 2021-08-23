package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/23 10:26
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer46 {

    public static void main(String[] args) {
        int a = 12258;

        int i = translateNum(a);
        System.out.println(i);
    }

    /**
     * 剑指 Offer 46. 把数字翻译成字符串
     */
    public static int translateNum(int num) {
        if (num < 9) {
            return 1;
        }
        int ba = num % 100;
        if (ba <= 9 || ba >= 26) {
            return translateNum(num / 10);
        } else {
            return translateNum(num / 10) + translateNum(num / 100);
        }
    }
}
