package com.learn.leetcode.designpattern.abstractfactory;

/**
 * Description:
 * date: 2021/9/9 13:23
 * Package: com.learn.leetcode.designpattern.abstractfactory
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Test {
    public static void main(String[] args) {

        /*
            TODO 抽象工厂
            抽象工厂可以完整的描述产品族和产品等级（细节）
            抽象工厂在spring源码中的使用：
            beanfactory接口是所有bean工厂的顶级接口，通过对beanfactory的实现，我们可以从容器中拿到bean，根据不同的策略调用getbean
            从而获得具体对象
            抽象工厂增强了程序的可扩展性，对于新的产品族的增加，只需要实现一个新的具体工厂即可
            抽象工厂可以保证客户端始终只能使用同一个产品的产品族
            抽象工厂扩展的话，如果只是想增加一个产品族，那么可以不修改源代码
            但是当一个产品族中增加一个新种类的产品时，则工厂类就需要修改，不满足开闭原则

            抽象工厂是围绕一个超级工厂创建其他工厂，该超级工厂又称为其他工厂的工厂
            在抽象工厂模式中，顶级接口是负责定义创建一个相关对象的工厂，底下的每个工厂都可以按照工厂模式提供对象

         */
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.createNode().edit();
        javaCourseFactory.createVideo().record();
    }
}
