package com.learn.leetcode.twohundredTothreehundred;

/**
 * Description:
 * date: 2021/8/21 13:57
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC240 {

    public static void main(String[] args) {

    }

    /**
     * 搜索二维矩阵 II
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        if (target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;

    }
}
