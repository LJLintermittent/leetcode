package com.learn.leetcode.twohundredTothreehundred;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/8/2 14:42
 * Package: com.learn.leetcode.twohundredTotwohundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC227 {

    public static void main(String[] args) {
        String s = "3+2*2";

        int ans = calculate(s);
        System.out.println(ans);
    }

    /**
     * 基本计算器 II
     */
    public static int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        int num = 0;
        char preSign = '+';
        for (int i = 0; i < s.length(); i++) {
            //判断该位置字符是否是数字,由于数字数字可能不止是有只有个位数字，所有要num*10
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == s.length() - 1) {
                switch (preSign) {
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        stack.push(stack.pop() * num);
                        break;
                    default:
                        stack.push(stack.pop() / num);
                }
                preSign = s.charAt(i);
                num = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans = ans + stack.pop();
        }
        return ans;
    }

}
