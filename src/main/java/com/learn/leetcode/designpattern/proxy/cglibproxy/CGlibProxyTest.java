package com.learn.leetcode.designpattern.proxy.cglibproxy;

/**
 * Description:
 * date: 2021/8/26 23:53
 * Package: com.duanxu.proxy.cglibproxy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class CGlibProxyTest {

    public static void main(String[] args) {
        ToAlibaba proxy = (ToAlibaba) CGlibProxyFactory.getProxy(ToAlibaba.class);
        proxy.go("李佳乐");
    }
}
