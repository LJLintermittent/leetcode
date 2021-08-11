package com.learn.leetcode.fiftyToOnehundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/8/11 11:29
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC75 {

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));

    }

    /**
     * 颜色分类
     */
    public static void sortColors(int[] nums) {
        int n0 = 0, n1 = 0, n2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[n2++] = 2;
                nums[n1++] = 1;
                nums[n0++] = 0;
            } else if (nums[i] == 1) {
                nums[n2++] = 2;
                nums[n1++] = 1;
            } else {
                nums[n2++] = 2;
            }
        }
    }

    /**
     * 颜色分类
     */
    public static void sortColors1(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return;
        }
        int p = 0;
        int q = len - 1;
        for (int i = 0; i <= q; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[p];
                nums[p] = 0;
                p++;
            }
            if (nums[i] == 2) {
                nums[i] = nums[q];
                nums[q] = 2;
                q--;
                if (nums[i] != 1) {
                    i--;
                }
            }
        }
        return;
    }
}
