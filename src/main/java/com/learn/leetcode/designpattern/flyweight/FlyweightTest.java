package com.learn.leetcode.designpattern.flyweight;

/**
 * Description:
 * date: 2021/9/12 17:33
 * Package: com.learn.leetcode.designpattern.flyweight
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class FlyweightTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + "号顾客前来买票");
                ITicket iTicket = TicketFactory.queryTicket("西安", "杭州");
                iTicket.showInfo("卧铺");
            }).start();
        }
    }
}
