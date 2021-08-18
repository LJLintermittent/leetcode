package com.learn.leetcode.fourhundredTofivehundred;

/**
 * Description:
 * date: 2021/8/18 11:28
 * Package: com.learn.leetcode.fourhundredTofivehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC416 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 1};
        boolean ans = canPartition(nums);
        System.out.println(ans);
    }

    /**
     * 分割等和子集
     * 01背包问题，给定一个数组，和一个容量为W的背包，有多少种拿东西的方式可以把背包装满
     */
    public static boolean canPartition(int[] nums) {
        int lne = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        if (sum % 2 != 0) {
            return false;
        }
        // 背包容量
        int w = sum / 2;
        int[] dp = new int[w + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = w; i >= num; i--) {
                //对于当前的第i个物品，有拿和不拿两种情况，dp[i]表示不拿的情况，dp[i-num]表示拿的情况，因此要将两者相加
                dp[i] = dp[i] + dp[i - num];
            }
        }
        return dp[w] != 0;

    }

    /**
     * 分割等和子集
     */
    public boolean canPartition1(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return false;
        }
        int sum = 0, maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        if (maxNum > target) {
            return false;
        }
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        for (int i = 0; i < len; i++) {
            int num = nums[i];
            for (int j = target; j >= num; j--) {
                dp[j] |= dp[j - num];
            }
        }
        return dp[target];
    }
}
