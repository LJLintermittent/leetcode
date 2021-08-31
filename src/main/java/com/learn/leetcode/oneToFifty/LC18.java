package com.learn.leetcode.oneToFifty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * date: 2021/8/31 12:10
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC18 {

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        List<List<Integer>> ans = fourSum(nums, 0);

        System.out.println(ans);
    }

    /**
     * 四数之和
     */
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            //去重
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            for (int j = i + 1; j < len; j++) {
                //去重
                if (j > i + 1 && nums[j - 1] == nums[j]) {
                    continue;
                }
                int left = j + 1;
                int right = len - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        lists.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        right--;
                    }
                }
            }

        }
        return lists;
    }
}
