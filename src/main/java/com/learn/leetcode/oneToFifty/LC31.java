package com.learn.leetcode.oneToFifty;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/7/19 22:19
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC31 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 8, 5, 7, 6, 4};
        int[] n2 = {3, 2, 1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }

    /**
     * 下一个排列
     */
    public static void nextPermutation(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i > 0; i--) {
            //从后往前遍历，碰到的第一个升序的相邻元素对
            if (nums[i] > nums[i - 1]) {
                //那么这时候i的后面的元素一定是降序的
                //我们再调成升序，以取最小
                Arrays.sort(nums, i, len);
                for (int j = i; j < len; j++) {
                    if (nums[j] > nums[i - 1]) {
                        swap(nums, j, i - 1);
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);
        return;
    }

    private static void swap(int[] nums, int m, int n) {
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }
}
