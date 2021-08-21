package com.learn.leetcode.fiftyToOnehundred;

/**
 * Description:
 * date: 2021/8/10 11:28
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC74 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        boolean ans = searchMatrix(matrix, 3);
        System.out.println(ans);
    }

    /**
     * 搜索二维矩阵
     */
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            if (target <= matrix[i][col - 1]) {
                while (col > 0) {
                    if (target == matrix[i][col - 1]) {
                        return true;
                    }
                    col--;
                }
                return false;
            }
        }
        return false;
    }
}
