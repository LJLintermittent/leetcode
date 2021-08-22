package com.learn.leetcode.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * date: 2021/8/22 15:34
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer03 {

    public static void main(String[] args) {

    }

    /**
     * 剑指 Offer 03. 数组中重复的数字
     */
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i]) == false) {
                return nums[i];
            }
            set.add(nums[i]);
        }
        return 0;
    }

}
