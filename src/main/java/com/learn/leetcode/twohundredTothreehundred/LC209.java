package com.learn.leetcode.twohundredTothreehundred;

/**
 * Description:
 * date: 2021/8/3 14:36
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC209 {

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int ans = minSubArrayLen(7, nums);
        System.out.println(ans);

    }

    /**
     * 长度最小的子数组
     * 滑动窗口
     */
    public static int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < len) {
            sum = sum + nums[end];
            while (sum >= s) {
                ans = Math.min(ans, end - start + 1);
                sum = sum - nums[start];
                // 当找到大于目标值的子数组后，缩短窗口，体现在start++
                start++;
            }
            end++;
        }
        // 如果ans压根没有进入到第二个while循环，表示加完了也没到目标和
        // 那么直接ans就还是Integer.MAX_VALUE
        // 所以返回0
        return ans == Integer.MAX_VALUE ? 0 : ans;

    }
}
