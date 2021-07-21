package com.learn.leetcode.offer;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/7/21 22:02
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer21 {

    public static void main(String[] args) {
//        System.out.println(8 & 4);
        // 7的二进制：111
        // 6的二进制：110
        //与运算：全1为1 有0则0-----》110---》6
//        System.out.println(7 & 6);
        int[] nums = {1, 2, 3, 4};
        int[] ans = exchange1(nums);
        System.out.println(Arrays.toString(ans));

    }

    /**
     * 首尾双指针
     */
    public static int[] exchange1(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left < right) {
            //找偶数  与1为1 是奇数
            if ((nums[left] & 1) != 0) {
                left++;
                continue;
            }
            //找奇数 与1为0 是偶数
            if ((nums[right] & 1) != 1) {
                right--;
                continue;
            }
            swap(nums, left++, right--);
        }
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /**
     * 调整数组顺序使奇数位于偶数前面
     */
    public static int[] exchange(int[] nums) {
        int[] ans = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                ans[j++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[j++] = nums[i];
            }
        }
        return ans;
    }
}
