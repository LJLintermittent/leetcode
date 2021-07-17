package com.learn.leetcode.twohundredTotwohundredFifty;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/7/17 23:25
 * Package: com.learn.leetcode.twohundredTotwohundredFifty
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC225 {

    public static void main(String[] args) {
        MyStack2 myStack2 = new MyStack2();
        myStack2.push(1);
        myStack2.push(2);
        int top = myStack2.top();
        System.out.println(top);// 2
        int pop = myStack2.pop();
        System.out.println(pop);// 2
        int top1 = myStack2.top();
        System.out.println(top1);// 1
        boolean empty = myStack2.empty();
        System.out.println(empty);
        int pop1 = myStack2.pop();
        System.out.println(myStack2.empty());

    }

    /**
     * 用队列实现栈
     */
    class MyStack {

        Deque<Integer> queue;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            queue = new LinkedList<>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            queue.addFirst(x);
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
            Integer pop = queue.removeFirst();
            return pop;
        }

        /**
         * Get the top element.
         */
        public int top() {
            Integer top = queue.getFirst();
            return top;
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return queue.isEmpty();
        }
    }

    static class MyStack2 {
        Deque<Integer> queue;

        public MyStack2() {
            queue = new LinkedList<>();
        }

        public void push(int x) {
            int n = queue.size();
            queue.offer(x);
            for (int i = 0; i < n; i++) {
                queue.offer(queue.poll());
            }
        }

        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }
}
