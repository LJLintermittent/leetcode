package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/24 12:54
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer15 {

    public static void main(String[] args) {

    }

    /**
     * 二进制中1的个数
     */
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            //每次把n的二进制的最低位从1变成0，统计变的次数
            n = n & (n - 1);
            ans++;
        }
        return ans;
    }
}
