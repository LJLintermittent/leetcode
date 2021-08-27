package com.learn.leetcode.offer;

/**
 * Description:
 * date: 2021/8/27 13:01
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer17 {

    public static void main(String[] args) {

    }

    /**
     * 打印从1到最大的n位数
     */
    public int[] printNumbers(int n) {
        int end = (int) (Math.pow(10, n) - 1);
        int[] res = new int[end];
        for (int i = 0; i < end; i++) {
            res[i] = i + 1;
        }
        return res;
    }
}
