package com.learn.leetcode.designpattern.decorator;

/**
 * Description:
 * date: 2021/9/11 19:38
 * Package: com.learn.leetcode.designpattern.decorator
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public abstract class BatterCakeDecorator extends BatterCake {

    private BatterCake batterCake;

    public BatterCakeDecorator(BatterCake batterCake) {
        this.batterCake = batterCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getMsg() {
        return this.batterCake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.batterCake.getPrice();
    }
}
