package com.learn.leetcode.onehundredToonehundredFifty;

/**
 * Description:
 * date: 2021/6/30 11:42
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC123 {

    public static void main(String[] args) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        int i = maxProfit(prices);
        System.out.println(i);

    }

    /**
     * 买卖股票的最佳时机（三）
     * 最多只能完成两次交易
     */
    public static int maxProfit(int[] prices) {
        /**
         * 任意一天考虑四个变量
         * fstbuy：在该天第一次买入可获得的最大收益
         * fstsell：在该天第一次卖出可获得的最大收益
         * secbuy：在该天第二次买入可获得的最大收益
         * secsell：在该天第二次卖出可获得的最大收益
         */
        int fstbuy = Integer.MIN_VALUE;
        int fstsell = 0;
        int secbuy = Integer.MIN_VALUE;
        int secsell = 0;
        for (int p : prices) {
            fstbuy = Math.max(fstbuy, -p);
            fstsell = Math.max(fstsell, fstbuy + p);
            secbuy = Math.max(secbuy, fstsell - p);
            secsell = Math.max(secsell, secbuy + p);
        }
        return secsell;
    }
}
