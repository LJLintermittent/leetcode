package com.learn.leetcode.twohundredTothreehundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/8/16 10:37
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC238 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] nums1 = {-1, 1, 0, -3, 3};
        int[] ans = productExceptSelf(nums1);

        System.out.println(Arrays.toString(ans));

    }

    /**
     * 除自身以外数组的乘积
     */
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        ans[0] = 1;
        for (int i = 1; i < len; i++) {
            ans[i] = nums[i - 1] * ans[i - 1];
        }
        int R = 1;
        for (int i = len - 1; i >= 0; i--) {
            ans[i] = ans[i] * R;
            R *= nums[i];
        }
        return ans;
    }

    /**
     * 除自身以外数组的乘积
     * 测试用例:[-1,1,0,-3,3]
     * 测试结果:[-9,9,0,-3,3]
     * 期望结果:[0,0,9,0,0]
     */
    public static int[] productExceptSelf1(int[] nums) {
        int[] ans = new int[nums.length];
        int x = 1;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                x = x * nums[i];
            } else if (!flag && nums[i] == 0) {
                nums[i] = 0;
                flag = true;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            if (nums[i] != 0) {
                if (flag == false) {
                    ans[i] = x / nums[i];
                } else {
                    ans[i] = 0;
                }
            } else if (flag && nums[i] == 0) {
                ans[i] = 0;
            }
        }
        return ans;
    }
}
