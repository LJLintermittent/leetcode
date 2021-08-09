package com.learn.leetcode.oneToFifty;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/8/9 13:53
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC26 {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums1 = {1, 1, 2};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }

    /**
     * 删除有序数组中的重复项
     * 双指针
     */
    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        }
        int fast = 1;
        int slow = 1;
        while (fast < len) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static int removeDuplicates1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        if (nums.length == 2 && nums[0] == nums[1]) {
            return 1;
        } else if (nums.length == 2 && nums[0] != nums[1]) {
            return 2;
        }
        int count = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count--;
            }
        }
        return count;
    }
}
