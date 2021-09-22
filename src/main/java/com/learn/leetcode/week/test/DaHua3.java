package com.learn.leetcode.week.test;

import java.util.Scanner;

/**
 * Description:
 * date: 2021/9/22 10:53
 * Package: com.learn.leetcode.week.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class DaHua3 {

    public static void main(String[] args) {
        int x = 0;
        Scanner read = new Scanner(System.in);
        x = read.nextInt();
        solution(x);
    }

    public static void solution(int x) {
        int i;
        int j;
        int sum;
        for (i = 1; i < x; i++) {
            sum = 0;
            for (j = 1; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
