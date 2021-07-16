package com.learn.leetcode.threehundredTothreehundredfifty;

/**
 * Description:
 * date: 2021/7/16 20:11
 * Package: com.learn.leetcode.threehundredTothreehundredfifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC300 {

    public static void main(String[] args) {
        int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
        int i = lengthOfLIS(nums);
        System.out.println(i);

    }

    /**
     * 最长递增子序列
     * 动态规划
     * <p>
     * 在动态规划中，通过线性遍历来计算dp的这个时间复杂度是无法降低的
     * 那么要使时间复杂度由N²降低为logN
     * 考虑使整个dp为一个排序列表，通过二分法遍历
     * 将复杂度降为logN
     */
    public static int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxans = 0;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxans = Math.max(maxans, dp[i]);
        }
        return maxans;
    }

    /**
     * N*logN时间复杂度
     * 思路:
     * tails[k] 的值代表 长度为 k+1k+1 子序列 的尾部元素值。
     * res为tails当前长度，代表直到当前的最长上升子序列长度
     */
    public static int lengthOfLIS1(int[] nums) {
        int[] tails = new int[nums.length];
        int res = 0;
        for (int num : nums) {
            int i = 0, j = res;
            while (i < j) {
                int m = (i + j) / 2;
                if (tails[m] < num) {
                    i = m + 1;
                } else {
                    j = m;
                }
            }
            tails[i] = num;
            if (res == j) {
                res++;
            }
        }
        return res;
    }

}
