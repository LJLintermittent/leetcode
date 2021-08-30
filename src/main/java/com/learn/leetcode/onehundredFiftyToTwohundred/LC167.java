package com.learn.leetcode.onehundredFiftyToTwohundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/8/30 9:51
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC167 {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] ans = twoSum(nums, 17);

        System.out.println(Arrays.toString(ans));

    }

    /**
     * 两数之和 II - 输入有序数组
     */
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
}
