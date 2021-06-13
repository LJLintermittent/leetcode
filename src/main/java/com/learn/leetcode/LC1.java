package com.learn.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Description:
 * date: 2021/4/2 0:25
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
public class LC1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 8, 9, 11, 15, 13};
        int target = 28;
        int[] twoSum = twoSum(nums, target);
        System.out.println(Arrays.toString(twoSum));
    }

    /**
     * ***********************两数之和
     *
     * @param nums   数组
     * @param target 目标值
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int targetNumber = target - nums[i];
            if (map.containsKey(targetNumber)) {
                return new int[]{map.get(targetNumber), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
