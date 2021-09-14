package com.learn.leetcode.designpattern.chain;

/**
 * Description:
 * date: 2021/9/14 14:09
 * Package: com.learn.leetcode.designpattern.chain
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class AuthHandler extends Handler {

    @Override
    public void doHandle(Member member) {
        if (!member.getRoleName().equals("管理员")) {
            System.out.println("您不是管理员，没有权限");
            return;
        }
        System.out.println("您是管理员，允许操作");

    }
}

