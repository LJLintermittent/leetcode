package com.learn.leetcode.offer;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/8/13 10:44
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer61 {

    public static void main(String[] args) {

    }

    /**
     * 剑指 Offer 61. 扑克牌中的顺子
     * 只要五张牌，那么最大的牌减去最小的牌要小于5，才能为顺子
     * 注意00125这个牌，前两张大小王 可以代替任何数，那么我们要看后面的125的最大值减去最小值是否小于5。
     */
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int joker = 0;
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 0) {
                joker++;
            } else if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return nums[4] - nums[joker] < 5;
    }
}
