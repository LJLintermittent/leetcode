package com.learn.leetcode.twohundredTothreehundred;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * date: 2021/8/4 12:32
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC268 {

    public static void main(String[] args) {
        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        int[] nums1 = {0, 1};
        int[] nums2 = {3, 0, 1};
//        int i = missingNumber1(nums2);
//        System.out.println(i);

        System.out.println(6^4);

    }

    /**
     * 丢失的数字
     */
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(nums[i]);
        }
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            if (!set.contains(i)) {
                ans = i;
                break;
            }
        }
        return ans;
    }

    /**
     * 异或
     * 两个值相异，结果为真
     */
    public static int missingNumber1(int[] nums) {
        int missnum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missnum ^= i ^ nums[i];
        }
        return missnum;
    }
}
