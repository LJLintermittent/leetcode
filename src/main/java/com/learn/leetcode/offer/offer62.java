package com.learn.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2021/8/6 15:30
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer62 {

    public static void main(String[] args) {
        int ans = lastRemaining(5, 3);
        System.out.println(ans);

    }

    /**
     * 剑指 Offer 62. 圆圈中最后剩下的数字
     * 模拟
     */
    public static int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = 0;
        while (n > 1) {
            index = (index + m - 1) % n;
            list.remove(index);
            n--;
        }
        return list.get(0);
    }
}
