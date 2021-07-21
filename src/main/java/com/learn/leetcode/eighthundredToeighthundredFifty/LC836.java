package com.learn.leetcode.eighthundredToeighthundredFifty;

/**
 * Description:
 * date: 2021/7/21 14:08
 * Package: com.learn.leetcode.eighthundredToeighthundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC836 {
    public static void main(String[] args) {
        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};
        boolean res = isRectangleOverlap(rec1, rec2);
        System.out.println(res);
    }

    /**
     * 矩形重叠
     */
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if (rec2[0] < rec1[2]) {
            if (rec2[1] > rec1[3]) {
                return false;
            }
            if (rec2[3] < rec1[1]) {
                return false;
            }
            if (rec2[2] <= rec1[0]) {
                return false;
            }
            return true;
        }
        return false;
    }
}
