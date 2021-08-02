package com.learn.leetcode.twohundredTothreehundred;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/6/29 16:34
 * Package: com.learn.leetcode.twohundredTotwohundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC232 {

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        int i = queue.pop();
        queue.push(3);
        int j = queue.pop();
        System.out.println(i);//1
        System.out.println(j);//2
    }

    /**
     * 用栈实现队列
     * 栈：后进先出
     * 队列：先进先出
     */
    static class MyQueue {
        Deque<Integer> inStack;
        Deque<Integer> outStack;

        public MyQueue() {
            inStack = new LinkedList<Integer>();
            outStack = new LinkedList<Integer>();
        }

        public void push(int x) {
            inStack.push(x);
        }

        public int pop() {
            if (outStack.isEmpty()) {
                in2Out();
            }
            return outStack.pop();
        }

        public int peek() {
            if (outStack.isEmpty()) {
                in2Out();
            }
            return outStack.peek();
        }

        public boolean empty() {
            return inStack.isEmpty() && outStack.isEmpty();
        }

        private void in2Out() {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }

    }


}
