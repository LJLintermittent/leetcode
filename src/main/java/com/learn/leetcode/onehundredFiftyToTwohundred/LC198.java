package com.learn.leetcode.onehundredFiftyToTwohundred;

/**
 * Description:
 * date: 2021/8/3 11:49
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC198 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 3, 1};
        int[] nums1 = {4, 1, 1, 4};

        int ans = rob(nums1);
        System.out.println(ans);
    }

    /**
     * 打家劫舍
     * dp[i]表示包括下标为i的这间房子在内，所能偷到的最大金额
     */
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        //到了第二间房子，比较第一间和第二间谁的金额大，就偷谁
        dp[1] = Math.max(dp[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        //最大金额肯定是按照规则允许偷到最后一间房子的所获得的金额
        return dp[nums.length - 1];
    }
}
