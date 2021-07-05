package com.learn.leetcode.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/7/5 15:21
 * Package: com.learn.leetcode.utils
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TestBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5};
//        int i = search(arr, 3);
        List<Integer> list = search(arr, 3);
        System.out.println(list);
    }

    public static List<Integer> search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        List<Integer> list = binarySearch(nums, left, right, target);
        return list;
//        if (list.size() == 1) {
//            Integer[] array = list.toArray(new Integer[0]);
//            return array[0];
//        }
//        return -1;
    }

    private static List<Integer> binarySearch(int[] nums, int left, int right, int target) {
        if (left > right) {
            return new ArrayList<>(10);
        }
        int midIndex = (left + right) / 2;
        int midVal = nums[midIndex];
        if (target > midVal) {
            return binarySearch(nums, midIndex + 1, right, target);
        } else if (target < midVal) {
            return binarySearch(nums, left, midIndex - 1, target);
        } else {
            int temp = midIndex - 1;
            List<Integer> list = new ArrayList<>();
            while (true) {
                if (temp < 0 || nums[temp] != target) {
                    break;
                }
                list.add(temp);
                temp--;
            }
            list.add(midIndex);
            temp = midIndex + 1;
            while (true) {
                if (temp > nums.length - 1 || nums[temp] != midVal) {
                    break;
                }
                list.add(temp);
                temp++;
            }
            return list;
        }
    }
}
