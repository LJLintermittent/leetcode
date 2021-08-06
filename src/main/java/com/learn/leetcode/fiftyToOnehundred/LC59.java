package com.learn.leetcode.fiftyToOnehundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/8/6 13:24
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC59 {

    public static void main(String[] args) {
        int n = 3;
        int[][] ans = generateMatrix(20);
        for (int[] an : ans) {
            System.out.println(Arrays.toString(an));
        }
    }

    /**
     * 螺旋矩阵 II
     */
    public static int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int up = 0, down = n - 1, left = 0, right = n - 1;
        int count = 1;
        while (count <= n * n) {
            for (int i = left; i <= right; i++) {
                ans[up][i] = count++;
            }
            up++;
            for (int i = up; i <= down; i++) {
                ans[i][right] = count++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                ans[down][i] = count++;
            }
            down--;
            for (int i = down; i >= up; i--) {
                ans[i][left] = count++;
            }
            left++;
        }
        return ans;

    }
}
