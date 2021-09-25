package com.learn.leetcode.week.test;


import java.util.Scanner;

/**
 * Description:
 * date: 2021/9/25 9:33
 * Package: com.learn.leetcode.week.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Lazada2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            for (int i = 0; i < m; i++) {
                long L = scanner.nextLong();
                long R = scanner.nextLong();
                System.out.println(solution(L, R));
            }
        }
    }

    private static long solution(long a, long b) {
        int count = 0;
        for (long i = a; i <= b; i++) {
            boolean flag = true;
            for (long j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        return count - 1;

    }


}
