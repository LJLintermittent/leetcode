package com.learn.leetcode.onehundredToonehundredFifty;

/**
 * Description:
 * date: 2021/7/22 20:54
 * Package: com.learn.leetcode.onehundredToonehundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC135 {

    public static void main(String[] args) {
        int[] nums = {1, 0, 2};
        int ans = test(nums);
        System.out.println(ans);

    }

    /**
     * 分发糖果
     */
    public static int candy(int[] ratings) {
        int len = ratings.length;
        int[] left = new int[len];
        for (int i = 0; i < len; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        int right = 0;
        int ret = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (i < len - 1 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            ret = ret + Math.max(left[i], right);
        }
        return ret;
    }

    public static int test(int[] ratings) {
        int len = ratings.length;
        int[] left = new int[len];
        for (int i = 0; i < len; i++) {
            if (i > 0 && ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            } else {
                left[i] = 1;
            }
        }
        int right = 0;
        int res = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (right > 0 && ratings[i] > ratings[i + 1]) {
                right++;
            } else {
                right = 1;
            }
            res = res + Math.max(left[i],right);
        }

        return res;
    }
}
