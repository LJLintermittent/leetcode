package com.learn.leetcode.week.test;

import java.util.Scanner;

/**
 * Description:
 * date: 2021/9/25 9:02
 * Package: com.learn.leetcode.week.test
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Lazada1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.println(solution(s));
        }
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        int index = 0;
        String mb = String.valueOf(chars[0]);
        for (char c : chars) {
            if (mb.equals(String.valueOf(c))) {
                index++;
            } else {
                if (index == 1) {
                    sb.append(mb);
                } else {
                    sb.append(index);
                    sb.append(mb);
                }
                mb = s.valueOf(c);
                index = 1;
            }
        }
        if (index == 1) {
            sb.append(mb);
        } else {
            sb.append(index);
            sb.append(mb);
        }
        return sb.toString();
    }
}
