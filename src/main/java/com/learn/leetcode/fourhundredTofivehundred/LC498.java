package com.learn.leetcode.fourhundredTofivehundred;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/7/24 19:18
 * Package: com.learn.leetcode.fourhundredTofivehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC498 {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] ans = findDiagonalOrder(mat);
        System.out.println(Arrays.toString(ans));
    }

    /**
     * 对角线遍历
     */
    public static int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[]{};
        }
        int r = 0, c = 0;
        int row = mat.length;
        int col = mat[0].length;
        int[] res = new int[row * col];
        for (int i = 0; i < res.length; i++) {
            res[i] = mat[r][c];
            // r+c为偶数则向上遍历，奇数向下遍历
            if ((r + c) % 2 == 0) {
                if (c == col - 1) {
                    //往下移动一格准备向下遍历
                    r++;
                } else if (r == 0) {
                    //往右移动一格准备向下遍历
                    c++;
                } else {
                    //往上遍历
                    r--;
                    c++;
                }
            } else {
                if (r == row - 1) {
                    //向右移动一格准备向上遍历
                    c++;
                } else if (c == 0) {
                    //往下移动一格准备向上遍历
                    r++;
                } else {
                    //往下遍历
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}
