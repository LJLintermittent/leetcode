package com.learn.leetcode.onehundredFiftyToTwohundred;

/**
 * Description:
 * date: 2021/7/22 21:36
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC162 {

    public static void main(String[] args) {
        int[] nums = {2, 1};

        int ans = findPeakElement(nums);
        System.out.println(ans);
    }

    /**
     * 迭代二分查找
     * 时间复杂度为logN
     */
    public static int findPeakElement(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    /**
     * 寻找峰值
     * 线性扫描
     */
    public static int findPeakElement1(int[] nums) {
        int len = nums.length - 1;
        for (int i = 0; i < len; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums.length - 1;
    }
}
