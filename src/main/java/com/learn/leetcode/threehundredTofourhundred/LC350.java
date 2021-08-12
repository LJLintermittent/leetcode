package com.learn.leetcode.threehundredTofourhundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/8/12 12:45
 * Package: com.learn.leetcode.threehundredTofourhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC350 {

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 9};
        int[] nums2 = {4,1};
        int[] ans = intersect(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    /**
     * 两个数组的交集 II
     * 排序后双指针
     */
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0;
        int index2 = 0;
        int ansIndex = 0;
        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        while (index1 < nums1.length && index2 < nums2.length) {
            if (nums1[index1] > nums2[index2]) {
                index2++;
            } else if (nums1[index1] < nums2[index2]) {
                index1++;
            } else {
                ans[ansIndex] = nums1[index1];
                index1++;
                index2++;
                ansIndex++;
            }
        }
        return Arrays.copyOfRange(ans, 0, ansIndex);
    }
}
