package com.learn.leetcode.designpattern.strategy;


/**
 * Description:
 * date: 2021/9/14 13:17
 * Package: com.learn.leetcode.designpattern.strategy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class StrategyTest {

    public static void main(String[] args) throws Exception {

        Order order = new Order("1,", "351351351313", 325);
        Class<? extends Order> clazz = order.getClass();
        // getDeclaredConstructor传的参数是构造器的参数的类型
        // newInstance方法传的参数是真正创建对象的时候想传的参数
        Order order1 = clazz.getDeclaredConstructor(String.class, String.class, double.class)
                .newInstance("1", "1", 22);
        System.out.println(order1);
        System.out.println(order.pay());

    }
}
