package com.learn.leetcode.onehundredFiftyToTwohundred;

/**
 * Description:
 * date: 2021/8/3 10:56
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC191 {

    public static void main(String[] args) {
        System.out.println(8 & 7);

    }

    /**
     * 位1的个数
     * Integer.bitCount()源码
     * 获取输入数字在二进制下的1的个数
     */
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            //n & (n - 1) 结果是每次把n的二进制的最低位的1变为了0
            n = n & (n - 1);
            ans++;
        }
        return ans;
    }

}
