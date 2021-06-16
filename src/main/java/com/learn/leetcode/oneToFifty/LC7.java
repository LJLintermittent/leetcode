package com.learn.leetcode.oneToFifty;


/**
 * Description:
 * date: 2021/4/6 0:28
 * Package: com.learn.leetcode
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class LC7 {
    public static void main(String[] args) {
        int a = 123;
        int i = reverse(a);
        System.out.println(i);

    }

    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            if ((ans * 10) / 10 != ans) {
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;
    }

}
