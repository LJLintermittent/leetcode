package com.learn.leetcode.designpattern.decorator;

/**
 * Description:
 * date: 2021/9/11 19:37
 * Package: com.learn.leetcode.designpattern.decorator
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
//基础套餐 模拟装饰器要装饰的产品
public class BaseBatterCake extends BatterCake{

    @Override
    protected String getMsg() {
        return "阿里";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
