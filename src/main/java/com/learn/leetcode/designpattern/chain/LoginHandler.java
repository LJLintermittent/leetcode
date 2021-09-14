package com.learn.leetcode.designpattern.chain;

/**
 * Description:
 * date: 2021/9/14 14:08
 * Package: com.learn.leetcode.designpattern.chain
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class LoginHandler extends Handler {

    @Override
    public void doHandle(Member member) {
        System.out.println("登录成功");
        member.setRoleName("管理员");
        chain.doHandle(member);
    }
}
