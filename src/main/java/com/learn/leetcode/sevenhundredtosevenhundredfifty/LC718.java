package com.learn.leetcode.sevenhundredtosevenhundredfifty;


/**
 * Description:
 * date: 2021/7/17 23:47
 * Package: com.learn.leetcode.sevenhundredtosevenhundredfifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC718 {

    public static void main(String[] args) {
        int[] nums1 = {0, 0, 0, 0, 1};
        int[] nums2 = {1, 0, 0, 0, 0};
        int length = findLength(nums1, nums2);
        System.out.println(length);

    }

    /**
     * 最长重复子数组
     * 动态规划
     * 子序列默认不连续，子数组默认连续
     */
    public static int findLength(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[][] dp = new int[len1 + 1][len2 + 1];
        int ans = 0;
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans;
    }
}

