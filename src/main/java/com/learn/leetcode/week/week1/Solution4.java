package com.learn.leetcode.week.week1;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/7/24 23:13
 * Package: com.learn.leetcode.week
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Solution4 {

    public static void main(String[] args) {
        int[] heights = {10,5,6,7,11,7,8,9};
        int[] ans = canSeePersonsCount(heights);
        System.out.println(Arrays.toString(ans));
    }

    /**
     * 队列中可以看到的人数
     */
    public static int[] canSeePersonsCount(int[] heights) {
        int[] ans = new int[heights.length];
        int count = 1;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i+1; j < heights.length; j++) {
                if (heights[i] >= heights[j]) {
                    count++;
                    continue;
                }
                ans[i] = count;
                count = 1;
                break;
            }
        }
        return ans;
    }

}
