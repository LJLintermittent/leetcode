package com.learn.leetcode.designpattern.singleton;

import sun.misc.Unsafe;

/**
 * Description:
 * date: 2021/8/1 12:45
 * Package: com.learn.leetcode.designpattern.singleton
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class SingleTonWithUnsafe {

    /**
     * 在单例模式中
     * 我们使用volatile是为了禁止指令重排序的，而不是保证变量的可见性
     * 因为synchronized底层的moniter_enter和monitor_exit两个字节码已经完成了可见性功能
     */

    public static final Unsafe UNSAFE = UnsafeUtils.getUnsafe();

    public static SingleTonWithUnsafe obj;

    int a;

    private SingleTonWithUnsafe() {
        a = 3;
    }

    public static SingleTonWithUnsafe getInstance() {
        if (obj == null) {
            synchronized (SingleTonWithUnsafe.class) {
                if (obj == null) {
                    SingleTonWithUnsafe obj = new SingleTonWithUnsafe();
                    //写屏障保证局部变量obj的写入顺序与全局变量的写入有序性
                    UNSAFE.storeFence();
                    SingleTonWithUnsafe.obj = obj;
                }
            }
        }
        return obj;
    }

    public static void main(String[] args) {
        SingleTonWithUnsafe instance = getInstance();
        System.out.println(instance);
    }
}