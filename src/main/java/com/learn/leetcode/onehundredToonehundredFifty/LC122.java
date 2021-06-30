package com.learn.leetcode.onehundredToonehundredFifty;

/**
 * Description:
 * date: 2021/6/30 11:17
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC122 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int i = maxProfit(prices);
        System.out.println(i);
    }

    /**
     * 买卖股票的最佳时机 二
     * 思路：只要今天的价格大于上一天的价格，就卖出，并在当天买入，把收益一直累加
     */
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int length = prices.length;
        for (int i = 0; i < length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit = profit + prices[i + 1] - prices[i];
            }
        }
        return profit;
    }
}
