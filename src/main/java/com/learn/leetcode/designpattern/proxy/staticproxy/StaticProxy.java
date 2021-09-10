package com.learn.leetcode.designpattern.proxy.staticproxy;

/**
 * Description:
 * date: 2021/8/26 23:33
 * Package: com.duanxu.proxy.staticproxy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class StaticProxy implements SendMsmService {

    /*
      TODO 静态代理
      静态代理可以看出来缺点是很明显的，我们对目标对象的每个方法的增强都是手动完成的
      由于这个代理类也实现了被代理类的接口，所以一旦接口中新增加方法，代理类也就要实现相应的方法
      这种方式非常的不灵活，并且还要为每一个想要被代理的类都得创建一个相应的代理类，去实现它的接口
      从jvm层面来讲，静态代理在编译的时候就将接口，实现类和代理类这些都变成一个个实际的class文件
     */

    private final SendMsmService sendMsmService;

    public StaticProxy(SendMsmService sendMsmService) {
        this.sendMsmService = sendMsmService;
    }

    @Override
    public void send(String content) {
        System.out.println("send方法的前置处理");
        sendMsmService.send(content);
        System.out.println("send方法的后置处理");
    }
}
