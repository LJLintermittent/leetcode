package com.learn.leetcode.designpattern.chain;

import cn.hutool.core.util.StrUtil;

/**
 * Description:
 * date: 2021/9/14 14:05
 * Package: com.learn.leetcode.designpattern.chain
 *
 * @author 李佳乐
 * @email 18066550996@163.com
 */
@SuppressWarnings("all")
public class ValidateHandler extends Handler {

    @Override
    public void doHandle(Member member) {
        if (StrUtil.isEmpty(member.getLoginName()) || StrUtil.isEmpty(member.getLoginPass())) {
            System.out.println("用户名或者密码为空！");
            return;
        }
        System.out.println("用户名密码校验成功，可以往下执行");
        chain.doHandle(member);
    }
}
