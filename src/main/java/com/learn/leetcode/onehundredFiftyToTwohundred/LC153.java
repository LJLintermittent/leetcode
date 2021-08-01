package com.learn.leetcode.onehundredFiftyToTwohundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/8/1 19:41
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC153 {

    public static void main(String[] args) {

    }

    /**
     * 寻找旋转排序数组中的最小值
     * 二分思想
     */
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < nums[high]) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return nums[low];
    }

    public int findMin1(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
