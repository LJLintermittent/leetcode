package com.learn.leetcode.designpattern.observer;

import com.google.common.eventbus.Subscribe;

/**
 * Description:
 * date: 2021/9/15 11:12
 * Package: com.learn.leetcode.designpattern.observer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class GuavaEvent {

    @Subscribe
    public void subscribe(String s) {
        System.out.println("执行subscribe方法，传入的参数是：" + s);
    }

}
