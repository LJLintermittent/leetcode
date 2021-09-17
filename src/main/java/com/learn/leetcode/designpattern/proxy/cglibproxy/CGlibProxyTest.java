package com.learn.leetcode.designpattern.proxy.cglibproxy;

import com.learn.leetcode.designpattern.proxy.TimeUtil;

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
        int count = 100000;
        ToAlibaba proxy = (ToAlibaba) CGlibProxyFactory.getProxy(ToAlibaba.class);
        TimeUtil.begin();
        for (int i = 0; i < count; i++) {
            proxy.go("xxxx");
        }
        System.out.println(TimeUtil.consum() + "ms");
    }
}
