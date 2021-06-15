package com.learn.leetcode.thread;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Description:
 * date: 2021/6/15 14:45
 * Package: com.learn.leetcode.thread
 *
 * @author 李佳乐
 * @version 1.0
 */
@SuppressWarnings("all")
public class MyThread implements Runnable {

    private int number;
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();
    private static int count;

    public MyThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (count > 100) {
                break;
            } else {
                if (count % 3 == this.number) {
                    System.out.println("第" + this.number + "号线程打印" + count + "号数字");
                    count ++;
                } else {
                    try {
                        condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            condition.signalAll();
            lock.unlock();
        }

    }
}
