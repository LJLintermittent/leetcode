package com.learn.leetcode.designpattern.singleton;

/**
 * Description:
 * date: 2021/8/30 11:33
 * Package: com.learn.leetcode.designpattern.singleton
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public enum SingleTon05 {

    INSTANCE;

    //枚举实现单例
    //调用方式：SingleTon05.INSTANCE.test();
    public void test() {
        System.out.println("test");
    }

}
