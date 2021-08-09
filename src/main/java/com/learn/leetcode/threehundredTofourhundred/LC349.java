package com.learn.leetcode.threehundredTofourhundred;

import java.util.*;

/**
 * Description:
 * date: 2021/7/21 10:35
 * Package: com.learn.leetcode.threehundredTothreehundredfifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC349 {

    public static void main(String[] args) {
        int[] nums1 = {8, 0, 3};
        int[] nums2 = {0, 0};

        int[] s1 = {4, 9, 5};
        int[] s2 = {9, 4, 9, 8, 4};
        int[] ints = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ints));

    }

    /**
     * 两个数组的交集
     * 正经的实现
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>(16);
        Set<Integer> set2 = new HashSet<>(16);
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if (set1.contains(i)) {
                set2.add(i);
            }
        }
        int[] ans = new int[set2.size()];
        int j = 0;
        for (Integer integer : set2) {
            ans[j++] = integer;
        }
        return ans;
    }

    /**
     * 两个数组的交集
     * 不正经的实现
     */
    public static int[] intersection1(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>(16);
        int len = Math.max(nums1.length, nums2.length);
        int[] ans = new int[len];
        boolean flagA = false;
        boolean flagB = false;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == 0) {
                flagA = true;
            }
            if (!map.containsKey(nums1[i])) {
                map.put(nums1[i], i);
            }
        }
        for (int j = 0; j < nums2.length; j++) {
            if (nums2[j] == 0) {
                flagB = true;
            }
            if (map.containsKey(nums2[j])) {
                ans[j] = nums2[j];
            }
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < ans.length; i++) {
            if (flagA == true && flagB == true) {
                set.add(ans[i]);
            } else if (ans[i] != 0) {
                set.add(ans[i]);
            }
        }
        Object[] objects = set.toArray();
        int[] finalans = new int[set.size()];
        for (int i = 0; i < set.size(); i++) {
            finalans[i] = (int) objects[i];
        }
        return finalans;
    }
}
