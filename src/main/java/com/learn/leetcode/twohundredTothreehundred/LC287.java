package com.learn.leetcode.twohundredTothreehundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/8/10 11:02
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC287 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int[] nums1 = {3, 1, 3, 4, 2};
        int ans = findDuplicate(nums1);
        System.out.println(ans);
    }

    /**
     * 寻找重复数
     * 快慢指针，判断链表是否有环的算法
     */
    public static int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (true) {
            fast = nums[nums[fast]];
            slow = nums[slow];
            if (slow == fast) {
                fast = 0;
                while (nums[slow] != nums[fast]) {
                    fast = nums[fast];
                    slow = nums[slow];
                }
                return nums[slow];
            }
        }

    }

    /**
     * 寻找重复数
     * 排序，时间复杂度太高
     */
    public static int findDuplicate1(int[] nums) {
        int len = nums.length;
        int n = len - 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return 0;
    }
}
