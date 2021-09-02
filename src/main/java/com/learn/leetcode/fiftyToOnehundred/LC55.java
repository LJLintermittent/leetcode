package com.learn.leetcode.fiftyToOnehundred;

/**
 * Description:
 * date: 2021/9/2 11:46
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC55 {

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        boolean ans = canJump(nums);

        System.out.println(ans);

    }

    /**
     * 跳跃游戏
     */
    public static boolean canJump(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                return false;
            }
            k = Math.max(k, i + nums[i]);
        }
        return true;
    }
}
