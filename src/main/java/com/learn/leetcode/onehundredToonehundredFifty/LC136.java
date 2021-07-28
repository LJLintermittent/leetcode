package com.learn.leetcode.onehundredToonehundredFifty;

import java.util.HashMap;

/**
 * Description:
 * date: 2021/7/28 18:58
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC136 {

    public static void main(String[] args) {
        int[] nums = {};
        int i = singleNumber(nums);
        System.out.println(i);


    }

    /**
     * 只出现一次的数字
     */
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>(16);
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer num = map.get(nums[i]);
                map.put(nums[i], num + 1);
            } else {
                map.put(nums[i], count);
            }
        }
        Integer ans = null;
        for (Integer integer : map.keySet()) {
            Integer integer1 = map.get(integer);
            if (integer1 == 1) {
                ans = integer;
            }
        }
        return ans;
    }
}
