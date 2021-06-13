package com.learn.leetcode;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/4/2 0:52
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
public class LC88 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        LC88 lc88 = new LC88();
        lc88.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }

    /**
     * **************************合并两个有序数组
     *
     * @param nums1 数组1
     * @param m     数组1中元素个数（不是数组长度）
     * @param nums2 数组2
     * @param n     数组2中元素个数 （不是数组长度）
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int end = m + n - 1;
        while (j >= 0) {
            nums1[end--] = (i >= 0 && nums1[i] > nums2[j]) ? nums1[i--] : nums2[j--];
        }
    }

}
