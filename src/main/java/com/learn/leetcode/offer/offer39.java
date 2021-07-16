package com.learn.leetcode.offer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Description:
 * date: 2021/7/16 23:12
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer39 {

    public static void main(String[] args) {
        int[] arr = {-1, 1, 1, 1, 2, 1};
        int i = majorityElement(arr);
        System.out.println(i);

    }

    /**
     * 数组中出现次数超过一半的数字
     */
    public static int majorityElement(int[] nums) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>(16);
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (map.containsKey(nums[i])) {
                count = map.get(nums[i]) + 1;
                map.put(nums[i], count);
            } else {
                count = 1;
                map.put(nums[i], count);
            }
        }
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            if (value > (length / 2)) {
                return key;
            }
        }
        return 0;
    }

}
