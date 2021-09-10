package com.learn.leetcode.designpattern.proxy.jdkproxy;


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
        UserServiceImpl userService = new UserServiceImpl();
        UserService proxy = (UserService) JDKProxyFactory.getProxy(userService);
        proxy.login("李佳乐", "whynot?");
    }
}
