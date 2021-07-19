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
        int[] nums = {1,2,3,8,5,7,6,4};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));

    }

    /**
     * 下一个排列
     */
    public static void nextPermutation(int[] nums) {
        int len = nums.length;
        for (int i = len - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                // i:from index; len: to index
                Arrays.sort(nums, i, len);
                for (int j = i; j < len; j++) {
                    if (nums[j] > nums[i - 1]) {
                        int temp = nums[j];
                        nums[j] = nums[i - 1];
                        nums[i - 1] = temp;
                        return;
                    }
                }
            }
        }
        Arrays.sort(nums);
        return;
    }
}
