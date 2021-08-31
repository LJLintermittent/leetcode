package com.learn.leetcode.offer;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/8/31 11:22
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer57 {

    public static void main(String[] args) {
        int[] nums = {1,3,7,10};
        int[] ans = twoSum(nums, 10);

        System.out.println(Arrays.toString(ans));

    }

    /**
     * 和为s的两个数字
     */
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{nums[left], nums[right]};
            } else if (nums[left] + nums[right] > target) {
                right--;
            } else {
                left++;
            }
        }
        return null;
    }
}
