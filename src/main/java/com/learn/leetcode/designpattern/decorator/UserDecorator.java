package com.learn.leetcode.designpattern.decorator;

/**
 * Description:
 * date: 2021/9/11 19:42
 * Package: com.learn.leetcode.designpattern.decorator
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class UserDecorator extends BatterCakeDecorator {

    public UserDecorator(BatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getMsg() {
        return super.getMsg();
    }

    @Override
    protected int getPrice() {
        return super.getPrice();
    }
}
