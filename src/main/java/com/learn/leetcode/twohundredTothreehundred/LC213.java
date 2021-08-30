package com.learn.leetcode.twohundredTothreehundred;

/**
 * Description:
 * date: 2021/8/30 8:28
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC213 {

    public static void main(String[] args) {

    }

    /**
     * 打家劫舍 II
     */
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp1 = new int[nums.length + 1];
        int[] dp2 = new int[nums.length + 1];
        dp1[1] = 0;
        dp2[1] = nums[0];
        //不偷第一个,偷最后一个
        for (int i = 1, j = 2; i < nums.length; i++, j++) {
            dp1[j] = Math.max(dp1[j - 1], nums[i] + dp1[j - 2]);
        }
        //偷第一个，不偷最后一个
        for (int i = 1, j = 2; i < nums.length - 1; i++, j++) {
            dp2[j] = Math.max(dp2[j - 1], nums[i] + dp2[j - 2]);
        }
        return Math.max(dp1[nums.length], dp2[nums.length - 1]);
    }
}
