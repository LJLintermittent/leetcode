package com.learn.leetcode.oneToFifty;


/**
 * Description:
 * date: 2021/6/17 16:39
 * Package: com.learn.leetcode.oneToFifty
 *
 * @author 李佳乐
 * @version 1.0
 */
public class LC11 {

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = maxArea(arr);
        System.out.println(i);
    }

    /**
     * 盛最多水的容器
     */
    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(area, ans);
            if (height[l] <= height[r]) {
                ++l;
            } else {
                --r;
            }
        }
        return ans;
    }

}

