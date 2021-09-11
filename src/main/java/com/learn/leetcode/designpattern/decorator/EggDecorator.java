package com.learn.leetcode.designpattern.decorator;

/**
 * Description:
 * date: 2021/9/11 19:40
 * Package: com.learn.leetcode.designpattern.decorator
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class EggDecorator extends BatterCakeDecorator {

    public EggDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "加一个hc";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
