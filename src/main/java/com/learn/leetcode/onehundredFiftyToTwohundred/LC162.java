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
        int[] nums = {1, 2, 3, 4, 5};

        int ans = findPeakElement(nums);
        System.out.println(ans);
    }

    /**
     * 迭代二分查找
     */

    /**
     * 寻找峰值
     * 线性扫描
     */
    public static int findPeakElement(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1])
                return i;
        }
        return nums.length - 1;
    }
}
