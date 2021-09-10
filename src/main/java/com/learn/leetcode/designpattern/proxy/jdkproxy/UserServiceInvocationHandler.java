package com.learn.leetcode.designpattern.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description:
 * date: 2021/8/26 23:08
 * Package: com.duanxu.proxy.jdkproxy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class UserServiceInvocationHandler implements InvocationHandler {

    private final Object target;

    public UserServiceInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * @param proxy  动态生成的代理类
     * @param method 与代理对象调用的方法相对应
     * @param args   当前调用的方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理的是：" + method.getName() + "方法，在目标方法之前执行");
        Object result = method.invoke(target, args);
        System.out.println("代理的是：" + method.getName() + "方法，在目标方法之后执行");
        return result;
    }
}
