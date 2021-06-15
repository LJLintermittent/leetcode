package com.learn.leetcode.thread;

/**
 * Description:
 * date: 2021/6/15 14:54
 * Package: com.learn.leetcode.thread
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class TestMyThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始");
        Thread thread1 = new Thread(new MyThread(0));
        Thread thread2 = new Thread(new MyThread(1));
        Thread thread3 = new Thread(new MyThread(2));
        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

    }
}
