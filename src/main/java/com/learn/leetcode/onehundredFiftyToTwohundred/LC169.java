package com.learn.leetcode.onehundredFiftyToTwohundred;


import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * date: 2021/6/28 14:00
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC169 {

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 3};
        int[] arr2 = {2, 2, 1, 1, 1, 2, 2};
        int[] arr3 = {-1, 1, 1, 1, 2, 1};
        int i = majorityElement(arr3);
        System.out.println(i);

    }

    /**
     * 多数元素
     * 多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素
     */
    public static int majorityElement(int[] nums) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>(10);
        int count = 1;
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
            int o = (int) map.get(key);
            if (o > (length / 2)) {
                return key;
            }
        }
        return 0;
    }
}
