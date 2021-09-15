package com.learn.leetcode.designpattern.observer;

import com.google.common.eventbus.EventBus;

/**
 * Description:
 * date: 2021/9/15 11:12
 * Package: com.learn.leetcode.designpattern.observer
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class ObserverTest {

    /**
     * TODO 观察者模式
     * 观察者模式又叫发布订阅模式，定义一种一对多的依赖关系，一个主题对象可以被多个
     * 观察者对象同时监听，使得每当主题对象状态发生变化，所有依赖它的对象都会得到通知，属于行为型设计模式
     * 观察者模式的核心是将观察者与被观察者解耦，以类似消息广播发送的机制联动两者，使被观察者的变动能通知到
     * 感兴趣的观察者们，从而做出相应的回应
     */

    public static void main(String[] args) {
        EventBus bus = new EventBus();
        GuavaEvent event = new GuavaEvent();
        bus.register(event);
        bus.post("ALIBABA");
    }

}
