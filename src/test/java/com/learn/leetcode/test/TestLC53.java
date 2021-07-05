package com.learn.leetcode.test;

/**
 * Description:
 * date: 2021/7/5 21:48
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TestLC53 {
    public static void main(String[] args) {
        int[] arr = {2, 3, -5, 1, -2, 3, -1, 4};
        int i = maxSubArray(arr);
        System.out.println(i);
    }

    public static int maxSubArray(int[] nums) {
        int pre = 0;
        int max = nums[0];
        for (int x : nums) {
            //前面的算出来的最大的值加上遍历到的自己的本身，如果还没有本身大，则丢掉前面的，以本身开始重新累加
            pre = Math.max(pre + x, x);
            max = Math.max(max, pre);
        }
        return max;
    }

}
