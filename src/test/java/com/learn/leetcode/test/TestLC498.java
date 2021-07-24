package com.learn.leetcode.test;

import java.util.Arrays;

/**
 * Description:
 * date: 2021/7/24 19:57
 * Package: com.learn.leetcode.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TestLC498 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] ans = findDiagonalOrder(mat);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[]{};
        }
        int row = mat.length;
        int col = mat[0].length;
        //r，c即为元素在二维数组中的坐标
        int r = 0, c = 0;
        int[] ans = new int[row * col];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = mat[r][c];
            //和为偶数，向上遍历
            if ((r + c) % 2 == 0) {
                //准备向下遍历
                if (c == col - 1) {
                    r++;
                    //准备向下遍历
                } else if (r == 0) {
                    c++;
                } else {
                    r--;
                    c++;
                }
                //为奇数，向下遍历
            } else {
                //准备向上遍历
                if (r == row - 1) {
                    c++;
                    //准备向上遍历
                } else if (c == 0) {
                    r++;
                } else {
                    //向下遍历
                    r++;
                    c--;
                }
            }
        }
        return ans;
    }
}
