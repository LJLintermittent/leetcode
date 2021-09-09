package com.learn.leetcode.designpattern.singleton;

import java.lang.reflect.Constructor;

/**
 * Description:
 * date: 2021/8/30 11:12
 * Package: com.learn.leetcode.designpattern.singleton
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class SingleTon03 {

    //双端检测,懒汉式的最终版本
    //1926
    private static volatile SingleTon03 INSTANCE;

    private SingleTon03() {

    }

    public static SingleTon03 getInstance() {
        //第一个为空判断是为了提高懒汉式单纯加锁的效率问题，因为所有线程都会阻塞尝试获取锁
        if (INSTANCE == null) {
            synchronized (SingleTon03.class) {
                //第二个为空判断是为了线程安全问题，因为如果并发进入第一个判断后，
                //都尝试获取锁，锁里面就是创建对象的代码，那么最终并发的线程都会new对象，
                //所在在锁里还要判断一次，这样即使因为并发，大家都成功过了第一个判断，等锁，然后锁里面再次进行判断过滤
                //由于锁是同步的，所以后面的线程再进来判断 单例对象一定被创建过了，直接进不来，不会再次创建对象
                //保证了线程安全
                if (INSTANCE == null) {
                    INSTANCE = new SingleTon03();
                    return INSTANCE;
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = SingleTon03.class;
            Constructor<?> constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            Object a = constructor.newInstance();
            Object b = constructor.newInstance();
            System.out.println(a);
            System.out.println(b);
            System.out.println(a == b);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
