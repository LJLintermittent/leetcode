package com.learn.leetcode.twohundredTothreehundred;

/**
 * Description:
 * date: 2021/9/21 22:44
 * Package: com.learn.leetcode.twohundredTothreehundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC201 {

    public static void main(String[] args) {
        int ans = rangeBitwiseAnd(5, 7);
        System.out.println(ans);
    }

    /**
     * 数字范围按位与
     */
    public static int rangeBitwiseAnd(int left, int right) {
        int shift = 0;
        //不断右移查找公共前缀
        while (left < right) {
            left >>= 1;
            right >>= 1;
            shift++;
        }
        return left << shift;
    }

}
