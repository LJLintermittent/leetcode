package com.learn.leetcode.week.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Description:
 * date: 2021/9/21 22:10
 * Package: com.learn.leetcode.week.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Test1 {

    /**
     * 阿里巴巴9.15笔试题
     */
    public static void main(String[] args) {
        int bit = getBit(2L);
        System.out.println(bit);
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long l = scanner.nextLong();
            long r = scanner.nextLong();
            long ans = cal(l, r);
            System.out.println(ans);
        }
        scanner.close();
    }

    private static long cal(long l, long r) {
        if (l <= 0 || r <= 0 || getBit(l) < getBit(r)) {
            return 0;
        }
        long val = (long) Math.pow(2, getBit(l) - 1);
        return val + cal(l - val, r - val);
    }

    private static int getBit(long num) {
        int count = 0;
        while (num > 0) {
            num /= 2;
            count++;
        }
        return count;
    }

}
