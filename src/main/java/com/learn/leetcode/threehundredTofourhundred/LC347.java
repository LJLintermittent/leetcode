package com.learn.leetcode.threehundredTofourhundred;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * date: 2021/8/15 11:13
 * Package: com.learn.leetcode.threehundredTofourhundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC347 {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int[] ans = topKFrequent(nums, 2);
        System.out.println(Arrays.toString(ans));

    }

    /**
     * 前 K 个高频元素
     */
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return map.entrySet().stream().sorted((m1, m2) -> m2.getValue() - m1.getValue())
                .limit(k).mapToInt(Map.Entry::getKey).toArray();

    }

    /**
     * 前 K 个高频元素
     */
    public static int[] topKFrequent1(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
            }
        }
        int[] ans = new int[k];
        int index = 0;
        while (k > 0) {
            // 遍历所有的entry，只要有一个的value等于最大次数，那么添加到结果数组中
            // 最终结果数组中存放是由出现次数从大到小排列的元素
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue() == max) {
                    ans[index++] = entry.getKey();
                    k--;
                }
            }
            max--;
        }
        return ans;
    }
}
