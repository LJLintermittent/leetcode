package com.learn.leetcode.designpattern.singleton;

/**
 * Description:
 * date: 2021/8/30 10:54
 * Package: com.learn.leetcode.designpattern.singleton
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class SingleTon02 {

    //1951
    //静态内部类实现单例,既保证了线程安全，又保证了延迟加载，同时不会因为加锁导致性能下降
    private static class SingletonHolder {
        private static SingleTon02 INSTANCE = new SingleTon02();
    }

    private SingleTon02() {

    }

    public static SingleTon02 getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
