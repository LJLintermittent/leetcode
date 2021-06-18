package com.learn.leetcode.twohundredTotwohundredFifty;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/6/18 22:03
 * Package: com.learn.leetcode.twohundredTotwohundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC215 {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        int k = 4;
        int i = findKthLargest(nums, k);
        System.out.println(i);
    }

    /**
     * 数组中的第k个最大元素
     */
    public static int findKthLargest(int[] nums, int k) {
        int length = nums.length;
        Arrays.sort(nums);
        return nums[length - k];
    }
}
