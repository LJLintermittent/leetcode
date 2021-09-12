package com.learn.leetcode.designpattern.flyweight;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Description:
 * date: 2021/9/12 17:26
 * Package: com.learn.leetcode.designpattern.flyweight
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class TrainTicket implements ITicket {

    private String from;

    private String to;

    private BigDecimal price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showInfo(String bunk) {
        int oldPrice = new Random().nextInt(500);
        this.price = new BigDecimal(oldPrice);
        System.out.println(String.format("%s -> %s %s 价格：%s 元", this.from, this.to, bunk, this.price));
    }

}


