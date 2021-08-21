package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/21 13:27
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer04 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int[][] matrix1 = new int[][]{{}};
        boolean ans = findNumberIn2DArray(matrix1, 5);
        System.out.println(ans);

    }

    /**
     * 剑指 Offer 04. 二维数组中的查找
     */
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
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
