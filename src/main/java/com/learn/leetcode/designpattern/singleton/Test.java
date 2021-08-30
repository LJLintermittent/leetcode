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

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        int threadnum = 2000;
        final CountDownLatch countDownLatch = new CountDownLatch(threadnum);
        for (int i = 0; i < threadnum; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    System.out.println(Thread.currentThread().getName()
                            + "获取到的单例对象：" + SingleTon04.getInstance());
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start));

    }


}
