package com.learn.leetcode.designpattern.factorymethod.support;

import java.util.Map;

/**
 * Description:
 * date: 2021/8/30 12:00
 * Package: com.learn.leetcode.designpattern.factorymethod.support
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
public interface ICommodity {

    /*
      TODO 工厂方法
      工厂方法设计模式也是创建型设计模式，指的是定义一个创建对象的接口，但由实现这个接口的类来决定实例化哪个类
      在工厂方法模式中。不再由一个单一的工厂来做所有产品的实现，而是由工厂类的子类实现具体的产品创建，没当需要新增一个产品，
      只要添加一个相应工厂类的子类，实现生产这种产品，解决了简单工厂内部代码臃肿的问题，比如switch case分支过多等问题
      工厂方法很明显能解决的问题是创建对象不再需要大量重复的代码，一个类通过其子类来指定创建哪个对象

      工厂方法通用写法是创建一个工厂顶级接口，提供一个抽象方法  createXxx()
      然后每一种产品创建一个产品工厂类来实现这个接口，在自己这个产品工厂类完成对象的创建逻辑

      工厂方法的典型例子，slf4j源码中的 ILoggerFactory接口作为顶级接口，提供getLogger方法

        public interface ILoggerFactory {
            Logger getLogger(String var1);
        }

        public class NOPLoggerFactory implements ILoggerFactory {
                public Logg er getLogger(String name) {
                    return NOPLogger.NOP_LOGGER;
                }
        }
        对于整个接口，他可以有任意多个实现类来实现这个接口，然后在自己实现类中完成自己产品的创建

        工厂方法的优点：对于新产品的创建，只需要增加一个实现类即可，典型的解耦，高层模块只需要知道产品的抽象类，
        无须关心其他实现类，满足迪米特法则，依赖倒置和里氏替换

        缺点是类的个数任意过多，抽象产品只能生成一种产品，这种弊端要用抽象工厂来解决
     */

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
