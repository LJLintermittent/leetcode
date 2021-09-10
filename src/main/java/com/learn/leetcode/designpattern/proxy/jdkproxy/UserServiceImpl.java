package com.learn.leetcode.designpattern.proxy.jdkproxy;

/**
 * Description:
 * date: 2021/8/26 22:58
 * Package: com.duanxu.proxy.jdkproxy
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {

    @Override
    public void login(String username, String password) {
        System.out.println(username + " " + password);
    }
}
