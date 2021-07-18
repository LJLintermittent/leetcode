package com.learn.leetcode.oneToFifty;

import java.util.*;

/**
 * Description:
 * date: 2021/7/18 22:19
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC34 {
    public static void main(String[] args) {
        int[] nums1 = {5, 7, 7, 8, 8, 8, 10};
        int[] nums2 = {};

        int[] nums3 = {1, 2, 3, 3, 3, 3, 4, 5, 9};
//        List<Integer> list = binarySearch(nums3, 0, nums3.length - 1, 3);
//        System.out.println(list);
        int[] finalAns = searchRange2(nums3, 3);
        System.out.println(Arrays.toString(finalAns));
    }

    /**
     * 最终解法
     */
    public static int[] searchRange2(int[] nums, int target) {
        List<Integer> list = binarySearch(nums, 0, nums.length - 1, target);
        if (list.size() == 0) {
            return new int[]{-1, -1};
        }
        Integer firstIndex = list.get(0);
        Integer lastIndex = list.get(list.size() - 1);
        int[] ans = new int[]{firstIndex, lastIndex};
        return ans;
    }

    /**
     * 在排序数组中查找元素的第一个和最后一个位置
     */
    public static int[] searchRange1(int[] nums, int target) {
        int leftIndex = binarysearch(nums, target - 1);
        int rightIndex = binarysearch(nums, target) - 1;
        if (leftIndex <= rightIndex && nums[leftIndex] == target) {
            return new int[]{leftIndex, rightIndex};
        }
        return new int[]{-1, -1};
    }

    /**
     * 第一个大于target的数的下标
     */
    public static int binarysearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (target < nums[mid]) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private static List<Integer> binarySearch(int[] nums, int left, int right, int target) {
        if (left > right) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>(10);
        int midIndex = (left + right) / 2;
        int midVal = nums[midIndex];
        if (target > midVal) {
            return binarySearch(nums, midIndex + 1, right, target);
        } else if (target < midVal) {
            return binarySearch(nums, left, midIndex - 1, target);
        } else {
            int temp = midIndex - 1;
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
            Collections.sort(list);
            return list;
        }
    }

    /**
     * 在排序数组中查找元素的第一个和最后一个位置
     */
    public static int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) {
            return new int[]{-1, -1};
        }
        int[] ans = new int[len + 2];
        HashSet<Integer> set = new HashSet<>(16);
        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        } else if (nums.length == 1 && nums[0] != target) {
            return new int[]{-1, -1};
        }
        for (int i = 0; i <= len; i++) {
            if (nums[i] == target && !set.contains(nums[i])) {
                set.add(nums[i]);
                ans[0] = i;
            }
            if (nums[i - 1] == target && nums[i] != target) {
                ans[1] = i - 1;
            }
        }
        int[] finalans = Arrays.copyOfRange(ans, 0, 2);
        if (finalans[0] == 0 && finalans[1] == 0) {
            return new int[]{-1, -1};
        }
        return finalans;
    }
}
