package com.learn.leetcode.designpattern.proxy.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Description:
 * date: 2021/8/26 23:48
 * Package: com.duanxu.proxy.cglibproxy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class CGlibProxy implements MethodInterceptor {

    /**
     * @param obj    代理对象
     * @param method 被拦截的方法，也就是需要增强的方法
     * @param args   方法入参
     * @param proxy  用于调用原始方法
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("在目标方法执行之前：" + method.getName());
        Object object  = proxy.invokeSuper(obj, args);
        System.out.println("在目标方法执行之后：" + method.getName());
        return object;
    }
}
