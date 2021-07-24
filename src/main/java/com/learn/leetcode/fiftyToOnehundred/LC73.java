package com.learn.leetcode.fiftyToOnehundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/7/24 20:48
 * Package: com.learn.leetcode.fiftyToOnehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC73 {

    public static void main(String[] args) {
        int[][] mat = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        setZeroes(mat);
        System.out.println(Arrays.toString(mat));

    }

    /**
     * 矩阵置零
     */
    public static void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        //标记数组
        boolean[] flagR = new boolean[row];
        boolean[] flagC = new boolean[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    flagR[i] = flagC[j] = true;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                //行为T或者列为T 那么这个点就应该被置为0
                if (flagR[i] || flagC[j]) {
                    //不需要管到底是第几行第几列
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
