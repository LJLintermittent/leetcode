package com.learn.leetcode.onehundredToonehundredFifty;

import java.util.*;

/**
 * Description:
 * date: 2021/8/5 10:34
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC128 {

    public static void main(String[] args) {
        int[] nums4 = {0, -1};
        int[] nums2 = {100, 4, 200, 1, 3, 2};
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int[] nums1 = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        int i = longestConsecutive(nums2);
        System.out.println(i);
    }

    /**
     * 最长连续序列
     * 算法核心：
     * 枚举数组的中每一数，考虑以其为起点，不断尝试X+1,X+2是否在哈希表中
     * 由于我们要枚举的数在数组中一定不存在前驱数X-1
     * 所以我们每次在哈希表中检查这个数是否有前驱数X-1，如果有就跳过这个数
     */
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int longestpos = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentPos = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentPos += 1;
                }
                longestpos = Math.max(longestpos, currentPos);
            }
        }
        return longestpos;
    }

    /**
     * 最长连续序列
     */
    public static int longestConsecutive1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        Arrays.sort(nums);
        int ans = Integer.MIN_VALUE;
        List<Integer> resList = new ArrayList<>(10);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                ans = Math.max(ans, 1);
                ans = ans + 1;
            } else {
                ans = Math.max(ans, 1);
                resList.add(ans);
                ans = 1;
            }
        }
        Integer[] resnums = resList.toArray(new Integer[resList.size()]);
        Arrays.sort(resnums);
        if (resnums.length != 0) {
            return resnums[resnums.length - 1] >= ans ? resnums[resnums.length - 1] : ans;
        } else {
            return ans;
        }
    }
}
