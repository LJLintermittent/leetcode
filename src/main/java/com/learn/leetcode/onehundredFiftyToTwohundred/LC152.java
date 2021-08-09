package com.learn.leetcode.onehundredFiftyToTwohundred;

/**
 * Description:
 * date: 2021/8/9 10:51
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC152 {

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int[] nums1 = {-2, 3, -4};
        int ans = maxProduct(nums1);

        System.out.println(ans);
    }

    /**
     * 乘积最大子数组
     * 如果数组的数为负数，那么相乘会导致最小的变最大，最大的变最小，交换这两个数
     */
    public static int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        int imax = 1;
        int imin = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(imax * nums[i], nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);
            res = Math.max(res, imax);
        }
        return res;
    }
}
