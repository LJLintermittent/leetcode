package com.learn.leetcode.onehundredToonehundredFifty;

/**
 * Description:
 * date: 2021/6/28 17:05
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC121 {

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 8, 12};
        int i = maxProfit(arr);
        System.out.println(i);
    }

    /**
     * 买卖股票的最佳时机
     * 思路：将自己买入的那天的价格想象为最低点 minprice
     * 遍历，如果后面某天的价格小于minprice，那么改变minprice
     * 否则代表后面某天的价格大于等于minprice，那么就用那天的价格减去minprice跟刚开始设定的
     * 最大收益来比较，直到找到最大受益
     */
    public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
