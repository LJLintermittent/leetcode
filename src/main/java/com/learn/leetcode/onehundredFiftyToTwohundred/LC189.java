package com.learn.leetcode.onehundredFiftyToTwohundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/7/31 19:07
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC189 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] nums1 = {1, 2};
        rotate(nums1, 2);
        System.out.println(Arrays.toString(nums1));

    }

    /**
     * 旋转数组
     */
    public static void rotate(int[] nums, int k) {
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, (k % nums.length) - 1);
        reverse(nums, k % nums.length, nums.length - 1);

    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * 旋转数组
     * 当数组的长度小于K时，会出现下标越界情况
     */
    public static void rotate1(int[] nums, int k) {
        if (nums.length == 1) {
            return;
        }
        int[] copy = Arrays.copyOfRange(nums, 0, nums.length + 1);
        for (int i = 0; i < k; i++) {
            if (nums.length % 2 == 0) {
                nums[i] = nums[k + i];
            } else if (nums.length % 2 != 0) {
                nums[i] = nums[k + i + 1];
            }
        }
        int count = 0;
        for (int i = k; i < nums.length; i++) {
            nums[i] = copy[count++];
        }
    }
}
