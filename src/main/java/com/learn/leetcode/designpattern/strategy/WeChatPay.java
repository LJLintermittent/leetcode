package com.learn.leetcode.designpattern.strategy;

/**
 * Description:
 * date: 2021/9/14 13:05
 * Package: com.learn.leetcode.designpattern.strategy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class WeChatPay extends Payment{

    public String getName(){
        return "微信";
    }

    @Override
    protected double queryBalance(String uid) {
        return 200;
    }

}
