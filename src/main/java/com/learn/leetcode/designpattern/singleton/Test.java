package com.learn.leetcode.designpattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * Description:
 * date: 2021/8/1 13:43
 * Package: com.learn.leetcode.designpattern.singleton
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Test {

    /*
        TODO 单例模式
        单例模式的特点是确保一个类在任何情况下都绝对只有一个实例，并提供一个全局访问点，属于典型的创建型设计模式
        如果使用饿汉式，那么直接在成员变量上进行创建，这样创建的单例对象在类加载的时候就实例化，这样一来，系统初始化
        的时候会占用系统的内存空间，不管对象用不用，都占着空间，但是饿汉式是线程安全的
        将饿汉式改进懒加载的时候，需要注意线程安全的问题，由于是懒加载，需要用户线程来获取，那么需要做同步处理
     */
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int threadnum = 2000;
        final CountDownLatch countDownLatch = new CountDownLatch(threadnum);
        for (int i = 0; i < threadnum; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    System.out.println(Thread.currentThread().getName()
                            + "获取到的单例对象：" + SingleTon02.getInstance());
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");

    }
}
