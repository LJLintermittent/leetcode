package com.learn.leetcode.offer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/8/13 10:14
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer31 {

    public static void main(String[] args) {
        int[] push = {1, 2, 3, 4, 5};
        int[] pop = {4, 5, 3, 2, 1};
        int[] pop2 = {4, 3, 5, 1, 2};
        boolean ans = validateStackSequences(push, pop2);
        System.out.println(ans);
    }

    /**
     * 剑指 Offer 31. 栈的压入、弹出序列
     */
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new LinkedList<>();
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
