package com.learn.leetcode.fiftyToOnehundred;

/**
 * Description:
 * date: 2021/7/25 21:18
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC69 {

    public static void main(String[] args) {
        int i = mySqrt(8);
        System.out.println(i);

    }

    /**
     * X的平方根
     */
    public static int mySqrt(int x) {
        int l = 0, r = x;
        int ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (mid * mid <= x) {
                ans = mid;
                //mid小了，应该往mid大的地方走
                l = mid + 1;
            } else {
                //mid大了，应该往mid小的地方走
                r = mid - 1;
            }
        }
        return ans;
    }

}
