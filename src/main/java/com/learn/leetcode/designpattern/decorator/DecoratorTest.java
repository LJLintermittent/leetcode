package com.learn.leetcode.designpattern.decorator;

/**
 * Description:
 * date: 2021/9/11 19:43
 * Package: com.learn.leetcode.designpattern.decorator
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public class DecoratorTest {

    /**
     * TODO 装饰器模式
     * 装饰器指的是在不改变原有对象的基础上，动态地给一个对象添加一些额外的职责，就增加功能来说，
     * 装饰器模式相比继承的方式更加灵活，属于结构性设计模式
     * 装饰器提供了比继承更有弹性的替代方案，扩展对象功能，将功能附加到对象上
     * 因此装饰器模式的核心功能是功能扩展
     * 装饰器的实现原理是：让装饰器实现与被装饰类相同的接口，使得装饰器与被扩展类的类型一致，并在构造函数中传入该接口对象
     * 然后在实现这个接口的被包装类对象的现有功能上做一个扩展，由于装饰器与被包装类属于同一类型，且构造函数的参数为其实现
     * 接口类，因此装饰器模式具备嵌套扩展的能力，这样就你那个使用装饰器进行一层一层地对底层包装类进行扩展
     */

    public static void main(String[] args) {
        BatterCake batterCake;
        batterCake = new BaseBatterCake();
        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);
        batterCake = new EggDecorator(batterCake);
        batterCake = new UserDecorator(batterCake);
        System.out.println(batterCake.getMsg() + batterCake.getPrice());
    }
}
