package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/25 10:30
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer63 {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices1 = {7, 6, 4, 3, 1};
        int ans = maxProfit(prices1);
        System.out.println(ans);

    }

    /**
     * 剑指 Offer 63. 股票的最大利润
     */
    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                max = Math.max(max, prices[j] - prices[i]);
            }
        }
        return max > 0 ? max : 0;
    }
}
