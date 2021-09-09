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
     * 在单例模式中 1792
     * 我们使用volatile是为了禁止指令重排序的，而不是保证变量的可见性
     * 因为synchronized底层的moniter_enter和monitor_exit两个字节码已经完成了可见性功能
     */
    private static final Unsafe UNSAFE = UnsafeUtils.getUnsafe();

    private static SingleTonWithUnsafe INSTANCE;

    private SingleTonWithUnsafe() {
        throw new RuntimeException("别用反射");
    }

    public static SingleTonWithUnsafe getInstance() {
        if (INSTANCE == null) {
            synchronized (SingleTonWithUnsafe.class) {
                if (INSTANCE == null) {
                    SingleTonWithUnsafe INSTANCE = new SingleTonWithUnsafe();
                    //写屏障保证局部变量INSTANCE的写入顺序与全局变量的写入有序性
                    UNSAFE.storeFence();
                    SingleTonWithUnsafe.INSTANCE = INSTANCE;
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        SingleTonWithUnsafe instance = getInstance();
        System.out.println(instance);
    }
}
