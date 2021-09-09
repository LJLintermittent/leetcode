package com.learn.leetcode.designpattern.builder;

/**
 * Description:
 * date: 2021/9/9 17:44
 * Package: com.learn.leetcode.designpattern.builder
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class Test {

    /*
      TODO 建造者模式
      建造设计模式将一个复杂对象的构建过程与它的表示分离，使得同样的构建过程可以创建不同的表示，属于创建型设计模式
      对于用户而言，使用建造者模式只需指定需要创建的类型就可以获得对象，创建过程和细节不需要了解
      构建与表示分离指的是：构建代表对象创建，表示代表对象行为，对于java代码来说其实就是用接口规定行为，然后由具体的实现类进行构建
      具备同样的行为，也就是都是xxxbuilder.build但是由于构建的顺序不同或其他原因，可以创建出不同的对象表示

      从功能和定义上来看，建造者模式和工厂模式是非常相似的，和工厂模式一样，具备创建与表示分离的特性
      建造者模式唯一区别于工厂模式的是针对复杂对象的创建，也就是说如果针对简单对象，那么通常会使用工厂模式，如果创建的是
      复杂对象，就可以考虑使用建造者模式，除了本demo中所写的建造者模式，还可以使用静态内部类的方似乎
      将这个builder类作为要创建的对象的一个静态内部类，当创建一个对象的时候，调用它静态内部类中的方法，对 对象做一个构建
      这种方式比较简便

      建造者模式在JDK源码中的使用比如 StringBuilder,通过append来构造，通过tostring来生成
      就是建造者的套路
      另外在mybatis中sqlsessionfactorybuilder.build来得到一个sqlsesionfactory也是一个建造者模式
     */
    public static void main(String[] args) {
        UserBuilder userBuilder = new UserBuilder();
        User user = userBuilder.addName("xxx")
                .addAge(21)
                .addPhoneNumer("123")
                .addAdderss("yy").build();
        System.out.println(user);
    }
}
