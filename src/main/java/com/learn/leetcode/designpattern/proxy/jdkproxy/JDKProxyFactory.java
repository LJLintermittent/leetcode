package com.learn.leetcode.designpattern.proxy.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * Description:
 * date: 2021/8/26 23:01
 * Package: com.duanxu.proxy.jdkproxy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class JDKProxyFactory {

    /*
      TODO JDK动态代理
      在jdk动态代理中，InvocationHandler接口和Proxy类是核心
      要实现jdk动态代理，还必须实现InvocationHandler接口来完成自定义的代理逻辑，当我们使用动态代理对象调用一个方法的时候，
      这个方法的调用会被转到InvocationHandler接口的实现类中的invoke方法，在invoke方法中做一个真正的扩展，比如方法调用前加一段
      业务逻辑等
     */
    public static Object getProxy(Object target) {
        //类加载器，被代理的类实现的一些接口，所以是一个大的class对象类型的数组
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                //传这个参数的时候需要将目标对象通过构造器注入的的方式来将其注入其中
                new UserServiceInvocationHandler(target));
    }
}
