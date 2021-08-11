package com.learn.leetcode.fourhundredTofivehundred;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Description:
 * date: 2021/8/11 10:41
 * Package: com.learn.leetcode.fourhundredTofivehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC442 {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = findDuplicates(nums);
        System.out.println(list);
    }

    /**
     * 数组中重复的数据
     */
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = Lists.newArrayList();
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                list.add(Math.abs(index + 1));
            }
            nums[index] = -nums[index];
        }
        return list;
    }
}
