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
public class DaHua2 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while (read.hasNext()) {
            int x = read.nextInt();
            int y = read.nextInt();
            solution(x, y);
        }
    }

    public static void solution(int x, int y) {
        for (int i = 0; i < (x + 1) / 2; i++) {
            for (int j = 0; j < y / 2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (i + 1) * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= x / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= y - 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
