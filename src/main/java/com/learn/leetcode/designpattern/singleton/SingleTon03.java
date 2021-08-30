package com.learn.leetcode.designpattern.singleton;

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

    //双端检测
    //1926
    private static volatile SingleTon03 INSTANCE;

    private SingleTon03() {

    }

    public static SingleTon03 getInstance() {
        if (INSTANCE == null) {
            synchronized (SingleTon03.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingleTon03();
                    return INSTANCE;
                }
            }
        }
        return INSTANCE;
    }
}
