package com.learn.leetcode.offer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * date: 2021/7/15 21:43
 * Package: com.learn.leetcode.offer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class offer09 {

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        System.out.println(cQueue); //null

        cQueue.appendTail(3);
        System.out.println(cQueue);//null

        int i = cQueue.deleteHead();
        System.out.println(i);//3

        int j = cQueue.deleteHead();
        System.out.println(j);//-1

    }

    /**
     * 用两个栈实现队列
     * 实现appendTail和deleteHead
     * appendTail：在队尾插入元素
     * deleteHead：在对头删除元素
     */
    static class CQueue {

        Deque<Integer> instack;
        Deque<Integer> outstack;

        public CQueue() {
            instack = new LinkedList<Integer>();
            outstack = new LinkedList<Integer>();
        }

        // 添加元素到队尾
        public void appendTail(int value) {
            instack.push(value);
        }

        // 删除队头元素
        public int deleteHead() {
            if (outstack.isEmpty()) {
                in2out();
            }
            if (outstack.isEmpty()) {
                return -1;
            }
            return outstack.pop();
        }

        public void in2out() {
            while (!instack.isEmpty()) {
                outstack.push(instack.pop());
            }
        }

        @Override
        public String toString() {
            return "CQueue{" +
                    "instack=" + instack +
                    ", outstack=" + outstack +
                    '}';
        }
    }
}
