package com.learn.leetcode.designpattern.proxy.staticproxy;

/**
 * Description:
 * date: 2021/8/26 23:36
 * Package: com.duanxu.proxy.staticproxy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class StaticProxyTest {

    public static void main(String[] args) {
        SendMsmService staticProxy = new StaticProxy(new SendMsmServiceImpl());
        staticProxy.send("李佳乐一定能进阿里巴巴");
    }
}
