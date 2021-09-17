package com.learn.leetcode.designpattern.proxy.jdkproxy;


import com.learn.leetcode.designpattern.proxy.TimeUtil;

/**
 * Description:
 * date: 2021/8/26 22:59
 * Package: com.duanxu.proxy.jdkproxy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class JDKProxyTest {

    public static void main(String[] args) {
        int count = 100000;
        UserServiceImpl userService = new UserServiceImpl();
        UserService proxy = (UserService) JDKProxyFactory.getProxy(userService);
        TimeUtil.begin();
        for (int i = 0; i < count; i++) {
            proxy.login("xxx","dddd");
        }
        System.out.println(TimeUtil.consum() + "ms");
    }
}
