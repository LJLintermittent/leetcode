package com.learn.leetcode.designpattern.singleton;

/**
 * Description:
 * date: 2021/8/1 13:54
 * Package: com.learn.leetcode.designpattern.singleton
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class SingleTon {

    private SingleTon() {

    }

    public static volatile SingleTon INSTANCE;

    public static SingleTon getInstance() {
        if (INSTANCE == null) {
            synchronized (SingleTon.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingleTon();
                }
            }
        }
        return INSTANCE;
    }

}
