package com.learn.leetcode.oneToFifty;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/7/23 10:34
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC33 {

    public static void main(String[] args) {
//        int[] nums = {0, 1, 2, 4, 5, 6, 7};
//        List<Integer> list = bs(nums, 0, nums.length - 1, 3);
//        System.out.println(list);
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int[] nums1 = {1};
        int[] nums2 = {-5};
        int i = search(nums, -5);
        System.out.println(i);
    }

    /**
     * 搜索旋转排序数组
     */
    public static int search(int[] nums, int target) {
        int index = 0;
        int i = 1;
        while (i < nums.length) {
            if (nums[i] > nums[i - 1]) {
                i++;
            } else if (nums[i] < nums[i - 1]) {
                index = i;
                break;
            }
        }
        if (target > nums[nums.length - 1]) {
            List<Integer> list = bs(nums, 0, index - 1, target);
            Integer[] array = list.toArray(new Integer[1]);
            if (list.size() == 0) {
                return -1;
            }
            return array[0];
        } else if (target < nums[nums.length - 1]) {
            List<Integer> list = bs(nums, index, nums.length - 1, target);
            if (list.size() == 0) {
                return -1;
            }
            Integer[] array = list.toArray(new Integer[1]);
            return array[0];
        } else {
            return nums.length - 1;
        }
    }

    public static List<Integer> bs(int[] nums, int left, int right, int target) {
        if (left > right) {
            return new ArrayList<>();
        }
        int midIndex = (left + right) / 2;
        int midValue = nums[midIndex];
        if (target > midValue) {
            return bs(nums, midIndex + 1, right, target);
        } else if (target < midValue) {
            return bs(nums, left, midIndex - 1, target);
        } else {
            List<Integer> list = new ArrayList<>(10);
            int temp = midIndex + 1;
            while (true) {
                if (temp > nums.length - 1 || nums[temp] != target) {
                    break;
                }
                list.add(temp);
                temp++;
            }
            list.add(midIndex);
            temp = midIndex - 1;
            while (true) {
                if (temp < 0 || nums[temp] != target) {
                    break;
                }
                list.add(temp);
                temp--;
            }
            return list;
        }
    }
}
