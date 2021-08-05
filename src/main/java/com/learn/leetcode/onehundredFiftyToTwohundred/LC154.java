package com.learn.leetcode.onehundredFiftyToTwohundred;

/**
 * Description:
 * date: 2021/8/5 16:41
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC154 {

    public static void main(String[] args) {

    }

    /**
     * 寻找旋转排序数组中的最小值 II
     */
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else if (nums[mid] < nums[r]) {
                r = mid;
            } else {
                r--;
            }
        }
        return nums[l];
    }
}
