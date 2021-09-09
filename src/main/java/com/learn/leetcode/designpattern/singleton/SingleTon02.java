package com.learn.leetcode.designpattern.singleton;


import java.lang.reflect.Constructor;

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
    //静态内部类实现单例,既保证了线程安全，又保证了延迟加载，同时不会因为加锁导致性能下降,默认不加载内部类
    private static class SingletonHolder {
        private static final SingleTon02 INSTANCE = new SingleTon02();
    }

    private SingleTon02() {
        if (SingletonHolder.INSTANCE != null) {
            throw new RuntimeException("你还想用反射破坏单例？");
        }
    }

    public static SingleTon02 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    //如果私有构造器中什么也不写的话，普通的静态内部类无法防止反射破坏
    public static void main(String[] args) throws Exception {
        Class<?> clazz = SingleTon02.class;
        Constructor<?> constructor = clazz.getDeclaredConstructor(null);
        constructor.setAccessible(true);
        Object a = constructor.newInstance();
        Object b = constructor.newInstance();
        System.out.println(a == b);
    }

}
