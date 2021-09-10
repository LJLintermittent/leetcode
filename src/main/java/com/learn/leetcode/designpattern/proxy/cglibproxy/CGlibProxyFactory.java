package com.learn.leetcode.designpattern.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * Description:
 * date: 2021/8/26 23:51
 * Package: com.duanxu.proxy.cglibproxy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class CGlibProxyFactory {

    /*
      TODO CGlib动态代理
      JDK动态代理的缺陷是只能代理实现了接口的类，因为在proxy.newproxyinstance方法中必须传入目标对象的所有实现的接口
      在spring的aop中，如果目标对象实现了接口，则默认采用jdk动态代理，否则采用cglib
      proxy.invokeSuper(obj, args);
      与jdk的形式差不多，那个是method.invoke,传的参数也是被代理对象以及方法参数
     */
    public static Object getProxy(Class<?> clazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(clazz.getClassLoader());
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new CGlibProxy());
        return enhancer.create();
    }

}
