package com.learn.leetcode.ninehundredToonethousand;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Description:
 * date: 2021/8/13 10:39
 * Package: com.learn.leetcode.ninehundredToonethousand
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC946 {

    public static void main(String[] args) {

    }

    /**
     * 验证栈序列
     */
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new ArrayDeque<>();
        int index = 0;
        for (int item : pushed) {
            stack.push(item);
            while (index < popped.length && !stack.isEmpty() && stack.peek() == popped[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}

