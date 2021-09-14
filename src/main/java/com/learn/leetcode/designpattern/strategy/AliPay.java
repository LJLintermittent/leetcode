package com.learn.leetcode.designpattern.strategy;

/**
 * Description:
 * date: 2021/9/14 13:03
 * Package: com.learn.leetcode.designpattern.strategy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class AliPay extends Payment {

    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }



}
