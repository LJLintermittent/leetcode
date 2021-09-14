package com.learn.leetcode.designpattern.strategy;

/**
 * Description:
 * date: 2021/9/14 12:58
 * Package: com.learn.leetcode.designpattern.strategy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public abstract class Payment {

    public abstract String getName();

    public MsgResult pay(String uid, double amount) {
        if (queryBalance(uid) < amount) {
            return new MsgResult(500, "支付失败", "余额不足");
        }
        return new MsgResult(200, "支付成功", "支付金额" + amount);
    }

    protected abstract double queryBalance(String uid);

}
