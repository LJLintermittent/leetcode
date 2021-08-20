package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/20 11:53
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer42 {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int ans = maxSubArray(nums);
        System.out.println(ans);
    }

    /**
     * 剑指 Offer 42. 连续子数组的最大和
     */
    public static int maxSubArray(int[] nums) {
        int pre = 0;
        int max = nums[0];
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            max = Math.max(max, pre);
        }
        return max;
    }
}
