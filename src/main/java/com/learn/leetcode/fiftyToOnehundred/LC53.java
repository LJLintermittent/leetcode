package com.learn.leetcode.fiftyToOnehundred;

/**
 * Description:
 * date: 2021/7/5 21:12
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC53 {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = maxSubArray(arr);
        System.out.println(i);

    }

    /**
     * 最大子序和
     */
    public static int maxSubArray(int[] nums) {
        int pre = 0;
        int maxAns = nums[0];
        for (int x : nums) {
            //如果前边累加后还不如自身大，直接把前边的去掉，从自身开始重新累加
            pre = Math.max(pre + x, x);
            //保存最大值
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
