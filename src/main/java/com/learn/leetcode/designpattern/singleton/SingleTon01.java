package com.learn.leetcode.designpattern.singleton;

import java.lang.reflect.Constructor;

/**
 * Description:
 * date: 2021/8/30 10:48
 * Package: com.learn.leetcode.designpattern.singleton
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class SingleTon01 {

    //饿汉式，线程安全  1796
    //程序启动的时候直接加载，并且设置为private，让外部只能使用getInstance获取
    //但是这种方式并不是懒加载，也就是说无论程序是否需要这样的实例，程序启动之初都会进行创建
    private static SingleTon01 INSTANCE = new SingleTon01();

    private SingleTon01() {

    }

    public static SingleTon01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        try {
            Class<?> clazz = SingleTon01.class;
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
