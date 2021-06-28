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
     */
    public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprice = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprice) {
                maxprice = prices[i] - minprice;
            }
        }
        return maxprice;
    }
}
