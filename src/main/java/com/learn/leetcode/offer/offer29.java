package com.learn.leetcode.offer;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/8/21 11:17
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer29 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] matrix1 = {};
        int[] ans = spiralOrder(matrix1);
        System.out.println(Arrays.toString(ans));
    }

    /**
     * 剑指 Offer 29. 顺时针打印矩阵
     *
     * @return
     */
    public static int[] spiralOrder(int[][] matrix) {
        int row = matrix.length;
        if (row == 0) {
            return new int[]{};
        }
        int col = matrix[0].length;
        int up = 0;
        int down = row - 1;
        int left = 0;
        int right = col - 1;
        int count = 0;
        int total = row * col;
        int[] ans = new int[total];
        while (count < total) {
            for (int i = left; i <= right && count < total; i++) {
                ans[count] = matrix[up][i];
                count++;
            }
            up++;
            for (int i = up; i <= down && count < total; i++) {
                ans[count] = matrix[i][right];
                count++;
            }
            right--;
            for (int i = right; i >= left && count < total; i--) {
                ans[count] = matrix[down][i];
                count++;
            }
            down--;
            for (int i = down; i >= up && count < total; i--) {
                ans[count] = matrix[i][left];
                count++;
            }
            left++;
        }
        return ans;
    }
}
