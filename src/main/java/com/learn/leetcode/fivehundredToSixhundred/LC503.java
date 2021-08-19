package com.learn.leetcode.fivehundredToSixhundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/8/19 12:43
 * Package: com.learn.leetcode.fivehundredToSixhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC503 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 3};
        int[] nums1 = {1, 2, 1};
        int[] nums2 = {-2, -1};
        int[] ans = nextGreaterElements(nums);
        System.out.println(Arrays.toString(ans));
    }

    /**
     * 下一个更大元素 II
     */
    public static int[] nextGreaterElements(int[] nums) {
        if (nums.length < 2) {
            return new int[]{-1};
        }
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                ans[i] = -1;
                continue;
            }
            int j = i + 1;
            while (j <= nums.length) {
                if (j == nums.length) {
                    j = 0;
                }
                if (nums[i] < nums[j]) {
                    ans[i] = nums[j];
                    break;
                }
                j++;
            }
        }
        return ans;
    }
}
