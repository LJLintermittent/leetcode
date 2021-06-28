package com.learn.leetcode.test;

/**
 * Description:
 * date: 2021/6/28 13:53
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TestLC165 {

    public static void main(String[] args) {
        String s1 = "1.2.3";
        String s2 = "1.2.4";
        int i = compareVersion(s1, s2);
        System.out.println(i);//1
    }

    public static int compareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\\.");
        String[] nums2 = version2.split("\\.");
        int length1 = nums1.length;
        int length2 = nums2.length;
        int i1, i2;
        for (int i = 0; i < Math.max(length1, length2); ++i) {
            i1 = i < length1 ? Integer.parseInt(nums1[i]) : 0;
            i2 = i < length2 ? Integer.parseInt(nums2[i]) : 0;
            if (i1 != i2) {
                return i1 > i2 ? 1 : -1;
            }
        }
        return 0;
    }
}
