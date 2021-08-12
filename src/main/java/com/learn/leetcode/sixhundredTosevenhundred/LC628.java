package com.learn.leetcode.sixhundredTosevenhundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/8/12 10:38
 * Package: com.learn.leetcode.sixhundredTosevenhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC628 {

    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4};
        int ans = maximumProduct(nums);
        System.out.println(ans);
    }

    /**
     * 三个数的最大乘积
     */
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[0] * nums[1] * nums[n - 1],
                nums[n - 1] * nums[n - 2] * nums[n - 3]);

    }
}
