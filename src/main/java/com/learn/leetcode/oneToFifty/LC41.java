package com.learn.leetcode.oneToFifty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * date: 2021/7/23 10:06
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC41 {

    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        int[] nums1 = {1, 2, 0};
        int[] nums2 = {7, 8, 9, 11, 12};
        int[] nums3 = {5, 7, -5, 0, 4};
        int[] nums4 = {-5};
        int ans = firstMissingPositive(nums4);
        System.out.println(ans);

    }

    /**
     * 缺失的第一个正数
     */
    public static int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>(16);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            set.add(nums[i]);
        }
        Arrays.sort(nums);
        int max = nums[len - 1];
        for (int i = 1; i < max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        if (max < 0) {
            return 1;
        }
        return max + 1;
    }
}
