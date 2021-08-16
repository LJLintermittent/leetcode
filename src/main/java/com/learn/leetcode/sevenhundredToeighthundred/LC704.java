package com.learn.leetcode.sevenhundredToeighthundred;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/7/5 14:46
 * Package: com.learn.leetcode.sevenhundredToeighthundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC704 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 7, 10};
        int i = search(nums, 10);
//        List<Integer> list = search(arr, 2);
        System.out.println("您要找的数字在该数组的下标为：" + i);
    }

    /**
     * 二分查找
     */
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        List<Integer> list = binarySearch(nums, left, right, target);
//        return list;
        if (list.size() == 1) {
            Integer[] array = list.toArray(new Integer[0]);
            return array[0];
        }
        return -1;
    }

    private static List<Integer> binarySearch(int[] nums, int left, int right, int target) {
        if (left > right) {
            return new ArrayList<>();
        }
        int midIndex = (left + right) / 2;
        int midVal = nums[midIndex];
        if (target > midVal) {
            return binarySearch(nums, midIndex + 1, right, target);
        } else if (target < midVal) {
            return binarySearch(nums, left, midIndex - 1, target);
        } else {
            int temp = midIndex - 1;
            List<Integer> list = new ArrayList<>(10);
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
                if (temp > nums.length - 1 || nums[temp] != target) {
                    break;
                }
                list.add(temp);
                temp++;
            }
            return list;
        }
    }
}
