package com.learn.leetcode.week.test;

import java.util.Scanner;

/**
 * Description:
 * date: 2021/9/21 22:29
 * Package: com.learn.leetcode.week.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Test2 {

    public static long a, b, c, d;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLong();
        b = scanner.nextLong();
        c = scanner.nextLong();
        d = scanner.nextLong();
        long q = scanner.nextLong();
        for (long i = 0; i < q; i++) {
            System.out.println(solution(scanner.nextLong(), scanner.nextLong()));
        }
        scanner.close();
    }

    private static long solution(long i, long j) {
        if (i == 1 && j == 1) {
            return a;
        } else if (i == 1 && j == 2) {
            return b;
        } else if (i == 2 && j == 2) {
            return c;
        } else if (i == 2 && j == 1) {
            return d;
        }
        int m = (int) (Math.log(i - 1) / Math.log(2));
        int n = (int) (Math.log(j - 1) / Math.log(2));
        int t = Math.max(m, n);
        long mt = (long) Math.pow(2, t);
        if (i > mt && j <= mt) {
            return solution(i - mt, j) + d;
        } else if (i <= mt && j > mt) {
            return solution(i, j - mt) + b;
        } else if (i > mt && j > mt) {
            return solution(i - mt, j - mt) + c;
        }
        return 0;
    }

}
