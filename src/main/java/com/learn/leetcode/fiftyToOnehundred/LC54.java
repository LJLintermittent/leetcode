package com.learn.leetcode.fiftyToOnehundred;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/7/25 19:28
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC54 {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> list = spiralOrder(mat);
        System.out.println(list);
    }

    /**
     * 螺旋矩阵
     */
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>(10);
        int count = 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int total = row * col;
        int up = 0, down = row - 1, left = 0, right = col - 1;
        while (count < total) {
            for (int i = left; i <= right && count < total; i++) {
                list.add(matrix[up][i]);
                count++;
            }
            // up : 1
            up++;
            for (int i = up; i <= down && count < total; i++) {
                list.add(matrix[i][right]);
                count++;
            }
            right--;
            for (int i = right; i >= left && count < total; i--) {
                list.add(matrix[down][i]);
                count++;
            }
            down--;
            for (int i = down; i >= up && count < total; i--) {
                list.add(matrix[i][left]);
                count++;
            }
            left++;
        }
        return list;
    }

    /**
     * 螺旋矩阵
     * 错解
     */
    public static List<Integer> spiralOrder1(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int len = row * col;
        List<Integer> list = new ArrayList<>(len);
        int i = 0;
        int j = 0;
        while (true) {
            if (i == 0 && j < col - 1) {
                list.add(matrix[i][j]);
                j++;
                continue;
            }
            if (j == col - 1 && i == 0) {
                list.add(matrix[i][j]);
                i++;
                continue;
            }
            if (i == row - 1 && j == col - 1) {
                list.add(matrix[i][j]);
                j--;
                continue;
            }
            if (j == 0 && i == row - 1 && i - 1 != 0) {
                i--;
                continue;
            }
            return list;
        }
    }
}
