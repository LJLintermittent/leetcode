package com.learn.leetcode.designpattern.singleton;

/**
 * Description:
 * date: 2021/9/9 14:05
 * Package: com.learn.leetcode.designpattern.singleton
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class SingleTon06 {

    //懒汉式，直接加sync同步锁保证线程安全
    private static SingleTon06 INSTANCE = null;

    private SingleTon06() {

    }

    public synchronized static SingleTon06 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingleTon06();
        }
        return INSTANCE;
    }
}
