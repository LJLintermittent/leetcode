package com.learn.leetcode.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Description:
 * date: 2021/8/30 11:18
 * Package: com.learn.leetcode.designpattern.singleton
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class SingleTon04 {

    //CAS实现单例模式 1860
    //使用CAS的好处的就是不需要加锁来保证线程安全
    //而是依赖于CAS的忙等算法，依赖底层硬件来实现线程安全，相对于加锁没有线程的切换和阻塞的开销
    private static AtomicReference<SingleTon04> INSTANCE = new AtomicReference<>();

    private SingleTon04() {
        throw new RuntimeException("别用反射");
    }

    public static SingleTon04 getInstance() {
        for (; ; ) {
            SingleTon04 instance = INSTANCE.get();
            if (instance != null) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new SingleTon04());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = SingleTon04.class;
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
