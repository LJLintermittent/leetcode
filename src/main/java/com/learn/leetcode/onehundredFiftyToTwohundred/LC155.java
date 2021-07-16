package com.learn.leetcode.onehundredFiftyToTwohundred;


import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/7/16 19:34
 * Package: com.learn.leetcode.onehundredFiftyToTwohundred
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LC155 {

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        stack.push(-4);
        int min1 = stack.getMin();
        System.out.println(min1);//-3
        stack.pop();
        int top = stack.top();
        System.out.println(top);// 0
        int min2 = stack.getMin();
        System.out.println(min2);//-2

    }

    /**
     * 最小栈
     * 方法一：使用链表
     */
    static class MinStack {

        private Node head;

        public MinStack() {

        }

        public void push(int val) {
            if (head == null) {
                head = new Node(val, val);
            } else {
                head = new Node(val, Math.min(val, head.min), head);
            }
        }

        public void pop() {
            head = head.next;
        }

        public int top() {
            return head.val;
        }

        public int getMin() {
            return head.min;
        }

        private class Node {
            int val;
            int min;
            Node next;

            private Node(int val, int min) {
                this(val, min, null);
            }

            private Node(int val, int min, Node next) {
                this.val = val;
                this.min = min;
                this.next = next;
            }
        }
    }

    /**
     * 最小栈
     * 方法二：辅助栈
     */
    static class MinStack2 {
        Deque<Integer> ansStack;
        Deque<Integer> minStack;

        public MinStack2() {
            ansStack = new LinkedList<>();
            minStack = new LinkedList<>();
            minStack.push(Integer.MAX_VALUE);
        }

        public void push(int val) {
            ansStack.push(val);
            minStack.push(Math.min(minStack.peek(), val));
        }

        public void pop() {
            ansStack.pop();
            minStack.pop();
        }

        public int top() {
            return ansStack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }

    }
}
