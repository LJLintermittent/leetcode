package com.learn.leetcode.oneToFifty;


import java.util.Arrays;

/**
 * Description:
 * date: 2021/4/1 23:00
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class LC4 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 5};
        int[] nums2 = {3, 5, 7, 9};

//        System.out.println(nums1.length);
//        System.out.println(nums2.length);

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    /**
     * *****************************寻找两个正序数组的中位数
     *
     * @param nums1 数组1
     * @param nums2 数组2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length - 1;
        int n = nums2.length - 1;
        int end = nums1.length + nums2.length - 1;
        int[] nums3 = new int[end + 1];
        for (int i = 0; i <= m; i++) {
            nums3[i] = nums1[i];
        }
        double k = 0;
        while (n >= 0) {
            nums3[end--] = (m >= 0 && nums1[m] > nums2[n]) ? nums1[m--] : nums2[n--];
        }
        System.out.println(Arrays.toString(nums3));
        if ((nums3.length) % 2 != 0) {
            k = (double) nums3[(nums3.length) / 2];
        } else if ((nums3.length) % 2 == 0) {
            k = (double) (nums3[(nums3.length) / 2] + nums3[(nums3.length) / 2 - 1]) / 2;
        }
        return k;
    }
}
